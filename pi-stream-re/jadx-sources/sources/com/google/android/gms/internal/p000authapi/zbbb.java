package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.internal.h;

/* loaded from: classes.dex */
final class zbbb extends a {
    @Override // com.google.android.gms.common.api.a
    public final /* synthetic */ g buildClient(Context context, Looper looper, h hVar, Object obj, com.google.android.gms.common.api.internal.g gVar, p pVar) {
        a3.g.z(obj);
        return new zbbh(context, looper, null, hVar, gVar, pVar);
    }
}
