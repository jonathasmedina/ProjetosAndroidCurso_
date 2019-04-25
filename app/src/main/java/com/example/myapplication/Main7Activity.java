package com.example.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public class Main7Activity extends AppCompatActivity {
    ListView lv;

    FragmentManager fm = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        if (savedInstanceState == null){
            Fragment1 frag1_ = new Fragment1();
            FragmentTransaction ft = fm.beginTransaction();
            ft.add(R.id.layoutDireito, frag1_, "frag1_");
            ft.commit();
        }


        lv = findViewById(R.id.listView1);

        String[] lista = new String[] {"Google", "G1" +
                "", "UOL"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, lista
        );

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                FragmentTransaction ft = fm.beginTransaction();

                if(position==0){
                    Fragment1 frag1 = new Fragment1();
                    ft = fm.beginTransaction();
                    ft.replace(R.id.layoutDireito, frag1, "frag1");
                }
                if(position==1){
                    Fragment2 frag2 = new Fragment2();
                    ft = fm.beginTransaction();
                    ft.replace(R.id.layoutDireito, frag2, "frag2");
                }
                if(position==2){
                    Fragment3 frag3 = new Fragment3();
                    ft = fm.beginTransaction();
                    ft.replace(R.id.layoutDireito, frag3, "frag3");
                }
                ft.commit();
            }
        });

    }
}
