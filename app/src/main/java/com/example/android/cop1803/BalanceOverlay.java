package com.example.android.cop1803;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v4.app.DialogFragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class BalanceOverlay extends DialogFragment implements View.OnClickListener {
    public Button btn0;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12;
    private Triangle tri1;private static ArrayList<Button> buttonsbalance = new ArrayList<Button>();
    private int balancetextwidth;
    private int balancetextheight;
    public ConstraintSet mConstraintSetBaltext = new ConstraintSet(); // create a Constraint Set clone
    public ConstraintLayout mConstraintLayout; // cache the ConstraintLayout
    protected  View bview;
    public long value;
    public List<LineView> mLine = new ArrayList<>();
    MainActivity mMainActivit = new MainActivity();
    Globals g =Globals.getInstance();
    private int someStateValue;
    private final String SOME_VALUE_KEY = "someValueToSave";



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
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }
   // @Override
   /* public void onDestroyView(Bundle outState) {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        if (getDialog() == null){
            outState.putInt(SOME_VALUE_KEY, someStateValue);
        }
        super.onDestroyView();
    }*/



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setStyle(STYLE_NO_FRAME,0);

        bview=  inflater.inflate(R.layout.balance, container,false);
        if (savedInstanceState != null) {
            someStateValue = savedInstanceState.getInt(SOME_VALUE_KEY);
            // Do something with value if needed
        }
        //setRetainInstance(true);
        return bview;
    }

//Balance - The Center of the Plate

    @Override
    public void onViewCreated(final View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState != null){
            value =  savedInstanceState.getLong("param");
        }
        String title = getArguments().getString("title", "Enter Name");
        getDialog().setTitle(title);

        // Find all buttons on view
//        Dialog mDialog = getDialog();
//        int height=mDialog.getWindow().getDecorView().getHeight();
//        int width=mDialog.getWindow().getDecorView().getWidth();
//
//
//        btn0width=btn0.getWidth();
        btn0= view.findViewById(R.id.x0);
        btn1= view.findViewById(R.id.x1); btn2= view.findViewById(R.id.x2); btn3= view.findViewById(R.id.x3);
        btn4= view.findViewById(R.id.x4); btn5= view.findViewById(R.id.x5); btn6= view.findViewById(R.id.x6);
        btn7= view.findViewById(R.id.x7); btn8= view.findViewById(R.id.x8); btn9= view.findViewById(R.id.x9);
        btn10= view.findViewById(R.id.x10); btn11= view.findViewById(R.id.x11);btn12= view.findViewById(R.id.x12);

        //add onclick to all buttons and background

        btn0.setOnClickListener((View.OnClickListener)this);
        btn1.setOnClickListener((View.OnClickListener)this);
        btn2.setOnClickListener((View.OnClickListener)this);
        btn3.setOnClickListener((View.OnClickListener)this);
        btn4.setOnClickListener((View.OnClickListener)this);
        btn5.setOnClickListener((View.OnClickListener)this);
        btn6.setOnClickListener((View.OnClickListener)this);
        btn7.setOnClickListener((View.OnClickListener)this);
        btn8.setOnClickListener((View.OnClickListener)this);
        btn9.setOnClickListener((View.OnClickListener)this);
        btn10.setOnClickListener((View.OnClickListener)this);
        btn11.setOnClickListener((View.OnClickListener)this);
        btn12.setOnClickListener((View.OnClickListener)this);

       /* ViewTreeObserver vto = bview.getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                Button btn;
                AppBarNavBarHeight convert=new AppBarNavBarHeight();
                Context context=getContext();
                Resources res = getResources();
                Dialog mDialog = getDialog();
                int height=mDialog.getWindow().getDecorView().getHeight();
                int width=mDialog.getWindow().getDecorView().getWidth();

                //float heightdp=convert.convertPxToDp(context,height);

                float ratiofactor= res.getInteger(R.integer.b0circleratio);
                float heightratiopercent=ratiofactor/100;

                float ratiofactorouter=res.getInteger(R.integer.bOuterRingRatio);
                //float heightratiopercentouter=ratiofactorouter/100;


                ConstraintLayout.LayoutParams newLayoutParams = null;
                diameter = (int) (height * heightratiopercent);
                btn=btn0;
                setbuttondiameter(diameter, newLayoutParams, btn);

                ArrayList<Float> mRadius = new ArrayList<Float>();
                float angle=0;

                //g.setBtn0width(btn0.getWidth());
                g.setViewlinesbeingdrawn("balanceview");
                *//*Drawline drawline=new Drawline();
                drawline.drawLines(mLine,buttonsbalance,context,btn0,mTri, mRadius);*//*

                mConstraintLayout=(ConstraintLayout) getView().findViewById(R.id.mybalancelayout);
            }

        });*/

//popover

    }


private int textviewheight (){
    int textHeight,height,width;
    Context context=getContext();
    Dialog mDialog = getDialog();
    AppBarNavBarHeight convert=new AppBarNavBarHeight();
    height=mDialog.getWindow().getDecorView().getHeight();
    //width=mDialog.getWindow().getDecorView().getWidth();

    float heightdp=convert.convertPxToDp(context,height);
    float ratiofactor= getResources().getInteger(R.integer.b0circleratio);
    float heightratiopercent=ratiofactor/100;
    textHeight = (int) (height * heightratiopercent);
    return textHeight;
}

private void setWidHtTextDescriptions(int textviewHeight,View TLH,View BLH,View TRH,View BRH,View TLd,View BLd,View TRd,View BRd){
    balancetextwidth = (int) (textviewHeight * 1.2);
    balancetextheight = (int) (textviewHeight );
    //get layout for  baltext width and height
    mConstraintLayout = (ConstraintLayout) getView().findViewById(R.id.mybalancelayout);
    mConstraintSetBaltext.clone(mConstraintLayout);
    // width
    // of text header
    mConstraintSetBaltext.constrainWidth(TLH.getId(),balancetextwidth);  //set
    mConstraintSetBaltext.constrainWidth(BLH.getId(),balancetextwidth);  //set
    mConstraintSetBaltext.constrainWidth(TRH.getId(),balancetextwidth);  //set
    mConstraintSetBaltext.constrainWidth(BRH.getId(),balancetextwidth);  //set
    // width of textview
    mConstraintSetBaltext.constrainWidth(TLd.getId(),balancetextwidth);  //set
    mConstraintSetBaltext.constrainWidth(BLd.getId(),balancetextwidth);  //set
    mConstraintSetBaltext.constrainWidth(TRd.getId(),balancetextwidth);  //set
    mConstraintSetBaltext.constrainWidth(BRd.getId(),balancetextwidth);  //set

    mConstraintSetBaltext.constrainMaxHeight(R.id.balancetexttTL,balancetextheight); //constrain height of textview
    mConstraintSetBaltext.applyTo(mConstraintLayout);
     }

public void textviewVisibility(View on,View off1,View off2,View off3) {
    if(on.getVisibility() == View.VISIBLE)
        on.setVisibility(View.INVISIBLE);
    else {
        on.setVisibility(View.VISIBLE);
        off1.setVisibility(View.INVISIBLE);
        off2.setVisibility(View.INVISIBLE);
        off3.setVisibility(View.INVISIBLE);
        }
    }

// Balance ring text boxes
    @Override
    public void onClick(View v) {
        TextView headerTL,headerBL,headerTR,headerBR;
        TextView textTL,textBL,textTR,textBR;

        //headerTL = Objects.requireNonNull(getView()).findViewById(R.id.balancetextheaderTL);
        //textTL = getView().findViewById(R.id.balancetexttTL);
        headerTL = getView().findViewById(R.id.balancetextheaderTL);
        textTL = getView().findViewById(R.id.balancetexttTL);
        headerBL = getView().findViewById(R.id.balancetextheaderBL);
        textBL = getView().findViewById(R.id.balancetexttBL);
        headerTR = getView().findViewById(R.id.balancetextheaderTR);
        textTR = getView().findViewById(R.id.balancetexttTR);
        headerBR = getView().findViewById(R.id.balancetextheaderBR);
        textBR = getView().findViewById(R.id.balancetexttBR);
        textTL.setMovementMethod(new ScrollingMovementMethod());
        textBL.setMovementMethod(new ScrollingMovementMethod());
        textTR.setMovementMethod(new ScrollingMovementMethod());
        textBR.setMovementMethod(new ScrollingMovementMethod());

        int textviewHeight=textviewheight();
        setWidHtTextDescriptions(textviewHeight,headerTL,textTL,headerBL,textBL,headerTR,textTR,headerBR,textBR);

            boolean tabletSize = getResources().getBoolean(R.bool.isTablet);

            switch (v.getId()) {
                case R.id.x0:

                    textTL.setText(getString(R.string.BalanceTxt));
                    headerTL.setText(btn0.getText());
                    textviewVisibility(headerTL,headerBL,headerTR,headerBR);
                    textviewVisibility(textTL,textBL,textTR,textBR);
                    break;
                case R.id.x1:
                    textTL.setText(getString(R.string.SweetTxt));
                    headerTL.setText(btn1.getText());
                    textviewVisibility(headerTL,headerBL,headerTR,headerBR);
                    textviewVisibility(textTL,textBL,textTR,textBR);
                    break;
                case R.id.x2:
                    textTL.setText(getString(R.string.SourTxt));
                    headerTL.setText(btn2.getText());
                    textviewVisibility(headerTL,headerBL,headerTR,headerBR);
                    textviewVisibility(textTL,textBL,textTR,textBR);
                    break;
                case R.id.x3:
                    textTL.setText(getString(R.string.BitterTxt));
                    headerTL.setText(btn3.getText());
                    textviewVisibility(headerTL,headerBL,headerTR,headerBR);
                    textviewVisibility(textTL,textBL,textTR,textBR);
                    break;
               case R.id.x4:
                    textBL.setText(getString(R.string.SaltyTxt));
                    headerBL.setText(btn4.getText());
                    textviewVisibility(headerBL,headerTL,headerTR,headerBR);
                    textviewVisibility(textBL,textTL,textTR,textBR);
                    break;
               case R.id.x5:
                   textBL.setText(getString(R.string.UmamiTxt));
                   headerBL.setText(btn5.getText());
                   textviewVisibility(headerBL,headerTL,headerTR,headerBR);
                   textviewVisibility(textBL,textTL,textTR,textBR);
                   break;
                case R.id.x6:
                    textBL.setText(getString(R.string.SpicyTxt));
                    headerBL.setText(btn6.getText());
                    textviewVisibility(headerBL,headerTL,headerTR,headerBR);
                    textviewVisibility(textBL,textTL,textTR,textBR);
                    break;
                 case R.id.x7:
                    textBR.setText(getString(R.string.ColorTxt));
                    headerBR.setText(btn7.getText());
                    textviewVisibility(headerBR,headerTL,headerTR,headerBL);
                    textviewVisibility(textBR,textTL,textTR,textBL);
                    break;
                case R.id.x8:
                    textBR.setText(getString(R.string.ShapeTxt));
                    headerBR.setText(btn8.getText());
                    textviewVisibility(headerBR,headerTL,headerTR,headerBL);
                    textviewVisibility(textBR,textTL,textTR,textBL);
                    break;
                case R.id.x9:
                    textBR.setText(getString(R.string.AromaticTxt));
                    headerBR.setText(btn9.getText());
                    textviewVisibility(headerBR,headerTL,headerTR,headerBL);
                    textviewVisibility(textBR,textTL,textTR,textBL);
                    break;
                case R.id.x10:
                    textTR.setText(getString(R.string.HotTxt));
                    headerTR.setText(btn10.getText());
                    textviewVisibility(headerTR,headerTL,headerBR,headerBL);
                    textviewVisibility(textTR,textTL,textBR,textBL);
                    break;
                case R.id.x11:
                    textTR.setText(getString(R.string.TenderTxt));
                    headerTR.setText(btn11.getText());
                    textviewVisibility(headerTR,headerTL,headerBR,headerBL);
                    textviewVisibility(textTR,textTL,textBR,textBL);
                    break;
                case R.id.x12:
                    textTR.setText(getString(R.string.CrispyTxt));
                    headerTR.setText(btn12.getText());
                    textviewVisibility(headerTR,headerTL,headerBR,headerBL);
                    textviewVisibility(textTR,textTL,textBR,textBL);
                    break;
            }

//mConstraintLayout.invalidate();
    }

}

/*

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
*/

/*LineView mLineView1= getView().findViewById(R.id.LineViewb1);
        LineView mLineView2= getView().findViewById(R.id.LineViewb2);
        LineView mLineView3= getView().findViewById(R.id.LineViewb3);
        LineView mLineView4= getView().findViewById(R.id.LineViewb4);
        LineView mLineView5= getView().findViewById(R.id.LineViewb5);
        LineView mLineView6= getView().findViewById(R.id.LineViewb6);
        LineView mLineView7= getView().findViewById(R.id.LineViewb7);
        LineView mLineView8= getView().findViewById(R.id.LineViewb8);
        LineView  mLineView9= getView().findViewById(R.id.LineViewb9);
        LineView mLineView10= getView().findViewById(R.id.LineViewb10);
        LineView mLineView11= getView().findViewById(R.id.LineViewb11);
        LineView mLineView12= getView().findViewById(R.id.LineViewb12);*/

/*        mLine.add(mLineView1);
        mLine.add(mLineView2);
        mLine.add(mLineView3);
        mLine.add(mLineView4);
        mLine.add(mLineView5);
        mLine.add(mLineView6);
        mLine.add(mLineView7);
        mLine.add(mLineView8);
        mLine.add(mLineView9);
        mLine.add(mLineView10);
        mLine.add(mLineView11);
        mLine.add(mLineView12);*/


        /*final List<Triangle> mTri = new ArrayList<>();

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
*/


