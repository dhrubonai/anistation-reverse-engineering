package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class iq1 implements x73 {
    public static final iq1 a = new Object();
    public static final au4 b = new au4("kotlin.time.Duration", xt4.i);

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        boolean z;
        m18 m18Var = fq1.y;
        String s = l61Var.s();
        s.getClass();
        try {
            long J = w65.J(s);
            if (J == fq1.B) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return new fq1(J);
            }
            throw new IllegalStateException("invariant failed");
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(qx1.m("Invalid ISO duration string format: '", s, "'."), e);
        }
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return b;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        long j;
        int i;
        int i2;
        boolean z;
        boolean z2;
        long j2 = ((fq1) obj).x;
        m18 m18Var = fq1.y;
        StringBuilder sb = new StringBuilder();
        if (j2 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        if (j2 < 0) {
            j = fq1.k(j2);
        } else {
            j = j2;
        }
        long i3 = fq1.i(j, jq1.HOURS);
        boolean z3 = false;
        if (fq1.f(j)) {
            i = 0;
        } else {
            i = (int) (fq1.i(j, jq1.MINUTES) % 60);
        }
        if (fq1.f(j)) {
            i2 = 0;
        } else {
            i2 = (int) (fq1.i(j, jq1.SECONDS) % 60);
        }
        int e = fq1.e(j);
        if (fq1.f(j2)) {
            i3 = 9999999999999L;
        }
        if (i3 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == 0 && e == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i != 0 || (z2 && z)) {
            z3 = true;
        }
        if (z) {
            sb.append(i3);
            sb.append('H');
        }
        if (z3) {
            sb.append(i);
            sb.append('M');
        }
        if (z2 || (!z && !z3)) {
            fq1.b(sb, i2, e, 9, "S", true);
        }
        wt1Var.o(sb.toString());
    }
}
