package com.example.arshopper;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MyListAdapter extends RecyclerView.Adapter <MyListAdapter.ViewHolder> {
    private Context context;
    private ArrayList<MyListModel> listModels;

    public MyListAdapter(Context context, ArrayList<MyListModel> listModels) {
        this.context = context;
        this.listModels = listModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.card_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       MyListModel myListModel = listModels.get(position);

       holder.imageView.setImageResource(myListModel.getImgId());
       holder.imageView.setOnClickListener(view -> {
           Intent intent = new Intent(context,AR.class);
           intent.putExtra("name",myListModel.getDescription());
           context.startActivity(intent);
       });

    }

    @Override
    public int getItemCount() {
        return listModels.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public ViewHolder (View itemView) {
            super(itemView);
            this.imageView = (ImageView)itemView.findViewById(R.id.idIVImage);

            
        }


    }
}
