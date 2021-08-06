package com.example.recyclerhero.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerhero.R;
import com.example.recyclerhero.adapter.PersonRecyclerViewAdapter;
import com.example.recyclerhero.model.Person;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    PersonRecyclerViewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init your view
        recyclerView = findViewById(R.id.main_recycler);

        //setup recycler layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        //make recycler view adapter
        adapter = new PersonRecyclerViewAdapter(this, createRecyclerData());

        //set the adapter
        recyclerView.setAdapter(adapter);


    }

    public ArrayList<Person> createRecyclerData() {
        ArrayList<Person> data = new ArrayList<>();

        Person person1 = new Person("Jane White", "Kathmandu", "9863729928", "12-098-2179");
        Person person2 = new Person("Ryan Smith", "Kathmandu", "985262626262", "11-86656-5297");
        Person person3 = new Person("Nathan Luca", "Lalitpur", "9863729928", "10-388-4242");
        Person person4 = new Person("Jung Kim", "Pokhara", "9863729928", "82-381-4123");
        Person person5 = new Person("Janet Kim", "Kavre", "9863729338", "90-3881-9922");

        data.add(person1);
        data.add(person2);
        data.add(person3);
        data.add(person4);
        data.add(person5);

        return data;
    }
}