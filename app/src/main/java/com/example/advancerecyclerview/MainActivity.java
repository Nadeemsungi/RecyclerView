package com.example.advancerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

import Adapters.RecipeAdapter;
import classes.RecyclerItemClickListener;
import models.RecipeModel;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView) findViewById(R.id.RecyclerView);
        ArrayList<RecipeModel> list=new ArrayList<>();
        list.add(new RecipeModel(R.drawable.food1 , "Burger"));
        list.add(new RecipeModel(R.drawable.food2 , "Pizza"));
        list.add(new RecipeModel(R.drawable.food3 , "Shawarma"));
        list.add(new RecipeModel(R.drawable.food4 , "Rotti"));
        list.add(new RecipeModel(R.drawable.food5 , "Zinger"));
        list.add(new RecipeModel(R.drawable.food6 , "Fries"));
        list.add(new RecipeModel(R.drawable.food7 , "Pasta"));
        list.add(new RecipeModel(R.drawable.food8 , "Broast"));
        RecipeAdapter adapter=new RecipeAdapter(list,this);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(this);
//        StaggeredGridLayoutManager manager=new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.HORIZONTAL);
//        StaggeredGridLayoutManager manager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
//        GridLayoutManager manager=new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(manager);
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener
                (this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        switch (position)
                        {
                            case 0:
                                Intent intent=new Intent(MainActivity.this,ScrollingActivity.class);
                                startActivity(intent);
                                break;
                            case 1:
                                Toast.makeText(MainActivity.this, "2nd clicked", Toast.LENGTH_SHORT).show();
                                break;
                            case 2:
                                Toast.makeText(MainActivity.this, "3rd clicked", Toast.LENGTH_SHORT).show();
                                break;
                            case 3:
                                Toast.makeText(MainActivity.this, "4th clicked", Toast.LENGTH_SHORT).show();
                                break;
                            default:
                        }
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        switch (position){
                            case 0:
                                Toast.makeText(MainActivity.this, "Long clicked on first item", Toast.LENGTH_SHORT).show();
                                break;
                            default:
                        }

                    }
                }

                ));
        getSupportActionBar().hide();

    }
}