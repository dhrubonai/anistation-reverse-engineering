package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.internal.h;

/* loaded from: classes.dex */
final class zzv extends a {
    @Override // com.google.android.gms.common.api.a
    public final /* synthetic */ g buildClient(Context context, Looper looper, h hVar, Object obj, com.google.android.gms.common.api.internal.g gVar, p pVar) {
        return new zzi(context, looper, hVar, gVar, pVar);
    }
}
