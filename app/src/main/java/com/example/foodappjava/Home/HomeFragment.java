package com.example.foodappjava.Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodappjava.Model.HomeModel;
import com.example.foodappjava.R;
import com.example.foodappjava.adapters.HomeItemAdapters;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {


    RecyclerView recyclerView;
    List<HomeModel> homeModelList;
    HomeItemAdapters homeItemAdapters;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_homeragment, container, false);

        homeModelList=new ArrayList<>();
        recyclerView=view.findViewById(R.id.recyclerView);
        homeModelList.add(new HomeModel(1,R.drawable.pizza,"Pizza"));
        homeModelList.add(new HomeModel(2,R.drawable.hamburger,"Hamburger"));
        homeModelList.add(new HomeModel(3,R.drawable.fried_potatoes,"Fried"));
        homeModelList.add(new HomeModel(4,R.drawable.ice_cream,"Ice cream"));
        homeModelList.add(new HomeModel(5,R.drawable.sandwich,"Sandwich"));


        homeItemAdapters=new HomeItemAdapters(getActivity(),homeModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        recyclerView.setAdapter(homeItemAdapters);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);

        return  view;
    }
}