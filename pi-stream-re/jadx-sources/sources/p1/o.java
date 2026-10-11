package p1;

import android.net.Uri;
import android.os.Looper;
import androidx.appcompat.widget.a0;
import androidx.lifecycle.q0;
import c1.d0;
import c1.e0;
import c1.f0;
import c1.k0;
import c1.l0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import k1.i0;
import r6.o0;
import v1.b0;
import v1.z0;

/* loaded from: classes.dex */
public final class o extends v1.a implements q1.r {

    /* renamed from: h, reason: collision with root package name */
    public final k f8473h;

    /* renamed from: i, reason: collision with root package name */
    public final c f8474i;

    /* renamed from: j, reason: collision with root package name */
    public final j6.e f8475j;

    /* renamed from: k, reason: collision with root package name */
    public final o1.q f8476k;

    /* renamed from: l, reason: collision with root package name */
    public final q0 f8477l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f8478m;

    /* renamed from: n, reason: collision with root package name */
    public final int f8479n;

    /* renamed from: p, reason: collision with root package name */
    public final q1.s f8480p;

    /* renamed from: q, reason: collision with root package name */
    public final long f8481q;

    /* renamed from: s, reason: collision with root package name */
    public e0 f8483s;

    /* renamed from: t, reason: collision with root package name */
    public h1.e0 f8484t;

    /* renamed from: u, reason: collision with root package name */
    public k0 f8485u;
    public final boolean o = false;

    /* renamed from: r, reason: collision with root package name */
    public final long f8482r = 0;

    static {
        l0.a("media3.exoplayer.hls");
    }

    public o(k0 k0Var, c cVar, d dVar, j6.e eVar, o1.q qVar, q0 q0Var, q1.c cVar2, long j4, boolean z9, int i10) {
        this.f8485u = k0Var;
        this.f8483s = k0Var.f1770c;
        this.f8474i = cVar;
        this.f8473h = dVar;
        this.f8475j = eVar;
        this.f8476k = qVar;
        this.f8477l = q0Var;
        this.f8480p = cVar2;
        this.f8481q = j4;
        this.f8478m = z9;
        this.f8479n = i10;
    }

    public static q1.d t(long j4, o0 o0Var) {
        q1.d dVar = null;
        for (int i10 = 0; i10 < o0Var.size(); i10++) {
            q1.d dVar2 = (q1.d) o0Var.get(i10);
            long j10 = dVar2.f8998e;
            if (j10 <= j4 && dVar2.C) {
                dVar = dVar2;
            } else if (j10 > j4) {
                break;
            }
        }
        return dVar;
    }

    @Override // v1.a
    public final v1.u b(v1.w wVar, z1.d dVar, long j4) {
        b0 a10 = a(wVar);
        o1.n nVar = new o1.n(this.f10356d.f8164c, 0, wVar);
        k kVar = this.f8473h;
        q1.s sVar = this.f8480p;
        c cVar = this.f8474i;
        h1.e0 e0Var = this.f8484t;
        o1.q qVar = this.f8476k;
        q0 q0Var = this.f8477l;
        j6.e eVar = this.f8475j;
        boolean z9 = this.f8478m;
        int i10 = this.f8479n;
        boolean z10 = this.o;
        i0 i0Var = this.f10359g;
        w7.b.w(i0Var);
        return new n(kVar, sVar, cVar, e0Var, qVar, nVar, q0Var, a10, dVar, eVar, z9, i10, z10, i0Var, this.f8482r);
    }

    @Override // v1.a
    public final synchronized k0 h() {
        return this.f8485u;
    }

    @Override // v1.a
    public final void j() {
        q1.c cVar = (q1.c) this.f8480p;
        z1.o oVar = cVar.f8988x;
        if (oVar != null) {
            oVar.b();
        }
        Uri uri = cVar.B;
        if (uri != null) {
            q1.b bVar = (q1.b) cVar.f8985d.get(uri);
            bVar.f8974b.b();
            IOException iOException = bVar.A;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // v1.a
    public final void l(h1.e0 e0Var) {
        boolean z9;
        this.f8484t = e0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        i0 i0Var = this.f10359g;
        w7.b.w(i0Var);
        o1.q qVar = this.f8476k;
        qVar.d(myLooper, i0Var);
        qVar.k();
        b0 a10 = a(null);
        f0 f0Var = h().f1769b;
        f0Var.getClass();
        q1.c cVar = (q1.c) this.f8480p;
        cVar.getClass();
        cVar.f8989y = f1.b0.l(null);
        cVar.f8987f = a10;
        cVar.f8990z = this;
        z1.r rVar = new z1.r(cVar.f8982a.f8429a.a(), f0Var.f1682a, 4, cVar.f8983b.v());
        if (cVar.f8988x == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        z1.o oVar = new z1.o("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.f8988x = oVar;
        q0 q0Var = cVar.f8984c;
        int i10 = rVar.f11947c;
        a10.l(new v1.n(rVar.f11945a, rVar.f11946b, oVar.g(rVar, cVar, q0Var.z(i10))), i10);
    }

    @Override // v1.a
    public final void n(v1.u uVar) {
        n nVar = (n) uVar;
        ((q1.c) nVar.f8465b).f8986e.remove(nVar);
        for (t tVar : nVar.M) {
            if (tVar.U) {
                for (s sVar : tVar.M) {
                    sVar.j();
                    o1.k kVar = sVar.f10541h;
                    if (kVar != null) {
                        kVar.a(sVar.f10538e);
                        sVar.f10541h = null;
                        sVar.f10540g = null;
                    }
                }
            }
            tVar.A.f(tVar);
            tVar.I.removeCallbacksAndMessages(null);
            tVar.Y = true;
            tVar.J.clear();
        }
        nVar.J = null;
    }

    @Override // v1.a
    public final void p() {
        q1.c cVar = (q1.c) this.f8480p;
        cVar.B = null;
        cVar.C = null;
        cVar.A = null;
        cVar.E = -9223372036854775807L;
        cVar.f8988x.f(null);
        cVar.f8988x = null;
        HashMap hashMap = cVar.f8985d;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((q1.b) it.next()).f8974b.f(null);
        }
        cVar.f8989y.removeCallbacksAndMessages(null);
        cVar.f8989y = null;
        hashMap.clear();
        this.f8476k.a();
    }

    @Override // v1.a
    public final synchronized void s(k0 k0Var) {
        this.f8485u = k0Var;
    }

    public final void u(q1.i iVar) {
        long j4;
        long j10;
        long j11;
        z0 z0Var;
        long j12;
        long j13;
        long j14;
        long j15;
        boolean z9;
        float f10;
        long j16;
        long j17;
        boolean z10;
        boolean z11 = iVar.f9019p;
        long j18 = iVar.f9012h;
        if (z11) {
            j4 = f1.b0.c0(j18);
        } else {
            j4 = -9223372036854775807L;
        }
        int i10 = iVar.f9008d;
        if (i10 != 2 && i10 != 1) {
            j10 = -9223372036854775807L;
        } else {
            j10 = j4;
        }
        q1.c cVar = (q1.c) this.f8480p;
        q1.l lVar = cVar.A;
        lVar.getClass();
        a0 a0Var = new a0(11, lVar, iVar);
        boolean z12 = cVar.D;
        long j19 = iVar.f9024u;
        boolean z13 = iVar.f9011g;
        o0 o0Var = iVar.f9021r;
        long j20 = j4;
        long j21 = iVar.f9009e;
        if (z12) {
            long j22 = j10;
            long j23 = j18 - cVar.E;
            boolean z14 = iVar.o;
            if (z14) {
                j12 = j23 + j19;
            } else {
                j12 = -9223372036854775807L;
            }
            if (iVar.f9019p) {
                j13 = f1.b0.O(f1.b0.x(this.f8481q)) - (j18 + j19);
            } else {
                j13 = 0;
            }
            long j24 = this.f8483s.f1671a;
            q1.h hVar = iVar.f9025v;
            if (j24 != -9223372036854775807L) {
                j15 = f1.b0.O(j24);
            } else {
                if (j21 != -9223372036854775807L) {
                    j14 = j19 - j21;
                } else {
                    long j25 = hVar.f9006d;
                    if (j25 != -9223372036854775807L && iVar.f9018n != -9223372036854775807L) {
                        j14 = j25;
                    } else {
                        j14 = hVar.f9005c;
                        if (j14 == -9223372036854775807L) {
                            j14 = 3 * iVar.f9017m;
                        }
                    }
                }
                j15 = j14 + j13;
            }
            long j26 = j19 + j13;
            long i11 = f1.b0.i(j15, j13, j26);
            e0 e0Var = h().f1770c;
            if (e0Var.f1674d == -3.4028235E38f && e0Var.f1675e == -3.4028235E38f && hVar.f9005c == -9223372036854775807L && hVar.f9006d == -9223372036854775807L) {
                z9 = true;
            } else {
                z9 = false;
            }
            d0 d0Var = new d0();
            d0Var.f1648a = f1.b0.c0(i11);
            float f11 = 1.0f;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = this.f8483s.f1674d;
            }
            d0Var.f1651d = f10;
            if (!z9) {
                f11 = this.f8483s.f1675e;
            }
            d0Var.f1652e = f11;
            e0 e0Var2 = new e0(d0Var);
            this.f8483s = e0Var2;
            if (j21 == -9223372036854775807L) {
                j21 = j26 - f1.b0.O(e0Var2.f1671a);
            }
            if (z13) {
                j17 = j21;
            } else {
                q1.d t9 = t(j21, iVar.f9022s);
                if (t9 != null) {
                    j16 = t9.f8998e;
                } else if (o0Var.isEmpty()) {
                    j17 = 0;
                } else {
                    q1.f fVar = (q1.f) o0Var.get(f1.b0.d(o0Var, Long.valueOf(j21), true));
                    q1.d t10 = t(j21, fVar.D);
                    if (t10 != null) {
                        j16 = t10.f8998e;
                    } else {
                        j16 = fVar.f8998e;
                    }
                }
                j17 = j16;
            }
            if (i10 == 2 && iVar.f9010f) {
                z10 = true;
            } else {
                z10 = false;
            }
            z0Var = new z0(j22, j20, j12, iVar.f9024u, j23, j17, true, !z14, z10, a0Var, h(), this.f8483s);
        } else {
            long j27 = j10;
            if (j21 != -9223372036854775807L && !o0Var.isEmpty()) {
                if (!z13 && j21 != j19) {
                    j11 = ((q1.f) o0Var.get(f1.b0.d(o0Var, Long.valueOf(j21), true))).f8998e;
                } else {
                    j11 = j21;
                }
            } else {
                j11 = 0;
            }
            long j28 = iVar.f9024u;
            z0Var = new z0(j27, j20, j28, j28, 0L, j11, true, false, true, a0Var, h(), null);
        }
        m(z0Var);
    }
}
