package com.example.sampleapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void display_custom_toast(View v)
    {
        LayoutInflater li=getLayoutInflater();
        View lv=li.inflate(R.layout.custom_toast_layout,findViewById(R.id.clt_root));
try {
    ImageView img_v = lv.findViewById(R.id.img_view_toast);
    img_v.setImageResource(R.mipmap.emoji1);
}
catch (Exception ex)
{
    Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
}
        Toast t=new Toast(getApplicationContext());
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(lv);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }
}