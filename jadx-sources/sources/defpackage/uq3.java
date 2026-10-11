package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uq3 {
    public static final uq3 f = new uq3(new tq3());
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        String str = eq6.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
    }

    public uq3(tq3 tq3Var) {
        long j2 = tq3Var.a;
        long j3 = tq3Var.b;
        long j4 = tq3Var.c;
        float f2 = tq3Var.d;
        float f3 = tq3Var.e;
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = f2;
        this.e = f3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [tq3, java.lang.Object] */
    public final tq3 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        uq3 uq3Var = f;
        long j2 = uq3Var.a;
        long j3 = this.a;
        if (j3 != j2) {
            bundle.putLong(g, j3);
        }
        long j4 = uq3Var.b;
        long j5 = this.b;
        if (j5 != j4) {
            bundle.putLong(h, j5);
        }
        long j6 = uq3Var.c;
        long j7 = this.c;
        if (j7 != j6) {
            bundle.putLong(i, j7);
        }
        float f2 = uq3Var.d;
        float f3 = this.d;
        if (f3 != f2) {
            bundle.putFloat(j, f3);
        }
        float f4 = uq3Var.e;
        float f5 = this.e;
        if (f5 != f4) {
            bundle.putFloat(k, f5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq3)) {
            return false;
        }
        uq3 uq3Var = (uq3) obj;
        if (this.a == uq3Var.a && this.b == uq3Var.b && this.c == uq3Var.c && this.d == uq3Var.d && this.e == uq3Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        long j2 = this.a;
        long j3 = this.b;
        int i3 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.c;
        int i4 = (i3 + ((int) ((j4 >>> 32) ^ j4))) * 31;
        float f2 = this.d;
        int i5 = 0;
        if (f2 != 0.0f) {
            i2 = Float.floatToIntBits(f2);
        } else {
            i2 = 0;
        }
        int i6 = (i4 + i2) * 31;
        float f3 = this.e;
        if (f3 != 0.0f) {
            i5 = Float.floatToIntBits(f3);
        }
        return i6 + i5;
    }
}
