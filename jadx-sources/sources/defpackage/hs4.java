package defpackage;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hs4 implements gs4, Serializable {
    public final List x;

    public hs4(List list) {
        this.x = list;
    }

    @Override // defpackage.gs4
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.x;
            if (i < list.size()) {
                if (!((gs4) list.get(i)).apply(obj)) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hs4) {
            return this.x.equals(((hs4) obj).x);
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.x) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
