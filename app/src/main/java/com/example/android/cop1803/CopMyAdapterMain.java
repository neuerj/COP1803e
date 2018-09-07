package com.example.android.cop1803;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.Image;
import android.support.annotation.VisibleForTesting;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Locale;

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
    MainActivity mMainActivit = new MainActivity();
    String Cselect;
    Button Cbutton;
String SelectedItem;
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
      //  if (GlobalVariables.MSelectedItems.size()==0)  {GlobalVariables.MSelectedItems.add("start");}

     //   if (MSelectedItems.size()>0)  {holder.getAdapterPosition();}

        holder.coplistdata=copitems.get(position);
       String text=holder.coplistdata.get_itemname();
        SpannableStringBuilder builder=g.makeSectionOfTextBold(text);
       holder.fooditem.setText(builder, TextView.BufferType.SPANNABLE);
       //holder.fooditem.setText(holder.coplistdata.get_itemname());
       holder.imageExpandm.setImageResource(holder.coplistdata.getImageId());


        if (flaged==GlobalVariables.TRUE) {
            int img=holder.coplistdata.getImageId();
            boolean isCheck= SelectKeep.IsChecked(img);
            holder.itemView.setBackgroundColor(Color.WHITE);
            if (isCheck){holder.imageExpandm.setVisibility(View.INVISIBLE);}
             }
        else {
            int img=holder.coplistdata.getImageId();
            SelectedItem=holder.coplistdata.get_itemname();
            boolean isCheck= SelectKeep.IsChecked(img);
            Cbutton=g.getCurrentbutton();

            if(isCheck) {
                for (int i = 0; i < mMainActivit.cartList.size(); i++) {
                     Cselect= mMainActivit.cartList.get(i).name;
                    if (Cselect.equals(SelectedItem)) {
                        holder.itemView.setBackgroundColor(Color.CYAN);
                        holder.imageExpandm.setVisibility(View.VISIBLE);
                        Cbutton.setText(text + "/n");
                        break;
                         }
                    else {
                        holder.itemView.setBackgroundColor(Color.WHITE);
                        holder.imageExpandm.setVisibility(View.INVISIBLE);
                         }
                }
            }

        }

       holder.itemView.setOnClickListener(new View.OnClickListener()
       {
            @Override
            public void onClick(View view)
            {
           //     final CopListdata coplistdata ;
                CopListdata pos=copitems.get(holder.getAdapterPosition());
                onCopClickListner.onClicked(pos);
                markUnmark(holder,pos);
                TextView slidetodeletemsg = (TextView) ((Activity)context).findViewById(R.id.textView2);
                Button ResetBtn=((Activity)context).findViewById(R.id.ResetBtn);

                if(mMainActivit.cartList.size()>=2){
                    slidetodeletemsg.setVisibility(View.VISIBLE);
                    ResetBtn.setVisibility(View.VISIBLE);
                }
                else {
                    slidetodeletemsg.setVisibility(View.INVISIBLE);
                    ResetBtn.setVisibility(View.INVISIBLE);
                }
            }
       });
    }


    public  void markUnmark(ViewHolder holder,  CopListdata pos) {

        int img=pos.getImageId();
        String SelectedItem=pos.get_itemname();
        g.setItemgroup(SelectedItem);
        String Kcal=pos.get_KCal();
        String fat= pos.get_Fat();
        String cho=pos.get_Cho();
        String pro=pos.get_Pro();
        boolean isCheck= SelectKeep.IsChecked(img);  //if true main level item false: sub level item


//************************
        if(isCheck) {
            int cnt=0;
            boolean find=false;
            for (int i = 0; i < mMainActivit.cartList.size(); i++) {
                 Cselect=mMainActivit.cartList.get(i).name;
                  if (Cselect.trim().equals(SelectedItem.trim())) {
                    find=true;
                    mMainActivit.removeFromList(i);
                    holder.itemView.setBackgroundColor(Color.WHITE);
                    holder.imageExpandm.setVisibility(View.INVISIBLE);
                   // MainActivity.updateuserlist(Cselect);
                    break;
                }
            }
            if (find==false){
                Cselect = SelectedItem;
                    mMainActivit.addToList(Cselect, Kcal, fat, cho, pro);
                    holder.itemView.setBackgroundColor(Color.CYAN);
                    holder.imageExpandm.setVisibility(View.VISIBLE);
                 }
        }
      //*************
        else{
            g.setItemgroup(SelectedItem);
        }
            mMainActivit.buttontext((Context) context);
    }



    @Override
    public int getItemCount() {
        return copitems.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public CopListdata coplistdata;
        public TextView fooditem;
        public TextView kCal;
        public TextView Cholesterol;
        public TextView fat;
        public TextView protein;

        public ConstraintLayout constraintLayout;
        public ImageView imageExpandm;

        public ViewHolder(View itemView) {
            super(itemView);

            fooditem = (TextView) itemView.findViewById(R.id.fooditem);
            imageExpandm = (ImageView) itemView.findViewById(R.id.imageExpand);
            kCal = (TextView) itemView.findViewById(R.id.kCalorie);
            Cholesterol = (TextView) itemView.findViewById(R.id.Cholestrol);
            fat = (TextView) itemView.findViewById(R.id.Fats);
            protein = (TextView) itemView.findViewById(R.id.Protein);
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