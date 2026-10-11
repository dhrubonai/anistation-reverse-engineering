package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class zy implements hf5 {
    public final /* synthetic */ byte a;
    public final long b;
    public final Object c;

    public zy(long j, long j2) {
        jf5 jf5Var;
        this.a = (byte) 2;
        this.b = j;
        if (j2 == 0) {
            jf5Var = jf5.c;
        } else {
            jf5Var = new jf5(0L, j2);
        }
        this.c = new gf5(jf5Var, jf5Var);
    }

    @Override // defpackage.hf5
    public final boolean b() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.hf5
    public final gf5 f(long j) {
        long j2;
        byte b = this.a;
        int i = 1;
        Object obj = this.c;
        switch (b) {
            case 0:
                az azVar = (az) obj;
                gf5 b2 = azVar.i[0].b(j);
                while (true) {
                    sl0[] sl0VarArr = azVar.i;
                    if (i < sl0VarArr.length) {
                        gf5 b3 = sl0VarArr[i].b(j);
                        if (b3.a.b < b2.a.b) {
                            b2 = b3;
                        }
                        i++;
                    } else {
                        return b2;
                    }
                }
            case 1:
                f42 f42Var = (f42) obj;
                f42Var.k.getClass();
                rt3 rt3Var = f42Var.k;
                long[] jArr = (long[]) rt3Var.y;
                long[] jArr2 = (long[]) rt3Var.z;
                int f = eq6.f(jArr, eq6.k((f42Var.e * j) / 1000000, 0L, f42Var.j - 1), false);
                long j3 = 0;
                if (f == -1) {
                    j2 = 0;
                } else {
                    j2 = jArr[f];
                }
                if (f != -1) {
                    j3 = jArr2[f];
                }
                int i2 = f42Var.e;
                long j4 = (j2 * 1000000) / i2;
                long j5 = this.b;
                jf5 jf5Var = new jf5(j4, j3 + j5);
                if (j4 != j && f != jArr.length - 1) {
                    int i3 = f + 1;
                    return new gf5(jf5Var, new jf5((jArr[i3] * 1000000) / i2, j5 + jArr2[i3]));
                }
                return new gf5(jf5Var, jf5Var);
            default:
                return (gf5) obj;
        }
    }

    @Override // defpackage.hf5
    public final long h() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((f42) this.c).b();
            default:
                return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zy(long j) {
        this(j, 0L);
        this.a = (byte) 2;
    }

    public /* synthetic */ zy(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }
}
