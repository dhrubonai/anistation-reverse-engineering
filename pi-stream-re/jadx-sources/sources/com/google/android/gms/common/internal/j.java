package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes.dex */
public final class j extends c5.a {
    public static final Parcelable.Creator<j> CREATOR = new com.google.android.gms.common.api.y(9);
    public static final Scope[] F = new Scope[0];
    public static final b5.c[] G = new b5.c[0];
    public b5.c[] A;
    public final boolean B;
    public final int C;
    public boolean D;
    public final String E;

    /* renamed from: a, reason: collision with root package name */
    public final int f2538a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2539b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2540c;

    /* renamed from: d, reason: collision with root package name */
    public String f2541d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f2542e;

    /* renamed from: f, reason: collision with root package name */
    public Scope[] f2543f;

    /* renamed from: x, reason: collision with root package name */
    public Bundle f2544x;

    /* renamed from: y, reason: collision with root package name */
    public Account f2545y;

    /* renamed from: z, reason: collision with root package name */
    public b5.c[] f2546z;

    public j(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, b5.c[] cVarArr, b5.c[] cVarArr2, boolean z9, int i13, boolean z10, String str2) {
        Account account2;
        m s0Var;
        scopeArr = scopeArr == null ? F : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        b5.c[] cVarArr3 = G;
        cVarArr = cVarArr == null ? cVarArr3 : cVarArr;
        cVarArr2 = cVarArr2 == null ? cVarArr3 : cVarArr2;
        this.f2538a = i10;
        this.f2539b = i11;
        this.f2540c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f2541d = "com.google.android.gms";
        } else {
            this.f2541d = str;
        }
        if (i10 < 2) {
            if (iBinder != null) {
                int i14 = a.f2494a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof m) {
                    s0Var = (m) queryLocalInterface;
                } else {
                    s0Var = new s0(iBinder);
                }
                if (s0Var != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        s0 s0Var2 = (s0) s0Var;
                        Parcel zzB = s0Var2.zzB(2, s0Var2.zza());
                        account2 = (Account) zzc.zza(zzB, Account.CREATOR);
                        zzB.recycle();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                    this.f2545y = account2;
                }
            }
            account2 = null;
            this.f2545y = account2;
        } else {
            this.f2542e = iBinder;
            this.f2545y = account;
        }
        this.f2543f = scopeArr;
        this.f2544x = bundle;
        this.f2546z = cVarArr;
        this.A = cVarArr2;
        this.B = z9;
        this.C = i13;
        this.D = z10;
        this.E = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        com.google.android.gms.common.api.y.a(this, parcel, i10);
    }
}
