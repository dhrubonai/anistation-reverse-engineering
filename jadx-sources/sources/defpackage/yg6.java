package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yg6 {
    public static final String f;
    public static final String g;
    public final int a;
    public final String b;
    public final int c;
    public final ea2[] d;
    public int e;

    static {
        String str = eq6.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
    }

    public yg6(String str, ea2... ea2VarArr) {
        boolean z;
        int h;
        if (ea2VarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        this.b = str;
        this.d = ea2VarArr;
        this.a = ea2VarArr.length;
        String str2 = ea2VarArr[0].p;
        if (TextUtils.isEmpty(str2)) {
            h = qy3.h(ea2VarArr[0].o);
        } else {
            h = qy3.h(str2);
        }
        this.c = h;
        String str3 = ea2VarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i = ea2VarArr[0].f | 16384;
        for (int i2 = 1; i2 < ea2VarArr.length; i2++) {
            String str4 = ea2VarArr[i2].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : str4)) {
                b("languages", i2, ea2VarArr[0].d, ea2VarArr[i2].d);
                return;
            } else {
                if (i != (ea2VarArr[i2].f | 16384)) {
                    b("role flags", i2, Integer.toBinaryString(ea2VarArr[0].f), Integer.toBinaryString(ea2VarArr[i2].f));
                    return;
                }
            }
        }
    }

    public static void b(String str, int i, String str2, String str3) {
        StringBuilder o = h11.o("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        o.append(str3);
        o.append("' (track ");
        o.append(i);
        o.append(")");
        kb0.t("TrackGroup", "", new IllegalStateException(o.toString()));
    }

    public final int a(ea2 ea2Var) {
        int i = 0;
        while (true) {
            ea2[] ea2VarArr = this.d;
            if (i < ea2VarArr.length) {
                if (ea2Var == ea2VarArr[i]) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        ea2[] ea2VarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(ea2VarArr.length);
        int length = ea2VarArr.length;
        int i = 0;
        while (i < length) {
            ea2 ea2Var = ea2VarArr[i];
            List list = ea2Var.s;
            Bundle bundle2 = new Bundle();
            bundle2.putString(ea2.W, ea2Var.a);
            bundle2.putString(ea2.X, ea2Var.b);
            String str = ea2.B0;
            nw2 nw2Var = ea2Var.c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(nw2Var.size());
            int size = nw2Var.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = nw2Var.get(i2);
                i2++;
                w93 w93Var = (w93) obj;
                w93Var.getClass();
                Bundle bundle3 = new Bundle();
                ea2[] ea2VarArr2 = ea2VarArr;
                String str2 = w93Var.a;
                int i3 = length;
                if (str2 != null) {
                    bundle3.putString(w93.c, str2);
                }
                bundle3.putString(w93.d, w93Var.b);
                arrayList2.add(bundle3);
                ea2VarArr = ea2VarArr2;
                length = i3;
            }
            ea2[] ea2VarArr3 = ea2VarArr;
            int i4 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(ea2.Y, ea2Var.d);
            bundle2.putInt(ea2.Z, ea2Var.e);
            bundle2.putInt(ea2.a0, ea2Var.f);
            bundle2.putFloat(ea2.K0, ea2Var.g);
            int i5 = ea2Var.h;
            if (i5 != ea2.V.h) {
                bundle2.putInt(ea2.C0, i5);
            }
            bundle2.putInt(ea2.b0, ea2Var.i);
            bundle2.putInt(ea2.c0, ea2Var.j);
            bundle2.putString(ea2.d0, ea2Var.l);
            String str3 = ea2Var.n;
            if (str3 != null) {
                bundle2.putString(ea2.G0, str3);
            }
            bundle2.putString(ea2.e0, ea2Var.o);
            bundle2.putString(ea2.f0, ea2Var.p);
            bundle2.putInt(ea2.g0, ea2Var.q);
            for (int i6 = 0; i6 < list.size(); i6++) {
                bundle2.putByteArray(ea2.h0 + "_" + Integer.toString(i6, 36), (byte[]) list.get(i6));
            }
            bundle2.putParcelable(ea2.i0, ea2Var.t);
            bundle2.putLong(ea2.j0, ea2Var.u);
            bundle2.putInt(ea2.k0, ea2Var.w);
            bundle2.putInt(ea2.l0, ea2Var.x);
            bundle2.putInt(ea2.J0, ea2Var.y);
            bundle2.putInt(ea2.E0, ea2Var.z);
            bundle2.putInt(ea2.F0, ea2Var.A);
            bundle2.putFloat(ea2.m0, ea2Var.B);
            bundle2.putInt(ea2.n0, ea2Var.C);
            bundle2.putBoolean(ea2.I0, ea2Var.D);
            bundle2.putFloat(ea2.o0, ea2Var.E);
            bundle2.putByteArray(ea2.p0, ea2Var.F);
            bundle2.putInt(ea2.q0, ea2Var.G);
            hp0 hp0Var = ea2Var.H;
            if (hp0Var != null) {
                String str4 = ea2.r0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(hp0.j, hp0Var.a);
                bundle4.putInt(hp0.k, hp0Var.b);
                bundle4.putInt(hp0.l, hp0Var.c);
                bundle4.putByteArray(hp0.m, hp0Var.d);
                bundle4.putInt(hp0.n, hp0Var.e);
                bundle4.putInt(hp0.o, hp0Var.f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(ea2.D0, ea2Var.I);
            bundle2.putInt(ea2.s0, ea2Var.J);
            bundle2.putInt(ea2.H0, ea2Var.K);
            bundle2.putInt(ea2.t0, ea2Var.L);
            bundle2.putInt(ea2.u0, ea2Var.M);
            bundle2.putInt(ea2.v0, ea2Var.N);
            bundle2.putInt(ea2.w0, ea2Var.O);
            bundle2.putInt(ea2.x0, ea2Var.P);
            bundle2.putInt(ea2.z0, ea2Var.R);
            bundle2.putInt(ea2.A0, ea2Var.S);
            bundle2.putInt(ea2.y0, ea2Var.T);
            arrayList.add(bundle2);
            i++;
            ea2VarArr = ea2VarArr3;
            length = i4;
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yg6.class == obj.getClass()) {
            yg6 yg6Var = (yg6) obj;
            if (this.b.equals(yg6Var.b) && Arrays.equals(this.d, yg6Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.d) + zo5.i(this.b, 527, 31);
            this.e = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
