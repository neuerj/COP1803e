package com.example.android.cop1803;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatDialogFragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.cop1803.R;

import java.util.ArrayList;

public class MenuDialogFragment extends AppCompatDialogFragment {
    String[] tvshows={"Crisis","Blindspot","BlackList","Game of Thrones","Gotham","Banshee"};
    RecyclerView rv;
    public static CartListAdapter mAdapter;
    public static ArrayList<Item> cartList = new ArrayList<Item>();

    @Nullable
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
    }
}



