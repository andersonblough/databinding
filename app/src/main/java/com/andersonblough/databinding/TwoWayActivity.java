package com.andersonblough.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.andersonblough.databinding.databinding.PersonActivityBinding;

/**
 * @author Bill Anderson-Blough (bill.andersonblough@gmail.com)
 */
public class TwoWayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PersonActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.person_activity);
        Person person = new Person();
        binding.setPerson(person);
    }
}
