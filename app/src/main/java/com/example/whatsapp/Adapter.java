package com.example.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private OnRecyclerItemsClickListener listener;
    private Context context;
    private ArrayList<Model> flagList;

    public Adapter(MainActivity mainActivity, ArrayList<Model> flagList, OnRecyclerItemsClickListener it_works)
    {
        this.flagList=flagList;
        this.context = mainActivity;
        this.listener= it_works;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate((R.layout.country_design),parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        Model currentPosition = flagList.get(position);
        int image=flagList.get(position).getIcon();
        String countryCode=flagList.get(position).getCode();
        String countryName=flagList.get(position).getTitle();


        holder.setData(image,countryCode,countryName);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemsClicked(currentPosition);
            }
        });

    }

    @Override
    public int getItemCount() {
        return flagList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView  imageView;
        private TextView textView;
        private TextView textView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.icon);
            textView=itemView.findViewById(R.id.code);
            textView2=itemView.findViewById(R.id.title);
        }

        public void setData(int image, String countryCode, String countryName) {
            imageView.setImageResource(image);
            textView.setText(countryCode);
            textView2.setText(countryName);
        }
    }


}
