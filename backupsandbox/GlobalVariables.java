package com.example.android.cop1803;

import java.util.ArrayList;

public class GlobalVariables
{
    public static String TRUE = "true";
    public static String FALSE = "false";
    public static ArrayList<String> MSelectedItems = new ArrayList<String>();
public static ArrayList<String> mViewLocations = new ArrayList<String>();


    public static void AddToList(String str) {       //This method is called to populate the list
        MSelectedItems.add(str);}
}


    public static void AddTomViewLocations(String str) {       //This method is called to populate the list
        mViewLocations .add(String str,float x,floaty);}
}

/* public class c1 {
        public static ArrayList<String> list = new ArrayList<String>();

        public static void AddToList(String str) {       //This method is called to populate the list
            list.add(str);
        }
    }


    public class c2 {
        public c2() {
            System.out.println("c1.list.size() = " + c1.list.size()); //Prints 0
        }
    }
*/