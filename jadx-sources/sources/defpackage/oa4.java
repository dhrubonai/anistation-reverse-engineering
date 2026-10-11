package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class oa4 {
    public final rd5 a;
    public final ic2 b;
    public ud1 c;
    public boolean d;
    public final rt3 e = new rt3((byte) 18);

    public oa4(rd5 rd5Var, ic2 ic2Var, ud1 ud1Var) {
        this.a = rd5Var;
        this.b = ic2Var;
        this.c = ud1Var;
    }

    public static void a(nq4 nq4Var) {
        List list = nq4Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((uq4) list.get(i)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ic2 r5, defpackage.xz0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.na4
            if (r0 == 0) goto L13
            r0 = r6
            na4 r0 = (defpackage.na4) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            na4 r0 = new na4
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.x
            int r1 = r0.z
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.m37.N(r6)
            goto L4c
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r2
        L2c:
            defpackage.m37.N(r6)
            r4.d = r3
            e52 r6 = new e52
            r1 = 11
            r6.<init>(r4, r5, r2, r1)
            r0.z = r3
            p26 r5 = new p26
            l11 r1 = r0.getContext()
            r5.<init>(r0, r1)
            java.lang.Object r5 = defpackage.lz5.e(r5, r3, r5, r6)
            w11 r6 = defpackage.w11.x
            if (r5 != r6) goto L4c
            return r6
        L4c:
            r5 = 0
            r4.d = r5
            pn6 r4 = defpackage.pn6.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa4.b(ic2, xz0):java.lang.Object");
    }
}
