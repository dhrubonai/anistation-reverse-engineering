package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rn2 extends vv6 {
    public final pn b;
    public final cy6 c;
    public final LinkedHashMap d = new LinkedHashMap();
    public final sx5 e;

    public rn2(pn pnVar, cy6 cy6Var) {
        this.b = pnVar;
        this.c = cy6Var;
        ot1 ot1Var = ot1.x;
        nt1 nt1Var = nt1.x;
        this.e = tx5.a(new tm6(ot1Var, nt1Var, 0, "All", nt1Var, false));
        f("All", new nn2(this, "All", null));
        tl7.z(zz.J(this), null, null, new hu1(this, null, (byte) 12), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (defpackage.iv.q((defpackage.w42) r7, r1, r0) != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r7 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.xz0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.on2
            if (r0 == 0) goto L13
            r0 = r7
            on2 r0 = (defpackage.on2) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            on2 r0 = new on2
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.x
            int r1 = r0.z
            r2 = 0
            r3 = 2
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.m37.N(r7)
            goto L67
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r2
        L31:
            defpackage.m37.N(r7)
            goto L57
        L35:
            defpackage.m37.N(r7)
            r0.z = r4
            pn r7 = r6.b
            zn r7 = (defpackage.zn) r7
            r7.getClass()
            rn r1 = new rn
            r1.<init>(r2, r7)
            mx0 r7 = new mx0
            r4 = 5
            r7.<init>(r1, r4)
            ja1 r1 = defpackage.rh1.a
            j91 r1 = defpackage.j91.y
            w42 r7 = defpackage.zz.D(r7, r1)
            if (r7 != r5) goto L57
            goto L66
        L57:
            w42 r7 = (defpackage.w42) r7
            pn2 r1 = new pn2
            r1.<init>(r6, r2)
            r0.z = r3
            java.lang.Object r6 = defpackage.iv.q(r7, r1, r0)
            if (r6 != r5) goto L67
        L66:
            return r5
        L67:
            pn6 r6 = defpackage.pn6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rn2.e(xz0):java.lang.Object");
    }

    public final void f(String str, ub2 ub2Var) {
        LinkedHashMap linkedHashMap = this.d;
        h43 h43Var = (h43) linkedHashMap.get(str);
        if (h43Var != null && h43Var.isActive()) {
            return;
        }
        bx5 z = tl7.z(zz.J(this), null, null, new qn2((byte) 0, null, ub2Var), 3);
        linkedHashMap.put(str, z);
        z.l0(new bg((Object) this, (Object) str, (Object) z, (byte) 17));
    }
}
