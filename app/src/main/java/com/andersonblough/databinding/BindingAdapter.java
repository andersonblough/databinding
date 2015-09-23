package com.andersonblough.databinding;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author Bill Anderson-Blough (bill.andersonblough@gmail.com)
 */
public class BindingAdapter extends RecyclerView.Adapter<BindingViewHolder> {

    @Override
    public BindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new BindingViewHolder(view);

    }

    @Override
    public void onBindViewHolder(BindingViewHolder holder, int position) {
        AndroidVersion androidVersion = new AndroidVersion(position);
        holder.getBinding().setVariable(BR.androidVersion, androidVersion);
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return AndroidVersion.codenames.length;
    }
}
