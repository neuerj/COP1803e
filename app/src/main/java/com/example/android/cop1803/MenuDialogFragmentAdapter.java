package com.example.android.cop1803;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MenuDialogFragmentAdapter extends RecyclerView.Adapter<MenuDialogFragmentAdapter.ViewHolder> {
    private List<Item> cartList;
    Context context;
    Globals g =Globals.getInstance();
    MainActivity mMainActivit = new MainActivity();
    Item item;


       public MenuDialogFragmentAdapter(Context activity, List<Item> cartList) {
            this.context = context;
            this.cartList = cartList;

        }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_menu, parent, false);

        return new ViewHolder(itemView);
    }

    //BIND DATA
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Item item = cartList.get(position);
        holder.item=cartList.get(position);
        holder.fooditem.setText((CharSequence) cartList.get(position));
        holder.Cholesterol.setText((CharSequence) cartList.get(position));
        holder.kCal.setText((CharSequence) cartList.get(position));
        holder.fat.setText((CharSequence) cartList.get(position));
        holder.protein.setText((CharSequence) cartList.get(position));
    }

    @Override
    public int getItemCount() {
        return cartList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public Item item;
        public TextView fooditem;
        public TextView kCal;
        public TextView Cholesterol;
        public TextView fat;
        public TextView protein;


        public ViewHolder(View itemView) {
            super(itemView);

            fooditem = (TextView) itemView.findViewById(R.id.fooditem);
            kCal = (TextView) itemView.findViewById(R.id.kCalorie);
            Cholesterol = (TextView) itemView.findViewById(R.id.Cholestrol);
            fat = (TextView) itemView.findViewById(R.id.Fats);
            protein = (TextView) itemView.findViewById(R.id.Protein);

        }
    }
}
