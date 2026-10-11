package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xl3 implements wo3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ ub2 d;
    public final /* synthetic */ ub2 e;
    public final /* synthetic */ yl3 f;

    public xl3(int i, int i2, Map map, ub2 ub2Var, ub2 ub2Var2, yl3 yl3Var) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = ub2Var;
        this.e = ub2Var2;
        this.f = yl3Var;
    }

    @Override // defpackage.wo3
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.wo3
    public final void b() {
        this.e.invoke(this.f.M);
    }

    @Override // defpackage.wo3
    public final ub2 e() {
        return this.d;
    }

    @Override // defpackage.wo3
    public final int getHeight() {
        return this.b;
    }

    @Override // defpackage.wo3
    public final int getWidth() {
        return this.a;
    }
}
