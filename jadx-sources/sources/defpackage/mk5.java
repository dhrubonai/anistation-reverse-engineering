package defpackage;

import java.util.HashSet;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mk5 {
    public static final mk5 b = new mk5(new HashSet());
    public static final String c;
    public final zw2 a;

    static {
        String str = eq6.a;
        c = Integer.toString(0, 36);
    }

    public mk5(HashSet hashSet) {
        this.a = zw2.m(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk5)) {
            return false;
        }
        return this.a.equals(((mk5) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
