package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class th1 {
    public final DisplayCutout a;

    public th1(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final yz2 a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return yz2.c(c4.f(this.a));
        }
        return yz2.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && th1.class == obj.getClass()) {
            return this.a.equals(((th1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
