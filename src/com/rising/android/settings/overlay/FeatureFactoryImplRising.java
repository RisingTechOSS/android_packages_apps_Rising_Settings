package com.rising.android.settings.overlay;

import android.content.Context;

import com.android.settings.accounts.AccountFeatureProvider;
import com.android.settings.fuelgauge.BatteryStatusFeatureProvider;
import com.android.settings.fuelgauge.PowerUsageFeatureProvider;
import com.android.settings.overlay.FeatureFactoryImpl;

import com.google.android.settings.accounts.AccountFeatureProviderGoogleImpl;

import com.rising.android.settings.fuelgauge.BatteryStatusFeatureProviderRisingImpl;
import com.rising.android.settings.fuelgauge.PowerUsageFeatureProviderRisingImpl;

public final class FeatureFactoryImplRising extends FeatureFactoryImpl {

    private AccountFeatureProvider mAccountFeatureProvider;
    private BatteryStatusFeatureProvider mBatteryStatusFeatureProvider;
    private PowerUsageFeatureProvider mPowerUsageFeatureProvider;

    @Override
    public AccountFeatureProvider getAccountFeatureProvider() {
        if (mAccountFeatureProvider == null) {
            mAccountFeatureProvider = new AccountFeatureProviderGoogleImpl();
        }
        return mAccountFeatureProvider;
    }

    @Override
    public BatteryStatusFeatureProvider getBatteryStatusFeatureProvider(Context context) {
        if (mBatteryStatusFeatureProvider == null) {
            mBatteryStatusFeatureProvider = new BatteryStatusFeatureProviderRisingImpl(context);
        }
        return mBatteryStatusFeatureProvider;
    }

    @Override
    public PowerUsageFeatureProvider getPowerUsageFeatureProvider(Context context) {
        if (mPowerUsageFeatureProvider == null) {
            mPowerUsageFeatureProvider = new PowerUsageFeatureProviderRisingImpl(context);
        }
        return mPowerUsageFeatureProvider;
    }

}
