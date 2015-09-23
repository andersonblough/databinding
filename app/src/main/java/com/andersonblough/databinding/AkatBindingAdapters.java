package com.andersonblough.databinding;

import android.widget.TextView;

/**
 * @author Bill Anderson-Blough (bill.andersonblough@gmail.com)
 */
public class AkatBindingAdapters {

    @android.databinding.BindingAdapter({"app:customText"})
    public static void setCustomText(TextView view, String customText) {
        view.setText(customText);
    }

//    @android.databinding.BindingAdapter({"android:addTextChangedListener"})
//    public static void addTextChangedListender(EditText editText, TextWatcher textWatcher) {
//        editText.addTextChangedListener(textWatcher);
//    }
}
