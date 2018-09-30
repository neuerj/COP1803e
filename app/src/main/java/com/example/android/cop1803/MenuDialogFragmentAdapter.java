package com.example.android.cop1803;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuDialogFragmentAdapter extends RecyclerView.Adapter<MenuDialogFragmentAdapter.ViewHolder> {
    private final ArrayList<Item> cartList;
    Context context;
    Globals g =Globals.getInstance();
    MainActivity mMainActivit = new MainActivity();
    Item item;

    


    public MenuDialogFragmentAdapter(Context activity, ArrayList<Item> cartList) {
            this.context = context;
            this.cartList = cartList;
        //   mItems.addAll((Collection<? extends Item>) Arrays.asList(cartList));

        }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_recyclerviewmenu, parent, false);

        return new ViewHolder(itemView);
    }

    //BIND DATA
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Item item = cartList.get(position);
        holder.item=cartList.get(position);

 /*           holder.fooditem.setText((CharSequence) cartList.get(position));
        holder.Cholesterol.setText((CharSequence) cartList.get(position));
        holder.kCal.setText((CharSequence) cartList.get(position));
        holder.fat.setText((CharSequence) cartList.get(position));
        holder.protein.setText((CharSequence) cartList.get(position));*/


    String text = holder.item.getName();
    String textlocation = "MenuView";
    SpannableStringBuilder builder = g.makeSectionOfTextBold(text, textlocation);
    holder.fooditem.setText(builder, TextView.BufferType.SPANNABLE);

    text = holder.item.get_Cho();
    textlocation = "MenuView";
    builder = g.makeSectionOfTextBold(text, textlocation);
    holder.Cholesterol.setText(builder, TextView.BufferType.SPANNABLE);

    text = holder.item.get_KCal();
    textlocation = "MenuView";
    builder = g.makeSectionOfTextBold(text, textlocation);
    holder.kCal.setText(builder, TextView.BufferType.SPANNABLE);

    text = holder.item.get_Fat();
    textlocation = "MenuView";
    builder = g.makeSectionOfTextBold(text, textlocation);
    holder.fat.setText(builder, TextView.BufferType.SPANNABLE);

    text = holder.item.get_Pro();
    textlocation = "MenuView";
    builder = g.makeSectionOfTextBold(text, textlocation);
    holder.protein.setText(builder, TextView.BufferType.SPANNABLE);


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

            fooditem = (TextView) itemView.findViewById(R.id.ViewMenuItem);
            kCal = (TextView) itemView.findViewById(R.id.MenuItemkCal);
            Cholesterol = (TextView) itemView.findViewById(R.id.MenuItemCho);
            fat = (TextView) itemView.findViewById(R.id.MenuItemFat);
            protein = (TextView) itemView.findViewById(R.id.MenuItemPro);

        }
    }


}
