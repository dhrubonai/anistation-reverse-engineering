package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jb8 {
    public static final fb8 d = new fb8();
    public static final hb8 e = new hb8(0);
    public final HashMap a;
    public final HashMap b;
    public hb8 c;

    public jb8(jb8 jb8Var) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        hashMap.putAll(jb8Var.a);
        hashMap2.putAll(jb8Var.b);
        this.c = jb8Var.c;
    }

    public void a(ia8 ia8Var, Object obj, ab8 ab8Var) {
        fb8 fb8Var = (fb8) this.a.get(ia8Var);
        if (fb8Var != null) {
            switch (fb8Var.a) {
                case 0:
                    return;
                default:
                    if (ia8Var.d && ((fe7) fe7.y.get()).x > 20) {
                        ab8Var.a(obj, ia8Var.a);
                        return;
                    } else {
                        ia8Var.b(obj, ab8Var);
                        return;
                    }
            }
        }
        if (ia8Var.d && ((fe7) fe7.y.get()).x > 20) {
            ab8Var.a(obj, ia8Var.a);
        } else {
            ia8Var.b(obj, ab8Var);
        }
    }

    public void b(ia8 ia8Var, Iterator it, ab8 ab8Var) {
        hb8 hb8Var = (hb8) this.b.get(ia8Var);
        if (hb8Var != null) {
            hb8Var.a(ia8Var, it, ab8Var);
            return;
        }
        hb8 hb8Var2 = this.c;
        if (hb8Var2 != null && !this.a.containsKey(ia8Var)) {
            hb8Var2.a(ia8Var, it, ab8Var);
        } else {
            while (it.hasNext()) {
                a(ia8Var, it.next(), ab8Var);
            }
        }
    }

    public /* synthetic */ jb8() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = null;
    }
}
