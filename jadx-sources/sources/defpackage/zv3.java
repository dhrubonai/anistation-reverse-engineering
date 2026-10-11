package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zv3 implements ct3 {
    public final dt2 x;
    public final int y;

    public zv3(dt2 dt2Var, int i) {
        this.x = dt2Var;
        this.y = i;
    }

    @Override // defpackage.ct3
    public final void a(int i, lk5 lk5Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle a = lk5Var.a();
        ct2 ct2Var = (ct2) this.x;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            tl7.X(obtain, a);
            tl7.X(obtain, bundle);
            ct2Var.e.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.ct3
    public final void b(int i) {
        ct2 ct2Var = (ct2) this.x;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            ct2Var.e.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.ct3
    public final void c(int i, int i2, int i3) {
        ct2 ct2Var = (ct2) this.x;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            ct2Var.e.transact(3018, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.ct3
    public final void d(int i, ag3 ag3Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(ag3.d, ag3Var.a);
        bundle.putLong(ag3.e, ag3Var.b);
        bundle.putBundle(ag3.g, ag3Var.c.a());
        bundle.putInt(ag3.f, 4);
        ct2 ct2Var = (ct2) this.x;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            tl7.X(obtain, bundle);
            ct2Var.e.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.ct3
    public final void e(int i, go4 go4Var) {
        Bundle b = go4Var.b();
        ct2 ct2Var = (ct2) this.x;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            tl7.X(obtain, b);
            ct2Var.e.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zv3.class) {
            return Objects.equals(((ct2) this.x).e, ((ct2) ((zv3) obj).x).e);
        }
        return false;
    }

    @Override // defpackage.ct3
    public final void f(int i, tk5 tk5Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(tk5.e, tk5Var.a);
        bundle.putBundle(tk5.f, tk5Var.b);
        bundle.putLong(tk5.g, tk5Var.c);
        ok5 ok5Var = tk5Var.d;
        if (ok5Var != null) {
            bundle.putBundle(tk5.h, ok5Var.a());
        }
        ct2 ct2Var = (ct2) this.x;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            tl7.X(obtain, bundle);
            ct2Var.e.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // defpackage.ct3
    public final void g(int i, ep4 ep4Var, go4 go4Var, boolean z, boolean z2) {
        boolean z3;
        ?? r3;
        Parcel obtain;
        boolean z4 = false;
        int i2 = this.y;
        if (i2 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        io3.B(z3);
        if (!z && go4Var.a(17)) {
            r3 = 0;
        } else {
            r3 = 1;
        }
        if (z2 || !go4Var.a(30)) {
            z4 = true;
        }
        dt2 dt2Var = this.x;
        if (i2 >= 2) {
            Bundle f = ep4Var.e(go4Var, z, z2).f(i2);
            Bundle bundle = new Bundle();
            bundle.putBoolean(dp4.a, r3);
            bundle.putBoolean(dp4.b, z4);
            ct2 ct2Var = (ct2) dt2Var;
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i);
                tl7.X(obtain, f);
                tl7.X(obtain, bundle);
                ct2Var.e.transact(3013, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f2 = ep4Var.e(go4Var, z, true).f(i2);
        ct2 ct2Var2 = (ct2) dt2Var;
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            tl7.X(obtain, f2);
            obtain.writeInt(r3);
            ct2Var2.e.transact(3007, obtain, null, 1);
        } finally {
        }
    }

    @Override // defpackage.ct3
    public final void h(int i, sk5 sk5Var, boolean z, boolean z2, int i2) {
        Bundle b = sk5Var.a(z, z2).b(i2);
        ct2 ct2Var = (ct2) this.x;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            tl7.X(obtain, b);
            ct2Var.e.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final int hashCode() {
        return Objects.hash(((ct2) this.x).e);
    }

    @Override // defpackage.ct3
    public final void onDisconnected() {
        v94.q(this.x);
    }
}
