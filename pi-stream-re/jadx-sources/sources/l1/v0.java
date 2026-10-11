package l1;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f6744a = new Handler(Looper.myLooper());

    /* renamed from: b, reason: collision with root package name */
    public final u0 f6745b = new u0(this);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f6746c;

    public v0(w0 w0Var) {
        this.f6746c = w0Var;
    }

    public void a(AudioTrack audioTrack) {
        Handler handler = this.f6744a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new t0(handler, 0), this.f6745b);
    }

    public void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f6745b);
        this.f6744a.removeCallbacksAndMessages(null);
    }
}
