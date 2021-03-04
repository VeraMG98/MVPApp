package com.example.mvpapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements IMain{
    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new Presenter(this);
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName(String name) {
        return null;
    }
}
