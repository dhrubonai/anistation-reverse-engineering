package defpackage;

import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ly5 {
    public final String a;
    public final rw2 b;
    public final rw2 c;
    public final rw2 d;

    public ly5(String str, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = str;
        this.b = rw2.b(hashMap);
        this.c = rw2.b(hashMap2);
        this.d = rw2.b(hashMap3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ly5) {
                ly5 ly5Var = (ly5) obj;
                if (Objects.equals(this.a, ly5Var.a) && this.b.equals(ly5Var.b) && this.c.equals(ly5Var.c) && this.d.equals(ly5Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }
}
