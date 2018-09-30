package com.example.android.cop1803;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
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
    private static int currentbuttonID;
    private static ArrayList currentbuttontext;
    private static String btnDefaulttext;
    private static int btn0width;
    private static String viewlinesbeingdrawn;
    private static ArrayList<String> currentbuttontextbtnx10 = new ArrayList<String>();
    private static ArrayList<String> currentbuttontextbtnx21 = new ArrayList<String>();
    private static ArrayList<String> currentbuttontextbtnx22 = new ArrayList<String>();
    private static ArrayList<String> currentbuttontextbtnx23 = new ArrayList<String>();
    private static ArrayList<String> currentbuttontextbtnx24 = new ArrayList<String>();
    private static ArrayList<String> currentbuttontextbtnx25 = new ArrayList<String>();
    private static ArrayList<String> currentbuttontextbtnx26 = new ArrayList<String>();
    private static ArrayList<String> currentbuttontextbtnx27 = new ArrayList<String>();
    private static ArrayList<String> currentbuttontextbtnx31 = new ArrayList<String>();
    private static ArrayList<String> currentbuttontextbtnx41 = new ArrayList<String>();
    private static ArrayList<String> currentbuttontextbtnx42 = new ArrayList<String>();
    private static ArrayList<String> currentbuttontextbtnx43 = new ArrayList<String>();
    private static ArrayList<String> currentbuttontextbtnx44 = new ArrayList<String>();
    private static ArrayList<String> currentbuttontextbtnx45 = new ArrayList<String>();


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
    public  int getCurrentbuttonID() {
        return Globals.currentbuttonID;
    }

    public void setCurrentbuttonID(int t){
        Globals.currentbuttonID=t;
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

    public void setCurrentbuttontextbtnx10(ArrayList<String> t){Globals.currentbuttontextbtnx10=t;}
    public void setCurrentbuttontextbtnx21(ArrayList<String> t){Globals.currentbuttontextbtnx21=t;}
    public void setCurrentbuttontextbtnx22(ArrayList<String> t){Globals.currentbuttontextbtnx22=t;}
    public void setCurrentbuttontextbtnx23(ArrayList<String> t){Globals.currentbuttontextbtnx23=t;}
    public void setCurrentbuttontextbtnx24(ArrayList<String> t){Globals.currentbuttontextbtnx24=t;}
    public void setCurrentbuttontextbtnx25(ArrayList<String> t){Globals.currentbuttontextbtnx25=t;}
    public void setCurrentbuttontextbtnx26(ArrayList<String> t){Globals.currentbuttontextbtnx26=t;}
    public void setCurrentbuttontextbtnx27(ArrayList<String> t){Globals.currentbuttontextbtnx27=t;}
    public void setCurrentbuttontextbtnx31(ArrayList<String> t){Globals.currentbuttontextbtnx31=t;}
    public void setCurrentbuttontextbtnx41(ArrayList<String> t){Globals.currentbuttontextbtnx41=t;}
    public void setCurrentbuttontextbtnx42(ArrayList<String> t){Globals.currentbuttontextbtnx42=t;}
    public void setCurrentbuttontextbtnx43(ArrayList<String> t){Globals.currentbuttontextbtnx43=t;}
    public void setCurrentbuttontextbtnx44(ArrayList<String> t){Globals.currentbuttontextbtnx44=t;}
    public void setCurrentbuttontextbtnx45(ArrayList<String> t){Globals.currentbuttontextbtnx45=t;}


    public ArrayList<String> getCurrentbuttontextbtnx10(){return Globals.currentbuttontextbtnx10;}
    public ArrayList<String> getCurrentbuttontextbtnx21(){return Globals.currentbuttontextbtnx21;}
    public ArrayList<String> getCurrentbuttontextbtnx22(){return Globals.currentbuttontextbtnx22;}
    public ArrayList<String> getCurrentbuttontextbtnx23(){return Globals.currentbuttontextbtnx23;}
    public ArrayList<String> getCurrentbuttontextbtnx24(){return Globals.currentbuttontextbtnx24;}
    public ArrayList<String> getCurrentbuttontextbtnx25(){return Globals.currentbuttontextbtnx25;}
    public ArrayList<String> getCurrentbuttontextbtnx26(){return Globals.currentbuttontextbtnx26;}
    public ArrayList<String> getCurrentbuttontextbtnx27(){return Globals.currentbuttontextbtnx27;}
    public ArrayList<String> getCurrentbuttontextbtnx31(){return Globals.currentbuttontextbtnx31;}
    public ArrayList<String> getCurrentbuttontextbtnx41(){return Globals.currentbuttontextbtnx41;}
    public ArrayList<String> getCurrentbuttontextbtnx42(){return Globals.currentbuttontextbtnx42;}
    public ArrayList<String> getCurrentbuttontextbtnx43(){return Globals.currentbuttontextbtnx43;}
    public ArrayList<String> getCurrentbuttontextbtnx44(){return Globals.currentbuttontextbtnx44;}
    public ArrayList<String> getCurrentbuttontextbtnx45(){return Globals.currentbuttontextbtnx45;}





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

    public static SpannableStringBuilder makeSectionOfTextBold(String text,String textlocation){
        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
        String finaltext="";
        SpannableStringBuilder builder=new SpannableStringBuilder();
        String search="9";
        int retPos=text.indexOf(search);
        int lentext=text.length();


        if ( retPos != -1 ) {
            String starttext = text.substring(0, lentext - (lentext-retPos));
            String endtext = text.substring(retPos + 1);

            switch (textlocation) {
                case "RV":
                    finaltext = starttext + endtext;
                    builder.append(finaltext);
                    builder.setSpan(new RelativeSizeSpan(.7f), retPos, lentext-1, 0);
                    break;
                case "CARTLIST":
                    finaltext = starttext.trim() ;
                    builder.append(finaltext);
                    builder.setSpan(boldSpan,text.indexOf(text),text.indexOf("Bold,") + String
                            .valueOf("Bold").length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); // Do
                    // not extend the span when text add later
                    break;
                case "BUTTON":
                    finaltext = starttext;
                    builder.append(finaltext);
                    break;
                case "MenuView":
                    finaltext = starttext + endtext;
                    builder.append(finaltext);
                    builder.setSpan(new RelativeSizeSpan(.7f), retPos, lentext-1, 0);
                    break;
            }


            return builder;

        }
        else{

            builder.append(text);
            return builder;
        }
    }

}