package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class x52 extends t36 implements jc2 {
    public /* synthetic */ Object A;
    public /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x;
    public Object y;
    public byte z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x52(vz0 vz0Var, kc2 kc2Var) {
        super(3, vz0Var);
        this.x = (byte) 1;
        this.C = kc2Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj4 = this.C;
        switch (b) {
            case 0:
                x52 x52Var = new x52((ic2) obj4, (vz0) obj3, (byte) 0);
                x52Var.A = (x42) obj;
                x52Var.B = obj2;
                return x52Var.invokeSuspend(pn6Var);
            case 1:
                x52 x52Var2 = new x52((vz0) obj3, (kc2) obj4);
                x52Var2.A = (x42) obj;
                x52Var2.B = (Object[]) obj2;
                return x52Var2.invokeSuspend(pn6Var);
            case 2:
                x52 x52Var3 = new x52((jc2) obj4, (vz0) obj3, (byte) 2);
                x52Var3.A = (x42) obj;
                x52Var3.B = (Object[]) obj2;
                return x52Var3.invokeSuspend(pn6Var);
            default:
                x52 x52Var4 = new x52((List) obj4, (vz0) obj3, (byte) 3);
                x52Var4.A = (ji5) obj;
                x52Var4.B = (or2) obj2;
                return x52Var4.invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        if (r12 == r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:
    
        if (r12 == r5) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0122, code lost:
    
        if (r12 == r5) goto L59;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x52.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x52(Object obj, vz0 vz0Var, byte b) {
        super(3, vz0Var);
        this.x = b;
        this.C = obj;
    }
}
