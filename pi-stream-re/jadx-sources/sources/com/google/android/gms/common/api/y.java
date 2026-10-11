package com.google.android.gms.common.api;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.c0;
import com.google.android.gms.common.internal.m0;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import o5.b1;
import o5.p0;
import o5.q0;
import o5.r0;
import o5.s0;
import o5.z;
import p7.a0;

/* loaded from: classes.dex */
public final class y implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2493a;

    public /* synthetic */ y(int i10) {
        this.f2493a = i10;
    }

    public static void a(com.google.android.gms.common.internal.j jVar, Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, jVar.f2538a);
        a0.h0(parcel, 2, jVar.f2539b);
        a0.h0(parcel, 3, jVar.f2540c);
        a0.n0(parcel, 4, jVar.f2541d, false);
        IBinder iBinder = jVar.f2542e;
        if (iBinder != null) {
            int t03 = a0.t0(5, parcel);
            parcel.writeStrongBinder(iBinder);
            a0.u0(t03, parcel);
        }
        a0.r0(parcel, 6, jVar.f2543f, i10);
        a0.e0(parcel, 7, jVar.f2544x, false);
        a0.m0(parcel, 8, jVar.f2545y, i10, false);
        a0.r0(parcel, 10, jVar.f2546z, i10);
        a0.r0(parcel, 11, jVar.A, i10);
        a0.d0(parcel, 12, jVar.B);
        a0.h0(parcel, 13, jVar.C);
        a0.d0(parcel, 14, jVar.D);
        a0.n0(parcel, 15, jVar.E, false);
        a0.u0(t02, parcel);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 667
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r28) {
        /*
            Method dump skipped, instructions count: 2100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.y.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f2493a) {
            case 0:
                return new Scope[i10];
            case 1:
                return new Status[i10];
            case 2:
                return new com.google.android.gms.common.internal.u[i10];
            case 3:
                return new com.google.android.gms.common.internal.q[i10];
            case 4:
                return new b0[i10];
            case 5:
                return new c0[i10];
            case 6:
                return new com.google.android.gms.common.internal.t[i10];
            case zzaja.zze.zzg /* 7 */:
                return new m0[i10];
            case 8:
                return new com.google.android.gms.common.internal.i[i10];
            case 9:
                return new com.google.android.gms.common.internal.j[i10];
            case 10:
                return new f5.b[i10];
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new f5.a[i10];
            case 12:
                return new f5.c[i10];
            case 13:
                return new g5.h[i10];
            case 14:
                return new g5.i[i10];
            case 15:
                return new g5.g[i10];
            case 16:
                return new g5.e[i10];
            case 17:
                return new b5.a[i10];
            case 18:
                return new b5.c[i10];
            case 19:
                return new Transport[i10];
            case 20:
                return new o5.c[i10];
            case 21:
                return new b1[i10];
            case 22:
                return new p0[i10];
            case 23:
                return new q0[i10];
            case 24:
                return new o5.w[i10];
            case 25:
                return new r0[i10];
            case 26:
                return new s0[i10];
            case 27:
                return new o5.y[i10];
            case 28:
                return new o5.x[i10];
            default:
                return new z[i10];
        }
    }
}
