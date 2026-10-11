package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sq extends t36 implements ic2 {
    public byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ tq z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq(vz0 vz0Var, tq tqVar) {
        super(2, vz0Var);
        this.z = tqVar;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        sq sqVar = new sq(vz0Var, this.z);
        sqVar.y = obj;
        return sqVar;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((sq) create((x42) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x004e, code lost:
    
        if (r6.emit(r1, r14) == r13) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0181, code lost:
    
        if (r6.emit(r0, r14) != r13) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0107, code lost:
    
        if (r6.emit(r0, r14) != r13) goto L86;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0014. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096 A[Catch: Exception -> 0x0032, u45 -> 0x0035, TryCatch #4 {u45 -> 0x0035, Exception -> 0x0032, blocks: (B:30:0x002d, B:31:0x0038, B:33:0x007f, B:35:0x0087, B:38:0x008e, B:40:0x0096, B:43:0x00ac, B:45:0x00b2, B:48:0x00be, B:51:0x00c3, B:54:0x00ba, B:55:0x00d7, B:58:0x00e1, B:59:0x00e4, B:61:0x0052), top: B:2:0x0014, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac A[Catch: Exception -> 0x0032, u45 -> 0x0035, TryCatch #4 {u45 -> 0x0035, Exception -> 0x0032, blocks: (B:30:0x002d, B:31:0x0038, B:33:0x007f, B:35:0x0087, B:38:0x008e, B:40:0x0096, B:43:0x00ac, B:45:0x00b2, B:48:0x00be, B:51:0x00c3, B:54:0x00ba, B:55:0x00d7, B:58:0x00e1, B:59:0x00e4, B:61:0x0052), top: B:2:0x0014, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
