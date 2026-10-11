package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class qt1 implements ki4 {
    public static final qt1 c = new Object();

    @Override // defpackage.pz5
    public final Set a() {
        return tt1.x;
    }

    @Override // defpackage.pz5
    public final boolean c() {
        return true;
    }

    @Override // defpackage.pz5
    public final List d(String str) {
        str.getClass();
        return null;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ki4) && ((ki4) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.pz5
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.pz5
    public final Set names() {
        return tt1.x;
    }

    public final String toString() {
        return "Parameters " + tt1.x;
    }
}
