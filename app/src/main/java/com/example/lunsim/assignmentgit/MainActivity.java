package com.example.lunsim.assignmentgit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.lunsim.assignmentgit.Model.Message;

public class MainActivity extends AppCompatActivity {
    Button Send;
    EditText sender,reciever,mess,dated;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Send= findViewById(R.id.btnSend);
        sender= findViewById(R.id.btnsender);
        reciever= findViewById(R.id.btnreciever);
        mess = findViewById(R.id.btnmessage);
        dated = findViewById(R.id.btndate);

        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create Object message for catch data from form Message
                Message message = getMessageData();
                //Send object message to tam Intent
                Intent intent = new Intent(MainActivity.this,RecieveActivity.class);
                //create object bundle
                Bundle b = new Bundle();
                b.putParcelable("data",message);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
    //create Method to get Data all
    private Message getMessageData() {
        //create object message
        Message message = new Message();
        //yk data from form (Message.java)
        message.setSender(sender.getText().toString());
        message.setReciever(reciever.getText().toString());
        message.setMessage(mess.getText().toString());
        message.setDate(dated.getText().toString());
        return  message;
    }
}
