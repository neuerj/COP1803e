package com.example.android.cop1803;

import java.lang.reflect.Field;
import java.util.List;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Neuer home on 11/26/2017.
 */

public class CopMyAdapterMain extends RecyclerView.Adapter<CopMyAdapterMain.ViewHolder> {

    List<CopListdata> copitems;
    View.OnClickListener context;
    CopListdata coplistdata ;


    private  final OnCopClickListner onCopClickListner;

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

        holder.coplistdata=copitems.get(position);
        holder.fooditem.setText(holder.coplistdata.get_itemname());

        try {
            Class res = R.drawable.class;
            Field field = res.getField("mic_done_black_24dp");
            int drawableId = field.getInt(null);
            int a=holder.coplistdata.getImageId();
            if (drawableId==a) {

                holder.imageExpandm.setImageResource(holder.coplistdata.getImageId());
                holder.imageExpandm.setVisibility(CopListdata.isSelected() ? View.VISIBLE : View.INVISIBLE);
                holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        CopListdata.setSelected_1stLevel(!CopListdata.isSelected_1stLevel());
                        holder.imageExpandm.setVisibility(coplistdata.isSelected_1stLevel() ? View.VISIBLE : View.INVISIBLE);
//                        Toast.makeText((Context) context,"you clicked  "+coplistdata.get_itemname(),Toast.LENGTH_LONG)  .show();
                    }
                });
            }
            else {
                holder.imageExpandm.setImageResource(holder.coplistdata.getImageId());
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view1) {
                        final CopListdata coplistdata ;
                        onCopClickListner.onClicked(copitems.get(position));
                    }
                });
            }
            ;
        }
        catch (Exception e) {
            Log.e("MyTag", "Failure to get drawable id.", e);
        }


/*        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final CopListdata coplistdata ;
                onCopClickListner.onClicked(copitems.get(position));
            }
        });*/
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