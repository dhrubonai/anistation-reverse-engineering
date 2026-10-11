package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class jw0 {
    public static final jw0 e;
    public static final jw0 f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        bm0 bm0Var = bm0.r;
        bm0 bm0Var2 = bm0.s;
        bm0 bm0Var3 = bm0.t;
        bm0 bm0Var4 = bm0.l;
        bm0 bm0Var5 = bm0.n;
        bm0 bm0Var6 = bm0.m;
        bm0 bm0Var7 = bm0.o;
        bm0 bm0Var8 = bm0.q;
        bm0 bm0Var9 = bm0.p;
        bm0[] bm0VarArr = {bm0Var, bm0Var2, bm0Var3, bm0Var4, bm0Var5, bm0Var6, bm0Var7, bm0Var8, bm0Var9};
        bm0[] bm0VarArr2 = {bm0Var, bm0Var2, bm0Var3, bm0Var4, bm0Var5, bm0Var6, bm0Var7, bm0Var8, bm0Var9, bm0.j, bm0.k, bm0.h, bm0.i, bm0.f, bm0.g, bm0.e};
        pn0 pn0Var = new pn0((byte) 1);
        pn0Var.b((bm0[]) Arrays.copyOf(bm0VarArr, 9));
        yf6 yf6Var = yf6.TLS_1_3;
        yf6 yf6Var2 = yf6.TLS_1_2;
        pn0Var.d(yf6Var, yf6Var2);
        pn0Var.z = true;
        pn0Var.a();
        pn0 pn0Var2 = new pn0((byte) 1);
        pn0Var2.b((bm0[]) Arrays.copyOf(bm0VarArr2, 16));
        pn0Var2.d(yf6Var, yf6Var2);
        pn0Var2.z = true;
        e = pn0Var2.a();
        pn0 pn0Var3 = new pn0((byte) 1);
        pn0Var3.b((bm0[]) Arrays.copyOf(bm0VarArr2, 16));
        pn0Var3.d(yf6Var, yf6Var2, yf6.TLS_1_1, yf6.TLS_1_0);
        pn0Var3.z = true;
        pn0Var3.a();
        f = new jw0(false, false, null, null);
    }

    public jw0(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(bm0.b.L(str));
            }
            return yo0.I0(arrayList);
        }
        return null;
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (this.a) {
            String[] strArr = this.d;
            if (strArr == null || dq6.i(strArr, sSLSocket.getEnabledProtocols(), v64.y)) {
                String[] strArr2 = this.c;
                if (strArr2 != null && !dq6.i(strArr2, sSLSocket.getEnabledCipherSuites(), bm0.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(qs5.e(str));
            }
            return yo0.I0(arrayList);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jw0) {
            if (obj != this) {
                jw0 jw0Var = (jw0) obj;
                boolean z = jw0Var.a;
                boolean z2 = this.a;
                if (z2 == z) {
                    if (z2) {
                        if (!Arrays.equals(this.c, jw0Var.c) || !Arrays.equals(this.d, jw0Var.d) || this.b != jw0Var.b) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (this.a) {
            int i2 = 0;
            String[] strArr = this.c;
            if (strArr != null) {
                i = Arrays.hashCode(strArr);
            } else {
                i = 0;
            }
            int i3 = (527 + i) * 31;
            String[] strArr2 = this.d;
            if (strArr2 != null) {
                i2 = Arrays.hashCode(strArr2);
            }
            return ((i3 + i2) * 31) + (!this.b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
