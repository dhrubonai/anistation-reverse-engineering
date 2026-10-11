package defpackage;

import android.os.HandlerThread;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class du implements r26 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;

    public /* synthetic */ du(int i, byte b) {
        this.x = b;
        this.y = i;
    }

    @Override // defpackage.r26
    public final Object get() {
        byte b = this.x;
        int i = this.y;
        switch (b) {
            case 0:
                return new HandlerThread(eu.a(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(eu.a(i, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
