package defpackage;

import android.graphics.SurfaceTexture;
import com.discord.org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class gb5 implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ gb5(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                ((hb5) obj).x.set(true);
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) obj, surfaceTexture);
                return;
        }
    }
}
