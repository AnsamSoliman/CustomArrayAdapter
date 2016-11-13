package com.example.ansam.customarrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<User> arrayOfusers;
    UserAdapter userAdapter;
    ListView listView;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayOfusers=new ArrayList<User>();
        user=new User("Ansam","Salfeet");
        arrayOfusers.add(user);
        user=new User("Ann","Nablus");
        user=new User("dd","Ramallah");
        arrayOfusers.add(user);
        user=new User("bb","tulkarem");
        arrayOfusers.add(user);
        user=new User("pp","AlQuds");
        arrayOfusers.add(user);
        user=new User("ww","jenin");
        arrayOfusers.add(user);
        userAdapter=new UserAdapter(this,arrayOfusers);
        listView=(ListView)findViewById(R.id.listview);
        listView.setAdapter(userAdapter);



    }
}
