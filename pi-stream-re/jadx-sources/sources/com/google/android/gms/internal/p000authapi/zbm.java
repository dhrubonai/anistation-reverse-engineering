package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.o;
import t4.b;

/* loaded from: classes.dex */
abstract class zbm extends d {
    public zbm(o oVar) {
        super(b.f10029a, oVar);
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.b bVar) {
        zbo zboVar = (zbo) bVar;
        zba(zboVar.getContext(), (zbt) zboVar.getService());
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zbm) obj);
    }

    public abstract void zba(Context context, zbt zbtVar);
}
