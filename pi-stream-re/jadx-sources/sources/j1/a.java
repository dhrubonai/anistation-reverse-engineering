package j1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes.dex */
public final class a extends BroadcastReceiver implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final z f5612a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f5613b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i4.v f5614c;

    public a(i4.v vVar, Handler handler, z zVar) {
        this.f5614c = vVar;
        this.f5613b = handler;
        this.f5612a = zVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f5613b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5614c.f5380b) {
            this.f5612a.f5932a.d0(-1, 3, false);
        }
    }
}
