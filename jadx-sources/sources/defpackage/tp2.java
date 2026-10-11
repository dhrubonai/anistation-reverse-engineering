package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class tp2 implements nr2 {
    public final nk2 A;
    public final xq2 x;
    public final op6 y;
    public final mv0 z;

    /* JADX WARN: Type inference failed for: r0v4, types: [nk2, sz5] */
    public tp2(or2 or2Var) {
        this.x = or2Var.b;
        this.y = or2Var.a.b();
        this.z = or2Var.f;
        this.A = new sz5((Map) or2Var.c.x, true);
    }

    @Override // defpackage.wq2
    public final jk2 a() {
        return this.A;
    }

    @Override // defpackage.nr2
    public final yp2 d0() {
        throw new IllegalStateException("Call is not initialized");
    }

    @Override // defpackage.nr2
    public final mv0 getAttributes() {
        return this.z;
    }

    @Override // defpackage.nr2
    public final xq2 getMethod() {
        return this.x;
    }

    @Override // defpackage.nr2
    public final op6 getUrl() {
        return this.y;
    }
}
