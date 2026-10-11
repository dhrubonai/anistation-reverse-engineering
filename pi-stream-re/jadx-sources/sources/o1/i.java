package o1;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import k1.i0;
import r6.d2;
import r6.m0;
import r6.n1;
import r6.o0;
import r6.t0;

/* loaded from: classes.dex */
public final class i implements q {
    public final e A;
    public final long B;
    public final ArrayList C;
    public final Set D;
    public final Set E;
    public int F;
    public y G;
    public d H;
    public d I;
    public Looper J;
    public Handler K;
    public int L;
    public byte[] M;
    public i0 N;
    public volatile f O;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f8147a;

    /* renamed from: b, reason: collision with root package name */
    public final k1.i f8148b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f8149c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f8150d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8151e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f8152f;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f8153x;

    /* renamed from: y, reason: collision with root package name */
    public final f.c f8154y;

    /* renamed from: z, reason: collision with root package name */
    public final q0 f8155z;

    public i(UUID uuid, k1.i iVar, d0 d0Var, HashMap hashMap, boolean z9, int[] iArr, boolean z10, q0 q0Var, long j4) {
        uuid.getClass();
        w7.b.f("Use C.CLEARKEY_UUID instead", !c1.j.f1724b.equals(uuid));
        this.f8147a = uuid;
        this.f8148b = iVar;
        this.f8149c = d0Var;
        this.f8150d = hashMap;
        this.f8151e = z9;
        this.f8152f = iArr;
        this.f8153x = z10;
        this.f8155z = q0Var;
        this.f8154y = new f.c(this);
        this.A = new e(this, 1);
        this.L = 0;
        this.C = new ArrayList();
        this.D = Collections.newSetFromMap(new IdentityHashMap());
        this.E = Collections.newSetFromMap(new IdentityHashMap());
        this.B = j4;
    }

    public static boolean c(d dVar) {
        dVar.p();
        if (dVar.f8127p != 1) {
            return false;
        }
        j f10 = dVar.f();
        f10.getClass();
        Throwable cause = f10.getCause();
        if (f1.b0.f3799a >= 19 && !(cause instanceof ResourceBusyException) && !com.bumptech.glide.c.F(cause)) {
            return false;
        }
        return true;
    }

    public static ArrayList g(c1.p pVar, UUID uuid, boolean z9) {
        boolean z10;
        ArrayList arrayList = new ArrayList(pVar.f1875d);
        for (int i10 = 0; i10 < pVar.f1875d; i10++) {
            c1.o oVar = pVar.f1872a[i10];
            if (!oVar.d(uuid) && (!c1.j.f1725c.equals(uuid) || !oVar.d(c1.j.f1724b))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 && (oVar.f1871e != null || z9)) {
                arrayList.add(oVar);
            }
        }
        return arrayList;
    }

    @Override // o1.q
    public final void a() {
        i(true);
        int i10 = this.F - 1;
        this.F = i10;
        if (i10 != 0) {
            return;
        }
        if (this.B != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.C);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).a(null);
            }
        }
        d2 it = t0.j(this.D).iterator();
        while (it.hasNext()) {
            ((h) it.next()).a();
        }
        h();
    }

    public final k b(Looper looper, n nVar, c1.v vVar, boolean z9) {
        ArrayList arrayList;
        boolean z10;
        if (this.O == null) {
            this.O = new f(this, looper);
        }
        c1.p pVar = vVar.f1937p;
        int i10 = 0;
        d dVar = null;
        if (pVar == null) {
            int i11 = c1.q0.i(vVar.f1935m);
            y yVar = this.G;
            yVar.getClass();
            if (yVar.i() == 2 && z.f8172d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return null;
            }
            int[] iArr = this.f8152f;
            while (true) {
                if (i10 < iArr.length) {
                    if (iArr[i10] == i11) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 == -1 || yVar.i() == 1) {
                return null;
            }
            d dVar2 = this.H;
            if (dVar2 == null) {
                m0 m0Var = o0.f9505b;
                d f10 = f(n1.f9497e, true, null, z9);
                this.C.add(f10);
                this.H = f10;
            } else {
                dVar2.d(null);
            }
            return this.H;
        }
        if (this.M == null) {
            arrayList = g(pVar, this.f8147a, false);
            if (arrayList.isEmpty()) {
                g gVar = new g(this.f8147a);
                f1.o.d("DefaultDrmSessionMgr", "DRM error", gVar);
                if (nVar != null) {
                    nVar.e(gVar);
                }
                return new v(new j(6003, gVar));
            }
        } else {
            arrayList = null;
        }
        if (!this.f8151e) {
            dVar = this.I;
        } else {
            Iterator it = this.C.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d dVar3 = (d) it.next();
                if (f1.b0.a(dVar3.f8113a, arrayList)) {
                    dVar = dVar3;
                    break;
                }
            }
        }
        if (dVar == null) {
            dVar = f(arrayList, false, nVar, z9);
            if (!this.f8151e) {
                this.I = dVar;
            }
            this.C.add(dVar);
        } else {
            dVar.d(nVar);
        }
        return dVar;
    }

    @Override // o1.q
    public final void d(Looper looper, i0 i0Var) {
        boolean z9;
        synchronized (this) {
            Looper looper2 = this.J;
            if (looper2 == null) {
                this.J = looper;
                this.K = new Handler(looper);
            } else {
                if (looper2 == looper) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                w7.b.u(z9);
                this.K.getClass();
            }
        }
        this.N = i0Var;
    }

    public final d e(List list, boolean z9, n nVar) {
        this.G.getClass();
        boolean z10 = this.f8153x | z9;
        UUID uuid = this.f8147a;
        y yVar = this.G;
        f.c cVar = this.f8154y;
        e eVar = this.A;
        int i10 = this.L;
        byte[] bArr = this.M;
        HashMap hashMap = this.f8150d;
        d0 d0Var = this.f8149c;
        Looper looper = this.J;
        looper.getClass();
        q0 q0Var = this.f8155z;
        i0 i0Var = this.N;
        i0Var.getClass();
        d dVar = new d(uuid, yVar, cVar, eVar, list, i10, z10, z9, bArr, hashMap, d0Var, looper, q0Var, i0Var);
        dVar.d(nVar);
        if (this.B != -9223372036854775807L) {
            dVar.d(null);
        }
        return dVar;
    }

    public final d f(List list, boolean z9, n nVar, boolean z10) {
        d e10 = e(list, z9, nVar);
        boolean c6 = c(e10);
        long j4 = this.B;
        Set set = this.E;
        if (c6 && !set.isEmpty()) {
            d2 it = t0.j(set).iterator();
            while (it.hasNext()) {
                ((k) it.next()).a(null);
            }
            e10.a(nVar);
            if (j4 != -9223372036854775807L) {
                e10.a(null);
            }
            e10 = e(list, z9, nVar);
        }
        if (c(e10) && z10) {
            Set set2 = this.D;
            if (!set2.isEmpty()) {
                d2 it2 = t0.j(set2).iterator();
                while (it2.hasNext()) {
                    ((h) it2.next()).a();
                }
                if (!set.isEmpty()) {
                    d2 it3 = t0.j(set).iterator();
                    while (it3.hasNext()) {
                        ((k) it3.next()).a(null);
                    }
                }
                e10.a(nVar);
                if (j4 != -9223372036854775807L) {
                    e10.a(null);
                }
                return e(list, z9, nVar);
            }
            return e10;
        }
        return e10;
    }

    public final void h() {
        if (this.G != null && this.F == 0 && this.C.isEmpty() && this.D.isEmpty()) {
            y yVar = this.G;
            yVar.getClass();
            yVar.a();
            this.G = null;
        }
    }

    public final void i(boolean z9) {
        if (z9 && this.J == null) {
            f1.o.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.J;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            f1.o.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.J.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // o1.q
    public final void k() {
        y uVar;
        i(true);
        int i10 = this.F;
        this.F = i10 + 1;
        if (i10 != 0) {
            return;
        }
        int i11 = 0;
        if (this.G == null) {
            UUID uuid = this.f8147a;
            this.f8148b.getClass();
            try {
                try {
                    uVar = new c0(uuid);
                } catch (g0 unused) {
                    f1.o.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    uVar = new u();
                }
                this.G = uVar;
                uVar.n(new e(this, 0));
                return;
            } catch (UnsupportedSchemeException e10) {
                throw new g0(e10);
            } catch (Exception e11) {
                throw new g0(e11);
            }
        }
        if (this.B == -9223372036854775807L) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.C;
            if (i11 < arrayList.size()) {
                ((d) arrayList.get(i11)).d(null);
                i11++;
            } else {
                return;
            }
        }
    }

    @Override // o1.q
    public final k l(n nVar, c1.v vVar) {
        boolean z9 = false;
        i(false);
        if (this.F > 0) {
            z9 = true;
        }
        w7.b.u(z9);
        w7.b.w(this.J);
        return b(this.J, nVar, vVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // o1.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o(c1.v r7) {
        /*
            r6 = this;
            r0 = 0
            r6.i(r0)
            o1.y r1 = r6.G
            r1.getClass()
            int r1 = r1.i()
            c1.p r2 = r7.f1937p
            if (r2 != 0) goto L2b
            java.lang.String r7 = r7.f1935m
            int r7 = c1.q0.i(r7)
            r2 = r0
        L18:
            int[] r3 = r6.f8152f
            int r4 = r3.length
            r5 = -1
            if (r2 >= r4) goto L26
            r3 = r3[r2]
            if (r3 != r7) goto L23
            goto L27
        L23:
            int r2 = r2 + 1
            goto L18
        L26:
            r2 = r5
        L27:
            if (r2 == r5) goto L2a
            r0 = r1
        L2a:
            return r0
        L2b:
            byte[] r7 = r6.M
            r3 = 1
            if (r7 == 0) goto L31
            goto L8d
        L31:
            java.util.UUID r7 = r6.f8147a
            java.util.ArrayList r4 = g(r2, r7, r3)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L60
            int r4 = r2.f1875d
            if (r4 != r3) goto L8e
            c1.o[] r4 = r2.f1872a
            r4 = r4[r0]
            java.util.UUID r5 = c1.j.f1724b
            boolean r4 = r4.d(r5)
            if (r4 == 0) goto L8e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "DrmInitData only contains common PSSH SchemeData. Assuming support for: "
            r4.<init>(r5)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            java.lang.String r4 = "DefaultDrmSessionMgr"
            f1.o.f(r4, r7)
        L60:
            java.lang.String r7 = r2.f1874c
            if (r7 == 0) goto L8d
            java.lang.String r2 = "cenc"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L6d
            goto L8d
        L6d:
            java.lang.String r2 = "cbcs"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L7c
            int r7 = f1.b0.f3799a
            r2 = 25
            if (r7 < r2) goto L8e
            goto L8d
        L7c:
            java.lang.String r2 = "cbc1"
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L8e
            java.lang.String r2 = "cens"
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L8d
            goto L8e
        L8d:
            r0 = r3
        L8e:
            if (r0 == 0) goto L91
            goto L92
        L91:
            r1 = r3
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.i.o(c1.v):int");
    }

    @Override // o1.q
    public final p r(n nVar, c1.v vVar) {
        boolean z9;
        if (this.F > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        w7.b.w(this.J);
        h hVar = new h(this, nVar);
        Handler handler = this.K;
        handler.getClass();
        handler.post(new f.m0(8, hVar, vVar));
        return hVar;
    }
}
