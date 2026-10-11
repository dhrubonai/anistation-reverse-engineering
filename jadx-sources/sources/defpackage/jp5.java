package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jp5 {
    public final kf6 A;
    public final qh6 B;
    public final jr3 C;
    public final jr3 D;
    public final int E;
    public final int F;
    public final int G;
    public final hp5 H;
    public final hp5 I;
    public final hp5 J;
    public final hp5 K;
    public final hp5 L;
    public final boolean M;
    public final int N;
    public final long O;
    public final boolean P;
    public final go4 a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final yx1 f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final long k;
    public final long l;
    public final rn4 m;
    public final hh6 n;
    public final ru o;
    public final int p;
    public final float q;
    public final float r;
    public final hv6 s;
    public final c31 t;
    public final rf1 u;
    public final int v;
    public final boolean w;
    public final sq5 x;
    public final boolean y;
    public final fy3 z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [ph6] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    public jp5(ip5 ip5Var) {
        boolean z;
        int i;
        long j;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        qh6 qh6Var = ip5Var.C;
        jr3 jr3Var = ip5Var.D;
        boolean z7 = false;
        if (ip5Var.B.p()) {
            int i2 = ip5Var.d;
            if (i2 != 1 && i2 != 4) {
                z5 = false;
            } else {
                z5 = true;
            }
            io3.m("Empty playlist only allowed in STATE_IDLE or STATE_ENDED", z5);
            if (ip5Var.G == -1 && ip5Var.H == -1) {
                z6 = true;
            } else {
                z6 = false;
            }
            io3.m("Ads not allowed if playlist is empty", z6);
            qh6Var = qh6Var == null ? qh6.b : qh6Var;
            if (jr3Var == null) {
                jr3Var = jr3.M;
            }
        } else {
            int i3 = ip5Var.F;
            if (i3 == -1) {
                i = 0;
            } else {
                if (i3 < ip5Var.B.o()) {
                    z = true;
                } else {
                    z = false;
                }
                io3.m("currentMediaItemIndex must be less than playlist.size()", z);
                i = i3;
            }
            if (ip5Var.G != -1) {
                hf6 hf6Var = new hf6();
                jf6 jf6Var = new jf6();
                Long l = ip5Var.I;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = ip5Var.J.get();
                }
                kf6 kf6Var = ip5Var.B;
                ip5Var.B.f(kf6Var.b(kf6Var.i(jf6Var, hf6Var, i, eq6.U(j)).first), hf6Var, false);
                if (ip5Var.G < hf6Var.g.a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                io3.m("PeriodData has less ad groups than adGroupIndex", z2);
                int i4 = hf6Var.g.a(ip5Var.G).a;
                if (i4 != -1) {
                    if (ip5Var.H < i4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    io3.m("Ad group has less ads than adIndexInGroupIndex", z3);
                }
            }
            nw2 nw2Var = ip5Var.A;
            if (nw2Var != null) {
                bp5 bp5Var = (bp5) nw2Var.get(i);
                qh6 qh6Var2 = bp5Var.b;
                jr3Var = bp5Var.d;
                qh6Var = qh6Var2;
            }
            if (jr3Var == null) {
                ar3 ar3Var = ip5Var.B.m(i, new jf6(), 0L).c;
                qh6Var.getClass();
                hr3 hr3Var = new hr3();
                nw2 nw2Var2 = qh6Var.a;
                int size = nw2Var2.size();
                int i5 = 0;
                while (i5 < size) {
                    ?? r12 = (ph6) nw2Var2.get(i5);
                    for (?? r13 = z7; r13 < r12.a; r13++) {
                        if (r12.e[r13]) {
                            ea2 a = r12.a(r13);
                            if (a.m != null) {
                                ?? r15 = z7;
                                while (true) {
                                    ey3[] ey3VarArr = a.m.a;
                                    if (r15 < ey3VarArr.length) {
                                        ey3VarArr[r15].b(hr3Var);
                                        r15++;
                                    }
                                }
                            }
                        }
                        z7 = false;
                    }
                    i5++;
                    z7 = false;
                }
                hr3Var.b(ar3Var.d);
                jr3Var = new jr3(hr3Var);
                z7 = true;
            } else {
                z7 = false;
            }
        }
        if (ip5Var.f != null) {
            if (ip5Var.d == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            io3.m("Player error only allowed in STATE_IDLE", z4);
        }
        int i6 = ip5Var.d;
        if (i6 == 1 || i6 == 4) {
            io3.m("isLoading only allowed when not in STATE_IDLE or STATE_ENDED", !ip5Var.i);
        }
        hp5 hp5Var = ip5Var.J;
        Long l2 = ip5Var.I;
        if (l2 != null) {
            if (ip5Var.G == -1 && ip5Var.b && ip5Var.d == 3 && ip5Var.e == 0 && l2.longValue() != -9223372036854775807L) {
                final long longValue = ip5Var.I.longValue();
                final float f = ip5Var.m.a;
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                hp5Var = new hp5() { // from class: gp5
                    @Override // defpackage.hp5
                    public final long get() {
                        return longValue + (((float) (SystemClock.elapsedRealtime() - elapsedRealtime)) * f);
                    }
                };
            } else {
                hp5Var = new tw(ip5Var.I.longValue());
            }
        }
        hp5 hp5Var2 = ip5Var.K;
        this.a = ip5Var.a;
        this.b = ip5Var.b;
        this.c = ip5Var.c;
        this.d = ip5Var.d;
        this.e = ip5Var.e;
        this.f = ip5Var.f;
        this.g = ip5Var.g;
        this.h = ip5Var.h;
        this.i = ip5Var.i;
        this.j = ip5Var.j;
        this.k = ip5Var.k;
        this.l = ip5Var.l;
        this.m = ip5Var.m;
        this.n = ip5Var.n;
        this.o = ip5Var.o;
        this.p = ip5Var.p;
        this.q = ip5Var.q;
        this.r = ip5Var.r;
        this.s = ip5Var.s;
        this.t = ip5Var.t;
        this.u = ip5Var.u;
        this.v = ip5Var.v;
        this.w = ip5Var.w;
        this.x = ip5Var.x;
        this.y = ip5Var.y;
        this.z = ip5Var.z;
        this.A = ip5Var.B;
        qh6Var.getClass();
        this.B = qh6Var;
        this.C = jr3Var;
        this.D = ip5Var.E;
        this.E = ip5Var.F;
        this.F = ip5Var.G;
        this.G = ip5Var.H;
        this.H = hp5Var;
        this.I = hp5Var2;
        this.J = ip5Var.L;
        this.K = ip5Var.M;
        this.L = ip5Var.N;
        this.M = ip5Var.O;
        this.N = ip5Var.P;
        this.O = ip5Var.Q;
        this.P = z7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ip5] */
    public final ip5 a() {
        jr3 jr3Var;
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        obj.m = this.m;
        obj.n = this.n;
        obj.o = this.o;
        obj.p = this.p;
        obj.q = this.q;
        obj.r = this.r;
        obj.s = this.s;
        obj.t = this.t;
        obj.u = this.u;
        obj.v = this.v;
        obj.w = this.w;
        obj.x = this.x;
        obj.y = this.y;
        obj.z = this.z;
        kf6 kf6Var = this.A;
        obj.B = kf6Var;
        if (kf6Var instanceof fp5) {
            obj.A = ((fp5) kf6Var).e;
        } else {
            obj.C = this.B;
            if (this.P) {
                jr3Var = null;
            } else {
                jr3Var = this.C;
            }
            obj.D = jr3Var;
        }
        obj.E = this.D;
        obj.F = this.E;
        obj.G = this.F;
        obj.H = this.G;
        obj.I = null;
        obj.J = this.H;
        obj.K = this.I;
        obj.L = this.J;
        obj.M = this.K;
        obj.N = this.L;
        obj.O = this.M;
        obj.P = this.N;
        obj.Q = this.O;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jp5) {
                jp5 jp5Var = (jp5) obj;
                if (this.b == jp5Var.b && this.c == jp5Var.c && this.a.equals(jp5Var.a) && this.d == jp5Var.d && this.e == jp5Var.e && Objects.equals(this.f, jp5Var.f) && this.g == jp5Var.g && this.h == jp5Var.h && this.i == jp5Var.i && this.j == jp5Var.j && this.k == jp5Var.k && this.l == jp5Var.l && this.m.equals(jp5Var.m) && this.n.equals(jp5Var.n) && this.o.equals(jp5Var.o) && this.q == jp5Var.q && this.r == jp5Var.r && this.s.equals(jp5Var.s) && this.t.equals(jp5Var.t) && this.u.equals(jp5Var.u) && this.v == jp5Var.v && this.w == jp5Var.w && this.x.equals(jp5Var.x) && this.y == jp5Var.y && this.z.equals(jp5Var.z) && this.A.equals(jp5Var.A) && this.B.equals(jp5Var.B) && this.C.equals(jp5Var.C) && this.D.equals(jp5Var.D) && this.E == jp5Var.E && this.F == jp5Var.F && this.G == jp5Var.G && this.H.equals(jp5Var.H) && this.I.equals(jp5Var.I) && this.J.equals(jp5Var.J) && this.K.equals(jp5Var.K) && this.L.equals(jp5Var.L) && this.M == jp5Var.M && this.N == jp5Var.N && this.O == jp5Var.O) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((this.a.hashCode() + 217) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31;
        yx1 yx1Var = this.f;
        if (yx1Var == null) {
            hashCode = 0;
        } else {
            hashCode = yx1Var.hashCode();
        }
        int i = (((((((hashCode2 + hashCode) * 31) + this.g) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31;
        long j = this.j;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.k;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.l;
        int hashCode3 = (((((this.L.hashCode() + ((this.K.hashCode() + ((this.J.hashCode() + ((this.I.hashCode() + ((this.H.hashCode() + ((((((((this.D.hashCode() + ((this.C.hashCode() + ((this.B.a.hashCode() + ((this.A.hashCode() + ((this.z.hashCode() + ((((this.x.hashCode() + ((((((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((Float.floatToRawIntBits(this.r) + ((Float.floatToRawIntBits(this.q) + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.v) * 31) + (this.w ? 1 : 0)) * 31)) * 31) + (this.y ? 1 : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.M ? 1 : 0)) * 31) + this.N) * 31;
        long j4 = this.O;
        return hashCode3 + ((int) ((j4 >>> 32) ^ j4));
    }
}
