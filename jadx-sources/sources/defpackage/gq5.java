package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gq5 extends t30 {
    public final v41 i;
    public final o41 j;
    public final ea2 k;
    public final q18 l;
    public final yp5 m;
    public final ar3 n;
    public n71 o;

    /* JADX WARN: Type inference failed for: r3v1, types: [qq3, pq3] */
    public gq5(zq3 zq3Var, o41 o41Var, q18 q18Var) {
        boolean z;
        vq3 vq3Var;
        sq3 sq3Var;
        this.j = o41Var;
        this.l = q18Var;
        oq3 oq3Var = new oq3();
        rq3 rq3Var = new rq3();
        List list = Collections.EMPTY_LIST;
        z62 z62Var = nw2.y;
        o15 o15Var = o15.B;
        tq3 tq3Var = new tq3();
        wq3 wq3Var = wq3.d;
        Uri uri = Uri.EMPTY;
        String uri2 = zq3Var.a.toString();
        uri2.getClass();
        nw2 o = nw2.o(nw2.s(zq3Var));
        if (((Uri) rq3Var.e) != null && ((UUID) rq3Var.d) == null) {
            z = false;
        } else {
            z = true;
        }
        io3.B(z);
        if (uri != null) {
            if (((UUID) rq3Var.d) != null) {
                sq3Var = new sq3(rq3Var);
            } else {
                sq3Var = null;
            }
            vq3Var = new vq3(uri, null, sq3Var, null, list, null, o, -9223372036854775807L);
        } else {
            vq3Var = null;
        }
        ar3 ar3Var = new ar3(uri2, new pq3(oq3Var), vq3Var, new uq3(tq3Var), jr3.M, wq3Var);
        this.n = ar3Var;
        da2 da2Var = new da2();
        String str = zq3Var.b;
        da2Var.o = qy3.n(str == null ? "text/x-unknown" : str);
        da2Var.d = zq3Var.c;
        da2Var.e = zq3Var.d;
        da2Var.f = zq3Var.e;
        da2Var.b = zq3Var.f;
        String str2 = zq3Var.g;
        da2Var.a = str2 == null ? null : str2;
        this.k = new ea2(da2Var);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = zq3Var.a;
        io3.w(uri3, "The uri must be set.");
        this.i = new v41(uri3, 0L, 1, null, map, 0L, -1L, null, 1);
        this.m = new yp5(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, ar3Var, null);
    }

    @Override // defpackage.lw3
    public final or3 b(jw3 jw3Var, l7 l7Var, long j) {
        return new fq5(this.i, this.j, this.o, this.k, this.l, new eb2((CopyOnWriteArrayList) this.c.A, 0, jw3Var), null);
    }

    @Override // defpackage.lw3
    public final ar3 c() {
        return this.n;
    }

    @Override // defpackage.lw3
    public final void h(or3 or3Var) {
        ((fq5) or3Var).D.L(null);
    }

    @Override // defpackage.t30
    public final void n(n71 n71Var) {
        this.o = n71Var;
        o(this.m);
    }

    @Override // defpackage.lw3
    public final void d() {
    }
}
