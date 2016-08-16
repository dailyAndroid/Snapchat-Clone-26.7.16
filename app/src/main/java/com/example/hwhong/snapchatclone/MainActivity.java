package com.example.hwhong.snapchatclone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> countries;
    private int[] array;
    private String VALUE_KEY = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        countries = new ArrayList<>();

        countries.add("Snapchat");     //0
        countries.add("Google");       //1
        countries.add("Twitter");      //2
        countries.add("Uber");         //3
        countries.add("Beme");         //4
        countries.add("Tumblr");       //5

        array = new int[] {0, 1, 2, 3, 4, 5};

        final Adapter adapter = new Adapter(this, countries);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, final int i, long l) {
                Intent intent = new Intent(getApplicationContext(), Imageview.class);

                String selectedFromList = (String)(listView.getItemAtPosition(i));

                intent.putExtra(VALUE_KEY, selectedFromList);
                startActivity(intent);

                countries.remove(i);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
