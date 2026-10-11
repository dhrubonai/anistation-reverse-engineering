package j1;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class b implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f5631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f5632b;

    public b(d dVar, Handler handler) {
        this.f5632b = dVar;
        this.f5631a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.f5631a.post(new y.m(this, i10, 1));
    }
}
