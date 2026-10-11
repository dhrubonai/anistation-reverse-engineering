package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e9 {
    public final ti4 c;
    public final ti4 d;
    public final pi4 g;
    public final ti4 h;
    public final ti4 i;
    public final a9 j;
    public final b3 a = new b3(6);
    public final i54 b = new i54();
    public final he1 e = ut5.b(new t8(this, 0));
    public final pi4 f = new pi4(Float.NaN);

    public e9(Object obj) {
        this.c = xt5.g(obj);
        this.d = xt5.g(obj);
        new AtomicInteger(0);
        mt5.h().g();
        dc4.a.getClass();
        this.g = new pi4(0.0f);
        this.h = xt5.g(null);
        this.i = xt5.g(new y71(nt1.x, new float[0]));
        this.j = new a9(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r11, defpackage.c54 r12, defpackage.kc2 r13, defpackage.xz0 r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.x8
            if (r0 == 0) goto L13
            r0 = r14
            x8 r0 = (defpackage.x8) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            x8 r0 = new x8
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.x
            int r1 = r0.z
            ti4 r2 = r10.h
            r3 = 1
            r8 = 0
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2b
            defpackage.m37.N(r14)     // Catch: java.lang.Throwable -> L28
            goto L64
        L28:
            r0 = move-exception
            r10 = r0
            goto L68
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r10)
            r10 = 0
            return r10
        L32:
            defpackage.m37.N(r14)
            y71 r14 = r10.b()
            java.util.List r14 = r14.a
            int r14 = r14.indexOf(r11)
            r1 = -1
            if (r14 == r1) goto L6c
            i54 r14 = r10.b     // Catch: java.lang.Throwable -> L28
            y8 r4 = new y8     // Catch: java.lang.Throwable -> L28
            r9 = 1
            r5 = r10
            r6 = r11
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L28
            r0.z = r3     // Catch: java.lang.Throwable -> L28
            r14.getClass()     // Catch: java.lang.Throwable -> L28
            r7 = r4
            d23 r4 = new d23     // Catch: java.lang.Throwable -> L28
            r9 = 1
            r5 = r12
            r6 = r14
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r10 = defpackage.db.K(r4, r0)     // Catch: java.lang.Throwable -> L28
            w11 r11 = defpackage.w11.x
            if (r10 != r11) goto L64
            return r11
        L64:
            r2.setValue(r8)
            goto L78
        L68:
            r2.setValue(r8)
            throw r10
        L6c:
            r5 = r10
            r6 = r11
            ti4 r10 = r5.d
            r10.setValue(r6)
            ti4 r10 = r5.c
            r10.setValue(r6)
        L78:
            pn6 r10 = defpackage.pn6.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9.a(java.lang.Object, c54, kc2, xz0):java.lang.Object");
    }

    public final y71 b() {
        return (y71) this.i.getValue();
    }

    public final float c(float f) {
        float h;
        float f2;
        pi4 pi4Var = this.f;
        if (Float.isNaN(pi4Var.h())) {
            h = 0.0f;
        } else {
            h = pi4Var.h();
        }
        float f3 = h + f;
        float[] fArr = b().b;
        float f4 = Float.NaN;
        int i = 1;
        if (fArr.length == 0) {
            f2 = Float.NaN;
        } else {
            f2 = fArr[0];
            int length = fArr.length - 1;
            if (1 <= length) {
                int i2 = 1;
                while (true) {
                    f2 = Math.min(f2, fArr[i2]);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        float[] fArr2 = b().b;
        if (fArr2.length != 0) {
            f4 = fArr2[0];
            int length2 = fArr2.length - 1;
            if (1 <= length2) {
                while (true) {
                    f4 = Math.max(f4, fArr2[i]);
                    if (i == length2) {
                        break;
                    }
                    i++;
                }
            }
        }
        return db.B(f3, f2, f4);
    }

    public final float d() {
        pi4 pi4Var = this.f;
        if (Float.isNaN(pi4Var.h())) {
            hz2.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return pi4Var.h();
    }
}
