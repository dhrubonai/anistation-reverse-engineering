package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class zy2 extends kq4 {
    public final boolean l;

    public zy2(String str, az2 az2Var) {
        super(str, az2Var, 1);
        this.l = true;
    }

    @Override // defpackage.kq4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zy2) {
                aj5 aj5Var = (aj5) obj;
                if (this.a.equals(aj5Var.a())) {
                    zy2 zy2Var = (zy2) obj;
                    if (zy2Var.l && Arrays.equals((aj5[]) this.j.getValue(), (aj5[]) zy2Var.j.getValue())) {
                        int e = aj5Var.e();
                        int i = this.c;
                        if (i == e) {
                            for (int i2 = 0; i2 < i; i2++) {
                                if (a34.i(h(i2).a(), aj5Var.h(i2).a()) && a34.i(h(i2).getKind(), aj5Var.h(i2).getKind())) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.kq4
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // defpackage.aj5
    public final boolean isInline() {
        return this.l;
    }
}
