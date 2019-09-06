package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityTerimaData extends AppCompatActivity {

    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terima_data);
        textView = findViewById(R.id.pindah_activity_dengan_objek);
        MyBiodata biodata =getIntent().getParcelableExtra("biodata");
        textView.setText("Nama saya "+biodata.getNama()+" Umur saya"+biodata.getUmur());
        textView.setText("nama saya "+biodata.getNama()+" Umur saya"+biodata.getUmur());


    }
}
