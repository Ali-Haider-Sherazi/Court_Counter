package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int A=0,B=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void A3(View view) {
        A=A+3;
        TextView scoreA =(TextView) findViewById(R.id.AScore);
        scoreA.setText(String.valueOf(A));
    }
    public void A2(View view) {
        A=A+2;
        TextView scoreA = (TextView) findViewById(R.id.AScore);
        scoreA.setText(String.valueOf(A));
    }
    public void AFree(View view) {
        A=A+1;
        TextView scoreA = (TextView) findViewById(R.id.AScore);
        scoreA.setText(String.valueOf(A));
    }
    public void B3(View view) {
        B=B+3;
        TextView scoreB =(TextView) findViewById(R.id.BScore);
        scoreB.setText(String.valueOf(B));
    }
    public void B2(View view) {
        B=B+2;
        TextView scoreB = (TextView) findViewById(R.id.BScore);
        scoreB.setText(String.valueOf(B));
    }
    public void BFree(View view) {
        B=B+1;
        TextView scoreA = (TextView) findViewById(R.id.AScore);
        scoreA.setText(String.valueOf(B));
    }

    public void RESET(View view) {
        A=0;
        B=0;
        TextView scoreA= (TextView) findViewById(R.id.AScore);
        scoreA.setText(String.valueOf(A));
        TextView scoreB = (TextView) findViewById(R.id.BScore);
        scoreB.setText(String.valueOf(B));
    }
}