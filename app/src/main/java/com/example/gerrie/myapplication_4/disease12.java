package com.example.gerrie.myapplication_4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by Gerrie on 9/22/2018.
 */

public class disease12 extends AppCompatActivity {

    private TextView t1;
    private TextView t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disease12);

        t1 = (TextView) findViewById(R.id.textView7);
        String sourceString = "<i>" + "Magnaporthe oryzae " + "</i>" + "(Fungus)";
        t1.setText(Html.fromHtml(sourceString));

        t2 = (TextView) findViewById(R.id.textView29);
        String sourceString1 = "Biological control of rice blast (e.g."+"<i>" + "Pseudomonas fluorescens" + "</i>" + ")";
        t2.setText(Html.fromHtml(sourceString1));
    }

}
