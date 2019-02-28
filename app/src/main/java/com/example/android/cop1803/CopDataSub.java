package com.example.android.cop1803;


/**
 * Created by Neuer home on 11/26/2017.
 */

import java.util.ArrayList;
public class CopDataSub {

    public static ArrayList<CopListdata> LoadDataCopChildButton(String fitem) {

        ArrayList<CopListdata> data = new ArrayList<CopListdata>();
        switch (fitem) {

    //sub main cop button

            case "MainCOPbtn_Beef":
                data.add(new CopListdata("Protein-Beef","Beef for Stewing","210","6","0","36", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Bottom Round","210","6","0","36", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Bottom Sirloin","194","6","0","23", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Brisket","246","12","0","34", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Chuck Roll","172","6","0","21", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Cube Steak","210","6","0","36", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Flank Steak","219","9","0","31", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Full Tenderloin","202","7","0","32", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Ground Beef","306","20","0","30", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Kobe Beef","280","20","1","18", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Rib Roast Ready Cover Off","397","32","0","26", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Rib Roast Ready Netted","397","32","0","26", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Ribeye Roll Lip On","397","32","0","26", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Ribeye Roll Steak","397","32","0","26", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Round Rump and Shank/Baron of Beef","210","6","0","36", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Short Ribs","260","17","5","20", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Shoulder Clod","157","7","0","23", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Skirt Steak","239","12","0","33", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Strip Loin Steak","194","6","0","23", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","T-Bone Steak","200","8","0","30", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Tenderloin Steak","194","6","0","23", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Top Inside Round","210","6","0","36", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Top Round Steak","210","6","0","36", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Top Sirloin Butt Steak","194","6","0","23", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Tri-Tip","197","11","0","23", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Beef","Wagyu Beef","280","20","1","18", R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Chicken":
                data.add(new CopListdata("Protein-Chicken  ","Breast Fillet","240","15","0","25", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Chicken  ","Broiler","260","17","0","21", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Chicken  ","Capon","260","17","0","21", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Chicken  ","Crown","260","17","0","21", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Chicken  ","Diced Chicken","260","17","0","21", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Chicken  ","Drumstick","260","17","0","21", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Chicken  ","Fryer","260","17","0","21", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Chicken  ","Goujon","260","17","0","21", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Chicken  ","Ground Chicken","260","17","0","21", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Chicken  ","Minced Chicken","216","10","0","31", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Chicken  ","Quarter","279","18","0","29", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Chicken  ","Roaster","244","13","0","31", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Chicken  ","Rock Cornish Game Hen","328","22","0","31", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Chicken  ","Stewing Hen","124","2","0","26", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Chicken  ","Tenderloin of Breast","124","2","0","26", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Chicken  ","Thigh","124","2","0","26", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Chicken  ","Whole Leg","124","2","0","26", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Chicken  ","Whole or Half","180","11","0","19", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Chicken  ","Wing","180","11","0","19", R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Game" :
                data.add(new CopListdata("Protein-Game","Alligator","240","12","0","32", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Game","Bear","179","4","0","34", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Game","Buffalo","160","4","0","30", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Game","Dove","144","1","0","23", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Game","Duck","93","1","0","25", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Game","Grouse","134","3","0","28", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Game","Ostrich","318","4","0","9", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Game","Partridge","144","1","0","24", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Game","Pheasant","132","4","0","24", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Game","Quail","144","3","0","22", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Game","Rabbit","151","1","0","26", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Game","Rattlesnake","152","2","0","23", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Game","Snipe","142","1","0","24", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Game","Squab/Pigeon","153","2","0","23", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Game","Teal","145","2","0","23", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Game","Venison","153","2","0","23", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Game","Wild Boar","180","4","0","20", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Game","Wild Duck","177","4","0","21", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Game","Woodcock","180","4","0","20", R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Lamb":
                data.add(new CopListdata("Protein-Lamb "," Hotel Rack","450","40","0","18",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Lamb "," Leg, Boneless","290","24","1","18",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Lamb "," Loin Boneless","400","34","0","20",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Lamb "," Loin Chops","400","34","0","20",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Lamb "," Loin Saddle, Trimmed","400","34","0","20",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Lamb "," Rib Chops","400","34","0","20",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Lamb "," Shoulder, Short Cut","318","22","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Lamb ","Leg, Bone In","290","24","1","18",R.drawable.mic_done_black_24dp));

                break;
            case "MainCOPbtn_Organ Meats - Offal Meats":
                data.add(new CopListdata("Protein-Offal Meats","Bone","206","14","0","17",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Brains","138","9","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Caul Fat","84","4","0","16",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Cheek/Jowl","131","5","0","22",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Ear","176","11","0","19",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Fat","980","102","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Feet","201","14","0","9",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Head Meat","176","12","0","16",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Heart","184","3","0","21",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Intestines","208","19","0","9",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Kidney","100","2","0","21",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Liver","190","10","0","23",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Neck","305","22","0","26",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Oxtail","164","9","0","20",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Skin","600","36","0","68",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Spleen","205","4","0","37",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Sweetbread","293","20","0","30",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Tail/Ox Tail","164","9","0","20",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Testicles/Fry Oysters","135","3","0","26",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Tongue","184","3","0","21",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Tripe","82","3","0","15",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Offal Meats","Tripe/Stomach","184","3","0","21",R.drawable.mic_done_black_24dp));

                break;
            case "MainCOPbtn_Ostrich":
                data.add(new CopListdata("Protein-Ostrich","Back Fillet","134","3","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Ostrich","Neck","134","3","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Ostrich","Thigh Fan Fillet","134","3","0","28",R.drawable.mic_done_black_24dp));

                break; case "MainCOPbtn_Pork": data.add(new CopListdata("Protein-Pork","Bacon","610","47","2","42",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Pork","Boston Butt Steaks","305","22","0","26",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Pork","Fresh Ham","138","5","0","22",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Pork","Ground Pork","297","24","0","19",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Pork","Ham Hocks","305","22","0","26",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Pork","Loin Back Ribs","371","29","0","26",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Pork","Loin Boneless Tied","273","15","0","33",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Pork","Loin Canadian Back","273","15","0","33",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Pork","Loin Center Cut 8 Ribs","371","29","0","26",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Pork","Loin Chops Center Cut","244","11","0","33",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Pork","Loin Chops Center Cut Boneless","244","11","0","33",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Pork","Pancetta","400","32","0","24",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Pork","Pork Belly","585","60","0","11",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Pork","Shoulder Boston Butt","305","22","0","26",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Pork","Shoulder Boston Butt/Boneless Tied","305","22","0","26",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Pork","Shoulder Butt Boneless","305","22","0","26",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Pork","Slab Bacon","610","47","2","42",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Pork","Spare Ribs","371","29","0","26",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Pork","St. Louis Style Spare Ribs","371","29","0","26",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Pork","Tenderloin","185","5","0","32",R.drawable.mic_done_black_24dp));

                break; case "MainCOPbtn_Turkey": data.add(new CopListdata("Protein-Turkey","Boneless Breast","181","5","0","32",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Turkey","Breast Steak","173","4","0","33",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Turkey","Crown","181","5","0","32",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Turkey","Diced Turkey","140","8","0","17",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Turkey","Drumstick","192","6","0","32",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Turkey","Goose or Gosling","345","25","0","29",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Turkey","Ground Turkey","140","8","0","17",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Turkey","Guinea Hen or Fowl","330","23","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Turkey","Leg","192","6","0","32",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Turkey","Minced Turkey","140","8","0","17",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Turkey","Poussin/Cornish Game Hen","240","15","0","25",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Turkey","Roaster Duckling","180","4","0","20",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Turkey","Squab","153","2","0","23",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Turkey","Tom, Turkey, Young Hen","181","5","0","32",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Turkey","Turkey Roll","173","4","0","33",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Turkey","Whole","210","6","0","36",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Turkey","Wing","234","11","0","31",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Turkey","Yearling Turkey","181","5","0","32",R.drawable.mic_done_black_24dp));

                break; case "MainCOPbtn_Veal": data.add(new CopListdata("Protein-Veal","Breast","212","7","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Veal","Chuck Shoulder Clod Roast tied","212","40","0","27",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Veal","Chuck Square Cut Neck off","212","40","0","44",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Veal","Cube Steak","212","7","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Veal","Cutlets","233","7","0","32",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Veal","Fore Shank","212","7","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Veal","Hind Shank","212","7","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Veal","Hotel Rack 7 Rib","258","16","0","21",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Veal","Leg","212","5","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Veal","Leg 3 Parts","212","5","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Veal","Leg Shank off Boneless Roast Tied","212","5","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Veal","Leg Top Round","212","7","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Veal","Loin Butt Tenderloin","238","7","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Veal","Loin Chops","245","14","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Veal","Loin Trimmed","245","14","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Veal","Loin/Strip Loin Boneless","245","14","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Veal","Osso Bucco","444","10","0","11",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Veal","Rack Ribeye","258","16","0","27",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Veal","Rib Chops","196","10","0","21",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Veal","Veal for Stewing","212","7","0","40",R.drawable.mic_done_black_24dp));

                break; case "MainCOPbtn_Venison": data.add(new CopListdata("Protein-Venison","Chop/Cutlets","179","4","0","34",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Venison","Haunch/Back Leg","179","4","0","34",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Venison","Leg, Bone In","179","4","0","34",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Venison","Loin/Loin Fillet","179","4","0","34",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Venison","Mince/Ground","179","4","0","34",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Venison","Neck","179","4","0","34",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Venison","Rack","179","4","0","34",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Venison","Saddle","179","4","0","34",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Venison","Shank","179","4","0","34",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Venison","Shoulder, Bone In","179","4","0","34",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Venison","T-Bone","179","4","0","34",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Venison","Tenderloin","179","4","0","34",R.drawable.mic_done_black_24dp));



                break; case "MainCOPbtn_Cephalopods": data.add(new CopListdata("Protein-Cephalopods"," Cuttlefish","89","1","0","18",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Cephalopods"," Nautilus","89","1","0","18",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Cephalopods"," Octopus","93","1","0","17",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Cephalopods"," Squid or Calamari","104","2","0","18",R.drawable.mic_done_black_24dp));

                break; case "MainCOPbtn_Flat Fish": data.add(new CopListdata("Protein-Flat Fish"," Dover Sole","134","4","0","25",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Flat Fish"," Fluke","160","4","0","32",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Flat Fish"," Halibut","160","4","0","32",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Flat Fish"," Turbot","155","4","0","30",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Flat Fish"," Flounder","134","4","0","25",R.drawable.mic_done_black_24dp));

                break; case "MainCOPbtn_Miscellaneous": data.add(new CopListdata("Protein-Misc"," Frogs Legs","318","4","0","9",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Misc"," Caviar/Fish Roe","284","20","5","28",R.drawable.mic_done_black_24dp));

                break; case "MainCOPbtn_Non-Bony Fish": data.add(new CopListdata("Protein-Non-Bony Fish"," Monkfish","86","2","0","16",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Non-Bony Fish"," Sharks","147","5","0","24",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Non-Bony Fish"," Skate","104","2","0","18",R.drawable.mic_done_black_24dp));

                break; case "MainCOPbtn_Poke": data.add(new CopListdata("Protein-Poke"," Halibut","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Poke"," Octopus","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Poke"," Pacific Shrimp","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Poke"," Pollack","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Poke"," Salmon","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Poke"," Scallops","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Poke"," Squid","245","7","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Poke"," Tuna Varieties","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Poke"," Ahi Tuna","","","","",R.drawable.mic_done_black_24dp));

                break; case "MainCOPbtn_Round Fish": data.add(new CopListdata("Protein-Round Fish"," Anchovy","176","8","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Barramundi","110","2","0","21",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Bass","110","2","0","21",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Black Cod/Butter Fish/Sablefish","120","4","0","27",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Black Sea Bass","110","2","0","21",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Bluefish","140","5","0","23",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Branzino","110","2","0","21",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Carp","144","6","0","20",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Catfish","173","12","0","22",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Chilean Sea Bass","110","2","0","21",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Cod","120","4","0","27",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Eel","200","6","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Grouper","113","2","0","23",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Haddock","132","4","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Mackerel","230","16","0","21",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Orange Roughy","108","4","0","21",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Patagonia Tooth Fish","110","2","0","21",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Perch","146","4","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Pike","105","2","0","22",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Pompano","238","14","0","27",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Salmon","270","19","0","32",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Shad","280","20","0","24",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Shark","147","5","0","24",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Snapper","113","2","0","23",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Striped Bass","110","2","0","21",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Sturgeon","144","6","0","20",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Swordfish","160","12","0","21",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Tilapia","143","6","0","29",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Tilefish/Gold Bass","142","6","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Tuna Ani, Yellow Fin, Blue Skipper Jack","175","4","0","34",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Walleye","105","2","0","22",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Round Fish"," Trout","186","8","0","25",R.drawable.mic_done_black_24dp));

                break; case "MainCOPbtn_Shellfish": data.add(new CopListdata("Protein-Shellfish"," Abalone","120","1","0","19",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Shellfish"," Bivalve: Two shells joined by a hinge","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Shellfish"," Clams/Cockles","144","4","0","24",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Shellfish"," Conch","120","0","0","26",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Shellfish"," Crab","135","4","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Shellfish"," Crayfish","88","1","0","18",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Shellfish"," Crustaceans: Jointed Exterior Skeletons or Shells","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Shellfish"," Langoustines","110","2","0","23",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Shellfish"," Lobster","106","2","0","24",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Shellfish"," Mussels","100","3","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Shellfish"," Oysters","135","8","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Shellfish"," Periwinkle","144","4","0","24",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Shellfish"," Pipi Clams New Zealand","144","4","0","24",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Shellfish"," Scallops","186","4","0","36",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Shellfish"," Sea Urchins","284","20","5","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Shellfish"," Shrimp","135","4","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Protein-Shellfish"," Univalves: Single Shelled","","","","",R.drawable.mic_done_black_24dp));

// Dairy and Eggs
                break; case "MainCOPbtn_Butter": data.add(new CopListdata("Dairy - Butter"," French","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Butter"," Goat","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Butter"," Indian Ghee","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Butter"," Irish","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Butter"," Locally produced","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Butter"," Salted","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Butter"," Unsalted","809","92","0","4",R.drawable.mic_done_black_24dp));

                break;

            case "MainCOPbtn_Cheese":
                data.add(new CopListdata("Dairy - Cheese","Asiago","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Beyaz Peynir","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Bleu","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Boursin","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Brie","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Caboc","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Camembert","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Cheddar","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Cheshire","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Chevre","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Cream","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Creszena","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Danish Blue","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Feta","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Fromage Frais","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Gjetost","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Gorgonzola","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Gouda","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Gruyere","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Halloumi","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Innes Button","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Labane","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Manchego","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Mascarpone","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Maytag","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Monterey Jack","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Mozzarella Di Bufala","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Munster","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Pan Ys Gawn","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Paneer","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Parmesan","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Pecorino","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Provolone","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Queso Blanco","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Ricotta","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Rogue River","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Romano","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Roquefort","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Stilton","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Sussex Slipcote","455","37","0","28",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Cheese","Tupi","455","37","0","28",R.drawable.mic_done_black_24dp));


                break; case "MainCOPbtn_Eggs": data.add(new CopListdata("Dairy - Egg"," Buffalo","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Egg"," Buttermilk","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Egg"," Clotted","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Egg"," Condensed","176","12","0","15",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Egg"," Cow","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Egg"," Cream","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Egg"," Crème Fraiche","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Egg"," Duck","","","","",R.drawable.mic_done_black_24dp));
                break; case "MainCOPbtn_Milk": data.add(new CopListdata("Dairy - Milk"," Evaporated","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Milk"," Goat","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Milk"," Goose","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Milk"," Gull","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Milk"," Heavy","60","5","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Milk"," Hen","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Milk"," Jersey","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Milk"," Light","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Milk"," Ostrich","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Milk"," Quail","413","44","0","3",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Milk"," Reduced","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Milk"," Salted","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Milk"," Sheep","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Milk"," Skim","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Milk"," Sour","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Milk"," Swedish","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Milk"," Thousand Year","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Milk"," Whipping","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Milk"," Whole Cow","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Milk"," Ymer","","","","",R.drawable.mic_done_black_24dp));

                break; case "MainCOPbtn_Yogurt": data.add(new CopListdata("Dairy - Yogurt"," Cow","68","4","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Yogurt"," Goat","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Yogurt"," Kashk","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Yogurt"," Sheep","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Dairy - Yogurt"," Skyr","","","","",R.drawable.mic_done_black_24dp));
                break;


            case "MainCOPbtn_Artichoke":
                data.add(new CopListdata("Vegetables - Artichoke","Baby Purple","4","72","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Artichoke","Benicarlo","4","72","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Artichoke","Green Globe","4","72","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Artichoke","Violetta Di Chioggia","4","72","0","14",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Asparagus":
                data.add(new CopListdata("Vegetables - Asparagus","Green","3","32","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Asparagus","Purple","3","32","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Asparagus","Spruce","3","32","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Asparagus","Wine","3","32","0","5",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Avocados":
                data.add(new CopListdata("Vegetables - Avocados","Fuerte","2","29","17","10",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Avocados","Hass","2","29","17","10",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Avocados","Sharwill","2","29","17","10",R.drawable.mic_done_black_24dp));

                break;
            case "MainCOPbtn_Bean Sprouts":
                data.add(new CopListdata("Vegetables - Bean Sprouts","Adzuki","3","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bean Sprouts","Alfalfa","3","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bean Sprouts","Broccoli","3","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bean Sprouts","Daikon Radish","3","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bean Sprouts","Fenugreek","3","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bean Sprouts","French Lentil","3","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bean Sprouts","Garbonzo","3","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bean Sprouts","Green Pea","3","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bean Sprouts","Hard Wheat","3","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bean Sprouts","Mung","3","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bean Sprouts","Red Clover","3","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bean Sprouts","Soy","3","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bean Sprouts","Sunflower","3","24","0","5",R.drawable.mic_done_black_24dp));
                break; case
                    "MainCOPbtn_Beans-Edible":
                data.add(new CopListdata("Vegetables - Beans-Edible","Chinese Yard Long","2","48","0","10",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Beans-Edible","Edamame","2","48","0","10",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Beans-Edible","Haricot Vert","2","48","0","10",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Beans-Edible","Petite Pois","2","48","0","10",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Beans-Edible","Pod Green/Garden","2","48","0","10",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Beans-Edible","Purple","2","48","0","10",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Beans-Edible","Purple Haricot","2","48","0","10",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Beans-Edible","Snow","2","48","0","10",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Beans-Edible","String","2","48","0","10",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Beans-Edible","Sugar Snap","2","48","0","10",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Beans-Edible","Wax","2","48","0","10",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Beans-Edible","White Flat","2","48","0","10",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Beans-Edible","Winged","2","48","0","10",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Beans-Edible","Yellow Wax","2","48","0","10",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Beans-Inedible":
                data.add(new CopListdata("Vegetables - Beans-Inedible","Edamame","9","124","0","23",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Beans-Inedible","Lima","9","124","0","23",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Beans-Inedible","Pod Fava","9","124","0","23",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Beet":
                data.add(new CopListdata("Vegetables - Beet","Beet Greens","1","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Beet","Elongated","1","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Beet","Purple/Red","1","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Beet","Striped","1","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Beet","Yellow","1","24","0","5",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Bell Pepper":
                data.add(new CopListdata("Vegetables - Bell Pepper","Anaheim","1","28","0","6",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bell Pepper","Blushing","1","28","0","6",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bell Pepper","Green, Red","1","28","0","6",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bell Pepper","Italian Sweet","1","28","0","6",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bell Pepper","Pepperoncino","1","28","0","6",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bell Pepper","Pimento","1","28","0","6",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bell Pepper","Purple","1","28","0","6",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bell Pepper","Spanish Dried Red","1","28","0","6",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bell Pepper","White","1","28","0","6",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bell Pepper","Yellow","1","28","0","6",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Bell Pepper","Yellow Wax","1","28","0","6",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Broccoli":
                data.add(new CopListdata("Vegetables - Broccoli","Broccoli Rabe","3","40","0","7",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Broccoli","Chinese","3","40","0","7",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Broccoli","Green","3","40","0","7",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Broccoli","Purple","3","40","0","7",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Broccoli","Purple Sprouting","3","40","0","7",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Cabbage":
                data.add(new CopListdata("Vegetables - Cabbage","Brussel Sprouts","1","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Cabbage","Celery","1","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Cabbage","Flat","1","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Cabbage","Green","1","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Cabbage","Napa","1","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Cabbage","Red","1","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Cabbage","Round","1","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Cabbage","Savoy","1","24","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Cabbage","White","1","24","0","5",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Carrot":

                data.add(new CopListdata("Vegetables - Carrot","Chantenay","1","48","0","11",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Carrot","Imperator","1","48","0","11",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Carrot","Little Finger","1","48","0","11",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Carrot","Nantes","1","48","0","11",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Carrot","Orange/California","1","48","0","11",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Carrot","Purple","1","48","0","11",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Carrot","Red","1","48","0","11",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Carrot","Yellow","1","48","0","11",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Cauliflower":
                data.add(new CopListdata("Vegetables - Cauliflower","Baby","2","28","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Cauliflower","Common White","2","28","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Cauliflower","Purple","2","28","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Cauliflower","Romanesco","2","28","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Cauliflower","Yellow","2","28","0","5",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Chili Peppers Fresh And Dry \n 9Listed In Order of Scoville Units":
                data.add(new CopListdata("Chili Peppers - ","SHU:   0  Sweet Bell Pepper","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   500  Cherry","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   500  Pimento","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   500  Trinidad Perfume","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   600  Sonora Anaheim","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   700  Santa Fe Grande","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   750  New Mexican R Naky","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   900  Banana","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   900  Pepperoncini","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   1000  Coronado","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   1000  Cubanelle","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   1000  Paprika","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   1177  Peppadew/Picuante","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   1500  Aji Panca","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   2000  Ancho","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   2000  Chilaca","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   2000  Espanola","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   2000  Pasilla","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   2000  Poblano","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   2500  Anaheim","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   2500  Rocotill","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   4000  Cascabell","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   5000  Purple Jalapeno","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   6000  Chimayo","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   6000  Hatch","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   7000  Sandia","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   8000  Chipotle","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   8000  Guajillo","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   10000  Fresno","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   10000  Hungarian Wax","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   10000  Jalapeno","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   10000  Morita","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   10000  Puya","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   17000  Hidalgo","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   23000  Aleppo","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   23000  Serrano","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   30000  Baker’s Hot Chili","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   30000  Bishop’s Crown","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   30000  Chili De A’arbol","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   30000  Jwala Finger","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   30000  Lemon Drop Chili","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   30000  Peter Pepper","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   30000  Shipkas","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   40000  Guntur Sannam","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   50000  Aji Amarillo","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   50000  Aji Limo","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   50000  Bolivian Rainbow","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   50000  Cheyenne","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   50000  Tabasco","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   65000  Dandicut","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   75000  Red Amazon","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   75000  Tien Tsin","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   75000  Yatsafusa","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   100000  Charleston Hot","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   100000  Chili Pequin","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   100000  Chiltepin","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   100000  Diablo Grande","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   100000  Malagueta","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   100000  Thai Chili","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   110000  Bahamian","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   125000  Carolina Cayenne","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   125000  Tabiche","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   175000  African Bird’s Eye","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   225000  Birdseye","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   300000  Devil’s Tongue","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   348634  Tiger Paw – South Carolina","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   350000  Chocolate Habanero","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   350000  Datil","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   350000  Habanero","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   350000  Jamaican Hot","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   350000  Madame Jeanette","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   350000  Scotch Bonnet","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   500000  Fatalii","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   580000  Red Savina Habanero","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   650000  New Mexican Xx","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   1000000  Seven Pot Chili","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   1000000  Trinidad Scorpion","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   1041427  Bhut Jolokia/Ghost","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   1086844  Gibralta-Spanish Naga","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   1100000  Dorset Naga Chili","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   1100000  Naga Jolokia","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   1169058  Chocolate Seven Chili","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   1176182  Infinity Chili","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   1191595  New Mexico Scorpion","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   1382118  Naga Viper","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   1463700  Trinidad Scorpion Butch T","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   2009231  Trinidad Moruga Scorpion","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Chili Peppers - ","SHU:   2200000  Carolina Reaper","","","","",R.drawable.mic_done_black_24dp));


                break; case "MainCOPbtn_Corn": data.add(new CopListdata("Vegetables - Corn","Baby","4","121","1","24",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Corn","Bicolor","4","121","1","24",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Corn","White","4","121","1","24",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Corn","Yellow","4","121","1","24",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Cucumber":
                data.add(new CopListdata("Vegetables - Cucumber","Adzuki","0","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Cucumber","Armenian","0","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Cucumber","Burpless","0","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Cucumber","Carosello Barese","0","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Cucumber","English","0","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Cucumber","Garden","0","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Cucumber","Lebanese","0","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Cucumber","Pickling","15","207","0","40",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Dried Beans/Peas/Lentils/Flageolet":
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","Baby Lima","15","207","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","Black Eyed Peas","15","207","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","Black Turtle","15","207","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","Brown Lentil","15","207","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","Cannellini","15","207","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","Castelluccio Lentil","15","207","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","Cranberries","15","207","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","Egyptian Brown","15","207","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","European Soldier","15","207","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","Fava","15","207","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","French Green Lentil","15","207","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","Garbanzo","15","207","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","Lima","15","207","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","Mung","15","207","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","Pigeon Pea","15","207","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","Pinto","15","207","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","Red Kidney","15","207","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","Soybeans","15","207","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","Spanish Pardina Lentil","15","207","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","Split Peas","15","207","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Dried Beans/Peas/Lentils/Flageolet","Split Red Lentil","15","207","0","40",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Eggplant":
                data.add(new CopListdata("Vegetables - Eggplant","East Asian Purple","1","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Eggplant","Italian Long White","1","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Eggplant","Italian Round","1","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Eggplant","Italian Striped","1","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Eggplant","Oval Purple","1","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Eggplant","Round Green","1","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Eggplant","Thai Green","1","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Eggplant","Thai Long Green","1","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Eggplant","Thai Pea","1","48","0","12",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Fennel":
                data.add(new CopListdata("Vegetables - Fennel","Baby","2","180","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Fennel","Florence","2","180","0","4",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Garlic":
                data.add(new CopListdata("Vegetables - Garlic","Elephant","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Garlic","Gilroy","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Garlic","Green","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Garlic","Hard Neck","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Garlic","Soft Neck","1","64","0","14",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Kale":
                data.add(new CopListdata("Vegetables - Kale","Curly","2","24","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Kale","Red","2","24","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Kale","Tuscan Black","2","24","0","4",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Kohlrabi":
                data.add(new CopListdata("Vegetables - Kohlrabi","Purple","0","18","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Kohlrabi","White","0","18","0","4",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Leafy Greens":
                data.add(new CopListdata("Vegetables - Leafy Greens","Arugula","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Belgium Endive","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Bok Choy","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Borage","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Chard","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Chicory/Endive","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Chinese Flat Cabbage","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Chinese Spinach","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Choi Sum","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Collards","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Colored Chard","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Dandelion","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Edible Chrysanthemum","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Escarole","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Frisee","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Japanese Mustard Spinach","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Mizuna","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Mustard","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Nettles","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Radicchio","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Radicchio Rosso","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Red Chicory","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Red Flecked Chicory","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Spinach","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Swiss Chard","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Treviso","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Leafy Greens","Water Spinach","0","6","0","2",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Legume and Seed Shoots":
                data.add(new CopListdata("Vegetables - Legume and Seed Shoots","Adzuki","9","124","0","23",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Legume and Seed Shoots","Alfalfa","9","124","0","23",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Legume and Seed Shoots","Garbanzo","9","124","0","23",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Legume and Seed Shoots","Lentil","9","124","0","23",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Legume and Seed Shoots","Mung Beans","9","124","0","23",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Legume and Seed Shoots","Peas","9","124","0","23",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Legume and Seed Shoots","Soybeans","9","124","0","23",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Legume and Seed Shoots","Wheat Grass","9","124","0","23",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Lettuce":
                data.add(new CopListdata("Vegetables - Lettuce","Boston Bib","0","10","0","1",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Lettuce","Iceberg","0","10","0","1",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Lettuce","Lamb’s Lettuce","0","10","0","1",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Lettuce","Lollorosso","0","10","0","1",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Lettuce","Purslane","0","10","0","1",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Lettuce","Red Oak","0","10","0","1",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Lettuce","Romaine","0","10","0","1",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Lettuce","Watercress","0","10","0","1",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Microgreens":
                data.add(new CopListdata("Vegetables - Microgreens","Amaranth","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Microgreens","Arugula","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Microgreens","Basil","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Microgreens","Beet","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Microgreens","Broccoli","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Microgreens","Chervil","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Microgreens","Cilantro","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Microgreens","Fennel","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Microgreens","Kohlrabi","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Microgreens","Mizuna","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Microgreens","Mustard","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Microgreens","Parsley","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Microgreens","Radish","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Mushrooms":
                data.add(new CopListdata("Vegetables - Mushrooms","Bay Boleta","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Black Trumpet","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Boletus","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Buna","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Button","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Cepe","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Chanterelle","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Cloud Ears","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Crimini","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Enoki","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Field","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Flat White","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Hedgehog","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Maitake/Hen of The Woods","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Matsutake/Pine Mushroom","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Morel","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Nameko","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Oyster","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Porcini","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Portobello","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Saffron Milk Cap","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Shiitake","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","St. George","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Straw","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Truffle White and Black","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Mushrooms","Wood Ear","2","16","0","2",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Onion":
                data.add(new CopListdata("Vegetables - Onion","Baby Leek","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Onion","Banana Shallot","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Onion","Bermuda","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Onion","Calcot","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Onion","French Gray Shallot","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Onion","Green","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Onion","Lampascioni Italian Shallot","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Onion","Leek","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Onion","Pearl Cocktail","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Onion","Ramp","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Onion","Ramson","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Onion","Red","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Onion","Scallion","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Onion","Shallot","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Onion","Spanish","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Onion","Spring","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Onion","Sweet Red","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Onion","Torpedo","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Onion","Tree","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Onion","White","1","64","0","14",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Onion","Yellow","1","64","0","14",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Peas-Edible":
                data.add(new CopListdata("Vegetables - Peas-Edible","Pod","4","48","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Peas-Edible","Snap","4","48","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Peas-Edible","Snow","4","48","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Peas-Edible","Sugar","4","48","0","8",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Peas-Inedible":
                data.add(new CopListdata("Vegetables - Peas-Inedible","Garden","4","48","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Peas-Inedible","Petite Peas","4","48","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Peas-Inedible","Pod Green","4","48","0","8",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Radishes":
                data.add(new CopListdata("Vegetables - Radishes","Cherry","0","18","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Radishes","Chinese","0","18","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Radishes","French Breakfast","0","18","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Radishes","Red Icicle","0","18","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Radishes","White Icicle","0","18","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Radishes","Winter","0","18","0","4",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Roots and Tubers":
                data.add(new CopListdata("Vegetables - Roots and Tubers","Beets","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Boniato","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Burdock","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Carrots","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Cassava","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Celery Root","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Daikon","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Ginger","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Horseradish","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Jerusalem Artichoke","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Jicama","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Kohlrabi","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Lotus","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Parsnip","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Radish","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Rutabaga","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Salsify","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Sweet Potato","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Taro","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Turmeric","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Turnip","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Water Chestnut","0","8","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Roots and Tubers","Yams","0","8","0","4",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Sea Vegetables":
                data.add(new CopListdata("Vegetables - Sea Vegetables","Agar-Agar","0","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Sea Vegetables","Arame","0","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Sea Vegetables","Bladderwack","0","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Sea Vegetables","Dulse","0","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Sea Vegetables","Hijki","0","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Sea Vegetables","Kelp","0","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Sea Vegetables","Marshsamphire","0","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Sea Vegetables","Nori","0","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Sea Vegetables","Sea Lettuce","0","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Sea Vegetables","Wakame","0","48","0","12",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Shoots and Stems":
                data.add(new CopListdata("Vegetables - Shoots and Stems","Artichokes","3","32","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Shoots and Stems","Asparagus","3","32","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Shoots and Stems","Bamboo","3","32","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Shoots and Stems","Cactus Leaves","3","32","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Shoots and Stems","Cardoon","3","32","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Shoots and Stems","Celery","3","32","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Shoots and Stems","Fennel","3","32","0","5",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Shoots and Stems","Hearts of Palm","3","32","0","5",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Spinach":
                data.add(new CopListdata("Vegetables - Spinach","Bok Choy","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Spinach","Chinese","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Spinach","Flat","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Spinach","Japanese Mustard","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Spinach","Savoy","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Spinach","Semi-Savoy","0","6","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Spinach","Water","0","6","0","2",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Summer Squash":
                data.add(new CopListdata("Vegetables - Summer Squash","Cocozelle","2","18","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Summer Squash","Crookneck","2","18","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Summer Squash","Round","2","18","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Summer Squash","Tondo Di Nizza","2","18","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Summer Squash","Yellow Patty Pan","2","18","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Summer Squash","Yellow Zucchini","2","18","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Summer Squash","Zucchini","2","18","0","4",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Sweet Potatoes":
                data.add(new CopListdata("Vegetables - Sweet Potatoes","Boniato","2","114","0","26",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Sweet Potatoes","Jewel","2","114","0","26",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Sweet Potatoes","New Zealand Kumara","2","114","0","26",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Sweet Potatoes","White","2","114","0","26",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Tomato":
                data.add(new CopListdata("Vegetables - Tomato","Beefsteak","2","32","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Tomato","Black Cherry","2","32","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Tomato","Brandywine","2","32","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Tomato","Cherry","2","32","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Tomato","Costoluto Florentino","2","32","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Tomato","Cour Di Blue","2","32","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Tomato","Evergreen","2","32","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Tomato","Grape Costoluto Florentine","2","32","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Tomato","Green","2","32","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Tomato","Honeymaker","2","32","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Tomato","Montsterrat","2","32","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Tomato","Pantano Romanesco","2","32","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Tomato","Plum","2","32","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Tomato","Red","2","32","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Tomato","Sungold","2","32","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Tomato","Yellow","2","32","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Tomato","Yellow Pear","2","32","0","8",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Truffles":
                data.add(new CopListdata("Vegetables - Truffles","Alba","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Truffles","Black","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Truffles","Perigord","2","16","0","2",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Truffles","White","2","16","0","2",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Turnip":
                data.add(new CopListdata("Vegetables - Turnip","Purple","0","18","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Turnip","White","0","18","0","4",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Winter Squash":
                data.add(new CopListdata("Vegetables - Winter Squash","Acorn","2","30","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Winter Squash","Bitter Melon","2","30","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Winter Squash","Butternut","2","30","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Winter Squash","Calabash","2","30","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Winter Squash","Chayote","2","30","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Winter Squash","Crown Prince","2","30","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Winter Squash","Delicata","2","30","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Winter Squash","Gourds","2","30","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Winter Squash","Hubbard","2","30","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Winter Squash","Jack Be Little","2","30","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Winter Squash","Kaboucha","2","30","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Winter Squash","Pumpkin","2","30","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Winter Squash","Red Kuri","2","30","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Winter Squash","Spaghetti","2","30","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Winter Squash","Turban","2","30","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Winter Squash","Vegetable Marrow","2","30","0","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Vegetables - Winter Squash","Winter Melon","2","30","0","8",R.drawable.mic_done_black_24dp));
// Fruit subs
            case "MainCOPbtn_Apples":
                data.add(new CopListdata("Fruit - Apples","Braeburn","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Apples","Fuji","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Apples","Granny Smith","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Apples","Honey Crisp","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Apples","Jonathan","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Apples","Red","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Apples","Yellow","0","0","0","",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Apricots":
                data.add(new CopListdata("Fruit - Apricots","Gold Strike","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Apricots","Patterson","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Apricots","Royal Blenheim","0","0","0","",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Banana":
                data.add(new CopListdata("Fruit - Banana","Red Banana","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Banana","Lady Finger Banana","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Banana","Plantain Banana","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Banana","Yellow Banana","0","0","0","",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Berries":
                data.add(new CopListdata("Fruit- Berries"," Blueberry","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit- Berries"," Cloud Berry","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit- Berries"," Cranberry","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit- Berries"," Gooseberry","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit- Berries"," Mulberry","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit- Berries"," Raspberry","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit- Berries"," Strawberry","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit- Berries","Blackberry","0","0","0","",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Cherries":
                data.add(new CopListdata("Fruit - Cherries","Barbados Cherries","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Cherries","Montmorency Cherries","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Cherries","Morella Cherries","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Cherries","Rainier Cherries","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Cherries","Stella Cherries","0","0","0","",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Dates":
                data.add(new CopListdata("Fruit - Dates","Barhi","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Dates","Deglet","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Dates","Medjool","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Dates","Noor","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Dates","Thoory","0","0","0","",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Figs":
                data.add(new CopListdata("Fruit - Figs","Black","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Figs","Brown","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Figs","Mission","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Figs","Turkey","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Figs","White","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Figs","Yellow","0","0","0","",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Grapefruit":
                data.add(new CopListdata("Fruit - Grapefruit","Pink","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Grapefruit","Red","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Grapefruit","White","0","0","0","",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Grapes":
                data.add(new CopListdata("Fruit - Grapes","Concord","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Grapes","Merlot","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Grapes","Muscat","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Grapes","Sauvignon","0","0","0","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Grapes","Syrah","0","0","0","",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Kiwi":
                data.add(new CopListdata("Fruit - Kiwi","Fuzzy Hayward","","0","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Kiwi","Zespri Gold","0","0","0","",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Lemons": data.add(new CopListdata("Fruit - Lemons","Amalfi","0","16","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Lemons","Citron","0","16","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Lemons","Eureka","0","16","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Lemons","Femminello","0","16","0","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Lemons","Meyer","0","16","0","4",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Limes":
                data.add(new CopListdata("Fruit - Limes","Finger","0","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Limes","Key","0","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Limes","Tahiti","0","48","0","12",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Melons":
                data.add(new CopListdata("Fruit - Melons","Ambrosia","1","40","0","9",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Melons","Canary","1","40","0","9",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Melons","Cantaloupe","1","40","0","9",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Melons","Casaba","1","40","0","9",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Melons","Charentals/Tuscan","1","40","0","9",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Melons","Crenshaw","1","40","0","9",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Melons","Galia","1","40","0","9",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Melons","Honeydew","1","40","0","9",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Melons","Ogen","1","40","0","9",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Melons","Persian","1","40","0","9",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Melons","Santa Claus","1","40","0","9",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Melons","Watermelon","1","40","0","9",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Mango":
                data.add(new CopListdata("Fruit - Mango","Ataulfo","0","80","0","20",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Mango","Kensington Pride","0","80","0","20",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Mango","Kent","0","80","0","20",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Olives":
                data.add(new CopListdata("Fruit - Olives","Etc","1.5","164","18","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Olives","Kalamata","1.5","164","18","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Olives","Manzanilla","1.5","164","18","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Olives","Nicoise","1.5","164","18","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Olives","Picholine","1.5","164","18","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Olives","Stuffed","1.5","164","18","4",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Olives","Tagglasca","1.5","164","18","4",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Oranges":
                data.add(new CopListdata("Fruit - Oranges","Bitter","1","48","0","11",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Oranges","Blood","1","48","0","11",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Oranges","Clementine","1","48","0","11",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Oranges","Jaffa","1","48","0","11",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Oranges","Navel","1","48","0","11",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Oranges","Valencia","1","48","0","11",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Peaches":
                data.add(new CopListdata("Fruit - Peaches","Arctic Gio","1","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Peaches","Babcock","1","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Peaches","Calanda","1","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Peaches","Donut","1","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Peaches","Red Haven","1","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Peaches","Rich Lady","1","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Peaches","Snow Pearl","1","48","0","12",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Peaches","White","1","48","0","12",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Pineapple":
                data.add(new CopListdata("Fruit - Pineapple","Baby","1","64","0","16", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Pineapple","Hawaiian Gold","1","64","0","16",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Pineapple","Pacific Red","1","64","0","16",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Pears":
                data.add(new CopListdata("Fruit - Pears","Anjou","1","64","0","16",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Pears","Asian","1","64","0","16",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Pears","Bosc","1","64","0","16",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Pears","Red","1","64","0","16",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Persimmon":
                data.add(new CopListdata("Fruit - Persimmon","Fuyu","1","102","0","25",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Persimmon","Hachlya","1","102","0","25",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Persimmon","Rojo Brilliante","1","102","0","25",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Persimmon","Sharon","1","102","0","25",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Plums":
                data.add(new CopListdata("Fruit - Plums","Flavor Queen","1","56","0","13",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Plums","Greengage","1","56","0","13",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Plums","Mirabelle","1","56","0","13",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Plums","Santa Rosa","1","56","0","13",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Plums","Victoria","1","56","0","13",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Rhubarb":
                data.add(new CopListdata("Fruit - Rhubarb","Canada Red","1","29","0","7",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Rhubarb","Cherry Red","1","29","0","7",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Watermelon":
                data.add(new CopListdata("Fruit - Watermelon","Seedless","1","48","0","11",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Fruit - Watermelon","Sugar Baby","1","48","0","11",R.drawable.mic_done_black_24dp));
                break;


            case "MainCOPbtn_Asian Style Noodles":
                data.add(new CopListdata("Starches and Grains - Asian Style Noodles","Cellophane/Mung Bean","0","192","0","43",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Starches and Grains - Asian Style Noodles","Chinese Egg","0","192","0","43",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Starches and Grains - Asian Style Noodles","Chow Mein","0","192","0","43",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Starches and Grains - Asian Style Noodles","Lo Mein","0","192","0","43",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Starches and Grains - Asian Style Noodles","Ramen","0","192","0","43",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Starches and Grains - Asian Style Noodles","Rice Noodles","0","192","0","43",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Starches and Grains - Asian Style Noodles","Rice Stick","0","192","0","43",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Starches and Grains - Asian Style Noodles","Soba","0","192","0","43",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Starches and Grains - Asian Style Noodles","Somen","0","192","0","43",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Starches and Grains - Asian Style Noodles","Udon","0","192","0","43",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Starches and Grains - Asian Style Noodles","Won Ton","0","192","0","43",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Starches and Grains - Asian Style Noodles","Yakisoba","0","192","0","43",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Bean Products":
                data.add(new CopListdata(" Starches and Grains - Bean Product","Miso","0","223","0.5","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bean Product","Soy Bean Paste","0","223","0.5","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bean Product","Sweet Red Bean Paste","0","223","0.5","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bean Product","Tofu","0","223","0.5","41",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Beans": data.add(new CopListdata(" Starches and Grains - Bean","Adzuki","0","223","0.5","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bean","Black","0","223","0.5","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bean","Black Eyed","0","223","0.5","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bean","Cannellini","0","223","0.5","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bean","Chick Pea","0","223","0.5","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bean","Fava","0","223","0.5","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bean","Flageolet","0","223","0.5","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bean","Kidney","0","223","0.5","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bean","Lima","0","223","0.5","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bean","Mung","0","223","0.5","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bean","Navy","0","223","0.5","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bean","Pea","0","223","0.5","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bean","Pigeon Pea","0","223","0.5","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bean","Pinto","0","223","0.5","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bean","Soissons","0","223","0.5","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bean","Soy","0","223","0.5","41",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Bread":
                data.add(new CopListdata(" Starches and Grains - Bread","Arepa","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Baba","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Bagel","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Baguette","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Bammy","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Bannock","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Beer Bread","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Biscuit","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Borlengo","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Boule","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Brioche","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Brown Bread","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Canadian White","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Challah","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Chickpea","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Ciabatta","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Corn Bread","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Cracker","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Crepe","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Crumpet","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Cuban","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Curry","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","English Muffin","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Flatbread","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Focaccia","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Green Onion Pancake","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Hardtack","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Matzo","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Milk Toast","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Multi Grain","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Naan","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Pancake","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Panettone","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Papadom","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Pita","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Pizza","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Potato","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Potato Pancake","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Pretzel","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Pumpernickel","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Quick Bread","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Rice Bread","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Roti","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Rye Bread","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Scone","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Soda Bread","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Spelt Bread","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Texas Toast","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Tortilla","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Vienna","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","White","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Whole Wheat","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Bread","Zwieback","0","160","2","8",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Buns":
                data.add(new CopListdata(" Starches and Grains -Buns","Bao","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains -Buns","Cheese","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains -Buns","Cinnamon","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains -Buns","Hamburger","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains -Buns","Hawaiian","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains -Buns","Honey","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains -Buns","Hot Cross","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains -Buns","Hot Dog","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains -Buns","London","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains -Buns","Mandarin","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains -Buns","Peanut Butter","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains -Buns","Pineapple","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains -Buns","Saffron","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains -Buns","Sausage","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains -Buns","Spiced","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains -Buns","Sticky Cocktail","0","160","2","8",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Corn ":
                data.add(new CopListdata(" Starches and Grains -Corn","Grits","","","1","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains -Corn","Hominy","","250","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains -Corn","Masa Harina","0","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains -Corn","Meal","","","","56",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Flatbread": data.add(new CopListdata(" Starches and Grains - Flatbread","Afghan (Nan)(Afganistan)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Aish Merahrah (Egypt)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Arepa (Colombia, Venezuela)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Bammy (Jamaica)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Bánh (Vietnam)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Bannock (Scotland)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Barbari (Iran)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Barbari (Persia)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Bazlama (Turkey)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Beiju (Brazil)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Bhakri (Indian subcontinent)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Bhatura (Indian subcontinent)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Bindaeddeok (Korea)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Bing (China)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Bolani (Afghanistan)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Bolo do caco (Madeira, Portugal)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Casabe (South America, Caribbean)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Chapati (Indian subcontinent)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Chapati (Swahili coast, Uganda)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Cheese Naan (Pakistan)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Farl (Ireland and Scotland)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Flammkuchen/Tarte flamb (Alsace)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Flatbrød (Norway)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Flatkaka (Iceland)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Focaccia (Italy)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Frybread (United States)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Ftira (Malta)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Gözleme (Turkey)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Green onion pancake (China)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Gurassa (Sudan)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Harsha (Morocco)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Hoggan (Cornwall)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Injera (Horn of Africa)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Johnnycake (Caribbean)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Kaak (Pakistan)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Khanom buang (Thailand)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Khebz (Levant)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Khobz rmal (Maghreb)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Khubz (Arabian Peninsula)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Khubz al-nokhalah (Saudi Arabia)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Khubz Asmr (Saudi Arabia)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Khubz Burr (Saudi Arabia)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Lagana (Greece)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Lahoh (Northern Somalia, Djibouti, Yemen)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Laobing (China)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Lavash (Armenia)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Lefse (Norway)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Lepyoshka (Russia)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Luchi (Indian subcontinent)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Malooga (Yemen)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Manoushe (Lebanon)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Markook (Levant)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Matnakash (Armenia)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Matzo (Israel)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","M'lawi (Tunisia)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Murr (Israel)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Muufo (Somalia)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Naan (Indian subcontinent and Central Asia)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Native American Flatbread (North America)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Ngome (Mali)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Nutella Naan/Paratha (Pakistan)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Obi Non (Afghanistan and Uzbekistan)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Opłatek (Poland)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Pan de Semita (Mexico)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Pane carasau (Sardinia)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Paratha (Indian subcontinent)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Pathiri (Indian subcontinent)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Phulka (Indian subcontinent)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Piadina (Italy)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Piaya (Philippines)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Pide (Turkey)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Pissaladière (France)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Pita (Eastern Mediterranean and Middle East)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Pita (Greece)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Pita (Hungary)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Pită/Lipie (Romania)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Pizza (Italy)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Podpłomyk (Poland)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Pogača (Balkans and Turkey)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Pol roti (Sri Lanka)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Poli (Indian subcontinent)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Puri (Indian subcontinent)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Rieska (Finland)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Roast paan (Sri Lanka)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Roti (Indian subcontinent)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Roti canai (Malaysia and Indonesia)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Roti prata (Singapore)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Sacramental bread (Europe)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Sanchuisanda (China)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Sangak (Iran)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Sangak (Persia)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Sheermal (Persia and Indian subcontinent)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Shelpek (Central Asia)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Shotis Puri (Georgia)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Somun and Lepina (Bosnia and Herzegovina)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Spianata sarda (Sardinia)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Staffordshire oatcake (England)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Taftan (Iran)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Taftoon Bread (Persia)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Tandoor-nan (Central Asia)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Tigella (Italy)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Tonis Puri (Georgia)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Torta (Spain)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Torta al testo (Umbria, Italy)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Torta de Gazpacho (Spain)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Tortilla (Mexico, Central and South America)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Tortilla de Rescoldo (Chile)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Tunnbröd (Sweden)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Yufka (Turkey)","0","160","2","8",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flatbread","Пърленка (Părlenka) (Bulgaria)","0","160","2","8",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Flour": data.add(new CopListdata(" Starches and Grains - Flour","All Purpose","0","202","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","Bran","0","202","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","Bread","0","202","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","Bulgar","0","202","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","Cake","0","202","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","Cracked Wheat","0","202","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","Durum","0","202","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","Farina","0","202","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","Gluten","0","202","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","Graham","0","202","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","Mushroom","0","202","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","Nut","0","202","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","Pastry","0","202","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","Rice","0","202","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","Rolled Wheat","0","202","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","Self-Rising","0","202","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","Semolina","0","202","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","Stone Ground","0","202","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","Wheat Germ","0","202","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","Whole Wheat","0","202","0","40",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","MainCOPbtn_Modified Food Starch","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Flour","Masa Harina","","","0","0",R.drawable.mic_done_black_24dp));
                break;



            case "MainCOPbtn_Pasta":
                data.add(new CopListdata(" Starches and Grains - Pasta","Rings","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Vermicelli","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Calzoncelli","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Cannelloni","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Capellini","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Cappelletti","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Cavatappi","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Cellophane","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Conchiglie","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Cocks Combs","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Ditalini","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Dumplings","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Egg Flakes","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Egg Noodles","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Elbow Macaroni","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Farfalle","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Fettuccine","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Fiachetti/Bows","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Fusilli","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Gnocchi","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Lasagna","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Linguine","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Macaroni","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Mafalde","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Manicotti","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Mostaccioli","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Orechiette","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Orzo","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Pastina","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Penne","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Ramen","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Rice Noodles","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Rigatoni","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Rotelle","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Ruote","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Soba","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Somen","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Spaetzle","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Spaghetti","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Tagliatelli","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Tortellini","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Triangoli","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Troffie","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Tubetti Lunghi","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Udon","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Ziti","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Agnolotti","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Ravioli","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Panzaotti","7","200","1","41",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Pasta","Yakisoba","7","200","1","41",R.drawable.mic_done_black_24dp));
                break;
            case "MainCOPbtn_Potatoes":
                data.add(new CopListdata(" Starches and Grains - Potatoes","Anya","0","58.1","0.1","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Bamberger","0","58.2","0.2","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Charlotte","0","58.3","0.3","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Congo Blue","0","58.4","0.4","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Desiree","0","58.5","0.5","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Edzell Blue","0","58.6","0.6","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Fingerling","0","58.7","0.7","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","French Fingerling","0","58.8","0.8","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","International Kidney","0","58.9","0.9","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Kennebec","0","58.11","0.11","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","King Edward","0","58.12","0.12","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Laratte","0","58.13","0.13","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Linda","0","58.14","0.14","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Marfona","0","58.15","0.15","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Maris Piper","0","58.16","0.16","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Nicola","0","58.17","0.17","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Peruvian Purple","0","58.18","0.18","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Pink Roseval","0","58.19","0.19","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Primura","0","58.2","0.2","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Red","0","58.21","0.21","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Red Duke Of York","0","58.22","0.22","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Red Lasoda","0","58.23","0.23","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Rooster","0","58.24","0.24","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Russet","0","58.25","0.25","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Vitelotte Noire","0","58.26","0.26","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Vivaldi","0","58.27","0.27","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","White","0","58.1","0.1","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Potatoes","Yukon Gold","0","58","0","",R.drawable.mic_done_black_24dp));
                break;

            case "MainCOPbtn_Rice":
                data.add(new CopListdata(" Starches and Grains - Rice","Basmati","0","228","0","50",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Rice","Brown","0","228","0","50",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Rice","Converted","0","228","0","50",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Rice","Glutinous","0","228","0","50",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Rice","Italian","0","228","0","50",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Rice","Jasmine","0","228","0","50",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Rice","Purple Basmati","0","228","0","50",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Rice","Risotto/Superfino","0","228","0","50",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Rice","Short Grain","0","228","0","50",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata(" Starches and Grains - Rice","White","0","228","0","50",R.drawable.mic_done_black_24dp));
                break;

            case "Nuts":
            data.add(new CopListdata("Nuts","*** Nuts and Seeds ***","","","","", R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Almonds","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Brazil Nuts","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Candlenuts","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Cashews","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Chestnuts","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Chocolate","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Coconuts","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Gingko Nuts","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Hazelnut","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Linseed","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Lotus Nuts","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Lupin Seeds","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Macadamias","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Peanuts","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Pecans","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Pine Nuts","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Pistachios","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Poppy Seeds","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Pumpkin Seeds","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Sesame Seeds","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Sunflower Seeds","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Tiger Nuts","","","","",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Nuts","Walnuts","","","","",R.drawable.mic_done_black_24dp));




/// Sub btnx21 breadings crusts Coatings Wraps
            case "btnx21_Batters":
                data.add(new CopListdata("Crusts/Coatings - Batters","Beer","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings - Batters","Liquor Products ","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings - Batters","Liquid Dairy Products","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings - Batters","Fruit Juices","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings - Batters","Tempura","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings - Batters","Vegetable Juices","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings - Batters","Water Varieties","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

            case "btnx21_Bean/Legume Pastes":
                data.add(new CopListdata("Crusts/Coatings - Bean/Legume Pastes","Fermented Beans mixed with salt and/or chiles","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

            case "btnx21_Bread Crumbs":
                data.add(new CopListdata("Crusts/Coatings - Bread Crumbs","Bread Crumbs","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings - Bread Crumbs","Buckwheat","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings - Bread Crumbs","Honey Bran","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings - Bread Crumbs","Multi Grain","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings - Bread Crumbs","Panko","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings - Bread Crumbs","Pastry","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings - Bread Crumbs","Potato","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings - Bread Crumbs","Pumpernickel","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings - Bread Crumbs","Rye","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings - Bread Crumbs","Whole Wheat","0","0","0","0",R.drawable.mic_done_black_24dp));

                break;
                case "btnx21_Chopped Nuts":
                data.add(new CopListdata("Crusts/Coatings -Chopped Nuts","Almond","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Chopped Nuts","Brazil","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Chopped Nuts","Cashew","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Chopped Nuts","Coconut","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Chopped Nuts","Hazelnut","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Chopped Nuts","Macadamia","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Chopped Nuts","Peanut","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Chopped Nuts","Pecan","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Chopped Nuts","Pine Nut","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Chopped Nuts","Pistachio","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Chopped Nuts","Poppy Seed","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Chopped Nuts","Pumpkin Seed","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Chopped Nuts","Sesame Seed","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Chopped Nuts","Walnut","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

                case "btnx21_Crushed Root Chip Crumbs":
                data.add(new CopListdata("Crusts/Coatings -Crushed Root Chip Crumbs","Beet","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Crushed Root Chip Crumbs","Daikon","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Crushed Root Chip Crumbs","Lotus Root","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Crushed Root Chip Crumbs","Parsnip","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Crushed Root Chip Crumbs","Purple Potato","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Crushed Root Chip Crumbs","Radish","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Crushed Root Chip Crumbs","Red Potato","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Crushed Root Chip Crumbs","Russet Potato","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Crushed Root Chip Crumbs","Sweet Potato","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Crushed Root Chip Crumbs","Taro","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Crushed Root Chip Crumbs","Yukon Gold","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

                case "btnx21_Dried Fruit":
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Apple","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Apricot","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Banana","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","BlackBerry","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","BlueBerry","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Cantaloupe","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Casaba","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Cherry","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Cranberry","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Crenshaw","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Dates","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Figs","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Gooseberry","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Grape","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Grapefruit","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Grapes","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Honeydew","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Kiwi","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Lemon","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Lime","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Mandarin","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Mango","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Melon","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Mulberry","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Nectarine","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Orange","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Papaya","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Peach","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Pear","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Persian","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Persimmon","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Pineapple","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Plum","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Pomegranate","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Raspberry","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Rhubarb","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Santa Claus","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Strawbery","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Tangerine/Mandarin","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Dried Fruit","Watermelon","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

                case "btnx21_Dried Vegetables":
                 data.add(new CopListdata("Crusts/Coatings -Wraps","Artichoke","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Asparagus","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Avocado","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Bean Sprouts","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Beans","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Beet","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Beet Greens","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Belgian Endive","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Bell Peppers","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Broccoli","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Brussels Sprouts","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Cabbage","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Carrot","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Cauliflower","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Celeriac","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Celery","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Chili Peppers","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Collard Greens","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Corn","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Cucumber","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Curly Endive","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Dandelion","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Eggplant","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Escarole","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Fennel","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Garlic","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Kale","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Kohlrabi","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Leek","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Lettuces","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Onion","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Oyster Plant","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Peas","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Potatoes","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Rutabaga","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Salsify","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Shallot","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Sorrel","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Squashes","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Swiss Chard","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Tomatillo","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Tomato","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Turnip","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Crusts/Coatings -Wraps","Watercress","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;


                case "btnx21_Edible Flowers":
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Borage","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Carnations","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Chives","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Chrysanthemums","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Clovers","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Dandelions","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Day Lilys","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Elder","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Gardenias","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Gladiolus","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Hollyhock","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Lavender","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Lemon Blossoms","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Lime Blossoms","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Orange Blossoms","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Lilacs","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Marigolds","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Nasturtium","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Pansies","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Roses","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Rosemary","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Squash Blossoms","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Tulips","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Violets","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Woodruff","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Yarrow","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Edible Flowers","Yucca","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

                case "btnx21_Flour":
                data.add(new CopListdata("Batters/Crusts/Coatings -Flour","All Purpose","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Flour","Bran","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Flour","Bread","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Flour","Bulgar","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Flour","Cake","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Flour","Cracked Wheat","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Flour","Durum","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Flour","Farina","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Flour","Gluten","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Flour","Graham","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Flour","Mushroom","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Flour","Nut","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Flour","Pastry","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Flour","Rice","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Flour","Rolled Wheat","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Flour","Self-Rising","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Flour","Semolina","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Flour","Stone Ground","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Flour","Wheat Germ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Flour","Whole Wheat","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;


                case "btnx21_Fruit Paste":
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Apple","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Apricot","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Banana","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","BlackBerry","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","BlueBerry","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Cantaloupe","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Casaba","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Cherry","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Cranberry","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Crenshaw","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Dates","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Figs","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Gooseberry","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Grapefruit","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Grapes","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Honeydew","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Kiwi","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Lemon","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Lime","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Mango","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Melon","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Mulberry","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Nectarine","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Orange","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Papaya","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Peach","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Pear","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Persian","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Persimmon","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Pineapple","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Plum","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Pomegranate","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Raspberry","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Rhubarb","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Santa Claus","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Strawberry","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Tangerine/Mandarin","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Fruit Paste","Watermelon","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

                case "btnx21_Grain and Starch Flours":
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Arrowroot","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Barley","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Bran","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Buckwheat","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Bulgur","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Corn","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Cornmeal","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Cornstarch","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Couscous","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Cracked","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Farina","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","File","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Germ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Millet","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Oat","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Oat Bran","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Oatmeal","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Pasta","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Quinoa Bean","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Rice","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Rye","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Semolina","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Sorghum","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Tapioca","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch Flour","Whole Wheat","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

                case "btnx21_Grains and Starches":
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Arrowroot","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Barley","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Bran","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Buckwheat","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Bulgur","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Corn","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Cornmeal","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Cornstarch","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Couscous","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Cracked","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Farina","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","File","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Germ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Harina","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Masa","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Millet","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Oat Bran","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Oatmeal","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Oats","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Pastas","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Quinoa Beans","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Rice","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Rye","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Semolina","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Sorghum","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Tapioca","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Grain & Starch ","Whole Wheat","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

                case "btnx21_Mushroom Crumbs":
                data.add(new CopListdata("Batters/Crusts/Coatings -Mushroom Crumbs","Boletus","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Mushroom Crumbs","Cepe","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Mushroom Crumbs","Chanterelle","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Mushroom Crumbs","Dried","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Mushroom Crumbs","Enoki","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Mushroom Crumbs","Morel","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Mushroom Crumbs","Oyster","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Mushroom Crumbs","Shitake","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Mushroom Crumbs","Truffle","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Mushroom Crumbs","Wood Ear","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

                case "btnx21_Mushroom Flours":
                data.add(new CopListdata("Batters/Crusts/Coatings -Mushroom Flour","Boletus","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Mushroom Flour","Cepe","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Mushroom Flour","Chanterelle","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Mushroom Flour","Enoki","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Mushroom Flour","Morel","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Mushroom Flour","Oyster","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Mushroom Flour","Shitake","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Mushroom Flour","Wood Ear","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Mushroom Flour","Truffle Black and White","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

                case "btnx21_Nut Flours":
                data.add(new CopListdata("Batters/Crusts/Coatings -Nut Flour","Almond","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Nut Flour","Brazil","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Nut Flour","Cashew","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Nut Flour","Coconut","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Nut Flour","Hazelnut","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Nut Flour","Macadamia","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Nut Flour","Peanut","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Nut Flour","Pecan","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Nut Flour","Pine Nut","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Nut Flour","Pistachio","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Nut Flour","Poppy Seed","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Nut Flour","Pumpkin Seed","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Nut Flour","Sesame Seed","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Nut Flour","Walnut","0","0","0","0",R.drawable.mic_done_black_24dp));

                break;
            case "btnx21_Other":
                data.add(new CopListdata("Batters/Crusts/Coatings -Other","Chocolate","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Other","Cocoa Powder","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Other","Rock Salt","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Other","Sea Salt","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Other","Mango Powder","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

                case "btnx21_Potato Crumbs":
                data.add(new CopListdata("Batters/Crusts/Coatings -Potato Crumbs","Dried","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Potato Crumbs","Purple","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Potato Crumbs","Red","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Potato Crumbs","Russet","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Potato Crumbs","Sweet","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

                case "btnx21_Seeds":
                data.add(new CopListdata("Batters/Crusts/Coatings -Seeds","Russet","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Seeds","Sesame","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings -Seeds","Sweet Potato","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

            case "btnx21_Spices":
                data.add(new CopListdata("Spices","Akudjua/Australian Bush Tomato","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Allspice","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Amchoor/Indian Mango Evergreen Fruit","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Anise","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Annatto","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Aromatic Leaves","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Asafetida/Middle Eastern Fennel","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Barberry","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Capers","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Caraway","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Cardamom","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Cassia","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Cayenne","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Celery Seed","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Chiles","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Chili Powder","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Cinnamon","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Citrus","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Cloves","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Coriander","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Coriander Seeds","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Cubeb/Java Pepper","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Cumin","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Curry Leaves","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Dill Seeds","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Fennel Seeds","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Fenugreek","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Galangal","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Ginger","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Grains of Paradise/Guinea Pepper/Melegueta/Alligator Pepper","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Horseradish","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Indonesian Kencur","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Juniper","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Kaffir Lime","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Kokam/Indian Evergreen Fruit","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Lemon Grass","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Lemon Myrtle","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Licorice","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Mace","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Mahlab/Middle East Sour Cherry Stones","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Mastic/Greek Evergreen Resin","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Middle East Za’atar","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Mountain Pepper/Australian Black Pepper","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Mustard","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Nigella","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Nutmeg","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Paprika Spanish, Hungarian","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Pepper","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Poppy","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Rose","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Safflower","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Saffron","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Salt","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Star Anise","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Sumac","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Tamarind","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Turmeric","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Vanilla","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Wattle/Acacia/Australian","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spices","Zeodary","","","","",R.drawable.mic_done_black_24dp));
                break;
                case "btnx21_Sugar":
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Agave","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Aspartame","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Barley Malt Syrup","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Beet or White refined","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Brown","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Cane","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Cane Juice or Syrup","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Coconut Palm","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Confectioners","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Corn Sweeteners or Syrup","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Date","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Demerara","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Dextrose","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Erythritol Sugar Alcohol","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Fructose","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Fruit Juice Concentrate","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Glucose","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","High Fructose Corn Syrup","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","High Maltose Corn Syrup","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Honey","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Invert","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Jaggery","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Lactose","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Maltodextrin","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Maltose","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Maple Syrup","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Molasses","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Muscovado","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Rice Syrup","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Saccharin","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Sorbitol","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Stevia","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Sucanat","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Sucralose","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Sucrose","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Sugar Alcohols","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Table","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Tagatose","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Sugar","Turbinado","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

                case "btnx21_Tortilla Crumbs":
                data.add(new CopListdata("Batters/Crusts/Coatings - Tortilla Crumbs","Red","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Tortilla Crumbs","Yellow","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Tortilla Crumbs","Blue","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Batters/Crusts/Coatings - Tortilla Crumbs","White","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

            case "btnx21_Basil":
                data.add(new CopListdata("Herbs - Basil","African Blue","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Cinnamon","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Holy","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Lemon","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Lettuce","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Lime","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Liquorice","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Opal","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Purple","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Sweet","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Thai","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Thai Lemon","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

            case "btnx21_Fennel":

                data.add(new CopListdata("Herbs - Fennel","Bronze","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Fennel","Green","","0","","",R.drawable.mic_done_black_24dp));
                break;

            case "btnx21_Marjoram":
                data.add(new CopListdata("Herbs - Marjoram","Pot","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Marjoram","Sweet","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

            case "btnx21_Mint":
                data.add(new CopListdata("Herbs - Mint", "Apple", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Mint", "Black Pepermint", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Mint", "Bowles'", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Mint", "Chocolate", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Mint", "Moroccan", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Mint", "Mountain", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Mint", "Spear", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Mint", "Vietnamese", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                break;

            case "btnx21_Oregano":
                data.add(new CopListdata("Herbs - Oregano", "Common", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Oregano", "Golden", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Oregano", "Greek", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Oregano", "Mexican", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Oregano", "Syrian", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Oregano", "Turkish", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                break;

            case "btnx21_Parsley":
                data.add(new CopListdata("Herbs - Parsley","Curly","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Parsley","Flat Leaf","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Parsley","Italian","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

            case "btnx21_Sage":
                data.add(new CopListdata("Herbs - Sage","Clary","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Sage","Common","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Sage","Greek","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Sage","Pineapple","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Sage","Purple","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Sage","Tricolor","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

            case "btnx21_Savory":
                data.add(new CopListdata("Herbs - Thyme","Summer","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Thyme","Winter","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;
            case "btnx21_Thyme":
                data.add(new CopListdata("Herbs - Thyme", "Common", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Thyme", "Conehead", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Thyme", "Creeping", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Thyme", "Lemon", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Thyme", "Orange", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Thyme", "Za'atar", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                break;

            case "btnx21_Corn Tortillas":
                data.add(new CopListdata("Wraps -Corn Tortilla Wrap", "Blue", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Corn Tortilla Wrap", "Red", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Corn Tortilla Wrap", "Yellow", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                break;

            case "btnx21_Dried Fruit Leathers":
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Apple", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Apricot", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Banana", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "BlackBerry", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "BlueBerry", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Cantaloupe", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Casaba", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Cherry", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Cranberry", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Crenshaw", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Dates", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Figs", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Gooseberry", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Grape", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Grapefruit", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Grapes", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Honeydew", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Kiwi", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Lemon", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Lime", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Mandarin", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Mango", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Melon", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Mulberry", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Nectarine", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Orange", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Papaya", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Peach", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Pear", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Persian", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Persimmon", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Pineapple", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Plum", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Pomegranate", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Raspberry", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Rhubarb", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Santa Claus", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Strawbery", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Tangerine/Mandarin", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps -Dried Fruit Leathers", "Watermelon", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                break;

            case "btnx21_Dried Vegetables Sheets":
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Artichoke","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Asparagus","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Avocado","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Bean Sprouts","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Beans","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Beet","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Beet Greens","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Belgian Endive","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Bell Peppers","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Broccoli","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Brussels Sprouts","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Cabbage","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Carrot","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Cauliflower","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Celeriac","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Celery","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Chili Peppers","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Collard Greens","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Corn","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Cucumber","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Curly Endive","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Dandelion","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Eggplant","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Escarole","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Fennel","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Garlic","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Kale","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Kohlrabi","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Leek","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Lettuces","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Onion","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Oyster Plant","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Peas","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Potatoes","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Rutabaga","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Salsify","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Shallot","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Sorrel","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Squashes","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Swiss Chard","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Tomatillo","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Tomato","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Turnip","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Dried Veg Sheets","Watercress","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;


            case "btnx21_Edible Bowls":
                data.add(new CopListdata("Wraps - Edible Bowls","Masa Harina","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Edible Bowls","Potato Sheet","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Edible Bowls","Rice Paper","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Edible Bowls","Tortilla","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Edible Bowls","Won Ton Wrapper","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

            case "btnx21_Flour Tortillas":
                data.add(new CopListdata("Wraps - Flour Tortilla","Spice","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Flour Tortilla","Vegatable","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Flour Tortilla","Whole Wheat","0","0","0","0",R.drawable.mic_done_black_24dp));

                case "btnx21_Pasta Sheets":
                data.add(new CopListdata("Wraps - Pasta Sheets","Beet","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Pasta Sheets","Buckwheat","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Pasta Sheets","Chocolate","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Pasta Sheets","Cracked Pepper","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Pasta Sheets","Dried Mushroom","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Pasta Sheets","Herb","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Pasta Sheets","Indian Fry Bread/Navajo Taco","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Pasta Sheets","Lemon/Garlic","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Pasta Sheets","Nut Flour","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Pasta Sheets","Pasta Sheets","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Pasta Sheets","Pumpkin","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Pasta Sheets","Rice Paper/Spring Roll Wrappers","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Pasta Sheets","Saffron","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Pasta Sheets","Spice","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Pasta Sheets","Spinach","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Pasta Sheets","Strawberry","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Pasta Sheets","Tomato","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Pasta Sheets","Vegetable","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Pasta Sheets","Whole Wheat","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Pasta Sheets","Won Ton Wrapper","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;
            case "btnx21_Potato Sheets":
                data.add(new CopListdata("Wraps - Potato Sheets","Purple","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Potato Sheets","Red","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Potato Sheets","Russet","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Wraps - Potato Sheets","Sweet Potatoes","0","0","0","0",R.drawable.mic_done_black_24dp));

                /// Sub btnx22 Cutting and Manipulation
            case "btnx22_Dice":
                data.add(new CopListdata("Cutting and Manipulation: Dice","Small","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Cutting and Manipulation: Dice","Medium","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Cutting and Manipulation: Dice","Large","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

/// Sub btnx23 Dry Rubs and Stuffings
            case "btnx23_Salt":
            data.add(new CopListdata("Dry Rubs - Salt","Block","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Dry Rubs - Salt","Course","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Dry Rubs - Salt","Finishing","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Dry Rubs - Salt","Flake","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Dry Rubs - Salt","Flavored","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Dry Rubs - Salt","Fleur de Sel","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Dry Rubs - Salt","French","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Dry Rubs - Salt","Grey","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Dry Rubs - Salt","Hawaiian","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Dry Rubs - Salt","Himalayan Pink","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Dry Rubs - Salt","Indian Black","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Dry Rubs - Salt","Italian","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Dry Rubs - Salt","Kona Black","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Dry Rubs - Salt","Kosher","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Dry Rubs - Salt","Organic","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Dry Rubs - Salt","Rock","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Dry Rubs - Salt","Sea","0","0","0","0",R.drawable.mic_done_black_24dp));
            break;

/// Sub btnx24 sub Herb and spice pastes
            case "btnx24_Bases":
                data.add(new CopListdata("Spice Pastes -Bases","Bacon ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spice Pastes -Bases","Beef ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spice Pastes -Bases","Clam ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spice Pastes -Bases","Ham ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spice Pastes -Bases","Lobster ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spice Pastes -Bases","Mirepoix ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spice Pastes -Bases","Mushroom ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spice Pastes -Bases","Pork ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spice Pastes -Bases","Shrimp Paste ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spice Pastes -Bases","Turkey ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Spice Pastes -Bases","Vegetable ","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;
            case "btnx24_Basil":
                data.add(new CopListdata("Herbs - Basil","African Blue","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Cinnamon","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Holy","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Lemon","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Lettuce","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Lime","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Liquorice","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Opal","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Purple","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Sweet","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Thai","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Basil","Thai Lemon","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

            case "btnx24_Fennel":

                data.add(new CopListdata("Herbs - Fennel","Bronze","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Fennel","Green","","0","","",R.drawable.mic_done_black_24dp));
                break;

            case "btnx24_Marjoram":
                data.add(new CopListdata("Herbs - Marjoram","Pot","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Marjoram","Sweet","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

            case "btnx24_Mint":
                data.add(new CopListdata("Herbs - Mint", "Apple", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Mint", "Black Pepermint", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Mint", "Bowles'", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Mint", "Chocolate", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Mint", "Moroccan", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Mint", "Mountain", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Mint", "Spear", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Mint", "Vietnamese", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                break;

            case "btnx24_Oregano":
                data.add(new CopListdata("Herbs - Oregano", "Common", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Oregano", "Golden", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Oregano", "Greek", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Oregano", "Mexican", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Oregano", "Syrian", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Oregano", "Turkish", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                break;

            case "btnx24_Parsley":
                data.add(new CopListdata("Herbs - Parsley","Curly","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Parsley","Flat Leaf","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Parsley","Italian","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

            case "btnx24_Sage":
                data.add(new CopListdata("Herbs - Sage","Clary","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Sage","Common","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Sage","Greek","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Sage","Pineapple","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Sage","Purple","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Sage","Tricolor","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;

            case "btnx24_Savory":
                data.add(new CopListdata("Herbs - Thyme","Summer","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Thyme","Winter","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;
            case "btnx24_Thyme":
                data.add(new CopListdata("Herbs - Thyme", "Common", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Thyme", "Conehead", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Thyme", "Creeping", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Thyme", "Lemon", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Thyme", "Orange", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Herbs - Thyme", "Za'atar", "0", "0", "0", "0", R.drawable.mic_done_black_24dp));
                break;

/// Sub btnx25 Marinades and Brines

            case "btnx25_Vinaigrette \n 9Olive Oil, Balsamic Vinegar, Salt, Pepper, \n Sugar, Oregano":
                data.add(new CopListdata("Marinades - Vinaigrette ","Apple ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Marinades - Vinaigrette ","Balsamic ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Marinades - Vinaigrette ","Chinese ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Marinades - Vinaigrette ","French ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Marinades - Vinaigrette ","Grape Juice ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Marinades - Vinaigrette ","Kiwi ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Marinades - Vinaigrette ","Lemon ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Marinades - Vinaigrette ","Lime ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Marinades - Vinaigrette ","Orange ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Marinades - Vinaigrette ","Pear ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Marinades - Vinaigrette ","Pineapple ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Marinades - Vinaigrette ","Strawberry ","0","0","0","0",R.drawable.mic_done_black_24dp));
break;

            case "btnx25_Beer":
            data.add(new CopListdata("Marinades - Beer","Amber ","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Marinades - Beer","Blonde ","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Marinades - Beer","Brown ","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Marinades - Beer","Cream Ale ","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Marinades - Beer","Dark ","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Marinades - Beer","Fruit ","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Marinades - Beer","Golden ","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Marinades - Beer","Honey ","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Marinades - Beer","India Pale Ale IPA ","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Marinades - Beer","Lager ","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Marinades - Beer","Light ","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Marinades - Beer","Lime ","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Marinades - Beer","Malt ","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Marinades - Beer","Pale ","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Marinades - Beer","Pilsner ","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Marinades - Beer","Porter ","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Marinades - Beer","Red ","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Marinades - Beer","Stout ","0","0","0","0",R.drawable.mic_done_black_24dp));
            data.add(new CopListdata("Marinades - Beer","Strong Wheat ","0","0","0","0",R.drawable.mic_done_black_24dp));
            break;
            case "btnx25_Oils and Infused Oils":
                data.add(new CopListdata("Other Marinades - Oils/Infused Oils ","Almond","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Oils/Infused Oils ","Canola","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Oils/Infused Oils ","Coconut","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Oils/Infused Oils ","Fruit Infused","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Oils/Infused Oils ","Grape Seed","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Oils/Infused Oils ","Herb Infused","","","","", R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Oils/Infused Oils ","Lard","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Oils/Infused Oils "," Olive or Extra Virgin ","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Oils/Infused Oils ","Palm Drnel","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Oils/Infused Oils ","Peanut","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Oils/Infused Oils ","Rape Seed","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Oils/Infused Oils ","Safflower","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Oils/Infused Oils ","Sesame","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Oils/Infused Oils ","Sunflower","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Oils/Infused Oils ","Tallow","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Oils/Infused Oils ","Vegetable","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Oils/Infused Oils ","Vegetable Infused","","","","",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Oils/Infused Oils ","Walnut","","","","",R.drawable.mic_done_black_24dp));
                break;

            case "btnx25_Wine \n 9White Wine, Red Wine, Oyster Sauce, Worcestershire, Hot Sauce, Sugar":
                data.add(new CopListdata("Other Marinades - Wine","Albariἦo ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Bordeaux ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Cabernet Franc ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Cabernet Sauvignon ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Carignan ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Champagne ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Chardonnay ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Chenin Blanc ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Concord ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Gamay ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Gewϋrztraminer ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Grenache ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Grϋner Veltliner ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Malbec ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Merlot ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Monastrell ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Muscadet ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Petit Syrah ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Pinot Gris ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Pinot Noir ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Pinotage ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Rhoồne ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Riesling ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Sangiovese ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Sauvignon Blanc ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Sémillion ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Soave ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Syrah ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Tempranillo ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Torronte’s ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Verdejo ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Vermentino ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Viognier ","0","0","0","0",R.drawable.mic_done_black_24dp));
                data.add(new CopListdata("Other Marinades - Wine","Zinfandel ","0","0","0","0",R.drawable.mic_done_black_24dp));
                break;
        }
        return data;

    }

}

