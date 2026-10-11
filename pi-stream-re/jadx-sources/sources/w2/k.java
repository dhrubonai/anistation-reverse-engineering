package w2;

import android.util.SparseArray;
import androidx.appcompat.widget.a0;
import c1.r0;
import c1.v;
import d2.g0;
import f1.b0;
import f1.t;
import f1.y;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import r6.m0;
import r6.n1;
import r6.o0;

/* loaded from: classes.dex */
public final class k implements d2.p {
    public static final byte[] I = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final v J = new v(a3.g.k("application/x-emsg"));
    public int A;
    public int B;
    public int C;
    public boolean D;
    public d2.r E;
    public g0[] F;
    public g0[] G;
    public boolean H;

    /* renamed from: a, reason: collision with root package name */
    public final y2.k f10831a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10832b;

    /* renamed from: c, reason: collision with root package name */
    public final List f10833c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f10834d;

    /* renamed from: e, reason: collision with root package name */
    public final t f10835e;

    /* renamed from: f, reason: collision with root package name */
    public final t f10836f;

    /* renamed from: g, reason: collision with root package name */
    public final t f10837g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f10838h;

    /* renamed from: i, reason: collision with root package name */
    public final t f10839i;

    /* renamed from: j, reason: collision with root package name */
    public final y f10840j;

    /* renamed from: k, reason: collision with root package name */
    public final a0 f10841k;

    /* renamed from: l, reason: collision with root package name */
    public final t f10842l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque f10843m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque f10844n;
    public final g0 o;

    /* renamed from: p, reason: collision with root package name */
    public int f10845p;

    /* renamed from: q, reason: collision with root package name */
    public int f10846q;

    /* renamed from: r, reason: collision with root package name */
    public long f10847r;

    /* renamed from: s, reason: collision with root package name */
    public int f10848s;

    /* renamed from: t, reason: collision with root package name */
    public t f10849t;

    /* renamed from: u, reason: collision with root package name */
    public long f10850u;

    /* renamed from: v, reason: collision with root package name */
    public int f10851v;

    /* renamed from: w, reason: collision with root package name */
    public long f10852w;

    /* renamed from: x, reason: collision with root package name */
    public long f10853x;

    /* renamed from: y, reason: collision with root package name */
    public long f10854y;

    /* renamed from: z, reason: collision with root package name */
    public j f10855z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(w1.o oVar) {
        this(oVar, 32, null, n1.f9497e, null);
        m0 m0Var = o0.f9505b;
    }

    public static c1.p b(ArrayList arrayList) {
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            if (bVar.f5247b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.f10796c.f3858a;
                f1.r Q = w7.b.Q(bArr);
                if (Q == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) Q.f3847b;
                }
                if (uuid == null) {
                    f1.o.f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new c1.o(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new c1.p(null, false, (c1.o[]) arrayList2.toArray(new c1.o[0]));
    }

    public static void d(t tVar, int i10, r rVar) {
        boolean z9;
        tVar.G(i10 + 8);
        int f10 = tVar.f() & 16777215;
        if ((f10 & 1) == 0) {
            if ((f10 & 2) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            int y9 = tVar.y();
            if (y9 == 0) {
                Arrays.fill(rVar.f10920l, 0, rVar.f10913e, false);
                return;
            }
            if (y9 == rVar.f10913e) {
                Arrays.fill(rVar.f10920l, 0, y9, z9);
                int i11 = tVar.f3860c - tVar.f3859b;
                t tVar2 = rVar.f10922n;
                tVar2.D(i11);
                rVar.f10919k = true;
                rVar.o = true;
                tVar.d(tVar2.f3858a, 0, tVar2.f3860c);
                tVar2.G(0);
                rVar.o = false;
                return;
            }
            StringBuilder u9 = a3.g.u("Senc sample count ", y9, " is different from fragment sample count");
            u9.append(rVar.f10913e);
            throw r0.a(u9.toString(), null);
        }
        throw r0.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    @Override // d2.p
    public final void a() {
    }

    @Override // d2.p
    public final d2.p c() {
        return this;
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        SparseArray sparseArray = this.f10834d;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((j) sparseArray.valueAt(i10)).d();
        }
        this.f10844n.clear();
        this.f10851v = 0;
        this.f10852w = j10;
        this.f10843m.clear();
        this.f10845p = 0;
        this.f10848s = 0;
    }

    @Override // d2.p
    public final void f(d2.r rVar) {
        int i10;
        int i11 = this.f10832b;
        if ((i11 & 32) == 0) {
            rVar = new y2.n(rVar, this.f10831a);
        }
        this.E = rVar;
        int i12 = 0;
        this.f10845p = 0;
        this.f10848s = 0;
        g0[] g0VarArr = new g0[2];
        this.F = g0VarArr;
        g0 g0Var = this.o;
        if (g0Var != null) {
            g0VarArr[0] = g0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i13 = 100;
        if ((i11 & 4) != 0) {
            g0VarArr[i10] = rVar.i(100, 5);
            i13 = 101;
            i10++;
        }
        g0[] g0VarArr2 = (g0[]) b0.Q(i10, this.F);
        this.F = g0VarArr2;
        for (g0 g0Var2 : g0VarArr2) {
            g0Var2.b(J);
        }
        List list = this.f10833c;
        this.G = new g0[list.size()];
        while (i12 < this.G.length) {
            g0 i14 = this.E.i(i13, 3);
            i14.b((v) list.get(i12));
            this.G[i12] = i14;
            i12++;
            i13++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0370, code lost:
    
        if (r4 >= r13.f10897e) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x07a2, code lost:
    
        r1.f10845p = 0;
        r1.f10848s = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x07a9, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(long r47) {
        /*
            Method dump skipped, instructions count: 1962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.k.g(long):void");
    }

    @Override // d2.p
    public final boolean h(d2.q qVar) {
        return com.bumptech.glide.d.d0(qVar, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01dc, code lost:
    
        if ((r12 & 31) != 6) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x079b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x079d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x030f A[SYNTHETIC] */
    @Override // d2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(d2.q r31, d2.t r32) {
        /*
            Method dump skipped, instructions count: 1966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.k.i(d2.q, d2.t):int");
    }

    public k(y2.k kVar, int i10, y yVar, List list, g0 g0Var) {
        this.f10831a = kVar;
        this.f10832b = i10;
        this.f10840j = yVar;
        this.f10833c = Collections.unmodifiableList(list);
        this.o = g0Var;
        this.f10841k = new a0(15);
        this.f10842l = new t(16);
        this.f10835e = new t(g1.g.f4335a);
        this.f10836f = new t(5);
        this.f10837g = new t();
        byte[] bArr = new byte[16];
        this.f10838h = bArr;
        this.f10839i = new t(bArr);
        this.f10843m = new ArrayDeque();
        this.f10844n = new ArrayDeque();
        this.f10834d = new SparseArray();
        this.f10853x = -9223372036854775807L;
        this.f10852w = -9223372036854775807L;
        this.f10854y = -9223372036854775807L;
        this.E = d2.r.f3190j;
        this.F = new g0[0];
        this.G = new g0[0];
    }
}
