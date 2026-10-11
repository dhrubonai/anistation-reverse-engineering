package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v57 {
    public static final v57 b;
    public final s57 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = q57.x;
        } else if (i >= 30) {
            b = o57.w;
        } else {
            b = s57.b;
        }
    }

    public v57(v57 v57Var) {
        if (v57Var != null) {
            s57 s57Var = v57Var.a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 35 && (s57Var instanceof r57)) {
                this.a = new r57(this, (r57) s57Var);
            } else if (i >= 34 && (s57Var instanceof q57)) {
                this.a = new q57(this, (q57) s57Var);
            } else if (i >= 31 && (s57Var instanceof p57)) {
                this.a = new p57(this, (p57) s57Var);
            } else if (i >= 30 && (s57Var instanceof o57)) {
                this.a = new o57(this, (o57) s57Var);
            } else if (s57Var instanceof n57) {
                this.a = new n57(this, (n57) s57Var);
            } else if (s57Var instanceof m57) {
                this.a = new m57(this, (m57) s57Var);
            } else if (s57Var instanceof l57) {
                this.a = new l57(this, (l57) s57Var);
            } else if (s57Var instanceof k57) {
                this.a = new k57(this, (k57) s57Var);
            } else {
                this.a = new s57(this);
            }
            s57Var.e(this);
            return;
        }
        this.a = new s57(this);
    }

    public static yz2 a(yz2 yz2Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, yz2Var.a - i);
        int max2 = Math.max(0, yz2Var.b - i2);
        int max3 = Math.max(0, yz2Var.c - i3);
        int max4 = Math.max(0, yz2Var.d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return yz2Var;
        }
        return yz2.b(max, max2, max3, max4);
    }

    public static v57 c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        v57 v57Var = new v57(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i = pv6.a;
            v57 a = lv6.a(view);
            s57 s57Var = v57Var.a;
            s57Var.y(a);
            View rootView = view.getRootView();
            s57Var.d(rootView);
            s57Var.p(rootView);
            s57Var.q();
            s57Var.z(view.getWindowSystemUiVisibility());
        }
        return v57Var;
    }

    public final WindowInsets b() {
        s57 s57Var = this.a;
        if (s57Var instanceof k57) {
            return ((k57) s57Var).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v57)) {
            return false;
        }
        return Objects.equals(this.a, ((v57) obj).a);
    }

    public final int hashCode() {
        s57 s57Var = this.a;
        if (s57Var == null) {
            return 0;
        }
        return s57Var.hashCode();
    }

    public v57(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new r57(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new q57(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new p57(this, windowInsets);
        } else if (i >= 30) {
            this.a = new o57(this, windowInsets);
        } else {
            this.a = new n57(this, windowInsets);
        }
    }
}
