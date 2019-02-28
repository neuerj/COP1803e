package com.example.android.cop1803;

/**
 * Created by Neuer home on 11/19/2017.
 */

public class CopListdata {
    private  String _KCal;
    private String itemnamecat;
    private String itemname;
    private String _Fat;
    private String _Cho;
    private String _Pro;
    private int imageId;
    private static boolean isSelected = false;
    private static boolean isSelected_1stLevel = false;

//..constructer;
    public CopListdata(String itemnamecat , String itemname , String KCal, String Fat, String Cho,
                       String Pro, int imageId)
//           ,String itemclass,int level)
    {
        this.itemnamecat = itemnamecat;
        this.itemname = itemname;
        this._KCal = KCal;
        this._Fat = Fat;
        this._Cho = Cho;
        this._Pro = Pro;
        this.imageId=imageId;
    }
    public String get_itemnamecat()
    {
        return itemnamecat;
    }
    public void set_itemnamecat(String itemnamecat) {this.itemnamecat = itemnamecat; }




    public String get_itemname()
    {
        return itemname;
    }
    public void set_itemname(String itemname) {this.itemname = itemname; }




    public String get_KCal()
   {
        return _KCal;
   }

    public void set_KCal(String KCal)
    {
        this.itemname = KCal;
    }


   public String get_Fat()
    {
        return _Fat;
    }
    public void set_Fat(String Fat)
    {
        this.itemname = Fat;
    }


    public String get_Cho()
    {
        return _Cho;
    }
    public void set_Cho(String Cho)
    {
        this.itemname = Cho;
    }


    public String get_Pro()
    {
        return _Pro;
    }
    public void set_Pro(String Pro)
    {
        this.itemname = Pro;
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
    public static boolean isCheckmark() {


        return isCheckmark();
    }

public static class CurrentList
{
   private String Item;

    public CurrentList(String item)

    {
        this.Item = item;

    }
    public String get_Item()
    {
        return Item;
    }
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
