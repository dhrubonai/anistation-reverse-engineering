package defpackage;

import com.discord.org.webrtc.JavaI420Buffer;
import com.discord.org.webrtc.YuvConverter;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class b43 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ByteBuffer y;

    public /* synthetic */ b43(ByteBuffer byteBuffer, byte b) {
        this.x = b;
        this.y = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        ByteBuffer byteBuffer = this.y;
        switch (b) {
            case 0:
                JavaI420Buffer.a(byteBuffer);
                return;
            default:
                YuvConverter.a(byteBuffer);
                return;
        }
    }
}
