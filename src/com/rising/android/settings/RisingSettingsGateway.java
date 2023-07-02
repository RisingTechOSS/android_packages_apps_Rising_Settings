package com.rising.android.settings;

import com.rising.android.settings.fuelgauge.batterysaver.SmartPixels;

public class RisingSettingsGateway {

    /**
     * A list of fragment that can be hosted by RisingSettingsActivity. SettingsActivity will throw a
     * security exception if the fragment it needs to display is not in this list.
     */
    public static final String[] ENTRY_FRAGMENTS = {
        SmartPixels.class.getName(),
    };
}
