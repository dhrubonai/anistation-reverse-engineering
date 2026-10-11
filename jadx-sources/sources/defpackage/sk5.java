package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sk5 {
    public static final jo4 k;
    public static final sk5 l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public final jo4 a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    static {
        jo4 jo4Var = new jo4(null, 0, null, null, 0, 0L, 0L, -1, -1);
        k = jo4Var;
        l = new sk5(jo4Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = eq6.a;
        m = Integer.toString(0, 36);
        n = Integer.toString(1, 36);
        o = Integer.toString(2, 36);
        p = Integer.toString(3, 36);
        q = Integer.toString(4, 36);
        r = Integer.toString(5, 36);
        s = Integer.toString(6, 36);
        t = Integer.toString(7, 36);
        u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public sk5(jo4 jo4Var, boolean z, long j, long j2, long j3, int i, long j4, long j5, long j6, long j7) {
        boolean z2;
        if (jo4Var.h != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.n(z == z2);
        this.a = jo4Var;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i;
        this.g = j4;
        this.h = j5;
        this.i = j6;
        this.j = j7;
    }

    public final sk5 a(boolean z, boolean z2) {
        boolean z3;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        if (z && z2) {
            return this;
        }
        jo4 b = this.a.b(z, z2);
        int i = 0;
        if (z && this.b) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            j = this.d;
        } else {
            j = -9223372036854775807L;
        }
        if (z) {
            j2 = this.e;
        } else {
            j2 = 0;
        }
        if (z) {
            i = this.f;
        }
        if (z) {
            j3 = this.g;
        } else {
            j3 = 0;
        }
        if (z) {
            j4 = this.h;
        } else {
            j4 = -9223372036854775807L;
        }
        if (z) {
            j5 = this.i;
        } else {
            j5 = -9223372036854775807L;
        }
        if (z) {
            j6 = this.j;
        } else {
            j6 = 0;
        }
        return new sk5(b, z3, this.c, j, j2, i, j3, j4, j5, j6);
    }

    public final Bundle b(int i) {
        Bundle bundle = new Bundle();
        jo4 jo4Var = this.a;
        if (i < 3 || !k.a(jo4Var)) {
            bundle.putBundle(m, jo4Var.c(i));
        }
        boolean z = this.b;
        if (z) {
            bundle.putBoolean(n, z);
        }
        long j = this.c;
        if (j != -9223372036854775807L) {
            bundle.putLong(o, j);
        }
        long j2 = this.d;
        if (j2 != -9223372036854775807L) {
            bundle.putLong(p, j2);
        }
        long j3 = this.e;
        if (i < 3 || j3 != 0) {
            bundle.putLong(q, j3);
        }
        int i2 = this.f;
        if (i2 != 0) {
            bundle.putInt(r, i2);
        }
        long j4 = this.g;
        if (j4 != 0) {
            bundle.putLong(s, j4);
        }
        long j5 = this.h;
        if (j5 != -9223372036854775807L) {
            bundle.putLong(t, j5);
        }
        long j6 = this.i;
        if (j6 != -9223372036854775807L) {
            bundle.putLong(u, j6);
        }
        long j7 = this.j;
        if (i >= 3 && j7 == 0) {
            return bundle;
        }
        bundle.putLong(v, j7);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && sk5.class == obj.getClass()) {
                sk5 sk5Var = (sk5) obj;
                if (this.c == sk5Var.c && this.a.equals(sk5Var.a) && this.b == sk5Var.b && this.d == sk5Var.d && this.e == sk5Var.e && this.f == sk5Var.f && this.g == sk5Var.g && this.h == sk5Var.h && this.i == sk5Var.i && this.j == sk5Var.j) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        jo4 jo4Var = this.a;
        sb.append(jo4Var.b);
        sb.append(", periodIndex=");
        sb.append(jo4Var.e);
        sb.append(", positionMs=");
        sb.append(jo4Var.f);
        sb.append(", contentPositionMs=");
        sb.append(jo4Var.g);
        sb.append(", adGroupIndex=");
        sb.append(jo4Var.h);
        sb.append(", adIndexInAdGroup=");
        sb.append(jo4Var.i);
        sb.append("}, isPlayingAd=");
        sb.append(this.b);
        sb.append(", eventTimeMs=");
        sb.append(this.c);
        sb.append(", durationMs=");
        sb.append(this.d);
        sb.append(", bufferedPositionMs=");
        sb.append(this.e);
        sb.append(", bufferedPercentage=");
        sb.append(this.f);
        sb.append(", totalBufferedDurationMs=");
        sb.append(this.g);
        sb.append(", currentLiveOffsetMs=");
        sb.append(this.h);
        sb.append(", contentDurationMs=");
        sb.append(this.i);
        sb.append(", contentBufferedPositionMs=");
        return qx1.k(this.j, "}", sb);
    }
}
