package com.example.kavin.soundrecognition;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        ActionBar actionbar = getSupportActionBar();
        if(actionbar != null){
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setTitle("History");
        }

        Spinner dropdown = (Spinner)findViewById(R.id.dropdown);
        String[] items = new String[]{"Fire Alarm - 11:50 am", "Door Bell - 09:00 am"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(History.this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home) {
            startActivity(new Intent(History.this, HomeActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
