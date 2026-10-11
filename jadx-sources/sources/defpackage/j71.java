package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j71 {
    public final ea2 a;
    public final ea2 b;
    public final int c;
    public final int d;
    public final rv e;
    public final uv f;
    public final kf6 g;
    public final Object h;

    public j71(ea2 ea2Var, ea2 ea2Var2, int i, int i2, rv rvVar, uv uvVar, kf6 kf6Var, Object obj) {
        this.a = ea2Var;
        this.b = ea2Var2;
        this.c = i;
        this.d = i2;
        this.e = rvVar;
        this.f = uvVar;
        this.g = kf6Var;
        this.h = obj;
    }

    public final j71 a(rv rvVar) {
        return new j71(this.a, this.b, this.c, this.d, rvVar, this.f, this.g, this.h);
    }

    public final boolean b() {
        return Objects.equals(this.a.p, "audio/raw");
    }
}
