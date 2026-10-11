package defpackage;

import com.discord.socialsdk.NativeCalls;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class q64 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ boolean y;

    public /* synthetic */ q64(byte b, boolean z) {
        this.x = b;
        this.y = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        boolean z = this.y;
        switch (b) {
            case 0:
                NativeCalls.e(z);
                return;
            default:
                NativeCalls.a(z);
                return;
        }
    }
}
