package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class pe6 {
    public static final /* synthetic */ long b = qs.a.objectFieldOffset(pe6.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public pw1[] a;

    public final void a(pw1 pw1Var) {
        pw1Var.b((qw1) this);
        pw1[] pw1VarArr = this.a;
        if (pw1VarArr == null) {
            pw1VarArr = new pw1[4];
            this.a = pw1VarArr;
        } else if (b() >= pw1VarArr.length) {
            pw1VarArr = (pw1[]) Arrays.copyOf(pw1VarArr, b() * 2);
            this.a = pw1VarArr;
        }
        int b2 = b();
        qs.a.putIntVolatile(this, b, b2 + 1);
        pw1VarArr[b2] = pw1Var;
        pw1Var.y = b2;
        d(b2);
    }

    public final int b() {
        return qs.a.getIntVolatile(this, b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        if (r5.compareTo(r6) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pw1 c(int r8) {
        /*
            r7 = this;
            pw1[] r0 = r7.a
            r0.getClass()
            int r1 = r7.b()
            r2 = -1
            int r1 = r1 + r2
            sun.misc.Unsafe r3 = defpackage.qs.a
            long r4 = defpackage.pe6.b
            r3.putIntVolatile(r7, r4, r1)
            int r1 = r7.b()
            if (r8 >= r1) goto L7c
            int r1 = r7.b()
            r7.e(r8, r1)
            int r1 = r8 + (-1)
            int r1 = r1 / 2
            if (r8 <= 0) goto L3c
            r3 = r0[r8]
            r3.getClass()
            r4 = r0[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3c
            r7.e(r8, r1)
            r7.d(r1)
            goto L7c
        L3c:
            int r1 = r8 * 2
            int r3 = r1 + 1
            int r4 = r7.b()
            if (r3 < r4) goto L47
            goto L7c
        L47:
            pw1[] r4 = r7.a
            r4.getClass()
            int r1 = r1 + 2
            int r5 = r7.b()
            if (r1 >= r5) goto L65
            r5 = r4[r1]
            r5.getClass()
            r6 = r4[r3]
            r6.getClass()
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L65
            goto L66
        L65:
            r1 = r3
        L66:
            r3 = r4[r8]
            r3.getClass()
            r4 = r4[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L77
            goto L7c
        L77:
            r7.e(r8, r1)
            r8 = r1
            goto L3c
        L7c:
            int r8 = r7.b()
            r8 = r0[r8]
            r8.getClass()
            r1 = 0
            r8.b(r1)
            r8.y = r2
            int r7 = r7.b()
            r0[r7] = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pe6.c(int):pw1");
    }

    public final void d(int i) {
        while (i > 0) {
            pw1[] pw1VarArr = this.a;
            pw1VarArr.getClass();
            int i2 = (i - 1) / 2;
            pw1 pw1Var = pw1VarArr[i2];
            pw1Var.getClass();
            pw1 pw1Var2 = pw1VarArr[i];
            pw1Var2.getClass();
            if (pw1Var.compareTo(pw1Var2) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final void e(int i, int i2) {
        pw1[] pw1VarArr = this.a;
        pw1VarArr.getClass();
        pw1 pw1Var = pw1VarArr[i2];
        pw1Var.getClass();
        pw1 pw1Var2 = pw1VarArr[i];
        pw1Var2.getClass();
        pw1VarArr[i] = pw1Var;
        pw1VarArr[i2] = pw1Var2;
        pw1Var.y = i;
        pw1Var2.y = i2;
    }
}
