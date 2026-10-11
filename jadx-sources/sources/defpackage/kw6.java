package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kw6 {
    public final cw6 a;
    public final Long b;
    public final Bundle c;
    public final j21 d;
    public final yv6 e;
    public final d46 f;

    public kw6(ew6 ew6Var, Long l, Bundle bundle, j21 j21Var, yv6 yv6Var) {
        j21Var.getClass();
        yv6Var.getClass();
        this.a = ew6Var.getViewModelStore();
        this.b = l;
        this.c = bundle;
        this.d = j21Var;
        this.e = yv6Var;
        this.f = new d46(new e96(this, (byte) 7));
    }

    public final jw6 a() {
        return (jw6) this.f.getValue();
    }
}
