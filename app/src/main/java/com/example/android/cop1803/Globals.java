package com.example.android.cop1803;

import android.graphics.PointF;
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
    private static int currentbuttonID;
    private static ArrayList currentbuttontext;
    private static String btnDefaulttext;
    private static int btn0width;
    private static String viewlinesbeingdrawn;
    private static boolean firstpass;
    private static int MainWindowWidth;
    private static int DialogWindowWidth;
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
    
    
    private static PointF x100;
    private static PointF x21;
    private static PointF x22;
    private static PointF x23;
    private static PointF x24;
    private static PointF x25;
    private static PointF x26;
    private static PointF x27;

    private static PointF x31;

    private static PointF x41;
    private static PointF x42;
    private static PointF x43;
    private static PointF x44;
    private static PointF x45;

    private static PointF x0;
    private static PointF x1;
    private static PointF x2;
    private static PointF x3;
    private static PointF x4;
    private static PointF x5;
    private static PointF x6;
    private static PointF x7;
    private static PointF x8;
    private static PointF x9;
    private static PointF x10;
    private static PointF x11;
    private static PointF x12;
    private static float x0width;
    private static float x00width;
    private static float SB;

    private static PointF x1tri;
    private static PointF x2tri;
    private static PointF x3tri;
    private static PointF x4tri;
    private static PointF x5tri;
    private static PointF x6tri;
    private static PointF x7tri;
    private static PointF x8tri;
    private static PointF x9tri;
    private static PointF x10tri;
    private static PointF x11tri;
    private static PointF x12tri;

    private static double x1triAngle;
    private static double x2triAngle;
    private static double x3triAngle;
    private static double x4triAngle;
    private static double x5triAngle;
    private static double x6triAngle;
    private static double x7triAngle;
    private static double x8triAngle;
    private static double x9triAngle;
    private static double x10triAngle;
    private static double x11triAngle;
    private static double x12triAngle;


//    //To stop Calling from other Classes
    private Globals(){}
    void setSB(float SB) {Globals.SB = SB;} float getSB() {return SB;}
    
    void setx100(PointF x100) {Globals.x100 = x100;}  PointF getx100() {return x100;}
    void setx21(PointF x21) {Globals.x21 = x21;} PointF getx21() {return x21;}
    void setx22(PointF x22) {Globals.x22 = x22;}  PointF getx22() {return x22;}
    void setx23(PointF x23) {Globals.x23 = x23;}  PointF getx23() {return x23;}
    void setx24(PointF x24) {Globals.x24 = x24;}  PointF getx24() {return x24;}
    void setx25(PointF x25) {Globals.x25 = x25;}  PointF getx25() {return x25;}
    void setx26(PointF x26) {Globals.x26 = x26;}  PointF getx26() {return x26;}
    void setx27(PointF x27) {Globals.x27 = x27;}  PointF getx27() {return x27;}

     void setx31(PointF x31) {Globals.x31 = x31;}  PointF getx31() {return x31;}

     void setx41(PointF x41) {Globals.x41 = x41;}  PointF getx41() {return x41;}
     void setx42(PointF x42) {Globals.x42 = x42;}  PointF getx42() {return x42;}
     void setx43(PointF x43) {Globals.x43 = x43;}  PointF getx43() {return x43;}
     void setx44(PointF x44) {Globals.x44 = x44;}  PointF getx44() {return x44;}
     void setx45(PointF x45) {Globals.x45 = x45;}  PointF getx45() {return x45;}




    void setx0(PointF x0) {Globals.x0 = x0;}  PointF getx0() {return x0;}
    void setx1(PointF x1) {Globals.x1 = x1;}  PointF getx1() {return x1;}
    void setx2(PointF x2) {Globals.x2 = x2;}  PointF getx2() {return x2;}
    void setx3(PointF x3) {Globals.x3 = x3;}  PointF getx3() {return x3;}
    void setx4(PointF x4) {Globals.x4 = x4;}  PointF getx4() {return x4;}
    void setx5(PointF x5) {Globals.x5 = x5;}  PointF getx5() {return x5;}
    void setx6(PointF x6) {Globals.x6 = x6;}  PointF getx6() {return x6;}
    void setx7(PointF x7) {Globals.x7 = x7;}  PointF getx7() {return x7;}
    void setx8(PointF x8) {Globals.x8 = x8;}  PointF getx8() {return x8;}
    void setx9(PointF x9) {Globals.x9 = x9;}  PointF getx9() {return x9;}
    void setx10(PointF x10) {Globals.x10 = x10;}  PointF getx10() {return x10;}
    void setx11(PointF x11) {Globals.x11 = x11;}  PointF getx11() {return x11;}
    void setx12(PointF x12) {Globals.x12 = x12;}  PointF getx12() {return x12;}

   void setx1tri(PointF x1tri) {Globals.x1tri = x1tri;}  PointF getx1tri() {return x1tri;}
    void setx2tri(PointF x2tri) {Globals.x2tri = x2tri;}  PointF getx2tri() {return x2tri;}
    void setx3tri(PointF x3tri) {Globals.x3tri = x3tri;}  PointF getx3tri() {return x3tri;}
    void setx4tri(PointF x4tri) {Globals.x4tri = x4tri;}  PointF getx4tri() {return x4tri;}
    void setx5tri(PointF x5tri) {Globals.x5tri = x5tri;}  PointF getx5tri() {return x5tri;}
    void setx6tri(PointF x6tri) {Globals.x6tri = x6tri;}  PointF getx6tri() {return x6tri;}
    void setx7tri(PointF x7tri) {Globals.x7tri = x7tri;}  PointF getx7tri() {return x7tri;}
    void setx8tri(PointF x8tri) {Globals.x8tri = x8tri;}  PointF getx8tri() {return x8tri;}
    void setx9tri(PointF x9tri) {Globals.x9tri = x9tri;}  PointF getx9tri() {return x9tri;}
    void setx10tri(PointF x10tri) {Globals.x10tri = x10tri;}  PointF getx10tri() {return x10tri;}
    void setx11tri(PointF x11tri) {Globals.x11tri = x11tri;}  PointF getx11tri() {return x11tri;}
    void setx12tri(PointF x12tri) {Globals.x12tri = x12tri;}  PointF getx12tri() {return x12tri;}

    void setx1triAngle(double x1triAngle) {Globals.x1triAngle = x1triAngle;}  double getx1triAngle() {return x1triAngle;}
    void setx2triAngle(double x2triAngle) {Globals.x2triAngle = x2triAngle;}  double getx2triAngle() {return x2triAngle;}
    void setx3triAngle(double x3triAngle) {Globals.x3triAngle = x3triAngle;}  double getx3triAngle() {return x3triAngle;}
    void setx4triAngle(double x4triAngle) {Globals.x4triAngle = x4triAngle;}  double getx4triAngle() {return x4triAngle;}
    void setx5triAngle(double x5triAngle) {Globals.x5triAngle = x5triAngle;}  double getx5triAngle() {return x5triAngle;}
    void setx6triAngle(double x6triAngle) {Globals.x6triAngle = x6triAngle;}  double getx6triAngle() {return x6triAngle;}
    void setx7triAngle(double x7triAngle) {Globals.x7triAngle = x7triAngle;}  double getx7triAngle() {return x7triAngle;}
    void setx8triAngle(double x8triAngle) {Globals.x8triAngle = x8triAngle;}  double getx8triAngle() {return x8triAngle;}
    void setx9triAngle(double x9triAngle) {Globals.x9triAngle = x9triAngle;}  double getx9triAngle() {return x9triAngle;}
    void setx10triAngle(double x10triAngle) {Globals.x10triAngle = x10triAngle;}  double getx10triAngle() {return x10triAngle;}
    void setx11triAngle(double x11triAngle) {Globals.x11triAngle = x11triAngle;}  double getx11triAngle() {return x11triAngle;}
    void setx12triAngle(double x12triAngle) {Globals.x12triAngle = x12triAngle;}  double getx12triAngle() {return x12triAngle;}
    
    public void setx0width(float x0width) {Globals.x0width = x0width;} public float getx0width() {return x0width;}
    public void setx00width(float x00width) {Globals.x00width = x00width;} public float getx00width() {return x00width;}

    public void SetMainWindowWidth(int MainWindowWidth) {Globals.MainWindowWidth =
            MainWindowWidth;} public int getMainWindowWidth() {return MainWindowWidth;}
    public void SetDialogWindowWidth(int DialogWindowWidth) {Globals.DialogWindowWidth =
            DialogWindowWidth;} public int DialogWindowWidth() {return DialogWindowWidth;}

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

    public void setFirstpass(boolean t){
        Globals.firstpass=t;
    }
    public boolean getFirstpass(){
        return   Globals.firstpass;
    }

    public static synchronized Globals getInstance(){
       if(instance==null){
           instance=new Globals();
       }
       return instance;
    }





    public static SpannableStringBuilder makeSectionOfTextBold(String text,String textlocation){
        //StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
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
                    finaltext = starttext + endtext; ;
                    builder.append(finaltext);
                    builder.setSpan(new RelativeSizeSpan(.7f), retPos, lentext-1, 0);

                   // builder.setSpan(boldSpan,text.indexOf(text),text.indexOf("Bold,") + String.valueOf("Bold").length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); // Do
                    // not extend the span when text add later
                    break;
                case "BUTTON":
                    finaltext = starttext;
                    builder.append(finaltext);
                   // builder.setSpan(new StyleSpan(Typeface.BOLD), 0, lentext,
                   //         Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
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