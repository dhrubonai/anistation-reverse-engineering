package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import t4.c;
import t4.d;
import y4.a;
import y4.b;

/* loaded from: classes.dex */
public final class zzbo extends l {
    public zzbo(Activity activity, d dVar) {
        super(activity, c.f10031a, (e) (dVar == null ? d.f10032b : dVar), k.f2487c);
    }

    public final Task<String> getSpatulaHeader() {
        v vVar = new v();
        vVar.f2472d = new s() { // from class: com.google.android.gms.internal.auth.zzbk
            @Override // com.google.android.gms.common.api.internal.s
            public final void accept(Object obj, Object obj2) {
                ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(zzbo.this, (TaskCompletionSource) obj2));
            }
        };
        vVar.f2470b = 1520;
        return doRead(vVar.a());
    }

    public final Task<b> performProxyRequest(final a aVar) {
        v vVar = new v();
        vVar.f2472d = new s() { // from class: com.google.android.gms.internal.auth.zzbl
            @Override // com.google.android.gms.common.api.internal.s
            public final void accept(Object obj, Object obj2) {
                zzbo zzboVar = zzbo.this;
                a aVar2 = aVar;
                ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), aVar2);
            }
        };
        vVar.f2470b = 1518;
        return doWrite(vVar.a());
    }

    public zzbo(Context context, d dVar) {
        super(context, c.f10031a, dVar == null ? d.f10032b : dVar, k.f2487c);
    }
}
