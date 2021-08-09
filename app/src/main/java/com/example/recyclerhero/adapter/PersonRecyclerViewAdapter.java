package com.example.recyclerhero.adapter;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerhero.R;
import com.example.recyclerhero.listeners.OnRecyclerItemsClickListener;
import com.example.recyclerhero.model.Person;

import java.util.ArrayList;

import javax.xml.namespace.QName;

public class PersonRecyclerViewAdapter extends RecyclerView.Adapter<PersonRecyclerViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<Person> dataList;
    OnRecyclerItemsClickListener listener;




    public PersonRecyclerViewAdapter(Context context, ArrayList<Person> dataList, OnRecyclerItemsClickListener listener) {
        this.context = context;
        this.dataList = dataList;
        this.listener = listener;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_layout_user_item, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //current item in position
        Person currentPerson  = dataList.get(position);

        holder.name.setText(currentPerson.name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClicked(currentPerson);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.text_item);
        }
    }
}
