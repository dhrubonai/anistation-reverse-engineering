package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.discord.org.webrtc.RenderSynchronizer;
import com.unity3d.services.UnityAdsConstants;
import java.util.Random;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class vu4 implements Choreographer.FrameCallback {
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ Object y;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new wu4((Context) obj, (byte) 0), new Random().nextInt(Math.max(UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, 1)) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_DURATION);
                return;
            default:
                ((RenderSynchronizer) obj).onDisplayRefreshCycleBegin(j);
                return;
        }
    }

    public /* synthetic */ vu4(RenderSynchronizer renderSynchronizer) {
        this.y = renderSynchronizer;
    }
}
