package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class p45 implements Closeable {
    public final int A;
    public final mj2 B;
    public final ik2 C;
    public final t45 D;
    public final p45 E;
    public final p45 F;
    public final p45 G;
    public final long H;
    public final long I;
    public final qb0 J;
    public final l35 x;
    public final iw4 y;
    public final String z;

    public p45(l35 l35Var, iw4 iw4Var, String str, int i, mj2 mj2Var, ik2 ik2Var, t45 t45Var, p45 p45Var, p45 p45Var2, p45 p45Var3, long j, long j2, qb0 qb0Var) {
        l35Var.getClass();
        iw4Var.getClass();
        str.getClass();
        this.x = l35Var;
        this.y = iw4Var;
        this.z = str;
        this.A = i;
        this.B = mj2Var;
        this.C = ik2Var;
        this.D = t45Var;
        this.E = p45Var;
        this.F = p45Var2;
        this.G = p45Var3;
        this.H = j;
        this.I = j2;
        this.J = qb0Var;
    }

    public static String a(p45 p45Var, String str) {
        p45Var.getClass();
        String b = p45Var.C.b(str);
        if (b == null) {
            return null;
        }
        return b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t45 t45Var = this.D;
        if (t45Var != null) {
            t45Var.close();
        } else {
            ze0.m("response is not eligible for a body and must not be closed");
        }
    }

    public final boolean l() {
        int i = this.A;
        if (200 > i || i >= 300) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o45, java.lang.Object] */
    public final o45 p() {
        ?? obj = new Object();
        obj.a = this.x;
        obj.b = this.y;
        obj.c = this.A;
        obj.d = this.z;
        obj.e = this.B;
        obj.f = this.C.d();
        obj.g = this.D;
        obj.h = this.E;
        obj.i = this.F;
        obj.j = this.G;
        obj.k = this.H;
        obj.l = this.I;
        obj.m = this.J;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.y + ", code=" + this.A + ", message=" + this.z + ", url=" + this.x.a + '}';
    }
}
