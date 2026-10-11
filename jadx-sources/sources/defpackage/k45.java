package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class k45 {
    public final Resources a;
    public final Resources.Theme b;

    public k45(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k45.class == obj.getClass()) {
            k45 k45Var = (k45) obj;
            if (this.a.equals(k45Var.a) && Objects.equals(this.b, k45Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
