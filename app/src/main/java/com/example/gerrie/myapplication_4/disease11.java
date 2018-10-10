package com.example.gerrie.myapplication_4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by Gerrie on 9/22/2018.
 */

public class disease11 extends AppCompatActivity {

    private TextView t1;
    private TextView t2;
    private TextView t3;
    private TextView t4;
    private TextView t5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disease11);

        t1 = (TextView) findViewById(R.id.textView8);
        String sourceString = "<i>" + "Pythium " + "</i>" + "spp";
        t1.setText(Html.fromHtml(sourceString));

        t2 = (TextView) findViewById(R.id.textView9);
        String sourceString1 = "<i>" + "Phytophthora " + "</i>" + "sp";
        t2.setText(Html.fromHtml(sourceString1));

        t3 = (TextView) findViewById(R.id.textView26);
        String sourceString2 = "<i>" + "Fusarium " + "</i>" + "spp";
        t3.setText(Html.fromHtml(sourceString2));

        t4 = (TextView) findViewById(R.id.textView27);
        String sourceString3 = "<i>" + "Sclerotium " + "</i>" + "sp";
        t4.setText(Html.fromHtml(sourceString3));

        t5 = (TextView) findViewById(R.id.textView33);
        String sourceString4 = "Use biological control agents (e.g."+"<i>" + "Trichoderma " + "</i>" + "spp";
        t5.setText(Html.fromHtml(sourceString4));
    }

}
