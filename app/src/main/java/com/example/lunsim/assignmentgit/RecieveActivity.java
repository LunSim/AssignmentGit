package com.example.lunsim.assignmentgit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.lunsim.assignmentgit.Model.Message;

public class RecieveActivity extends AppCompatActivity {
    private static final String TAG = "RecieveActivity";
    TextView showMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve);
        //create object showMessage for set date jo
        showMessage = findViewById(R.id.showMessage);

        Intent intent = getIntent();
        if(intent != null){
            Message message = intent.getParcelableExtra("data");
            Log.e(TAG, "onCreate: "+message.toString() );
            if(message !=null){
                showMessage.setText(message.toString());
            }
        }
    }
}
