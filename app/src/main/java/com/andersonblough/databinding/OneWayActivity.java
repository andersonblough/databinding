package com.andersonblough.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.andersonblough.databinding.databinding.OneWayActivityBinding;

/**
 * @author Bill Anderson-Blough (bill.andersonblough@gmail.com)
 */
public class OneWayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OneWayActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.one_way_activity);
        User user = new User("Bill", "Anderson-Blough", 28);
        binding.setUser(user);
    }
}
