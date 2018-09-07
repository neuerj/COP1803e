package com.example.android.cop1803;

/**
 * Created by Neuer home on 11/26/2017.
 */

import java.util.ArrayList;

public class CopData {


    public static ArrayList<CopListdata> LoadDataCopButton(String foodclass) {
        ArrayList<CopListdata> data = new ArrayList<CopListdata>();

        switch (foodclass) {

            case "MainCOPbtn":
                data.add(new CopListdata("Beef", "0", "0", "0", "0", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Chicken", "0", "0", "0", "0", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Game", "0", "0", "0", "0", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Goose and Gosling", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Guinea Hen Fowl", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Lamb", "0", "0", "0", "0", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Organ Meats - Offal Meats", "0", "0", "0", "0", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Ostrich", "0", "0", "0", "0", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Pork", "0", "0", "0", "0", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Poussin/Cornish Game Hen", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Squab", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Turkey", "0", "0", "0", "0", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Veal", "0", "0", "0", "0", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Venison", "0", "0", "0", "0", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("*** Fish ***", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Cephalopods", "0", "0", "0", "0", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Flat Fish", "0", "0", "0", "0", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Miscellaneous", "0", "0", "0", "0", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Non-Bony Fish", "0", "0", "0", "0", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Poke", "0", "0", "0", "0", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Round Fish", "0", "0", "0", "0", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Shellfish", "0", "0", "0", "0", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("*** Dairy and Eggs  ***", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Butter", "0", "0", "0", "0", R.drawable.ic_keyboard_arrow_right_black_24dp));
                break;

            case "btnx21":
                data.add(new CopListdata("Batters","0","0","0","0", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Bread Crumbs","0","0","0","0", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Potato Crumbs","","","","", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Mushroom Crumbs","","","","", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Mushroom Flours","","","","", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Nut Flours","","","","", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Dried Fruit","","","","", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Flour","","","","", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Fruit Paste","","","","", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Chopped Nuts","","","","", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Seeds","","","","", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Tortilla Crumbs","","","","", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Dried Vegetables","","","","", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Grains and Starches","","","","", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Grain and Starch Flours","","","","", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Spices","","","","", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Bean/Legume Pastes ","","","","", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Edible Flowers","","","","", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Crushed Root Chip Crumbs","","","","", R.drawable.ic_keyboard_arrow_right_black_24dp));
                data.add(new CopListdata("Other","","","","", R.drawable.ic_keyboard_arrow_right_black_24dp));

                break;
        }
        return data;
    }



    public static ArrayList<CopListdata> LoadDataCopChildButton(String fitem) {

        ArrayList<CopListdata> data = new ArrayList<CopListdata>();


        switch (fitem) {
            case "Beef":
                data.add(new CopListdata("Beef for Stewing", "210", "6", "0", "36", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Bottom Round", "210", "6", "0", "36", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Bottom Sirloin", "194", "6", "0", "23", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Brisket", "246", "12", "0", "34", R.drawable.mic_done_black_24dp));
          /*      data.add(new CopListdata("Chuck Roll","172","6","0","21"));
                data.add(new CopListdata("Cube Steak","210","6","0","36"));
                data.add(new CopListdata("Flank Steak","219","9","0","31"));
                data.add(new CopListdata("Full Tenderloin","202","7","0","32"));
                data.add(new CopListdata("Ground Beef","306","20","0","30"));
                data.add(new CopListdata("Kobe Beef","280","20","1","18"));
                data.add(new CopListdata("Rib Roast Ready Cover Off","397","32","0","26"));
                data.add(new CopListdata("Rib Roast Ready Netted","397","32","0","26"));
                data.add(new CopListdata("Ribeye Roll Lip On","397","32","0","26"));
                data.add(new CopListdata("Ribeye Roll Steak","397","32","0","26"));
                data.add(new CopListdata("Round Rump and Shank/Baron of Beef","210","6","0","36"));
                data.add(new CopListdata("Short Ribs","260","17","5","20"));
                data.add(new CopListdata("Shoulder Clod","157","7","0","23"));
                data.add(new CopListdata("Skirt Steak","239","12","0","33"));
                data.add(new CopListdata("Strip Loin Steak","194","6","0","23"));
                data.add(new CopListdata("T-Bone Steak","200","8","0","30"));
                data.add(new CopListdata("Tenderloin Steak","194","6","0","23"));
                data.add(new CopListdata("Top Inside Round","210","6","0","36"));
                data.add(new CopListdata("Top Round Steak","210","6","0","36"));
                data.add(new CopListdata("Top Sirloin Butt Steak","194","6","0","23"));
                data.add(new CopListdata("Tri-Tip","197","11","0","23"));
                data.add(new CopListdata("Wagyu Beef","280","20","1","18"));

        */
                break;
            case "Chicken":
                data.add(new CopListdata("Rock Cornish Game Hen", "240", "15", "0", "25", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Broiler", "260", "17", "0", "21", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fryer", "260", "17", "0", "21", R.drawable.mic_done_black_24dp));
         /*        data.add(new CopListdata("Roaster","260","17","0","21"));
                data.add(new CopListdata("Stewing Hen","260","17","0","21"));
                data.add(new CopListdata("Capon","260","17","0","21"));
                data.add(new CopListdata("Whole or Half","260","17","0","21"));
                data.add(new CopListdata("Quarter","260","17","0","21"));
                data.add(new CopListdata("Crown","260","17","0","21"));
                data.add(new CopListdata("Whole Leg","216","10","0","31"));
                data.add(new CopListdata("Thigh","279","18","0","29"));
                data.add(new CopListdata("Drumstick","244","13","0","31"));
                data.add(new CopListdata("Wing","328","22","0","31"));
                data.add(new CopListdata("Breast Fillet","124","2","0","26"));
                data.add(new CopListdata("Tenderloin of Breast","124","2","0","26"));
                data.add(new CopListdata("Goujon","124","2","0","26"));
                data.add(new CopListdata("Diced Chicken","124","2","0","26"));
                data.add(new CopListdata("Minced Chicken","180","11","0","19"));
                data.add(new CopListdata("Ground Chicken","180","11","0","19"));
*/
                break;
  /*          case "Game" :
                data.add(new CopListdata("Buffalo","240","12","0","32"));
                data.add(new CopListdata("Venison","179","4","0","34"));
                data.add(new CopListdata("Wild Boar","160","4","0","30"));
                data.add(new CopListdata("Bear","144","1","0","23"));
                data.add(new CopListdata("Rattlesnake","93","1","0","25"));
                data.add(new CopListdata("Ostrich","134","3","0","28"));
                data.add(new CopListdata("Alligator","318","4","0","9"));
                data.add(new CopListdata("Pheasant","144","1","0","24"));
                data.add(new CopListdata("Quail","132","4","0","24"));
                data.add(new CopListdata("Rabbit","144","3","0","22"));
                data.add(new CopListdata("Partridge","151","1","0","26"));
                data.add(new CopListdata("Wild Duck","152","2","0","23"));
                data.add(new CopListdata("Grouse","142","1","0","24"));
                data.add(new CopListdata("Squab/Pigeon","153","2","0","23"));
                data.add(new CopListdata("Dove","145","2","0","23"));
                data.add(new CopListdata("Woodcock","153","2","0","23"));
                data.add(new CopListdata("Snipe","180","4","0","20"));
                data.add(new CopListdata("Teal","177","4","0","21"));
                data.add(new CopListdata("Duck","180","4","0","20"));
                break;
        }*/



      /*  data.add(new CopListdata("Beef2"));
       data.add(new CopListdata("Chicken2"));*/
        /*data.add(new CopListdata("Game"));
        data.add(new CopListdata("Goose and Gosling"));
        data.add(new CopListdata("Guinea Hen Fowl"));
        data.add(new CopListdata("Lamb"));
        data.add(new CopListdata("Organ Meats - Offal Meats"));
        data.add(new CopListdata("Ostrich"));
        data.add(new CopListdata("Pork"));
        data.add(new CopListdata("Poussin/Cornish Game Hen"));
        data.add(new CopListdata("Squab"));
        data.add(new CopListdata("Turkey"));
        data.add(new CopListdata("Veal"));
        data.add(new CopListdata("Venison"));
        data.add(new CopListdata("*** Fish ***"));
        data.add(new CopListdata("Cephalopods"));
        data.add(new CopListdata("Flat Fish"));
        data.add(new CopListdata("Miscellaneous"));
        data.add(new CopListdata("Non-Bony Fish"));
        data.add(new CopListdata("Poke"));
        data.add(new CopListdata("Round Fish"));
        data.add(new CopListdata("Shellfish"));
        data.add(new CopListdata("*** Dairy and Eggs  ***"));
        data.add(new CopListdata("Butter"));*/
            case "Batters":
                data.add(new CopListdata("Beer","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Liquor Products ","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Liquid Dairy Products ","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit Juices ","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Tempura ","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetable Juices ","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Water Varieties ","","","","",R.drawable.mic_done_black_24dp));

        }
        return data;

    }

}