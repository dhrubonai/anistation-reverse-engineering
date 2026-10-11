package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class ow2 extends s30 implements Serializable {
    public final transient t15 B;
    public final transient int C;

    public ow2(t15 t15Var, int i) {
        this.B = t15Var;
        this.C = i;
    }

    @Override // defpackage.j2
    public final boolean c(Object obj) {
        if (obj != null && super.c(obj)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.j2
    public final Collection e() {
        return new tw2(this);
    }

    @Override // defpackage.j2
    public final Collection g() {
        return (gw2) super.g();
    }

    @Override // defpackage.j2
    public final Iterator h() {
        return new sw2(this);
    }

    @Override // defpackage.j2
    public final Collection i(Object obj) {
        nw2 nw2Var = (nw2) this.B.get(obj);
        if (nw2Var == null) {
            z62 z62Var = nw2.y;
            return o15.B;
        }
        return nw2Var;
    }

    @Override // defpackage.j2
    public final Set j() {
        return this.B.keySet();
    }

    @Override // defpackage.j2
    public final boolean k(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.j2
    public final int l() {
        return this.C;
    }

    @Override // defpackage.j2
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public rw2 a() {
        return this.B;
    }
}
