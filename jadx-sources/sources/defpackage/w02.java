package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w02 {
    public final Uri a;
    public final long b;

    public w02(Uri uri, long j) {
        this.a = uri;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w02) {
                w02 w02Var = (w02) obj;
                if (!this.a.equals(w02Var.a) || this.b != w02Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PublishedFile(uri=" + this.a + ", size=" + this.b + ")";
    }
}
