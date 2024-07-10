package com.example.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyClickHandler {
    Context context;

    public MyClickHandler(Context context) {
        this.context = context;
    }

    public void onbutton1clicked(View view){
        Toast.makeText( context, "first button is clicked", Toast.LENGTH_SHORT ).show();
    }
}
