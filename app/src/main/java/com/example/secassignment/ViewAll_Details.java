package com.example.secassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.secassignment.Model.User;

import java.util.List;

public class ViewAll_Details extends AppCompatActivity {
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all__details);


        recyclerView=findViewById(R.id.rvusers);



        Intent intent = getIntent();

        final List<User> users = (List<User>)intent.getSerializableExtra("userlist");


        MyRvAdapter adapter = new MyRvAdapter(users,this);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this);


        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
