package j1;

/* loaded from: classes.dex */
public final class i implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final z1.d f5777a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5778b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5779c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5780d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5781e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5782f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5783g;

    /* renamed from: h, reason: collision with root package name */
    public int f5784h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5785i;

    public i() {
        z1.d dVar = new z1.d();
        a("bufferForPlaybackMs", 2500, 0, "0");
        a("bufferForPlaybackAfterRebufferMs", 5000, 0, "0");
        a("minBufferMs", 50000, 2500, "bufferForPlaybackMs");
        a("minBufferMs", 50000, 5000, "bufferForPlaybackAfterRebufferMs");
        a("maxBufferMs", 50000, 50000, "minBufferMs");
        a("backBufferDurationMs", 0, 0, "0");
        this.f5777a = dVar;
        long j4 = 50000;
        this.f5778b = f1.b0.O(j4);
        this.f5779c = f1.b0.O(j4);
        this.f5780d = f1.b0.O(2500);
        this.f5781e = f1.b0.O(5000);
        this.f5782f = -1;
        this.f5784h = 13107200;
        this.f5783g = f1.b0.O(0);
    }

    public static void a(String str, int i10, int i11, String str2) {
        boolean z9;
        if (i10 >= i11) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.f(str + " cannot be less than " + str2, z9);
    }

    public final void b(boolean z9) {
        int i10 = this.f5782f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f5784h = i10;
        this.f5785i = false;
        if (z9) {
            z1.d dVar = this.f5777a;
            synchronized (dVar) {
                if (dVar.f11893a) {
                    dVar.a(0);
                }
            }
        }
    }

    public final boolean c(float f10, long j4) {
        int i10;
        boolean z9;
        z1.d dVar = this.f5777a;
        synchronized (dVar) {
            i10 = dVar.f11896d * dVar.f11894b;
        }
        if (i10 >= this.f5784h) {
            z9 = true;
        } else {
            z9 = false;
        }
        long j10 = this.f5779c;
        long j11 = this.f5778b;
        if (f10 > 1.0f) {
            j11 = Math.min(f1.b0.w(j11, f10), j10);
        }
        if (j4 < Math.max(j11, 500000L)) {
            boolean z10 = !z9;
            this.f5785i = z10;
            if (!z10 && j4 < 500000) {
                f1.o.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j4 >= j10 || z9) {
            this.f5785i = false;
        }
        return this.f5785i;
    }
}
