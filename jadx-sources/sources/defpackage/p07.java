package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p07 extends x45 implements ic2 {
    public int A;
    public byte B;
    public /* synthetic */ Object C;
    public final /* synthetic */ e9 D;
    public uq4 y;
    public op4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p07(e9 e9Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.D = e9Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        p07 p07Var = new p07(this.D, vz0Var);
        p07Var.C = obj;
        return p07Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((p07) create((z36) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e3, code lost:
    
        if ((r5 + r11) <= 0.0f) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f3, code lost:
    
        r2 = r6.c(-r11);
        r6.d();
        r6.j.a(r2, 0.0f);
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:
    
        if ((r5 + r11) >= 0.0f) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x004f, code lost:
    
        if (r10 == r8) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0051, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0039, code lost:
    
        if (r2 == r8) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x004f -> B:6:0x0052). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p07.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
