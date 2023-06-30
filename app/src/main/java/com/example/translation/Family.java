package com.example.translation;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Family extends AppCompatActivity {

    wordModal WordModal;
    ArrayList<wordModal> familymembers;

    customAdapter CustomAdapter;
    ListView family;

    private Button playButton;
    private Button stopButton;

    MediaPlayer mediaPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        WordModal = new wordModal();
        familymembers = new ArrayList();
        family();
        CustomAdapter= new customAdapter(getApplicationContext(),familymembers);
        family = findViewById(R.id.family);
        family.setAdapter(CustomAdapter);
        family.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                mediaPlayer = MediaPlayer.create(Family.this, familymembers.get(i).getAudio());
                mediaPlayer.start();
            };


        });
    }
    public void  family(){
        familymembers.add(new wordModal("mother","mum",R.drawable.mama,R.raw.mum));
        familymembers.add(new wordModal("father","dati",R.drawable.papa,R.raw.dati));
        familymembers.add(new wordModal("grandfather","umau",R.drawable.grandpapa,R.raw.umau));
        familymembers.add(new wordModal("grandmother","cucu",R.drawable.grandamama,R.raw.cuc));
        familymembers.add(new wordModal("girl","kelitu",R.drawable.girl,R.raw.kelitu));
        familymembers.add(new wordModal("siblings","syana",R.drawable.siblings,R.raw.syana));
        familymembers.add(new wordModal("child","mwana",R.drawable.child,R.raw.mwana));
    }
}