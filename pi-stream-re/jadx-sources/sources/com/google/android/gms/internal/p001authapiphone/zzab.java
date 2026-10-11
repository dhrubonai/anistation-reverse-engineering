package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import b5.c;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import x4.a;

/* loaded from: classes.dex */
public final class zzab extends a {
    public zzab(Activity activity) {
        super(activity);
    }

    public final Task<Void> startSmsRetriever() {
        v vVar = new v();
        vVar.f2472d = new s() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            @Override // com.google.android.gms.common.api.internal.s
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzg(new zzz(zzab.this, (TaskCompletionSource) obj2));
            }
        };
        vVar.f2473e = new c[]{zzac.zzc};
        vVar.f2470b = 1567;
        return doWrite(vVar.a());
    }

    public final Task<Void> startSmsUserConsent(final String str) {
        v vVar = new v();
        vVar.f2472d = new s() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            @Override // com.google.android.gms.common.api.internal.s
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa(zzabVar, (TaskCompletionSource) obj2));
            }
        };
        vVar.f2473e = new c[]{zzac.zzd};
        vVar.f2470b = 1568;
        return doWrite(vVar.a());
    }

    public zzab(Context context) {
        super(context);
    }
}
