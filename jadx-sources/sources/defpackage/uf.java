package defpackage;

import android.view.Choreographer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uf implements j11 {
    public final /* synthetic */ byte x;
    public final Object y;
    public final Object z;

    public uf(uf ufVar) {
        this.x = (byte) 2;
        this.y = ufVar;
        this.z = new tu((byte) 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r9 == r3) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Type inference failed for: r1v2, types: [jz, ia0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ub2 r8, defpackage.vz0 r9) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uf.a(ub2, vz0):java.lang.Object");
    }

    @Override // defpackage.l11
    public final Object fold(Object obj, ic2 ic2Var) {
        switch (this.x) {
            case 0:
                return ic2Var.invoke(obj, this);
            case 1:
                return ic2Var.invoke(obj, this);
            default:
                return ic2Var.invoke(obj, this);
        }
    }

    @Override // defpackage.l11
    public final j11 get(k11 k11Var) {
        switch (this.x) {
            case 0:
                return tl7.u(this, k11Var);
            case 1:
                return tl7.u(this, k11Var);
            default:
                return tl7.u(this, k11Var);
        }
    }

    @Override // defpackage.j11
    public k11 getKey() {
        return pk2.Z;
    }

    @Override // defpackage.l11
    public final l11 minusKey(k11 k11Var) {
        switch (this.x) {
            case 0:
                return tl7.B(this, k11Var);
            case 1:
                return tl7.B(this, k11Var);
            default:
                return tl7.B(this, k11Var);
        }
    }

    @Override // defpackage.l11
    public final l11 plus(l11 l11Var) {
        switch (this.x) {
            case 0:
                return tl7.L(this, l11Var);
            case 1:
                return tl7.L(this, l11Var);
            default:
                return tl7.L(this, l11Var);
        }
    }

    public uf(Choreographer choreographer, sf sfVar) {
        this.x = (byte) 0;
        this.y = choreographer;
        this.z = sfVar;
    }

    public uf(b05 b05Var) {
        this.x = (byte) 1;
        this.y = b05Var;
        this.z = new kz((byte) 0);
    }
}
