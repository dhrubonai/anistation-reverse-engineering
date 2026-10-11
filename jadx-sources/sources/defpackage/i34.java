package defpackage;

import com.discord.org.webrtc.SurfaceTextureHelper;
import com.discord.org.webrtc.SurfaceViewRenderer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class i34 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ i34(Object obj, int i, int i2, byte b) {
        this.x = b;
        this.A = obj;
        this.y = i;
        this.z = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        int i = this.z;
        int i2 = this.y;
        Object obj = this.A;
        switch (b) {
            case 0:
                ((l34) ((sn3) obj).y).d.c(i2, i);
                return;
            case 1:
                ((up5) ((ok2) obj).z).d.c(i2, i);
                return;
            case 2:
                ((SurfaceTextureHelper) obj).lambda$setTextureSize$2(i2, i);
                return;
            default:
                SurfaceViewRenderer.a((SurfaceViewRenderer) obj, i2, i);
                return;
        }
    }
}
