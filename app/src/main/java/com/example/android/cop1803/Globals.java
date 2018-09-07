package com.example.android.cop1803;

import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.widget.Button;

import java.util.ArrayList;

public class Globals
{
    private static Globals instance;
    private static String isToogleflagon;
    private static String itemgroup;
    private static String justclicked;
    private static String currentclick;
    private static String buttontouch;
    private static String recyclertouch;
    private static Button currentbutton;
    private static ArrayList currentbuttontext;
    private static String btnDefaulttext;
    private static int btn0width;
    private static String viewlinesbeingdrawn;


//    //To stop Calling from other Classes
    private Globals(){}



    public void setIsToogleflagon(String t){
       Globals.isToogleflagon=t;
   }
    public  String getIsToogleflagon() {
        return Globals.isToogleflagon;
    }
    public void setItemgroup(String t){
        Globals.itemgroup=t;
    }
    public  String getItemgroup() {
        return Globals.itemgroup;
    }

    public void setJustclicked(String t){
        Globals.justclicked=t;
    }
    public  String getJustclicked() {
        return Globals.justclicked;
    }

    public void setCurrentclick(String t){
        Globals.currentclick=t;
    }
    public  String getCurrentclick() {
        return Globals.currentclick;
    }
    public void setButtontouch(String t){
        Globals.buttontouch=t;
    }
    public  String getButtontouch() {
        return Globals.buttontouch;
    }



    public void setRecyclertouch(String t){
        Globals.recyclertouch=t;
    }
    public  String getRecyclertouch() {
        return Globals.recyclertouch;
    }

    public void setCurrentbutton(Button t){
    Globals.currentbutton=t;
}
    public  Button getCurrentbutton() {
        return Globals.currentbutton;
    }

    public void setCurrentbuttontext(ArrayList t){
        Globals.currentbuttontext=t;
    }
    public  ArrayList getCurrentbuttontext() {
        return Globals.currentbuttontext;
    }

    public void setBtnDefaulttext(String t){
        Globals.btnDefaulttext=t;
    }
    public  String getBtnDefaulttext() {
        return Globals.btnDefaulttext;
    }
//
    public void setBtn0width(int t){
    Globals.btn0width=t;
}
    public int getBtn0width(){
      return   Globals.btn0width;
    }
//
public void setViewlinesbeingdrawn(String t){
    Globals.viewlinesbeingdrawn=t;
}
    public String getViewlinesbeingdrawn(){
        return   Globals.viewlinesbeingdrawn;
    }

    public static synchronized Globals getInstance(){
       if(instance==null){
           instance=new Globals();
       }
       return instance;
    }

    public static SpannableStringBuilder makeSectionOfTextBold(String text){

        SpannableStringBuilder builder=new SpannableStringBuilder();
        String search="9";
        int retPos=text.indexOf(search);
        int lentext=text.length();


        if ( retPos != -1 ) {
            String starttext = text.substring(0, lentext - (lentext-retPos));
            String endtext = text.substring(retPos + 1);
            String finaltext = starttext + endtext;
            builder.append(finaltext);
            builder.setSpan(new RelativeSizeSpan(.7f), retPos, lentext-1, 0);




            return builder;
        }
        else{

            builder.append(text);
            return builder;
        }
    }

}