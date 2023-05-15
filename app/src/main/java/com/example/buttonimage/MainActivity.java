package com.example.buttonimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadiobuttonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        switch (view.getId()){
            case R.id.radioButton:
                if(checked){
                    imageView.setImageResource(R.drawable.parrots);
                }
                break;
            case R.id.radioButton2:
                if(checked){
                    imageView.setImageResource(R.drawable.pepper);
                }
                break;
            case R.id.radioButton3:
                if(checked){
                    imageView.setImageResource(R.drawable.sailboat);
                }
                break;
        }
    }
}