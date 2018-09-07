package com.example.android.cop1803;

import java.util.ArrayList;

public class GlobalVariables
{
    public static String TRUE = "true";
    public static String FALSE = "false";
    public static ArrayList<String> MSelectedItems = new ArrayList<String>();


    public static void AddToList(String str) {       //This method is called to populate the list
        MSelectedItems.add(str);}



    }
