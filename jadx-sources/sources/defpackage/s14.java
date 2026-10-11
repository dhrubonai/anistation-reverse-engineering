package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s14 {
    public final ug6 a;
    public final ch6 b;
    public final bh6 c;
    public final ek6 d;
    public final boolean e;
    public final boolean f;
    public int g;
    public ea2 h;

    public s14(ug6 ug6Var, ch6 ch6Var, bh6 bh6Var) {
        boolean z;
        ek6 ek6Var;
        this.a = ug6Var;
        this.b = ch6Var;
        this.c = bh6Var;
        int i = ug6Var.b;
        ea2 ea2Var = ug6Var.g;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        this.f = Objects.equals(ea2Var.p, "application/x-itut-t35");
        if ("audio/true-hd".equals(ea2Var.p)) {
            ek6Var = new ek6();
        } else {
            ek6Var = null;
        }
        this.d = ek6Var;
    }
}
