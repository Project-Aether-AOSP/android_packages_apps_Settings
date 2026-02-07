package com.android.settings.aether;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class AetherSettings extends SettingsPreferenceFragment {

    @Override
    public int getMetricsCategory() {
        return 0;
    }

    @Override
    protected int getPreferenceScreenResId() {
        return R.xml.aether_settings;
    }
}
