package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hb8 {
    public final /* synthetic */ byte a;

    public /* synthetic */ hb8(byte b) {
        this.a = b;
    }

    public final void a(ia8 ia8Var, Iterator it, ab8 ab8Var) {
        switch (this.a) {
            case 0:
                return;
            default:
                if (ia8Var.c) {
                    if (ia8Var.d && ((fe7) fe7.y.get()).x > 20) {
                        while (it.hasNext()) {
                            ab8Var.a(it.next(), ia8Var.a);
                        }
                        return;
                    }
                    ia8Var.a(it, ab8Var);
                    return;
                }
                ze0.m("non repeating key");
                return;
        }
    }

    private final void b(ia8 ia8Var, Iterator it, ab8 ab8Var) {
    }
}
