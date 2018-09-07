package com.example.android.cop1803;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v4.app.DialogFragment;
import android.support.v4.content.ContextCompat;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class BalanceOverlay extends DialogFragment implements View.OnClickListener {
    private Button btn;
    public Button btn0;
    public int btn0width;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12;
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

    public static BalanceOverlay newInstance(String title) {
        BalanceOverlay frag = new BalanceOverlay();
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
       // Get field from view

        GradientDrawable gradientDrawable = (GradientDrawable) ContextCompat.getDrawable(getContext(), R
                .drawable.balancecenter);
       int w= gradientDrawable.getIntrinsicWidth();
       int h=gradientDrawable.getIntrinsicHeight();
        gradientDrawable.mutate();
        int ww=(int) (w*.75);
        int hh=(int) (h*.75);
        gradientDrawable.setSize(ww,hh);
        balancetextwidth=(int) (w*1.0);
        balancetextheight=(int) (w*1.0);

        // Find all buttons on view
        btn0= view.findViewById(R.id.x0);
        btn0width=btn0.getWidth();
        g.setBtn0width(btn0width);

        btn1= view.findViewById(R.id.x1); btn2= view.findViewById(R.id.x2); btn3= view.findViewById(R.id.x3);
        btn4= view.findViewById(R.id.x4); btn5= view.findViewById(R.id.x5);
        btn6= view.findViewById(R.id.x6); btn7= view.findViewById(R.id.x7); btn8= view.findViewById(R.id.x8); btn9= view.findViewById(R.id.x9);
        btn10= view.findViewById(R.id.x10); btn11= view.findViewById(R.id.x11);
        btn12= view.findViewById(R.id.x12);

        // Add buttons to array
        //buttonsbalance.add(btn0);
        buttonsbalance.add(btn1);buttonsbalance.add(btn2);buttonsbalance.add(btn3);buttonsbalance.add(btn4);
        buttonsbalance.add(btn5);buttonsbalance.add(btn6);buttonsbalance.add(btn7);buttonsbalance.add(btn8);buttonsbalance.add(btn9);
        buttonsbalance.add(btn10);buttonsbalance.add(btn11);buttonsbalance.add(btn12);


        //add onclick to all buttons and background
        btn0.setBackground(gradientDrawable);
        btn0.setOnClickListener((View.OnClickListener)this);
        for(Button b : buttonsbalance) {
            b.setBackground(gradientDrawable);
            b.setOnClickListener((View.OnClickListener) this);
        }

        LineView mLineView1= getView().findViewById(R.id.LineViewb1);
        mLine.add(mLineView1);

        LineView mLineView2= getView().findViewById(R.id.LineViewb2);
        mLine.add(mLineView2);

        LineView mLineView3= getView().findViewById(R.id.LineViewb3);
        mLine.add(mLineView3);
        LineView mLineView4= getView().findViewById(R.id.LineViewb4);
        mLine.add(mLineView4);
        LineView mLineView5= getView().findViewById(R.id.LineViewb5);
        mLine.add(mLineView5);
        LineView mLineView6= getView().findViewById(R.id.LineViewb6);
        mLine.add(mLineView6);
        LineView mLineView7= getView().findViewById(R.id.LineViewb7);
        mLine.add(mLineView7);
        LineView mLineView8= getView().findViewById(R.id.LineViewb8);
        mLine.add(mLineView8);
        LineView  mLineView9= getView().findViewById(R.id.LineViewb9);
        mLine.add(mLineView9);
        LineView mLineView10= getView().findViewById(R.id.LineViewb10);
        mLine.add(mLineView10);
        LineView mLineView11= getView().findViewById(R.id.LineViewb11);
        mLine.add(mLineView11);
        LineView mLineView12= getView().findViewById(R.id.LineViewb12);
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

//        mEditText = (EditText) view.findViewById(R.id.txt_your_name);
//        // Fetch arguments from bundle and set title
//        String title = getArguments().getString("title", "Enter Name");
//        getDialog().setTitle(title);
//        // Show soft keyboard automatically and request focus to field
//        mEditText.requestFocus();
//        getDialog().getWindow().setSoftInputMode(
//                WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);

        ViewTreeObserver vto = bview.getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                Context context=getContext();
                ArrayList<Float> mRadius = new ArrayList<Float>();
                float angle=0;
                Resources res = getResources();


                g.setBtn0width(btn0.getWidth());
                g.setViewlinesbeingdrawn("balanceview");
                Drawline drawline=new Drawline();
                drawline.drawLines(mLine,buttonsbalance,context,btn0,mTri, mRadius);

                mConstraintLayout=(ConstraintLayout) getView().findViewById(R.id.mybalancelayout);

                view.invalidate();

// set circle constaints and rotation for triangles
                for (int i = 0; i < mTri.size(); i++) {
                    int iLine= mLine.get(i).getId();
                    int iTri= mTri.get(i).getId();
                    int iBtn=buttonsbalance.get(i).getId();

                    double radiusCon=mRadius.get(i);
                    int rad= (int) radiusCon;
                    switch (i){
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
                        }
                    view.invalidate();
                    }
                    view.invalidate();

            //    vto.removeOnGlobalLayoutListener(this);
            }

        });


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
        int b=btn0.getId();
        view_instance.bringToFront();
        float angle=0;
        Resources res = getResources();


 /*  textView=  getView().findViewById(R.id.balancetext);
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
        int b=btn0.getId();*/
//  Balance ring popup text view angles
        switch (v.getId()) {
            case R.id.x0:
                textView.setText(getString(R.string.BalanceTxt));
                textViewheader.setText(btn0.getText());
                mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,90);
                mConstraintSetBaltext.applyTo(mConstraintLayout);


                break;
            case R.id.x1:
                textView.setText(getString(R.string.SweetTxt));
                textViewheader.setText(btn1.getText());
                angle = res.getInteger(R.integer.BCangle1);
                mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,angle);
                mConstraintSetBaltext.applyTo(mConstraintLayout);

                break;
            case R.id.x2:
                textView.setText(getString(R.string.SourTxt));
                textViewheader.setText(btn2.getText());
                angle = res.getInteger(R.integer.BCangle2);
                mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,angle);
                mConstraintSetBaltext.applyTo(mConstraintLayout);

                break;
            case R.id.x3:
                textView.setText(getString(R.string.BitterTxt));
                textViewheader.setText(btn3.getText());
                angle = res.getInteger(R.integer.BCangle3);
                mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,angle);
                mConstraintSetBaltext.applyTo(mConstraintLayout);
                break;
            case R.id.x4:
                textView.setText(getString(R.string.SaltyTxt));
                textViewheader.setText(btn4.getText());
                angle = res.getInteger(R.integer.BCangle4);
                mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,angle);
                mConstraintSetBaltext.applyTo(mConstraintLayout);
                break;
            case R.id.x5:
                textView.setText(getString(R.string.UmamiTxt));
                textViewheader.setText(btn5.getText());
                angle = res.getInteger(R.integer.BCangle5);
                mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,angle);
                mConstraintSetBaltext.applyTo(mConstraintLayout);
                break;
            case R.id.x6:
                textView.setText(getString(R.string.SpicyTxt));
                textViewheader.setText(btn6.getText());
                angle = res.getInteger(R.integer.BCangle6);
                mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,angle);
                mConstraintSetBaltext.applyTo(mConstraintLayout);
                break;
            case R.id.x7:
                textView.setText(getString(R.string.ColorTxt));
                textViewheader.setText(btn7.getText());
                angle = res.getInteger(R.integer.BCangle7);
                mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,angle);
                mConstraintSetBaltext.applyTo(mConstraintLayout);
                break;
            case R.id.x8:
                textView.setText(getString(R.string.ShapeTxt));
                textViewheader.setText(btn8.getText());
                angle = res.getInteger(R.integer.BCangle8);
                mConstraintSetBaltext.constrainCircle(view_instance.getId(),b,160,angle);
                mConstraintSetBaltext.applyTo(mConstraintLayout);
                break;
            case R.id.x9:
                textView.setText(getString(R.string.AromaticTxt));
                textViewheader.setText(btn9.getText());
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

    }


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
}