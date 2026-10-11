package com.discord.org.webrtc;

import com.discord.org.webrtc.Camera1Session;
import com.discord.org.webrtc.TextureBufferImpl;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ b(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        Object obj = this.z;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                Camera1Session.AnonymousClass2.b((Camera1Session.AnonymousClass2) obj2, (byte[]) obj);
                return;
            case 1:
                Camera1Session.AnonymousClass2.a((Camera1Session.AnonymousClass2) obj2, (byte[]) obj);
                return;
            default:
                TextureBufferImpl.b((TextureBufferImpl) obj2, (TextureBufferImpl.RefCountMonitor) obj);
                return;
        }
    }
}
