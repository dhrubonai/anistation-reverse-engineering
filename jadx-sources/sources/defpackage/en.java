package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class en extends t36 implements ic2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ List B;
    public byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ on z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en(vz0 vz0Var, on onVar, String str, List list) {
        super(2, vz0Var);
        this.z = onVar;
        this.A = str;
        this.B = list;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        en enVar = new en(vz0Var, this.z, this.A, this.B);
        enVar.y = obj;
        return enVar;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((en) create((x42) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
    
        if (r0.emit(r9, r12) == r8) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0049, code lost:
    
        if (r0.emit(r13, r12) == r8) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
    
        if (r0.emit(r13, r12) != r8) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00cf, code lost:
    
        if (r0.emit(r13, r12) != r8) goto L76;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c A[Catch: Exception -> 0x002e, u45 -> 0x0031, TryCatch #4 {u45 -> 0x0031, Exception -> 0x002e, blocks: (B:29:0x0029, B:30:0x0034, B:31:0x0062, B:33:0x006c, B:36:0x0082, B:38:0x0088, B:41:0x0094, B:44:0x0099, B:46:0x0090, B:48:0x004d), top: B:2:0x0011, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082 A[Catch: Exception -> 0x002e, u45 -> 0x0031, TryCatch #4 {u45 -> 0x0031, Exception -> 0x002e, blocks: (B:29:0x0029, B:30:0x0034, B:31:0x0062, B:33:0x006c, B:36:0x0082, B:38:0x0088, B:41:0x0094, B:44:0x0099, B:46:0x0090, B:48:0x004d), top: B:2:0x0011, outer: #2 }] */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
