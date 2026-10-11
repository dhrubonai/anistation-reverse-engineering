package defpackage;

import com.discord.org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ew implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ew(Object obj, int i, byte b) {
        this.x = b;
        this.z = obj;
        this.y = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        int i = this.y;
        Object obj = this.z;
        switch (b) {
            case 0:
                iw iwVar = (iw) ((pz2) obj).z;
                String str = eq6.a;
                iwVar.c(i);
                return;
            default:
                ((SurfaceTextureHelper) obj).lambda$setFrameRotation$4(i);
                return;
        }
    }
}
