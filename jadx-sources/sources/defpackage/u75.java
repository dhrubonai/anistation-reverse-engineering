package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u75 {
    public final String a;

    public u75(tv tvVar) {
        this.a = tvVar.x;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof u75) && this.a.equals(((u75) obj).a) && TextUtils.equals(null, null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, 1, 0, 0, null);
    }
}
