package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class v01 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ jb6 y;

    public /* synthetic */ v01(jb6 jb6Var, byte b) {
        this.x = b;
        this.y = jb6Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        n05 n05Var;
        uf3 uf3Var;
        ha3 c;
        long j;
        char c2;
        long j2;
        long j3;
        float f;
        ha3 c3;
        float f2;
        ha3 c4;
        float f3;
        ha3 c5;
        ha3 c6;
        byte b = this.x;
        jb6 jb6Var = this.y;
        switch (b) {
            case 0:
                return new i5(jb6Var, (byte) 8);
            case 1:
                jb6Var.s();
                return pn6.a;
            default:
                ha3 ha3Var = (ha3) obj;
                uf3 uf3Var2 = jb6Var.d;
                if (uf3Var2 != null) {
                    if (uf3Var2.p) {
                        uf3Var2 = null;
                    }
                    if (uf3Var2 != null) {
                        h12 h12Var = jb6Var.b;
                        long j4 = jb6Var.l().b;
                        int i = nd6.c;
                        int i2 = (int) (j4 >> 32);
                        h12Var.b(i2);
                        h12 h12Var2 = jb6Var.b;
                        int i3 = (int) (jb6Var.l().b & 4294967295L);
                        h12Var2.b(i3);
                        uf3 uf3Var3 = jb6Var.d;
                        long j5 = 0;
                        if (uf3Var3 != null && (c6 = uf3Var3.c()) != null) {
                            j = c6.J(jb6Var.j(true));
                        } else {
                            j = 0;
                        }
                        uf3 uf3Var4 = jb6Var.d;
                        if (uf3Var4 != null && (c5 = uf3Var4.c()) != null) {
                            j5 = c5.J(jb6Var.j(false));
                        }
                        uf3 uf3Var5 = jb6Var.d;
                        float f4 = 0.0f;
                        if (uf3Var5 != null && (c4 = uf3Var5.c()) != null) {
                            cd6 d = uf3Var2.d();
                            if (d != null) {
                                f3 = d.a.c(i2).b;
                            } else {
                                f3 = 0.0f;
                            }
                            c2 = ' ';
                            j2 = j5;
                            j3 = 4294967295L;
                            f = Float.intBitsToFloat((int) (c4.J((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)) & 4294967295L));
                        } else {
                            c2 = ' ';
                            j2 = j5;
                            j3 = 4294967295L;
                            f = 0.0f;
                        }
                        uf3 uf3Var6 = jb6Var.d;
                        if (uf3Var6 != null && (c3 = uf3Var6.c()) != null) {
                            cd6 d2 = uf3Var2.d();
                            if (d2 != null) {
                                f2 = d2.a.c(i3).b;
                            } else {
                                f2 = 0.0f;
                            }
                            f4 = Float.intBitsToFloat((int) (c3.J((Float.floatToRawIntBits(0.0f) << c2) | (Float.floatToRawIntBits(f2) & j3)) & j3));
                        }
                        int i4 = (int) (j >> c2);
                        int i5 = (int) (j2 >> c2);
                        n05Var = new n05(Math.min(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5)), Math.min(f, f4), Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5)), (((ud1) uf3Var2.a.d).b() * 25.0f) + Math.max(Float.intBitsToFloat((int) (j & j3)), Float.intBitsToFloat((int) (j2 & j3))));
                        uf3Var = jb6Var.d;
                        if (uf3Var == null && (c = uf3Var.c()) != null) {
                            return x97.W(n05Var, c, ha3Var);
                        }
                    }
                }
                n05Var = n05.e;
                uf3Var = jb6Var.d;
                return uf3Var == null ? null : null;
        }
    }
}
