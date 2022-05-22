package com.alya.bimatri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class bonstri extends AppCompatActivity {

    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.beli);
    }

    public void clickHome(View view) {
        Intent i = new Intent(this,home.class);
        startActivity(i);
    }

    public void clickBeli(View view) {
        Intent i = new Intent(this,beli.class);
        startActivity(i);
    }

    public void clickBonsTri(View view) {
        Intent i = new Intent(this,bonstri.class);
        startActivity(i);
    }

    public void clickAkun(View view) {
        Intent i = new Intent(this,akun.class);
        startActivity(i);
    }
}
