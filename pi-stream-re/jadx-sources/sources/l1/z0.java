package l1;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import j1.i1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import r6.n1;

/* loaded from: classes.dex */
public final class z0 extends s1.s implements j1.o0 {
    public final Context W0;
    public final androidx.appcompat.widget.a0 X0;
    public final x Y0;
    public int Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f6808a1;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f6809b1;

    /* renamed from: c1, reason: collision with root package name */
    public c1.v f6810c1;

    /* renamed from: d1, reason: collision with root package name */
    public c1.v f6811d1;

    /* renamed from: e1, reason: collision with root package name */
    public long f6812e1;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f6813f1;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f6814g1;

    /* renamed from: h1, reason: collision with root package name */
    public j1.e0 f6815h1;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f6816i1;

    public z0(Context context, s1.j jVar, s1.t tVar, boolean z9, Handler handler, s sVar, x xVar) {
        super(1, jVar, tVar, z9, 44100.0f);
        this.W0 = context.getApplicationContext();
        this.Y0 = xVar;
        this.X0 = new androidx.appcompat.widget.a0(handler, sVar);
        ((w0) xVar).f6783t = new f.p0(this);
    }

    public static n1 z0(s1.t tVar, c1.v vVar, boolean z9, x xVar) {
        boolean z10;
        s1.n nVar;
        if (vVar.f1935m == null) {
            return n1.f9497e;
        }
        if (((w0) xVar).f(vVar) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            List e10 = s1.z.e("audio/raw", false, false);
            if (e10.isEmpty()) {
                nVar = null;
            } else {
                nVar = (s1.n) e10.get(0);
            }
            if (nVar != null) {
                return r6.o0.o(nVar);
            }
        }
        return s1.z.g(tVar, vVar, z9, false);
    }

    public final void A0() {
        long j4;
        ArrayDeque arrayDeque;
        long w9;
        long j10;
        boolean b10 = b();
        w0 w0Var = (w0) this.Y0;
        if (w0Var.l() && !w0Var.O) {
            long min = Math.min(w0Var.f6769i.a(b10), f1.b0.U(w0Var.f6785v.f6704e, w0Var.h()));
            while (true) {
                arrayDeque = w0Var.f6771j;
                if (arrayDeque.isEmpty() || min < ((o0) arrayDeque.getFirst()).f6719c) {
                    break;
                } else {
                    w0Var.D = (o0) arrayDeque.remove();
                }
            }
            o0 o0Var = w0Var.D;
            long j11 = min - o0Var.f6719c;
            boolean equals = o0Var.f6717a.equals(c1.t0.f1893d);
            f.c cVar = w0Var.f6755b;
            if (equals) {
                w9 = w0Var.D.f6718b + j11;
            } else if (arrayDeque.isEmpty()) {
                d1.g gVar = (d1.g) cVar.f3637d;
                if (gVar.o >= 1024) {
                    long j12 = gVar.f3086n;
                    gVar.f3082j.getClass();
                    long j13 = j12 - ((r2.f3063k * r2.f3054b) * 2);
                    int i10 = gVar.f3080h.f3041a;
                    int i11 = gVar.f3079g.f3041a;
                    if (i10 == i11) {
                        j10 = f1.b0.V(j11, j13, gVar.o);
                    } else {
                        j10 = f1.b0.V(j11, j13 * i10, gVar.o * i11);
                    }
                } else {
                    j10 = (long) (gVar.f3075c * j11);
                }
                w9 = j10 + w0Var.D.f6718b;
            } else {
                o0 o0Var2 = (o0) arrayDeque.getFirst();
                w9 = o0Var2.f6718b - f1.b0.w(o0Var2.f6719c - min, w0Var.D.f6717a.f1894a);
            }
            long j14 = ((b1) cVar.f3636c).f6627r;
            j4 = f1.b0.U(w0Var.f6785v.f6704e, j14) + w9;
            long j15 = w0Var.f6772j0;
            if (j14 > j15) {
                long U = f1.b0.U(w0Var.f6785v.f6704e, j14 - j15);
                w0Var.f6772j0 = j14;
                w0Var.f6774k0 += U;
                if (w0Var.f6776l0 == null) {
                    w0Var.f6776l0 = new Handler(Looper.myLooper());
                }
                w0Var.f6776l0.removeCallbacksAndMessages(null);
                w0Var.f6776l0.postDelayed(new androidx.activity.b(w0Var, 7), 100L);
            }
        } else {
            j4 = Long.MIN_VALUE;
        }
        if (j4 != Long.MIN_VALUE) {
            if (!this.f6813f1) {
                j4 = Math.max(this.f6812e1, j4);
            }
            this.f6812e1 = j4;
            this.f6813f1 = false;
        }
    }

    @Override // s1.s
    public final j1.g E(s1.n nVar, c1.v vVar, c1.v vVar2) {
        boolean z9;
        j1.g b10 = nVar.b(vVar, vVar2);
        int i10 = 0;
        if (this.W == null && s0(vVar2)) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i11 = b10.f5749e;
        if (z9) {
            i11 |= 32768;
        }
        if (y0(vVar2, nVar) > this.Z0) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = nVar.f9801a;
        if (i12 == 0) {
            i10 = b10.f5748d;
        }
        return new j1.g(str, vVar, vVar2, i10, i12);
    }

    @Override // s1.s
    public final float P(float f10, c1.v[] vVarArr) {
        int i10 = -1;
        for (c1.v vVar : vVarArr) {
            int i11 = vVar.A;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f10 * i10;
    }

    @Override // s1.s
    public final ArrayList Q(s1.t tVar, c1.v vVar, boolean z9) {
        n1 z02 = z0(tVar, vVar, z9, this.Y0);
        Pattern pattern = s1.z.f9849a;
        ArrayList arrayList = new ArrayList(z02);
        Collections.sort(arrayList, new s1.u(new w.f(vVar, 12), 0));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0131  */
    @Override // s1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s1.i R(s1.n r12, c1.v r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.z0.R(s1.n, c1.v, android.media.MediaCrypto, float):s1.i");
    }

    @Override // s1.s
    public final void S(i1.h hVar) {
        c1.v vVar;
        n0 n0Var;
        if (f1.b0.f3799a >= 29 && (vVar = hVar.f5260c) != null && Objects.equals(vVar.f1935m, "audio/opus") && this.A0) {
            ByteBuffer byteBuffer = hVar.f5265y;
            byteBuffer.getClass();
            c1.v vVar2 = hVar.f5260c;
            vVar2.getClass();
            if (byteBuffer.remaining() == 8) {
                int i10 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                w0 w0Var = (w0) this.Y0;
                AudioTrack audioTrack = w0Var.f6787x;
                if (audioTrack != null && w0.m(audioTrack) && (n0Var = w0Var.f6785v) != null && n0Var.f6710k) {
                    w0Var.f6787x.setOffloadDelayPadding(vVar2.C, i10);
                }
            }
        }
    }

    @Override // s1.s
    public final void X(Exception exc) {
        f1.o.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        androidx.appcompat.widget.a0 a0Var = this.X0;
        Handler handler = (Handler) a0Var.f403b;
        if (handler != null) {
            handler.post(new l(a0Var, exc, 0));
        }
    }

    @Override // s1.s
    public final void Y(String str, long j4, long j10) {
        androidx.appcompat.widget.a0 a0Var = this.X0;
        Handler handler = (Handler) a0Var.f403b;
        if (handler != null) {
            handler.post(new o(a0Var, str, j4, j10, 0));
        }
    }

    @Override // s1.s
    public final void Z(String str) {
        androidx.appcompat.widget.a0 a0Var = this.X0;
        Handler handler = (Handler) a0Var.f403b;
        if (handler != null) {
            handler.post(new f.m0(7, a0Var, str));
        }
    }

    @Override // s1.s, j1.g1
    public final boolean a() {
        if (!((w0) this.Y0).j() && !super.a()) {
            return false;
        }
        return true;
    }

    @Override // s1.s
    public final j1.g a0(androidx.appcompat.widget.a0 a0Var) {
        c1.v vVar = (c1.v) a0Var.f404c;
        vVar.getClass();
        this.f6810c1 = vVar;
        j1.g a02 = super.a0(a0Var);
        androidx.appcompat.widget.a0 a0Var2 = this.X0;
        Handler handler = (Handler) a0Var2.f403b;
        if (handler != null) {
            handler.post(new q0.o(a0Var2, vVar, a02, 3));
        }
        return a02;
    }

    @Override // j1.e, j1.g1
    public final boolean b() {
        boolean z9;
        if (!this.N0) {
            return false;
        }
        w0 w0Var = (w0) this.Y0;
        if (w0Var.l() && (!w0Var.W || w0Var.j())) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            return false;
        }
        return true;
    }

    @Override // s1.s
    public final void b0(c1.v vVar, MediaFormat mediaFormat) {
        int i10;
        int[] iArr;
        int i11;
        c1.v vVar2 = this.f6811d1;
        boolean z9 = true;
        int[] iArr2 = null;
        if (vVar2 != null) {
            vVar = vVar2;
        } else if (this.f9819b0 != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(vVar.f1935m)) {
                i10 = vVar.B;
            } else if (f1.b0.f3799a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = f1.b0.y(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i10 = 2;
            }
            c1.u k10 = a3.g.k("audio/raw");
            k10.A = i10;
            k10.B = vVar.C;
            k10.C = vVar.D;
            k10.f1906j = vVar.f1933k;
            k10.f1897a = vVar.f1923a;
            k10.f1898b = vVar.f1924b;
            k10.d(vVar.f1925c);
            k10.f1900d = vVar.f1926d;
            k10.f1901e = vVar.f1927e;
            k10.f1902f = vVar.f1928f;
            k10.f1920y = mediaFormat.getInteger("channel-count");
            k10.f1921z = mediaFormat.getInteger("sample-rate");
            c1.v vVar3 = new c1.v(k10);
            boolean z10 = this.f6808a1;
            int i12 = vVar3.f1947z;
            if (z10 && i12 == 6 && (i11 = vVar.f1947z) < 6) {
                iArr2 = new int[i11];
                for (int i13 = 0; i13 < i11; i13++) {
                    iArr2[i13] = i13;
                }
            } else if (this.f6809b1) {
                if (i12 != 3) {
                    if (i12 != 5) {
                        if (i12 != 6) {
                            if (i12 != 7) {
                                if (i12 == 8) {
                                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                                }
                            } else {
                                iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                            }
                        } else {
                            iArr = new int[]{0, 2, 1, 5, 3, 4};
                        }
                    } else {
                        iArr = new int[]{0, 2, 1, 3, 4};
                    }
                } else {
                    iArr = new int[]{0, 2, 1};
                }
                iArr2 = iArr;
            }
            vVar = vVar3;
        }
        try {
            int i14 = f1.b0.f3799a;
            x xVar = this.Y0;
            if (i14 >= 29) {
                if (this.A0) {
                    i1 i1Var = this.f5709d;
                    i1Var.getClass();
                    if (i1Var.f5790a != 0) {
                        i1 i1Var2 = this.f5709d;
                        i1Var2.getClass();
                        int i15 = i1Var2.f5790a;
                        w0 w0Var = (w0) xVar;
                        w0Var.getClass();
                        if (i14 < 29) {
                            z9 = false;
                        }
                        w7.b.u(z9);
                        w0Var.f6775l = i15;
                    }
                }
                w0 w0Var2 = (w0) xVar;
                w0Var2.getClass();
                if (i14 < 29) {
                    z9 = false;
                }
                w7.b.u(z9);
                w0Var2.f6775l = 0;
            }
            ((w0) xVar).b(vVar, iArr2);
        } catch (t e10) {
            throw m(5001, e10.f6738a, e10, false);
        }
    }

    @Override // j1.o0
    public final boolean c() {
        boolean z9 = this.f6816i1;
        this.f6816i1 = false;
        return z9;
    }

    @Override // s1.s
    public final void c0() {
        this.Y0.getClass();
    }

    @Override // j1.e, j1.c1
    public final void e(int i10, Object obj) {
        c1.t0 t0Var;
        boolean z9;
        x xVar = this.Y0;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 6) {
                    switch (i10) {
                        case 9:
                            obj.getClass();
                            w0 w0Var = (w0) xVar;
                            w0Var.F = ((Boolean) obj).booleanValue();
                            if (w0Var.v()) {
                                t0Var = c1.t0.f1893d;
                            } else {
                                t0Var = w0Var.E;
                            }
                            w0Var.s(t0Var);
                            return;
                        case 10:
                            obj.getClass();
                            int intValue = ((Integer) obj).intValue();
                            w0 w0Var2 = (w0) xVar;
                            if (w0Var2.f6754a0 != intValue) {
                                w0Var2.f6754a0 = intValue;
                                if (intValue != 0) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                w0Var2.Z = z9;
                                w0Var2.d();
                                return;
                            }
                            return;
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            this.f6815h1 = (j1.e0) obj;
                            return;
                        case 12:
                            if (f1.b0.f3799a >= 23) {
                                y0.a(xVar, obj);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                c1.h hVar = (c1.h) obj;
                hVar.getClass();
                w0 w0Var3 = (w0) xVar;
                if (!w0Var3.f6756b0.equals(hVar)) {
                    if (w0Var3.f6787x != null) {
                        w0Var3.f6756b0.getClass();
                    }
                    w0Var3.f6756b0 = hVar;
                    return;
                }
                return;
            }
            c1.g gVar = (c1.g) obj;
            gVar.getClass();
            w0 w0Var4 = (w0) xVar;
            if (!w0Var4.B.equals(gVar)) {
                w0Var4.B = gVar;
                if (!w0Var4.f6760d0) {
                    h hVar2 = w0Var4.f6789z;
                    if (hVar2 != null) {
                        hVar2.f6668i = gVar;
                        hVar2.a(e.c(hVar2.f6660a, gVar, hVar2.f6667h));
                    }
                    w0Var4.d();
                    return;
                }
                return;
            }
            return;
        }
        obj.getClass();
        float floatValue = ((Float) obj).floatValue();
        w0 w0Var5 = (w0) xVar;
        if (w0Var5.Q != floatValue) {
            w0Var5.Q = floatValue;
            w0Var5.u();
        }
    }

    @Override // s1.s
    public final void e0() {
        ((w0) this.Y0).N = true;
    }

    @Override // j1.g1
    public final String f() {
        return "MediaCodecAudioRenderer";
    }

    @Override // j1.o0
    public final c1.t0 h() {
        return ((w0) this.Y0).E;
    }

    @Override // j1.e, j1.g1
    public final j1.o0 i() {
        return this;
    }

    @Override // s1.s
    public final boolean i0(long j4, long j10, s1.k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z9, boolean z10, c1.v vVar) {
        int i13;
        int i14;
        byteBuffer.getClass();
        if (this.f6811d1 != null && (i11 & 2) != 0) {
            kVar.getClass();
            kVar.g(i10, false);
            return true;
        }
        x xVar = this.Y0;
        if (z9) {
            if (kVar != null) {
                kVar.g(i10, false);
            }
            this.R0.f5724f += i12;
            ((w0) xVar).N = true;
            return true;
        }
        try {
            if (!((w0) xVar).i(byteBuffer, j11, i12)) {
                return false;
            }
            if (kVar != null) {
                kVar.g(i10, false);
            }
            this.R0.f5723e += i12;
            return true;
        } catch (u e10) {
            c1.v vVar2 = this.f6810c1;
            if (this.A0) {
                i1 i1Var = this.f5709d;
                i1Var.getClass();
                if (i1Var.f5790a != 0) {
                    i14 = 5004;
                    throw m(i14, vVar2, e10, e10.f6742b);
                }
            }
            i14 = 5001;
            throw m(i14, vVar2, e10, e10.f6742b);
        } catch (w e11) {
            if (this.A0) {
                i1 i1Var2 = this.f5709d;
                i1Var2.getClass();
                if (i1Var2.f5790a != 0) {
                    i13 = 5003;
                    throw m(i13, vVar, e11, e11.f6748b);
                }
            }
            i13 = 5002;
            throw m(i13, vVar, e11, e11.f6748b);
        }
    }

    @Override // j1.o0
    public final void j(c1.t0 t0Var) {
        w0 w0Var = (w0) this.Y0;
        w0Var.getClass();
        w0Var.E = new c1.t0(f1.b0.g(t0Var.f1894a, 0.1f, 8.0f), f1.b0.g(t0Var.f1895b, 0.1f, 8.0f));
        if (w0Var.v()) {
            w0Var.t();
        } else {
            w0Var.s(t0Var);
        }
    }

    @Override // j1.o0
    public final long k() {
        if (this.f5713y == 2) {
            A0();
        }
        return this.f6812e1;
    }

    @Override // s1.s
    public final void l0() {
        int i10;
        try {
            w0 w0Var = (w0) this.Y0;
            if (!w0Var.W && w0Var.l() && w0Var.c()) {
                w0Var.p();
                w0Var.W = true;
            }
        } catch (w e10) {
            if (this.A0) {
                i10 = 5003;
            } else {
                i10 = 5002;
            }
            throw m(i10, e10.f6749c, e10, e10.f6748b);
        }
    }

    @Override // s1.s, j1.e
    public final void p() {
        androidx.appcompat.widget.a0 a0Var = this.X0;
        this.f6814g1 = true;
        this.f6810c1 = null;
        try {
            ((w0) this.Y0).d();
            try {
                super.p();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.p();
                throw th;
            } finally {
            }
        }
    }

    @Override // j1.e
    public final void q(boolean z9, boolean z10) {
        j1.f fVar = new j1.f();
        this.R0 = fVar;
        androidx.appcompat.widget.a0 a0Var = this.X0;
        Handler handler = (Handler) a0Var.f403b;
        int i10 = 1;
        if (handler != null) {
            handler.post(new m(a0Var, fVar, i10));
        }
        i1 i1Var = this.f5709d;
        i1Var.getClass();
        boolean z11 = i1Var.f5791b;
        boolean z12 = false;
        x xVar = this.Y0;
        if (z11) {
            w0 w0Var = (w0) xVar;
            w0Var.getClass();
            if (f1.b0.f3799a >= 21) {
                z12 = true;
            }
            w7.b.u(z12);
            w7.b.u(w0Var.Z);
            if (!w0Var.f6760d0) {
                w0Var.f6760d0 = true;
                w0Var.d();
            }
        } else {
            w0 w0Var2 = (w0) xVar;
            if (w0Var2.f6760d0) {
                w0Var2.f6760d0 = false;
                w0Var2.d();
            }
        }
        k1.i0 i0Var = this.f5711f;
        i0Var.getClass();
        w0 w0Var3 = (w0) xVar;
        w0Var3.f6782s = i0Var;
        f1.a aVar = this.f5712x;
        aVar.getClass();
        w0Var3.f6769i.J = aVar;
    }

    @Override // s1.s, j1.e
    public final void s(long j4, boolean z9) {
        super.s(j4, z9);
        ((w0) this.Y0).d();
        this.f6812e1 = j4;
        this.f6816i1 = false;
        this.f6813f1 = true;
    }

    @Override // s1.s
    public final boolean s0(c1.v vVar) {
        i1 i1Var = this.f5709d;
        i1Var.getClass();
        if (i1Var.f5790a != 0) {
            int x02 = x0(vVar);
            if ((x02 & 512) != 0) {
                i1 i1Var2 = this.f5709d;
                i1Var2.getClass();
                if (i1Var2.f5790a == 2 || (x02 & 1024) != 0 || (vVar.C == 0 && vVar.D == 0)) {
                    return true;
                }
            }
        }
        if (((w0) this.Y0).f(vVar) != 0) {
            return true;
        }
        return false;
    }

    @Override // j1.e
    public final void t() {
        j1.c0 c0Var;
        h hVar = ((w0) this.Y0).f6789z;
        if (hVar != null && hVar.f6669j) {
            hVar.f6666g = null;
            int i10 = f1.b0.f3799a;
            Context context = hVar.f6660a;
            if (i10 >= 23 && (c0Var = hVar.f6663d) != null) {
                f.b(context, c0Var);
            }
            f.c0 c0Var2 = hVar.f6664e;
            if (c0Var2 != null) {
                context.unregisterReceiver(c0Var2);
            }
            g gVar = hVar.f6665f;
            if (gVar != null) {
                gVar.f6651a.unregisterContentObserver(gVar);
            }
            hVar.f6669j = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r4 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0099  */
    @Override // s1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int t0(s1.t r12, c1.v r13) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.z0.t0(s1.t, c1.v):int");
    }

    @Override // j1.e
    public final void u() {
        x xVar = this.Y0;
        this.f6816i1 = false;
        try {
            try {
                G();
                k0();
                o1.k kVar = this.W;
                if (kVar != null) {
                    kVar.a(null);
                }
                this.W = null;
            } catch (Throwable th) {
                o1.k kVar2 = this.W;
                if (kVar2 != null) {
                    kVar2.a(null);
                }
                this.W = null;
                throw th;
            }
        } finally {
            if (this.f6814g1) {
                this.f6814g1 = false;
                ((w0) xVar).r();
            }
        }
    }

    @Override // j1.e
    public final void v() {
        ((w0) this.Y0).o();
    }

    @Override // j1.e
    public final void w() {
        A0();
        w0 w0Var = (w0) this.Y0;
        boolean z9 = false;
        w0Var.Y = false;
        if (w0Var.l()) {
            a0 a0Var = w0Var.f6769i;
            a0Var.d();
            if (a0Var.f6610y == -9223372036854775807L) {
                z zVar = a0Var.f6592f;
                zVar.getClass();
                zVar.a();
                z9 = true;
            } else {
                a0Var.A = a0Var.b();
            }
            if (z9 || w0.m(w0Var.f6787x)) {
                w0Var.f6787x.pause();
            }
        }
    }

    public final int x0(c1.v vVar) {
        int i10;
        k e10 = ((w0) this.Y0).e(vVar);
        if (!e10.f6679a) {
            return 0;
        }
        if (e10.f6680b) {
            i10 = 1536;
        } else {
            i10 = 512;
        }
        if (e10.f6681c) {
            return i10 | 2048;
        }
        return i10;
    }

    public final int y0(c1.v vVar, s1.n nVar) {
        int i10;
        if ("OMX.google.raw.decoder".equals(nVar.f9801a) && (i10 = f1.b0.f3799a) < 24 && (i10 != 23 || !f1.b0.N(this.W0))) {
            return -1;
        }
        return vVar.f1936n;
    }
}
