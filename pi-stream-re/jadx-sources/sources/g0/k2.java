package g0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: b, reason: collision with root package name */
    public static final k2 f4226b;

    /* renamed from: a, reason: collision with root package name */
    public final i2 f4227a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f4226b = h2.f4217q;
        } else {
            f4226b = i2.f4219b;
        }
    }

    public k2(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f4227a = new h2(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f4227a = new g2(this, windowInsets);
        } else if (i10 >= 28) {
            this.f4227a = new f2(this, windowInsets);
        } else {
            this.f4227a = new e2(this, windowInsets);
        }
    }

    public static z.d f(z.d dVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, dVar.f11856a - i10);
        int max2 = Math.max(0, dVar.f11857b - i11);
        int max3 = Math.max(0, dVar.f11858c - i12);
        int max4 = Math.max(0, dVar.f11859d - i13);
        if (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) {
            return dVar;
        }
        return z.d.b(max, max2, max3, max4);
    }

    public static k2 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        k2 k2Var = new k2(windowInsets);
        if (view != null) {
            WeakHashMap weakHashMap = y0.f4277a;
            if (k0.b(view)) {
                k2 a10 = o0.a(view);
                i2 i2Var = k2Var.f4227a;
                i2Var.p(a10);
                i2Var.d(view.getRootView());
            }
        }
        return k2Var;
    }

    public final z.d a(int i10) {
        return this.f4227a.f(i10);
    }

    public final int b() {
        return this.f4227a.j().f11859d;
    }

    public final int c() {
        return this.f4227a.j().f11856a;
    }

    public final int d() {
        return this.f4227a.j().f11858c;
    }

    public final int e() {
        return this.f4227a.j().f11857b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        return f0.b.a(this.f4227a, ((k2) obj).f4227a);
    }

    public final WindowInsets g() {
        i2 i2Var = this.f4227a;
        if (i2Var instanceof d2) {
            return ((d2) i2Var).f4184c;
        }
        return null;
    }

    public final int hashCode() {
        i2 i2Var = this.f4227a;
        if (i2Var == null) {
            return 0;
        }
        return i2Var.hashCode();
    }

    public k2() {
        this.f4227a = new i2(this);
    }
}
