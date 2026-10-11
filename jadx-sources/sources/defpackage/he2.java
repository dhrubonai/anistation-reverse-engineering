package defpackage;

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

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class he2 extends y2 {
    public static final Parcelable.Creator<he2> CREATOR = new aw7((byte) 7);
    public static final Scope[] L = new Scope[0];
    public static final q12[] M = new q12[0];
    public String A;
    public IBinder B;
    public Scope[] C;
    public Bundle D;
    public Account E;
    public q12[] F;
    public q12[] G;
    public final boolean H;
    public final int I;
    public boolean J;
    public final String K;
    public final int x;
    public final int y;
    public final int z;

    public he2(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, q12[] q12VarArr, q12[] q12VarArr2, boolean z, int i4, boolean z2, String str2) {
        Scope[] scopeArr2;
        Bundle bundle2;
        q12[] q12VarArr3;
        Account account2;
        IInterface sa7Var;
        if (scopeArr == null) {
            scopeArr2 = L;
        } else {
            scopeArr2 = scopeArr;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        q12[] q12VarArr4 = M;
        if (q12VarArr == null) {
            q12VarArr3 = q12VarArr4;
        } else {
            q12VarArr3 = q12VarArr;
        }
        q12VarArr4 = q12VarArr2 != null ? q12VarArr2 : q12VarArr4;
        this.x = i;
        this.y = i2;
        this.z = i3;
        if ("com.google.android.gms".equals(str)) {
            this.A = "com.google.android.gms";
        } else {
            this.A = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = s4.f;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof at2) {
                    sa7Var = (at2) queryLocalInterface;
                } else {
                    sa7Var = new sa7(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 2);
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        z58 z58Var = (z58) sa7Var;
                        Parcel a = z58Var.a(z58Var.K(), 2);
                        Account account3 = (Account) fn7.a(a, Account.CREATOR);
                        a.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
            }
        } else {
            this.B = iBinder;
            account2 = account;
        }
        this.E = account2;
        this.C = scopeArr2;
        this.D = bundle2;
        this.F = q12VarArr3;
        this.G = q12VarArr4;
        this.H = z;
        this.I = i4;
        this.J = z2;
        this.K = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aw7.a(this, parcel, i);
    }
}
