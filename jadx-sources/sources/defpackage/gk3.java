package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gk3 {
    public final hk3 a;

    static {
        new LocaleList(new Locale[0]);
    }

    public gk3(hk3 hk3Var) {
        this.a = hk3Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gk3) {
            if (this.a.equals(((gk3) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
