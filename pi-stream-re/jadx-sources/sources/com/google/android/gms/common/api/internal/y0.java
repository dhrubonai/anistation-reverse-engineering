package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class y0 extends b1 {

    /* renamed from: b, reason: collision with root package name */
    public final d f2483b;

    public y0(int i10, d dVar) {
        super(i10);
        if (dVar != null) {
            this.f2483b = dVar;
            return;
        }
        throw new NullPointerException("Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.b1
    public final void a(Status status) {
        try {
            this.f2483b.setFailedResult(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.b1
    public final void b(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.f2483b.setFailedResult(new Status(10, sb.toString()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.b1
    public final void c(g0 g0Var) {
        try {
            this.f2483b.run(g0Var.f2404b);
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.b1
    public final void d(z zVar, boolean z9) {
        Map map = (Map) zVar.f2484a;
        Boolean valueOf = Boolean.valueOf(z9);
        d dVar = this.f2483b;
        map.put(dVar, valueOf);
        dVar.addStatusListener(new y(zVar, dVar));
    }
}
