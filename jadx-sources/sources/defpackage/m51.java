package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m51 extends t36 implements ub2 {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x = 1;
    public byte y;
    public final /* synthetic */ p51 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m51(w05 w05Var, p51 p51Var, u05 u05Var, vz0 vz0Var) {
        super(1, vz0Var);
        this.B = w05Var;
        this.z = p51Var;
        this.C = u05Var;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        byte b = this.x;
        Object obj = this.C;
        Object obj2 = this.B;
        p51 p51Var = this.z;
        switch (b) {
            case 0:
                return new m51((w05) obj2, p51Var, (u05) obj, vz0Var);
            default:
                return new m51(p51Var, (l11) obj2, (ic2) obj, vz0Var);
        }
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vz0 vz0Var = (vz0) obj;
        switch (b) {
            case 0:
                return ((m51) create(vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((m51) create(vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m51.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m51(p51 p51Var, l11 l11Var, ic2 ic2Var, vz0 vz0Var) {
        super(1, vz0Var);
        this.z = p51Var;
        this.B = l11Var;
        this.C = ic2Var;
    }
}
