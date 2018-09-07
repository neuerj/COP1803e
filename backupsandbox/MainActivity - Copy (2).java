package com.example.android.cop1803;

import android.graphics.PointF;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public RecyclerView recyclerView, recycler_view2, recycler_test;
    public CopMyAdapterMain adapter, adaptertest;
    public CopMyAdapterChild adapterchild;
    public List<CopListdata> coplistdata = new ArrayList<CopListdata>();
    public List<CopListdata> coplistdatachild = new ArrayList<CopListdata>();
    public static final String TAG = "JJJMMMNNN";
    public int c=0;
    Globals g =Globals.getInstance();

    private Button btnx10;
    private Button btnx21;
    private Button btnx22;
    private Button btnx23;
    private Button btnx24;
    private Button btnx25;
    private Button btnx26;
    private Button btnx27;
    private Button btnx31;
    private LineView mLineView;
    PointF pointA=new PointF(10,100);
    PointF pointB = new PointF(500,400);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       final LayoutCustom mainlayout=(LayoutCustom) this.getLayoutInflater().inflate(R.layout.activity_main, null);
        //final ConstraintLayout mainlayout= (ConstraintLayout) this.getLayoutInflater().inflate(R.layout.activity_main, null);
        //**************
        // set a global layout listener which will be called when the layout pass is completed and the view is drawn
        mainlayout.getViewTreeObserver().addOnGlobalLayoutListener(
                new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        Cyclebuttons(mainlayout);
                        //Remove the listener before proceeding
                        mainlayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);


//                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
//                            mainlayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
//                        } else {
//                            mainlayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
//                        }

                        // measure your views here
                    }
                }
        );
        setContentView(mainlayout);




//************************

        Button btnx10=(Button)findViewById(R.id.MainCOPbtn);
        btnx10.setOnClickListener(this); // calling onClick() method


        Button btnx21=findViewById(R.id.x21);
        btnx21.setOnClickListener(this); // calling onClick() method
        Button btnx22=(Button)findViewById(R.id.x22);
        btnx22.setOnClickListener(this); // calling onClick() method
        Button btnx23=(Button)findViewById(R.id.x23);
        btnx23.setOnClickListener(this); // calling onClick() method
        Button btnx24=(Button)findViewById(R.id.x24);
        btnx24.setOnClickListener(this); // calling onClick() method
        Button btnx25=(Button)findViewById(R.id.x25);
        btnx25.setOnClickListener(this); // calling onClick() method
        Button btnx26=(Button)findViewById(R.id.x26);
        btnx26.setOnClickListener(this); // calling onClick() method
        Button  btnx27=(Button)findViewById(R.id.x27);
        btnx27.setOnClickListener(this); // calling onClick() method
        Button btnx31=(Button)findViewById(R.id.x31);
        btnx31.setOnClickListener(this); // calling onClick() method

        drawLines();


//        Button btn = findViewById(R.id.MainCOPbtn);
//            btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {


/*                    if (c == 0) {
                        g.setIsToogleflagon(GlobalVariables.TRUE);
                    }
                    if (c > 0) {
                        g.setIsToogleflagon(GlobalVariables.FALSE);
                    }


                    c++;
                    recyclerView = findViewById(R.id.recycler_view);
                    recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                    recyclerView.setHasFixedSize(true);
                    recyclerView.bringToFront();
                    coplistdata = CopData.LoadDataCopButton();
                    recyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this, LinearLayoutManager.VERTICAL));
                    adapter = new CopMyAdapterMain(this, coplistdata, new CopMyAdapterMain.OnCopClickListner() {

                        @Override
                        public void onClicked(CopListdata copchild) {
                            int img = (copchild).getImageId();
                            boolean isCheck = SelectKeep.IsChecked(img);
                            if (!isCheck) {
                                String fooditem2 = copchild.get_itemname().trim();
                                String fooditem2kcal = copchild.get_KCal().trim();
                       *//*  String fooditem2fat = copchild.get_itemname().trim();
                        String fooditem2cho = copchild.get_itemname().trim();
                        String fooditem2pro = copchild.get_itemname().trim();*//*

                                // TODO : Update your another adapter of another recyclerview.
                                recycler_view2 = findViewById(R.id.recycler_view2);
                                recycler_view2.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                                recycler_view2.setHasFixedSize(true);
                                recycler_view2.bringToFront();
                                coplistdatachild = CopData.LoadDataCopChildButton(fooditem2);
                                recycler_view2.addItemDecoration(new DividerItemDecoration(MainActivity.this, LinearLayoutManager.VERTICAL));
                                adapterchild = new CopMyAdapterChild(coplistdatachild, MainActivity.this);
                                recycler_view2.setAdapter(adapterchild);
                                recycler_view2.setVisibility(recycler_view2.VISIBLE);
                            }
                        }//onclick
                    });


                    recyclerView.setAdapter(adapter);
                    recyclerView.setVisibility(recyclerView.VISIBLE);*/
//
//                }
//            });
     //   }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.MainCOPbtn:
                String btnFoodClass= "MainCOPbtn";
                recyecleviews(btnFoodClass);

                break;

            case R.id.x21:
                 btnFoodClass= "btnx21";
                recyecleviews(btnFoodClass);
                break;

            case R.id.x22:
                // do your code
                break;
            case R.id.x23:
                // do your code
                break;
            case R.id.x24:
                // do your code
                break;
            case R.id.x25:
                // do your code
                break;
            case R.id.x26:
                // do your code
                break;
            case R.id.x27:
                // do your code
                break;
            case R.id.x31:
                // do your code
                break;
            default:
                break;
        }}

        public void recyecleviews(String foodclass){
        if (c == 0) {
            g.setIsToogleflagon(GlobalVariables.TRUE);
        }
        if (c > 0) {
            g.setIsToogleflagon(GlobalVariables.FALSE);
        }
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
                    String fooditem2 = copchild.get_itemname().trim();
                        // String fooditem2kcal = copchild.get_KCal().trim();
                       /*  String fooditem2fat = copchild.get_itemname().trim();
                        String fooditem2cho = copchild.get_itemname().trim();
                        String fooditem2pro = copchild.get_itemname().trim();*/

                    // TODO : Update your another adapter of another recyclerview.
                    recycler_view2 = findViewById(R.id.recycler_view2);
                    recycler_view2.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                    recycler_view2.setHasFixedSize(true);
                    recycler_view2.bringToFront();
                    coplistdatachild = CopData.LoadDataCopChildButton(fooditem2);
                    recycler_view2.addItemDecoration(new DividerItemDecoration(MainActivity.this, LinearLayoutManager.VERTICAL));
                    adapterchild = new CopMyAdapterChild(coplistdatachild, MainActivity.this);
                    recycler_view2.setAdapter(adapterchild);
                    recycler_view2.setVisibility(recycler_view2.VISIBLE);
                }
            }//onclick
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
            looprecycleview();
            }
        } else {
            Log.d(TAG, "True is returned evaluate which recycler views to hide" + b);
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

    private void looprecycleview() {
        LayoutCustom layoutMyLayout;
        layoutMyLayout = findViewById(R.id.mylayoutcustom);

        if (((layoutMyLayout != null) && (recycler_view2 != null) && (recycler_view2.getVisibility() == recycler_view2.VISIBLE))) {
            recycler_view2.setVisibility(recycler_view2.INVISIBLE);
        } else {

            if (((layoutMyLayout != null) && (recyclerView != null) && (recyclerView.getVisibility() == recyclerView.VISIBLE))) {
                recyclerView.setVisibility(recyclerView.INVISIBLE);
            }}}

    private void drawLines() {
     mLineView=(LineView) findViewById(R.id.LineView);
     mLineView.setPointA(pointA);
     mLineView.setPointB(pointB);
     mLineView.draw();
    }


   public void Cyclebuttons(ViewGroup parent) {
       int count = 0;
       for (int i = 0; i < parent.getChildCount(); i++) {
           final View child = parent.getChildAt(i);
           int[] btnlocation = new int[2];
           child.getLocationOnScreen(btnlocation);
           int x = btnlocation[0];
           int y = btnlocation[1];
        float xx= child.getX();
        float yy= child.getY();
        int Width=child.getWidth();
        int Len=child.getHeight();
        
       }
   }
//            // position in row from left to right
//            this.getChildAt(index).layout(count*this.getWidth(), 0, (count+1)*this.getWidth(), height);
//            count++;


    /*public  void getLocationOnScreen (int[] location){

        btnx10.getLocationOnScreen(location);

        // Display the Button location to TextView
        Log.d(TAG, "Button location\nx = "+location[0]+"\ny = "+ location[1]);
        // mTextView.setText("Button location\nx = "+location[0]+"\ny = "+ location[1]);*/

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
