package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    private MyClickHandler myClickHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Person p1 = new Person( "abhishek","abhishek@gmail.com" );

        activityMainBinding = DataBindingUtil.setContentView( this,R.layout.activity_main );

        activityMainBinding.setPerson( p1 );


        myClickHandler = new MyClickHandler( this );
       activityMainBinding.setClickHander(myClickHandler);



    }
}