package com.example.abhishekpc.spinner;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Spinner spinner;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=(Spinner) findViewById(R.id.spin);
        btn=(Button) findViewById(R.id.btn1);

        String [] countries={"India","Australia","Sri Lanka","Japan","China","England"};
        final ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,countries);
        spinner.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context=getApplicationContext();
                Toast.makeText(context,"You Selected For:  "+String.valueOf(spinner.getSelectedItem()),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
