package com.example.foodappjava.adapters;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.foodappjava.Model.FoodSubModel;
import com.example.foodappjava.R;

import java.util.ArrayList;
import java.util.List;

public class HomeSubItemAdapter extends RecyclerView.Adapter<HomeSubItemAdapter.HomeItemView> {

    Context context;
    ArrayList<FoodSubModel> homeSubItemList;

    public HomeSubItemAdapter(Context context, ArrayList<FoodSubModel> homeSubItemList) {
        this.context = context;
        this.homeSubItemList = homeSubItemList;
    }

    @NonNull
    @Override
    public HomeSubItemAdapter.HomeItemView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
          return new HomeSubItemAdapter.HomeItemView(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_food_design,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeSubItemAdapter.HomeItemView holder, int position) {

        holder.foodName.setText(homeSubItemList.get(position).getName());
        holder.foodPrice.setText(homeSubItemList.get(position).getPrice());
        holder.foodImage.setImageResource(homeSubItemList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return homeSubItemList.size();
    }

    public class HomeItemView extends RecyclerView.ViewHolder {

        ImageView foodImage;
        TextView foodName;
        TextView foodPrice;
        public HomeItemView(@NonNull View itemView) {
            super(itemView);

            foodImage=itemView.findViewById(R.id.product_Image);
            foodName=itemView.findViewById(R.id.productName);
            foodPrice=itemView.findViewById(R.id.food_price);

        }
    }
}
