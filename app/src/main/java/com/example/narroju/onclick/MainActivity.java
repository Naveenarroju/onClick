package com.example.narroju.onclick;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.clickListerner);

        button.setOnClickListener(this);


        button = findViewById(R.id.clickListerner2);
        

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("onClickListerner", "onClickListerner2 button is clicked");
            }
        });
    }

    public void doSomething(View v){
        if (v.getId()==R.id.Button) {
            Log.d("onClick",  "Frist button is clicked");
        }
        else if (v.getId() == R.id.Button2){
            Log.d("onClick",  "Second button is clicked");
        }
        }


    @Override
    public void onClick(View v) {
        Log.d("onClickListerner", "onClickListerner button is clicked");
    }
}
