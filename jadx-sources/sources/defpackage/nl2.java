package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nl2 {
    public final x81 a;
    public final q41 b;
    public final q41 c;
    public final sn3 d;
    public final om2[] e;
    public final ea2[] f;
    public final b91 g;
    public final ol2 h;
    public final yg6 i;
    public final List j;
    public final cp4 l;
    public boolean m;
    public s50 o;
    public Uri p;
    public Uri q;
    public boolean r;
    public jz1 s;
    public final i75 k = new i75((byte) 21);
    public byte[] n = eq6.b;
    public long t = -9223372036854775807L;

    /* JADX WARN: Type inference failed for: r3v1, types: [jz1, ll2, y30] */
    public nl2(x81 x81Var, b91 b91Var, om2[] om2VarArr, ea2[] ea2VarArr, i75 i75Var, n71 n71Var, sn3 sn3Var, List list, cp4 cp4Var) {
        this.a = x81Var;
        this.g = b91Var;
        this.h = b91Var.J;
        this.e = om2VarArr;
        this.f = ea2VarArr;
        this.d = sn3Var;
        this.j = list;
        this.l = cp4Var;
        o41 o41Var = (o41) i75Var.y;
        q41 H = o41Var.H();
        this.b = H;
        if (n71Var != null) {
            H.z(n71Var);
        }
        this.c = o41Var.H();
        this.i = new yg6("", ea2VarArr);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < om2VarArr.length; i2++) {
            if ((ea2VarArr[i2].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        yg6 yg6Var = this.i;
        int[] L = jf7.L(arrayList);
        ?? y30Var = new y30(yg6Var, L, null);
        ea2 ea2Var = yg6Var.d[L[0]];
        while (true) {
            if (i < y30Var.b) {
                if (y30Var.d[i] == ea2Var) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        y30Var.h = i;
        this.s = y30Var;
    }

    public static ml2 f(bm2 bm2Var, long j, int i) {
        long j2 = bm2Var.k;
        nw2 nw2Var = bm2Var.s;
        int i2 = (int) (j - j2);
        nw2 nw2Var2 = bm2Var.r;
        if (i2 == nw2Var2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < nw2Var.size()) {
                return new ml2((zl2) nw2Var.get(i), j, i);
            }
            return null;
        }
        yl2 yl2Var = (yl2) nw2Var2.get(i2);
        if (i == -1) {
            return new ml2(yl2Var, j, -1);
        }
        if (i < yl2Var.J.size()) {
            return new ml2((zl2) yl2Var.J.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < nw2Var2.size()) {
            return new ml2((zl2) nw2Var2.get(i3), j + 1, -1);
        }
        if (!nw2Var.isEmpty()) {
            return new ml2((zl2) nw2Var.get(0), j + 1, 0);
        }
        return null;
    }

    public final fj3 a(Uri uri) {
        om2 om2Var;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        b91 b91Var = this.g;
        a91 a91Var = (a91) b91Var.A.get(uri);
        if (a91Var != null) {
            om2Var = a91Var.a;
        } else {
            om2Var = null;
        }
        om2Var.getClass();
        HashMap hashMap = om2Var.b;
        int size = hashMap.size();
        ho6 it = zw2.m(hashMap.values()).iterator();
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            if (b91Var.f((Uri) it.next(), elapsedRealtime)) {
                i++;
            }
        }
        int length = this.s.length();
        ol2 ol2Var = this.h;
        if (ol2Var != null && ol2Var.k) {
            z = true;
        }
        boolean z2 = z;
        return new fj3(z2, size, i, length, d(elapsedRealtime, z2));
    }

    public final ep3[] b(rl2 rl2Var, long j) {
        int a;
        boolean z;
        List list;
        nl2 nl2Var = this;
        rl2 rl2Var2 = rl2Var;
        if (rl2Var2 == null) {
            a = -1;
        } else {
            a = nl2Var.i.a(rl2Var2.d);
        }
        int length = nl2Var.s.length();
        ep3[] ep3VarArr = new ep3[length];
        boolean z2 = false;
        int i = 0;
        while (i < length) {
            int j2 = nl2Var.s.j(i);
            Uri b = nl2Var.e[j2].b();
            b91 b91Var = nl2Var.g;
            if (!b91Var.h(b)) {
                ep3VarArr[i] = ep3.h;
            } else {
                bm2 b2 = b91Var.b(z2, b);
                b2.getClass();
                long j3 = b2.h - b91Var.S;
                if (j2 != a) {
                    z = true;
                } else {
                    z = z2;
                }
                Pair e = nl2Var.e(rl2Var2, z, b2, j3, j);
                long longValue = ((Long) e.first).longValue();
                int intValue = ((Integer) e.second).intValue();
                long j4 = b2.k;
                nw2 nw2Var = b2.s;
                nw2 nw2Var2 = b2.r;
                int i2 = (int) (longValue - j4);
                if (i2 >= 0 && nw2Var2.size() >= i2) {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < nw2Var2.size()) {
                        if (intValue != -1) {
                            yl2 yl2Var = (yl2) nw2Var2.get(i2);
                            if (intValue == 0) {
                                arrayList.add(yl2Var);
                            } else if (intValue < yl2Var.J.size()) {
                                nw2 nw2Var3 = yl2Var.J;
                                arrayList.addAll(nw2Var3.subList(intValue, nw2Var3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(nw2Var2.subList(i2, nw2Var2.size()));
                        intValue = 0;
                    }
                    if (b2.n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < nw2Var.size()) {
                            arrayList.addAll(nw2Var.subList(intValue, nw2Var.size()));
                        }
                    }
                    list = Collections.unmodifiableList(arrayList);
                } else {
                    z62 z62Var = nw2.y;
                    list = o15.B;
                }
                ep3VarArr[i] = new kl2(j3, list);
            }
            i++;
            nl2Var = this;
            rl2Var2 = rl2Var;
            z2 = false;
        }
        return ep3VarArr;
    }

    public final int c(rl2 rl2Var) {
        nw2 nw2Var;
        int i = rl2Var.o;
        if (i != -1) {
            bm2 b = this.g.b(false, rl2Var.m);
            b.getClass();
            nw2 nw2Var2 = b.r;
            int i2 = (int) (rl2Var.j - b.k);
            if (i2 >= 0) {
                if (i2 < nw2Var2.size()) {
                    nw2Var = ((yl2) nw2Var2.get(i2)).J;
                } else {
                    nw2Var = b.s;
                }
                if (i < nw2Var.size()) {
                    wl2 wl2Var = (wl2) nw2Var.get(i);
                    if (wl2Var.J) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(et5.i(b.a, wl2Var.x)), rl2Var.b.a)) {
                        return 1;
                    }
                    return 2;
                }
                return 2;
            }
            return 1;
        }
        return 1;
    }

    public final int d(long j, boolean z) {
        jz1 jz1Var = this.s;
        int length = jz1Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int j2 = jz1Var.j(i2);
            om2[] om2VarArr = this.e;
            b91 b91Var = this.g;
            if (z) {
                if (!jz1Var.a(i2, j) && !b91Var.f(om2VarArr[j2].b(), j)) {
                }
                i++;
            } else {
                if (!jz1Var.a(i2, j) && !b91Var.e(om2VarArr[j2], j)) {
                }
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0 A[EDGE_INSN: B:62:0x00e0->B:64:0x00e0 BREAK  A[LOOP:0: B:47:0x00b5->B:51:0x00dc], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair e(defpackage.rl2 r17, boolean r18, defpackage.bm2 r19, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl2.e(rl2, boolean, bm2, long, long):android.util.Pair");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [jl2, pl0] */
    public final jl2 g(Uri uri, int i, boolean z) {
        qb2 qb2Var = (qb2) this.k.y;
        if (uri == null) {
            return null;
        }
        byte[] bArr = (byte[]) qb2Var.remove(uri);
        if (bArr != null) {
            return null;
        }
        v41 v41Var = new v41(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        ea2 ea2Var = this.f[i];
        int o = this.s.o();
        Object r = this.s.r();
        byte[] bArr2 = this.n;
        ?? pl0Var = new pl0(this.c, v41Var, 3, ea2Var, o, r, -9223372036854775807L, -9223372036854775807L, null);
        if (bArr2 == null) {
            bArr2 = eq6.b;
        }
        pl0Var.j = bArr2;
        return pl0Var;
    }
}
