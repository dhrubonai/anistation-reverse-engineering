package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class jw4 {
    public final kf3 a;

    public jw4(sb2 sb2Var) {
        this.a = new kf3(sb2Var);
    }

    public mw4 a(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = false;
        }
        return new mw4(this, obj, z, null, null, true);
    }

    public wq6 b() {
        return this.a;
    }

    public final mw4 c(ub2 ub2Var) {
        return new mw4(this, null, false, null, ub2Var, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0032, code lost:
    
        if (r2 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0034, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0040, code lost:
    
        if (r2 == r1) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.wq6 d(defpackage.mw4 r3, defpackage.wq6 r4) {
        /*
            r2 = this;
            boolean r2 = r4 instanceof defpackage.uq1
            r0 = 0
            if (r2 == 0) goto L16
            boolean r2 = r3.e
            if (r2 == 0) goto L43
            r0 = r4
            uq1 r0 = (defpackage.uq1) r0
            ti4 r2 = r0.a
            java.lang.Object r4 = r3.a()
            r2.setValue(r4)
            goto L43
        L16:
            boolean r2 = r4 instanceof defpackage.hy5
            if (r2 == 0) goto L36
            boolean r2 = r3.b
            if (r2 != 0) goto L22
            java.lang.Object r2 = r3.f
            if (r2 == 0) goto L43
        L22:
            boolean r2 = r3.e
            if (r2 != 0) goto L43
            java.lang.Object r2 = r3.a()
            hy5 r4 = (defpackage.hy5) r4
            java.lang.Object r1 = r4.a
            boolean r2 = defpackage.a34.i(r2, r1)
            if (r2 == 0) goto L43
        L34:
            r0 = r4
            goto L43
        L36:
            boolean r2 = r4 instanceof defpackage.ev0
            if (r2 == 0) goto L43
            ub2 r2 = r3.d
            ev0 r4 = (defpackage.ev0) r4
            ub2 r1 = r4.a
            if (r2 != r1) goto L43
            goto L34
        L43:
            if (r0 != 0) goto L70
            boolean r2 = r3.e
            if (r2 == 0) goto L5c
            uq1 r2 = new uq1
            java.lang.Object r4 = r3.f
            tt5 r3 = r3.c
            if (r3 != 0) goto L53
            p7 r3 = defpackage.p7.S
        L53:
            ti4 r0 = new ti4
            r0.<init>(r4, r3)
            r2.<init>(r0)
            return r2
        L5c:
            ub2 r2 = r3.d
            if (r2 == 0) goto L66
            ev0 r3 = new ev0
            r3.<init>(r2)
            return r3
        L66:
            hy5 r2 = new hy5
            java.lang.Object r3 = r3.a()
            r2.<init>(r3)
            return r2
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw4.d(mw4, wq6):wq6");
    }
}
