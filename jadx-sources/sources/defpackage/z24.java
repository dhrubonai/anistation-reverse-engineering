package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z24 extends j2 {
    public final j2 B;
    public final sn3 C;

    public z24(j2 j2Var, sn3 sn3Var) {
        j2Var.getClass();
        this.B = j2Var;
        this.C = sn3Var;
    }

    @Override // defpackage.j2
    public final void b() {
        this.B.b();
    }

    @Override // defpackage.j2
    public final Map d() {
        return new un3(this.B.a(), new xv3(this, (byte) 1));
    }

    @Override // defpackage.j2
    public final Collection e() {
        return new i2(this, (byte) 0);
    }

    @Override // defpackage.j2
    public final Set f() {
        return this.B.j();
    }

    @Override // defpackage.j2
    public final Iterator h() {
        return new s33(this.B.g().iterator(), new qn3(this.C, (byte) 0));
    }

    @Override // defpackage.j2
    public final Collection i(Object obj) {
        return tl7.S((List) this.B.i(obj), new on3(this.C, obj));
    }

    @Override // defpackage.j2
    public final boolean k(Object obj, Object obj2) {
        return i(obj).remove(obj2);
    }

    @Override // defpackage.j2
    public final int l() {
        return this.B.l();
    }
}
