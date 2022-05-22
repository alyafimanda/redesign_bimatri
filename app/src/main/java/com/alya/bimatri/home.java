package com.alya.bimatri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.home);
    }

    public void clickHome(View view) {
        Intent a = new Intent(this,home.class);
        startActivity(a);
    }

    public void clickBeli(View view) {
        Intent a = new Intent(this,beli.class);
        startActivity(a);
    }

    public void clickBonsTri(View view) {
        Intent a = new Intent(this,bonstri.class);
        startActivity(a);
    }

    public void clickAkun(View view) {
        Intent a = new Intent(this,akun.class);
        startActivity(a);
    }
}

