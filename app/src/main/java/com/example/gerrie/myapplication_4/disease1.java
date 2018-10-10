package com.example.gerrie.myapplication_4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by Gerrie on 9/22/2018.
 */

public class disease1  extends AppCompatActivity {

    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disease1);

        t1 = (TextView) findViewById(R.id.textView42);

        String sourceString = "Use of Biological agents such as "+"<i>" + "Bacillus subtilis" + "</i>" + " strain QST713";
        t1.setText(Html.fromHtml(sourceString));
    }

}
