package l1;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final y f6802a;

    /* renamed from: b, reason: collision with root package name */
    public int f6803b;

    /* renamed from: c, reason: collision with root package name */
    public long f6804c;

    /* renamed from: d, reason: collision with root package name */
    public long f6805d;

    /* renamed from: e, reason: collision with root package name */
    public long f6806e;

    /* renamed from: f, reason: collision with root package name */
    public long f6807f;

    public z(AudioTrack audioTrack) {
        if (f1.b0.f3799a >= 19) {
            this.f6802a = new y(audioTrack);
            a();
        } else {
            this.f6802a = null;
            b(3);
        }
    }

    public final void a() {
        if (this.f6802a != null) {
            b(0);
        }
    }

    public final void b(int i10) {
        this.f6803b = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f6805d = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f6805d = 10000000L;
                return;
            }
            this.f6805d = 10000L;
            return;
        }
        this.f6806e = 0L;
        this.f6807f = -1L;
        this.f6804c = System.nanoTime() / 1000;
        this.f6805d = 10000L;
    }
}
