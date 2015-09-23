package com.andersonblough.databinding;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * @author Bill Anderson-Blough (bill.andersonblough@gmail.com)
 */
public class OldViewHolder extends RecyclerView.ViewHolder {

//    @Bind(R.id.codename)
//    TextView codeNameField;
//
//    @Bind(R.id.version)
//    TextView versionField;

    public OldViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
