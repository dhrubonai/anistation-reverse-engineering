package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yn extends t36 implements ic2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ Integer B;
    public final /* synthetic */ int C;
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public final /* synthetic */ boolean F;
    public byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ zn z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn(vz0 vz0Var, zn znVar, String str, Integer num, int i, String str2, String str3, boolean z) {
        super(2, vz0Var);
        this.z = znVar;
        this.A = str;
        this.B = num;
        this.C = i;
        this.D = str2;
        this.E = str3;
        this.F = z;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        yn ynVar = new yn(vz0Var, this.z, this.A, this.B, this.C, this.D, this.E, this.F);
        ynVar.y = obj;
        return ynVar;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((yn) create((x42) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b8, code lost:
    
        if (r8.emit(r2, r16) == r15) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0050, code lost:
    
        if (r8.emit(r0, r16) == r15) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015a, code lost:
    
        if (r8.emit(r0, r16) != r15) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00df, code lost:
    
        if (r8.emit(r0, r16) != r15) goto L76;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0014. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b A[Catch: Exception -> 0x0033, u45 -> 0x0036, TryCatch #4 {u45 -> 0x0036, Exception -> 0x0033, blocks: (B:30:0x002e, B:31:0x0039, B:33:0x0071, B:35:0x007b, B:38:0x0091, B:40:0x0097, B:43:0x00a3, B:46:0x00a8, B:48:0x009f, B:50:0x0054), top: B:2:0x0014, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091 A[Catch: Exception -> 0x0033, u45 -> 0x0036, TryCatch #4 {u45 -> 0x0036, Exception -> 0x0033, blocks: (B:30:0x002e, B:31:0x0039, B:33:0x0071, B:35:0x007b, B:38:0x0091, B:40:0x0097, B:43:0x00a3, B:46:0x00a8, B:48:0x009f, B:50:0x0054), top: B:2:0x0014, outer: #2 }] */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
