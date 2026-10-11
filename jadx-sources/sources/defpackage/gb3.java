package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gb3 implements wo3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ ub2 d;
    public final /* synthetic */ hb3 e;
    public final /* synthetic */ mb3 f;
    public final /* synthetic */ ub2 g;

    public gb3(int i, int i2, Map map, ub2 ub2Var, hb3 hb3Var, mb3 mb3Var, ub2 ub2Var2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = ub2Var;
        this.e = hb3Var;
        this.f = mb3Var;
        this.g = ub2Var2;
    }

    @Override // defpackage.wo3
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.wo3
    public final void b() {
        jz2 jz2Var;
        za3 za3Var = this.f.x;
        boolean d0 = this.e.d0();
        ub2 ub2Var = this.g;
        if (d0 && (jz2Var = ((kz2) za3Var.c0.A).A0) != null) {
            ub2Var.invoke(jz2Var.M);
        } else {
            ub2Var.invoke(((kz2) za3Var.c0.A).M);
        }
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
