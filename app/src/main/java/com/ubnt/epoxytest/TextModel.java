package com.ubnt.epoxytest;

import android.view.View;
import android.widget.TextView;

import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelWithHolder;

/**
 * TextModel
 * Created by Frank Fan<frank.fan@ubnt.com> on 10/15/16.
 */

public class TextModel extends EpoxyModelWithHolder<TextModel.TextHolder> {

    @EpoxyAttribute
    String text;

    public TextModel(String text) {
        super();
        this.text = text;
    }

    @Override
    protected TextHolder createNewHolder() {
        return new TextHolder();
    }

    @Override
    protected int getDefaultLayout() {
        return R.layout.text;
    }

    @Override
    public void bind(TextHolder holder) {
        holder.title.setText(text);
    }

    static class TextHolder extends EpoxyHolder {

        TextView title;

        @Override
        protected void bindView(View itemView) {
            title = (TextView) itemView;
        }
    }
}
