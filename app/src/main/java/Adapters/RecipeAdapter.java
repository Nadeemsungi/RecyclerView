package Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.advancerecyclerview.R;

import java.util.ArrayList;

import models.RecipeModel;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.viewHolder>
{
    ArrayList <RecipeModel> list;
    Context context;

    public RecipeAdapter(ArrayList<RecipeModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        RecipeModel model =list.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());
//        switch (position){
//            case 0:
//                holder.imageView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Toast.makeText(context, " Image one is clicked", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                holder.textView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Toast.makeText(context, " Text one is clicked", Toast.LENGTH_SHORT).show();
//
//                    }
//                });
//                break;
//            case 1:
//                holder.imageView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Toast.makeText(context, " Image one ", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                holder.textView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Toast.makeText(context, " Add your desired features", Toast.LENGTH_SHORT).show();
//
//                    }
//                });
//                break;
//            case 2:
//                holder.imageView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Toast.makeText(context, " Image two ", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                holder.textView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Toast.makeText(context, " Add your desired ", Toast.LENGTH_SHORT).show();
//
//                    }
//                });
//
//
//                break;
//            default:
//        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.images);
            textView=itemView.findViewById(R.id.textView);
        }
    }
}
