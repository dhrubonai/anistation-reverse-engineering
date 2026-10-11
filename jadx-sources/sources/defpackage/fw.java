package defpackage;

import com.discord.socialsdk.DiscordRpcClient;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class fw implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ long y;
    public final /* synthetic */ Object z;

    public /* synthetic */ fw(Object obj, long j, byte b) {
        this.x = b;
        this.z = obj;
        this.y = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        long j = this.y;
        Object obj = this.z;
        switch (b) {
            case 0:
                iw iwVar = (iw) ((pz2) obj).z;
                String str = eq6.a;
                iwVar.B(j);
                return;
            default:
                ((DiscordRpcClient) obj).lambda$connect$0(j);
                return;
        }
    }
}
