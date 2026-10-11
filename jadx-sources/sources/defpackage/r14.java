package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r14 implements vg6 {
    public final long a;
    public final s14[] b;
    public final int c;

    public r14(long j, s14[] s14VarArr, int i) {
        this.a = j;
        this.b = s14VarArr;
        this.c = i;
    }

    @Override // defpackage.hf5
    public final boolean b() {
        return true;
    }

    @Override // defpackage.vg6
    public final gf5 d(int i, long j) {
        int i2;
        long j2;
        long j3;
        long j4;
        int b;
        long j5 = j;
        s14[] s14VarArr = this.b;
        int length = s14VarArr.length;
        jf5 jf5Var = jf5.c;
        if (length == 0) {
            return new gf5(jf5Var, jf5Var);
        }
        int i3 = this.c;
        if (i != -1) {
            i2 = i;
        } else {
            i2 = i3;
        }
        long j6 = -1;
        if (i2 != -1) {
            ch6 ch6Var = s14VarArr[i2].b;
            int a = ch6Var.a(j5);
            if (a == -1) {
                a = ch6Var.b(j5);
            }
            long[] jArr = ch6Var.c;
            long[] jArr2 = ch6Var.f;
            if (a == -1) {
                return new gf5(jf5Var, jf5Var);
            }
            long j7 = jArr2[a];
            j2 = jArr[a];
            if (j7 < j5 && a < ch6Var.b - 1 && (b = ch6Var.b(j5)) != -1 && b != a) {
                j3 = jArr2[b];
                j6 = jArr[b];
            } else {
                j3 = -9223372036854775807L;
            }
            j5 = j7;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        if (i == -1) {
            j4 = j2;
            for (int i4 = 0; i4 < s14VarArr.length; i4++) {
                if (i4 != i3) {
                    ch6 ch6Var2 = s14VarArr[i4].b;
                    long[] jArr3 = ch6Var2.c;
                    int a2 = ch6Var2.a(j5);
                    if (a2 == -1) {
                        a2 = ch6Var2.b(j5);
                    }
                    if (a2 != -1) {
                        j4 = Math.min(jArr3[a2], j4);
                    }
                    if (j3 != -9223372036854775807L) {
                        int a3 = ch6Var2.a(j3);
                        if (a3 == -1) {
                            a3 = ch6Var2.b(j3);
                        }
                        if (a3 != -1) {
                            j6 = Math.min(jArr3[a3], j6);
                        }
                    }
                }
            }
        } else {
            j4 = j2;
        }
        jf5 jf5Var2 = new jf5(j5, j4);
        if (j3 == -9223372036854775807L) {
            return new gf5(jf5Var2, jf5Var2);
        }
        return new gf5(jf5Var2, new jf5(j3, j6));
    }

    @Override // defpackage.hf5
    public final gf5 f(long j) {
        return d(-1, j);
    }

    @Override // defpackage.hf5
    public final long h() {
        return this.a;
    }
}
