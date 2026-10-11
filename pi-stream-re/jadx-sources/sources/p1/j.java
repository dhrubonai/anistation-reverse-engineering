package p1;

import android.net.Uri;
import android.util.Pair;
import c1.f1;
import f.p0;
import f1.b0;
import h1.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import k1.i0;
import r6.m0;
import r6.n1;
import r6.o0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final k f8440a;

    /* renamed from: b, reason: collision with root package name */
    public final h1.h f8441b;

    /* renamed from: c, reason: collision with root package name */
    public final h1.h f8442c;

    /* renamed from: d, reason: collision with root package name */
    public final p0 f8443d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri[] f8444e;

    /* renamed from: f, reason: collision with root package name */
    public final c1.v[] f8445f;

    /* renamed from: g, reason: collision with root package name */
    public final q1.s f8446g;

    /* renamed from: h, reason: collision with root package name */
    public final f1 f8447h;

    /* renamed from: i, reason: collision with root package name */
    public final List f8448i;

    /* renamed from: k, reason: collision with root package name */
    public final i0 f8450k;

    /* renamed from: l, reason: collision with root package name */
    public final long f8451l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8452m;
    public v1.b o;

    /* renamed from: p, reason: collision with root package name */
    public Uri f8454p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8455q;

    /* renamed from: r, reason: collision with root package name */
    public y1.s f8456r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8458t;

    /* renamed from: j, reason: collision with root package name */
    public final p0 f8449j = new p0((a3.g) null);

    /* renamed from: n, reason: collision with root package name */
    public byte[] f8453n = b0.f3804f;

    /* renamed from: s, reason: collision with root package name */
    public long f8457s = -9223372036854775807L;

    public j(k kVar, q1.s sVar, Uri[] uriArr, c1.v[] vVarArr, c cVar, e0 e0Var, p0 p0Var, long j4, List list, i0 i0Var) {
        this.f8440a = kVar;
        this.f8446g = sVar;
        this.f8444e = uriArr;
        this.f8445f = vVarArr;
        this.f8443d = p0Var;
        this.f8451l = j4;
        this.f8448i = list;
        this.f8450k = i0Var;
        h1.h a10 = cVar.f8429a.a();
        this.f8441b = a10;
        if (e0Var != null) {
            a10.f(e0Var);
        }
        this.f8442c = cVar.f8429a.a();
        this.f8447h = new f1("", vVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((vVarArr[i10].f1928f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f8456r = new h(this.f8447h, com.bumptech.glide.d.e0(arrayList));
    }

    public final w1.p[] a(long j4, l lVar) {
        int b10;
        boolean z9;
        List list;
        if (lVar == null) {
            b10 = -1;
        } else {
            b10 = this.f8447h.b(lVar.f10769d);
        }
        int length = this.f8456r.length();
        w1.p[] pVarArr = new w1.p[length];
        boolean z10 = false;
        int i10 = 0;
        while (i10 < length) {
            int f10 = this.f8456r.f(i10);
            Uri uri = this.f8444e[f10];
            q1.c cVar = (q1.c) this.f8446g;
            if (!cVar.c(uri)) {
                pVarArr[i10] = w1.p.f10792q;
            } else {
                q1.i a10 = cVar.a(z10, uri);
                a10.getClass();
                long j10 = a10.f9012h - cVar.E;
                if (f10 != b10) {
                    z9 = true;
                } else {
                    z9 = z10;
                }
                Pair c6 = c(lVar, z9, a10, j10, j4);
                long longValue = ((Long) c6.first).longValue();
                int intValue = ((Integer) c6.second).intValue();
                int i11 = (int) (longValue - a10.f9015k);
                if (i11 >= 0) {
                    o0 o0Var = a10.f9021r;
                    if (o0Var.size() >= i11) {
                        ArrayList arrayList = new ArrayList();
                        if (i11 < o0Var.size()) {
                            if (intValue != -1) {
                                q1.f fVar = (q1.f) o0Var.get(i11);
                                if (intValue == 0) {
                                    arrayList.add(fVar);
                                } else if (intValue < fVar.D.size()) {
                                    o0 o0Var2 = fVar.D;
                                    arrayList.addAll(o0Var2.subList(intValue, o0Var2.size()));
                                }
                                i11++;
                            }
                            arrayList.addAll(o0Var.subList(i11, o0Var.size()));
                            intValue = 0;
                        }
                        if (a10.f9018n != -9223372036854775807L) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            o0 o0Var3 = a10.f9022s;
                            if (intValue < o0Var3.size()) {
                                arrayList.addAll(o0Var3.subList(intValue, o0Var3.size()));
                            }
                        }
                        list = Collections.unmodifiableList(arrayList);
                        pVarArr[i10] = new g(j10, list);
                    }
                }
                m0 m0Var = o0.f9505b;
                list = n1.f9497e;
                pVarArr[i10] = new g(j10, list);
            }
            i10++;
            z10 = false;
        }
        return pVarArr;
    }

    public final int b(l lVar) {
        o0 o0Var;
        if (lVar.F == -1) {
            return 1;
        }
        q1.i a10 = ((q1.c) this.f8446g).a(false, this.f8444e[this.f8447h.b(lVar.f10769d)]);
        a10.getClass();
        int i10 = (int) (lVar.A - a10.f9015k);
        if (i10 < 0) {
            return 1;
        }
        o0 o0Var2 = a10.f9021r;
        if (i10 < o0Var2.size()) {
            o0Var = ((q1.f) o0Var2.get(i10)).D;
        } else {
            o0Var = a10.f9022s;
        }
        int size = o0Var.size();
        int i11 = lVar.F;
        if (i11 >= size) {
            return 2;
        }
        q1.d dVar = (q1.d) o0Var.get(i11);
        if (dVar.D) {
            return 0;
        }
        if (b0.a(Uri.parse(j5.a.Z(a10.f9046a, dVar.f8994a)), lVar.f10767b.f4597a)) {
            return 1;
        }
        return 2;
    }

    public final Pair c(l lVar, boolean z9, q1.i iVar, long j4, long j10) {
        o0 o0Var;
        long j11;
        boolean z10 = true;
        int i10 = -1;
        if (lVar != null && !z9) {
            boolean z11 = lVar.Z;
            long j12 = lVar.A;
            int i11 = lVar.F;
            if (z11) {
                if (i11 == -1) {
                    j12 = lVar.a();
                }
                Long valueOf = Long.valueOf(j12);
                if (i11 != -1) {
                    i10 = i11 + 1;
                }
                return new Pair(valueOf, Integer.valueOf(i10));
            }
            return new Pair(Long.valueOf(j12), Integer.valueOf(i11));
        }
        long j13 = iVar.f9024u + j4;
        if (lVar != null && !this.f8455q) {
            j10 = lVar.f10772x;
        }
        boolean z12 = iVar.o;
        long j14 = iVar.f9015k;
        o0 o0Var2 = iVar.f9021r;
        if (!z12 && j10 >= j13) {
            return new Pair(Long.valueOf(j14 + o0Var2.size()), -1);
        }
        long j15 = j10 - j4;
        Long valueOf2 = Long.valueOf(j15);
        int i12 = 0;
        if (((q1.c) this.f8446g).D && lVar != null) {
            z10 = false;
        }
        int d10 = b0.d(o0Var2, valueOf2, z10);
        long j16 = d10 + j14;
        if (d10 >= 0) {
            q1.f fVar = (q1.f) o0Var2.get(d10);
            long j17 = fVar.f8998e + fVar.f8996c;
            o0 o0Var3 = iVar.f9022s;
            if (j15 < j17) {
                o0Var = fVar.D;
            } else {
                o0Var = o0Var3;
            }
            while (true) {
                if (i12 >= o0Var.size()) {
                    break;
                }
                q1.d dVar = (q1.d) o0Var.get(i12);
                if (j15 < dVar.f8998e + dVar.f8996c) {
                    if (dVar.C) {
                        if (o0Var == o0Var3) {
                            j11 = 1;
                        } else {
                            j11 = 0;
                        }
                        j16 += j11;
                        i10 = i12;
                    }
                } else {
                    i12++;
                }
            }
        }
        return new Pair(Long.valueOf(j16), Integer.valueOf(i10));
    }

    public final f d(Uri uri, int i10, boolean z9) {
        if (uri == null) {
            return null;
        }
        p0 p0Var = this.f8449j;
        byte[] bArr = (byte[]) ((LinkedHashMap) p0Var.f3762b).remove(uri);
        if (bArr != null) {
            return null;
        }
        return new f(this.f8442c, new h1.l(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 1, null), this.f8445f[i10], this.f8456r.m(), this.f8456r.q(), this.f8453n);
    }
}
