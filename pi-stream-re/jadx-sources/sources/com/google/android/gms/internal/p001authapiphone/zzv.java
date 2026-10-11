package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import b5.c;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class zzv extends l {
    private static final h zza;
    private static final a zzb;
    private static final i zzc;

    static {
        h hVar = new h();
        zza = hVar;
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzc = new i("SmsCodeBrowser.API", zztVar, hVar);
    }

    public zzv(Activity activity) {
        super(activity, zzc, (e) e.f2365i, k.f2487c);
    }

    public final Task<Void> startSmsCodeRetriever() {
        v vVar = new v();
        vVar.f2473e = new c[]{zzac.zzb};
        vVar.f2472d = new s() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            @Override // com.google.android.gms.common.api.internal.s
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzf(new zzu(zzv.this, (TaskCompletionSource) obj2));
            }
        };
        vVar.f2470b = 1566;
        return doWrite(vVar.a());
    }

    public zzv(Context context) {
        super(context, zzc, e.f2365i, k.f2487c);
    }
}
