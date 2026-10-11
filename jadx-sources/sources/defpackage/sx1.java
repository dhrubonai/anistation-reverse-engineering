package defpackage;

import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sx1 extends tx1 {
    public final st3 c0;
    public final LogSessionId d0;
    public boolean e0;

    public sx1(st3 st3Var, ok2 ok2Var, zs zsVar, LogSessionId logSessionId) {
        super(1, ok2Var, zsVar);
        this.c0 = st3Var;
        this.d0 = logSessionId;
    }

    @Override // defpackage.tx1
    public final boolean I() {
        MediaCodec.BufferInfo bufferInfo;
        q61 b = this.R.b();
        if (b != null) {
            if (!this.e0) {
                if (this.S.d()) {
                    ByteBuffer byteBuffer = b.B;
                    byteBuffer.getClass();
                    byteBuffer.limit(0);
                    b.b(4);
                    this.T = this.R.g();
                    return false;
                }
                ByteBuffer c = this.S.c();
                if (c != null) {
                    b.j(c.limit());
                    b.B.put(c).flip();
                    p71 p71Var = this.S;
                    if (p71Var.f(false)) {
                        bufferInfo = p71Var.a;
                    } else {
                        bufferInfo = null;
                    }
                    bufferInfo.getClass();
                    b.D = bufferInfo.presentationTimeUs;
                    b.y = bufferInfo.flags;
                    this.S.i();
                    this.e0 = true;
                }
            }
            if (this.R.g()) {
                this.e0 = false;
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tx1
    public final void J(ea2 ea2Var) {
        io3.n(!R(ea2Var));
        LogSessionId logSessionId = this.d0;
        st3 st3Var = this.c0;
        p71 c = ((c41) st3Var.x).c(m37.m(ea2Var), ea2Var, null, false, logSessionId);
        st3Var.y = c.d.getCanonicalName();
        this.S = c;
    }

    @Override // defpackage.tx1
    public final boolean R(ea2 ea2Var) {
        if (Objects.equals(ea2Var.p, "audio/raw") && eq6.N(ea2Var.M)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.w30
    public final String i() {
        return "ExoAssetLoaderAudioRenderer";
    }
}
