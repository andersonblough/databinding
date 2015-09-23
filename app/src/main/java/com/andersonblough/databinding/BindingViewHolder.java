package com.andersonblough.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * @author Bill Anderson-Blough (bill.andersonblough@gmail.com)
 */
public class BindingViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {

    T binding;

    public BindingViewHolder(View view) {
        super(view);
        this.binding = DataBindingUtil.bind(view);
    }

    public T getBinding() {
        return binding;
    }
}
