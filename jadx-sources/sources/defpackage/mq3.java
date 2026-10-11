package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mq3 {
    public static final String b;
    public final Uri a;

    static {
        String str = eq6.a;
        b = Integer.toString(0, 36);
    }

    public mq3(eo3 eo3Var) {
        this.a = (Uri) eo3Var.y;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof mq3) && this.a.equals(((mq3) obj).a)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
