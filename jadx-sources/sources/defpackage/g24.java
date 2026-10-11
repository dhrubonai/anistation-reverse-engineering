package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g24 implements vo3 {
    public final f24 a;

    public g24(f24 f24Var) {
        this.a = f24Var;
    }

    @Override // defpackage.vo3
    public final int a(j23 j23Var, List list, int i) {
        return this.a.a(j23Var, bb4.E(j23Var), i);
    }

    @Override // defpackage.vo3
    public final wo3 b(xo3 xo3Var, List list, long j) {
        return this.a.b(xo3Var, bb4.E(xo3Var), j);
    }

    @Override // defpackage.vo3
    public final int c(j23 j23Var, List list, int i) {
        return this.a.c(j23Var, bb4.E(j23Var), i);
    }

    @Override // defpackage.vo3
    public final int d(j23 j23Var, List list, int i) {
        return this.a.d(j23Var, bb4.E(j23Var), i);
    }

    @Override // defpackage.vo3
    public final int e(j23 j23Var, List list, int i) {
        return this.a.e(j23Var, bb4.E(j23Var), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g24) && a34.i(this.a, ((g24) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ")";
    }
}
