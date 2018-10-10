package com.example.gerrie.myapplication_4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaring Buttons
    private Spinner spinner;

    private Button search;
    private Button clear;
    private Button help;
    private Button info;
    private Button contact;
    private Button scan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.Spinner);

        search = (Button) findViewById(R.id.Search);
        clear = (Button) findViewById(R.id.Clear);
        help = (Button) findViewById(R.id.Help);
        info = (Button) findViewById(R.id.Info);
        contact = (Button) findViewById(R.id.Contact);
        scan= (Button) findViewById(R.id.button_scan);

        String[] items = new String[]{"None","Powdery Mildew of cucurbits","Cucumber Mosaic Virus Disease","Early Blight of Tomato","Tomato Late Blight","Tomato Yellow leaf curl virus disease","Chili Anthracnose","Cassava Mosaic Virus Disease","Early  Leaf Spot in Groundnut","Bean rust","Chilli Leaf Curl Complex","Damping off","Rice Blast","Rice Sheath Blight","Bacterial Blight","Maize Streak Virus Disease"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_checked,items);
        spinner.setAdapter(adapter);

        //for Search button...
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toast(Long.toString(spinner.getSelectedItemId()));
                Long spinner_SelectedItemId=spinner.getSelectedItemId();
                if (spinner_SelectedItemId==0){
                    toast("Please select a disease from the spinner and search");
                }
                if (spinner_SelectedItemId==1){
                    startActivity(new Intent(MainActivity.this, disease1.class));
                }
                if (spinner_SelectedItemId==2){
                    startActivity(new Intent(MainActivity.this, disease2.class));
                }
                if (spinner_SelectedItemId==3){
                    startActivity(new Intent(MainActivity.this, disease3.class));
                }
                if (spinner_SelectedItemId==4){
                    startActivity(new Intent(MainActivity.this, disease4.class));
                }
                if (spinner_SelectedItemId==5){
                    startActivity(new Intent(MainActivity.this, disease5.class));
                }
                if (spinner_SelectedItemId==6){
                    startActivity(new Intent(MainActivity.this, disease6.class));
                }
                if (spinner_SelectedItemId==7){
                    startActivity(new Intent(MainActivity.this, disease7.class));
                }
                if (spinner_SelectedItemId==8){
                    startActivity(new Intent(MainActivity.this, disease8.class));
                }
                if (spinner_SelectedItemId==9){
                    startActivity(new Intent(MainActivity.this, disease9.class));
                }
                if (spinner_SelectedItemId==10){
                    startActivity(new Intent(MainActivity.this, disease10.class));
                }
                if (spinner_SelectedItemId==11){
                    startActivity(new Intent(MainActivity.this, disease11.class));
                }
                if (spinner_SelectedItemId==12){
                    startActivity(new Intent(MainActivity.this, disease12.class));
                }
                if (spinner_SelectedItemId==13){
                    startActivity(new Intent(MainActivity.this, disease13.class));
                }
                if (spinner_SelectedItemId==14){
                    startActivity(new Intent(MainActivity.this, disease14.class));
                }
                if (spinner_SelectedItemId==15){
                    startActivity(new Intent(MainActivity.this, disease15.class));
                }

            }
        });

        //for clear button...
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinner.setSelection(0);
                spinner.setTop(0);
            }
        });

        //for Help button...
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast("Select the disease you want to explore from the spinner and click search button. You can also scan an image and find it's disease");
            }
        });

        //for scan button...
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, disease2.class));
                openCamera();
            }
        });

        //for application info button...
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, info.class));
            }
        });

        //for Contact devoloper button...
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, contact.class));
            }
        });
    }

    public void toast(String toast1) {
        Context context = getApplicationContext();
        CharSequence text = toast1;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    //to invoke the inbuilt Camera app...
    private void openCamera() {
        Intent cameraintent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraintent, 0);
    }
}
