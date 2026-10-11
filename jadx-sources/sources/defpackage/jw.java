package defpackage;

import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jw extends c95 {
    public final p71 e;
    public final vv f;
    public final q61 g;
    public final q61 h;
    public final fv i;
    public final hv j;
    public final ea2 k;
    public boolean l;
    public long m;
    public q61 n;

    /* JADX WARN: Type inference failed for: r8v0, types: [ew2, jw2] */
    public jw(ea2 ea2Var, ea2 ea2Var2, bi6 bi6Var, qr1 qr1Var, nw2 nw2Var, i18 i18Var, ho0 ho0Var, t54 t54Var, kz kzVar, LogSessionId logSessionId) {
        super(ea2Var, t54Var);
        hv hvVar;
        boolean z;
        xu5 xu5Var = new xu5(false);
        ?? ew2Var = new ew2(4);
        ew2Var.d(nw2Var);
        ew2Var.c(xu5Var);
        fv fvVar = new fv(i18Var, ew2Var.g());
        this.i = fvVar;
        this.k = ea2Var2;
        hv c = fvVar.c(qr1Var, ea2Var2);
        uv uvVar = fvVar.c;
        vv vvVar = uvVar.d;
        boolean equals = vvVar.equals(vv.e);
        int i = vvVar.a;
        io3.B(!equals);
        da2 da2Var = new da2();
        bi6 bi6Var2 = bi6Var;
        String str = bi6Var2.b;
        if (str == null) {
            str = ea2Var.p;
            str.getClass();
        }
        da2Var.o = qy3.n(str);
        da2Var.K = i;
        da2Var.I = vvVar.b;
        da2Var.L = vvVar.c;
        ea2 ea2Var3 = new ea2(da2Var);
        da2 a = ea2Var3.a();
        a.o = qy3.n(c95.i(ea2Var3, ((lx2) t54Var.b.x).a(1)));
        p71 b = ho0Var.b(new ea2(a), logSessionId);
        ea2 ea2Var4 = b.c;
        this.e = b;
        try {
            int i2 = new vv(p71.a(b.d.getInputFormat(), b.g, ea2Var4.m)).a;
            if (i2 != i) {
                fvVar.d();
                if (i2 != -1 && i2 <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                io3.n(z);
                xu5Var.c = i2;
                hvVar = fvVar.c(qr1Var, ea2Var2);
                vvVar = uvVar.d;
            } else {
                hvVar = c;
            }
            this.j = hvVar;
            this.f = vvVar;
            this.g = new q61(0);
            this.h = new q61(0);
            if (!Objects.equals(ea2Var3.p, ea2Var4.p)) {
                wp a2 = bi6Var2.a();
                a2.w(ea2Var4.p);
                bi6Var2 = a2.b();
            }
            kzVar.C(bi6Var2);
        } catch (RuntimeException e) {
            kb0.r("DefaultCodec", "MediaCodec error", e);
            throw b.b(e);
        }
    }

    @Override // defpackage.c95
    public final bi2 j(qr1 qr1Var, ea2 ea2Var, int i) {
        if (!this.l) {
            this.l = true;
            io3.B(ea2Var.equals(this.k));
            return this.j;
        }
        return this.i.c(qr1Var, ea2Var);
    }

    @Override // defpackage.c95
    public final q61 k() {
        p71 p71Var = this.e;
        ByteBuffer c = p71Var.c();
        q61 q61Var = this.h;
        q61Var.B = c;
        MediaCodec.BufferInfo bufferInfo = null;
        if (c == null) {
            return null;
        }
        if (p71Var.f(false)) {
            bufferInfo = p71Var.a;
        }
        bufferInfo.getClass();
        q61Var.D = bufferInfo.presentationTimeUs;
        q61Var.y = 1;
        return q61Var;
    }

    @Override // defpackage.c95
    public final ea2 l() {
        p71 p71Var = this.e;
        p71Var.f(false);
        return p71Var.j;
    }

    @Override // defpackage.c95
    public final boolean m() {
        return this.e.d();
    }

    @Override // defpackage.c95
    public final boolean n() {
        boolean z;
        q61 q61Var = this.n;
        q61 q61Var2 = this.g;
        p71 p71Var = this.e;
        if (q61Var == null && !p71Var.e(q61Var2)) {
            return false;
        }
        if (this.i.b()) {
            if (this.n != null) {
                q();
            }
            a61.a();
            if (this.n == null) {
                ByteBuffer byteBuffer = q61Var2.B;
                byteBuffer.getClass();
                if (byteBuffer.position() == 0) {
                    z = true;
                    io3.B(z);
                    long j = this.m;
                    vv vvVar = this.f;
                    q61Var2.D = ((j / vvVar.d) * 1000000) / vvVar.a;
                    q61Var2.b(4);
                    q61Var2.k();
                    p71Var.g(q61Var2);
                    return false;
                }
            }
            z = false;
            io3.B(z);
            long j2 = this.m;
            vv vvVar2 = this.f;
            q61Var2.D = ((j2 / vvVar2.d) * 1000000) / vvVar2.a;
            q61Var2.b(4);
            q61Var2.k();
            p71Var.g(q61Var2);
            return false;
        }
        return q();
    }

    @Override // defpackage.c95
    public final void o() {
        this.i.d();
        this.e.h();
    }

    @Override // defpackage.c95
    public final void p() {
        this.e.i();
    }

    public final boolean q() {
        fv fvVar;
        q61 q61Var = this.n;
        if (q61Var == null) {
            q61Var = this.g;
        }
        ByteBuffer byteBuffer = q61Var.B;
        byteBuffer.getClass();
        while (true) {
            fvVar = this.i;
            if (fvVar.b() || !fvVar.a().hasRemaining() || byteBuffer.remaining() <= 0) {
                break;
            }
            ByteBuffer a = fvVar.a();
            int min = Math.min(a.remaining(), byteBuffer.remaining());
            int limit = a.limit();
            a.limit(a.position() + min);
            byteBuffer.put(a);
            a.limit(limit);
        }
        if (byteBuffer.remaining() != 0 && !fvVar.b()) {
            this.n = q61Var;
            return false;
        }
        long j = this.m;
        vv vvVar = this.f;
        q61Var.D = ((j / vvVar.d) * 1000000) / vvVar.a;
        this.m = j + byteBuffer.position();
        q61Var.y = 0;
        q61Var.k();
        this.e.g(q61Var);
        this.n = null;
        return true;
    }
}
