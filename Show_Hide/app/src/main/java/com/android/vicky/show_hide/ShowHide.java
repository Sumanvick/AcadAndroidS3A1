package com.android.vicky.show_hide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ShowHide extends AppCompatActivity {
    Button bttn;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_hide);
        bttn = (Button) findViewById(R.id.bttn);
        img = (ImageView) findViewById(R.id.img);
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bttn.getText().toString().equals("SHOW")){
                    bttn.setText("HIDE");
                    img.setVisibility(View.VISIBLE);
                }
                else{
                    bttn.setText("SHOW");
                    img.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
