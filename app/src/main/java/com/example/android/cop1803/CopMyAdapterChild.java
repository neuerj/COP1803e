package com.example.android.cop1803;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Neuer home on 11/26/2017.
 */

public class CopMyAdapterChild extends RecyclerView.Adapter<CopMyAdapterChild.ViewHolder> {

    private List<CopListdata> copitems;
    Context context;
    Globals g =Globals.getInstance();
    MainActivity mMainActivit = new MainActivity();
    String[] Selected;
    String Cselect;
    String SelectedItem;

  //  MainActivity mMainActivit = new MainActivity();

   // ArrayList<String> SelectedItems = new ArrayList<>();

    private String flaged=g.getIsToogleflagon();

    public CopMyAdapterChild(List<CopListdata> copitems, Context activity) {
        this.copitems = copitems;
        context = activity;
    }



/*    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return context;
    }*/

    @Override
    public CopMyAdapterChild.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View v = inflater.inflate(R.layout.recylerview_main, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
         }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

       // if (GlobalVariables.MSelectedItems.size()==0)  {GlobalVariables.MSelectedItems.add("start");}

        final CopListdata coplistdata = copitems.get(position);
        holder.coplistdata=copitems.get(position);
        String text=holder.coplistdata.get_itemname();
        String textlocation="RV";
        SpannableStringBuilder builder=g.makeSectionOfTextBold(text,textlocation);
        holder.fooditem.setText(builder, TextView.BufferType.SPANNABLE);
        holder.imageExpand.setImageResource(coplistdata.getImageId());


        if (flaged==GlobalVariables.TRUE)  {
            int img=coplistdata.getImageId();
            boolean isCheck= SelectKeep.IsChecked(img);
            holder.itemView.setBackgroundColor(Color.WHITE);
            if (isCheck) {holder.imageExpand.setVisibility(View.INVISIBLE);}
                }
           else {
           // int img=holder.coplistdata.getImageId();
            int img=coplistdata.getImageId();
            //SelectedItem=coplistdata.get_itemname();
            String foodgroup=g.getItemgroup();
            SelectedItem=foodgroup + " : " + coplistdata.get_itemname();

            boolean isCheck= SelectKeep.IsChecked(img);

            if(isCheck) {
                for (int i = 0; i < mMainActivit.cartList.size(); i++) {
                     Cselect= mMainActivit.cartList.get(i).name;

                    if (Cselect.equals(SelectedItem)) {
                        holder.itemView.setBackgroundColor(Color.CYAN);
                        holder.imageExpand.setVisibility(View.VISIBLE);
                        break;
                    }
                    else  {
                        holder.itemView.setBackgroundColor(Color.WHITE);
                        holder.imageExpand.setVisibility(View.INVISIBLE);
                        }
                }
            }

        }

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopListdata pos=copitems.get(holder.getAdapterPosition());
                markUnmark(holder,pos);
                TextView slidetodeletemsg = (TextView) ((Activity)context).findViewById(R.id.textView2);
                Button ResetBtn=((Activity)context).findViewById(R.id.ResetBtn);



                if(mMainActivit.cartList.size()>=2){
               //     slidetodeletemsg.setVisibility(View.VISIBLE);
                    ResetBtn.setVisibility(View.VISIBLE);
                }
                else {
                //    slidetodeletemsg.setVisibility(View.INVISIBLE);
                    ResetBtn.setVisibility(View.INVISIBLE);
                }

                }

        });
    }

    public  void markUnmark(CopMyAdapterChild.ViewHolder holder, CopListdata pos) {
        String Cselect;
        String foodgroup;
        Integer img=pos.getImageId();
        Integer cartsize=mMainActivit.cartList.size();



        foodgroup=g.getItemgroup();
        String SelectedItem=foodgroup + " : " + pos.get_itemname();
        String selectedItemCat=pos.get_itemnamecat();
        String Kcal=pos.get_KCal();
        String fat= pos.get_Fat();
        String cho=pos.get_Cho();
        String pro=pos.get_Pro();
        boolean isCheck= SelectKeep.IsChecked(img);


         /*   boolean find=false;
        for (int i = 0; i < GlobalVariables.MSelectedItems.size(); i++) {
            String Cselect= String.valueOf(GlobalVariables.MSelectedItems.get(i));
            if (Cselect == SelectedItem) {
                find=true;
                GlobalVariables.MSelectedItems.remove(i);
                holder.itemView.setBackgroundColor(Color.WHITE);
                holder.imageExpand.setVisibility(View.INVISIBLE);
                break;
            }
        }
        if (find==false){
            GlobalVariables.MSelectedItems.add(SelectedItem);
            holder.itemView.setBackgroundColor(Color.CYAN);
            holder.imageExpand.setVisibility(View.VISIBLE);
        }

    }
*/
        if(isCheck) {
            int cnt=0;
            boolean find=false;
            for (int i = 0; i < cartsize; i++) {

                 Cselect=mMainActivit.cartList.get(i).name;
                if (Cselect.trim().equals(SelectedItem.trim())) {
                    find=true;
                    mMainActivit.removeFromList(i,(Context) context);
                    holder.itemView.setBackgroundColor(Color.WHITE);
                    holder.imageExpand.setVisibility(View.INVISIBLE);
                    // MainActivity.updateuserlist(Cselect);


                    break;
                }
            }
            if (find==false){
                Cselect = SelectedItem;
                mMainActivit.addToList(selectedItemCat,SelectedItem,Kcal,fat,cho,pro,(Context) context);
                holder.itemView.setBackgroundColor(Color.CYAN);
                holder.imageExpand.setVisibility(View.VISIBLE);
                //mMainActivit.buttontext((Context) context);
            }
        }
        //*************
        else{
            g.setItemgroup(SelectedItem);
        }

    }

    @Override
    public int getItemCount() {return copitems == null ? 0 : copitems.size(); }

    //    public class ViewHolder extends RecyclerView.ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder{
        public CopListdata coplistdata;
        public TextView fooditem;
        public ImageView imageExpand;
        public ConstraintLayout constraintLayout;

        public ViewHolder(View itemView) {
            super(itemView);

            fooditem = (TextView) itemView.findViewById(R.id.fooditem);
            imageExpand = (ImageView) itemView.findViewById(R.id.imageExpand);
            constraintLayout=(ConstraintLayout) itemView.findViewById(R.id.recyclerlayout);
        }
    }

//public Class selectOnOff{
//
//
//
//
//    }

}

/*

 if (((layoutMyLayout != null) && (recycler_view2 != null) && (recycler_view2.getVisibility() == recycler_view2.VISIBLE))) {
         recycler_view2.setVisibility(recycler_view2.INVISIBLE);
         } else {

         if (((layoutMyLayout != null) && (recyclerView != null) && (recyclerView.getVisibility() == recyclerView.VISIBLE))) {
         recyclerView.setVisibility(recyclerView.INVISIBLE);
         }}}*/
