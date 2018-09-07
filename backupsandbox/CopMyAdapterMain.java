package com.example.android.cop1803;

import android.graphics.Color;
import android.media.Image;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

//import java.util.ArrayList;

/**
 * Created by Neuer home on 11/26/2017.
 */

public class CopMyAdapterMain extends RecyclerView.Adapter<CopMyAdapterMain.ViewHolder> {

    //public ArrayList<String> MSelectedItems = new ArrayList<String>();
    public Image img;

    List<CopListdata> copitems;
    View.OnClickListener context;
    Globals g =Globals.getInstance();
    //CopListdata coplistdata ;


    private  final OnCopClickListner onCopClickListner;

    private String flaged=g.getIsToogleflagon();

    public interface OnCopClickListner{
        void onClicked(CopListdata copchild);
    }

    public CopMyAdapterMain(View.OnClickListener activity, List<CopListdata> copitems, OnCopClickListner onCopClickListner) {
        this.copitems = copitems;
        context=activity;
        this.onCopClickListner=onCopClickListner;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, final int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_main, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
//        final CopListdata coplistdata ;
      //  if (MSelectedItems.size()==0)  {MSelectedItems.add("start");}
        if (GlobalVariables.MSelectedItems.size()==0)  {GlobalVariables.MSelectedItems.add("start");}

     //   if (MSelectedItems.size()>0)  {holder.getAdapterPosition();}
       holder.coplistdata=copitems.get(position);
       holder.fooditem.setText(holder.coplistdata.get_itemname());
       holder.imageExpandm.setImageResource(holder.coplistdata.getImageId());


        if (flaged==GlobalVariables.TRUE) {
            int img=holder.coplistdata.getImageId();
            boolean isCheck= SelectKeep.IsChecked(img);
            holder.itemView.setBackgroundColor(Color.WHITE);
            if (isCheck){holder.imageExpandm.setVisibility(View.INVISIBLE);}
             }
        else {
            int img=holder.coplistdata.getImageId();
            String SelectedItem=holder.coplistdata.get_itemname();
            boolean isCheck= SelectKeep.IsChecked(img);

            if(isCheck) {
                for (int i = 0; i < GlobalVariables.MSelectedItems.size(); i++) {
                    String Cselect= String.valueOf(GlobalVariables.MSelectedItems.get(i));
                    if (Cselect == SelectedItem) {
                        holder.itemView.setBackgroundColor(Color.CYAN);
                        holder.imageExpandm.setVisibility(View.VISIBLE);
                        break;
                         }
                    else {
                        holder.itemView.setBackgroundColor(Color.WHITE);
                        holder.imageExpandm.setVisibility(View.INVISIBLE);
                         }
                }
            }

        }

/*        int img=holder.coplistdata.getImageId();
        String SelectedItem=holder.coplistdata.get_itemname();
        boolean isCheck= SelectKeep.IsChecked(img);
        if(isCheck) {
            for (int i = 0; i <= MSelectedItems.size(); i++) {

                String Cselect= String.valueOf(MSelectedItems.get(i));
                if (Cselect == SelectedItem) {
                    holder.itemView.setBackgroundColor(Color.CYAN);
                    holder.imageExpandm.setVisibility(View.VISIBLE);
                    Break;
                } else {

                    holder.itemView.setBackgroundColor(Color.WHITE);
                    holder.imageExpandm.setVisibility(View.INVISIBLE);
                }

            }
            ;
        }*/


       holder.itemView.setOnClickListener(new View.OnClickListener()
       {
            @Override
            public void onClick(View view)
            {
           //     final CopListdata coplistdata ;
                CopListdata pos=copitems.get(holder.getAdapterPosition());
                onCopClickListner.onClicked(pos);


                markUnmark(holder,pos);
            }
       });
    }


    public  void markUnmark(ViewHolder holder,  CopListdata pos) {

        int img=pos.getImageId();
        String SelectedItem=pos.get_itemname();
        boolean isCheck= SelectKeep.IsChecked(img);

        if(isCheck) {
            int cnt=0;
            boolean find=false;
            for (int i = 0; i < GlobalVariables.MSelectedItems.size(); i++) {
                String Cselect= String.valueOf(GlobalVariables.MSelectedItems.get(i));
                if (Cselect == SelectedItem) {
                     find=true;
                    GlobalVariables.MSelectedItems.remove(i);
                    holder.itemView.setBackgroundColor(Color.WHITE);
                    holder.imageExpandm.setVisibility(View.INVISIBLE);
                    break;
                }
                }
                if (find==false){
                    GlobalVariables.MSelectedItems.add(SelectedItem);
                    holder.itemView.setBackgroundColor(Color.CYAN);
                    holder.imageExpandm.setVisibility(View.VISIBLE);
                }
        }
    }

    @Override
    public int getItemCount() {
        return copitems.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public CopListdata coplistdata;
        public TextView fooditem;
        public ConstraintLayout constraintLayout;
        public ImageView imageExpandm;

        public ViewHolder(View itemView) {
            super(itemView);

            fooditem = (TextView) itemView.findViewById(R.id.fooditem);
            imageExpandm = (ImageView) itemView.findViewById(R.id.imageExpand);
            constraintLayout=(ConstraintLayout) itemView.findViewById(R.id.recyclerlayout);
        }
    }


}


 /* if(isCheck) {
          for (int i = 0; i < MSelectedItems.size(); i++) {
        if (MSelectedItems.get(i) = SelectedItem) {
        //remove item return to default
        SelectedItem.remove(i);
        //                        holder.itemView.setBackgroundColor(ContextCompat.getColor(context.getApplicationContext(), android.R.color.));
        holder.itemView.setBackgroundColor(Color.WHITE);
        holder.imageExpand.setVisibility(View.INVISIBLE);
        } else {
        SelectedItem.add(SelectedItem);
        holder.itemView.setBackgroundColor(Color.CYAN);
        holder.imageExpand.setVisibility(View.VISIBLE);
        }

        }
        ;
        }*/