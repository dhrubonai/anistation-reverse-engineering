package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xu3 {
    public zu3 a;

    public xu3(String str, int i, int i2) {
        if (!TextUtils.isEmpty(str)) {
            this.a = new zu3(str, i, i2);
        } else {
            ze0.k("packageName should be nonempty");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu3)) {
            return false;
        }
        return this.a.equals(((xu3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
