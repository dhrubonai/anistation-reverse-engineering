package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xm2 implements ey3 {
    public final String a;
    public final String b;
    public final List c;

    public xm2(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xm2.class == obj.getClass()) {
            xm2 xm2Var = (xm2) obj;
            if (TextUtils.equals(this.a, xm2Var.a) && TextUtils.equals(this.b, xm2Var.b) && this.c.equals(xm2Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return this.c.hashCode() + ((i3 + i2) * 31);
    }

    public final String toString() {
        String str;
        String str2 = this.a;
        if (str2 != null) {
            str = h11.k(h11.n(" [", str2, ", "), this.b, "]");
        } else {
            str = "";
        }
        return "HlsTrackMetadataEntry".concat(str);
    }
}
