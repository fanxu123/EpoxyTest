package com.ubnt.epoxytest;

import com.airbnb.epoxy.EpoxyAdapter;

/**
 * TestAdapter
 * Created by Frank Fan<frank.fan@ubnt.com> on 11/2/16.
 */

public class TestAdapter extends EpoxyAdapter {

    private TextModel mFruit, mAnimal;


    public TestAdapter() {
        enableDiffing();

        mFruit = new TextModel_("Fruit");
        mAnimal = new TextModel_("Animal");

        addModels(mFruit, mAnimal);
        mFruit.hide();

        insertModelAfter( new TextModel_("Cat"), mAnimal);
        insertModelAfter( new TextModel_("Dog"), mAnimal);
        insertModelAfter( new TextModel_("Horse"), mAnimal);
    }

    public void showFirst() {
        mFruit.show();
        notifyModelChanged(mFruit);
    }
    public void hideFirst() {
        mFruit.hide();
        notifyModelChanged(mFruit);
    }
}
