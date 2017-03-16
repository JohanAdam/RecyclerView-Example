package com.nyannyan.samplenyan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Johan on 16/3/2017.
 */

public class DetailActivity extends AppCompatActivity{

    String name;
    int pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        TextView tv = (TextView) findViewById(R.id.name_Tv);
        ImageView iv = (ImageView) findViewById(R.id.pic);

        Intent intent = getIntent();
        if (intent != null) {

            //get intent from the sender intent by "key"
            name = intent.getStringExtra("name");
            pic = intent.getIntExtra("pic", R.drawable.twitter);

            //andd set it to the view.
            tv.setText(name);
            iv.setImageDrawable(getResources().getDrawable(pic));

        }

    }
}
