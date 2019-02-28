package com.example.android.cop1803;

import android.util.Log;

import java.lang.reflect.Field;

public class SelectKeep {
    public static int drawableId = 0;

    public static boolean IsChecked(int currentImg) {

        //We're taking in the User object passed from the parent class
        //We'll print it out once, then change it, and return
        try {
            Class res = R.drawable.class;
            Field field = res.getField("mic_done_black_24dp");
            drawableId = field.getInt(null);
        } catch (Exception e) {
            Log.e("MyTag", "Failure to get drawable id.", e);
        }

        if (drawableId == currentImg) {
            //remove item return to default
            boolean IsChecked = true;
            return IsChecked;
        } else {
            boolean IsChecked = false;
            return IsChecked;
        }
    }

    public static boolean IsHeader(String header) {
        String search = "*";

        int headercheck = header.indexOf(search);
        if (headercheck >= 0) {
            boolean IsHeader = true;
            return IsHeader;
        }else {
            boolean IsHeader = false;
            return IsHeader;
        }
    }

}







  /*  public static int drawableId;

    public static boolean IsChecked(int currentImg)  {
           try {
        Class res = R.drawable.class;
        Field field = res.getField("mic_done_black_24dp");
        int drawableId = field.getInt(null);

    }
        catch (Exception e) {
        Log.e("MyTag", "Failure to get drawable id.", e);
    }

       if (drawableId==currentImg) {
           boolean IsChecked=true;

       }
       else {
           boolean IsChecked=false;

       }
    return IsChecked();
}*/


/*

    try {
            Class res = R.drawable.class;
        Field field = res.getField("mic_done_black_24dp");
                int drawableId = field.getInt(null);
                int a=holder.coplistdata.getImageId();
                // If checkmark image
                if (drawableId==a) {
                holder.itemView.setBackgroundColor(Color.WHITE);
                holder.imageExpandm.setVisibility(View.INVISIBLE);
//                holder.imageExpandm.setImageResource(holder.coplistdata.getImageId());
//                holder.imageExpandm.setVisibility(CopListdata.isSelected() ? View.VISIBLE : View.INVISIBLE);
                holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        holder.itemView.setBackgroundColor(Color.CYAN);
        holder.imageExpandm.setVisibility(View.INVISIBLE);

        /                        holder.imageExpandm.setVisibility(coplistdata.isSelected_1stLevel() ? View.VISIBLE : View.INVISIBLE);
//                       Toast.makeText((Context) context,"you clicked  "+coplistdata.get_itemname(),Toast.LENGTH_LONG)  .show();
        }
        });
        }
        // If not checkmark image
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
        }*/
/*    try {
        Class res = R.drawable.class;
        Field field = res.getField("mic_done_black_24dp");
        int drawableId = field.getInt(null);

    }
        catch (Exception e) {
        Log.e("MyTag", "Failure to get drawable id.", e);
    }*/