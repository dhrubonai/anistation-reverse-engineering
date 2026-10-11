package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pf0 {
    public final jd4 a;

    public /* synthetic */ pf0(jd4 jd4Var) {
        this.a = jd4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0059, code lost:
    
        if (r11 == r6) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(defpackage.jd4 r8, defpackage.e94 r9, defpackage.ic2 r10, defpackage.xz0 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.of0
            if (r0 == 0) goto L13
            r0 = r11
            of0 r0 = (defpackage.of0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            of0 r0 = new of0
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.z
            int r1 = r0.A
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            w11 r6 = defpackage.w11.x
            if (r1 == 0) goto L4c
            if (r1 == r4) goto L42
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L36
            java.lang.Object r8 = r0.y
            java.io.Closeable r8 = (java.io.Closeable) r8
            defpackage.m37.N(r11)     // Catch: java.lang.Throwable -> L33
            goto Lae
        L33:
            r9 = move-exception
            goto Lb6
        L36:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r5
        L3c:
            ic2 r8 = r0.x
            defpackage.m37.N(r11)
            goto L96
        L42:
            java.lang.Object r8 = r0.y
            jd4 r8 = (defpackage.jd4) r8
            ic2 r10 = r0.x
            defpackage.m37.N(r11)
            goto L5c
        L4c:
            defpackage.m37.N(r11)
            r0.x = r10
            r0.y = r8
            r0.A = r4
            l35 r11 = defpackage.io3.m0(r9, r0)
            if (r11 != r6) goto L5c
            goto Lac
        L5c:
            l35 r11 = (defpackage.l35) r11
            r8.getClass()
            r11.getClass()
            bz4 r9 = new bz4
            r9.<init>(r8, r11)
            r0.x = r10
            r0.y = r5
            r0.A = r3
            qg0 r8 = new qg0
            vz0 r11 = defpackage.wc7.z(r0)
            r8.<init>(r4, r11)
            r8.t()
            cg0 r11 = new cg0
            r1 = 0
            r11.<init>(r9, r1)
            r8.v(r11)
            i75 r11 = new i75
            r1 = 9
            r11.<init>(r8, r1)
            r9.d(r11)
            java.lang.Object r11 = r8.r()
            if (r11 != r6) goto L95
            goto Lac
        L95:
            r8 = r10
        L96:
            r9 = r11
            java.io.Closeable r9 = (java.io.Closeable) r9
            r10 = r9
            p45 r10 = (defpackage.p45) r10     // Catch: java.lang.Throwable -> Lb2
            h94 r10 = defpackage.io3.l0(r10)     // Catch: java.lang.Throwable -> Lb2
            r0.x = r5     // Catch: java.lang.Throwable -> Lb2
            r0.y = r9     // Catch: java.lang.Throwable -> Lb2
            r0.A = r2     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r11 = r8.invoke(r10, r0)     // Catch: java.lang.Throwable -> Lb2
            if (r11 != r6) goto Lad
        Lac:
            return r6
        Lad:
            r8 = r9
        Lae:
            defpackage.a34.C(r8, r5)
            return r11
        Lb2:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        Lb6:
            throw r9     // Catch: java.lang.Throwable -> Lb7
        Lb7:
            r10 = move-exception
            defpackage.a34.C(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf0.a(jd4, e94, ic2, xz0):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pf0) {
            if (!a34.i(this.a, ((pf0) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.a + ")";
    }
}
