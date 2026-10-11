package defpackage;

import android.text.Layout;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rk6 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public m96 r;
    public String t;
    public String u;
    public String v;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(rk6 rk6Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (rk6Var != null) {
            if (!this.c && rk6Var.c) {
                this.b = rk6Var.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = rk6Var.h;
            }
            if (this.i == -1) {
                this.i = rk6Var.i;
            }
            if (this.a == null && (str = rk6Var.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = rk6Var.f;
            }
            if (this.g == -1) {
                this.g = rk6Var.g;
            }
            if (this.n == -1) {
                this.n = rk6Var.n;
            }
            if (this.o == null && (alignment2 = rk6Var.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = rk6Var.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = rk6Var.q;
            }
            if (this.j == -1) {
                this.j = rk6Var.j;
                this.k = rk6Var.k;
            }
            if (this.r == null) {
                this.r = rk6Var.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = rk6Var.s;
            }
            if (this.t == null) {
                this.t = rk6Var.t;
            }
            if (this.u == null) {
                this.u = rk6Var.u;
            }
            if (this.v == null) {
                this.v = rk6Var.v;
            }
            if (!this.e && rk6Var.e) {
                this.d = rk6Var.d;
                this.e = true;
            }
            if (this.m == -1 && (i = rk6Var.m) != -1) {
                this.m = i;
            }
        }
    }
}
