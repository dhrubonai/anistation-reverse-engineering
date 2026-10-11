package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s74 {
    public final t74 a;
    public final List b;
    public final List c;
    public final int d;
    public ai3 e;

    public s74(t74 t74Var, List list, List list2, int i) {
        this.a = t74Var;
        this.b = list;
        this.c = list2;
        this.d = i;
    }

    public final List a() {
        ai3 ai3Var = this.e;
        if (ai3Var == null) {
            ai3 y = te4.y();
            y.addAll(this.b);
            t74 t74Var = this.a;
            if (t74Var != null) {
                y.add(t74Var);
            }
            y.addAll(this.c);
            ai3Var = te4.r(y);
            this.e = ai3Var;
        }
        ai3Var.getClass();
        return ai3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && s74.class == obj.getClass()) {
                s74 s74Var = (s74) obj;
                if (this.d == s74Var.d && a().equals(s74Var.a())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return a().hashCode() + (this.d * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.d + ", mergedHistory=" + a() + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s74() {
        /*
            r3 = this;
            r0 = -1
            nt1 r1 = defpackage.nt1.x
            r2 = 0
            r3.<init>(r2, r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s74.<init>():void");
    }
}
