package n8;

import msr.pistream.app.ui.player.PlayerActivity;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f8030a;

    public e(PlayerActivity playerActivity) {
        this.f8030a = playerActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PlayerActivity playerActivity = this.f8030a;
        playerActivity.D();
        playerActivity.P.postDelayed(this, 250L);
    }
}
