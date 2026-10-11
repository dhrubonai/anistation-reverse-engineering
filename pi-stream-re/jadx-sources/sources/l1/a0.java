package l1;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class a0 {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;
    public boolean H;
    public long I;
    public f1.a J;

    /* renamed from: a, reason: collision with root package name */
    public final s0 f6587a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f6588b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f6589c;

    /* renamed from: d, reason: collision with root package name */
    public int f6590d;

    /* renamed from: e, reason: collision with root package name */
    public int f6591e;

    /* renamed from: f, reason: collision with root package name */
    public z f6592f;

    /* renamed from: g, reason: collision with root package name */
    public int f6593g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6594h;

    /* renamed from: i, reason: collision with root package name */
    public long f6595i;

    /* renamed from: j, reason: collision with root package name */
    public float f6596j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6597k;

    /* renamed from: l, reason: collision with root package name */
    public long f6598l;

    /* renamed from: m, reason: collision with root package name */
    public long f6599m;

    /* renamed from: n, reason: collision with root package name */
    public Method f6600n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6601p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6602q;

    /* renamed from: r, reason: collision with root package name */
    public long f6603r;

    /* renamed from: s, reason: collision with root package name */
    public long f6604s;

    /* renamed from: t, reason: collision with root package name */
    public long f6605t;

    /* renamed from: u, reason: collision with root package name */
    public long f6606u;

    /* renamed from: v, reason: collision with root package name */
    public long f6607v;

    /* renamed from: w, reason: collision with root package name */
    public int f6608w;

    /* renamed from: x, reason: collision with root package name */
    public int f6609x;

    /* renamed from: y, reason: collision with root package name */
    public long f6610y;

    /* renamed from: z, reason: collision with root package name */
    public long f6611z;

    public a0(s0 s0Var) {
        this.f6587a = s0Var;
        if (f1.b0.f3799a >= 18) {
            try {
                this.f6600n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f6588b = new long[10];
        this.J = f1.a.f3794a;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0226 A[Catch: Exception -> 0x0240, TRY_LEAVE, TryCatch #0 {Exception -> 0x0240, blocks: (B:49:0x0200, B:51:0x0226), top: B:48:0x0200 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(boolean r32) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.a0.a(boolean):long");
    }

    public final long b() {
        ((f1.v) this.J).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f6610y != -9223372036854775807L) {
            AudioTrack audioTrack = this.f6589c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.A;
            }
            return Math.min(this.B, this.A + f1.b0.X(f1.b0.w(f1.b0.O(elapsedRealtime) - this.f6610y, this.f6596j), this.f6593g, 1000000L, RoundingMode.CEILING));
        }
        if (elapsedRealtime - this.f6604s >= 5) {
            AudioTrack audioTrack2 = this.f6589c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                if (this.f6594h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f6607v = this.f6605t;
                    }
                    playbackHeadPosition += this.f6607v;
                }
                if (f1.b0.f3799a <= 29) {
                    if (playbackHeadPosition == 0 && this.f6605t > 0 && playState == 3) {
                        if (this.f6611z == -9223372036854775807L) {
                            this.f6611z = elapsedRealtime;
                        }
                    } else {
                        this.f6611z = -9223372036854775807L;
                    }
                }
                long j4 = this.f6605t;
                if (j4 > playbackHeadPosition) {
                    if (this.H) {
                        this.I += j4;
                        this.H = false;
                    } else {
                        this.f6606u++;
                    }
                }
                this.f6605t = playbackHeadPosition;
            }
            this.f6604s = elapsedRealtime;
        }
        return this.f6605t + this.I + (this.f6606u << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(long r9) {
        /*
            r8 = this;
            r0 = 0
            long r1 = r8.a(r0)
            int r3 = r8.f6593g
            int r4 = f1.b0.f3799a
            long r3 = (long) r3
            r5 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r7 = java.math.RoundingMode.CEILING
            long r1 = f1.b0.X(r1, r3, r5, r7)
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r10 = 1
            if (r9 > 0) goto L37
            boolean r9 = r8.f6594h
            if (r9 == 0) goto L34
            android.media.AudioTrack r9 = r8.f6589c
            r9.getClass()
            int r9 = r9.getPlayState()
            r1 = 2
            if (r9 != r1) goto L34
            long r1 = r8.b()
            r3 = 0
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 != 0) goto L34
            r9 = r10
            goto L35
        L34:
            r9 = r0
        L35:
            if (r9 == 0) goto L38
        L37:
            r0 = r10
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.a0.c(long):boolean");
    }

    public final void d() {
        this.f6598l = 0L;
        this.f6609x = 0;
        this.f6608w = 0;
        this.f6599m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.f6597k = false;
    }
}
