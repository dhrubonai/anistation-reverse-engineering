package defpackage;

import com.discord.org.webrtc.RenderSynchronizer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class v25 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ RenderSynchronizer y;

    public /* synthetic */ v25(RenderSynchronizer renderSynchronizer, byte b) {
        this.x = b;
        this.y = renderSynchronizer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        RenderSynchronizer renderSynchronizer = this.y;
        switch (b) {
            case 0:
                RenderSynchronizer.c(renderSynchronizer);
                return;
            default:
                RenderSynchronizer.b(renderSynchronizer);
                return;
        }
    }
}
