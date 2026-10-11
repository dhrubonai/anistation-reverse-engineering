package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pv0 {
    public final Executor a;
    public final ja1 b;
    public final Executor c;
    public final xb5 d;
    public final af2 e;
    public final m18 f;

    public pv0(i18 i18Var) {
        ja1 ja1Var = rh1.a;
        this.a = q23.e(ja1Var.x0(Math.max(1, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4))));
        this.b = ja1Var;
        this.c = q23.e(ja1Var);
        this.d = new xb5((byte) 4);
        this.e = new af2((byte) 17);
        this.f = new m18((byte) 11);
    }
}
