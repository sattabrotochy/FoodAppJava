package com.example.foodappjava.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodappjava.Model.FoodSubModel;
import com.example.foodappjava.Model.HomeModel;
import com.example.foodappjava.R;

import java.util.ArrayList;
import java.util.List;

public class HomeItemAdapters extends RecyclerView.Adapter<HomeItemAdapters.HomeView> {

    Activity  activity;

    UpdateHomeSub updateHomeSub;
    ArrayList<HomeModel> homeModelList;
    boolean check=true;
    boolean select=true;
    int rowIndex=-1;
    ArrayList<FoodSubModel> foodSubModelList;

    public HomeItemAdapters(Activity activity, UpdateHomeSub updateHomeSub, ArrayList<HomeModel> homeModelList) {
        this.activity = activity;
        this.updateHomeSub = updateHomeSub;
        this.homeModelList = homeModelList;
    }

    @NonNull
    @Override
    public HomeItemAdapters.HomeView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeView(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeItemAdapters.HomeView holder, @SuppressLint("RecyclerView") int position) {
        holder.imageView.setImageResource(homeModelList.get(position).getImage());
        holder.textView.setText(homeModelList.get(position).getName());
        if(check){
            foodSubModelList=new ArrayList<>();
            foodSubModelList.add(new FoodSubModel(1,"Pizza 1",R.drawable.pizza1,"13"));
            foodSubModelList.add(new FoodSubModel(2,"Pizza 2",R.drawable.pizza2,"14"));
            foodSubModelList.add(new FoodSubModel(3,"Pizza 3",R.drawable.pizza3,"10"));
            foodSubModelList.add(new FoodSubModel(4,"Pizza 4",R.drawable.pizza4,"15"));
            updateHomeSub.callBack(position,foodSubModelList);
            check=false;

        }
        holder.cardView.setOnClickListener(view -> {
            rowIndex=position;
            notifyDataSetChanged();
            if(position==0){
                foodSubModelList=new ArrayList<>();
                foodSubModelList.add(new FoodSubModel(1,"Pizza 1",R.drawable.pizza1,"13"));
                foodSubModelList.add(new FoodSubModel(2,"Pizza 2",R.drawable.pizza2,"14"));
                foodSubModelList.add(new FoodSubModel(3,"Pizza 3",R.drawable.pizza3,"10"));
                foodSubModelList.add(new FoodSubModel(4,"Pizza 4",R.drawable.pizza4,"15"));
                updateHomeSub.callBack(position,foodSubModelList);
            }
            if(position==1){
                foodSubModelList=new ArrayList<>();
                foodSubModelList.add(new FoodSubModel(1,"Burger 1",R.drawable.bg1,"13"));
                foodSubModelList.add(new FoodSubModel(2,"Burger 2",R.drawable.bg2,"14"));
                foodSubModelList.add(new FoodSubModel(3,"Burger 3",R.drawable.bg4,"10"));
                foodSubModelList.add(new FoodSubModel(4,"Burger 4",R.drawable.bg1,"15"));
                updateHomeSub.callBack(position,foodSubModelList);
            }
            if(position==2){
                foodSubModelList=new ArrayList<>();
                foodSubModelList.add(new FoodSubModel(1,"Burger 1",R.drawable.bg1,"13"));
                foodSubModelList.add(new FoodSubModel(2,"Burger 2",R.drawable.bg2,"14"));
                foodSubModelList.add(new FoodSubModel(3,"Burger 3",R.drawable.bg4,"10"));
                foodSubModelList.add(new FoodSubModel(4,"Burger 4",R.drawable.bg1,"15"));
                updateHomeSub.callBack(position,foodSubModelList);
            }
            if(position==3){
                foodSubModelList=new ArrayList<>();
                foodSubModelList.add(new FoodSubModel(1,"Burger 1",R.drawable.bg1,"13"));
                foodSubModelList.add(new FoodSubModel(2,"Burger 2",R.drawable.bg2,"14"));
                foodSubModelList.add(new FoodSubModel(3,"Burger 3",R.drawable.bg4,"10"));
                foodSubModelList.add(new FoodSubModel(4,"Burger 4",R.drawable.bg1,"15"));
                updateHomeSub.callBack(position,foodSubModelList);
            }
            if(position==4){
                foodSubModelList=new ArrayList<>();
                foodSubModelList.add(new FoodSubModel(1,"Burger 1",R.drawable.bg1,"13"));
                foodSubModelList.add(new FoodSubModel(2,"Burger 2",R.drawable.bg2,"14"));
                foodSubModelList.add(new FoodSubModel(3,"Burger 3",R.drawable.bg4,"10"));
                foodSubModelList.add(new FoodSubModel(4,"Burger 4",R.drawable.bg1,"15"));
                updateHomeSub.callBack(position,foodSubModelList);
            }
        });
    }

    @Override
    public int getItemCount() {
        return homeModelList.size();
    }

    public class HomeView extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        CardView cardView;

        public HomeView(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.item_image);
            textView=itemView.findViewById(R.id.item_name);
            cardView=itemView.findViewById(R.id.item_card);
        }
    }


}
