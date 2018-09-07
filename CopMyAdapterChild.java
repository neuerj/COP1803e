package com.example.android.cop1803;

import android.content.Context;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

   // ArrayList<String> SelectedItems = new ArrayList<>();


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

        if (GlobalVariables.MSelectedItems.size()==0)  {GlobalVariables.MSelectedItems.add("start");}

        final CopListdata coplistdata = copitems.get(position);
        holder.fooditem.setText(coplistdata.get_itemname());
        holder.imageExpand.setImageResource(coplistdata.getImageId());

//        holder.itemView.setBackgroundColor(Color.WHITE);
//        holder.imageExpand.setVisibility(View.INVISIBLE);

        String SelectedItem=coplistdata.get_itemname();

        for (int i = 0; i < GlobalVariables.MSelectedItems.size(); i++) {
            String Cselect= String.valueOf(GlobalVariables.MSelectedItems.get(i));
            if (Cselect == SelectedItem) {
                holder.itemView.setBackgroundColor(Color.CYAN);
                holder.imageExpand.setVisibility(View.VISIBLE);
                break;
            }
            else {
                holder.itemView.setBackgroundColor(Color.WHITE);
                holder.imageExpand.setVisibility(View.INVISIBLE);
            }
        }

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopListdata pos=copitems.get(holder.getAdapterPosition());
                markUnmark(holder,pos);


                }

        });
    }

    public  void markUnmark(CopMyAdapterChild.ViewHolder holder, CopListdata pos) {

        int img=pos.getImageId();
        String SelectedItem=pos.get_itemname();



            boolean find=false;
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

    @Override
    public int getItemCount() {
        return copitems == null ? 0 : copitems.size();
    }

    //    public class ViewHolder extends RecyclerView.ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder{

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
