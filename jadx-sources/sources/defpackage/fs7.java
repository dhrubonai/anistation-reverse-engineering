package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fs7 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final Bundle e;

    public fs7(long j, long j2, Bundle bundle, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.e = bundle;
        this.c = j;
        this.d = j2;
    }

    public static fs7 a(mm7 mm7Var) {
        String str = mm7Var.x;
        String str2 = mm7Var.z;
        return new fs7(mm7Var.A, mm7Var.B, mm7Var.y.g(), str, str2);
    }

    public final mm7 b() {
        im7 im7Var = new im7(new Bundle(this.e));
        return new mm7(this.a, im7Var, this.b, this.c, this.d);
    }

    public final String toString() {
        String obj = this.e.toString();
        String str = this.b;
        int length = String.valueOf(str).length();
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + obj.length());
        qx1.x(sb, "origin=", str, ",name=", str2);
        return h11.k(sb, ",params=", obj);
    }
}
