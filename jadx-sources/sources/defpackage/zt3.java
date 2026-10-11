package defpackage;

import android.os.RemoteException;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zt3 implements io4 {
    public final WeakReference a;
    public final WeakReference b;

    public zt3(bu3 bu3Var, fq4 fq4Var) {
        this.a = new WeakReference(bu3Var);
        this.b = new WeakReference(fq4Var);
    }

    @Override // defpackage.io4
    public final void A(qh6 qh6Var) {
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            k.s = k.s.a(qh6Var);
            k.c.a(true, false);
            k.d(new qi2((byte) 13));
        }
    }

    @Override // defpackage.io4
    public final void C(int i, boolean z) {
        boolean z2;
        int i2;
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) != null) {
                ep4 ep4Var = k.s;
                yx1 yx1Var = ep4Var.a;
                int i3 = ep4Var.b;
                sk5 sk5Var = ep4Var.c;
                jo4 jo4Var = ep4Var.d;
                jo4 jo4Var2 = ep4Var.e;
                int i4 = ep4Var.f;
                rn4 rn4Var = ep4Var.g;
                int i5 = ep4Var.h;
                boolean z3 = ep4Var.i;
                kf6 kf6Var = ep4Var.j;
                int i6 = ep4Var.k;
                hv6 hv6Var = ep4Var.l;
                jr3 jr3Var = ep4Var.m;
                float f = ep4Var.n;
                float f2 = ep4Var.o;
                int i7 = ep4Var.p;
                ru ruVar = ep4Var.q;
                c31 c31Var = ep4Var.r;
                rf1 rf1Var = ep4Var.s;
                boolean z4 = ep4Var.v;
                int i8 = ep4Var.w;
                boolean z5 = ep4Var.x;
                boolean z6 = ep4Var.y;
                int i9 = ep4Var.z;
                int i10 = ep4Var.A;
                jr3 jr3Var2 = ep4Var.B;
                long j = ep4Var.C;
                long j2 = ep4Var.D;
                long j3 = ep4Var.E;
                qh6 qh6Var = ep4Var.F;
                hh6 hh6Var = ep4Var.G;
                if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                io3.B(z2);
                k.s = new ep4(yx1Var, i3, sk5Var, jo4Var, jo4Var2, i4, rn4Var, i5, z3, hv6Var, kf6Var, i6, jr3Var, f, f2, ruVar, i7, c31Var, rf1Var, i, z, z4, i8, i9, i10, z5, z6, jr3Var2, j, j2, j3, qh6Var, hh6Var);
                k.c.a(true, true);
                try {
                    su3 su3Var = ((wu3) k.h.k.B).r;
                    if (su3Var != null) {
                        if (z) {
                            i2 = 0;
                        } else {
                            i2 = i;
                        }
                        su3Var.d = i2;
                        su3Var.a().setCurrentVolume(i2);
                    }
                } catch (RemoteException e) {
                    kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
                }
            }
        }
    }

    @Override // defpackage.io4
    public final void D(long j) {
        boolean z;
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            ep4 ep4Var = k.s;
            yx1 yx1Var = ep4Var.a;
            int i = ep4Var.b;
            sk5 sk5Var = ep4Var.c;
            jo4 jo4Var = ep4Var.d;
            jo4 jo4Var2 = ep4Var.e;
            int i2 = ep4Var.f;
            rn4 rn4Var = ep4Var.g;
            int i3 = ep4Var.h;
            boolean z2 = ep4Var.i;
            kf6 kf6Var = ep4Var.j;
            int i4 = ep4Var.k;
            hv6 hv6Var = ep4Var.l;
            jr3 jr3Var = ep4Var.m;
            float f = ep4Var.n;
            float f2 = ep4Var.o;
            int i5 = ep4Var.p;
            ru ruVar = ep4Var.q;
            c31 c31Var = ep4Var.r;
            rf1 rf1Var = ep4Var.s;
            int i6 = ep4Var.t;
            boolean z3 = ep4Var.u;
            boolean z4 = ep4Var.v;
            int i7 = ep4Var.w;
            boolean z5 = ep4Var.x;
            boolean z6 = ep4Var.y;
            int i8 = ep4Var.z;
            int i9 = ep4Var.A;
            jr3 jr3Var2 = ep4Var.B;
            long j2 = ep4Var.D;
            long j3 = ep4Var.E;
            qh6 qh6Var = ep4Var.F;
            hh6 hh6Var = ep4Var.G;
            if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
                z = false;
            } else {
                z = true;
            }
            io3.B(z);
            k.s = new ep4(yx1Var, i, sk5Var, jo4Var, jo4Var2, i2, rn4Var, i3, z2, hv6Var, kf6Var, i4, jr3Var, f, f2, ruVar, i5, c31Var, rf1Var, i6, z3, z4, i7, i8, i9, z5, z6, jr3Var2, j, j2, j3, qh6Var, hh6Var);
            k.c.a(true, true);
            try {
                k.h.k.getClass();
            } catch (RemoteException e) {
                kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.io4
    public final void E(jr3 jr3Var) {
        boolean z;
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            ep4 ep4Var = k.s;
            yx1 yx1Var = ep4Var.a;
            int i = ep4Var.b;
            sk5 sk5Var = ep4Var.c;
            jo4 jo4Var = ep4Var.d;
            jo4 jo4Var2 = ep4Var.e;
            int i2 = ep4Var.f;
            rn4 rn4Var = ep4Var.g;
            int i3 = ep4Var.h;
            boolean z2 = ep4Var.i;
            kf6 kf6Var = ep4Var.j;
            int i4 = ep4Var.k;
            hv6 hv6Var = ep4Var.l;
            jr3 jr3Var2 = ep4Var.m;
            float f = ep4Var.n;
            float f2 = ep4Var.o;
            int i5 = ep4Var.p;
            ru ruVar = ep4Var.q;
            c31 c31Var = ep4Var.r;
            rf1 rf1Var = ep4Var.s;
            int i6 = ep4Var.t;
            boolean z3 = ep4Var.u;
            boolean z4 = ep4Var.v;
            int i7 = ep4Var.w;
            boolean z5 = ep4Var.x;
            boolean z6 = ep4Var.y;
            int i8 = ep4Var.z;
            int i9 = ep4Var.A;
            long j = ep4Var.C;
            long j2 = ep4Var.D;
            long j3 = ep4Var.E;
            qh6 qh6Var = ep4Var.F;
            hh6 hh6Var = ep4Var.G;
            if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
                z = false;
            } else {
                z = true;
            }
            io3.B(z);
            k.s = new ep4(yx1Var, i, sk5Var, jo4Var, jo4Var2, i2, rn4Var, i3, z2, hv6Var, kf6Var, i4, jr3Var2, f, f2, ruVar, i5, c31Var, rf1Var, i6, z3, z4, i7, i8, i9, z5, z6, jr3Var, j, j2, j3, qh6Var, hh6Var);
            k.c.a(true, true);
            try {
                k.h.k.p();
            } catch (RemoteException e) {
                kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.io4
    public final void F(jr3 jr3Var) {
        boolean z;
        bu3 k = k();
        if (k == null) {
            return;
        }
        k.t();
        ep4 ep4Var = k.s;
        yx1 yx1Var = ep4Var.a;
        int i = ep4Var.b;
        sk5 sk5Var = ep4Var.c;
        jo4 jo4Var = ep4Var.d;
        jo4 jo4Var2 = ep4Var.e;
        int i2 = ep4Var.f;
        rn4 rn4Var = ep4Var.g;
        int i3 = ep4Var.h;
        boolean z2 = ep4Var.i;
        kf6 kf6Var = ep4Var.j;
        int i4 = ep4Var.k;
        hv6 hv6Var = ep4Var.l;
        float f = ep4Var.n;
        float f2 = ep4Var.o;
        int i5 = ep4Var.p;
        ru ruVar = ep4Var.q;
        c31 c31Var = ep4Var.r;
        rf1 rf1Var = ep4Var.s;
        int i6 = ep4Var.t;
        boolean z3 = ep4Var.u;
        boolean z4 = ep4Var.v;
        int i7 = ep4Var.w;
        boolean z5 = ep4Var.x;
        boolean z6 = ep4Var.y;
        int i8 = ep4Var.z;
        int i9 = ep4Var.A;
        jr3 jr3Var2 = ep4Var.B;
        long j = ep4Var.C;
        long j2 = ep4Var.D;
        long j3 = ep4Var.E;
        qh6 qh6Var = ep4Var.F;
        hh6 hh6Var = ep4Var.G;
        if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
            z = false;
        } else {
            z = true;
        }
        io3.B(z);
        k.s = new ep4(yx1Var, i, sk5Var, jo4Var, jo4Var2, i2, rn4Var, i3, z2, hv6Var, kf6Var, i4, jr3Var, f, f2, ruVar, i5, c31Var, rf1Var, i6, z3, z4, i7, i8, i9, z5, z6, jr3Var2, j, j2, j3, qh6Var, hh6Var);
        k.c.a(true, true);
        try {
            k.h.k.l(jr3Var);
        } catch (RemoteException e) {
            kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.io4
    public final void G(long j) {
        boolean z;
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            ep4 ep4Var = k.s;
            yx1 yx1Var = ep4Var.a;
            int i = ep4Var.b;
            sk5 sk5Var = ep4Var.c;
            jo4 jo4Var = ep4Var.d;
            jo4 jo4Var2 = ep4Var.e;
            int i2 = ep4Var.f;
            rn4 rn4Var = ep4Var.g;
            int i3 = ep4Var.h;
            boolean z2 = ep4Var.i;
            kf6 kf6Var = ep4Var.j;
            int i4 = ep4Var.k;
            hv6 hv6Var = ep4Var.l;
            jr3 jr3Var = ep4Var.m;
            float f = ep4Var.n;
            float f2 = ep4Var.o;
            int i5 = ep4Var.p;
            ru ruVar = ep4Var.q;
            c31 c31Var = ep4Var.r;
            rf1 rf1Var = ep4Var.s;
            int i6 = ep4Var.t;
            boolean z3 = ep4Var.u;
            boolean z4 = ep4Var.v;
            int i7 = ep4Var.w;
            boolean z5 = ep4Var.x;
            boolean z6 = ep4Var.y;
            int i8 = ep4Var.z;
            int i9 = ep4Var.A;
            jr3 jr3Var2 = ep4Var.B;
            long j2 = ep4Var.C;
            long j3 = ep4Var.E;
            qh6 qh6Var = ep4Var.F;
            hh6 hh6Var = ep4Var.G;
            if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
                z = false;
            } else {
                z = true;
            }
            io3.B(z);
            k.s = new ep4(yx1Var, i, sk5Var, jo4Var, jo4Var2, i2, rn4Var, i3, z2, hv6Var, kf6Var, i4, jr3Var, f, f2, ruVar, i5, c31Var, rf1Var, i6, z3, z4, i7, i8, i9, z5, z6, jr3Var2, j2, j, j3, qh6Var, hh6Var);
            k.c.a(true, true);
            try {
                k.h.k.getClass();
            } catch (RemoteException e) {
                kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.io4
    public final void H(kf6 kf6Var, int i) {
        hh6 hh6Var;
        boolean z;
        bu3 k = k();
        if (k != null) {
            k.t();
            fq4 fq4Var = (fq4) this.b.get();
            if (fq4Var == null) {
                return;
            }
            sk5 d1 = fq4Var.d1();
            if (i == 0 && k.s.j.p()) {
                ep4 ep4Var = k.s;
                yx1 yx1Var = ep4Var.a;
                int i2 = ep4Var.b;
                sk5 sk5Var = ep4Var.c;
                int i3 = ep4Var.f;
                rn4 rn4Var = ep4Var.g;
                int i4 = ep4Var.h;
                boolean z2 = ep4Var.i;
                kf6 kf6Var2 = ep4Var.j;
                int i5 = ep4Var.k;
                hv6 hv6Var = ep4Var.l;
                jr3 jr3Var = ep4Var.m;
                float f = ep4Var.n;
                float f2 = ep4Var.o;
                int i6 = ep4Var.p;
                ru ruVar = ep4Var.q;
                c31 c31Var = ep4Var.r;
                rf1 rf1Var = ep4Var.s;
                int i7 = ep4Var.t;
                boolean z3 = ep4Var.u;
                boolean z4 = ep4Var.v;
                int i8 = ep4Var.w;
                boolean z5 = ep4Var.x;
                boolean z6 = ep4Var.y;
                int i9 = ep4Var.z;
                int i10 = ep4Var.A;
                jr3 jr3Var2 = ep4Var.B;
                long j = ep4Var.C;
                long j2 = ep4Var.D;
                long j3 = ep4Var.E;
                qh6 qh6Var = ep4Var.F;
                hh6 hh6Var2 = ep4Var.G;
                jo4 jo4Var = ep4Var.e;
                jo4 jo4Var2 = d1.a;
                if (!kf6Var2.p()) {
                    hh6Var = hh6Var2;
                    if (sk5Var.a.b >= kf6Var2.o()) {
                        z = false;
                        io3.B(z);
                        k.s = new ep4(yx1Var, i2, sk5Var, jo4Var, jo4Var2, i3, rn4Var, i4, z2, hv6Var, kf6Var2, i5, jr3Var, f, f2, ruVar, i6, c31Var, rf1Var, i7, z3, z4, i8, i9, i10, z5, z6, jr3Var2, j, j2, j3, qh6Var, hh6Var);
                    }
                } else {
                    hh6Var = hh6Var2;
                }
                z = true;
                io3.B(z);
                k.s = new ep4(yx1Var, i2, sk5Var, jo4Var, jo4Var2, i3, rn4Var, i4, z2, hv6Var, kf6Var2, i5, jr3Var, f, f2, ruVar, i6, c31Var, rf1Var, i7, z3, z4, i8, i9, i10, z5, z6, jr3Var2, j, j2, j3, qh6Var, hh6Var);
            }
            k.s = k.s.c(kf6Var, d1, i);
            k.c.a(false, true);
            try {
                k.h.k.o(kf6Var);
            } catch (RemoteException e) {
                kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.io4
    public final void J(yx1 yx1Var) {
        boolean z;
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            ep4 ep4Var = k.s;
            int i = ep4Var.b;
            sk5 sk5Var = ep4Var.c;
            jo4 jo4Var = ep4Var.d;
            jo4 jo4Var2 = ep4Var.e;
            int i2 = ep4Var.f;
            rn4 rn4Var = ep4Var.g;
            int i3 = ep4Var.h;
            boolean z2 = ep4Var.i;
            kf6 kf6Var = ep4Var.j;
            int i4 = ep4Var.k;
            hv6 hv6Var = ep4Var.l;
            jr3 jr3Var = ep4Var.m;
            float f = ep4Var.n;
            float f2 = ep4Var.o;
            int i5 = ep4Var.p;
            ru ruVar = ep4Var.q;
            c31 c31Var = ep4Var.r;
            rf1 rf1Var = ep4Var.s;
            int i6 = ep4Var.t;
            boolean z3 = ep4Var.u;
            boolean z4 = ep4Var.v;
            int i7 = ep4Var.w;
            boolean z5 = ep4Var.x;
            boolean z6 = ep4Var.y;
            int i8 = ep4Var.z;
            int i9 = ep4Var.A;
            jr3 jr3Var2 = ep4Var.B;
            long j = ep4Var.C;
            long j2 = ep4Var.D;
            long j3 = ep4Var.E;
            qh6 qh6Var = ep4Var.F;
            hh6 hh6Var = ep4Var.G;
            if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
                z = false;
            } else {
                z = true;
            }
            io3.B(z);
            k.s = new ep4(yx1Var, i, sk5Var, jo4Var, jo4Var2, i2, rn4Var, i3, z2, hv6Var, kf6Var, i4, jr3Var, f, f2, ruVar, i5, c31Var, rf1Var, i6, z3, z4, i7, i8, i9, z5, z6, jr3Var2, j, j2, j3, qh6Var, hh6Var);
            k.c.a(true, true);
            try {
                wu3 wu3Var = (wu3) k.h.k.B;
                bu3 bu3Var = wu3Var.i;
                bu3Var.t();
                wu3Var.Y(bu3Var.t);
            } catch (RemoteException e) {
                kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.io4
    public final void K() {
        bu3 k = k();
        if (k != null) {
            k.t();
            st3 st3Var = k.g.f;
            nw2 p = st3Var.p();
            for (int i = 0; i < p.size(); i++) {
                dt3 dt3Var = (dt3) p.get(i);
                st3Var.M();
                k.c(dt3Var, new qi2((byte) 14));
            }
        }
    }

    @Override // defpackage.io4
    public final void O(rn4 rn4Var) {
        boolean z;
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            ep4 ep4Var = k.s;
            yx1 yx1Var = ep4Var.a;
            int i = ep4Var.b;
            sk5 sk5Var = ep4Var.c;
            jo4 jo4Var = ep4Var.d;
            jo4 jo4Var2 = ep4Var.e;
            int i2 = ep4Var.f;
            int i3 = ep4Var.h;
            boolean z2 = ep4Var.i;
            kf6 kf6Var = ep4Var.j;
            int i4 = ep4Var.k;
            hv6 hv6Var = ep4Var.l;
            jr3 jr3Var = ep4Var.m;
            float f = ep4Var.n;
            float f2 = ep4Var.o;
            int i5 = ep4Var.p;
            ru ruVar = ep4Var.q;
            c31 c31Var = ep4Var.r;
            rf1 rf1Var = ep4Var.s;
            int i6 = ep4Var.t;
            boolean z3 = ep4Var.u;
            boolean z4 = ep4Var.v;
            int i7 = ep4Var.w;
            boolean z5 = ep4Var.x;
            boolean z6 = ep4Var.y;
            int i8 = ep4Var.z;
            int i9 = ep4Var.A;
            jr3 jr3Var2 = ep4Var.B;
            long j = ep4Var.C;
            long j2 = ep4Var.D;
            long j3 = ep4Var.E;
            qh6 qh6Var = ep4Var.F;
            hh6 hh6Var = ep4Var.G;
            if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
                z = false;
            } else {
                z = true;
            }
            io3.B(z);
            k.s = new ep4(yx1Var, i, sk5Var, jo4Var, jo4Var2, i2, rn4Var, i3, z2, hv6Var, kf6Var, i4, jr3Var, f, f2, ruVar, i5, c31Var, rf1Var, i6, z3, z4, i7, i8, i9, z5, z6, jr3Var2, j, j2, j3, qh6Var, hh6Var);
            k.c.a(true, true);
            try {
                wu3 wu3Var = (wu3) k.h.k.B;
                bu3 bu3Var = wu3Var.i;
                bu3Var.t();
                wu3Var.Y(bu3Var.t);
            } catch (RemoteException e) {
                kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.io4
    public final void P(go4 go4Var) {
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            k.f(go4Var);
        }
    }

    @Override // defpackage.io4
    public final void Q(rf1 rf1Var) {
        boolean z;
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            ep4 ep4Var = k.s;
            yx1 yx1Var = ep4Var.a;
            int i = ep4Var.b;
            sk5 sk5Var = ep4Var.c;
            jo4 jo4Var = ep4Var.d;
            jo4 jo4Var2 = ep4Var.e;
            int i2 = ep4Var.f;
            rn4 rn4Var = ep4Var.g;
            int i3 = ep4Var.h;
            boolean z2 = ep4Var.i;
            kf6 kf6Var = ep4Var.j;
            int i4 = ep4Var.k;
            hv6 hv6Var = ep4Var.l;
            jr3 jr3Var = ep4Var.m;
            float f = ep4Var.n;
            float f2 = ep4Var.o;
            int i5 = ep4Var.p;
            ru ruVar = ep4Var.q;
            c31 c31Var = ep4Var.r;
            int i6 = ep4Var.t;
            boolean z3 = ep4Var.u;
            boolean z4 = ep4Var.v;
            int i7 = ep4Var.w;
            boolean z5 = ep4Var.x;
            boolean z6 = ep4Var.y;
            int i8 = ep4Var.z;
            int i9 = ep4Var.A;
            jr3 jr3Var2 = ep4Var.B;
            long j = ep4Var.C;
            long j2 = ep4Var.D;
            long j3 = ep4Var.E;
            qh6 qh6Var = ep4Var.F;
            hh6 hh6Var = ep4Var.G;
            if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
                z = false;
            } else {
                z = true;
            }
            io3.B(z);
            k.s = new ep4(yx1Var, i, sk5Var, jo4Var, jo4Var2, i2, rn4Var, i3, z2, hv6Var, kf6Var, i4, jr3Var, f, f2, ruVar, i5, c31Var, rf1Var, i6, z3, z4, i7, i8, i9, z5, z6, jr3Var2, j, j2, j3, qh6Var, hh6Var);
            k.c.a(true, true);
            try {
                k.h.k.i();
            } catch (RemoteException e) {
                kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.io4
    public final void R(long j) {
        boolean z;
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            ep4 ep4Var = k.s;
            yx1 yx1Var = ep4Var.a;
            int i = ep4Var.b;
            sk5 sk5Var = ep4Var.c;
            jo4 jo4Var = ep4Var.d;
            jo4 jo4Var2 = ep4Var.e;
            int i2 = ep4Var.f;
            rn4 rn4Var = ep4Var.g;
            int i3 = ep4Var.h;
            boolean z2 = ep4Var.i;
            kf6 kf6Var = ep4Var.j;
            int i4 = ep4Var.k;
            hv6 hv6Var = ep4Var.l;
            jr3 jr3Var = ep4Var.m;
            float f = ep4Var.n;
            float f2 = ep4Var.o;
            int i5 = ep4Var.p;
            ru ruVar = ep4Var.q;
            c31 c31Var = ep4Var.r;
            rf1 rf1Var = ep4Var.s;
            int i6 = ep4Var.t;
            boolean z3 = ep4Var.u;
            boolean z4 = ep4Var.v;
            int i7 = ep4Var.w;
            boolean z5 = ep4Var.x;
            boolean z6 = ep4Var.y;
            int i8 = ep4Var.z;
            int i9 = ep4Var.A;
            jr3 jr3Var2 = ep4Var.B;
            long j2 = ep4Var.C;
            long j3 = ep4Var.D;
            qh6 qh6Var = ep4Var.F;
            hh6 hh6Var = ep4Var.G;
            if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
                z = false;
            } else {
                z = true;
            }
            io3.B(z);
            k.s = new ep4(yx1Var, i, sk5Var, jo4Var, jo4Var2, i2, rn4Var, i3, z2, hv6Var, kf6Var, i4, jr3Var, f, f2, ruVar, i5, c31Var, rf1Var, i6, z3, z4, i7, i8, i9, z5, z6, jr3Var2, j2, j3, j, qh6Var, hh6Var);
            k.c.a(true, true);
        }
    }

    @Override // defpackage.io4
    public final void S(int i, int i2) {
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            k.d(new gy1(i, i2, (byte) 1));
        }
    }

    @Override // defpackage.io4
    public final void V(boolean z) {
        boolean z2;
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            ep4 ep4Var = k.s;
            yx1 yx1Var = ep4Var.a;
            int i = ep4Var.b;
            sk5 sk5Var = ep4Var.c;
            jo4 jo4Var = ep4Var.d;
            jo4 jo4Var2 = ep4Var.e;
            int i2 = ep4Var.f;
            rn4 rn4Var = ep4Var.g;
            int i3 = ep4Var.h;
            boolean z3 = ep4Var.i;
            kf6 kf6Var = ep4Var.j;
            int i4 = ep4Var.k;
            hv6 hv6Var = ep4Var.l;
            jr3 jr3Var = ep4Var.m;
            float f = ep4Var.n;
            float f2 = ep4Var.o;
            int i5 = ep4Var.p;
            ru ruVar = ep4Var.q;
            c31 c31Var = ep4Var.r;
            rf1 rf1Var = ep4Var.s;
            int i6 = ep4Var.t;
            boolean z4 = ep4Var.u;
            boolean z5 = ep4Var.v;
            int i7 = ep4Var.w;
            boolean z6 = ep4Var.y;
            int i8 = ep4Var.z;
            int i9 = ep4Var.A;
            jr3 jr3Var2 = ep4Var.B;
            long j = ep4Var.C;
            long j2 = ep4Var.D;
            long j3 = ep4Var.E;
            qh6 qh6Var = ep4Var.F;
            hh6 hh6Var = ep4Var.G;
            if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
                z2 = false;
            } else {
                z2 = true;
            }
            io3.B(z2);
            k.s = new ep4(yx1Var, i, sk5Var, jo4Var, jo4Var2, i2, rn4Var, i3, z3, hv6Var, kf6Var, i4, jr3Var, f, f2, ruVar, i5, c31Var, rf1Var, i6, z4, z5, i7, i8, i9, z, z6, jr3Var2, j, j2, j3, qh6Var, hh6Var);
            k.c.a(true, true);
            try {
                wu3 wu3Var = (wu3) k.h.k.B;
                bu3 bu3Var = wu3Var.i;
                bu3Var.t();
                wu3Var.Y(bu3Var.t);
            } catch (RemoteException e) {
                kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
            }
            k.r();
        }
    }

    @Override // defpackage.io4
    public final void a(hv6 hv6Var) {
        boolean z;
        bu3 k = k();
        if (k == null) {
            return;
        }
        k.t();
        ep4 ep4Var = k.s;
        yx1 yx1Var = ep4Var.a;
        int i = ep4Var.b;
        sk5 sk5Var = ep4Var.c;
        jo4 jo4Var = ep4Var.d;
        jo4 jo4Var2 = ep4Var.e;
        int i2 = ep4Var.f;
        rn4 rn4Var = ep4Var.g;
        int i3 = ep4Var.h;
        boolean z2 = ep4Var.i;
        kf6 kf6Var = ep4Var.j;
        int i4 = ep4Var.k;
        jr3 jr3Var = ep4Var.m;
        float f = ep4Var.n;
        float f2 = ep4Var.o;
        int i5 = ep4Var.p;
        ru ruVar = ep4Var.q;
        c31 c31Var = ep4Var.r;
        rf1 rf1Var = ep4Var.s;
        int i6 = ep4Var.t;
        boolean z3 = ep4Var.u;
        boolean z4 = ep4Var.v;
        int i7 = ep4Var.w;
        boolean z5 = ep4Var.x;
        boolean z6 = ep4Var.y;
        int i8 = ep4Var.z;
        int i9 = ep4Var.A;
        jr3 jr3Var2 = ep4Var.B;
        long j = ep4Var.C;
        long j2 = ep4Var.D;
        long j3 = ep4Var.E;
        qh6 qh6Var = ep4Var.F;
        hh6 hh6Var = ep4Var.G;
        if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
            z = false;
        } else {
            z = true;
        }
        io3.B(z);
        k.s = new ep4(yx1Var, i, sk5Var, jo4Var, jo4Var2, i2, rn4Var, i3, z2, hv6Var, kf6Var, i4, jr3Var, f, f2, ruVar, i5, c31Var, rf1Var, i6, z3, z4, i7, i8, i9, z5, z6, jr3Var2, j, j2, j3, qh6Var, hh6Var);
        k.c.a(true, true);
        try {
            k.h.k.getClass();
        } catch (RemoteException e) {
            kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.io4
    public final void b(c31 c31Var) {
        boolean z;
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            ep4 ep4Var = k.s;
            yx1 yx1Var = ep4Var.a;
            int i = ep4Var.b;
            sk5 sk5Var = ep4Var.c;
            jo4 jo4Var = ep4Var.d;
            jo4 jo4Var2 = ep4Var.e;
            int i2 = ep4Var.f;
            rn4 rn4Var = ep4Var.g;
            int i3 = ep4Var.h;
            boolean z2 = ep4Var.i;
            kf6 kf6Var = ep4Var.j;
            int i4 = ep4Var.k;
            hv6 hv6Var = ep4Var.l;
            jr3 jr3Var = ep4Var.m;
            float f = ep4Var.n;
            float f2 = ep4Var.o;
            int i5 = ep4Var.p;
            ru ruVar = ep4Var.q;
            rf1 rf1Var = ep4Var.s;
            int i6 = ep4Var.t;
            boolean z3 = ep4Var.u;
            boolean z4 = ep4Var.v;
            int i7 = ep4Var.w;
            boolean z5 = ep4Var.x;
            boolean z6 = ep4Var.y;
            int i8 = ep4Var.z;
            int i9 = ep4Var.A;
            jr3 jr3Var2 = ep4Var.B;
            long j = ep4Var.C;
            long j2 = ep4Var.D;
            long j3 = ep4Var.E;
            qh6 qh6Var = ep4Var.F;
            hh6 hh6Var = ep4Var.G;
            if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
                z = false;
            } else {
                z = true;
            }
            io3.B(z);
            k.s = new ep4(yx1Var, i, sk5Var, jo4Var, jo4Var2, i2, rn4Var, i3, z2, hv6Var, kf6Var, i4, jr3Var, f, f2, ruVar, i5, c31Var, rf1Var, i6, z3, z4, i7, i8, i9, z5, z6, jr3Var2, j, j2, j3, qh6Var, hh6Var);
            k.c.a(true, true);
        }
    }

    @Override // defpackage.io4
    public final void c(int i) {
        boolean z;
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            ep4 ep4Var = k.s;
            yx1 yx1Var = ep4Var.a;
            int i2 = ep4Var.b;
            sk5 sk5Var = ep4Var.c;
            jo4 jo4Var = ep4Var.d;
            jo4 jo4Var2 = ep4Var.e;
            int i3 = ep4Var.f;
            rn4 rn4Var = ep4Var.g;
            int i4 = ep4Var.h;
            boolean z2 = ep4Var.i;
            kf6 kf6Var = ep4Var.j;
            int i5 = ep4Var.k;
            hv6 hv6Var = ep4Var.l;
            jr3 jr3Var = ep4Var.m;
            float f = ep4Var.n;
            float f2 = ep4Var.o;
            ru ruVar = ep4Var.q;
            c31 c31Var = ep4Var.r;
            rf1 rf1Var = ep4Var.s;
            int i6 = ep4Var.t;
            boolean z3 = ep4Var.u;
            boolean z4 = ep4Var.v;
            int i7 = ep4Var.w;
            boolean z5 = ep4Var.x;
            boolean z6 = ep4Var.y;
            int i8 = ep4Var.z;
            int i9 = ep4Var.A;
            jr3 jr3Var2 = ep4Var.B;
            long j = ep4Var.C;
            long j2 = ep4Var.D;
            long j3 = ep4Var.E;
            qh6 qh6Var = ep4Var.F;
            hh6 hh6Var = ep4Var.G;
            if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
                z = false;
            } else {
                z = true;
            }
            io3.B(z);
            k.s = new ep4(yx1Var, i2, sk5Var, jo4Var, jo4Var2, i3, rn4Var, i4, z2, hv6Var, kf6Var, i5, jr3Var, f, f2, ruVar, i, c31Var, rf1Var, i6, z3, z4, i7, i8, i9, z5, z6, jr3Var2, j, j2, j3, qh6Var, hh6Var);
            k.c.a(true, true);
            try {
                k.h.k.getClass();
            } catch (RemoteException e) {
                kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.io4
    public final void d(int i) {
        boolean z;
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            ep4 ep4Var = k.s;
            yx1 yx1Var = ep4Var.a;
            int i2 = ep4Var.b;
            sk5 sk5Var = ep4Var.c;
            jo4 jo4Var = ep4Var.d;
            jo4 jo4Var2 = ep4Var.e;
            int i3 = ep4Var.f;
            rn4 rn4Var = ep4Var.g;
            boolean z2 = ep4Var.i;
            kf6 kf6Var = ep4Var.j;
            int i4 = ep4Var.k;
            hv6 hv6Var = ep4Var.l;
            jr3 jr3Var = ep4Var.m;
            float f = ep4Var.n;
            float f2 = ep4Var.o;
            int i5 = ep4Var.p;
            ru ruVar = ep4Var.q;
            c31 c31Var = ep4Var.r;
            rf1 rf1Var = ep4Var.s;
            int i6 = ep4Var.t;
            boolean z3 = ep4Var.u;
            boolean z4 = ep4Var.v;
            int i7 = ep4Var.w;
            boolean z5 = ep4Var.x;
            boolean z6 = ep4Var.y;
            int i8 = ep4Var.z;
            int i9 = ep4Var.A;
            jr3 jr3Var2 = ep4Var.B;
            long j = ep4Var.C;
            long j2 = ep4Var.D;
            long j3 = ep4Var.E;
            qh6 qh6Var = ep4Var.F;
            hh6 hh6Var = ep4Var.G;
            if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
                z = false;
            } else {
                z = true;
            }
            io3.B(z);
            k.s = new ep4(yx1Var, i2, sk5Var, jo4Var, jo4Var2, i3, rn4Var, i, z2, hv6Var, kf6Var, i4, jr3Var, f, f2, ruVar, i5, c31Var, rf1Var, i6, z3, z4, i7, i8, i9, z5, z6, jr3Var2, j, j2, j3, qh6Var, hh6Var);
            k.c.a(true, true);
            try {
                k.h.k.m(i);
            } catch (RemoteException e) {
                kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.io4
    public final void g(int i) {
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            ep4 ep4Var = k.s;
            k.s = ep4Var.b(ep4Var.w, i, ep4Var.v);
            k.c.a(true, true);
            try {
                wu3 wu3Var = (wu3) k.h.k.B;
                bu3 bu3Var = wu3Var.i;
                bu3Var.t();
                wu3Var.Y(bu3Var.t);
            } catch (RemoteException e) {
                kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.io4
    public final void j(jo4 jo4Var, jo4 jo4Var2, int i) {
        boolean z;
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            ep4 ep4Var = k.s;
            yx1 yx1Var = ep4Var.a;
            int i2 = ep4Var.b;
            sk5 sk5Var = ep4Var.c;
            rn4 rn4Var = ep4Var.g;
            int i3 = ep4Var.h;
            boolean z2 = ep4Var.i;
            kf6 kf6Var = ep4Var.j;
            int i4 = ep4Var.k;
            hv6 hv6Var = ep4Var.l;
            jr3 jr3Var = ep4Var.m;
            float f = ep4Var.n;
            float f2 = ep4Var.o;
            int i5 = ep4Var.p;
            ru ruVar = ep4Var.q;
            c31 c31Var = ep4Var.r;
            rf1 rf1Var = ep4Var.s;
            int i6 = ep4Var.t;
            boolean z3 = ep4Var.u;
            boolean z4 = ep4Var.v;
            int i7 = ep4Var.w;
            boolean z5 = ep4Var.x;
            boolean z6 = ep4Var.y;
            int i8 = ep4Var.z;
            int i9 = ep4Var.A;
            jr3 jr3Var2 = ep4Var.B;
            long j = ep4Var.C;
            long j2 = ep4Var.D;
            long j3 = ep4Var.E;
            qh6 qh6Var = ep4Var.F;
            hh6 hh6Var = ep4Var.G;
            if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
                z = false;
            } else {
                z = true;
            }
            io3.B(z);
            k.s = new ep4(yx1Var, i2, sk5Var, jo4Var, jo4Var2, i, rn4Var, i3, z2, hv6Var, kf6Var, i4, jr3Var, f, f2, ruVar, i5, c31Var, rf1Var, i6, z3, z4, i7, i8, i9, z5, z6, jr3Var2, j, j2, j3, qh6Var, hh6Var);
            k.c.a(true, true);
            try {
                wu3 wu3Var = (wu3) k.h.k.B;
                bu3 bu3Var = wu3Var.i;
                bu3Var.t();
                wu3Var.Y(bu3Var.t);
            } catch (RemoteException e) {
                kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    public final bu3 k() {
        return (bu3) this.a.get();
    }

    @Override // defpackage.io4
    public final void n(ru ruVar) {
        boolean z;
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) != null) {
                ep4 ep4Var = k.s;
                yx1 yx1Var = ep4Var.a;
                int i = ep4Var.b;
                sk5 sk5Var = ep4Var.c;
                jo4 jo4Var = ep4Var.d;
                jo4 jo4Var2 = ep4Var.e;
                int i2 = ep4Var.f;
                rn4 rn4Var = ep4Var.g;
                int i3 = ep4Var.h;
                boolean z2 = ep4Var.i;
                kf6 kf6Var = ep4Var.j;
                int i4 = ep4Var.k;
                hv6 hv6Var = ep4Var.l;
                jr3 jr3Var = ep4Var.m;
                float f = ep4Var.n;
                float f2 = ep4Var.o;
                int i5 = ep4Var.p;
                c31 c31Var = ep4Var.r;
                rf1 rf1Var = ep4Var.s;
                int i6 = ep4Var.t;
                boolean z3 = ep4Var.u;
                boolean z4 = ep4Var.v;
                int i7 = ep4Var.w;
                boolean z5 = ep4Var.x;
                boolean z6 = ep4Var.y;
                int i8 = ep4Var.z;
                int i9 = ep4Var.A;
                jr3 jr3Var2 = ep4Var.B;
                long j = ep4Var.C;
                long j2 = ep4Var.D;
                long j3 = ep4Var.E;
                qh6 qh6Var = ep4Var.F;
                hh6 hh6Var = ep4Var.G;
                if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
                    z = false;
                } else {
                    z = true;
                }
                io3.B(z);
                k.s = new ep4(yx1Var, i, sk5Var, jo4Var, jo4Var2, i2, rn4Var, i3, z2, hv6Var, kf6Var, i4, jr3Var, f, f2, ruVar, i5, c31Var, rf1Var, i6, z3, z4, i7, i8, i9, z5, z6, jr3Var2, j, j2, j3, qh6Var, hh6Var);
                k.c.a(true, true);
                try {
                    wu3 wu3Var = (wu3) k.h.k.B;
                    bu3 bu3Var = wu3Var.i;
                    bu3Var.t();
                    if (!bu3Var.t.getDeviceInfo().a) {
                        ((mt3) wu3Var.o.y).a.setPlaybackToLocal(ruVar.b());
                    }
                } catch (RemoteException e) {
                    kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
                }
            }
        }
    }

    @Override // defpackage.io4
    public final void o(hh6 hh6Var) {
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            k.s = k.s.d(hh6Var);
            k.c.a(true, true);
            k.d(new qi2((byte) 12));
        }
    }

    @Override // defpackage.io4
    public final void q(boolean z) {
        boolean z2;
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            ep4 ep4Var = k.s;
            yx1 yx1Var = ep4Var.a;
            int i = ep4Var.b;
            sk5 sk5Var = ep4Var.c;
            jo4 jo4Var = ep4Var.d;
            jo4 jo4Var2 = ep4Var.e;
            int i2 = ep4Var.f;
            rn4 rn4Var = ep4Var.g;
            int i3 = ep4Var.h;
            boolean z3 = ep4Var.i;
            kf6 kf6Var = ep4Var.j;
            int i4 = ep4Var.k;
            hv6 hv6Var = ep4Var.l;
            jr3 jr3Var = ep4Var.m;
            float f = ep4Var.n;
            float f2 = ep4Var.o;
            int i5 = ep4Var.p;
            ru ruVar = ep4Var.q;
            c31 c31Var = ep4Var.r;
            rf1 rf1Var = ep4Var.s;
            int i6 = ep4Var.t;
            boolean z4 = ep4Var.u;
            boolean z5 = ep4Var.v;
            int i7 = ep4Var.w;
            boolean z6 = ep4Var.x;
            int i8 = ep4Var.z;
            int i9 = ep4Var.A;
            jr3 jr3Var2 = ep4Var.B;
            long j = ep4Var.C;
            long j2 = ep4Var.D;
            long j3 = ep4Var.E;
            qh6 qh6Var = ep4Var.F;
            hh6 hh6Var = ep4Var.G;
            if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
                z2 = false;
            } else {
                z2 = true;
            }
            io3.B(z2);
            k.s = new ep4(yx1Var, i, sk5Var, jo4Var, jo4Var2, i2, rn4Var, i3, z3, hv6Var, kf6Var, i4, jr3Var, f, f2, ruVar, i5, c31Var, rf1Var, i6, z4, z5, i7, i8, i9, z6, z, jr3Var2, j, j2, j3, qh6Var, hh6Var);
            k.c.a(true, true);
            try {
                k.h.k.getClass();
            } catch (RemoteException e) {
                kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
            }
            k.r();
        }
    }

    @Override // defpackage.io4
    public final void r(int i, boolean z) {
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            ep4 ep4Var = k.s;
            k.s = ep4Var.b(i, ep4Var.z, z);
            k.c.a(true, true);
            try {
                wu3 wu3Var = (wu3) k.h.k.B;
                bu3 bu3Var = wu3Var.i;
                bu3Var.t();
                wu3Var.Y(bu3Var.t);
            } catch (RemoteException e) {
                kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.io4
    public final void s(float f) {
        boolean z;
        bu3 k = k();
        if (k == null) {
            return;
        }
        k.t();
        ep4 ep4Var = k.s;
        yx1 yx1Var = ep4Var.a;
        int i = ep4Var.b;
        sk5 sk5Var = ep4Var.c;
        jo4 jo4Var = ep4Var.d;
        jo4 jo4Var2 = ep4Var.e;
        int i2 = ep4Var.f;
        rn4 rn4Var = ep4Var.g;
        int i3 = ep4Var.h;
        boolean z2 = ep4Var.i;
        kf6 kf6Var = ep4Var.j;
        int i4 = ep4Var.k;
        hv6 hv6Var = ep4Var.l;
        jr3 jr3Var = ep4Var.m;
        float f2 = ep4Var.n;
        int i5 = ep4Var.p;
        ru ruVar = ep4Var.q;
        c31 c31Var = ep4Var.r;
        rf1 rf1Var = ep4Var.s;
        int i6 = ep4Var.t;
        boolean z3 = ep4Var.u;
        boolean z4 = ep4Var.v;
        int i7 = ep4Var.w;
        boolean z5 = ep4Var.x;
        boolean z6 = ep4Var.y;
        int i8 = ep4Var.z;
        int i9 = ep4Var.A;
        jr3 jr3Var2 = ep4Var.B;
        long j = ep4Var.C;
        long j2 = ep4Var.D;
        long j3 = ep4Var.E;
        qh6 qh6Var = ep4Var.F;
        hh6 hh6Var = ep4Var.G;
        if (f != 0.0f) {
            f2 = f;
        }
        if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
            z = false;
        } else {
            z = true;
        }
        io3.B(z);
        k.s = new ep4(yx1Var, i, sk5Var, jo4Var, jo4Var2, i2, rn4Var, i3, z2, hv6Var, kf6Var, i4, jr3Var, f, f2, ruVar, i5, c31Var, rf1Var, i6, z3, z4, i7, i8, i9, z5, z6, jr3Var2, j, j2, j3, qh6Var, hh6Var);
        k.c.a(true, true);
        try {
            k.h.k.getClass();
        } catch (RemoteException e) {
            kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.io4
    public final void t(int i, ar3 ar3Var) {
        boolean z;
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            ep4 ep4Var = k.s;
            yx1 yx1Var = ep4Var.a;
            sk5 sk5Var = ep4Var.c;
            jo4 jo4Var = ep4Var.d;
            jo4 jo4Var2 = ep4Var.e;
            int i2 = ep4Var.f;
            rn4 rn4Var = ep4Var.g;
            int i3 = ep4Var.h;
            boolean z2 = ep4Var.i;
            kf6 kf6Var = ep4Var.j;
            int i4 = ep4Var.k;
            hv6 hv6Var = ep4Var.l;
            jr3 jr3Var = ep4Var.m;
            float f = ep4Var.n;
            float f2 = ep4Var.o;
            int i5 = ep4Var.p;
            ru ruVar = ep4Var.q;
            c31 c31Var = ep4Var.r;
            rf1 rf1Var = ep4Var.s;
            int i6 = ep4Var.t;
            boolean z3 = ep4Var.u;
            boolean z4 = ep4Var.v;
            int i7 = ep4Var.w;
            boolean z5 = ep4Var.x;
            boolean z6 = ep4Var.y;
            int i8 = ep4Var.z;
            int i9 = ep4Var.A;
            jr3 jr3Var2 = ep4Var.B;
            long j = ep4Var.C;
            long j2 = ep4Var.D;
            long j3 = ep4Var.E;
            qh6 qh6Var = ep4Var.F;
            hh6 hh6Var = ep4Var.G;
            if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
                z = false;
            } else {
                z = true;
            }
            io3.B(z);
            k.s = new ep4(yx1Var, i, sk5Var, jo4Var, jo4Var2, i2, rn4Var, i3, z2, hv6Var, kf6Var, i4, jr3Var, f, f2, ruVar, i5, c31Var, rf1Var, i6, z3, z4, i7, i8, i9, z5, z6, jr3Var2, j, j2, j3, qh6Var, hh6Var);
            k.c.a(true, true);
            try {
                k.h.k.j(ar3Var);
            } catch (RemoteException e) {
                kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.io4
    public final void v(int i) {
        boolean z;
        bu3 k = k();
        if (k != null) {
            k.t();
            fq4 fq4Var = (fq4) this.b.get();
            if (fq4Var == null) {
                return;
            }
            ep4 ep4Var = k.s;
            yx1 X = fq4Var.X();
            int i2 = ep4Var.b;
            sk5 sk5Var = ep4Var.c;
            jo4 jo4Var = ep4Var.d;
            jo4 jo4Var2 = ep4Var.e;
            int i3 = ep4Var.f;
            rn4 rn4Var = ep4Var.g;
            int i4 = ep4Var.h;
            boolean z2 = ep4Var.i;
            kf6 kf6Var = ep4Var.j;
            int i5 = ep4Var.k;
            hv6 hv6Var = ep4Var.l;
            jr3 jr3Var = ep4Var.m;
            float f = ep4Var.n;
            float f2 = ep4Var.o;
            int i6 = ep4Var.p;
            ru ruVar = ep4Var.q;
            c31 c31Var = ep4Var.r;
            rf1 rf1Var = ep4Var.s;
            int i7 = ep4Var.t;
            boolean z3 = ep4Var.u;
            boolean z4 = ep4Var.v;
            int i8 = ep4Var.w;
            boolean z5 = ep4Var.y;
            int i9 = ep4Var.z;
            jr3 jr3Var2 = ep4Var.B;
            long j = ep4Var.C;
            long j2 = ep4Var.D;
            long j3 = ep4Var.E;
            qh6 qh6Var = ep4Var.F;
            hh6 hh6Var = ep4Var.G;
            boolean z6 = false;
            if (i == 3 && z4 && i9 == 0) {
                z6 = true;
            }
            if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
                z = false;
            } else {
                z = true;
            }
            io3.B(z);
            k.s = new ep4(X, i2, sk5Var, jo4Var, jo4Var2, i3, rn4Var, i4, z2, hv6Var, kf6Var, i5, jr3Var, f, f2, ruVar, i6, c31Var, rf1Var, i7, z3, z4, i8, i9, i, z6, z5, jr3Var2, j, j2, j3, qh6Var, hh6Var);
            k.c.a(true, true);
            try {
                uu3 uu3Var = k.h.k;
                fq4Var.X();
                wu3 wu3Var = (wu3) uu3Var.B;
                bu3 bu3Var = wu3Var.i;
                bu3Var.t();
                wu3Var.Y(bu3Var.t);
            } catch (RemoteException e) {
                kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.io4
    public final void x(boolean z) {
        boolean z2;
        bu3 k = k();
        if (k != null) {
            k.t();
            if (((fq4) this.b.get()) == null) {
                return;
            }
            ep4 ep4Var = k.s;
            yx1 yx1Var = ep4Var.a;
            int i = ep4Var.b;
            sk5 sk5Var = ep4Var.c;
            jo4 jo4Var = ep4Var.d;
            jo4 jo4Var2 = ep4Var.e;
            int i2 = ep4Var.f;
            rn4 rn4Var = ep4Var.g;
            int i3 = ep4Var.h;
            kf6 kf6Var = ep4Var.j;
            int i4 = ep4Var.k;
            hv6 hv6Var = ep4Var.l;
            jr3 jr3Var = ep4Var.m;
            float f = ep4Var.n;
            float f2 = ep4Var.o;
            int i5 = ep4Var.p;
            ru ruVar = ep4Var.q;
            c31 c31Var = ep4Var.r;
            rf1 rf1Var = ep4Var.s;
            int i6 = ep4Var.t;
            boolean z3 = ep4Var.u;
            boolean z4 = ep4Var.v;
            int i7 = ep4Var.w;
            boolean z5 = ep4Var.x;
            boolean z6 = ep4Var.y;
            int i8 = ep4Var.z;
            int i9 = ep4Var.A;
            jr3 jr3Var2 = ep4Var.B;
            long j = ep4Var.C;
            long j2 = ep4Var.D;
            long j3 = ep4Var.E;
            qh6 qh6Var = ep4Var.F;
            hh6 hh6Var = ep4Var.G;
            if (!kf6Var.p() && sk5Var.a.b >= kf6Var.o()) {
                z2 = false;
            } else {
                z2 = true;
            }
            io3.B(z2);
            k.s = new ep4(yx1Var, i, sk5Var, jo4Var, jo4Var2, i2, rn4Var, i3, z, hv6Var, kf6Var, i4, jr3Var, f, f2, ruVar, i5, c31Var, rf1Var, i6, z3, z4, i7, i8, i9, z5, z6, jr3Var2, j, j2, j3, qh6Var, hh6Var);
            k.c.a(true, true);
            try {
                k.h.k.n(z);
            } catch (RemoteException e) {
                kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
            }
        }
    }
}
