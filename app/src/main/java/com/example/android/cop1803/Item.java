package com.example.android.cop1803;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Jim Neuer on 20/05/18.
 */

public class Item implements Parcelable {
  //  int id;
    String namecat;
    String name;
    String description;
    String KCal;
    String Fat;
    String Cho;
    String Pro;
   // double price;
  //  String thumbnail;

    public Item(String namecat,String name, String description, String KCal, String Fat, String
            Cho,String Pro) {
        super();
        this.namecat=namecat;
        this.name=name;
        this.description=description;
        this.KCal = KCal;
        this.Fat = Fat;
        this.Cho = Cho;
        this.Pro = Pro;
    }

 public Item(){
        super();
    }

    public String getnamecat() {
        return namecat;
    }
    public void setnamecat(String namecat) {
        this.namecat = namecat;
    }

    public String getname() {
        return name;
    }
    public void setname(String name) {
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
   @SuppressWarnings("unused")
   public Item(Parcel in) {
       this();
       readFromParcel(in);
   }
    private void readFromParcel(Parcel in) {
        this.name=in.readString();
        this.namecat=in.readString();
        this.description=in.readString();
        this.KCal = in.readString();
        this.Fat = in.readString();
        this.Cho =in.readString();
        this.Pro = in.readString();
    }
    public int describeContents() {
        return 0;
    }
    public final Parcelable.Creator<Item> CREATOR = new Parcelable.Creator<Item>() {
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        public Item[] newArray(int size) {
            return new Item[size];
        }
    };


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(namecat);
        dest.writeString(description);
        dest.writeString(KCal);
        dest.writeString(Fat);
        dest.writeString(Cho);
        dest.writeString(Pro);
    }

}
