package com.example.sid.contextmenu94;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mTextview = (TextView) findViewById(R.id.mTextview);
        registerForContextMenu(mTextview);
    }

    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo){
       menu.setHeaderTitle("Context Menu");
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        super.onCreateContextMenu(menu,view,menuInfo);
    }

    public boolean onContextItemSelected(MenuItem item){

        switch (item.getItemId()){

            case R.id.action1:
                Toast.makeText(this,"Item clicked  "+item.getTitle(),Toast.LENGTH_SHORT).show();

            case R.id.action2:
                Toast.makeText(this,"Item clicked  "+item.getTitle(),Toast.LENGTH_SHORT).show();

            case R.id.action3:
                Toast.makeText(this,"Item clicked  "+item.getTitle(),Toast.LENGTH_SHORT).show();
        }
        return  true;
    }
}
