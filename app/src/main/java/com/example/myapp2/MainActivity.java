package com.example.myapp2;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        final LinearLayout mylayout = findViewById(R.id.root);
        int itemId = item.getItemId();
        if (itemId == R.id.red) {
            mylayout.setBackgroundColor(getResources().getColor(R.color.red));
            return true;
        } else if (itemId == R.id.green) {
            mylayout.setBackgroundColor(getResources().getColor(R.color.green));
            return true;
        } else if (itemId == R.id.blue) {
            mylayout.setBackgroundColor(getResources().getColor(R.color.blue));
            return true;
        } else if (itemId == R.id.exit) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
