package com.example.recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recyclerview.model.Food;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<Food> foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // ตัวอย่างข้อมูล
        foodList = new ArrayList<>();
        foodList.add(new Food(1,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRQqlEx0Bg0s6LtaQxJgITK1iUf9H9paEpPNg&s",
                "ข้าวผัด", "50 บาท"));
        foodList.add(new Food(2,
                "https://f.ptcdn.info/645/047/000/ohl4zjyn4DbiuAARqzW-o.jpg",
                "ส้มตำ", "60 บาท"));

        adapter = new MyAdapter(foodList, this);
        recyclerView.setAdapter(adapter);
    }
}
