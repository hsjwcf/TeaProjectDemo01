package com.hsj.example.teaprojectdemo01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 打开详情Activity
     * @param view
     */
    public void openDetail(View view){
        Intent intent=new Intent(this,DetailActivity.class);
        startActivity(intent);
    }
}
