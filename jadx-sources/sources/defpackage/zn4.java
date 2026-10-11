package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zn4 implements dv6 {
    public final /* synthetic */ eo4 b;

    public zn4(eo4 eo4Var) {
        this.b = eo4Var;
    }

    @Override // defpackage.dv6
    public final void a(hv6 hv6Var) {
        Iterator it = this.b.h.iterator();
        while (it.hasNext()) {
            bo4 bo4Var = (bo4) it.next();
            bo4Var.i.execute(new f32((Object) bo4Var.h, (Object) hv6Var, (byte) 22));
        }
    }

    @Override // defpackage.dv6
    public final void b() {
        Iterator it = this.b.h.iterator();
        while (it.hasNext()) {
            bo4 bo4Var = (bo4) it.next();
            bo4Var.i.execute(new ao4(bo4Var.h, (byte) 0));
        }
    }

    @Override // defpackage.dv6
    public final void c(fv6 fv6Var) {
        Iterator it = this.b.h.iterator();
        while (it.hasNext()) {
            bo4 bo4Var = (bo4) it.next();
            ns6 a = ns6.a(fv6Var, -9223372036854775807L);
            bo4Var.i.execute(new ze(bo4Var, bo4Var.h, a, (byte) 18));
        }
    }

    @Override // defpackage.dv6
    public final void onFirstFrameRendered() {
        Iterator it = this.b.h.iterator();
        while (it.hasNext()) {
            bo4 bo4Var = (bo4) it.next();
            bo4Var.i.execute(new ao4(bo4Var.h, (byte) 1));
        }
    }
}
