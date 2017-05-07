package com.edu.swun.materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar,menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //处理各个按钮的点击事件
        switch (item.getItemId()){
            case R.id.backup:
                //do something
                break;
            case R.id.delete:
                //do something
                break;
            case R.id.setting:
                //do something
                break;
        }

        return true;
    }
}
