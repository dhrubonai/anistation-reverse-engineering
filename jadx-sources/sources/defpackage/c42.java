package defpackage;

import com.discord.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c42 implements b12 {
    public d12 f;
    public bh6 g;
    public fy3 i;
    public f42 j;
    public int k;
    public int l;
    public b42 m;
    public int n;
    public long o;
    public final byte[] a = new byte[42];
    public final zi4 b = new zi4(0, new byte[PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS]);
    public final boolean c = false;
    public final boolean d = false;
    public final d42 e = new Object();
    public byte h = 0;

    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    @Override // defpackage.b12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.c12 r32, defpackage.d42 r33) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c42.a(c12, d42):int");
    }

    @Override // defpackage.b12
    public final boolean b(c12 c12Var) {
        nx7.O(c12Var, false, false);
        zi4 zi4Var = new zi4(4);
        ((p81) c12Var).j(zi4Var.a, 0, 4, false);
        if (zi4Var.C() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override // defpackage.b12
    public final void c(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.h = (byte) 0;
        } else {
            b42 b42Var = this.m;
            if (b42Var != null) {
                b42Var.d(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.o = j3;
        this.n = 0;
        this.b.K(0);
    }

    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        this.f = d12Var;
        this.g = d12Var.G(0, 1);
        d12Var.t();
    }

    @Override // defpackage.b12
    public final void release() {
    }
}
