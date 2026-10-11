package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ft implements px5 {
    public final ti4 A;
    public boolean B = true;
    public final List x;
    public final il6 y;
    public final ub2 z;

    public ft(List list, Object obj, il6 il6Var, st3 st3Var, ub2 ub2Var, oa7 oa7Var) {
        this.x = list;
        this.y = il6Var;
        this.z = ub2Var;
        this.A = xt5.g(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0095 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0032, B:16:0x0095, B:24:0x0047, B:26:0x004c, B:28:0x0072, B:34:0x008b), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0095 -> B:14:0x009e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.xz0 r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.et
            if (r0 == 0) goto L13
            r0 = r13
            et r0 = (defpackage.et) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            et r0 = new et
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.B
            int r1 = r0.D
            pn6 r2 = defpackage.pn6.a
            ub2 r3 = r12.z
            ti4 r4 = r12.A
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L88
            r7 = 0
            r8 = 2
            if (r1 == r5) goto L3f
            if (r1 != r8) goto L39
            int r1 = r0.A
            int r7 = r0.z
            java.util.List r8 = r0.x
            defpackage.m37.N(r13)     // Catch: java.lang.Throwable -> L36
            goto L9e
        L36:
            r13 = move-exception
            goto Lb4
        L39:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r12)
            return r7
        L3f:
            int r1 = r0.A
            int r9 = r0.z
            e45 r10 = r0.y
            java.util.List r11 = r0.x
            defpackage.m37.N(r13)     // Catch: java.lang.Throwable -> L36
            if (r13 == 0) goto L72
            il6 r1 = r12.y     // Catch: java.lang.Throwable -> L36
            int r5 = r1.d     // Catch: java.lang.Throwable -> L36
            s92 r7 = r1.b     // Catch: java.lang.Throwable -> L36
            int r1 = r1.c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r13 = defpackage.m37.L(r5, r13, r10, r7, r1)     // Catch: java.lang.Throwable -> L36
            r4.setValue(r13)     // Catch: java.lang.Throwable -> L36
            l11 r13 = r0.getContext()
            boolean r13 = defpackage.h98.B(r13)
            r12.B = r6
            kl6 r12 = new kl6
            java.lang.Object r0 = r4.getValue()
            r12.<init>(r0, r13)
        L6e:
            r3.invoke(r12)
            return r2
        L72:
            r0.x = r11     // Catch: java.lang.Throwable -> L36
            r0.y = r7     // Catch: java.lang.Throwable -> L36
            r0.z = r9     // Catch: java.lang.Throwable -> L36
            r0.A = r1     // Catch: java.lang.Throwable -> L36
            r0.D = r8     // Catch: java.lang.Throwable -> L36
            java.lang.Object r13 = defpackage.fz5.o(r0)     // Catch: java.lang.Throwable -> L36
            w11 r7 = defpackage.w11.x
            if (r13 != r7) goto L85
            return r7
        L85:
            r7 = r9
            r8 = r11
            goto L9e
        L88:
            defpackage.m37.N(r13)
            java.util.List r13 = r12.x     // Catch: java.lang.Throwable -> L36
            int r1 = r13.size()     // Catch: java.lang.Throwable -> L36
            r8 = r13
            r7 = r6
        L93:
            if (r7 >= r1) goto La0
            java.lang.Object r13 = r8.get(r7)     // Catch: java.lang.Throwable -> L36
            e45 r13 = (defpackage.e45) r13     // Catch: java.lang.Throwable -> L36
            r13.getClass()     // Catch: java.lang.Throwable -> L36
        L9e:
            int r7 = r7 + r5
            goto L93
        La0:
            l11 r13 = r0.getContext()
            boolean r13 = defpackage.h98.B(r13)
            r12.B = r6
            kl6 r12 = new kl6
            java.lang.Object r0 = r4.getValue()
            r12.<init>(r0, r13)
            goto L6e
        Lb4:
            l11 r0 = r0.getContext()
            boolean r0 = defpackage.h98.B(r0)
            r12.B = r6
            kl6 r12 = new kl6
            java.lang.Object r1 = r4.getValue()
            r12.<init>(r1, r0)
            r3.invoke(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft.b(xz0):java.lang.Object");
    }

    @Override // defpackage.px5
    public final Object getValue() {
        return this.A.getValue();
    }
}
