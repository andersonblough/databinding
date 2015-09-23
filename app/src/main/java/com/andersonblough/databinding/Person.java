package com.andersonblough.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

/**
 * @author Bill Anderson-Blough (bill.andersonblough@gmail.com)
 */
public class Person extends BaseObservable {

    private String firstName = "";
    private String lastName = "";

    @Bindable
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public final TextWatcher firstNameChanged = new SimpleTextWatcher() {
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            firstName = s.toString();
            notifyPropertyChanged(BR.fullName);
        }
    };

    public final TextWatcher lastNameChanged = new SimpleTextWatcher() {
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            lastName = s.toString();
            notifyPropertyChanged(BR.fullName);
        }
    };

    public final View.OnClickListener showDetails = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String details = "First Name: " + firstName + "\nLast Name: " + lastName + "\nFull Name: " + getFullName();
            Toast.makeText(v.getContext(), details, Toast.LENGTH_SHORT).show();
        }
    };
}
