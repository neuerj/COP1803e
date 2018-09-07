package com.example.android.cop1803;

/**
 * Created by Jim Neuer on 20/05/18.
 */

public class Item {
  //  int id;
    String name;
    String description;
    String KCal;
    String Fat;
    String Cho;
    String Pro;
   // double price;
  //  String thumbnail;

    public Item(String name, String description, String KCal, String Fat, String Cho,String Pro) {
        this.name=name;
        this.description=description;
        this.KCal = KCal;
        this.Fat = Fat;
        this.Cho = Cho;
        this.Pro = Pro;
    }

/*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
*/

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String get_KCal()
    {
        return KCal;
    }
    public void set_KCal(String KCal)
    {
        this.name = KCal;
    }


    public String get_Fat()
    {
        return Fat;
    }
    public void set_Fat(String Fat)
    {
        this.name = Fat;
    }

    public String get_Cho()
    {
        return Cho;
    }
    public void set_Cho(String Cho)
    {
        this.name = Cho;
    }

    public String get_Pro()
    {
        return Pro;
    }
    public void set_Pro(String Pro)
    {
        this.name = Pro;
    }

   /* public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }*/
}
