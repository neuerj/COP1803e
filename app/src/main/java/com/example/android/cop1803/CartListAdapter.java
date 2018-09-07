package com.example.android.cop1803;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class CartListAdapter extends RecyclerView.Adapter<CartListAdapter.MyViewHolder> {

    private Context context;
    private List<Item> cartList;


    Globals g =Globals.getInstance();






    MainActivity mMainActivit = new MainActivity();

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, description,slidetodeletemsg ;//, price;
        public ImageView thumbnail;
        public RelativeLayout viewBackground, viewForeground;
        public Item item;

        public MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.name);
          // description = view.findViewById(R.id.description);
          //price = view.findViewById(R.id.price);
          //  thumbnail = view.findViewById(R.id.thumbnail);
            viewBackground = view.findViewById(R.id.view_background);
            viewForeground = view.findViewById(R.id.view_foreground);

        }
    }


    public CartListAdapter(Context context, List<Item> cartList) {
        this.context = context;
        this.cartList = cartList;

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cart_list_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {


        final Item item = cartList.get(position);
        holder.item=cartList.get(position);
        String text=holder.item.getName();
        SpannableStringBuilder builder=g.makeSectionOfTextBold(text);

        holder.name.setText(builder, TextView.BufferType.SPANNABLE);

//        String chkItem=item.getName();
//        if((chkItem=="Today's Special" ) && (position>0)){mMainActivit.removeFromList(position);}

        //holder.description.setText(item.getDescription());
        //holder.price.setText("₹" + item.getPrice());
       /*Glide.with(context)
                .load(item.getImageId())
                .into(holder.thumbnail);*/

        if(position == 0) {
            holder.name.setTextAppearance(R.style.cartlistmenu);
            holder.name.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            holder.name.setBackgroundColor(Color.LTGRAY);
             }

          //  holder.description.setVisibility(View.INVISIBLE);
            else {
            holder.name.setTextAppearance(R.style.cartlist);
            //holder.name.setBackgroundColor(R.style.cartlistmenu);
            //holder.description.setVisibility(View.VISIBLE);
            holder.name.setPadding(30,0,0,0);
            holder.name.setBackgroundColor(Color.WHITE);
        }


    }

    @Override
    public int getItemCount() {
        return cartList.size();
    }

    public void removeItem(int position) {
        cartList.remove(position);
        // notify the item removed by position
        // to perform recycler view delete animations
        // NOTE: don't call notifyDataSetChanged()
        notifyItemRemoved(position);
    }

    public void restoreItem(Item item, int position) {
        cartList.add(position, item);
        // notify item added by position
        notifyItemInserted(position);
    }
}