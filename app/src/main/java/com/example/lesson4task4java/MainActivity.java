package com.example.lesson4task4java;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lesson4task4java.Model.Member;
import com.example.lesson4task4java.Model.User;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = SecondActivity.class.toString();
    int LAUNCHER_DETAIL = 112;
     TextView tv_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == LAUNCHER_DETAIL){
            if (resultCode == RESULT_OK){
                Member member = (Member) data.getSerializableExtra("member");
                Log.d(TAG, member.toString());

                tv_home.setText(member.toString());
            }
        }
    }

    void initView(){
        tv_home = findViewById(R.id.tv_home);
        Button b_detail = findViewById(R.id.b_detail);
        b_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User("Temur", 18);
                openDetail(user);}
        });
    }
    void openDetail(User user){

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("user", user);
         startActivityForResult(intent, LAUNCHER_DETAIL);
    }

}