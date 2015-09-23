package com.andersonblough.databinding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * @author Bill Anderson-Blough (bill.andersonblough@gmail.com)
 */
public class PickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picker_activity);
    }

    public void recyclerView(View view) {
        start(MainActivity.class);
    }

    public void oneWay(View view) {
        start(OneWayActivity.class);
    }

    public void twoWay(View view) {
        start(TwoWayActivity.class);
    }

    public void start(Class<?> clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }
}
