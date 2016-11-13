package com.example.ansam.customarrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by ansam on 11/13/2016.
 */

public class UserAdapter extends ArrayAdapter<User> {
    public UserAdapter(Context context, ArrayList<User> users) {
        super(context, 0,users);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        User user=getItem(position);

        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.item_user,parent,false);
        }
        TextView tName=(TextView)convertView.findViewById(R.id.name);
        TextView tHomeTown=(TextView)convertView.findViewById(R.id.home);
        tName.setText(user.Name);
        tHomeTown.setText(user.HomeTown);
        return convertView;
    }


}
