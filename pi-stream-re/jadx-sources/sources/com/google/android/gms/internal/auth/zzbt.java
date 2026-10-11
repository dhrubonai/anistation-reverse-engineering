package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import w7.b;
import y4.a;

/* loaded from: classes.dex */
public final class zzbt {
    public final q getSpatulaHeader(o oVar) {
        b.s(oVar);
        return oVar.a(new zzbs(this, oVar));
    }

    public final q performProxyRequest(o oVar, a aVar) {
        b.s(oVar);
        b.s(aVar);
        return oVar.a(new zzbq(this, oVar, aVar));
    }
}
