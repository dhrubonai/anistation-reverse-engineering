package defpackage;

import com.discord.org.webrtc.EglThread;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class bs1 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ EglThread y;

    public /* synthetic */ bs1(EglThread eglThread, byte b) {
        this.x = b;
        this.y = eglThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        EglThread eglThread = this.y;
        switch (b) {
            case 0:
                EglThread.a(eglThread);
                return;
            default:
                EglThread.c(eglThread);
                return;
        }
    }
}
