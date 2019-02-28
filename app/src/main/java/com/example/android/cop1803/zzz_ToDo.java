package com.example.android.cop1803;

public class zzz_ToDo {

    // when returning from menu view the Today's Special heading disappears.

    // make heading labels unselectable/ and use to tie to catagory.

// font outline double check font

    // format for smart phone.
    //after having the sub recycler up and then clicking a non sub item the reycler is not colapsing
    //widen recyler, increase font size
    // add button pointer
    // round corners of today's special box
    // change color of expand image to theme color


    //add catagory to pdf menu

    // change direction of scrollbar.







    //search button




        //add option to save or print.





// DONE
// remove gray tint to white on menu cart list
//make cartlist scroll bar visible
// add right edge padding to sub recycler view}
// need to set sub recyler view to '"gone' when clicking another button while it's still visible on the first button.
// reset button
//remove '9' s from long descriptions, how to handle in print out
//increase height of menu items when a selection in more than one line
// scrub garnishes
// double check manipulation and that I have all the sub catagories, Does fold have sub's?
//add selection to owner button and change to yellow.
// //match the color better.
//
//    // Balance ring
//        // add title to balance
//        // add button states item list
//        // fix textview from appearing under button
// // Remove Share from front user menu and add to dialog header.
//// Add return navigation from menu dialog.

    //create menu view and pdf print file.
    // chili peppers add scu units.
//scrub through data again.




//Button btnCurrent=g.getCurrentbutton();
//    int btnCurrentid=btnCurrent.getId();
//    String btnCurrentName=((MainActivity) context).getResources().getResourceEntryName(btnCurrentid);

/*<com.example.android.cop1803.MyRecyclerView
    android:id="@+id/recycler_menuview"
    android:layout_width="match_parent"
    android:layout_height="350dp"
    android:layout_marginStart="8dp"
    android:layout_marginBottom="8dp"
    android:scrollbars="vertical"
    app:layout_constraintVertical_bias="0.01"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toBottomOf="@id/divider3" />*/

    /*



    int[] viewALocationInWindow = new int[2];    // button1
    int[] viewBLocationInWindow = new int[2];    // button2

    vBtn1.getLocationInWindow(viewALocationInWindow); // button1
    vBtn2.getLocationInWindow(viewBLocationInWindow); // button2

    float Ax = vBtn1.getX(); button1 x
    float Ay = vBtn1.getY(); button1 y
    float Bx = vBtn2.getX(); button2 x
    float By = vBtn2.getY(); button2 y

  final int lineStartX = ((((ConstraintLayout.LayoutParams) vBtn1.getLayoutParams())
                        .leftMargin+((ConstraintLayout.LayoutParams) vBtn1.getLayoutParams()).rightMargin + vBtn1.getWidth() )/ 2)
                      + (int) Ax;
                final int lineStartY = ((((ConstraintLayout.LayoutParams) vBtn1.getLayoutParams())
                        .topMargin+((ConstraintLayout.LayoutParams) vBtn1.getLayoutParams())
                        .bottomMargin
                         + vBtn1.getHeight()
                         -statusBarHeight) / 2)
                        +(int) Ay;
                final int lineEndX = ((((ConstraintLayout.LayoutParams) vBtn2.getLayoutParams())
                        .leftMargin+((ConstraintLayout.LayoutParams) vBtn2.getLayoutParams()).rightMargin + vBtn2.getWidth()) / 2)
                        +(int)Bx;
                final int lineEndY = ((((ConstraintLayout.LayoutParams) vBtn2.getLayoutParams())
                        .topMargin+((ConstraintLayout.LayoutParams) vBtn2.getLayoutParams())
                        .bottomMargin + vBtn2.getHeight()-statusBarHeight )/ 2)
                        +(int)By;
            public void setPointA(PointF point){
            pointA=point;}
            public void setPointB(PointF point){
            pointB=point;}

            canvas.drawLine(pointA.x, pointA.y, pointB.x, pointB.y, paint);
            ;*/
   /* public class BalanceOverlay extends DialogFragment implements View.OnClickListener {
        private Button btn;
        public Button btn00;
        public int btn0width;
        private Button btn01,btn02,btn03,btn04,btn05,btn06,btn07,btn08,btn09,btn10,btn11,btn12;
        private Triangle tri1;
        private static ArrayList<Button> buttonsbalance = new ArrayList<Button>();
        private int balancetextwidth;
        private int balancetextheight;
        public ConstraintSet mConstraintSetBaltext = new ConstraintSet(); // create a Constraint Set clone
        public ConstraintLayout mConstraintLayout; // cache the ConstraintLayout
        //public ConstraintSet mConstraintSettri = new ConstraintSet(); // create a Constraint Set clone
        private ConstraintSet mConstraintSettri1,mConstraintSettri2,mConstraintSettri3,mConstraintSettri4,mConstraintSettri5,
                mConstraintSettri6,mConstraintSettri7,mConstraintSettri8,mConstraintSettri9,mConstraintSettri10,mConstraintSettri11,
                mConstraintSettri12;
        protected  View bview;
        public long value;
        PointF pointA;
        PointF pointB;
        public List<LineView> mLine = new ArrayList<>();
        MainActivity mMainActivit = new MainActivity();
        Globals g =Globals.getInstance();
        private int someStateValue;
        private final String SOME_VALUE_KEY = "someValueToSave";
        Map<String, Button> vars = new HashMap<String, Button>();
        // data object we want to retain


//    @Override
//    public void onSaveInstanceState(Bundle savedInstanceState) {
//        super.onSaveInstanceState(savedInstanceState);
//        savedInstanceState.putLong("param", value);
//    }

        @Override
        public void onSaveInstanceState(Bundle outState) {
            outState.putInt(SOME_VALUE_KEY, someStateValue);
            super.onSaveInstanceState(outState);
        }
        public BalanceOverlay() {
            // Empty constructor is required for DialogFragment
            // Make sure not to add arguments to the constructor
            // Use `newInstance` instead as shown below
        }

        public static com.example.android.cop1803.BalanceOverlay newInstance(String title) {
            com.example.android.cop1803.BalanceOverlay frag = new com.example.android.cop1803.BalanceOverlay();
            Bundle args = new Bundle();
            args.putString("Balance - The Center of the Plate", title);
            frag.setArguments(args);
            return frag;
        }
        // @Override
        public void onDestroyView(Bundle outState) {
            if (getDialog() != null && getRetainInstance()) {
                getDialog().setDismissMessage(null);
            }
            if (getDialog() == null){
                outState.putInt(SOME_VALUE_KEY, someStateValue);
            }
            super.onDestroyView();
        }



        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            bview=  inflater.inflate(R.layout.balance, container,false);
            if (savedInstanceState != null) {
                someStateValue = savedInstanceState.getInt(SOME_VALUE_KEY);
                // Do something with value if needed
            }
            //setRetainInstance(true);
            return bview;
        }


        @Override
        public void onViewCreated(final View view, Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
            if (savedInstanceState != null){
                value =  savedInstanceState.getLong("param");
            }
            String title = getArguments().getString("title", "Enter Name");
            getDialog().setTitle(title);


        *//*getView().post(new Runnable() {
                           @Override
                           public void run() {
                               AppBarNavBarHeight getdimension=new AppBarNavBarHeight();
                               Dialog mDialog = getDialog();
                               int height=mDialog.getWindow().getDecorView().getHeight();
                               int width=mDialog.getWindow().getDecorView().getWidth();
                               int x=0;
                               int radius=height/2;
                               float circum= (float) (2*PI*radius);
                           }
                       }
        );*//*
            // Get field from view

       *//* GradientDrawable gradientDrawable = (GradientDrawable) ContextCompat.getDrawable(getContext(), R
                .drawable.balancecenter);
       int w= gradientDrawable.getIntrinsicWidth();
       int h=gradientDrawable.getIntrinsicHeight();
        gradientDrawable.mutate();
        int ww=(int) (w*.75);
        int hh=(int) (h*.75);
        gradientDrawable.setSize(ww,hh);
        balancetextwidth=(int) (w*1.0);
        balancetextheight=(int) (w*1.0);*//*

            // Find all buttons on view

            Dialog mDialog = getDialog();
            int height=mDialog.getWindow().getDecorView().getHeight();
            int width=mDialog.getWindow().getDecorView().getWidth();

            btn00= view.findViewById(R.id.x0);

            btn0width=btn00.getWidth();
            g.setBtn0width(btn0width);

            btn01= view.findViewById(R.id.x1); btn02= view.findViewById(R.id.x2); btn03= view
                    .findViewById(R.id.x3);
            btn04= view.findViewById(R.id.x4); btn05= view.findViewById(R.id.x5);
            btn06= view.findViewById(R.id.x6); btn07= view.findViewById(R.id.x7); btn08= view
                    .findViewById(R.id.x8); btn09= view.findViewById(R.id.x9);
            btn10= view.findViewById(R.id.x10); btn11= view.findViewById(R.id.x11);
            btn12= view.findViewById(R.id.x12);

            vars.put("btn00",btn00);
            vars.put("btn01",btn01);
            vars.put("btn02",btn02);
            vars.put("btn03",btn03);
            vars.put("btn04",btn04);
            vars.put("btn05",btn05);
            vars.put("btn06",btn06);
            vars.put("btn07",btn07);
            vars.put("btn08",btn08);
            vars.put("btn09",btn09);
            vars.put("btn10",btn10);
            vars.put("btn11",btn11);
            vars.put("btn12",btn12);



            // Add buttons to array
            //buttonsbalance.add(btn0);
            buttonsbalance.add(btn01);buttonsbalance.add(btn02);buttonsbalance.add(btn03);
            buttonsbalance.add(btn04);
            buttonsbalance.add(btn05);buttonsbalance.add(btn06);buttonsbalance.add(btn07);
            buttonsbalance.add(btn08);buttonsbalance.add(btn09);
            buttonsbalance.add(btn10);buttonsbalance.add(btn11);buttonsbalance.add(btn12);


            //add onclick to all buttons and background
//        btn0.setBackground(gradientDrawable);
            btn00.setOnClickListener(this);
            for(Button b : buttonsbalance) {
//            b.setBackground(gradientDrawable);
                b.setOnClickListener(this);
            }

            LineView mLineView1= getView().findViewById(R.id.LineViewb0001);
            mLine.add(mLineView1);

            LineView mLineView2= getView().findViewById(R.id.LineViewb0002);
            mLine.add(mLineView2);

            LineView mLineView3= getView().findViewById(R.id.LineViewb0003);
            mLine.add(mLineView3);
            LineView mLineView4= getView().findViewById(R.id.LineViewb0004);
            mLine.add(mLineView4);
            LineView mLineView5= getView().findViewById(R.id.LineViewb0005);
            mLine.add(mLineView5);
            LineView mLineView6= getView().findViewById(R.id.LineViewb0006);
            mLine.add(mLineView6);
            LineView mLineView7= getView().findViewById(R.id.LineViewb0007);
            mLine.add(mLineView7);
            LineView mLineView8= getView().findViewById(R.id.LineViewb0008);
            mLine.add(mLineView8);
            LineView  mLineView9= getView().findViewById(R.id.LineViewb0009);
            mLine.add(mLineView9);
            LineView mLineView10= getView().findViewById(R.id.LineViewb0010);
            mLine.add(mLineView10);
            LineView mLineView11= getView().findViewById(R.id.LineViewb0011);
            mLine.add(mLineView11);
            LineView mLineView12= getView().findViewById(R.id.LineViewb0012);
            mLine.add(mLineView12);


            final List<Triangle> mTri = new ArrayList<>();

            Triangle mTriView1= getView().findViewById(R.id.triangle1);
            mTri.add(mTriView1);
            Triangle mTriView2= getView().findViewById(R.id.triangle2);
            mTri.add(mTriView2);
            Triangle mTriView3= getView().findViewById(R.id.triangle3);
            mTri.add(mTriView3);
            Triangle mTriView4= getView().findViewById(R.id.triangle4);
            mTri.add(mTriView4);
            Triangle mTriView5= getView().findViewById(R.id.triangle5);
            mTri.add(mTriView5);
            Triangle mTriView6= getView().findViewById(R.id.triangle6);
            mTri.add(mTriView6);
            Triangle mTriView7= getView().findViewById(R.id.triangle7);
            mTri.add(mTriView7);
            Triangle mTriView8= getView().findViewById(R.id.triangle8);
            mTri.add(mTriView8);
            Triangle mTriView9= getView().findViewById(R.id.triangle9);
            mTri.add(mTriView9);
            Triangle mTriView10= getView().findViewById(R.id.triangle10);
            mTri.add(mTriView10);
            Triangle mTriView11= getView().findViewById(R.id.triangle11);
            mTri.add(mTriView11);
            Triangle mTriView12= getView().findViewById(R.id.triangle12);
            mTri.add(mTriView12);



            final ViewTreeObserver vto = bview.getViewTreeObserver();
            vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    AppBarNavBarHeight convert=new AppBarNavBarHeight();
                    Context context=getContext();
                    Resources res = getResources();
                    Dialog mDialog = getDialog();
                    int height=mDialog.getWindow().getDecorView().getHeight();
                    int width=mDialog.getWindow().getDecorView().getWidth();

                    // height ratio is percent of screen height for inner and outer buttons
               *//* float heightdp=convert.convertPxToDp(context,height);
                float heightratio=res.getInteger(R.integer.b0circleratio);
                float heightratiopercent=heightratio/100;
                float heightratiooutter=res.getInteger(R.integer.bOuterRingRatio);
                float heightratiopercentouter=heightratiooutter/100;

                int diameter= (int) (height*heightratiopercent);
                int diameterOuterRing=(int) (height*heightratiopercentouter);
                ConstraintLayout.LayoutParams newLayoutParams;
                newLayoutParams = (ConstraintLayout.LayoutParams) btn0.getLayoutParams();
                newLayoutParams.width = diameter;
                newLayoutParams.height = diameter;
                btn0.setLayoutParams(newLayoutParams);


                int radius= (int) (height/2);
                int radiusinitial=radius-(diameterOuterRing/2);
                int circumference= (int) (2*PI*radiusinitial);
                int circlecheck=circumference/12;*//*



                    ArrayList<Float> mRadius = new ArrayList<Float>();
                    float angle=0;



                    g.setBtn0width(btn00.getWidth());
                    g.setViewlinesbeingdrawn("balanceview");
                    String btnprefix="btn";
                    int startIndex1=9,endIndex1=11,startIndex2=11,endIndex2=13;
                    LineDrawing drawline = new LineDrawing();
                    drawline.drawLines(mLine,bview, (HashMap) vars,btnprefix,startIndex1, endIndex1,
                            startIndex2, endIndex2);

                    mConstraintLayout= getView().findViewById(R.id.mybalancelayout);

                    view.invalidate();


// set circle constaints and rotation for triangles
                    for (int i = 0; i < mTri.size(); i++) {
                        int iLine= mLine.get(i).getId();
                        int iTri= mTri.get(i).getId();
                        int iBtn=buttonsbalance.get(i).getId();
*/
                        //         double radiusCon=mRadius.get(i);
                        //        int rad= (int) radiusCon;
/*                    switch (i){
                        case 0:
                            mConstraintSettri1 = new ConstraintSet();
                            mConstraintSettri1.clone(mConstraintLayout);
                            angle = res.getInteger(R.integer.BCangle1)+180;
                            mConstraintSettri1.constrainCircle(iTri,iBtn, (int) radiusCon,angle);
                            mConstraintSettri1.applyTo(mConstraintLayout);
                            mTri.get(i).setRotation(angle);
                        break;
                        case 1:
                            mConstraintSettri2 = new ConstraintSet();
                            mConstraintSettri2.clone(mConstraintLayout);
                            angle = res.getInteger(R.integer.BCangle2)+180;
                            mConstraintSettri2.constrainCircle(iTri,iBtn, (int) radiusCon,angle);
                            mConstraintSettri2.applyTo(mConstraintLayout);
                            mTri.get(i).setRotation(angle);
                            break;
                        case 2:
                            mConstraintSettri3 = new ConstraintSet();
                            mConstraintSettri3.clone(mConstraintLayout);
                            angle = res.getInteger(R.integer.BCangle3)+180;
                            mConstraintSettri3.constrainCircle(iTri,iBtn, (int) radiusCon,angle);
                            mConstraintSettri3.applyTo(mConstraintLayout);
                            mTri.get(i).setRotation(angle);
                            break;
                        case 3:
                            mConstraintSettri4 = new ConstraintSet();
                            mConstraintSettri4.clone(mConstraintLayout);
                            angle = res.getInteger(R.integer.BCangle4)+180;
                            mConstraintSettri4.constrainCircle(iTri,iBtn, (int) radiusCon,angle);
                            mConstraintSettri4.applyTo(mConstraintLayout);
                            mTri.get(i).setRotation(angle);
                            break;
                        case 4:
                            mConstraintSettri5 = new ConstraintSet();
                            mConstraintSettri5.clone(mConstraintLayout);
                            angle = res.getInteger(R.integer.BCangle5)+180;
                            mConstraintSettri5.constrainCircle(iTri,iBtn, (int) radiusCon,angle);
                            mConstraintSettri5.applyTo(mConstraintLayout);
                            mTri.get(i).setRotation(angle);
                            break;
                         case 5:
                            mConstraintSettri6 = new ConstraintSet();
                            mConstraintSettri6.clone(mConstraintLayout);
                            angle = res.getInteger(R.integer.BCangle6)+180;
                            mConstraintSettri6.constrainCircle(iTri,iBtn, (int) radiusCon,angle);
                            mConstraintSettri6.applyTo(mConstraintLayout);
                            mTri.get(i).setRotation(angle);
                            break;
                        case 6:
                            mConstraintSettri7 = new ConstraintSet();
                            mConstraintSettri7.clone(mConstraintLayout);
                            angle = res.getInteger(R.integer.BCangle7)-180;
                            mConstraintSettri7.constrainCircle(iTri,iBtn, (int) radiusCon,angle);
                            mConstraintSettri7.applyTo(mConstraintLayout);
                            mTri.get(i).setRotation(angle);
                            break;
                        case 7:
                            mConstraintSettri8 = new ConstraintSet();
                            mConstraintSettri8.clone(mConstraintLayout);
                            angle = res.getInteger(R.integer.BCangle8)-180;
                            mConstraintSettri8.constrainCircle(iTri,iBtn, (int) radiusCon,angle);
                            mConstraintSettri8.applyTo(mConstraintLayout);
                            mTri.get(i).setRotation(angle);
                            break;
                        case 8:
                            mConstraintSettri9 = new ConstraintSet();
                            mConstraintSettri9.clone(mConstraintLayout);
                            angle = res.getInteger(R.integer.BCangle9)-180;
                            mConstraintSettri9.constrainCircle(iTri,iBtn, (int) radiusCon,angle);
                            mConstraintSettri9.applyTo(mConstraintLayout);
                            mTri.get(i).setRotation(angle);
                            break;
                        case 9:
                            mConstraintSettri10 = new ConstraintSet();
                            mConstraintSettri10.clone(mConstraintLayout);
                            angle = res.getInteger(R.integer.BCangle10)-180;
                            mConstraintSettri10.constrainCircle(iTri,iBtn, (int) radiusCon,angle);
                            mConstraintSettri10.applyTo(mConstraintLayout);
                            mTri.get(i).setRotation(angle);
                            break;
                        case 10:
                            mConstraintSettri11 = new ConstraintSet();
                            mConstraintSettri11.clone(mConstraintLayout);
                            angle = res.getInteger(R.integer.BCangle11)-180;
                            mConstraintSettri11.constrainCircle(iTri,iBtn, (int) radiusCon,angle);
                            mConstraintSettri11.applyTo(mConstraintLayout);
                            mTri.get(i).setRotation(angle);
                            break;
                        case 11:
                            mConstraintSettri12 = new ConstraintSet();
                            mConstraintSettri12.clone(mConstraintLayout);
                            angle = res.getInteger(R.integer.BCangle12)-180;
                            mConstraintSettri12.constrainCircle(iTri,iBtn, (int) radiusCon,angle);
                            mConstraintSettri12.applyTo(mConstraintLayout);
                            mTri.get(i).setRotation(angle);
                            break;
                        }*/
                        //view.invalidate();
                    }
                    //  view.invalidate();

               /*     bview.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }

            });


        }

        public void drawLines(List<LineView> mlinesToDraw, View view, HashMap vars, String
                btnprefix, int startIndex1, int endIndex1, int startIndex2, int endIndex2) {


            String btn1, btn11, btn2, btn22;

            int mStartX = -1;
            int mStartY = -1;
            int mXOffset = -1;
            int mYOffset = -1;
            final int[] mCoords = new int[2];

            for (int i = 0; i < mlinesToDraw.size(); i++) {

                int lineID = mlinesToDraw.get(i).getId();
                String linename =view.getResources().getResourceEntryName(lineID);
                btn1 = linename.substring(startIndex1, endIndex1);
                btn2 = linename.substring(startIndex2, endIndex2);

                btn11 = btnprefix + btn1;
                Button vBtn1 = (Button) vars.get(btn11);
                btn22 = btnprefix + btn2;
                Button vBtn2 = (Button) vars.get(btn22);

                //int statusbarheight=mMainActivit.getstatusBarHeight();
                int statusbarheight=0;

                int buttonID= vBtn1.getId();
                Button btn111=getView().findViewById(buttonID);
                btn111.getLocationOnScreen(mCoords);
                vBtn1.getLocationOnScreen(mCoords);
                mStartX = mCoords[0] + vBtn1.getWidth() / 2;
                mStartY = mCoords[1] - statusbarheight + (vBtn1.getHeight()) / 2 ;

                vBtn2.getLocationOnScreen(mCoords);
                int endX = mCoords[0] + vBtn2.getWidth() / 2;
                int endY = mCoords[1] - statusbarheight + (vBtn2.getHeight() / 2);
                mlinesToDraw.get(i).setCoords(mStartX, mStartY, endX, endY);

            }

        }


        // Balance ring text boxes
        @Override
        public void onClick(View v) {
            View view_instance;

            ConstraintLayout mConstraintLayout;
            TextView textView;
            TextView textViewheader;

            // Scroll textview
            view_instance = getView().findViewById(R.id.balancetext);
            view_instance.setVisibility(View.VISIBLE);
            textView = getView().findViewById(R.id.balancetextt);
            textView.setMovementMethod(new ScrollingMovementMethod());
            textViewheader = getView().findViewById(R.id.balancetextheader);

            ViewGroup.LayoutParams params=view_instance.getLayoutParams();
            params.width=balancetextwidth;
            params.height=balancetextheight;
            view_instance.setLayoutParams(params);
            mConstraintLayout=(ConstraintLayout) getView().findViewById(R.id.mybalancelayout);
            mConstraintSetBaltext.clone(mConstraintLayout);
            int b=btn00.getId();
            view_instance.bringToFront();
            float angle=0;
            Resources res = getResources();


 *//*  textView=  getView().findViewById(R.id.balancetext);
        textView.setMovementMethod(new ScrollingMovementMethod());

        //
        View view_instance = getView().findViewById(R.id.balancetext);
        view_instance.setVisibility(View.VISIBLE);
        ViewGroup.LayoutParams params=view_instance.getLayoutParams();
        params.width=balancetextwidth;
        params.height=balancetextheight;
        view_instance.setLayoutParams(params);
        ConstraintLayout mConstraintLayout=(ConstraintLayout) getView().findViewById(R.id.mybalancelayout);
        mConstraintSetBaltext.clone(mConstraintLayout);
        int b=btn0.getId();*//*
//  Balance ring popup text view angles
            switch (v.getId()) {
                case R.id.x0:
                    textView.setText(getString(R.string.BalanceTxt));
                    textViewheader.setText(btn00.getText());
                    mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,90);
                    mConstraintSetBaltext.applyTo(mConstraintLayout);


                    break;
                case R.id.x1:
                    textView.setText(getString(R.string.SweetTxt));
                    textViewheader.setText(btn01.getText());
                    angle = res.getInteger(R.integer.BCangle1);
                    mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,angle);
                    mConstraintSetBaltext.applyTo(mConstraintLayout);

                    break;
                case R.id.x2:
                    textView.setText(getString(R.string.SourTxt));
                    textViewheader.setText(btn02.getText());
                    angle = res.getInteger(R.integer.BCangle2);
                    mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,angle);
                    mConstraintSetBaltext.applyTo(mConstraintLayout);

                    break;
                case R.id.x3:
                    textView.setText(getString(R.string.BitterTxt));
                    textViewheader.setText(btn03.getText());
                    angle = res.getInteger(R.integer.BCangle3);
                    mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,angle);
                    mConstraintSetBaltext.applyTo(mConstraintLayout);
                    break;
                case R.id.x4:
                    textView.setText(getString(R.string.SaltyTxt));
                    textViewheader.setText(btn04.getText());
                    angle = res.getInteger(R.integer.BCangle4);
                    mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,angle);
                    mConstraintSetBaltext.applyTo(mConstraintLayout);
                    break;
                case R.id.x5:
                    textView.setText(getString(R.string.UmamiTxt));
                    textViewheader.setText(btn05.getText());
                    angle = res.getInteger(R.integer.BCangle5);
                    mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,angle);
                    mConstraintSetBaltext.applyTo(mConstraintLayout);
                    break;
                case R.id.x6:
                    textView.setText(getString(R.string.SpicyTxt));
                    textViewheader.setText(btn06.getText());
                    angle = res.getInteger(R.integer.BCangle6);
                    mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,angle);
                    mConstraintSetBaltext.applyTo(mConstraintLayout);
                    break;
                case R.id.x7:
                    textView.setText(getString(R.string.ColorTxt));
                    textViewheader.setText(btn07.getText());
                    angle = res.getInteger(R.integer.BCangle7);
                    mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,angle);
                    mConstraintSetBaltext.applyTo(mConstraintLayout);
                    break;
                case R.id.x8:
                    textView.setText(getString(R.string.ShapeTxt));
                    textViewheader.setText(btn08.getText());
                    angle = res.getInteger(R.integer.BCangle8);
                    mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,angle);
                    mConstraintSetBaltext.applyTo(mConstraintLayout);
                    break;
                case R.id.x9:
                    textView.setText(getString(R.string.AromaticTxt));
                    textViewheader.setText(btn09.getText());
                    angle = res.getInteger(R.integer.BCangle9);
                    mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,angle);
                    mConstraintSetBaltext.applyTo(mConstraintLayout);
                    break;
                case R.id.x10:
                    textView.setText(getString(R.string.HotTxt));
                    textViewheader.setText(btn10.getText());
                    angle = res.getInteger(R.integer.BCangle10);
                    mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,angle);
                    mConstraintSetBaltext.applyTo(mConstraintLayout);
                    break;
                case R.id.x11:
                    textView.setText(getString(R.string.TenderTxt));
                    textViewheader.setText(btn11.getText());
                    angle = res.getInteger(R.integer.BCangle11);
                    mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,angle);
                    mConstraintSetBaltext.applyTo(mConstraintLayout);
                    break;
                case R.id.x12:
                    textView.setText(getString(R.string.CrispyTxt));
                    textViewheader.setText(btn12.getText());
                    angle = res.getInteger(R.integer.BCangle12);
                    mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,angle);
                    mConstraintSetBaltext.applyTo(mConstraintLayout);
                    break;


            }
            view_instance.invalidate();

        }*/


/*    public void repositionTextViewBalance(String btnFoodClass ) {

        boolean tabletSize = getResources().getBoolean(R.bool.isTablet);
        if (tabletSize) {


            mConstraintSetBaltext.clone(mConstraintLayout); // get constraints from ConstraintSet

            if ((btnFoodClass.equals("MainCOPbtn"))) {

                mConstraintSetBaltext.connect(R.id.recycler_view, 6, R.id.MainCOPbtn, 7);
                // mConstraintSetrecy1.connect(R.id.recycler_view2, 7,R.id.x25 , 6);

            }
            if ((btnFoodClass.equals("btnx21"))
                    || (btnFoodClass.equals("btnx22"))
                    || (btnFoodClass.equals("btnx23"))
                    || (btnFoodClass.equals("btnx24"))
                    || (btnFoodClass.equals("btnx25"))
                    || (btnFoodClass.equals("btnx26"))
                    || (btnFoodClass.equals("btnx27"))) {
                mConstraintSetBaltext.connect(R.id.recycler_view, 6, R.id.x25, 7);
            }
            if ((btnFoodClass.equals("btnx31"))) {
                mConstraintSetBaltext.connect(R.id.recycler_view, 6, R.id.x31, 7);
            }

            if ((btnFoodClass.equals("btnx41"))
                    || (btnFoodClass.equals("btnx42"))
                    || (btnFoodClass.equals("btnx43"))
                    || (btnFoodClass.equals("btnx44"))
                    || (btnFoodClass.equals("btnx45"))
                    || (btnFoodClass.equals("btnx66"))
                    ) {
                mConstraintSetBaltext.connect(R.id.recycler_view, 6, R.id.x31, 7);
            }

            mConstraintSetBaltext.applyTo(mConstraintLayout);
        }
    }*/


