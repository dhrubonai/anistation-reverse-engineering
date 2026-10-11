package l1;

import android.media.AudioAttributes;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final c1.v f6700a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6701b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6702c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6703d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6704e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6705f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6706g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6707h;

    /* renamed from: i, reason: collision with root package name */
    public final d1.a f6708i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f6709j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f6710k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6711l;

    public n0(c1.v vVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, d1.a aVar, boolean z9, boolean z10, boolean z11) {
        this.f6700a = vVar;
        this.f6701b = i10;
        this.f6702c = i11;
        this.f6703d = i12;
        this.f6704e = i13;
        this.f6705f = i14;
        this.f6706g = i15;
        this.f6707h = i16;
        this.f6708i = aVar;
        this.f6709j = z9;
        this.f6710k = z10;
        this.f6711l = z11;
    }

    public static AudioAttributes c(c1.g gVar, boolean z9) {
        if (z9) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        return (AudioAttributes) gVar.a().f3762b;
    }

    public final AudioTrack a(int i10, c1.g gVar) {
        boolean z9;
        boolean z10;
        int i11 = this.f6702c;
        try {
            AudioTrack b10 = b(i10, gVar);
            int state = b10.getState();
            if (state == 1) {
                return b10;
            }
            try {
                b10.release();
            } catch (Exception unused) {
            }
            int i12 = this.f6704e;
            int i13 = this.f6705f;
            int i14 = this.f6707h;
            c1.v vVar = this.f6700a;
            if (i11 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            throw new u(state, i12, i13, i14, vVar, z10, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            int i15 = this.f6704e;
            int i16 = this.f6705f;
            int i17 = this.f6707h;
            c1.v vVar2 = this.f6700a;
            if (i11 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            throw new u(0, i15, i16, i17, vVar2, z9, e10);
        }
    }

    public final AudioTrack b(int i10, c1.g gVar) {
        AudioTrack.Builder offloadedPlayback;
        int i11 = f1.b0.f3799a;
        boolean z9 = this.f6711l;
        int i12 = this.f6704e;
        int i13 = this.f6706g;
        int i14 = this.f6705f;
        if (i11 >= 29) {
            AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(c(gVar, z9)).setAudioFormat(f1.b0.p(i12, i14, i13));
            boolean z10 = true;
            AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(this.f6707h).setSessionId(i10);
            if (this.f6702c != 1) {
                z10 = false;
            }
            offloadedPlayback = sessionId.setOffloadedPlayback(z10);
            return offloadedPlayback.build();
        }
        if (i11 >= 21) {
            return new AudioTrack(c(gVar, z9), f1.b0.p(i12, i14, i13), this.f6707h, 1, i10);
        }
        int B = f1.b0.B(gVar.f1698c);
        if (i10 == 0) {
            return new AudioTrack(B, this.f6704e, this.f6705f, this.f6706g, this.f6707h, 1);
        }
        return new AudioTrack(B, this.f6704e, this.f6705f, this.f6706g, this.f6707h, 1, i10);
    }
}
