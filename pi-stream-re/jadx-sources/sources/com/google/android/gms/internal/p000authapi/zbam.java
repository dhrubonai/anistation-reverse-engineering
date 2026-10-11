package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.j;
import w4.f;
import w4.h;
import w4.i;

/* loaded from: classes.dex */
public final class zbam extends zba {
    public zbam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbac zbacVar, f fVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbacVar);
        zbc.zbc(zba, fVar);
        zbb(1, zba);
    }

    public final void zbd(zbaf zbafVar, h hVar, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, zbafVar);
        zbc.zbc(zba, hVar);
        zba.writeString(str);
        zbb(4, zba);
    }

    public final void zbe(zbah zbahVar, i iVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbahVar);
        zbc.zbc(zba, iVar);
        zbb(3, zba);
    }

    public final void zbf(j jVar, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, jVar);
        zba.writeString(str);
        zbb(2, zba);
    }
}
