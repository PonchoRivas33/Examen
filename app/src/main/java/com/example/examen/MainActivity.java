package com.example.examen;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.view);
        final ClaseAdapter adapter = new ClaseAdapter(ListDataHelper.provideItems());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),
                        adapter.getItem(i).getTitle(),
                        Toast.LENGTH_LONG
                ).show();
            }
        });


        SeekBar opacityBar;
        final View colorView1;
        final TextView textView1;


        opacityBar = (SeekBar)findViewById(R.id.see);
        colorView1 = (View) findViewById(R.id.view);
        textView1 = (TextView) findViewById(R.id.TextView);




        opacityBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                //setAlpha (float alpha)
                //alpha between 0 and 1

                colorView1.setAlpha((float)progress/255);



            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub


            }});



    }

}