package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tx3 implements or3, nr3 {
    public final ArrayList A = new ArrayList();
    public final HashMap B = new HashMap();
    public nr3 C;
    public zg6 D;
    public or3[] E;
    public nu0 F;
    public final or3[] x;
    public final boolean[] y;
    public final IdentityHashMap z;

    public tx3(m18 m18Var, long[] jArr, or3... or3VarArr) {
        this.x = or3VarArr;
        z62 z62Var = nw2.y;
        o15 o15Var = o15.B;
        this.F = new nu0(o15Var, o15Var);
        this.z = new IdentityHashMap();
        this.E = new or3[0];
        this.y = new boolean[or3VarArr.length];
        for (int i = 0; i < or3VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.y[i] = true;
                this.x[i] = new af6(or3VarArr[i], j);
            }
        }
    }

    @Override // defpackage.nr3
    public final void a(or3 or3Var) {
        ArrayList arrayList = this.A;
        arrayList.remove(or3Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        or3[] or3VarArr = this.x;
        int i = 0;
        for (or3 or3Var2 : or3VarArr) {
            i += or3Var2.p().a;
        }
        yg6[] yg6VarArr = new yg6[i];
        int i2 = 0;
        for (int i3 = 0; i3 < or3VarArr.length; i3++) {
            zg6 p = or3VarArr[i3].p();
            int i4 = p.a;
            int i5 = 0;
            while (i5 < i4) {
                yg6 a = p.a(i5);
                int i6 = a.a;
                ea2[] ea2VarArr = new ea2[i6];
                int i7 = 0;
                while (i7 < i6) {
                    ea2 ea2Var = a.d[i7];
                    da2 a2 = ea2Var.a();
                    String str = ea2Var.n;
                    or3[] or3VarArr2 = or3VarArr;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i3);
                    sb.append(":");
                    String str2 = ea2Var.a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb.append(str2);
                    a2.a = sb.toString();
                    if (str != null) {
                        a2.m = i3 + ":" + str;
                    }
                    ea2VarArr[i7] = new ea2(a2);
                    i7++;
                    or3VarArr = or3VarArr2;
                }
                or3[] or3VarArr3 = or3VarArr;
                yg6 yg6Var = new yg6(i3 + ":" + a.b, ea2VarArr);
                this.B.put(yg6Var, a);
                yg6VarArr[i2] = yg6Var;
                i5++;
                i2++;
                or3VarArr = or3VarArr3;
            }
        }
        this.D = new zg6(yg6VarArr);
        nr3 nr3Var = this.C;
        nr3Var.getClass();
        nr3Var.a(this);
    }

    @Override // defpackage.or3
    public final long b(long j) {
        boolean z;
        boolean z2 = true;
        for (or3 or3Var : this.x) {
            if (or3Var.b(j) == j) {
                z = true;
            } else {
                z = false;
            }
            z2 &= z;
        }
        if (z2) {
            return j;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.or3
    public final long c(jz1[] jz1VarArr, boolean[] zArr, g95[] g95VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        g95 g95Var;
        int[] iArr;
        Integer num;
        int intValue;
        int[] iArr2 = new int[jz1VarArr.length];
        int[] iArr3 = new int[jz1VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = jz1VarArr.length;
            identityHashMap = this.z;
            if (i2 >= length) {
                break;
            }
            g95 g95Var2 = g95VarArr[i2];
            if (g95Var2 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(g95Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr2[i2] = intValue;
            jz1 jz1Var = jz1VarArr[i2];
            if (jz1Var != null) {
                String str = jz1Var.c().b;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = jz1VarArr.length;
        g95[] g95VarArr2 = new g95[length2];
        g95[] g95VarArr3 = new g95[jz1VarArr.length];
        jz1[] jz1VarArr2 = new jz1[jz1VarArr.length];
        or3[] or3VarArr = this.x;
        ArrayList arrayList = new ArrayList(or3VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < or3VarArr.length) {
            int i4 = i;
            while (i4 < jz1VarArr.length) {
                if (iArr2[i4] == i3) {
                    g95Var = g95VarArr[i4];
                } else {
                    g95Var = null;
                }
                g95VarArr3[i4] = g95Var;
                if (iArr3[i4] == i3) {
                    jz1 jz1Var2 = jz1VarArr[i4];
                    jz1Var2.getClass();
                    iArr = iArr2;
                    yg6 yg6Var = (yg6) this.B.get(jz1Var2.c());
                    yg6Var.getClass();
                    jz1VarArr2[i4] = new sx3(jz1Var2, yg6Var);
                } else {
                    iArr = iArr2;
                    jz1VarArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            or3[] or3VarArr2 = or3VarArr;
            int i5 = i3;
            long c = or3VarArr2[i3].c(jz1VarArr2, zArr, g95VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = c;
            } else if (c != j2) {
                ze0.m("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < jz1VarArr.length; i6++) {
                boolean z2 = true;
                if (iArr3[i6] == i5) {
                    g95 g95Var3 = g95VarArr3[i6];
                    g95Var3.getClass();
                    g95VarArr2[i6] = g95VarArr3[i6];
                    identityHashMap.put(g95Var3, Integer.valueOf(i5));
                    z = true;
                } else if (iArr4[i6] == i5) {
                    if (g95VarArr3[i6] != null) {
                        z2 = false;
                    }
                    io3.B(z2);
                }
            }
            if (z) {
                arrayList.add(or3VarArr2[i5]);
            }
            i3 = i5 + 1;
            or3VarArr = or3VarArr2;
            iArr2 = iArr4;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(g95VarArr2, i7, g95VarArr, i7, length2);
        this.E = (or3[]) arrayList.toArray(new or3[i7]);
        this.F = new nu0(arrayList, tl7.S(arrayList, new pb0((byte) 15)));
        return j2;
    }

    @Override // defpackage.ui5
    public final boolean d() {
        return this.F.d();
    }

    @Override // defpackage.or3
    public final void e() {
        for (or3 or3Var : this.x) {
            or3Var.e();
        }
    }

    @Override // defpackage.ui5
    public final long f() {
        return this.F.f();
    }

    @Override // defpackage.ti5
    public final void g(ui5 ui5Var) {
        nr3 nr3Var = this.C;
        nr3Var.getClass();
        nr3Var.g(this);
    }

    @Override // defpackage.or3
    public final long h(long j, if5 if5Var) {
        or3 or3Var;
        or3[] or3VarArr = this.E;
        if (or3VarArr.length > 0) {
            or3Var = or3VarArr[0];
        } else {
            or3Var = this.x[0];
        }
        return or3Var.h(j, if5Var);
    }

    @Override // defpackage.or3
    public final void i() {
        for (or3 or3Var : this.x) {
            or3Var.i();
        }
    }

    @Override // defpackage.or3
    public final long j(long j) {
        long j2 = this.E[0].j(j);
        int i = 1;
        while (true) {
            or3[] or3VarArr = this.E;
            if (i < or3VarArr.length) {
                if (or3VarArr[i].j(j2) == j2) {
                    i++;
                } else {
                    ze0.m("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else {
                return j2;
            }
        }
    }

    @Override // defpackage.or3
    public final void l(long j) {
        for (or3 or3Var : this.E) {
            or3Var.l(j);
        }
    }

    @Override // defpackage.or3
    public final List m(ArrayList arrayList) {
        z62 z62Var = nw2.y;
        return o15.B;
    }

    @Override // defpackage.or3
    public final long n() {
        long j;
        or3 or3Var;
        or3[] or3VarArr = this.E;
        int length = or3VarArr.length;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        int i = 0;
        while (i < length) {
            or3 or3Var2 = or3VarArr[i];
            long n = or3Var2.n();
            if (n != j2) {
                if (j3 == j2) {
                    or3[] or3VarArr2 = this.E;
                    int length2 = or3VarArr2.length;
                    int i2 = 0;
                    while (true) {
                        j = j2;
                        if (i2 >= length2 || (or3Var = or3VarArr2[i2]) == or3Var2) {
                            break;
                        }
                        if (or3Var.j(n) == n) {
                            i2++;
                            j2 = j;
                        } else {
                            ze0.m("Unexpected child seekToUs result.");
                            return 0L;
                        }
                    }
                    j3 = n;
                } else {
                    j = j2;
                    if (n != j3) {
                        ze0.m("Conflicting discontinuities.");
                        return 0L;
                    }
                }
            } else {
                j = j2;
                if (j3 != j && or3Var2.j(j3) != j3) {
                    ze0.m("Unexpected child seekToUs result.");
                    return 0L;
                }
            }
            i++;
            j2 = j;
        }
        return j3;
    }

    @Override // defpackage.or3
    public final void o(nr3 nr3Var, long j) {
        this.C = nr3Var;
        ArrayList arrayList = this.A;
        or3[] or3VarArr = this.x;
        Collections.addAll(arrayList, or3VarArr);
        for (or3 or3Var : or3VarArr) {
            or3Var.o(this, j);
        }
    }

    @Override // defpackage.or3
    public final zg6 p() {
        zg6 zg6Var = this.D;
        zg6Var.getClass();
        return zg6Var;
    }

    @Override // defpackage.ui5
    public final boolean q(qj3 qj3Var) {
        ArrayList arrayList = this.A;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((or3) arrayList.get(i)).q(qj3Var);
            }
            return false;
        }
        return this.F.q(qj3Var);
    }

    @Override // defpackage.ui5
    public final long s() {
        return this.F.s();
    }

    @Override // defpackage.ui5
    public final void v(long j) {
        this.F.v(j);
    }
}
