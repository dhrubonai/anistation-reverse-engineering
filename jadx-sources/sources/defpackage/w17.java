package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w17 {
    public final String a;
    public final int b;
    public final Set c;

    public w17(String str, int i, Set set) {
        this.a = str;
        this.b = i;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w17) {
                w17 w17Var = (w17) obj;
                if (!this.a.equals(w17Var.a) || this.b != w17Var.b || !this.c.equals(w17Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + qx1.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder m = h11.m(this.b, "CastTrackSelectionRequest(mediaContentId=", this.a, ", mediaItemId=", ", activeTrackIds=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
