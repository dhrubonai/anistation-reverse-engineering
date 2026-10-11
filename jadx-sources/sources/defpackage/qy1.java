package defpackage;

import android.media.MediaFormat;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qy1 implements ms6, fg0, kp4 {
    public fg0 A;
    public ms6 x;
    public fg0 y;
    public ms6 z;

    @Override // defpackage.fg0
    public final void a(long j, float[] fArr) {
        fg0 fg0Var = this.A;
        if (fg0Var != null) {
            fg0Var.a(j, fArr);
        }
        fg0 fg0Var2 = this.y;
        if (fg0Var2 != null) {
            fg0Var2.a(j, fArr);
        }
    }

    @Override // defpackage.fg0
    public final void b() {
        fg0 fg0Var = this.A;
        if (fg0Var != null) {
            fg0Var.b();
        }
        fg0 fg0Var2 = this.y;
        if (fg0Var2 != null) {
            fg0Var2.b();
        }
    }

    @Override // defpackage.kp4
    public final void c(int i, Object obj) {
        if (i != 7) {
            if (i != 8) {
                if (i != 10000) {
                    return;
                }
                gw5 gw5Var = (gw5) obj;
                if (gw5Var == null) {
                    this.z = null;
                    this.A = null;
                    return;
                } else {
                    this.z = gw5Var.getVideoFrameMetadataListener();
                    this.A = gw5Var.getCameraMotionListener();
                    return;
                }
            }
            this.y = (fg0) obj;
            return;
        }
        this.x = (ms6) obj;
    }

    @Override // defpackage.ms6
    public final void d(long j, long j2, ea2 ea2Var, MediaFormat mediaFormat) {
        ms6 ms6Var = this.z;
        if (ms6Var != null) {
            ms6Var.d(j, j2, ea2Var, mediaFormat);
        }
        ms6 ms6Var2 = this.x;
        if (ms6Var2 != null) {
            ms6Var2.d(j, j2, ea2Var, mediaFormat);
        }
    }
}
