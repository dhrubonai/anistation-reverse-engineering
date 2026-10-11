package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w5 {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public final int a;
    public final Uri[] b;
    public final ar3[] c;
    public final int[] d;
    public final long[] e;
    public final String[] f;
    public final x5[] g;

    static {
        String str = eq6.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
        n = Integer.toString(6, 36);
        o = Integer.toString(7, 36);
        p = Integer.toString(8, 36);
        q = Integer.toString(9, 36);
        r = Integer.toString(10, 36);
        s = Integer.toString(11, 36);
    }

    public w5(int i2, int[] iArr, ar3[] ar3VarArr, long[] jArr, String[] strArr, x5[] x5VarArr) {
        boolean z;
        Uri uri;
        int i3 = 0;
        if (iArr.length == ar3VarArr.length) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        io3.n(iArr.length == x5VarArr.length);
        this.a = i2;
        this.d = iArr;
        this.c = ar3VarArr;
        this.e = jArr;
        this.b = new Uri[ar3VarArr.length];
        while (true) {
            Uri[] uriArr = this.b;
            if (i3 < uriArr.length) {
                ar3 ar3Var = ar3VarArr[i3];
                if (ar3Var == null) {
                    uri = null;
                } else {
                    vq3 vq3Var = ar3Var.b;
                    vq3Var.getClass();
                    uri = vq3Var.a;
                }
                uriArr[i3] = uri;
                i3++;
            } else {
                this.f = strArr;
                this.g = x5VarArr;
                return;
            }
        }
    }

    public final int a(int i2) {
        int i3;
        int i4 = i2 + 1;
        while (true) {
            int[] iArr = this.d;
            if (i4 >= iArr.length || (i3 = iArr[i4]) == 0 || i3 == 1) {
                break;
            }
            i4++;
        }
        return i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w5.class == obj.getClass()) {
            w5 w5Var = (w5) obj;
            if (this.a == w5Var.a && Arrays.equals(this.c, w5Var.c) && Arrays.equals(this.d, w5Var.d) && Arrays.equals(this.e, w5Var.e) && Arrays.equals(this.f, w5Var.f) && Arrays.equals(this.g, w5Var.g)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.g) + ((((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + ((Arrays.hashCode(this.c) + (((this.a * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.f)) * 31)) * 31;
    }
}
