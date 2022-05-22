package com.alya.bimatri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.login_activity);
    }

    public void clickLogin (View view) {
        Intent a = new Intent(this,home.class);
        startActivity(a);
    }
}
