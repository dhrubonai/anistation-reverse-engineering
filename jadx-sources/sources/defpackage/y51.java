package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class y51 extends yl4 {
    public Object A;
    public int B;
    public final List y;
    public final l11 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(Object obj, List list, Object obj2, l11 l11Var) {
        super(obj);
        obj.getClass();
        list.getClass();
        obj2.getClass();
        this.y = list;
        this.z = l11Var;
        this.A = obj2;
    }

    @Override // defpackage.yl4
    public final Object a(Object obj, xz0 xz0Var) {
        this.B = 0;
        obj.getClass();
        this.A = obj;
        return c(xz0Var);
    }

    @Override // defpackage.yl4
    public final Object b() {
        return this.A;
    }

    @Override // defpackage.yl4
    public final Object c(vz0 vz0Var) {
        int i = this.B;
        if (i < 0) {
            return this.A;
        }
        if (i >= this.y.size()) {
            this.B = -1;
            return this.A;
        }
        return e(vz0Var);
    }

    @Override // defpackage.yl4
    public final Object d(vz0 vz0Var, Object obj) {
        obj.getClass();
        this.A = obj;
        return c(vz0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.vz0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.x51
            if (r0 == 0) goto L13
            r0 = r6
            x51 r0 = (defpackage.x51) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            x51 r0 = new x51
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.x
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L29
            if (r1 != r2) goto L22
            goto L29
        L22:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            r5 = 0
            return r5
        L29:
            defpackage.m37.N(r6)
        L2c:
            int r6 = r5.B
            r1 = -1
            if (r6 != r1) goto L32
            goto L3c
        L32:
            java.util.List r3 = r5.y
            int r4 = r3.size()
            if (r6 < r4) goto L3f
            r5.B = r1
        L3c:
            java.lang.Object r5 = r5.A
            return r5
        L3f:
            java.lang.Object r1 = r3.get(r6)
            jc2 r1 = (defpackage.jc2) r1
            int r6 = r6 + 1
            r5.B = r6
            java.lang.Object r6 = r5.A
            r0.z = r2
            java.lang.Object r6 = r1.invoke(r5, r6, r0)
            w11 r1 = defpackage.w11.x
            if (r6 != r1) goto L2c
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y51.e(vz0):java.lang.Object");
    }

    @Override // defpackage.v11
    public final l11 getCoroutineContext() {
        return this.z;
    }
}
