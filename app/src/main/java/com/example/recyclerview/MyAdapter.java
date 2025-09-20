package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.recyclerview.model.Food;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Food> foodList;
    private Context context;

    public MyAdapter(List<Food> foodList, Context context) {
        this.foodList = foodList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.row_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Food food = foodList.get(position);

        // แสดงชื่อ
        holder.txtName.setText(food.getName());

        // แสดงราคา
        holder.txtPrice.setText(food.getPrice());

        // โหลดรูป
        Glide.with(context)
                .load(food.getImage())
                .into(holder.imgView);

        // คลิกแถว → Toast แสดงชื่ออาหาร
        holder.itemView.setOnClickListener(v -> {
            Toast.makeText(context, food.getName(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtPrice;
        ImageView imgView;

        public ViewHolder(View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.firstLine);
            txtPrice = itemView.findViewById(R.id.secondLine);
            imgView = itemView.findViewById(R.id.icon);
        }
    }
}
