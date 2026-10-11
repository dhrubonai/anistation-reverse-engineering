package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tm2 implements kj3, nj3, ui5, d12, e95 {
    public static final Set w0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final nl2 A;
    public final l7 B;
    public final ea2 C;
    public final xp1 D;
    public final tp1 E;
    public final q18 F;
    public final dn0 G;
    public final eb2 H;
    public final boolean I;
    public final u98 J;
    public final ArrayList K;
    public final List L;
    public final qm2 M;
    public final qm2 N;
    public final Handler O;
    public final ArrayList P;
    public final Map Q;
    public pl0 R;
    public sm2[] S;
    public int[] T;
    public final HashSet U;
    public final SparseIntArray V;
    public rm2 W;
    public int X;
    public int Y;
    public boolean Z;
    public boolean a0;
    public int b0;
    public ea2 c0;
    public ea2 d0;
    public boolean e0;
    public zg6 f0;
    public Set g0;
    public int[] h0;
    public int i0;
    public boolean j0;
    public boolean[] k0;
    public boolean[] l0;
    public long m0;
    public long n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public long r0;
    public boolean s0;
    public long t0;
    public op1 u0;
    public rl2 v0;
    public final String x;
    public final int y;
    public final i75 z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [qm2] */
    /* JADX WARN: Type inference failed for: r3v14, types: [qm2] */
    public tm2(String str, int i, i75 i75Var, nl2 nl2Var, Map map, l7 l7Var, long j, ea2 ea2Var, xp1 xp1Var, tp1 tp1Var, q18 q18Var, eb2 eb2Var, int i2, l04 l04Var) {
        dn0 dn0Var;
        this.x = str;
        this.y = i;
        this.z = i75Var;
        this.A = nl2Var;
        this.Q = map;
        this.B = l7Var;
        this.C = ea2Var;
        this.D = xp1Var;
        this.E = tp1Var;
        this.F = q18Var;
        this.H = eb2Var;
        this.I = i2;
        byte b = 2;
        if (l04Var != null) {
            dn0Var = new dn0(l04Var, b);
        } else {
            dn0Var = new dn0("Loader:HlsSampleStreamWrapper", (byte) 2);
        }
        this.G = dn0Var;
        u98 u98Var = new u98((byte) 2);
        u98Var.z = null;
        final byte b2 = 0;
        u98Var.y = false;
        u98Var.A = null;
        this.J = u98Var;
        this.T = new int[0];
        Set set = w0;
        this.U = new HashSet(set.size());
        this.V = new SparseIntArray(set.size());
        this.S = new sm2[0];
        this.l0 = new boolean[0];
        this.k0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.K = arrayList;
        this.L = Collections.unmodifiableList(arrayList);
        this.P = new ArrayList();
        this.M = new Runnable(this) { // from class: qm2
            public final /* synthetic */ tm2 y;

            {
                this.y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                tm2 tm2Var = this.y;
                switch (b3) {
                    case 0:
                        tm2Var.H();
                        return;
                    default:
                        for (sm2 sm2Var : tm2Var.S) {
                            sm2Var.A(tm2Var.r0);
                        }
                        tm2Var.Z = true;
                        tm2Var.H();
                        return;
                }
            }
        };
        final byte b3 = 1;
        this.N = new Runnable(this) { // from class: qm2
            public final /* synthetic */ tm2 y;

            {
                this.y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b3;
                tm2 tm2Var = this.y;
                switch (b32) {
                    case 0:
                        tm2Var.H();
                        return;
                    default:
                        for (sm2 sm2Var : tm2Var.S) {
                            sm2Var.A(tm2Var.r0);
                        }
                        tm2Var.Z = true;
                        tm2Var.H();
                        return;
                }
            }
        };
        this.O = eq6.p(null);
        this.m0 = j;
        this.n0 = j;
        this.r0 = Long.MIN_VALUE;
    }

    public static ea2 A(ea2 ea2Var, ea2 ea2Var2, boolean z) {
        String b;
        int i;
        int i2;
        if (ea2Var == null) {
            return ea2Var2;
        }
        String str = ea2Var.l;
        String str2 = ea2Var2.p;
        int h = qy3.h(str2);
        if (eq6.w(h, str) == 1) {
            b = eq6.x(h, str);
            str2 = qy3.d(b);
        } else {
            b = qy3.b(str, str2);
        }
        da2 a = ea2Var2.a();
        a.a = ea2Var.a;
        a.b = ea2Var.b;
        a.c = nw2.o(ea2Var.c);
        a.d = ea2Var.d;
        a.e = ea2Var.e;
        a.f = ea2Var.f;
        if (z) {
            i = ea2Var.i;
        } else {
            i = -1;
        }
        a.i = i;
        if (z) {
            i2 = ea2Var.j;
        } else {
            i2 = -1;
        }
        a.j = i2;
        a.k = b;
        if (h == 2) {
            a.v = ea2Var.w;
            a.w = ea2Var.x;
            a.a(ea2Var.B);
        }
        if (str2 != null) {
            a.o = qy3.n(str2);
        }
        int i3 = ea2Var.J;
        if (i3 != -1 && h == 1) {
            a.I = i3;
        }
        fy3 fy3Var = ea2Var.m;
        if (fy3Var != null) {
            fy3 fy3Var2 = ea2Var2.m;
            if (fy3Var2 != null) {
                fy3Var = fy3Var2.b(fy3Var);
            }
            a.l = fy3Var;
        }
        return new ea2(a);
    }

    public static int E(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 1;
        }
        return 0;
    }

    public static vg1 y(int i, int i2) {
        kb0.O("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new vg1();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    @Override // defpackage.kj3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.q03 B(defpackage.mj3 r23, long r24, long r26, java.io.IOException r28, int r29) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm2.B(mj3, long, long, java.io.IOException, int):q03");
    }

    public final void C(int i) {
        ArrayList arrayList;
        boolean z;
        g90 g90Var;
        boolean z2 = true;
        io3.B(!this.G.F());
        int i2 = i;
        while (true) {
            arrayList = this.K;
            if (i2 < arrayList.size()) {
                if (x(i2)) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 == -1) {
            return;
        }
        long j = D().h;
        rl2 rl2Var = (rl2) arrayList.get(i2);
        eq6.b0(arrayList, i2, arrayList.size());
        int i3 = 0;
        while (i3 < this.S.length) {
            int e = rl2Var.e(i3);
            sm2 sm2Var = this.S[i3];
            dy1 dy1Var = sm2Var.a;
            l7 l7Var = (l7) dy1Var.c;
            long k = sm2Var.k(e);
            int i4 = dy1Var.a;
            if (k <= dy1Var.b) {
                z = z2;
            } else {
                z = false;
            }
            io3.n(z);
            dy1Var.b = k;
            if (k != 0) {
                g90 g90Var2 = (g90) dy1Var.e;
                if (k != g90Var2.x) {
                    while (true) {
                        long j2 = dy1Var.b;
                        long j3 = g90Var2.y;
                        g90Var = (g90) g90Var2.A;
                        if (j2 <= j3) {
                            break;
                        } else {
                            g90Var2 = g90Var;
                        }
                    }
                    g90Var.getClass();
                    if (((k7) g90Var.z) != null) {
                        l7Var.a(g90Var);
                        g90Var.z = null;
                        g90Var.A = null;
                    }
                    g90 g90Var3 = new g90(g90Var2.y, i4);
                    g90Var2.A = g90Var3;
                    if (dy1Var.b == g90Var2.y) {
                        g90Var2 = g90Var3;
                    }
                    dy1Var.g = g90Var2;
                    if (((g90) dy1Var.f) == g90Var) {
                        dy1Var.f = g90Var3;
                    }
                    i3++;
                    z2 = true;
                }
            }
            g90 g90Var4 = (g90) dy1Var.e;
            if (((k7) g90Var4.z) != null) {
                l7Var.a(g90Var4);
                g90Var4.z = null;
                g90Var4.A = null;
            }
            g90 g90Var5 = new g90(dy1Var.b, i4);
            dy1Var.e = g90Var5;
            dy1Var.f = g90Var5;
            dy1Var.g = g90Var5;
            i3++;
            z2 = true;
        }
        if (arrayList.isEmpty()) {
            this.n0 = Math.max(this.m0, rl2Var.g);
        } else {
            ((rl2) bx7.z(arrayList)).J = true;
        }
        this.q0 = false;
        fr3 fr3Var = new fr3(1, this.X, null, 3, null, eq6.l0(rl2Var.g), eq6.l0(j));
        eb2 eb2Var = this.H;
        jw3 jw3Var = (jw3) eb2Var.z;
        jw3Var.getClass();
        eb2Var.h(new ia1((Object) eb2Var, (Object) jw3Var, (Object) fr3Var, (byte) 4));
    }

    public final rl2 D() {
        return (rl2) this.K.get(r1.size() - 1);
    }

    public final boolean F() {
        if (this.n0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [sm2[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [sm2[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bh6] */
    /* JADX WARN: Type inference failed for: r5v4, types: [f95, sm2] */
    /* JADX WARN: Type inference failed for: r5v6, types: [vg1] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.d12
    public final bh6 G(int i, int i2) {
        Integer valueOf = Integer.valueOf(i2);
        Set set = w0;
        boolean contains = set.contains(valueOf);
        boolean z = false;
        HashSet hashSet = this.U;
        SparseIntArray sparseIntArray = this.V;
        ?? r5 = 0;
        r5 = 0;
        if (contains) {
            io3.n(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.T[i3] = i;
                }
                r5 = this.T[i3] == i ? this.S[i3] : y(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.S;
                if (i4 >= r1.length) {
                    break;
                }
                if (this.T[i4] == i) {
                    r5 = r1[i4];
                    break;
                }
                i4++;
            }
        }
        if (r5 == 0) {
            if (this.s0) {
                return y(i, i2);
            }
            int length = this.S.length;
            if (i2 == 1 || i2 == 2) {
                z = true;
            }
            r5 = new sm2(this.B, this.D, this.E, this.Q);
            r5.t = this.m0;
            if (z) {
                r5.L = this.u0;
                r5.C = true;
            }
            long j = this.t0;
            if (r5.I != j) {
                r5.I = j;
                r5.C = true;
            }
            if (this.v0 != null) {
                r5.F = r6.k;
            }
            r5.f = this;
            int i5 = length + 1;
            int[] copyOf = Arrays.copyOf(this.T, i5);
            this.T = copyOf;
            copyOf[length] = i;
            sm2[] sm2VarArr = this.S;
            String str = eq6.a;
            ?? copyOf2 = Arrays.copyOf(sm2VarArr, sm2VarArr.length + 1);
            copyOf2[sm2VarArr.length] = r5;
            this.S = (sm2[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.l0, i5);
            this.l0 = copyOf3;
            copyOf3[length] = z;
            this.j0 |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (E(i2) > E(this.X)) {
                this.Y = length;
                this.X = i2;
            }
            this.k0 = Arrays.copyOf(this.k0, i5);
        }
        if (i2 == 5) {
            rm2 rm2Var = this.W;
            if (rm2Var == null) {
                rm2 rm2Var2 = new rm2(r5, this.I ? 1 : 0);
                this.W = rm2Var2;
                return rm2Var2;
            }
            return rm2Var;
        }
        return r5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H() {
        boolean z;
        int i;
        ea2 A;
        if (!this.e0 && this.h0 == null && this.Z) {
            int i2 = 0;
            for (sm2 sm2Var : this.S) {
                if (sm2Var.r() == null) {
                    return;
                }
            }
            zg6 zg6Var = this.f0;
            if (zg6Var != null) {
                int i3 = zg6Var.a;
                int[] iArr = new int[i3];
                this.h0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        sm2[] sm2VarArr = this.S;
                        if (i5 < sm2VarArr.length) {
                            ea2 r = sm2VarArr[i5].r();
                            r.getClass();
                            ea2 ea2Var = this.f0.a(i4).d[0];
                            String str = r.p;
                            String str2 = ea2Var.p;
                            int h = qy3.h(str);
                            if (h != 3) {
                                if (h == qy3.h(str2)) {
                                    break;
                                } else {
                                    i5++;
                                }
                            } else {
                                if (Objects.equals(str, str2)) {
                                    if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || r.P == ea2Var.P) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i5++;
                            }
                        }
                    }
                    this.h0[i4] = i5;
                }
                ArrayList arrayList = this.P;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((pm2) obj).a();
                }
                return;
            }
            int length = this.S.length;
            int i6 = 0;
            int i7 = -1;
            int i8 = -2;
            while (true) {
                int i9 = 1;
                if (i6 >= length) {
                    break;
                }
                ea2 r2 = this.S[i6].r();
                r2.getClass();
                String str3 = r2.p;
                if (qy3.m(str3)) {
                    i9 = 2;
                } else if (!qy3.i(str3)) {
                    if (qy3.l(str3)) {
                        i9 = 3;
                    } else {
                        i9 = -2;
                    }
                }
                if (E(i9) > E(i8)) {
                    i7 = i6;
                    i8 = i9;
                } else if (i9 == i8 && i7 != -1) {
                    i7 = -1;
                }
                i6++;
            }
            yg6 yg6Var = this.A.i;
            int i10 = yg6Var.a;
            this.i0 = -1;
            this.h0 = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.h0[i11] = i11;
            }
            yg6[] yg6VarArr = new yg6[length];
            int i12 = 0;
            while (i12 < length) {
                ea2 r3 = this.S[i12].r();
                r3.getClass();
                ea2 ea2Var2 = this.C;
                String str4 = this.x;
                if (i12 == i7) {
                    ea2[] ea2VarArr = new ea2[i10];
                    for (int i13 = i2; i13 < i10; i13++) {
                        ea2 ea2Var3 = yg6Var.d[i13];
                        if (i8 == 1 && ea2Var2 != null) {
                            ea2Var3 = ea2Var3.e(ea2Var2);
                        }
                        if (i10 == 1) {
                            A = r3.e(ea2Var3);
                        } else {
                            A = A(ea2Var3, r3, true);
                        }
                        ea2VarArr[i13] = A;
                    }
                    yg6VarArr[i12] = new yg6(str4, ea2VarArr);
                    this.i0 = i12;
                    i = 0;
                } else {
                    if (i8 != 2 || !qy3.i(r3.p)) {
                        ea2Var2 = null;
                    }
                    StringBuilder sb = new StringBuilder(str4);
                    sb.append(":muxed:");
                    sb.append(i12 < i7 ? i12 : i12 - 1);
                    String sb2 = sb.toString();
                    i = 0;
                    da2 a = A(ea2Var2, r3, false).a();
                    a.m = str4;
                    yg6VarArr[i12] = new yg6(sb2, new ea2(a));
                }
                i12++;
                i2 = i;
            }
            int i14 = i2;
            this.f0 = z(yg6VarArr);
            if (this.g0 == null) {
                z = 1;
            } else {
                z = i14;
            }
            io3.B(z);
            this.g0 = Collections.EMPTY_SET;
            this.a0 = true;
            this.z.q();
        }
    }

    public final void J() {
        dn0 dn0Var = this.G;
        IOException iOException = (IOException) dn0Var.A;
        if (iOException == null) {
            lj3 lj3Var = (lj3) dn0Var.z;
            if (lj3Var != null) {
                int i = lj3Var.x;
                IOException iOException2 = lj3Var.B;
                if (iOException2 != null && lj3Var.C > i) {
                    throw iOException2;
                }
            }
            nl2 nl2Var = this.A;
            s50 s50Var = nl2Var.o;
            if (s50Var == null) {
                Uri uri = nl2Var.p;
                if (uri != null && uri.equals(nl2Var.q)) {
                    nl2Var.g.j(nl2Var.p);
                    return;
                }
                return;
            }
            throw s50Var;
        }
        throw iOException;
    }

    public final void K(yg6[] yg6VarArr, int... iArr) {
        this.f0 = z(yg6VarArr);
        this.g0 = new HashSet();
        for (int i : iArr) {
            this.g0.add(this.f0.a(i));
        }
        this.i0 = 0;
        this.O.post(new a92(this.z, (byte) 3));
        this.a0 = true;
    }

    public final void L() {
        for (sm2 sm2Var : this.S) {
            sm2Var.x(this.o0);
        }
        this.o0 = false;
    }

    public final boolean M(long j, boolean z) {
        rl2 rl2Var;
        boolean z2;
        boolean z3;
        this.m0 = j;
        if (F()) {
            this.n0 = j;
            return true;
        }
        boolean z4 = this.A.r;
        ArrayList arrayList = this.K;
        if (z4) {
            for (int i = 0; i < arrayList.size(); i++) {
                rl2Var = (rl2) arrayList.get(i);
                if (rl2Var.g == j) {
                    break;
                }
            }
        }
        rl2Var = null;
        if (this.Z && !z && !arrayList.isEmpty()) {
            int length = this.S.length;
            for (int i2 = 0; i2 < length; i2++) {
                sm2 sm2Var = this.S[i2];
                if (rl2Var != null) {
                    z3 = sm2Var.y(rl2Var.e(i2));
                } else {
                    long f = f();
                    if (f != Long.MIN_VALUE && j >= f) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    z3 = sm2Var.z(j, z2);
                }
                if (z3 || (!this.l0[i2] && this.j0)) {
                }
            }
            return false;
        }
        this.n0 = j;
        this.q0 = false;
        arrayList.clear();
        dn0 dn0Var = this.G;
        if (dn0Var.F()) {
            if (this.Z) {
                for (sm2 sm2Var2 : this.S) {
                    sm2Var2.j();
                }
            }
            dn0Var.p();
            return true;
        }
        dn0Var.A = null;
        L();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(long r7) {
        /*
            r6 = this;
            boolean r0 = r6.q0
            r1 = 0
            if (r0 == 0) goto L17
            long r2 = r6.r0
            r4 = -9223372036854775808
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L17
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L15
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
        L15:
            r0 = 1
            goto L18
        L17:
            r0 = r1
        L18:
            r6.r0 = r7
            boolean r2 = r6.Z
            if (r2 == 0) goto L2c
            sm2[] r2 = r6.S
            int r3 = r2.length
            r4 = r1
        L22:
            if (r4 >= r3) goto L2c
            r5 = r2[r4]
            r5.A(r7)
            int r4 = r4 + 1
            goto L22
        L2c:
            if (r0 == 0) goto L35
            r6.q0 = r1
            i75 r7 = r6.z
            r7.g(r6)
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm2.N(long):void");
    }

    @Override // defpackage.nj3
    public final void a() {
        for (sm2 sm2Var : this.S) {
            sm2Var.x(true);
            qp1 qp1Var = sm2Var.h;
            if (qp1Var != null) {
                qp1Var.c(sm2Var.e);
                sm2Var.h = null;
                sm2Var.g = null;
            }
        }
    }

    @Override // defpackage.ui5
    public final boolean d() {
        return this.G.F();
    }

    @Override // defpackage.ui5
    public final long f() {
        if (F()) {
            return this.n0;
        }
        if (this.q0) {
            return Long.MIN_VALUE;
        }
        return D().h;
    }

    @Override // defpackage.kj3
    public final void g(mj3 mj3Var, long j, long j2, boolean z) {
        pl0 pl0Var = (pl0) mj3Var;
        this.R = null;
        hj3 hj3Var = new hj3(pl0Var.a, pl0Var.b, j);
        iy5 iy5Var = pl0Var.i;
        hj3Var.f = iy5Var.z;
        hj3Var.g = iy5Var.A;
        hj3Var.c = j2;
        hj3Var.d = iy5Var.y;
        ij3 ij3Var = new ij3(hj3Var);
        this.F.getClass();
        this.H.p(ij3Var, pl0Var.c, this.y, pl0Var.d, pl0Var.e, pl0Var.f, pl0Var.g, pl0Var.h);
        if (!z) {
            if (F() || this.b0 == 0) {
                L();
            }
            if (this.b0 > 0) {
                this.z.g(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kj3
    public final void k(mj3 mj3Var, long j, long j2) {
        pl0 pl0Var = (pl0) mj3Var;
        this.R = null;
        if (pl0Var instanceof jl2) {
            jl2 jl2Var = (jl2) pl0Var;
            byte[] bArr = jl2Var.j;
            nl2 nl2Var = this.A;
            nl2Var.n = bArr;
            i75 i75Var = nl2Var.k;
            Uri uri = jl2Var.b.a;
            byte[] bArr2 = jl2Var.l;
            bArr2.getClass();
            qb2 qb2Var = (qb2) i75Var.y;
            uri.getClass();
        }
        hj3 hj3Var = new hj3(pl0Var.a, pl0Var.b, j);
        iy5 iy5Var = pl0Var.i;
        hj3Var.f = iy5Var.z;
        hj3Var.g = iy5Var.A;
        hj3Var.c = j2;
        hj3Var.d = iy5Var.y;
        ij3 ij3Var = new ij3(hj3Var);
        this.F.getClass();
        this.H.q(ij3Var, pl0Var.c, this.y, pl0Var.d, pl0Var.e, pl0Var.f, pl0Var.g, pl0Var.h);
        if (!this.a0) {
            pj3 pj3Var = new pj3();
            pj3Var.a = this.m0;
            q(new qj3(pj3Var));
            return;
        }
        this.z.g(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04f1  */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.io.IOException, s50] */
    @Override // defpackage.ui5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(defpackage.qj3 r70) {
        /*
            Method dump skipped, instructions count: 1504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm2.q(qj3):boolean");
    }

    @Override // defpackage.kj3
    public final void r(mj3 mj3Var, long j, long j2, int i) {
        pl0 pl0Var = (pl0) mj3Var;
        hj3 hj3Var = new hj3(pl0Var.a, pl0Var.b, j);
        if (i != 0) {
            iy5 iy5Var = pl0Var.i;
            hj3Var.f = iy5Var.z;
            hj3Var.g = iy5Var.A;
            hj3Var.c = j2;
            hj3Var.d = iy5Var.y;
        }
        this.H.x(new ij3(hj3Var), pl0Var.c, this.y, pl0Var.d, pl0Var.e, pl0Var.f, pl0Var.g, pl0Var.h, i);
    }

    @Override // defpackage.ui5
    public final long s() {
        long j;
        ArrayList arrayList = this.K;
        if (this.q0) {
            return Long.MIN_VALUE;
        }
        if (F()) {
            return this.n0;
        }
        long j2 = this.m0;
        rl2 D = D();
        if (!D.H) {
            if (arrayList.size() > 1) {
                D = (rl2) arrayList.get(arrayList.size() - 2);
            } else {
                D = null;
            }
        }
        if (D != null) {
            j2 = Math.max(j2, D.h);
        }
        if (this.Z) {
            for (sm2 sm2Var : this.S) {
                synchronized (sm2Var) {
                    j = sm2Var.w;
                }
                j2 = Math.max(j2, j);
            }
        }
        return j2;
    }

    @Override // defpackage.d12
    public final void t() {
        this.s0 = true;
        this.O.post(this.N);
    }

    @Override // defpackage.e95
    public final void u() {
        this.O.post(this.M);
    }

    @Override // defpackage.ui5
    public final void v(long j) {
        int size;
        dn0 dn0Var = this.G;
        if (((IOException) dn0Var.A) == null && !F()) {
            boolean F = dn0Var.F();
            boolean z = false;
            nl2 nl2Var = this.A;
            ArrayList arrayList = this.K;
            List list = this.L;
            if (F) {
                pl0 pl0Var = this.R;
                pl0Var.getClass();
                if (!(pl0Var instanceof rl2) || x(arrayList.size() - 1)) {
                    long j2 = this.r0;
                    if (j2 == Long.MIN_VALUE || pl0Var.g < j2) {
                        if (nl2Var.o == null) {
                            z = nl2Var.s.f(j, pl0Var, list);
                        }
                        if (!z) {
                            return;
                        }
                    }
                    dn0Var.p();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && nl2Var.c((rl2) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                C(size2);
            }
            int size3 = arrayList.size();
            if (nl2Var.o == null && nl2Var.s.length() >= 2) {
                size = nl2Var.s.k(j, list);
            } else {
                size = list.size();
            }
            int min = Math.min(size3, size);
            if (this.r0 != Long.MIN_VALUE) {
                while (min > 0 && ((rl2) arrayList.get(min - 1)).g >= this.r0) {
                    min--;
                    z = true;
                }
            }
            if (min < arrayList.size()) {
                C(min);
            }
            if (z) {
                this.n0 = -9223372036854775807L;
                this.q0 = true;
            }
        }
    }

    public final void w() {
        io3.B(this.a0);
        this.f0.getClass();
        this.g0.getClass();
    }

    public final boolean x(int i) {
        int i2 = i;
        while (true) {
            ArrayList arrayList = this.K;
            if (i2 < arrayList.size()) {
                if (((rl2) arrayList.get(i2)).L) {
                    return false;
                }
                i2++;
            } else {
                rl2 rl2Var = (rl2) arrayList.get(i);
                for (int i3 = 0; i3 < this.S.length; i3++) {
                    if (this.S[i3].o() > rl2Var.e(i3)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public final zg6 z(yg6[] yg6VarArr) {
        for (int i = 0; i < yg6VarArr.length; i++) {
            yg6 yg6Var = yg6VarArr[i];
            ea2[] ea2VarArr = new ea2[yg6Var.a];
            for (int i2 = 0; i2 < yg6Var.a; i2++) {
                ea2 ea2Var = yg6Var.d[i2];
                int e = this.D.e(ea2Var);
                da2 a = ea2Var.a();
                a.S = e;
                ea2VarArr[i2] = new ea2(a);
            }
            yg6VarArr[i] = new yg6(yg6Var.b, ea2VarArr);
        }
        return new zg6(yg6VarArr);
    }

    @Override // defpackage.d12
    public final void I(hf5 hf5Var) {
    }
}
