package defpackage;

import android.media.AudioTrack;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vw extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ dn0 a;

    public vw(dn0 dn0Var) {
        this.a = dn0Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        ((ww) this.a.A).i.g(-1, new ze0((byte) 11));
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        ((ww) this.a.A).i.g(-1, new ze0((byte) 12));
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        ((ww) this.a.A).i.g(-1, new ze0((byte) 11));
    }
}
