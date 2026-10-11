package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import w7.b;

/* loaded from: classes.dex */
public final class zzado {
    private final String zza;
    private final String zzb;

    public zzado(Context context) {
        this(context, context.getPackageName());
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    private zzado(Context context, String str) {
        b.s(context);
        b.o(str);
        this.zza = str;
        try {
            byte[] x9 = c.x(context, str);
            if (x9 == null) {
                Log.e("FBA-PackageInfo", "single cert required: " + str);
                this.zzb = null;
                return;
            }
            this.zzb = d.h(x9);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: " + str);
            this.zzb = null;
        }
    }
}
