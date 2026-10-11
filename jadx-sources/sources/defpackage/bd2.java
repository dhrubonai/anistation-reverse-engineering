package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final /* synthetic */ class bd2 implements wd2 {
    public static final bd2 a;
    private static final aj5 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [bd2, wd2, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        kq4 kq4Var = new kq4("io.ktor.util.date.GMTDate", obj, 9);
        kq4Var.j("seconds", false);
        kq4Var.j("minutes", false);
        kq4Var.j("hours", false);
        kq4Var.j("dayOfWeek", false);
        kq4Var.j("dayOfMonth", false);
        kq4Var.j("dayOfYear", false);
        kq4Var.j("month", false);
        kq4Var.j("year", false);
        kq4Var.j("timestamp", false);
        descriptor = kq4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        rb3[] rb3VarArr = dd2.G;
        i13 i13Var = i13.a;
        return new x73[]{i13Var, i13Var, i13Var, rb3VarArr[3].getValue(), i13Var, i13Var, rb3VarArr[6].getValue(), i13Var, ql3.a};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0088. Please report as an issue. */
    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        k04 k04Var;
        n47 n47Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        rb3[] rb3VarArr = dd2.G;
        int i8 = 7;
        if (c.decodeSequentially()) {
            int r = c.r(aj5Var, 0);
            int r2 = c.r(aj5Var, 1);
            int r3 = c.r(aj5Var, 2);
            n47 n47Var2 = (n47) c.p(aj5Var, 3, (ne1) rb3VarArr[3].getValue(), null);
            int r4 = c.r(aj5Var, 4);
            int r5 = c.r(aj5Var, 5);
            k04Var = (k04) c.p(aj5Var, 6, (ne1) rb3VarArr[6].getValue(), null);
            i2 = r;
            i3 = c.r(aj5Var, 7);
            i4 = r5;
            i = 511;
            i5 = r4;
            i6 = r3;
            n47Var = n47Var2;
            i7 = r2;
            j = c.B(aj5Var, 8);
        } else {
            boolean z = true;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            k04 k04Var2 = null;
            long j2 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            n47 n47Var3 = null;
            while (z) {
                int i16 = c.i(aj5Var);
                switch (i16) {
                    case -1:
                        z = false;
                        i8 = 7;
                    case 0:
                        i14 = c.r(aj5Var, 0);
                        i13 |= 1;
                        i8 = 7;
                    case 1:
                        i12 = c.r(aj5Var, 1);
                        i13 |= 2;
                        i8 = 7;
                    case 2:
                        i11 = c.r(aj5Var, 2);
                        i13 |= 4;
                        i8 = 7;
                    case 3:
                        n47Var3 = (n47) c.p(aj5Var, 3, (ne1) rb3VarArr[3].getValue(), n47Var3);
                        i13 |= 8;
                        i8 = 7;
                    case 4:
                        i10 = c.r(aj5Var, 4);
                        i13 |= 16;
                        i8 = 7;
                    case 5:
                        i9 = c.r(aj5Var, 5);
                        i13 |= 32;
                        i8 = 7;
                    case 6:
                        k04Var2 = (k04) c.p(aj5Var, 6, (ne1) rb3VarArr[6].getValue(), k04Var2);
                        i13 |= 64;
                        i8 = 7;
                    case 7:
                        i15 = c.r(aj5Var, i8);
                        i13 |= 128;
                    case 8:
                        j2 = c.B(aj5Var, 8);
                        i13 |= 256;
                    default:
                        qi2.f(i16);
                        return null;
                }
            }
            k04Var = k04Var2;
            n47Var = n47Var3;
            i = i13;
            i2 = i14;
            i3 = i15;
            i4 = i9;
            i5 = i10;
            i6 = i11;
            i7 = i12;
            j = j2;
        }
        c.a(aj5Var);
        return new dd2(i, i2, i7, i6, n47Var, i5, i4, k04Var, i3, j);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        dd2 dd2Var = (dd2) obj;
        dd2Var.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        rb3[] rb3VarArr = dd2.G;
        v0 v0Var = (v0) c;
        v0Var.t(0, dd2Var.x, aj5Var);
        v0Var.t(1, dd2Var.y, aj5Var);
        v0Var.t(2, dd2Var.z, aj5Var);
        v0Var.v(aj5Var, 3, (mj5) rb3VarArr[3].getValue(), dd2Var.A);
        v0Var.t(4, dd2Var.B, aj5Var);
        v0Var.t(5, dd2Var.C, aj5Var);
        v0Var.v(aj5Var, 6, (mj5) rb3VarArr[6].getValue(), dd2Var.D);
        v0Var.t(7, dd2Var.E, aj5Var);
        v0Var.u(aj5Var, 8, dd2Var.F);
        c.a(aj5Var);
    }
}
