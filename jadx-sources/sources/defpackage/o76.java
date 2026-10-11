package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o76 {
    public q12[] a;
    public boolean b;
    public short c;
    public Object d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o76] */
    public static o76 b() {
        ?? obj = new Object();
        obj.b = true;
        obj.c = (short) 0;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, o76] */
    public o76 a() {
        boolean z;
        if (((g25) this.d) != null) {
            z = true;
        } else {
            z = false;
        }
        a34.m("execute parameter required", z);
        q12[] q12VarArr = this.a;
        boolean z2 = this.b;
        short s = this.c;
        ?? obj = new Object();
        obj.d = this;
        obj.a = q12VarArr;
        boolean z3 = false;
        if (q12VarArr != null && z2) {
            z3 = true;
        }
        obj.b = z3;
        obj.c = s;
        return obj;
    }
}
