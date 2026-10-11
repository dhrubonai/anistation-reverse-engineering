package l1;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* loaded from: classes.dex */
public final class u0 extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f6743a;

    public u0(v0 v0Var) {
        this.f6743a = v0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        w0 w0Var;
        f.p0 p0Var;
        j1.e0 e0Var;
        if (audioTrack.equals(this.f6743a.f6746c.f6787x) && (p0Var = (w0Var = this.f6743a.f6746c).f6783t) != null && w0Var.Y && (e0Var = ((z0) p0Var.f3762b).f6815h1) != null) {
            e0Var.f5715a.f5806y.d(2);
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        w0 w0Var;
        f.p0 p0Var;
        j1.e0 e0Var;
        if (audioTrack.equals(this.f6743a.f6746c.f6787x) && (p0Var = (w0Var = this.f6743a.f6746c).f6783t) != null && w0Var.Y && (e0Var = ((z0) p0Var.f3762b).f6815h1) != null) {
            e0Var.f5715a.f5806y.d(2);
        }
    }
}
