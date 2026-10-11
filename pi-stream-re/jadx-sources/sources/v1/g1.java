package v1;

import r6.n1;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: d, reason: collision with root package name */
    public static final g1 f10431d = new g1(new c1.f1[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f10432a;

    /* renamed from: b, reason: collision with root package name */
    public final n1 f10433b;

    /* renamed from: c, reason: collision with root package name */
    public int f10434c;

    static {
        f1.b0.J(0);
    }

    public g1(c1.f1... f1VarArr) {
        this.f10433b = r6.o0.k(f1VarArr);
        this.f10432a = f1VarArr.length;
        int i10 = 0;
        while (true) {
            n1 n1Var = this.f10433b;
            if (i10 < n1Var.size()) {
                int i11 = i10 + 1;
                for (int i12 = i11; i12 < n1Var.size(); i12++) {
                    if (((c1.f1) n1Var.get(i10)).equals(n1Var.get(i12))) {
                        f1.o.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i10 = i11;
            } else {
                return;
            }
        }
    }

    public final c1.f1 a(int i10) {
        return (c1.f1) this.f10433b.get(i10);
    }

    public final int b(c1.f1 f1Var) {
        int indexOf = this.f10433b.indexOf(f1Var);
        if (indexOf < 0) {
            return -1;
        }
        return indexOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g1.class != obj.getClass()) {
            return false;
        }
        g1 g1Var = (g1) obj;
        if (this.f10432a == g1Var.f10432a && this.f10433b.equals(g1Var.f10433b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f10434c == 0) {
            this.f10434c = this.f10433b.hashCode();
        }
        return this.f10434c;
    }
}
