package com.example.android.cop1803;

import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Neuer home on 11/19/2017.
 */

public class CopListdata {
    private  String _KCal;
    private String _itemname;
    private String _Fat;
    private String _Cho;
    private String _Pro;
    private int imageId;
    private static boolean isSelected = false;

//..constructer;
    public CopListdata(String itemname , String KCal, String Fat, String Cho,String Pro, int imageId)
//           ,String itemclass,int level)
    {
        this._itemname = itemname;
        this._KCal = KCal;
        this._Fat = Fat;
        this._Cho = Cho;
        this._Pro = Pro;
        this.imageId=imageId;
    }

    public String get_itemname()
    {
        return _itemname;
    }
    public void set_itemname(String itemname) {this._itemname = itemname; }

    public String get_KCal()
   {
        return _KCal;
   }

    public void set_KCal(String KCal)
    {
        this._itemname = KCal;
    }


   public String get_Fat()
    {
        return _Fat;
    }
    public void set_Fat(String Fat)
    {
        this._itemname = Fat;
    }


    public String get_Cho()
    {
        return _Cho;
    }
    public void set_Cho(String Cho)
    {
        this._itemname = Cho;
    }


    public String get_Pro()
    {
        return _Pro;
    }
    public void set_Pro(String Pro)
    {
        this._itemname = Pro;
    }

    public int getImageId(){return imageId;}
    public void setImageId(int imageId){
        this.imageId=imageId;
    }
    public static void setSelected(boolean selected) {
        isSelected = selected;
    }


    public static boolean isSelected() {
        return isSelected;
    }


}


//...https://guides.codepath.com/android/using-the-recyclerview#overview

/*
*public class Protein {
    private String fItemname;
    private String fItemType;


    public Protein(String itemname, String itemtype,String itemclass ) {
        fItemname = itemname;
        fItemType = itemtype;
        String fItemClass = itemclass;
    }

    public String getItemName() {
        return fItemname;
    }

    public String getfItemType() {
        return fItemType;
    }

    public String getfItemClass() {
        return getfItemClass();
    }

    private static int lastContactId = 0;

    public static ArrayList<Protein> createProteinList(int numFood) {
        ArrayList<Protein> proteins = new ArrayList<Protein>();

        {
            proteins.add(new Protein("chicken","protein","bird"));
            proteins.add(new Protein("Game","protein","bird"));
            proteins.add(new Protein("Goose","protein","bird"));
//                    (new protein(itemname:"chicken",itemtype:"protein",itemclass:"birds"))
        }

        return proteins;
    }
}*/
