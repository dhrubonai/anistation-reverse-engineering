package defpackage;

import com.discord.org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class m36 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ SurfaceTextureHelper y;

    public /* synthetic */ m36(SurfaceTextureHelper surfaceTextureHelper, byte b) {
        this.x = b;
        this.y = surfaceTextureHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        SurfaceTextureHelper surfaceTextureHelper = this.y;
        switch (b) {
            case 0:
                surfaceTextureHelper.lambda$forceFrame$3();
                return;
            case 1:
                surfaceTextureHelper.lambda$dispose$6();
                return;
            case 2:
                surfaceTextureHelper.lambda$stopListening$1();
                return;
            default:
                surfaceTextureHelper.lambda$returnTextureFrame$5();
                return;
        }
    }
}
