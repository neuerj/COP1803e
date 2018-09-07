package com.example.android.cop1803;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import android.support.constraint.ConstraintLayout;

import com.example.android.cop1803.CopData;
import com.example.android.cop1803.CopListdata;
import com.example.android.cop1803.CopMyAdapterChild;
import com.example.android.cop1803.CopMyAdapterMain;
import com.example.android.cop1803.LayoutCustom;


public class MainActivity extends AppCompatActivity {
    public RecyclerView recyclerView, recycler_view2, recycler_test;
    public CopMyAdapterMain adapter, adaptertest;
    public CopMyAdapterChild adapterchild;
    public List<CopListdata> coplistdata = new ArrayList<CopListdata>();
    public List<CopListdata> coplistdatachild = new ArrayList<CopListdata>();
    public static final String TAG = "JJJMMMNNN";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.MainCOPbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           /* Toast.makeText(getApplicationContext(),"It's magic",Toast.LENGTH_SHORT)
            .show();*/

                recyclerView = findViewById(R.id.recycler_view);

                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setHasFixedSize(true);
                recyclerView.bringToFront();
                coplistdata = CopData.LoadDataCopButton();
                recyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this, LinearLayoutManager.VERTICAL));
                adapter = new CopMyAdapterMain(this, coplistdata, new CopMyAdapterMain.OnCopClickListner() {

                    @Override
                    public void onClicked(CopListdata copchild) {
//                  String fooditem = getApplicationContext().toString().trim();
                        String fooditem2 = copchild.get_itemname().trim();
                       String fooditem2kcal = copchild.get_KCal().trim();
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
                });


                recyclerView.setAdapter(adapter);
                recyclerView.setVisibility(recyclerView.VISIBLE);

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

            }
        });


    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "Activity dispatchTouchEvent DOWN");
                break;
            /*case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "Activity dispatchTouchEvent MOVE");
                break;*/
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "Activity dispatchTouchEvent UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "Activity dispatchTouchEvent CANCEL");
                break;
        }
        boolean b = super.dispatchTouchEvent(ev);
        Log.d(TAG, "Activity dispatchTouchEvent RETURNS " + b);
        if (b == false) {
            Log.d(TAG, "False is returned hide all recycler views" + b);
            looprecycleview();
        } else {
            Log.d(TAG, "True is returned evaluate which recycler views to hide" + b);
        }
        return b;


    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getActionMasked()) {
           /* case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "Activity onTouch DOWN");
                break;*/
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
        if (layoutMyLayout != null) {
            for (int x = 0; x < layoutMyLayout.getChildCount(); x++) {
                View viewChild1 = layoutMyLayout.getChildAt(x);
                if (viewChild1 instanceof RecyclerView) {
//  String cls = classChild1.getClass().getName();

                    if (viewChild1.getVisibility() == viewChild1.VISIBLE) {
                        viewChild1.setVisibility(viewChild1.INVISIBLE);
                    } else {
                        // Either gone or invisible
                    }
                }
            }


        }
    }
}




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
