package defpackage;

import com.anistation.android.presence.DiscordPresenceNativeBridge;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u64 {
    public final ke0 a;
    public final AtomicLong b;
    public bx5 c;
    public boolean d;
    public volatile boolean e;
    public final boolean f;

    public u64() {
        boolean z = false;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new s64((byte) 0));
        newSingleThreadExecutor.getClass();
        this.a = db.b(tl7.L(iv5.a(), new dx1(newSingleThreadExecutor)));
        this.b = new AtomicLong();
        if (!uz5.V("1543212125684764693") && DiscordPresenceNativeBridge.b) {
            z = true;
        }
        this.f = z;
    }
}
