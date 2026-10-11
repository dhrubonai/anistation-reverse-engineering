package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f14 extends t36 implements ic2 {
    public byte A;
    public /* synthetic */ Object B;
    public final /* synthetic */ t05 C;
    public final /* synthetic */ w05 D;
    public final /* synthetic */ w05 E;
    public final /* synthetic */ float F;
    public final /* synthetic */ h14 G;
    public final /* synthetic */ float H;
    public final /* synthetic */ rd5 I;
    public r05 x;
    public r05 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f14(t05 t05Var, w05 w05Var, w05 w05Var2, float f, h14 h14Var, float f2, rd5 rd5Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.C = t05Var;
        this.D = w05Var;
        this.E = w05Var2;
        this.F = f;
        this.G = h14Var;
        this.H = f2;
        this.I = rd5Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        f14 f14Var = new f14(this.C, this.D, this.E, this.F, this.G, this.H, this.I, vz0Var);
        f14Var.B = obj;
        return f14Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((f14) create((pd5) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cb A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v6, types: [t05, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [r05, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0189 -> B:7:0x018a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x019c -> B:9:0x0197). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f14.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
