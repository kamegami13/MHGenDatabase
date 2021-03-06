package com.ghstudios.android.ui.list;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.ghstudios.android.mhgendatabase.R;
import com.ghstudios.android.ui.general.GenericActivity;
import com.ghstudios.android.ui.list.adapter.MenuSection;

public class CombiningListActivity extends GenericActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.combining);

        // Tag as top level activity
        super.setAsTopLevel();
    }

    @Override
    protected int getSelectedSection() {
        return MenuSection.COMBINING;
    }

    @Override
    protected Fragment createFragment() {
        super.detail = CombiningListFragment.newInstance(-1);
        return super.detail;
    }

}
