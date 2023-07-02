package com.rising.android.settings;

import com.android.settings.SettingsActivity;

public class RisingSettingsActivity extends SettingsActivity {

    @Override
    protected boolean isValidFragment(String fragmentName) {
        // Almost all fragments are wrapped in this,
        // except for a few that have their own activities.
        for (int i = 0; i < RisingSettingsGateway.ENTRY_FRAGMENTS.length; i++) {
            if (RisingSettingsGateway.ENTRY_FRAGMENTS[i].equals(fragmentName)) return true;
        }
        return false;
    }

}
