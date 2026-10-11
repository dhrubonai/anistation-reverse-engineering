package defpackage;

import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class po5 {
    public static final List a;

    static {
        xb4 xb4Var = xb4.b;
        xb4 xb4Var2 = xb4.b;
        vj2 vj2Var = vj2.D;
        oo5 oo5Var = oo5.A;
        wj2 wj2Var = new wj2(vj2Var, oo5Var, xb4Var2);
        xb4 xb4Var3 = xb4.c;
        vj2 vj2Var2 = vj2.C;
        wj2 wj2Var2 = new wj2(vj2Var2, oo5Var, xb4Var3);
        xb4 xb4Var4 = xb4.d;
        vj2 vj2Var3 = vj2.E;
        oo5 oo5Var2 = oo5.z;
        a = te4.I(wj2Var, wj2Var2, new wj2(vj2Var3, oo5Var2, xb4Var4), new wj2(vj2Var, oo5Var2, xb4.e), new wj2(vj2Var2, oo5Var2, xb4.f), new wj2(vj2.B, oo5Var2, xb4.g));
    }

    public static final wj2 a(byte b, byte b2) {
        Object obj;
        Object obj2;
        Object obj3;
        if (b2 != 0) {
            Iterator it = a.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    wj2 wj2Var = (wj2) obj;
                    if (wj2Var.a.x == b && wj2Var.b.x == b2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            wj2 wj2Var2 = (wj2) obj;
            if (wj2Var2 == null) {
                vj2.A.getClass();
                Iterator it2 = vj2.G.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (((vj2) obj2).x == b) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                vj2 vj2Var = (vj2) obj2;
                if (vj2Var != null) {
                    oo5.y.getClass();
                    Iterator it3 = oo5.C.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj3 = it3.next();
                            if (((oo5) obj3).x == b2) {
                                break;
                            }
                        } else {
                            obj3 = null;
                            break;
                        }
                    }
                    oo5 oo5Var = (oo5) obj3;
                    if (oo5Var == null) {
                        return null;
                    }
                    return new wj2(vj2Var, oo5Var, null);
                }
                throw new SSLException(qx1.h(b, "Unknown hash algorithm: "), null);
            }
            return wj2Var2;
        }
        ze0.m("Anonymous signature not allowed.");
        return null;
    }
}
