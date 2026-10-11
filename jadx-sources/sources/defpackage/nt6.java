package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nt6 extends c95 {
    public final mt6 e;
    public final ls6 f;
    public final q61 g;
    public volatile long h;
    public long i;
    public boolean j;

    public nt6(Context context, ea2 ea2Var, bi6 bi6Var, l68 l68Var, List list, fc1 fc1Var, ho0 ho0Var, t54 t54Var, xv3 xv3Var, kz kzVar, long j, boolean z, nw2 nw2Var, LogSessionId logSessionId) {
        super(ea2Var, t54Var);
        hp0 hp0Var;
        tp5 tp5Var;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        hp0 hp0Var2 = ea2Var.H;
        hp0Var2.getClass();
        if (Objects.equals(ea2Var.p, "image/jpeg_r") && hp0Var2.c == 2) {
            hp0Var = new hp0(6, 1, 7, null, -1, -1);
        } else {
            int i = hp0Var2.c;
            if (i != 2 && i != 10) {
                hp0Var = hp0Var2;
            } else {
                hp0Var = hp0.h;
            }
        }
        da2 a = ea2Var.a();
        a.G = hp0Var;
        ls6 ls6Var = new ls6(ho0Var, new ea2(a), nw2Var, ((lx2) t54Var.b.x).a(2), bi6Var, kzVar, logSessionId);
        this.f = ls6Var;
        this.g = new q61(0);
        if (ls6Var.h == 2 && hp0.h(hp0Var2)) {
            hp0Var = hp0.h;
        }
        hp0 hp0Var3 = hp0Var;
        try {
            if (z) {
                tp5Var = new tp5(fc1Var, (byte) 1);
            } else {
                tp5Var = new tp5(fc1Var, (byte) 0);
            }
            mt6 mt6Var = new mt6(this, context, tp5Var, hp0Var3, l68Var, list, xv3Var, j, true);
            this.e = mt6Var;
            mt6Var.a.initialize();
        } catch (ns6 e) {
            throw oz1.e(e);
        }
    }

    @Override // defpackage.c95
    public final bi2 j(qr1 qr1Var, ea2 ea2Var, int i) {
        try {
            mt6 mt6Var = this.e;
            ht6 ht6Var = mt6Var.a;
            ht6Var.i(i);
            return new js6(ht6Var, i, mt6Var.e);
        } catch (ns6 e) {
            throw oz1.e(e);
        }
    }

    @Override // defpackage.c95
    public final q61 k() {
        ByteBuffer byteBuffer;
        q61 q61Var = this.g;
        ls6 ls6Var = this.f;
        MediaCodec.BufferInfo bufferInfo = null;
        if (ls6Var.k != null) {
            byteBuffer = ls6Var.k.c();
        } else {
            byteBuffer = null;
        }
        q61Var.B = byteBuffer;
        if (this.g.B == null) {
            return null;
        }
        ls6 ls6Var2 = this.f;
        if (ls6Var2.k != null) {
            p71 p71Var = ls6Var2.k;
            if (p71Var.f(false)) {
                bufferInfo = p71Var.a;
            }
        }
        bufferInfo.getClass();
        if (bufferInfo.presentationTimeUs == 0 && this.e.a.o() == this.j && this.h != -9223372036854775807L && bufferInfo.size > 0) {
            bufferInfo.presentationTimeUs = this.h;
        }
        q61 q61Var2 = this.g;
        long j = bufferInfo.presentationTimeUs;
        q61Var2.D = j;
        q61Var2.y = bufferInfo.flags;
        this.i = j;
        return q61Var2;
    }

    @Override // defpackage.c95
    public final ea2 l() {
        ls6 ls6Var = this.f;
        if (ls6Var.k == null) {
            return null;
        }
        p71 p71Var = ls6Var.k;
        p71Var.f(false);
        ea2 ea2Var = p71Var.j;
        if (ea2Var != null && ls6Var.l != 0) {
            da2 a = ea2Var.a();
            a.B = ls6Var.l;
            return new ea2(a);
        }
        return ea2Var;
    }

    @Override // defpackage.c95
    public final boolean m() {
        boolean z;
        boolean z2;
        ls6 ls6Var = this.f;
        if (ls6Var.k == null || !ls6Var.k.d()) {
            mt6 mt6Var = this.e;
            if (mt6Var.d) {
                z2 = false;
            } else {
                if (mt6Var.h.h != -9223372036854775807L) {
                    z = true;
                } else {
                    z = false;
                }
                synchronized (mt6Var.b) {
                    if (mt6Var.f == 0 && z) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.c95
    public final void o() {
        this.e.a.release();
        ls6 ls6Var = this.f;
        if (ls6Var.k != null) {
            ls6Var.k.h();
        }
        ls6Var.m = true;
    }

    @Override // defpackage.c95
    public final void p() {
        boolean z;
        if (this.i == 0) {
            this.j = true;
        }
        ls6 ls6Var = this.f;
        if (ls6Var.k != null) {
            ls6Var.k.i();
        }
        mt6 mt6Var = this.e;
        if (!mt6Var.d) {
            synchronized (mt6Var.b) {
                if (mt6Var.f > 0) {
                    z = true;
                } else {
                    z = false;
                }
                io3.B(z);
                mt6Var.f--;
            }
            mt6Var.e();
        }
    }
}
