package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class gh3 {
    public static final List b = te4.I(new gh3(1), new gh3(2), new gh3(4));
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gh3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gh3) {
            if (this.a != ((gh3) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        byte b2 = this.a;
        if (b2 == 1) {
            return "CR";
        }
        if (b2 == 2) {
            return "LF";
        }
        if (b2 == 4) {
            return "CRLF";
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            if ((((gh3) obj).a | b2) == b2) {
                arrayList.add(obj);
            }
        }
        return arrayList.toString();
    }
}
