package l1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import r6.n1;

/* loaded from: classes.dex */
public final class w0 implements x {

    /* renamed from: m0, reason: collision with root package name */
    public static final Object f6750m0 = new Object();

    /* renamed from: n0, reason: collision with root package name */
    public static ExecutorService f6751n0;

    /* renamed from: o0, reason: collision with root package name */
    public static int f6752o0;
    public q0 A;
    public c1.g B;
    public o0 C;
    public o0 D;
    public c1.t0 E;
    public boolean F;
    public ByteBuffer G;
    public int H;
    public long I;
    public long J;
    public long K;
    public long L;
    public int M;
    public boolean N;
    public boolean O;
    public long P;
    public float Q;
    public ByteBuffer R;
    public int S;
    public ByteBuffer T;
    public byte[] U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6753a;

    /* renamed from: a0, reason: collision with root package name */
    public int f6754a0;

    /* renamed from: b, reason: collision with root package name */
    public final f.c f6755b;

    /* renamed from: b0, reason: collision with root package name */
    public c1.h f6756b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6757c;

    /* renamed from: c0, reason: collision with root package name */
    public i f6758c0;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f6759d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f6760d0;

    /* renamed from: e, reason: collision with root package name */
    public final d1 f6761e;

    /* renamed from: e0, reason: collision with root package name */
    public long f6762e0;

    /* renamed from: f, reason: collision with root package name */
    public final n1 f6763f;

    /* renamed from: f0, reason: collision with root package name */
    public long f6764f0;

    /* renamed from: g, reason: collision with root package name */
    public final n1 f6765g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f6766g0;

    /* renamed from: h, reason: collision with root package name */
    public final c1.r f6767h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f6768h0;

    /* renamed from: i, reason: collision with root package name */
    public final a0 f6769i;

    /* renamed from: i0, reason: collision with root package name */
    public Looper f6770i0;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque f6771j;

    /* renamed from: j0, reason: collision with root package name */
    public long f6772j0;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f6773k;

    /* renamed from: k0, reason: collision with root package name */
    public long f6774k0;

    /* renamed from: l, reason: collision with root package name */
    public int f6775l;

    /* renamed from: l0, reason: collision with root package name */
    public Handler f6776l0;

    /* renamed from: m, reason: collision with root package name */
    public v0 f6777m;

    /* renamed from: n, reason: collision with root package name */
    public final r0 f6778n;
    public final r0 o;

    /* renamed from: p, reason: collision with root package name */
    public final l0 f6779p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f6780q;

    /* renamed from: r, reason: collision with root package name */
    public final j1.z f6781r;

    /* renamed from: s, reason: collision with root package name */
    public k1.i0 f6782s;

    /* renamed from: t, reason: collision with root package name */
    public f.p0 f6783t;

    /* renamed from: u, reason: collision with root package name */
    public n0 f6784u;

    /* renamed from: v, reason: collision with root package name */
    public n0 f6785v;

    /* renamed from: w, reason: collision with root package name */
    public d1.a f6786w;

    /* renamed from: x, reason: collision with root package name */
    public AudioTrack f6787x;

    /* renamed from: y, reason: collision with root package name */
    public e f6788y;

    /* renamed from: z, reason: collision with root package name */
    public h f6789z;

    public w0(m0 m0Var) {
        e eVar;
        boolean z9;
        boolean z10;
        Context context = (Context) m0Var.f6692d;
        this.f6753a = context;
        c1.g gVar = c1.g.f1695g;
        this.B = gVar;
        if (context != null) {
            e eVar2 = e.f6644c;
            int i10 = f1.b0.f3799a;
            eVar = e.c(context, gVar, null);
        } else {
            eVar = (e) m0Var.f6693e;
        }
        this.f6788y = eVar;
        this.f6755b = (f.c) m0Var.f6694f;
        int i11 = f1.b0.f3799a;
        if (i11 >= 21 && m0Var.f6689a) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f6757c = z9;
        if (i11 >= 23 && m0Var.f6690b) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f6773k = z10;
        this.f6775l = 0;
        this.f6779p = (l0) m0Var.f6695g;
        e0 e0Var = (e0) m0Var.f6696h;
        e0Var.getClass();
        this.f6780q = e0Var;
        c1.r rVar = new c1.r();
        this.f6767h = rVar;
        rVar.e();
        this.f6769i = new a0(new s0(this));
        b0 b0Var = new b0();
        this.f6759d = b0Var;
        d1 d1Var = new d1();
        this.f6761e = d1Var;
        d1.h hVar = new d1.h();
        r6.m0 m0Var2 = r6.o0.f9505b;
        Object[] objArr = {hVar, b0Var, d1Var};
        r6.h0.o(3, objArr);
        this.f6763f = r6.o0.h(3, objArr);
        this.f6765g = r6.o0.o(new c1());
        this.Q = 1.0f;
        this.f6754a0 = 0;
        this.f6756b0 = new c1.h();
        c1.t0 t0Var = c1.t0.f1893d;
        this.D = new o0(t0Var, 0L, 0L);
        this.E = t0Var;
        this.F = false;
        this.f6771j = new ArrayDeque();
        this.f6778n = new r0();
        this.o = new r0();
        this.f6781r = (j1.z) m0Var.f6697i;
    }

    public static boolean m(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (f1.b0.f3799a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        if (r1 != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r18) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.w0.a(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e0, code lost:
    
        if (r14 < 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ce, code lost:
    
        if ((r2 & r13) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d3, code lost:
    
        if (r16 > 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d8, code lost:
    
        if (r14 > 0) goto L119;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:75:0x01a2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(c1.v r28, int[] r29) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.w0.b(c1.v, int[]):void");
    }

    public final boolean c() {
        if (!this.f6786w.d()) {
            ByteBuffer byteBuffer = this.T;
            if (byteBuffer == null) {
                return true;
            }
            w(byteBuffer, Long.MIN_VALUE);
            if (this.T != null) {
                return false;
            }
            return true;
        }
        d1.a aVar = this.f6786w;
        if (aVar.d() && !aVar.f3039d) {
            aVar.f3039d = true;
            ((d1.d) aVar.f3037b.get(0)).h();
        }
        q(Long.MIN_VALUE);
        if (!this.f6786w.c()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.T;
        if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
            return false;
        }
        return true;
    }

    public final void d() {
        boolean z9;
        q0 q0Var;
        if (l()) {
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.L = 0L;
            this.f6768h0 = false;
            this.M = 0;
            this.D = new o0(this.E, 0L, 0L);
            this.P = 0L;
            this.C = null;
            this.f6771j.clear();
            this.R = null;
            this.S = 0;
            this.T = null;
            this.X = false;
            this.W = false;
            this.G = null;
            this.H = 0;
            this.f6761e.o = 0L;
            d1.a aVar = this.f6785v.f6708i;
            this.f6786w = aVar;
            aVar.b();
            AudioTrack audioTrack = this.f6769i.f6589c;
            audioTrack.getClass();
            int i10 = 1;
            if (audioTrack.getPlayState() == 3) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                this.f6787x.pause();
            }
            if (m(this.f6787x)) {
                v0 v0Var = this.f6777m;
                v0Var.getClass();
                v0Var.b(this.f6787x);
            }
            int i11 = f1.b0.f3799a;
            if (i11 < 21 && !this.Z) {
                this.f6754a0 = 0;
            }
            this.f6785v.getClass();
            androidx.lifecycle.q0 q0Var2 = new androidx.lifecycle.q0();
            n0 n0Var = this.f6784u;
            if (n0Var != null) {
                this.f6785v = n0Var;
                this.f6784u = null;
            }
            a0 a0Var = this.f6769i;
            a0Var.d();
            a0Var.f6589c = null;
            a0Var.f6592f = null;
            if (i11 >= 24 && (q0Var = this.A) != null) {
                q0Var.c();
                this.A = null;
            }
            AudioTrack audioTrack2 = this.f6787x;
            c1.r rVar = this.f6767h;
            f.p0 p0Var = this.f6783t;
            rVar.c();
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f6750m0) {
                try {
                    if (f6751n0 == null) {
                        f6751n0 = Executors.newSingleThreadExecutor(new q0.a("ExoPlayer:AudioTrackReleaseThread", i10));
                    }
                    f6752o0++;
                    f6751n0.execute(new g0(audioTrack2, p0Var, handler, q0Var2, rVar, 0));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f6787x = null;
        }
        this.o.f6735a = null;
        this.f6778n.f6735a = null;
        this.f6772j0 = 0L;
        this.f6774k0 = 0L;
        Handler handler2 = this.f6776l0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final k e(c1.v vVar) {
        int i10;
        boolean booleanValue;
        boolean z9;
        if (this.f6766g0) {
            return k.f6678d;
        }
        c1.g gVar = this.B;
        e0 e0Var = this.f6780q;
        e0Var.getClass();
        vVar.getClass();
        gVar.getClass();
        int i11 = f1.b0.f3799a;
        if (i11 >= 29 && (i10 = vVar.A) != -1) {
            Boolean bool = e0Var.f6650b;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                Context context = e0Var.f6649a;
                if (context != null) {
                    AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                    if (audioManager != null) {
                        String parameters = audioManager.getParameters("offloadVariableRateSupported");
                        if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        e0Var.f6650b = Boolean.valueOf(z9);
                    } else {
                        e0Var.f6650b = Boolean.FALSE;
                    }
                } else {
                    e0Var.f6650b = Boolean.FALSE;
                }
                booleanValue = e0Var.f6650b.booleanValue();
            }
            String str = vVar.f1935m;
            str.getClass();
            int d10 = c1.q0.d(str, vVar.f1932j);
            if (d10 != 0 && i11 >= f1.b0.o(d10)) {
                int q9 = f1.b0.q(vVar.f1947z);
                if (q9 == 0) {
                    return k.f6678d;
                }
                try {
                    AudioFormat p3 = f1.b0.p(i10, q9, d10);
                    if (i11 >= 31) {
                        return d0.a(p3, (AudioAttributes) gVar.a().f3762b, booleanValue);
                    }
                    return c0.a(p3, (AudioAttributes) gVar.a().f3762b, booleanValue);
                } catch (IllegalArgumentException unused) {
                    return k.f6678d;
                }
            }
            return k.f6678d;
        }
        return k.f6678d;
    }

    public final int f(c1.v vVar) {
        n();
        boolean z9 = true;
        if ("audio/raw".equals(vVar.f1935m)) {
            int i10 = vVar.B;
            if (!f1.b0.K(i10)) {
                f1.o.f("DefaultAudioSink", "Invalid PCM encoding: " + i10);
                return 0;
            }
            if (i10 != 2 && (!this.f6757c || i10 != 4)) {
                return 1;
            }
            return 2;
        }
        if (this.f6788y.d(this.B, vVar) == null) {
            z9 = false;
        }
        if (z9) {
            return 2;
        }
        return 0;
    }

    public final long g() {
        if (this.f6785v.f6702c == 0) {
            return this.I / r0.f6701b;
        }
        return this.J;
    }

    public final long h() {
        n0 n0Var = this.f6785v;
        if (n0Var.f6702c == 0) {
            long j4 = this.K;
            long j10 = n0Var.f6703d;
            int i10 = f1.b0.f3799a;
            return ((j4 + j10) - 1) / j10;
        }
        return this.L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x00ff, code lost:
    
        if (r10.b() == 0) goto L71;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x0177. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x045f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0384 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(java.nio.ByteBuffer r25, long r26, int r28) {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.w0.i(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean j() {
        if (l() && this.f6769i.c(h())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k() {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.w0.k():boolean");
    }

    public final boolean l() {
        if (this.f6787x != null) {
            return true;
        }
        return false;
    }

    public final void n() {
        Context context;
        e b10;
        j1.c0 c0Var;
        if (this.f6789z == null && (context = this.f6753a) != null) {
            this.f6770i0 = Looper.myLooper();
            h hVar = new h(context, new h0(this), this.B, this.f6758c0);
            this.f6789z = hVar;
            if (hVar.f6669j) {
                b10 = hVar.f6666g;
                b10.getClass();
            } else {
                hVar.f6669j = true;
                g gVar = hVar.f6665f;
                if (gVar != null) {
                    gVar.f6651a.registerContentObserver(gVar.f6652b, false, gVar);
                }
                int i10 = f1.b0.f3799a;
                Handler handler = hVar.f6662c;
                Context context2 = hVar.f6660a;
                if (i10 >= 23 && (c0Var = hVar.f6663d) != null) {
                    f.a(context2, c0Var, handler);
                }
                f.c0 c0Var2 = hVar.f6664e;
                Intent intent = null;
                if (c0Var2 != null) {
                    intent = context2.registerReceiver(c0Var2, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler);
                }
                b10 = e.b(context2, intent, hVar.f6668i, hVar.f6667h);
                hVar.f6666g = b10;
            }
            this.f6788y = b10;
        }
    }

    public final void o() {
        this.Y = true;
        if (l()) {
            a0 a0Var = this.f6769i;
            if (a0Var.f6610y != -9223372036854775807L) {
                ((f1.v) a0Var.J).getClass();
                a0Var.f6610y = f1.b0.O(SystemClock.elapsedRealtime());
            }
            z zVar = a0Var.f6592f;
            zVar.getClass();
            zVar.a();
            this.f6787x.play();
        }
    }

    public final void p() {
        if (!this.X) {
            this.X = true;
            long h10 = h();
            a0 a0Var = this.f6769i;
            a0Var.A = a0Var.b();
            ((f1.v) a0Var.J).getClass();
            a0Var.f6610y = f1.b0.O(SystemClock.elapsedRealtime());
            a0Var.B = h10;
            this.f6787x.stop();
            this.H = 0;
        }
    }

    public final void q(long j4) {
        ByteBuffer byteBuffer;
        if (!this.f6786w.d()) {
            ByteBuffer byteBuffer2 = this.R;
            if (byteBuffer2 == null) {
                byteBuffer2 = d1.d.f3045a;
            }
            w(byteBuffer2, j4);
            return;
        }
        while (!this.f6786w.c()) {
            do {
                d1.a aVar = this.f6786w;
                if (!aVar.d()) {
                    byteBuffer = d1.d.f3045a;
                } else {
                    ByteBuffer byteBuffer3 = aVar.f3038c[r1.length - 1];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        aVar.e(d1.d.f3045a);
                        byteBuffer = aVar.f3038c[r0.length - 1];
                    }
                }
                if (byteBuffer.hasRemaining()) {
                    w(byteBuffer, j4);
                } else {
                    ByteBuffer byteBuffer4 = this.R;
                    if (byteBuffer4 != null && byteBuffer4.hasRemaining()) {
                        d1.a aVar2 = this.f6786w;
                        ByteBuffer byteBuffer5 = this.R;
                        if (aVar2.d() && !aVar2.f3039d) {
                            aVar2.e(byteBuffer5);
                        }
                    } else {
                        return;
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    public final void r() {
        d();
        r6.m0 listIterator = this.f6763f.listIterator(0);
        while (listIterator.hasNext()) {
            ((d1.d) listIterator.next()).f();
        }
        r6.m0 listIterator2 = this.f6765g.listIterator(0);
        while (listIterator2.hasNext()) {
            ((d1.d) listIterator2.next()).f();
        }
        d1.a aVar = this.f6786w;
        if (aVar != null) {
            aVar.f();
        }
        this.Y = false;
        this.f6766g0 = false;
    }

    public final void s(c1.t0 t0Var) {
        o0 o0Var = new o0(t0Var, -9223372036854775807L, -9223372036854775807L);
        if (l()) {
            this.C = o0Var;
        } else {
            this.D = o0Var;
        }
    }

    public final void t() {
        if (l()) {
            try {
                this.f6787x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.E.f1894a).setPitch(this.E.f1895b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                f1.o.g("DefaultAudioSink", "Failed to set playback params", e10);
            }
            c1.t0 t0Var = new c1.t0(this.f6787x.getPlaybackParams().getSpeed(), this.f6787x.getPlaybackParams().getPitch());
            this.E = t0Var;
            a0 a0Var = this.f6769i;
            a0Var.f6596j = t0Var.f1894a;
            z zVar = a0Var.f6592f;
            if (zVar != null) {
                zVar.a();
            }
            a0Var.d();
        }
    }

    public final void u() {
        if (l()) {
            if (f1.b0.f3799a >= 21) {
                this.f6787x.setVolume(this.Q);
                return;
            }
            AudioTrack audioTrack = this.f6787x;
            float f10 = this.Q;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    public final boolean v() {
        n0 n0Var = this.f6785v;
        if (n0Var != null && n0Var.f6709j && f1.b0.f3799a >= 23) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x00eb, code lost:
    
        if (r15 < r14) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.nio.ByteBuffer r13, long r14) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.w0.w(java.nio.ByteBuffer, long):void");
    }
}
