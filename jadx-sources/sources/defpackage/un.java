package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class un extends t36 implements ic2 {
    public final /* synthetic */ long A;
    public final /* synthetic */ long B;
    public byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ zn z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un(vz0 vz0Var, zn znVar, long j, long j2) {
        super(2, vz0Var);
        this.z = znVar;
        this.A = j;
        this.B = j2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        un unVar = new un(vz0Var, this.z, this.A, this.B);
        unVar.y = obj;
        return unVar;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((un) create((x42) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b0, code lost:
    
        if (r7.emit(r2, r15) == r14) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004e, code lost:
    
        if (r7.emit(r0, r15) == r14) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0150, code lost:
    
        if (r7.emit(r0, r15) != r14) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d6, code lost:
    
        if (r7.emit(r0, r15) != r14) goto L76;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073 A[Catch: Exception -> 0x0031, u45 -> 0x0034, TryCatch #4 {u45 -> 0x0034, Exception -> 0x0031, blocks: (B:30:0x002c, B:31:0x0037, B:33:0x0069, B:35:0x0073, B:38:0x0089, B:40:0x008f, B:43:0x009b, B:46:0x00a0, B:48:0x0097, B:50:0x0052), top: B:2:0x0012, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089 A[Catch: Exception -> 0x0031, u45 -> 0x0034, TryCatch #4 {u45 -> 0x0034, Exception -> 0x0031, blocks: (B:30:0x002c, B:31:0x0037, B:33:0x0069, B:35:0x0073, B:38:0x0089, B:40:0x008f, B:43:0x009b, B:46:0x00a0, B:48:0x0097, B:50:0x0052), top: B:2:0x0012, outer: #0 }] */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.un.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
