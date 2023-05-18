package com.example.foodappjava.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodappjava.Model.HomeModel;
import com.example.foodappjava.R;

import java.util.List;

public class HomeItemAdapters extends RecyclerView.Adapter<HomeItemAdapters.HomeView> {

    Context context;

    List<HomeModel> homeModelList;

    public HomeItemAdapters(Context context, List<HomeModel> homeModelList) {
        this.context = context;
        this.homeModelList = homeModelList;
    }

    @NonNull
    @Override
    public HomeItemAdapters.HomeView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeView(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeItemAdapters.HomeView holder, int position) {
        holder.imageView.setImageResource(homeModelList.get(position).getImage());
        holder.textView.setText(homeModelList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return homeModelList.size();
    }

    public class HomeView extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public HomeView(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.item_image);
            textView=itemView.findViewById(R.id.item_name);
        }
    }
}
