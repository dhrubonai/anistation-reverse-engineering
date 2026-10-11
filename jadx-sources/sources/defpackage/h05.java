package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h05 extends qu0 {
    public final uf a;
    public final st3 b;
    public final Object c;
    public h43 d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public q44 h;
    public final z44 i;
    public final ArrayList j;
    public final ArrayList k;
    public final p44 l;
    public final l33 m;
    public final p44 n;
    public final p44 o;
    public ArrayList p;
    public q44 q;
    public qg0 r;
    public final sx5 s;
    public boolean t;
    public final sx5 u;
    public final dn0 v;
    public final j43 w;
    public final l11 x;
    public final i18 y;
    public static final sx5 z = tx5.a(kl4.A);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    /* JADX WARN: Type inference failed for: r1v1, types: [st3, java.lang.Object] */
    public h05(l11 l11Var) {
        uf ufVar = new uf(new b05(this, (byte) 0));
        this.a = ufVar;
        b05 b05Var = new b05(this, (byte) 1);
        ?? obj = new Object();
        obj.x = new AtomicInteger(0);
        obj.y = new kz((byte) 0);
        obj.z = new va1(obj, b05Var, (byte) 21);
        this.b = obj;
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new q44();
        this.i = new z44(new vu0[16], 0);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new p44();
        this.m = new l33((byte) 8);
        this.n = new p44();
        this.o = new p44();
        this.s = tx5.a(null);
        this.u = tx5.a(d05.z);
        this.v = new dn0((byte) 29);
        j43 j43Var = new j43((h43) l11Var.get(h95.F));
        j43Var.l0(new pz3((Object) this, (byte) 13));
        this.w = j43Var;
        this.x = l11Var.plus(ufVar).plus(j43Var);
        this.y = new i18((byte) 29);
    }

    public static final void B(h05 h05Var, k14 k14Var, k14 k14Var2) {
        List list = k14Var2.h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                k14 k14Var3 = (k14) list.get(i);
                l33 l33Var = h05Var.m;
                i14 i14Var = k14Var3.a;
                v24.a((p44) l33Var.y, i14Var, new a84(k14Var3, k14Var));
                v24.a((p44) l33Var.z, k14Var, i14Var);
                B(h05Var, k14Var, k14Var3);
            }
        }
    }

    public static final void K(ArrayList arrayList, h05 h05Var, vu0 vu0Var) {
        arrayList.clear();
        synchronized (h05Var.c) {
            Iterator it = h05Var.k.iterator();
            while (it.hasNext()) {
                k14 k14Var = (k14) it.next();
                if (k14Var.c.equals(vu0Var)) {
                    arrayList.add(k14Var);
                    it.remove();
                }
            }
        }
    }

    public static void z(u44 u44Var) {
        try {
            if (!(u44Var.w() instanceof gt5)) {
            } else {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            u44Var.c();
        }
    }

    public final void A() {
        synchronized (this.c) {
            if (((d05) this.u.getValue()).compareTo(d05.B) >= 0) {
                sx5 sx5Var = this.u;
                d05 d05Var = d05.y;
                sx5Var.getClass();
                sx5Var.l(null, d05Var);
            }
        }
        this.w.l(null);
    }

    public final pg0 C() {
        sx5 sx5Var = this.u;
        int compareTo = ((d05) sx5Var.getValue()).compareTo(d05.y);
        sx5 sx5Var2 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        z44 z44Var = this.i;
        if (compareTo <= 0) {
            List H = H();
            int size = H.size();
            for (int i = 0; i < size; i++) {
            }
            this.f.clear();
            this.g = nt1.x;
            this.h = new q44();
            z44Var.h();
            arrayList2.clear();
            arrayList.clear();
            this.p = null;
            qg0 qg0Var = this.r;
            if (qg0Var != null) {
                qg0Var.a(null);
            }
            this.r = null;
            sx5Var2.k(null);
            return null;
        }
        Object value = sx5Var2.getValue();
        d05 d05Var = d05.C;
        d05 d05Var2 = d05.z;
        if (value == null) {
            if (this.d == null) {
                this.h = new q44();
                z44Var.h();
                if (D() || F()) {
                    d05Var2 = d05.A;
                }
            } else {
                d05Var2 = (z44Var.z != 0 || this.h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || D() || F() || this.l.j()) ? d05Var : d05.B;
            }
        }
        sx5Var.getClass();
        sx5Var.l(null, d05Var2);
        if (d05Var2 != d05Var) {
            return null;
        }
        qg0 qg0Var2 = this.r;
        this.r = null;
        return qg0Var2;
    }

    public final boolean D() {
        if (!this.t && (((nu) ((kz) this.a.z).z).get() & 134217727) > 0) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        if (this.i.z == 0 && !D() && !F() && !this.l.j()) {
            return false;
        }
        return true;
    }

    public final boolean F() {
        if (!this.t && (((nu) ((kz) this.b.y).z).get() & 134217727) > 0) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        boolean z2;
        synchronized (this.c) {
            if (!this.h.h() && this.i.z == 0 && !D()) {
                if (!F()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2;
    }

    public final List H() {
        List arrayList;
        List list = this.g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList2 = this.f;
        if (arrayList2.isEmpty()) {
            arrayList = nt1.x;
        } else {
            arrayList = new ArrayList(arrayList2);
        }
        this.g = arrayList;
        return arrayList;
    }

    public final void I() {
        pg0 C;
        synchronized (this.c) {
            C = C();
            if (((d05) this.u.getValue()).compareTo(d05.y) <= 0) {
                throw z51.b("Recomposer shutdown; frame clock awaiter will never resume", this.e);
            }
        }
        if (C != null) {
            ((qg0) C).resumeWith(pn6.a);
        }
    }

    public final void J(vu0 vu0Var) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((k14) arrayList.get(i)).c.equals(vu0Var)) {
                    ArrayList arrayList2 = new ArrayList();
                    K(arrayList2, this, vu0Var);
                    while (!arrayList2.isEmpty()) {
                        L(arrayList2, null);
                        K(arrayList2, this, vu0Var);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0156, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015b, code lost:
    
        if (r4 >= r3) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0165, code lost:
    
        if (((defpackage.ai4) r10.get(r4)).y == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0167, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016a, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0178, code lost:
    
        if (r8 >= r4) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017a, code lost:
    
        r11 = (defpackage.ai4) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0182, code lost:
    
        if (r11.y != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0184, code lost:
    
        r11 = (defpackage.k14) r11.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x018d, code lost:
    
        if (r11 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018f, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0192, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018b, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0195, code lost:
    
        r4 = r16.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0197, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0198, code lost:
    
        defpackage.dp0.Y(r3, r16.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019d, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019e, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ac, code lost:
    
        if (r8 >= r4) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ae, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b7, code lost:
    
        if (((defpackage.ai4) r11).y == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b9, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01bc, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bf, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List L(java.util.List r17, defpackage.q44 r18) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h05.L(java.util.List, q44):java.util.List");
    }

    public final vu0 M(vu0 vu0Var, q44 q44Var) {
        u44 u44Var;
        u44 C;
        if (vu0Var.S.F || vu0Var.T == 3) {
            return null;
        }
        q44 q44Var2 = this.q;
        if (q44Var2 == null || !q44Var2.c(vu0Var)) {
            pz3 pz3Var = new pz3((Object) vu0Var, (byte) 12);
            r82 r82Var = new r82(vu0Var, q44Var, (byte) 22);
            ft5 h = mt5.h();
            if (h instanceof u44) {
                u44Var = (u44) h;
            } else {
                u44Var = null;
            }
            if (u44Var != null && (C = u44Var.C(pz3Var, r82Var)) != null) {
                try {
                    ft5 j = C.j();
                    if (q44Var != null) {
                        try {
                            if (q44Var.h()) {
                                va1 va1Var = new va1(q44Var, vu0Var, (byte) 26);
                                kd2 kd2Var = vu0Var.S;
                                if (kd2Var.F) {
                                    eu0.a("Preparing a composition while composing is not supported");
                                }
                                kd2Var.F = true;
                                try {
                                    va1Var.invoke();
                                    kd2Var.F = false;
                                } catch (Throwable th) {
                                    kd2Var.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            ft5.q(j);
                            throw th2;
                        }
                    }
                    boolean y = vu0Var.y();
                    ft5.q(j);
                    if (y) {
                        return vu0Var;
                    }
                } finally {
                    z(C);
                }
            } else {
                ze0.m("Cannot create a mutable snapshot of an read-only snapshot");
            }
        }
        return null;
    }

    public final void N(Throwable th, vu0 vu0Var) {
        if (((Boolean) A.get()).booleanValue() && !(th instanceof lt0)) {
            synchronized (this.c) {
                try {
                    Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                    this.j.clear();
                    this.i.h();
                    this.h = new q44();
                    this.k.clear();
                    this.l.a();
                    this.n.a();
                    sx5 sx5Var = this.s;
                    c05 c05Var = new c05(th);
                    sx5Var.getClass();
                    sx5Var.l(null, c05Var);
                    if (vu0Var != null) {
                        P(vu0Var);
                    }
                    if (C() != null) {
                        eu0.a("expected to go to inactive state due to composition error");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        synchronized (this.c) {
            Log.e("ComposeInternal", "Error was captured in composition.", th);
            c05 c05Var2 = (c05) this.s.getValue();
            if (c05Var2 == null) {
                sx5 sx5Var2 = this.s;
                c05 c05Var3 = new c05(th);
                sx5Var2.getClass();
                sx5Var2.l(null, c05Var3);
            } else {
                throw c05Var2.a;
            }
        }
        throw th;
    }

    public final boolean O() {
        boolean E;
        synchronized (this.c) {
            if (this.h.g()) {
                return E();
            }
            List H = H();
            eb5 eb5Var = new eb5(this.h);
            this.h = new q44();
            try {
                int size = H.size();
                for (int i = 0; i < size; i++) {
                    ((vu0) H.get(i)).z(eb5Var);
                    if (((d05) this.u.getValue()).compareTo(d05.y) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (C() == null) {
                        E = E();
                    } else {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                }
                return E;
            } catch (Throwable th) {
                synchronized (this.c) {
                    q44 q44Var = this.h;
                    int i2 = q44Var.d;
                    Iterator<E> it = eb5Var.iterator();
                    while (it.hasNext()) {
                        q44Var.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void P(vu0 vu0Var) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(vu0Var)) {
            arrayList.add(vu0Var);
        }
        if (this.f.remove(vu0Var)) {
            this.g = null;
        }
    }

    @Override // defpackage.qu0
    public final void a(vu0 vu0Var, ic2 ic2Var) {
        d05 d05Var;
        boolean z2;
        u44 u44Var;
        u44 C;
        boolean z3 = vu0Var.S.F;
        synchronized (this.c) {
            d05 d05Var2 = (d05) this.u.getValue();
            d05Var = d05.y;
            z2 = true;
            if (d05Var2.compareTo(d05Var) > 0) {
                z2 = true ^ H().contains(vu0Var);
            }
        }
        try {
            pz3 pz3Var = new pz3((Object) vu0Var, (byte) 12);
            r82 r82Var = new r82(vu0Var, null, (byte) 22);
            ft5 h = mt5.h();
            if (h instanceof u44) {
                u44Var = (u44) h;
            } else {
                u44Var = null;
            }
            if (u44Var != null && (C = u44Var.C(pz3Var, r82Var)) != null) {
                try {
                    ft5 j = C.j();
                    try {
                        vu0Var.m(ic2Var);
                        synchronized (this.c) {
                            if (((d05) this.u.getValue()).compareTo(d05Var) > 0 && !H().contains(vu0Var)) {
                                this.f.add(vu0Var);
                                this.g = null;
                            }
                        }
                        if (!z3) {
                            mt5.h().m();
                        }
                        try {
                            J(vu0Var);
                            try {
                                vu0Var.g();
                                vu0Var.i();
                                if (!z3) {
                                    mt5.h().m();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                N(th, null);
                                return;
                            }
                        } catch (Throwable th2) {
                            N(th2, vu0Var);
                            return;
                        }
                    } finally {
                        ft5.q(j);
                    }
                } finally {
                    z(C);
                }
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        } catch (Throwable th3) {
            if (z2) {
                synchronized (this.c) {
                }
            }
            N(th3, vu0Var);
        }
    }

    @Override // defpackage.qu0
    public final q44 b(vu0 vu0Var, ko5 ko5Var, ic2 ic2Var) {
        dn0 dn0Var = this.v;
        try {
            ko5 ko5Var2 = vu0Var.M;
            vu0Var.M = ko5Var;
            try {
                a(vu0Var, ic2Var);
                q44 q44Var = (q44) dn0Var.get();
                if (q44Var == null) {
                    q44Var = db5.a;
                    q44Var.getClass();
                }
                return q44Var;
            } finally {
                vu0Var.M = ko5Var2;
            }
        } finally {
            dn0Var.O(null);
        }
    }

    @Override // defpackage.qu0
    public final void c(k14 k14Var) {
        pg0 C;
        synchronized (this.c) {
            try {
                v24.a(this.l, k14Var.a, k14Var);
                if (k14Var.h != null) {
                    B(this, k14Var, k14Var);
                }
                C = C();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (C != null) {
            ((qg0) C).resumeWith(pn6.a);
        }
    }

    @Override // defpackage.qu0
    public final l11 k() {
        return this.x;
    }

    @Override // defpackage.qu0
    public final void m(k14 k14Var) {
        pg0 C;
        synchronized (this.c) {
            this.k.add(k14Var);
            C = C();
        }
        if (C != null) {
            ((qg0) C).resumeWith(pn6.a);
        }
    }

    @Override // defpackage.qu0
    public final void n(vu0 vu0Var) {
        pg0 pg0Var;
        synchronized (this.c) {
            if (!this.i.i(vu0Var)) {
                this.i.b(vu0Var);
                pg0Var = C();
            } else {
                pg0Var = null;
            }
        }
        if (pg0Var != null) {
            ((qg0) pg0Var).resumeWith(pn6.a);
        }
    }

    @Override // defpackage.qu0
    public final void o(k14 k14Var, j14 j14Var, nr nrVar) {
        f44 f44Var;
        synchronized (this.c) {
            this.n.n(k14Var, j14Var);
            Object g = this.o.g(k14Var);
            if (g == null) {
                f44Var = ec4.b;
                f44Var.getClass();
            } else if (g instanceof f44) {
                f44Var = (f44) g;
            } else {
                Object[] objArr = ec4.a;
                f44 f44Var2 = new f44(1);
                f44Var2.a(g);
                f44Var = f44Var2;
            }
            if (f44Var.j()) {
                p44 d = j14Var.a.d(nrVar, f44Var);
                Object[] objArr2 = d.b;
                Object[] objArr3 = d.c;
                long[] jArr = d.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj = objArr2[i4];
                                    this.n.n((k14) obj, (j14) objArr3[i4]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.qu0
    public final j14 p(k14 k14Var) {
        j14 j14Var;
        synchronized (this.c) {
            j14Var = (j14) this.n.l(k14Var);
        }
        return j14Var;
    }

    @Override // defpackage.qu0
    public final q44 q(vu0 vu0Var, ko5 ko5Var, q44 q44Var) {
        dn0 dn0Var = this.v;
        try {
            O();
            vu0Var.z(new eb5(q44Var));
            ko5 ko5Var2 = vu0Var.M;
            vu0Var.M = ko5Var;
            try {
                vu0 M = M(vu0Var, null);
                if (M != null) {
                    J(vu0Var);
                    M.g();
                    M.i();
                }
                q44 q44Var2 = (q44) dn0Var.get();
                if (q44Var2 == null) {
                    q44Var2 = db5.a;
                    q44Var2.getClass();
                }
                return q44Var2;
            } finally {
                vu0Var.M = ko5Var2;
            }
        } finally {
            dn0Var.O(null);
        }
    }

    @Override // defpackage.qu0
    public final void t(zz4 zz4Var) {
        dn0 dn0Var = this.v;
        q44 q44Var = (q44) dn0Var.get();
        if (q44Var == null) {
            q44 q44Var2 = db5.a;
            q44Var = new q44();
            dn0Var.O(q44Var);
        }
        q44Var.a(zz4Var);
    }

    @Override // defpackage.qu0
    public final void u(vu0 vu0Var) {
        synchronized (this.c) {
            try {
                q44 q44Var = this.q;
                if (q44Var == null) {
                    q44 q44Var2 = db5.a;
                    q44Var = new q44();
                    this.q = q44Var;
                }
                q44Var.a(vu0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [jz, java.lang.Object, s94] */
    @Override // defpackage.qu0
    public final sg0 v(vt0 vt0Var) {
        st3 st3Var = this.b;
        kz kzVar = (kz) st3Var.y;
        ?? obj = new Object();
        obj.a = vt0Var;
        return kzVar.p(obj, (va1) st3Var.z);
    }

    @Override // defpackage.qu0
    public final void y(vu0 vu0Var) {
        synchronized (this.c) {
            if (this.f.remove(vu0Var)) {
                this.g = null;
            }
            this.i.k(vu0Var);
            this.j.remove(vu0Var);
        }
    }
}
