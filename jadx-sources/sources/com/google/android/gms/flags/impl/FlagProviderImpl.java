package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import defpackage.ac7;
import defpackage.ic4;
import defpackage.nv5;
import defpackage.oo7;
import defpackage.ov5;
import defpackage.tt2;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class FlagProviderImpl extends oo7 {
    public boolean e;
    public SharedPreferences f;

    public FlagProviderImpl() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        this.e = false;
    }

    @Override // defpackage.hp7
    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        String str2;
        if (!this.e) {
            return z;
        }
        SharedPreferences sharedPreferences = this.f;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            valueOf = (Boolean) nv5.w(new ac7(sharedPreferences, str, valueOf, (byte) 0));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
        }
        return valueOf.booleanValue();
    }

    @Override // defpackage.hp7
    public int getIntFlagValue(String str, int i, int i2) {
        String str2;
        if (!this.e) {
            return i;
        }
        SharedPreferences sharedPreferences = this.f;
        Integer valueOf = Integer.valueOf(i);
        try {
            valueOf = (Integer) nv5.w(new ac7(sharedPreferences, str, valueOf, (byte) 1));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
        }
        return valueOf.intValue();
    }

    @Override // defpackage.hp7
    public long getLongFlagValue(String str, long j, int i) {
        String str2;
        if (!this.e) {
            return j;
        }
        SharedPreferences sharedPreferences = this.f;
        Long valueOf = Long.valueOf(j);
        try {
            valueOf = (Long) nv5.w(new ac7(sharedPreferences, str, valueOf, (byte) 2));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
        }
        return valueOf.longValue();
    }

    @Override // defpackage.hp7
    public String getStringFlagValue(String str, String str2, int i) {
        String str3;
        if (!this.e) {
            return str2;
        }
        try {
            return (String) nv5.w(new ac7(this.f, str, str2, (byte) 3));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str3 = "Flag value not available, returning default: ".concat(valueOf);
            } else {
                str3 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str3);
            return str2;
        }
    }

    @Override // defpackage.hp7
    public void init(tt2 tt2Var) {
        String str;
        Context context = (Context) ic4.M(tt2Var);
        if (!this.e) {
            try {
                this.f = ov5.l(context.createPackageContext("com.google.android.gms", 0));
                this.e = true;
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str = "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf);
                } else {
                    str = new String("Could not retrieve sdk flags, continuing with defaults: ");
                }
                Log.w("FlagProviderImpl", str);
            }
        }
    }
}
