package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class lk2 extends x45 implements ic2 {
    public int A;
    public int B;
    public boolean C;
    public /* synthetic */ Object D;
    public final /* synthetic */ mk2 E;
    public Iterator y;
    public int[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk2(mk2 mk2Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.E = mk2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        lk2 lk2Var = new lk2(this.E, vz0Var);
        lk2Var.D = obj;
        return lk2Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((lk2) create((ri5) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0032 -> B:6:0x003b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0043 -> B:5:0x005c). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.D
            ri5 r0 = (defpackage.ri5) r0
            boolean r1 = r9.C
            mk2 r2 = r9.E
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 != r4) goto L1b
            int r1 = r9.B
            int r5 = r9.A
            int[] r6 = r9.z
            java.util.Iterator r7 = r9.y
            defpackage.m37.N(r10)
            r10 = r7
            goto L5c
        L1b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r9)
            r9 = 0
            return r9
        L22:
            defpackage.m37.N(r10)
            java.util.ArrayList r10 = r2.a
            java.util.Iterator r10 = r10.iterator()
            r1 = r3
        L2c:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L63
            java.lang.Object r5 = r10.next()
            int[] r5 = (int[]) r5
            r6 = r5
            r5 = r1
            r1 = r3
        L3b:
            int r7 = r6.length
            if (r1 >= r7) goto L61
            int r7 = r2.a(r5)
            r8 = -1
            if (r7 == r8) goto L5c
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r5)
            r9.D = r0
            r9.y = r10
            r9.z = r6
            r9.A = r5
            r9.B = r1
            r9.C = r4
            r0.d(r9, r2)
            w11 r9 = defpackage.w11.x
            return r9
        L5c:
            int r1 = r1 + 6
            int r5 = r5 + 6
            goto L3b
        L61:
            r1 = r5
            goto L2c
        L63:
            pn6 r9 = defpackage.pn6.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
