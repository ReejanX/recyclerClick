package com.example.whatsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.example.whatsapp.Adapter;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    ArrayList<Model> flagList;
    Adapter adapter;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Countries");

        context = this;

        recyclerView = findViewById(R.id.country);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        adapter = new Adapter(this, innitData(),new OnRecyclerItemsClickListener(){

            @Override
            public void onItemsClicked(Model model) {
                Intent intent = new Intent(MainActivity.this,Details.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("Model",model);
                intent.putExtras(bundle);
                startActivity(intent);


            }
        });
        recyclerView.setAdapter(adapter);



    }





    private ArrayList<Model> innitData() {
        ArrayList<Model> data = new ArrayList<>();


        Model Country1 = new Model(R.drawable.nepal, "+977", "Nepal","456765", "Hindu,Muslim", "30 million", "lorem ipsum", "animals found", "birds");
        Model Country2 = new Model(R.drawable.unitedstates, "+1", "USA","9.834", "Christianity", "328.2 million", "lorem ipsum", "animals found", "birds");
        Model Country3 = new Model(R.drawable.brazil, "+977", "Brazil","456765", "Hindu,Muslim", "30 million", "lorem ipsum", "animals found", "birds");
        Model Country4 = new Model(R.drawable.canada, "+977", "Canada","456765", "Hindu,Muslim", "30 million", "lorem ipsum", "animals found", "birds");
        Model Country5 = new Model(R.drawable.france, "+977", "France","456765", "Hindu,Muslim", "30 million", "lorem ipsum", "animals found", "birds");
        Model Country6 = new Model(R.drawable.germany, "+977", "Germany","456765", "Hindu,Muslim", "30 million", "lorem ipsum", "animals found", "birds");
        Model Country7 = new Model(R.drawable.japan, "+977", "Japan","456765", "Hindu,Muslim", "30 million", "lorem ipsum", "animals found", "birds");
        Model Country8 = new Model(R.drawable.spain, "+977", "Spain","456765", "Hindu,Muslim", "30 million", "lorem ipsum", "animals found", "birds");
        Model Country9 = new Model(R.drawable.unitedkingdom, "+977", "United Kingdom","456765", "Hindu,Muslim", "30 million", "lorem ipsum", "animals found", "birds");
        Model Country10 = new Model(R.drawable.australia, "+977", "Australia","456765", "Hindu,Muslim", "30 million", "lorem ipsum", "animals found", "birds");



        data.add(Country1);
        data.add(Country2);
        data.add(Country3);
        data.add(Country4);
        data.add(Country5);
        data.add(Country6);
        data.add(Country7);
        data.add(Country8);
        data.add(Country9);
        data.add(Country10);

        return data;
    }
}

