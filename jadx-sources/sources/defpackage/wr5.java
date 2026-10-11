package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class wr5 extends x45 implements ic2 {
    public int A;
    public int B;
    public byte C;
    public /* synthetic */ Object D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Iterator G;
    public Object y;
    public Iterator z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr5(int i, int i2, Iterator it, vz0 vz0Var) {
        super(2, vz0Var);
        this.E = i;
        this.F = i2;
        this.G = it;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        wr5 wr5Var = new wr5(this.E, this.F, this.G, vz0Var);
        wr5Var.D = obj;
        return wr5Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((wr5) create((ri5) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b0  */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
