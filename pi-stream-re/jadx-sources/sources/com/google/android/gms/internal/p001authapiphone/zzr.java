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
import w7.b;

/* loaded from: classes.dex */
public final class zzr extends l {
    private static final h zza;
    private static final a zzb;
    private static final i zzc;

    static {
        h hVar = new h();
        zza = hVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new i("SmsCodeAutofill.API", zznVar, hVar);
    }

    public zzr(Activity activity) {
        super(activity, zzc, (e) e.f2365i, k.f2487c);
    }

    public final Task<Integer> checkPermissionState() {
        v vVar = new v();
        vVar.f2473e = new c[]{zzac.zza};
        vVar.f2472d = new s() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            @Override // com.google.android.gms.common.api.internal.s
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzc(new zzp(zzr.this, (TaskCompletionSource) obj2));
            }
        };
        vVar.f2470b = 1564;
        return doRead(vVar.a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        b.s(str);
        b.i("The package name cannot be empty.", !str.isEmpty());
        v vVar = new v();
        vVar.f2473e = new c[]{zzac.zza};
        vVar.f2472d = new s() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            @Override // com.google.android.gms.common.api.internal.s
            public final void accept(Object obj, Object obj2) {
                zzr zzrVar = zzr.this;
                ((zzh) ((zzw) obj).getService()).zzd(str, new zzq(zzrVar, (TaskCompletionSource) obj2));
            }
        };
        vVar.f2470b = 1565;
        return doRead(vVar.a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        v vVar = new v();
        vVar.f2473e = new c[]{zzac.zza};
        vVar.f2472d = new s() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            @Override // com.google.android.gms.common.api.internal.s
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zze(new zzo(zzr.this, (TaskCompletionSource) obj2));
            }
        };
        vVar.f2470b = 1563;
        return doWrite(vVar.a());
    }

    public zzr(Context context) {
        super(context, zzc, e.f2365i, k.f2487c);
    }
}
