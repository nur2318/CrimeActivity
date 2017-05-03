package com.example.nur.crimeactivity;

import android.support.v4.app.Fragment;

/**
 * Created by nur on 2/05/17.
 */

public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}
