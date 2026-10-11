package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class de6 {
    public static final qc5 i = new qc5((byte) 6);
    public final int a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final l96 h;

    public de6(int i2, String str, String str2, long j, long j2, long j3, boolean z, int i3) {
        l96 l96Var;
        j3 = (i3 & 32) != 0 ? System.currentTimeMillis() : j3;
        z = (i3 & 64) != 0 ? true : z;
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z;
        if (str.length() == 0 && str2.length() == 0) {
            ze0.k("Either pre or post text must not be empty");
            throw null;
        }
        if (str.length() == 0 && str2.length() > 0) {
            l96Var = l96.x;
        } else if (str.length() > 0 && str2.length() == 0) {
            l96Var = l96.y;
        } else {
            l96Var = l96.z;
        }
        this.h = l96Var;
    }

    public final i96 a() {
        l96 l96Var = this.h;
        l96 l96Var2 = l96.y;
        i96 i96Var = i96.A;
        if (l96Var != l96Var2) {
            return i96Var;
        }
        long j = this.e;
        if (!nd6.d(j)) {
            return i96Var;
        }
        long j2 = this.d;
        if (nd6.d(j2)) {
            if (((int) (j2 >> 32)) > ((int) (j >> 32))) {
                return i96.x;
            }
            return i96.y;
        }
        int i2 = (int) (j2 >> 32);
        if (i2 == ((int) (j >> 32)) && i2 == this.a) {
            return i96.z;
        }
        return i96Var;
    }
}
