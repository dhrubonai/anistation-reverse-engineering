package defpackage;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ax {
    public boolean A;
    public long B;
    public final cn7 a;
    public final f46 b;
    public final long[] c;
    public final AudioTrack d;
    public final int e;
    public final long f;
    public final boolean g;
    public final rw h;
    public float i;
    public long j;
    public long k;
    public long l;
    public Method m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public ax(cn7 cn7Var, f46 f46Var, AudioTrack audioTrack, int i, int i2, int i3) {
        long j;
        this.a = cn7Var;
        this.b = f46Var;
        this.d = audioTrack;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.c = new long[10];
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.h = new rw(audioTrack, cn7Var);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean N = eq6.N(i);
        this.g = N;
        if (N) {
            j = eq6.c0(sampleRate, i3 / i2);
        } else {
            j = -9223372036854775807L;
        }
        this.f = j;
        this.q = 0L;
        this.r = 0L;
        this.A = false;
        this.B = 0L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.o = 0L;
        this.n = 0L;
        this.i = 1.0f;
        this.j = -9223372036854775807L;
    }

    public final long a() {
        if (this.u != -9223372036854775807L) {
            return Math.min(this.x, c());
        }
        this.b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = r4.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j = this.q;
                if (j > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j;
                        this.A = false;
                    } else {
                        this.r++;
                    }
                }
                this.q = playbackHeadPosition;
            }
            this.p = elapsedRealtime;
        }
        return this.q + this.B + (this.r << 32);
    }

    public final long b(long j) {
        long E;
        int i = this.t;
        int i2 = this.e;
        if (i == 0) {
            if (this.u != -9223372036854775807L) {
                E = eq6.c0(i2, c());
            } else {
                E = eq6.c0(i2, a());
            }
        } else {
            E = eq6.E(this.i, j + this.k);
        }
        long max = Math.max(0L, E - this.n);
        if (this.u != -9223372036854775807L) {
            return Math.min(eq6.c0(i2, this.x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.w;
        }
        this.b.getClass();
        return this.w + eq6.r(this.e, eq6.E(this.i, eq6.U(SystemClock.elapsedRealtime()) - this.u));
    }

    public final void d(long j) {
        long j2 = this.j;
        if (j2 != -9223372036854775807L && j >= j2) {
            long H = eq6.H(this.i, j - j2);
            this.b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - eq6.l0(H);
            this.j = -9223372036854775807L;
            ui3 ui3Var = ((ww) this.a.x).i;
            ui3Var.getClass();
            if (Thread.currentThread() == ((Thread) ui3Var.c)) {
                ui3Var.g(-1, new tw(currentTimeMillis));
            }
        }
    }

    public final void e() {
        this.k = 0L;
        this.t = 0;
        this.s = 0;
        this.l = 0L;
        this.y = -9223372036854775807L;
        this.z = -9223372036854775807L;
    }
}
