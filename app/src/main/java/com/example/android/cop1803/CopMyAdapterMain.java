package com.example.android.cop1803;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

//import java.util.ArrayList;

/**
 * Created by Neuer home on 11/26/2017.
 */

public class CopMyAdapterMain extends RecyclerView.Adapter<CopMyAdapterMain.ViewHolder> {

    //public ArrayList<String> MSelectedItems = new ArrayList<String>();
    List<CopListdata> copitems;
    private int mSelectedItemPosition = -1;
    View.OnClickListener context;
    Globals g = Globals.getInstance();
    MainActivity mMainActivit = new MainActivity();
    String Cselect;
    String SelectedItem;
    private final OnCopClickListner onCopClickListner;

    public interface OnCopClickListner {
        void onClicked(CopListdata copchild);
    }

    public CopMyAdapterMain(View.OnClickListener activity, List<CopListdata> copitems, OnCopClickListner onCopClickListner) {
        this.copitems = copitems;
        context = activity;
        this.onCopClickListner = onCopClickListner;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, final int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_main, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.bindDataWithViewHolder(copitems.get(position),position);

        holder.coplistdata = copitems.get(position);
        String text = holder.coplistdata.get_itemname();

        String textlocation = "RV";
        SpannableStringBuilder builder = g.makeSectionOfTextBold(text, textlocation);
        holder.fooditem.setText(builder, TextView.BufferType.SPANNABLE);
        holder.imageExpandm.setImageResource(holder.coplistdata.getImageId());


            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //     final CopListdata coplistdata ;
                    CopListdata pos = copitems.get(holder.getAdapterPosition());
                    onCopClickListner.onClicked(pos);
                    markUnmark(holder, pos);
                    TextView slidetodeletemsg = (TextView) ((Activity) context).findViewById(R.id.textView2);
                    Button ResetBtn = ((Activity) context).findViewById(R.id.ResetBtn);

                    if (mMainActivit.cartList.size() >= 2) {
                        slidetodeletemsg.setVisibility(View.VISIBLE);
                        ResetBtn.setVisibility(View.VISIBLE);
                    } else {
                        slidetodeletemsg.setVisibility(View.INVISIBLE);
                        ResetBtn.setVisibility(View.INVISIBLE);
                    }
                }
            });


    }


    public void markUnmark(ViewHolder holder, CopListdata pos) {

        int img = pos.getImageId();
        String SelectedItem = pos.get_itemname();
        g.setItemgroup(SelectedItem);
        String selectedItemCat = pos.get_itemnamecat();
        String Kcal = pos.get_KCal();
        String fat = pos.get_Fat();
        String cho = pos.get_Cho();
        String pro = pos.get_Pro();
        boolean isCheck = SelectKeep.IsChecked(img);  //if true main level item false: sub level item


//************************
        if (isCheck) {
            int cnt = 0;
            boolean find = false;
            for (int i = 0; i < mMainActivit.cartList.size(); i++) {
                Cselect = mMainActivit.cartList.get(i).name;
                if (Cselect.trim().equals(SelectedItem.trim())) {
                    find = true;
                    mMainActivit.removeFromList(i, (Context) context);
                    holder.itemView.setBackgroundColor(Color.WHITE);
                    holder.imageExpandm.setVisibility(View.INVISIBLE);
                    // MainActivity.updateuserlist(Cselect);
                    break;
                }
            }
            if (find == false) {
                Cselect = SelectedItem;
                mMainActivit.addToList(selectedItemCat, Cselect, Kcal, fat, cho, pro, (Context) context);
                holder.itemView.setBackgroundColor(Color.CYAN);
                holder.imageExpandm.setVisibility(View.VISIBLE);
            }
        }
        //*************
        else {
            g.setItemgroup(SelectedItem);
        }
        //  mMainActivit.buttontext((Context) context);
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
        private CopListdata mDataItem=null;


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
            constraintLayout = (ConstraintLayout) itemView.findViewById(R.id.recyclerlayout);

            //int previousSelectState=mSelectedItemPosition;
            mSelectedItemPosition =getAdapterPosition();
        }

        //This is clean method to bind data with viewHolder. Do all dirty things on View based on dataItem.
        //Must be called from onBindViewHolder(),with dataItem. In our case dataItem is String object.
        public void bindDataWithViewHolder(CopListdata dataItem, int currentPosition){
            this.mDataItem=dataItem;
            boolean isCheck=true;

            boolean isHeader = SelectKeep.IsHeader(dataItem.get_itemname());
           // int img = coplistdata.getImageId();
            int img = dataItem.getImageId();
            isCheck = SelectKeep.IsChecked(img);
          //  if(currentPosition == mSelectedItemPosition){
            if (isHeader) {
                itemView.setBackgroundColor(Color.LTGRAY);  //is a header record
                fooditem.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                fooditem.setTextAppearance(R.style.cartlistmenu);
                imageExpandm.setVisibility(View.INVISIBLE);
            } else {
                itemView.setBackgroundColor(Color.WHITE);  //not a header record
                TextViewCompat.setTextAppearance(fooditem, R.style.RVtextviewformat);
                fooditem.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                if (isCheck) {
                    imageExpandm.setVisibility(View.INVISIBLE);
                } else {
                    imageExpandm.setVisibility(View.VISIBLE);
                }
            }

            SelectedItem = dataItem.get_itemname();
            if (isCheck) {
                for (int i = 0; i < mMainActivit.cartList.size(); i++) {
                    Cselect = mMainActivit.cartList.get(i).name;
                    if (Cselect.equals(SelectedItem)) {
                        itemView.setBackgroundColor(Color.CYAN);
                        imageExpandm.setVisibility(View.VISIBLE);
                        break;
                    } else {
                        itemView.setBackgroundColor(Color.WHITE);
                        imageExpandm.setVisibility(View.INVISIBLE);
                    }
                }
            }
        }

    }

         //   }

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