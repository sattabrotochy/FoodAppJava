package com.example.foodappjava.Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodappjava.Model.FoodSubModel;
import com.example.foodappjava.Model.HomeModel;
import com.example.foodappjava.R;
import com.example.foodappjava.adapters.HomeItemAdapters;
import com.example.foodappjava.adapters.HomeSubItemAdapter;
import com.example.foodappjava.adapters.UpdateHomeSub;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment implements UpdateHomeSub {


    RecyclerView recyclerView,homeVerRecyclerView;
    ArrayList<HomeModel> homeModelList;
    HomeItemAdapters homeItemAdapters;

    ArrayList<FoodSubModel> foodSubModelList;
    HomeSubItemAdapter homeSubItemAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_homeragment, container, false);

        homeModelList=new ArrayList<>();
        recyclerView=view.findViewById(R.id.recyclerView);

        foodSubModelList=new ArrayList<>();
        homeVerRecyclerView=view.findViewById(R.id.homeSubRecyclerView);


        getFoodList();




        // food HORIZONTAL list _____________________________

        homeItemAdapters=new HomeItemAdapters(getActivity(),this,homeModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        recyclerView.setAdapter(homeItemAdapters);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);

        /// sub item vertical list ______________________
        homeSubItemAdapter=new HomeSubItemAdapter(getActivity(),foodSubModelList);
        homeVerRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        homeVerRecyclerView.setAdapter(homeSubItemAdapter);
        homeVerRecyclerView.setHasFixedSize(true);
        homeVerRecyclerView.setNestedScrollingEnabled(false);
        return  view;
    }



    private void getFoodList() {
        homeModelList.add(new HomeModel(1,R.drawable.pizza,"Pizza"));
        homeModelList.add(new HomeModel(2,R.drawable.hamburger,"Hamburger"));
        homeModelList.add(new HomeModel(3,R.drawable.fried_potatoes,"Fried"));
        homeModelList.add(new HomeModel(4,R.drawable.ice_cream,"Ice cream"));
        homeModelList.add(new HomeModel(5,R.drawable.sandwich,"Sandwich"));
    }

    @Override
    public void callBack(int position, ArrayList<FoodSubModel> list) {
        homeSubItemAdapter=new HomeSubItemAdapter(getActivity(),list);
        homeSubItemAdapter.notifyDataSetChanged();
        homeVerRecyclerView.setAdapter(homeSubItemAdapter);
    }
}