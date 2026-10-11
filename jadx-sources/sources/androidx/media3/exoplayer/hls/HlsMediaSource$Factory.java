package androidx.media3.exoplayer.hls;

import defpackage.ar3;
import defpackage.b91;
import defpackage.cm2;
import defpackage.i75;
import defpackage.io3;
import defpackage.iw3;
import defpackage.jm2;
import defpackage.lw3;
import defpackage.m18;
import defpackage.o41;
import defpackage.p18;
import defpackage.q18;
import defpackage.rt3;
import defpackage.st3;
import defpackage.v71;
import defpackage.w16;
import defpackage.x81;
import defpackage.xp1;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class HlsMediaSource$Factory implements iw3 {
    public final i75 a;
    public x81 b;
    public w16 c;
    public st3 i = new st3((byte) 13);
    public final p18 f = new p18((byte) 13);
    public final v71 g = b91.T;
    public final q18 j = new q18((byte) 13);
    public final m18 h = new m18((byte) 13);
    public final boolean l = true;
    public final long m = -9223372036854775807L;
    public final boolean k = true;
    public byte e = 3;
    public boolean d = true;

    public HlsMediaSource$Factory(o41 o41Var) {
        this.a = new i75(o41Var, (byte) 15);
    }

    @Override // defpackage.iw3
    public final void a() {
        this.e = (byte) 3;
    }

    @Override // defpackage.iw3
    public final void b(w16 w16Var) {
        this.c = w16Var;
    }

    @Override // defpackage.iw3
    public final void c() {
        this.d = true;
    }

    @Override // defpackage.iw3
    public final iw3 d(st3 st3Var) {
        io3.w(st3Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.i = st3Var;
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [x81, java.lang.Object] */
    @Override // defpackage.iw3
    public final lw3 e(ar3 ar3Var) {
        ar3Var.b.getClass();
        x81 x81Var = this.b;
        x81 x81Var2 = x81Var;
        if (x81Var == null) {
            ?? obj = new Object();
            obj.a = new p18((byte) 14);
            obj.c = (byte) 3;
            this.b = obj;
            x81Var2 = obj;
        }
        x81 x81Var3 = x81Var2;
        w16 w16Var = this.c;
        if (w16Var != null) {
            x81Var3.a = w16Var;
        }
        x81Var3.b = this.d;
        x81Var3.c = this.e;
        List list = ar3Var.b.e;
        boolean isEmpty = list.isEmpty();
        jm2 jm2Var = this.f;
        if (!isEmpty) {
            jm2Var = new rt3((Object) jm2Var, (Object) list, (byte) 23);
        }
        xp1 o = this.i.o(ar3Var);
        this.g.getClass();
        i75 i75Var = this.a;
        q18 q18Var = this.j;
        return new cm2(ar3Var, i75Var, x81Var3, this.h, o, q18Var, new b91(i75Var, q18Var, jm2Var), this.m, this.k, this.l ? 1 : 0);
    }
}
