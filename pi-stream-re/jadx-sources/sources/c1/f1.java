package c1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1690a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1691b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1692c;

    /* renamed from: d, reason: collision with root package name */
    public final v[] f1693d;

    /* renamed from: e, reason: collision with root package name */
    public int f1694e;

    static {
        f1.b0.J(0);
        f1.b0.J(1);
    }

    public f1(String str, v... vVarArr) {
        boolean z9;
        if (vVarArr.length > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        this.f1691b = str;
        this.f1693d = vVarArr;
        this.f1690a = vVarArr.length;
        int i10 = q0.i(vVarArr[0].f1935m);
        this.f1692c = i10 == -1 ? q0.i(vVarArr[0].f1934l) : i10;
        String str2 = vVarArr[0].f1926d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i11 = vVarArr[0].f1928f | 16384;
        for (int i12 = 1; i12 < vVarArr.length; i12++) {
            String str3 = vVarArr[i12].f1926d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                c("languages", vVarArr[0].f1926d, vVarArr[i12].f1926d, i12);
                return;
            } else {
                if (i11 != (vVarArr[i12].f1928f | 16384)) {
                    c("role flags", Integer.toBinaryString(vVarArr[0].f1928f), Integer.toBinaryString(vVarArr[i12].f1928f), i12);
                    return;
                }
            }
        }
    }

    public static void c(String str, String str2, String str3, int i10) {
        f1.o.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    public final v a() {
        return this.f1693d[0];
    }

    public final int b(v vVar) {
        int i10 = 0;
        while (true) {
            v[] vVarArr = this.f1693d;
            if (i10 < vVarArr.length) {
                if (vVar == vVarArr[i10]) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f1.class != obj.getClass()) {
            return false;
        }
        f1 f1Var = (f1) obj;
        if (this.f1691b.equals(f1Var.f1691b) && Arrays.equals(this.f1693d, f1Var.f1693d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1694e == 0) {
            this.f1694e = Arrays.hashCode(this.f1693d) + ((this.f1691b.hashCode() + 527) * 31);
        }
        return this.f1694e;
    }
}
