package com.example.android.cop1803;

import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import static android.view.View.INVISIBLE;

/**
 * Created by Neuer home on 11/26/2017.
 */

public class CopMyAdapterChild extends RecyclerView.Adapter<CopMyAdapterChild.ViewHolder> {

    private List<CopListdata> copitems;
    Context context;



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
       /* View.v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recylerview_main, parent, false);
        return new ViewHolder(v);*/
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final CopListdata coplistdata = copitems.get(position);
        holder.fooditem.setText(coplistdata.get_itemname());
        holder.imageExpand.setImageResource(coplistdata.getImageId());

        holder.imageExpand.setVisibility(coplistdata.isSelected() ? View.VISIBLE : View.INVISIBLE);
        holder.itemView.setBackgroundColor(coplistdata.isSelected() ? Color.CYAN : Color.WHITE);
//
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//               Toast.makeText(context,"you clicked child "+coplistdata.get_itemname(),Toast.LENGTH_LONG)  .show();

                CopListdata.setSelected(!CopListdata.isSelected());
                holder.itemView.setBackgroundColor(CopListdata.isSelected() ? Color.CYAN : Color.WHITE);
                holder.imageExpand.setVisibility(coplistdata.isSelected() ? View.VISIBLE : View.INVISIBLE);


            }
        });
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
}
