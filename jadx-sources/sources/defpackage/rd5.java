package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rd5 {
    public kd5 a;
    public fc b;
    public i42 c;
    public rg4 d;
    public boolean e;
    public g84 f;
    public final jd5 g;
    public final id5 h;
    public boolean i;
    public byte j = 1;
    public wc5 k = fd5.a;
    public final pd5 l = new pd5(this);
    public final pz3 m = new pz3((Object) this, (byte) 23);

    public rd5(kd5 kd5Var, fc fcVar, i42 i42Var, rg4 rg4Var, boolean z, g84 g84Var, jd5 jd5Var, id5 id5Var) {
        this.a = kd5Var;
        this.b = fcVar;
        this.c = i42Var;
        this.d = rg4Var;
        this.e = z;
        this.f = g84Var;
        this.g = jd5Var;
        this.h = id5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, v05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r11, defpackage.xz0 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.nd5
            if (r0 == 0) goto L13
            r0 = r13
            nd5 r0 = (defpackage.nd5) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            nd5 r0 = new nd5
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.y
            int r1 = r0.A
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            v05 r11 = r0.x
            defpackage.m37.N(r13)     // Catch: java.lang.Throwable -> L29
            r5 = r10
            goto L58
        L29:
            r0 = move-exception
            r11 = r0
            r5 = r10
            goto L68
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r10)
            r10 = 0
            return r10
        L34:
            defpackage.m37.N(r13)
            v05 r6 = new v05
            r6.<init>()
            r6.x = r11
            r10.i = r3
            c54 r13 = defpackage.c54.x     // Catch: java.lang.Throwable -> L65
            od5 r4 = new od5     // Catch: java.lang.Throwable -> L65
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L62
            r0.x = r6     // Catch: java.lang.Throwable -> L62
            r0.A = r3     // Catch: java.lang.Throwable -> L62
            java.lang.Object r10 = r5.g(r13, r4, r0)     // Catch: java.lang.Throwable -> L62
            w11 r11 = defpackage.w11.x
            if (r10 != r11) goto L57
            return r11
        L57:
            r11 = r6
        L58:
            r5.i = r2
            long r10 = r11.x
            ur6 r12 = new ur6
            r12.<init>(r10)
            return r12
        L62:
            r0 = move-exception
        L63:
            r11 = r0
            goto L68
        L65:
            r0 = move-exception
            r5 = r10
            goto L63
        L68:
            r5.i = r2
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd5.a(long, xz0):java.lang.Object");
    }

    public final boolean b() {
        fc fcVar;
        if (this.a.c() || this.a.b() || ((fcVar = this.b) != null && fcVar.e())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if ((r7 instanceof defpackage.s81) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r5, boolean r7, defpackage.t36 r8) {
        /*
            r4 = this;
            pn6 r0 = defpackage.pn6.a
            if (r7 == 0) goto Ld
            i42 r7 = r4.c
            cd5 r1 = defpackage.fd5.a
            boolean r7 = r7 instanceof defpackage.s81
            if (r7 == 0) goto Ld
            goto L43
        Ld:
            rg4 r7 = r4.d
            rg4 r1 = defpackage.rg4.y
            r2 = 0
            if (r7 != r1) goto L1a
            r7 = 1
        L15:
            long r5 = defpackage.ur6.a(r5, r2, r2, r7)
            goto L1c
        L1a:
            r7 = 2
            goto L15
        L1c:
            qd5 r7 = new qd5
            r1 = 0
            r7.<init>(r4, r1)
            fc r1 = r4.b
            w11 r2 = defpackage.w11.x
            if (r1 == 0) goto L35
            boolean r3 = r4.b()
            if (r3 == 0) goto L35
            java.lang.Object r4 = r1.b(r5, r7, r8)
            if (r4 != r2) goto L43
            return r4
        L35:
            qd5 r7 = new qd5
            r7.<init>(r4, r8)
            r7.z = r5
            java.lang.Object r4 = r7.invokeSuspend(r0)
            if (r4 != r2) goto L43
            return r4
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd5.c(long, boolean, t36):java.lang.Object");
    }

    public final long d(wc5 wc5Var, long j, int i) {
        k84 k84Var;
        long j2;
        long a;
        k84 k84Var2 = this.f.a;
        k84 k84Var3 = null;
        if (k84Var2 != null) {
            k84Var = k84Var2.b1();
        } else {
            k84Var = null;
        }
        long j3 = 0;
        if (k84Var != null) {
            j2 = k84Var.O(i, j);
        } else {
            j2 = 0;
        }
        long e = xc4.e(j, j2);
        if (this.d == rg4.y) {
            a = xc4.a(e, 0.0f, 1);
        } else {
            a = xc4.a(e, 0.0f, 2);
        }
        long f = f(i(wc5Var.a(h(f(a)))));
        jd5 jd5Var = this.g;
        if (jd5Var.K) {
            ViewTreeObserver viewTreeObserver = ((oa) wc7.P(jd5Var)).getViewTreeObserver();
            try {
                Method method = oa.k1;
                if (method == null) {
                    method = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    method.setAccessible(true);
                    oa.k1 = method;
                }
                method.invoke(viewTreeObserver, null);
            } catch (Exception unused) {
            }
        }
        long e2 = xc4.e(e, f);
        k84 k84Var4 = this.f.a;
        if (k84Var4 != null) {
            k84Var3 = k84Var4.b1();
        }
        k84 k84Var5 = k84Var3;
        if (k84Var5 != null) {
            j3 = k84Var5.z(f, i, e2);
        }
        return xc4.f(xc4.f(j2, f), j3);
    }

    public final float e(float f) {
        if (this.e) {
            return f * (-1.0f);
        }
        return f;
    }

    public final long f(long j) {
        if (this.e) {
            return xc4.g(-1.0f, j);
        }
        return j;
    }

    public final Object g(c54 c54Var, ic2 ic2Var, xz0 xz0Var) {
        Object d = this.a.d(c54Var, new e05((Object) this, (Object) ic2Var, (vz0) null, (byte) 4), xz0Var);
        if (d == w11.x) {
            return d;
        }
        return pn6.a;
    }

    public final float h(long j) {
        long j2;
        if (this.d == rg4.y) {
            j2 = j >> 32;
        } else {
            j2 = j & 4294967295L;
        }
        return Float.intBitsToFloat((int) j2);
    }

    public final long i(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == rg4.y) {
            return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
        }
        return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float j(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double atan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        rg4 rg4Var = this.d;
        if (atan2 >= 0.7853981633974483d) {
            if (rg4Var != rg4.x) {
                return 0.0f;
            }
            return Float.intBitsToFloat(i);
        }
        if (rg4Var != rg4.y) {
            return 0.0f;
        }
        return Float.intBitsToFloat(i2);
    }
}
