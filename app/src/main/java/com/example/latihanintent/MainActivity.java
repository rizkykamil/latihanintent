package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity =findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        Button btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);

        Button btnMoveWithDataActivity = findViewById(R.id.btn_move_activity_data);
        btnMoveWithDataActivity.setOnClickListener(this);

        Button btnMoveActivityWithObejek = findViewById(R.id.btn_move_activity_with_objek);
        btnMoveActivityWithObejek.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity_data:
                Intent moveWithdataIntent=new Intent(MainActivity.this,moveWithDataActivity.class);
                moveWithdataIntent.putExtra(moveWithDataActivity.EXTRA_NAME,"DicodingAcademy Boy");
                moveWithdataIntent.putExtra(moveWithDataActivity.EXTRA_AGE,5);
                startActivity(moveWithdataIntent);
                break;

            case R.id.btn_dial_number:
                String phonenumeber = "08141203";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phonenumeber));
                startActivity(dialPhoneIntent);
                break;

            case R.id.btn_move_activity_with_objek:
                Intent kemoveActivityWithObjek = new Intent(MainActivity.this, ActivityTerimaData.class);
                MyBiodata biodataKamil = new MyBiodata("Kamil",15);
                MyBiodata biodataSabrina = new MyBiodata("Sabrina",16);
                kemoveActivityWithObjek.putExtra("biodata",biodataKamil);
                kemoveActivityWithObjek.putExtra("biodata",biodataSabrina);
                startActivity(kemoveActivityWithObjek);
                break;

        }

    }
}
