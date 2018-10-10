package com.example.gerrie.myapplication_4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by Gerrie on 9/22/2018.
 */

public class disease6 extends AppCompatActivity {

    private TextView t1;
    private TextView t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disease6);

        t1 = (TextView) findViewById(R.id.textView7);

        String sourceString = "<i>" + "Colletotrichum capsici" + "</i>" + " (Fungus)";
        t1.setText(Html.fromHtml(sourceString));

        t2 = (TextView) findViewById(R.id.textView22);

        String sourceString1 = "Use of botanicals (eg.Neem seed extract), biocontrol agents (eg:"+"<i>" + "Trichoderma" + "</i>" + ")";
        t2.setText(Html.fromHtml(sourceString1));
    }

}
