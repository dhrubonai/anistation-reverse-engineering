package j1;

import android.media.MediaFormat;

/* loaded from: classes.dex */
public final class a0 implements b2.p, c2.a, c1 {

    /* renamed from: a, reason: collision with root package name */
    public b2.p f5615a;

    /* renamed from: b, reason: collision with root package name */
    public c2.a f5616b;

    /* renamed from: c, reason: collision with root package name */
    public b2.p f5617c;

    /* renamed from: d, reason: collision with root package name */
    public c2.a f5618d;

    @Override // c2.a
    public final void c(long j4, float[] fArr) {
        c2.a aVar = this.f5618d;
        if (aVar != null) {
            aVar.c(j4, fArr);
        }
        c2.a aVar2 = this.f5616b;
        if (aVar2 != null) {
            aVar2.c(j4, fArr);
        }
    }

    @Override // j1.c1
    public final void e(int i10, Object obj) {
        if (i10 != 7) {
            if (i10 != 8) {
                if (i10 == 10000) {
                    c2.k kVar = (c2.k) obj;
                    if (kVar == null) {
                        this.f5617c = null;
                        this.f5618d = null;
                        return;
                    } else {
                        this.f5617c = kVar.getVideoFrameMetadataListener();
                        this.f5618d = kVar.getCameraMotionListener();
                        return;
                    }
                }
                return;
            }
            this.f5616b = (c2.a) obj;
            return;
        }
        this.f5615a = (b2.p) obj;
    }

    @Override // c2.a
    public final void h() {
        c2.a aVar = this.f5618d;
        if (aVar != null) {
            aVar.h();
        }
        c2.a aVar2 = this.f5616b;
        if (aVar2 != null) {
            aVar2.h();
        }
    }

    @Override // b2.p
    public final void j(long j4, long j10, c1.v vVar, MediaFormat mediaFormat) {
        b2.p pVar = this.f5617c;
        if (pVar != null) {
            pVar.j(j4, j10, vVar, mediaFormat);
        }
        b2.p pVar2 = this.f5615a;
        if (pVar2 != null) {
            pVar2.j(j4, j10, vVar, mediaFormat);
        }
    }
}
