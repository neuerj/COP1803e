package com.example.android.cop1803;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatDialogFragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import java.util.ArrayList;

public class MenuDialogFragment extends AppCompatDialogFragment {
    //String[] tvshows={"Crisis","Blindspot","BlackList","Game of Thrones","Gotham","Banshee"};
    RecyclerView rv;
    private RecyclerView mRecyclerView;
    public static CartListAdapter mAdapter;
    public static ArrayList<Item> cartList = new ArrayList<Item>();
    Globals g =Globals.getInstance();
    MainActivity mMainActivit = new MainActivity();

    public MenuDialogFragment() {
        // Required empty public constructor
    }

    public static MenuDialogFragment newInstance() {
        return new MenuDialogFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setStyle(DialogFragment.STYLE_NORMAL,R.style.CustomDialog);

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.recyclerview_menu, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_menuview);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle args = getArguments();
        if(args != null) {
            cartList = args.getParcelableArrayList("key");
            cartList.remove(0);
        MenuDialogFragmentAdapter adapter = new MenuDialogFragmentAdapter(this.getActivity(), cartList);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            mRecyclerView.addItemDecoration(new DividerItemDecoration(getContext(),
                    DividerItemDecoration.VERTICAL));

       }
    }
    @Override
    public void onResume() {
        // Get existing layout params for the window
        ViewGroup.LayoutParams params = getDialog().getWindow().getAttributes();
        // Assign window properties to fill the parent
        params.width = WindowManager.LayoutParams.MATCH_PARENT;
        params.height = WindowManager.LayoutParams.MATCH_PARENT;
        getDialog().getWindow().setAttributes((android.view.WindowManager.LayoutParams) params);
        // Call super onResume after sizing
        super.onResume();}




}
/*ItemTouchHelper.Callback callback = new SimpleItemTouchHelperCallback(adapter);
        mItemTouchHelper = new ItemTouchHelper(callback);
        mItemTouchHelper.attachToRecyclerView(mRecyclerView);*/

/*
    @Override
    public void onStartDrag(RecyclerView.ViewHolder viewHolder) {
        mItemTouchHelper.startDrag(viewHolder);
    }
*/




   /* @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.recyclerview_menu,container);

        //RECYCER
        rv= (RecyclerView) rootView.findViewById(R.id.recycler_menuview);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        //ADAPTER
        mAdapter = new CartListAdapter(this.getActivity(), cartList);
       // adapter=new MyAdapter(this.getActivity(),tvshows);
        rv.setAdapter(mAdapter);

        this.getDialog().setTitle("TV Shows");


        return rootView;
    }*/




