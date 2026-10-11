package defpackage;

import com.anistation.download.data.model.DownloadRequest;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xk1 extends t36 implements ic2 {
    public final /* synthetic */ DownloadRequest A;
    public final /* synthetic */ String B;
    public final /* synthetic */ byte x;
    public byte y;
    public final /* synthetic */ fl1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xk1(fl1 fl1Var, DownloadRequest downloadRequest, String str, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = fl1Var;
        this.A = downloadRequest;
        this.B = str;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                return new xk1(this.z, this.A, this.B, vz0Var, (byte) 0);
            default:
                return new xk1(this.z, this.A, this.B, vz0Var, (byte) 1);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v11 v11Var = (v11) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((xk1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((xk1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (defpackage.tl7.V(defpackage.j91.y, new defpackage.xg(r13, r14, r15, r16, 2), r18) == r6) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (defpackage.tl7.V(defpackage.j91.y, new defpackage.xg(r13, r14, r15, r16, 2), r18) == r6) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011c, code lost:
    
        if (defpackage.tl7.V(defpackage.j91.y, new defpackage.xg(r13, r14, r15, r16, 2), r18) == r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f5, code lost:
    
        if (defpackage.tl7.V(defpackage.j91.y, new defpackage.xg(r13, r14, r15, r16, 2), r18) == r6) goto L40;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
