package defpackage;

import java.nio.channels.SocketChannel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class lu5 extends ju5 implements gu5 {
    public final p5 G;
    public final mu5 H;
    public final SocketChannel I;

    public lu5(SocketChannel socketChannel, p5 p5Var, mu5 mu5Var) {
        this.G = p5Var;
        this.H = mu5Var;
        this.I = socketChannel;
        if (!socketChannel.isBlocking()) {
            return;
        }
        ze0.k("Channel need to be configured as non-blocking.");
        throw null;
    }

    @Override // defpackage.ju5
    public final Throwable G() {
        p5 p5Var = this.G;
        try {
            this.I.close();
            close();
            p5Var.G(this);
            return null;
        } catch (Throwable th) {
            p5Var.G(this);
            return th;
        }
    }

    @Override // defpackage.ju5
    public final k97 I(nc0 nc0Var) {
        SocketChannel socketChannel = this.I;
        socketChannel.getClass();
        p5 p5Var = this.G;
        p5Var.getClass();
        ja1 ja1Var = rh1.a;
        return h41.p0(this, j91.y.plus(new r11("cio-from-nio-reader")), nc0Var, new me0(this, this.H, nc0Var, socketChannel, p5Var, null));
    }

    @Override // defpackage.ju5
    public final py4 T(nc0 nc0Var) {
        SocketChannel socketChannel = this.I;
        socketChannel.getClass();
        p5 p5Var = this.G;
        p5Var.getClass();
        ja1 ja1Var = rh1.a;
        return zz.Z(this, j91.y.plus(new r11("cio-to-nio-writer")), nc0Var, new oe0(this, this.H, nc0Var, p5Var, socketChannel, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x010e, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f5, code lost:
    
        A(defpackage.pg5.D, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fa, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x004b, code lost:
    
        if (r2.k0(r12, r13, r0) == r7) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l0(java.net.SocketAddress r13, defpackage.xz0 r14) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lu5.l0(java.net.SocketAddress, xz0):java.lang.Object");
    }

    @Override // defpackage.rg5
    public final SocketChannel q() {
        return this.I;
    }
}
