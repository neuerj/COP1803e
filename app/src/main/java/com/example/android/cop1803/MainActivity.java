package com.example.android.cop1803;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity implements View.OnClickListener, RecyclerItemTouchHelper.RecyclerItemTouchHelperListener {
    //variables:
    public RecyclerView recyclerView, recycler_view2,recyclerViewMenu;
    public CopMyAdapterMain adapter;
    public CopMyAdapterChild adapterchild;
    public static CartListAdapter mAdapter;
    public CoordinatorLayout coordinatorLayout;
    public List<CopListdata> coplistdata = new ArrayList<CopListdata>();
    public List<CopListdata> coplistdatachild = new ArrayList<CopListdata>();
    public static ArrayList<Item> cartList = new ArrayList<Item>();
    public static ArrayList<ArrayList> buttonque = new ArrayList<ArrayList>();
    public static ArrayList<Button> buttonobjectque = new ArrayList<Button>();
    public static ArrayList<String> buttonquedefaulttext = new ArrayList<String>();
    public static final String TAG = "JJJMMMNNN";
    public int c=0,s=0;
    public TextView slidetodeletemsg;
    public ConstraintSet mConstraintSetrecy1 = new ConstraintSet(); // create a Constraint Set clone
    public ConstraintLayout mConstraintLayout; // cache the ConstraintLayout
    public String btnFoodClass;
    private Button btnx10;ArrayList<String> btnx10text = new ArrayList<String>();
    private Button btnx21;ArrayList<String> btnx21text = new ArrayList<String>();
    private Button btnx22;ArrayList<String> btnx22text = new ArrayList<String>();
    private Button btnx23;ArrayList<String> btnx23text = new ArrayList<String>();
    private Button btnx24;ArrayList<String> btnx24text = new ArrayList<String>();
    private Button btnx25;ArrayList<String> btnx25text = new ArrayList<String>();
    private Button btnx26;ArrayList<String> btnx26text = new ArrayList<String>();
    private Button btnx27;ArrayList<String> btnx27text = new ArrayList<String>();
    private Button btnx31;ArrayList<String> btnx31text = new ArrayList<String>();
    private Button btnx41;ArrayList<String> btnx41text = new ArrayList<String>();
    private Button btnx42;ArrayList<String> btnx42text = new ArrayList<String>();
    private Button btnx43;ArrayList<String> btnx43text = new ArrayList<String>();
    private Button btnx44;ArrayList<String> btnx44text = new ArrayList<String>();
    private Button btnx45;ArrayList<String> btnx45text = new ArrayList<String>();
    Globals g =Globals.getInstance();
    public Button ResetBtn;

    LineView mLineView1021, mLineView1022, mLineView1023, mLineView1024, mLineView1025,mLineView1026,mLineView1027,
             mLineView2131,mLineView2231,mLineView2331,mLineView2431,mLineView2531,mLineView2631,mLineView2731,
             mLineView3141,mLineView3142,mLineView3143,mLineView3144,mLineView3145;
    List<LineView> mLine = new ArrayList<>();

    PointF pointA;
    PointF pointB;
    Map<String, Button> vars = new HashMap<String, Button>();

    static TextView userMenu;
    public final static String LIST_STATE_KEY = "recycler_list_state";
    Parcelable listState;

    private BalanceOverlay fragmentSimple;
    private final String SIMPLE_FRAGMENT_TAG = "myfragmenttag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* fragmentSimple=new BalanceOverlay();
        if (savedInstanceState != null) { // saved instance state, fragment may exist
            // look up the instance that already exists by tag
            fragmentSimple = (BalanceOverlay)
                    getSupportFragmentManager().findFragmentByTag(SIMPLE_FRAGMENT_TAG);
        } else if (fragmentSimple == null) {
            // only create fragment if they haven't been instantiated already
            fragmentSimple = new BalanceOverlay();
        }

        if (!fragmentSimple.isInLayout()) {
            getSupportFragmentManager()
                   .beginTransaction()
                    .replace(R.id.container, fragmentSimple, SIMPLE_FRAGMENT_TAG)
                    .commit();
        }
*/
       final LayoutCustom mainlayout=(LayoutCustom) this.getLayoutInflater().inflate(R.layout.activity_main, null);
        //**************
        // set a global layout listener which will be called when the layout pass is completed and the view is drawn
        mainlayout.getViewTreeObserver().addOnGlobalLayoutListener(
                new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        mAdapter = new CartListAdapter(MainActivity.this, cartList);
                        recyclerViewMenu.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                        recyclerViewMenu.setItemAnimator(new DefaultItemAnimator());
                        recyclerViewMenu.addItemDecoration(new DividerItemDecoration(MainActivity.this, DividerItemDecoration.VERTICAL));
                        recyclerViewMenu.setAdapter(mAdapter);
                        g.setCurrentclick("initclick");
                        g.setRecyclertouch(GlobalVariables.FALSE);
                        Cyclebuttons(mainlayout);
                        g.setBtn0width(btnx31.getWidth());
                        g.setViewlinesbeingdrawn("mainview");
                        drawLines(mLine);
                        //Remove the listener before proceeding
                        mainlayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                }
        );
        setContentView(mainlayout);

//************ menulist *********
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(getString(R.string.my_cart));
      //  getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerViewMenu = findViewById(R.id.recycler_viewItemList);
        coordinatorLayout = findViewById(R.id.coordinator_layout);
        if(cartList.size()==0) {
            cartList.add(new Item("Today's Special", "", "", "", "", ""));
        }
        slidetodeletemsg=findViewById(R.id.textView2);
        Button ResetBtn =findViewById(R.id.ResetBtn);
        ResetBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                emptyCart();
            }
        });

        // adding item touch helper
        // only ItemTouchHelper.LEFT added to detect Right to Left swipe
        // if you want both Right -> Left and Left -> Right
        // add pass ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT as param
        ItemTouchHelper.SimpleCallback itemTouchHelperCallback = new RecyclerItemTouchHelper(0, ItemTouchHelper.LEFT, this);
        new ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(recyclerViewMenu);
        //prepareCart();

        // making http call and fetching menu json

//************************

        btnx10=findViewById(R.id.MainCOPbtn);
        btnx10.setOnClickListener(this); // calling onClick() method
        btnx21=findViewById(R.id.x21);
        btnx21.setOnClickListener(this); // calling onClick() method
        btnx22=findViewById(R.id.x22);
        btnx22.setOnClickListener(this); // calling onClick() method
        btnx23=(Button)findViewById(R.id.x23);
        btnx23.setOnClickListener(this); // calling onClick() method
        btnx24=(Button)findViewById(R.id.x24);
        btnx24.setOnClickListener(this); // calling onClick() method
        btnx25=(Button)findViewById(R.id.x25);
        btnx25.setOnClickListener(this); // calling onClick() method
        btnx26=(Button)findViewById(R.id.x26);
        btnx26.setOnClickListener(this); // calling onClick() method
        btnx27=(Button)findViewById(R.id.x27);
        btnx27.setOnClickListener(this); // calling onClick() method
        btnx31=(Button)findViewById(R.id.x31);
        btnx31.setOnClickListener(this); // calling onClick() method
        btnx41=(Button)findViewById(R.id.x41);
        btnx41.setOnClickListener(this); // calling onClick() method
        btnx42=(Button)findViewById(R.id.x42);
        btnx42.setOnClickListener(this); // calling onClick() method
        btnx43=(Button)findViewById(R.id.x43);
        btnx43.setOnClickListener(this); // calling onClick() method
        btnx44=(Button)findViewById(R.id.x44);
        btnx44.setOnClickListener(this); // calling onClick() method
        btnx45=(Button)findViewById(R.id.x45);
        btnx45.setOnClickListener(this); // calling onClick() method

        mLineView1021=findViewById(R.id.LineView1021);
        mLineView1022=findViewById(R.id.LineView1022);
        mLineView1023=findViewById(R.id.LineView1023);
        mLineView1024=findViewById(R.id.LineView1024);
        mLineView1025=findViewById(R.id.LineView1025);
        mLineView1026=findViewById(R.id.LineView1026);
        mLineView1027=findViewById(R.id.LineView1027);
        mLine.add(mLineView1021);mLine.add(mLineView1022);mLine.add(mLineView1023);mLine.add(mLineView1024);mLine.add
                (mLineView1025);mLine.add(mLineView1026);mLine.add(mLineView1027);

        mLineView2131=findViewById(R.id.LineView2131);
        mLineView2231=findViewById(R.id.LineView2231);
        mLineView2331=findViewById(R.id.LineView2331);
        mLineView2431=findViewById(R.id.LineView2431);
        mLineView2531=findViewById(R.id.LineView2531);
        mLineView2631=findViewById(R.id.LineView2631);
        mLineView2731=findViewById(R.id.LineView2731);
        mLine.add(mLineView2131); mLine.add(mLineView2231); mLine.add(mLineView2331); mLine.add(mLineView2431); mLine.add
                (mLineView2531); mLine.add(mLineView2631); mLine.add(mLineView2731);

        mLineView3141=findViewById(R.id.LineView3141);
        mLineView3142=findViewById(R.id.LineView3142);
        mLineView3143=findViewById(R.id.LineView3143);
        mLineView3144=findViewById(R.id.LineView3144);
        mLineView3145=findViewById(R.id.LineView3145);
        mLine.add(mLineView3141);mLine.add(mLineView3142);mLine.add(mLineView3143);mLine.add(mLineView3144);mLine.add
                (mLineView3145);

//        mlines = new LineView[]{mLineView1021, mLineView1022, mLineView1023, mLineView1024, mLineView1025, mLineView1026,
//                mLineView1027};

        vars.put("btnx10",btnx10);
        vars.put("btnx21",btnx21);
        vars.put("btnx22",btnx22);
        vars.put("btnx23",btnx23);
        vars.put("btnx24",btnx24);
        vars.put("btnx25",btnx25);
        vars.put("btnx26",btnx26);
        vars.put("btnx27",btnx27);
        vars.put("btnx31",btnx31);
        vars.put("btnx41",btnx41);
        vars.put("btnx42",btnx42);
        vars.put("btnx43",btnx43);
        vars.put("btnx44",btnx44);
        vars.put("btnx45",btnx45);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.MainCOPbtn:
                btnFoodClass= "MainCOPbtn";
                String buttontextdefault= (String) btnx10.getText();
                recyecleviews(btnFoodClass,btnx10,btnx10text,buttontextdefault);
                float biasedValue = 0.0f;
                int butConstraint=v.getId();
                repositionRv(btnFoodClass);

                break;

            case R.id.x21:
                 btnFoodClass= "btnx21";
                buttontextdefault= (String) btnx21.getText();
                recyecleviews(btnFoodClass,btnx21,btnx21text,buttontextdefault);
                biasedValue = 0.3f;
                butConstraint=v.getId();
                repositionRv(btnFoodClass);
                break;

            case R.id.x22:
                btnFoodClass= "btnx22";
                buttontextdefault= (String) btnx22.getText();
                recyecleviews(btnFoodClass,btnx22,btnx22text,buttontextdefault);
                butConstraint=v.getId();
                repositionRv(btnFoodClass);
                break;
            case R.id.x23:
                btnFoodClass= "btnx23";
                buttontextdefault= (String) btnx23.getText();
                recyecleviews(btnFoodClass,btnx23,btnx23text,buttontextdefault);
                butConstraint=v.getId();
                repositionRv(btnFoodClass);
                break;
            case R.id.x24:
                btnFoodClass= "btnx24";
                buttontextdefault= (String) btnx24.getText();
                recyecleviews(btnFoodClass,btnx24,btnx24text,buttontextdefault);
                butConstraint=v.getId();
                repositionRv(btnFoodClass);
                break;
            case R.id.x25:
                btnFoodClass= "btnx25";
                buttontextdefault= (String) btnx25.getText();
                recyecleviews(btnFoodClass,btnx25,btnx25text,buttontextdefault);
                butConstraint=v.getId();
                repositionRv(btnFoodClass);
                break;
            case R.id.x26:
                btnFoodClass= "btnx26";
                buttontextdefault= (String) btnx26.getText();
                recyecleviews(btnFoodClass,btnx26,btnx26text,buttontextdefault);
                butConstraint=v.getId();
                repositionRv(btnFoodClass);
                break;
            case R.id.x27:
                btnFoodClass= "btnx27";
                buttontextdefault= (String) btnx27.getText();
                showBalanceDialog();

                //recyecleviews(btnFoodClass,btnx27,btnx27text,buttontextdefault);
                butConstraint=v.getId();
                repositionRv(btnFoodClass);
                break;
            case R.id.x31:
                btnFoodClass= "btnx31";
                buttontextdefault= (String) btnx31.getText();
                recyecleviews(btnFoodClass,btnx31,btnx31text,buttontextdefault);
                butConstraint=v.getId();
                repositionRv(btnFoodClass);
                break;
            case R.id.x41:
                btnFoodClass= "btnx41";
                buttontextdefault= (String) btnx41.getText();
                recyecleviews(btnFoodClass,btnx41,btnx41text,buttontextdefault);
                butConstraint=v.getId();
                repositionRv(btnFoodClass);
                break;
            case R.id.x42:
                btnFoodClass= "btnx42";
                buttontextdefault= (String) btnx42.getText();
                recyecleviews(btnFoodClass,btnx42,btnx22text,buttontextdefault);
                butConstraint=v.getId();
                repositionRv(btnFoodClass);
                break;
            case R.id.x43:
                btnFoodClass= "btnx43";
                buttontextdefault= (String) btnx43.getText();
                recyecleviews(btnFoodClass,btnx43,btnx43text,buttontextdefault);
                butConstraint=v.getId();
                repositionRv(btnFoodClass);
                break;
            case R.id.x44:
                btnFoodClass= "btnx44";
                buttontextdefault= (String) btnx44.getText();
                recyecleviews(btnFoodClass,btnx44,btnx44text,buttontextdefault);
                butConstraint=v.getId();
                repositionRv(btnFoodClass);
                break;
            case R.id.x45:
                btnFoodClass= "btnx45";
                buttontextdefault= (String) btnx45.getText();
                recyecleviews(btnFoodClass,btnx45,btnx45text,buttontextdefault);
                butConstraint=v.getId();
                repositionRv(btnFoodClass);
                break;
            default:
                break;
        }}

    public void recyecleviews(final String foodclass,Button curbutton,ArrayList
            currentbuttontext,String buttontextdefault){
        if (c == 0) {
            g.setIsToogleflagon(GlobalVariables.TRUE);
        }
        if (c > 0) {
            g.setIsToogleflagon(GlobalVariables.FALSE);
        }
        g.setCurrentbutton(curbutton);
        g.setCurrentbuttontext(currentbuttontext);   //array each buttons text
        g.setBtnDefaulttext(buttontextdefault);

        c++;
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setHasFixedSize(true);
        recyclerView.bringToFront();

        coplistdata = CopData.LoadDataCopButton(foodclass);
        recyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this, LinearLayoutManager.VERTICAL));
        adapter = new CopMyAdapterMain(this, coplistdata, new CopMyAdapterMain.OnCopClickListner() {

            @Override
            public void onClicked(CopListdata copchild) {
                int img = (copchild).getImageId();
                boolean isCheck = SelectKeep.IsChecked(img);
                if (!isCheck) {
                    String fooditem2 =foodclass.trim() + "_" + copchild.get_itemname().trim();
                    // TODO : Update your another adapter of another recyclerview.
                    recycler_view2 = findViewById(R.id.recycler_view2);
                    recycler_view2.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                    recycler_view2.setHasFixedSize(true);
                    recycler_view2.bringToFront();
                    coplistdatachild = CopDataSub.LoadDataCopChildButton(fooditem2);
                    recycler_view2.addItemDecoration(new DividerItemDecoration(MainActivity.this, LinearLayoutManager.VERTICAL));
                    adapterchild = new CopMyAdapterChild(coplistdatachild, MainActivity.this);
                    recycler_view2.setAdapter(adapterchild);
                    recycler_view2.setVisibility(recycler_view2.VISIBLE);
                }
            }
        });
        recyclerView.setAdapter(adapter);
        recyclerView.setVisibility(recyclerView.VISIBLE);
    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
          switch (ev.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "Activity dispatchTouchEvent DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "Activity dispatchTouchEvent MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "Activity dispatchTouchEvent UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "Activity dispatchTouchEvent CANCEL");
                break;
        }
        boolean b = super.dispatchTouchEvent(ev);
        Log.d(TAG, "Activity dispatchTouchEvent RETURNS " + b);
        if (b == false ) {
            Log.d(TAG, "False is returned hide all recycler views" + b);
            if(ev.getActionMasked()==MotionEvent.ACTION_UP){
                String bclick="none";
                String aclick="none";
                String btouch=g.getButtontouch();
                if(btouch!= null) {
                    looprecycleview(bclick, aclick, btouch);
                }
            }
        } else {
            Log.d(TAG, "True is returned evaluate which recycler views to hide" + b);
            String btouch=g.getButtontouch();
            String bclick=g.getCurrentclick();
            String aclick=g.getJustclicked();

            looprecycleview(bclick,aclick,btouch);
        }
        return b;
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getActionMasked()) {
           case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "Activity onTouch DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "Activity onTouch MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "Activity onTouch UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "Activity onTouch CANCEL");
                break;
        }
        boolean b = super.onTouchEvent(event);
        Log.d(TAG, "Activity onTouchEvent RETURNS " + b);
        return b;
    }
    protected void onSaveInstanceState(Bundle state) {
        if(s==1){
        super.onSaveInstanceState(state);
        // Save list state
        listState = recyclerViewMenu.getLayoutManager().onSaveInstanceState();
        state.putParcelable(LIST_STATE_KEY, listState);}
        s=1;
    }
    protected void onRestoreInstanceState(Bundle state) {
        super.onRestoreInstanceState(state);
        // Retrieve list state and list/item positions
        if(state != null)
            listState = state.getParcelable(LIST_STATE_KEY);
    }
    @Override
    protected void onResume() {
        super.onResume();
        if (listState != null ) {
            recyclerViewMenu.getLayoutManager().onRestoreInstanceState(listState);
        }
         }
    private void looprecycleview(String beforeclick,String afterclick,String buttontouch) {
        LayoutCustom layoutMyLayout;
        layoutMyLayout = findViewById(R.id.mylayoutcustom);
        String recyclertouch=g.getRecyclertouch();
        switch (buttontouch){
            case "false":
                if(recyclertouch=="false"){
                    if (((layoutMyLayout != null) && (recycler_view2 != null) && (recycler_view2.getVisibility() == recycler_view2.VISIBLE))) {
                        recycler_view2.setVisibility(recycler_view2.INVISIBLE);
                    }else
                    {
                    if (((layoutMyLayout != null) && (recyclerView != null) && (recyclerView.getVisibility() == recyclerView.VISIBLE))) {
                       recyclerView.setVisibility(recyclerView.INVISIBLE);
                    }}
                }
                break;
            case "true":
                if(beforeclick!=afterclick && afterclick!="Reset")
                {
                    if ((layoutMyLayout != null) && (recycler_view2 != null) && (recycler_view2.getVisibility() == recycler_view2.VISIBLE)) {
                        recycler_view2.setVisibility(recycler_view2.INVISIBLE);
                    }
                    if ((recyclerView != null) && (recyclerView.getVisibility() == recyclerView.VISIBLE)){
                        recyclerView.setVisibility(recyclerView.INVISIBLE);
                        g.setRecyclertouch(GlobalVariables.FALSE);
                    };
                }
                g.setCurrentclick(g.getJustclicked());
                g.setButtontouch(GlobalVariables.FALSE);
                break;
        }
    }
    public void drawLines(List<LineView> mlinesToDraw) {
        String btn1,btn11,btn2,btn22,btnprefix;
        int startIndex1,endIndex1,startIndex2,endIndex2;
        float centerXOnImage1;
        double centerYOnImage1;
        float centerXOfImageOnScreen1;
        double centerYOfImageOnScreen1;
        float centerXOnImage2;
        double centerYOnImage2;
        float centerXOfImageOnScreen2;
        double centerYOfImageOnScreen2;
        int actionBarHeight;



        startIndex1=8;
        endIndex1=10;
        startIndex2=10;
        endIndex2=12;
        btnprefix="btnx";

        // Calculate ActionBar height
        actionBarHeight=gactionbarheight();

        for (int i = 0; i < mlinesToDraw.size(); i++)
             {
                int lineID= mlinesToDraw.get(i).getId();
            String linename= getResources().getResourceEntryName(lineID);
            btn1 = linename.substring(startIndex1, endIndex1);
            btn2 = linename.substring(startIndex2, endIndex2);

           btn11=btnprefix+btn1;
           Button vBtn1=vars.get(btn11);
           btn22=btnprefix+btn2;
           Button vBtn2=vars.get(btn22);

           centerXOnImage1=vBtn1.getWidth()/2;
           centerYOnImage1=(vBtn1.getHeight()-actionBarHeight)/2;
           centerXOfImageOnScreen1=vBtn1.getLeft()+centerXOnImage1;
           centerYOfImageOnScreen1=vBtn1.getTop()+(centerYOnImage1);

           centerXOnImage2=vBtn2.getWidth()/2;
           centerYOnImage2=(vBtn2.getHeight()-actionBarHeight)/2;
           centerXOfImageOnScreen2=vBtn2.getLeft()+centerXOnImage2;
           centerYOfImageOnScreen2=vBtn2.getTop()+centerYOnImage2;

            pointA=new PointF(centerXOfImageOnScreen1, (float) centerYOfImageOnScreen1);
            pointB=new PointF(centerXOfImageOnScreen2,(float) centerYOfImageOnScreen2);

            mLine.get(i).setPointA(pointA);
            mLine.get(i).setPointB(pointB);
            mLine.get(i).draw();
        }




    }
    public void Cyclebuttons(ViewGroup parent) {
       int abh=gactionbarheight();
       ConstraintSet set = new ConstraintSet();
       set.connect(btnx10.getId(), ConstraintSet.TOP,
               ConstraintSet.PARENT_ID, ConstraintSet.TOP, gactionbarheight());

       set.connect(btnx21.getId(), ConstraintSet.TOP,
               ConstraintSet.PARENT_ID, ConstraintSet.TOP, gactionbarheight());

       set.connect(btnx31.getId(), ConstraintSet.TOP,
               ConstraintSet.PARENT_ID, ConstraintSet.TOP, gactionbarheight());

       set.connect(btnx41.getId(), ConstraintSet.TOP,
               ConstraintSet.PARENT_ID, ConstraintSet.TOP, gactionbarheight());
   }

    int gactionbarheight() {
       // Calculate ActionBar height
       TypedValue tv = new TypedValue();
       int actionBarHeight = 0;

       if (getTheme().resolveAttribute(android.R.attr.actionBarSize, tv, true)) {
           actionBarHeight = TypedValue.complexToDimensionPixelSize(tv.data, getResources().getDisplayMetrics());
       }
       return actionBarHeight;
   }
    public void repositionRv(String btnFoodClass ) {

        boolean tabletSize = getResources().getBoolean(R.bool.isTablet);
        if (tabletSize) {

            mConstraintLayout = (ConstraintLayout) findViewById(R.id.mylayoutcustom);
            mConstraintSetrecy1.clone(mConstraintLayout); // get constraints from ConstraintSet

            if ((btnFoodClass.equals("MainCOPbtn"))) {

                mConstraintSetrecy1.connect(R.id.recycler_view, 6, R.id.MainCOPbtn, 7);
                // mConstraintSetrecy1.connect(R.id.recycler_view2, 7,R.id.x25 , 6);

            }
            if ((btnFoodClass.equals("btnx21"))
                    || (btnFoodClass.equals("btnx22"))
                    || (btnFoodClass.equals("btnx23"))
                    || (btnFoodClass.equals("btnx24"))
                    || (btnFoodClass.equals("btnx25"))
                    || (btnFoodClass.equals("btnx26"))
                    || (btnFoodClass.equals("btnx27"))) {
                mConstraintSetrecy1.connect(R.id.recycler_view, 6, R.id.x25, 7);
            }
            if ((btnFoodClass.equals("btnx31"))) {
                mConstraintSetrecy1.connect(R.id.recycler_view, 6, R.id.x31, 7);
            }

            if ((btnFoodClass.equals("btnx41"))
                    || (btnFoodClass.equals("btnx42"))
                    || (btnFoodClass.equals("btnx43"))
                    || (btnFoodClass.equals("btnx44"))
                    || (btnFoodClass.equals("btnx45"))
                    || (btnFoodClass.equals("btnx66"))
                    ) {
                mConstraintSetrecy1.connect(R.id.recycler_view, 6, R.id.x31, 7);
            }

            mConstraintSetrecy1.applyTo(mConstraintLayout);
        }
        }

//    public static void updateuserlist(String Cselect) {
//
//        cartList.add(new Item(Cselect, "0"));
//        prepareCart();
      //  TextView myTextView = (TextView) myTextView.findViewById(updateuserlist();
//        userMenu.setText(null);
//
//
//       for (int i = 1; i < GlobalVariables.MSelectedItems.size(); i++){
//            String menuItem= String.valueOf(GlobalVariables.MSelectedItems.get(i));
//           menuItem = menuItem.replace("\\\n", System.getProperty("line.separator"));
//            userMenu.append(menuItem);
//        }
//    }


    public static void  emptyCart(){
        // adding items to cart list
       // cartList.clear();
       cartList.removeAll(cartList);
       mAdapter.notifyDataSetChanged();
        if(cartList.size()==0) {
            cartList.add(new Item("Today's Special", "", "", "", "", ""));
    }
}
    public void removeFromList(int position) {
        int x=0;
        for (Object btext: g.getCurrentbuttontext() ){
        if (btext==cartList.get(position).name){
            g.getCurrentbuttontext().remove(x);
            buttonque.remove(x);
            buttonobjectque.remove(x);
            buttonquedefaulttext.remove(x);
            }
        x++;
        }

        cartList.remove(position);
       mAdapter.notifyItemRemoved(position);
    }
    public void addToList(String item,String Kcal,String fat,String cho,String pro) {
        g.getCurrentbuttontext().add(item);
        cartList.add(new Item(item,"desc",Kcal,fat,cho,pro));
        buttonobjectque.add(g.getCurrentbutton());        //button tied to menu item
        buttonque.add(g.getCurrentbuttontext());          //array of button text tied to each button
        buttonquedefaulttext.add(g.getBtnDefaulttext());  //array of current buttons default text // , string
        mAdapter.notifyDataSetChanged();
    }
    public void buttontext(Context context){
    // **** change button text and background color based on selection ******
        String btextall="";
        for (Object btext: g.getCurrentbuttontext() ) {
            btextall=btextall+"\n"+btext;
        }
        int btnId=((MainActivity) context).btnx10.getId();
        String btnMainName=((MainActivity) context).getResources().getResourceEntryName(btnId);
        Button btnCurrent=g.getCurrentbutton();
        int btnCurrentid=btnCurrent.getId();
        String btnCurrentName=((MainActivity) context).getResources().getResourceEntryName(btnCurrentid);

        if(btnCurrentName.equals(btnMainName)){
          LayerDrawable layerDrawable = (LayerDrawable)  ContextCompat.getDrawable(context,R
          .drawable.shapecopmainbutton);
          GradientDrawable gradientDrawable = (GradientDrawable) layerDrawable
            .findDrawableByLayerId(R.id.gradientDrawbleRing);
        if((btextall.length())>0) {
            g.getCurrentbutton().setText(btextall);
            int colors[] = {Color.WHITE,0xffE29D57};
           // int colors[] = {0xffef9f44,Color.WHITE,0xffE29D57};
            gradientDrawable.setColors(colors);
        }
        else
        {   g.getCurrentbutton().setText(g.getBtnDefaulttext());
            int colors[] = {Color.WHITE,0xff579fe2};
          //  int colors[] = {0xff449DEF,Color.WHITE,0xff579fe2};
            gradientDrawable.setColors(colors);
        }
        g.getCurrentbutton().setBackground(layerDrawable);
        }
        else {

                GradientDrawable gradientDrawable = (GradientDrawable) ContextCompat.getDrawable(context, R
                        .drawable.copbutton);
                gradientDrawable.mutate();
                if ((btextall.length()) > 0) {
                    g.getCurrentbutton().setText(btextall);
                    int colors2[] = {0xffef9f44,Color.WHITE,0xffE29D57};
                    gradientDrawable.setColors(colors2);
                } else {
                    g.getCurrentbutton().setText(g.getBtnDefaulttext());
                    int colors2[] = {0xff449DEF,Color.WHITE,0xff579fe2};
                    gradientDrawable.setColors(colors2);
                }
                g.getCurrentbutton().setBackground(gradientDrawable);
       }
    }


    /**
     * callback when recycler view is swiped
     * item will be removed on swiped
     * undo option will be provided in snackbar to restore the item
     */
    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction, int position) {

        if (viewHolder instanceof CartListAdapter.MyViewHolder) {
            // get the removed item name to display it in snack bar
            String name = cartList.get(viewHolder.getAdapterPosition()).getName();

                // backup of removed item for undo purpose
                final Item deletedItem = cartList.get(viewHolder.getAdapterPosition());
                final int deletedIndex = viewHolder.getAdapterPosition();

                // remove the item from recycler view
            mAdapter.removeItem(viewHolder.getAdapterPosition());

            ArrayList btntextarray=buttonque.get(deletedIndex-1);
            int x=0;
            for (Object btext: btntextarray ){
                if (btext.toString()==name){
                    btntextarray.remove(x);
                    g.setCurrentbuttontext(btntextarray);
                }
                x++;
            }
            Button btncurrent=buttonobjectque.get(deletedIndex-1);
            String btndefaulttext=buttonquedefaulttext.get(deletedIndex-1);
            if(buttonque.size()==0)  // Replace button text with default text since buttonque is
                // empty
            {
                g.getCurrentbuttontext().add(btndefaulttext.toString());
                g.setCurrentbuttontext(btntextarray);
                buttontext(this);
            }
            else {
                g.setCurrentbuttontext(btntextarray);
                buttontext(this);
            }
            if (( (this.recycler_view2 != null) && (recycler_view2.getVisibility() == this.recycler_view2.VISIBLE))) {
                this.adapterchild.notifyDataSetChanged();}
            else
            {   this.adapter.notifyDataSetChanged();}

                // showing snack bar with Undo option
//                Snackbar snackbar = Snackbar.make(coordinatorLayout, name + " removed from cart!", Snackbar.LENGTH_LONG);
//                snackbar.setAction("UNDO", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//
//                        // undo is selected, restore the deleted item
//                        mAdapter.restoreItem(deletedItem, deletedIndex);
//                    }
//                });
//                snackbar.setActionTextColor(Color.YELLOW);
//                snackbar.show();

        }

    }

    // Menu icons are inflated just as they were with actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.copmenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mShare:
                Intent share = new Intent(android.content.Intent.ACTION_SEND);
                share.setType("text/plain");
                share.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);
                share.putExtra(Intent.EXTRA_SUBJECT,  "The Center of the Plate Menu");
                share.putExtra(Intent.EXTRA_TEXT, getMyStringMessage(cartList));
                startActivity(Intent.createChooser(share, "Share"));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    private String getMyStringMessage(ArrayList<Item> arr) {
        StringBuilder builder = new StringBuilder();
        String menuI = "Menu Item",space;
        Integer maxlength=0;
        Integer menulength=0;
        Integer diff,y,x;
        String nameholder="";
        String bullet = "• ";

        maxlength= (menuI).length();

        if (maxlength > menulength) {
             diff = maxlength - menulength;
            space = "               ";
            for ( x = 1; x <= diff; x = x + 1) {

                menuI = menuI + " ";
                space = space + " ";
            }
        }
        builder.append(arr.get(0).name);
        builder.append('\n');
        builder.append(("        "));
        builder.append('\n');
        builder.append(menuI + "            KCalories " + "  Fat " + " Cholesterol " + " Protien ");
        builder.append('\n');
        builder.append("_______________________________________________________________________________________________________________________");
        builder.append('\n');

        y=0;
        maxlength=0;
        for (Item s : arr)  //determine max length
         {
            Integer checkmax = (s.name).length();
            if ((checkmax > maxlength)&&(y>0)) {
                maxlength = checkmax.intValue();
            }
            y=1;
          }

          y=0;
        for (Item s : arr)  //process spacing of items based on max length
        {
            if(y>0){
            space = " ";
            nameholder = (s.name) + " ";
            diff=(maxlength-(s.name).length());
            for ( x = 0; x <= diff; x = x + 1) {
                nameholder = nameholder + " ";
            }
            builder.append(bullet + nameholder + "      " + s.KCal + "      " + s.Fat + "          " + s.Cho + "       " + s.Pro);
            builder.append('\n');
            }
            y=1;
        }


        return builder.toString();
    }
    private void showBalanceDialog() {
        FragmentManager fm = getSupportFragmentManager();
        fragmentSimple = BalanceOverlay.newInstance("Balance Overlay");
        fragmentSimple.setRetainInstance(true);
        fragmentSimple.show(fm, "Balance");
    }
    @Override
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        // Save current View's state here
        return bundle;
    }
    @Override
    public void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState((Bundle) state);
        // Restore View's state here
    }
}













/*            for (int x = 0; x < layoutMyLayout.getChildCount(); x++) {
                View viewChild1 = layoutMyLayout.getChildAt(x);
                    if (viewChild1 instanceof RecyclerView) {
                    int currentRcycView=((MyRecyclerView) viewChild1).getId();
                    if(currentRcycView==recy1){
                        if(recycler_view2.getVisibility()==recycler_view2.VISIBLE){
                            recycler_view2.setVisibility(recycler_view2.INVISIBLE);
                        } else {
                            recyclerView.setVisibility(recyclerView.INVISIBLE);
                        }
                    }


                }
            }*/

/*            recycler_test =  findViewById(R.id.recycler_test);
            recycler_test.setLayoutManager(new LinearLayoutManager(MainActivity.this));
            recycler_test.setHasFixedSize(true);
            recycler_test.bringToFront();
            coplistdata=CopData.LoadDataCopButton();
            recycler_test.addItemDecoration(new DividerItemDecoration(MainActivity.this, LinearLayoutManager.VERTICAL));
            adaptertest=new CopMyAdapterMain(this,coplistdata, new CopMyAdapterMain.OnCopClickListner() {

                @Override
                public void onClicked(CopListdata copchild) {
//                  String fooditem = getApplicationContext().toString().trim();
                    String fooditem2 = copchild.get_itemname().trim();
                }
            });
            recycler_test.setAdapter(adaptertest);*/


    /* recycler_view2 =  findViewById(R.id.recycler_view2);
    recycler_view2.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    recycler_view2.setHasFixedSize(true);
    recycler_view2.bringToFront();
    coplistdatachild=CopData.LoadDataCopChildButton();
    recycler_view2.addItemDecoration(new DividerItemDecoration(MainActivity.this, LinearLayoutManager.VERTICAL));
    adapterchild=new CopMyAdapterChild(coplistdatachild,MainActivity.this);
    recycler_view2.setAdapter(adapterchild);*/



// recyclerView.setAdapter(adapter);

    /*adapter=new CopMyAdapterMain(coplistdata);
    recyclerView.setAdapter(adapter);*/






    // row click listener
  /*  recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
        @Override
        public void onClick(View view, int position) {
            Movie movie = movieList.get(position);
            Toast.makeText(getApplicationContext(), movie.getTitle() + " is selected!", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onLongClick(View view, int position) {

        }
    }));*/

    //recyclerView.setHasFixedSize(true);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//


       // recyclerView = findViewById(R.id.recycler_view);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //recyclerView.bringToFront();
        //coplistdata=CopData.LoadDataCopButton();

       // adapter=new CopMyAdapter(coplistdata,this);
       // recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        //recyclerView.setAdapter(adapter);








//        recyclerView.bringToFront();
//        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
//        mAdapter = new CopMyAdapter(mAdapter);
//        recyclerView.setLayoutManager(mLayoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//        recyclerView.setAdapter(mAdapter);

//        prepareMovieData();


//    proteins.add(new Protein("chicken","protein","bird"));
//            proteins.add(new Protein("Game","protein","bird"));
//            proteins.add(new Protein("Goose","protein","bird"));
 /*   private void prepareMovieData() {


        mAdapter.notifyDataSetChanged();*/





//       ArrayList<CopData> copdata=new ArrayList<>();//
//        movie = new Movie("Inside Out", "Animation, Kids & Family", "2015");
//        movieList.add(movie);
//
//        movie = new Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
//        movieList.add(movie);
//
//        movie = new Movie("Shaun the Sheep", "Animation", "2015");
//        movieList.add(movie);
//
//        movie = new Movie("The Martian", "Science Fiction & Fantasy", "2015");
//        movieList.add(movie);
//
//        movie = new Movie("Mission: Impossible Rogue Nation", "Action", "2015");
//        movieList.add(movie);
//
//        movie = new Movie("Up", "Animation", "2009");
//        movieList.add(movie);
//
//        movie = new Movie("Star Trek", "Science Fiction", "2009");
//        movieList.add(movie);
//
//        movie = new Movie("The LEGO Movie", "Animation", "2014");
//        movieList.add(movie);
//
//        movie = new Movie("Iron Man", "Action & Adventure", "2008");
//        movieList.add(movie);
//
//        movie = new Movie("Aliens", "Science Fiction", "1986");
//        movieList.add(movie);
//
//        movie = new Movie("Chicken Run", "Animation", "2000");
//        movieList.add(movie);
//
//        movie = new Movie("Back to the Future", "Science Fiction", "1985");
//        movieList.add(movie);
//
//        movie = new Movie("Raiders of the Lost Ark", "Action & Adventure", "1981");
//        movieList.add(movie);
//
//        movie = new Movie("Goldfinger", "Action & Adventure", "1965");
//        movieList.add(movie);
//
//        movie = new Movie("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
//        movieList.add(movie);




/*
    public static void buttonEffect(View button){
        button.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        v.getBackground().setColorFilter(0xe0f47521, PorterDuff.Mode.SRC_ATOP);
                        v.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_UP: {
                        v.getBackground().clearColorFilter();
                        v.invalidate();
                        break;
                    }
                }
                return false;
            }
        });
    }*/
