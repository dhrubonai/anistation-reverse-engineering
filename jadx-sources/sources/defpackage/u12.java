package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u12 {
    public final String a;
    public final Map b;

    public u12(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static u12 a(String str) {
        return new u12(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u12) {
                u12 u12Var = (u12) obj;
                if (this.a.equals(u12Var.a) && this.b.equals(u12Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
