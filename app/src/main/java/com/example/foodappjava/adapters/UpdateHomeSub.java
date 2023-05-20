package com.example.foodappjava.adapters;

import com.example.foodappjava.Model.FoodSubModel;
import com.example.foodappjava.adapters.HomeSubItemAdapter;

import java.util.ArrayList;

public interface UpdateHomeSub {
    void callBack(int position, ArrayList<FoodSubModel> list);
}
