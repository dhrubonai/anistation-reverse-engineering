package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mk7 implements ik7 {
    public final String x;
    public final ArrayList y;

    public mk7(String str, ArrayList arrayList) {
        this.x = str;
        ArrayList arrayList2 = new ArrayList();
        this.y = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // defpackage.ik7
    public final Boolean c() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // defpackage.ik7
    public final String d() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mk7) {
            mk7 mk7Var = (mk7) obj;
            String str = mk7Var.x;
            String str2 = this.x;
            if (str2 != null) {
                if (!str2.equals(str)) {
                    return false;
                }
            } else if (str != null) {
                return false;
            }
            return this.y.equals(mk7Var.y);
        }
        return false;
    }

    @Override // defpackage.ik7
    public final Iterator f() {
        return null;
    }

    @Override // defpackage.ik7
    public final Double h() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final int hashCode() {
        int i;
        String str = this.x;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.y.hashCode() + (i * 31);
    }

    @Override // defpackage.ik7
    public final ik7 i(String str, vs7 vs7Var, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // defpackage.ik7
    public final ik7 m() {
        return this;
    }
}
