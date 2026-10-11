package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j78 {
    public final o15 a;
    public final o15 b;
    public final UUID c;

    public j78(o15 o15Var, o15 o15Var2, UUID uuid) {
        this.a = o15Var;
        this.b = o15Var2;
        this.c = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j78) {
            j78 j78Var = (j78) obj;
            if (this.a.equals(j78Var.a) && this.b.equals(j78Var.b) && this.c.equals(j78Var.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003)) * 1000003;
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.a);
    }
}
