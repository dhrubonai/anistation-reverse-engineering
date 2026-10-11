package m3;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f7424a;

    /* renamed from: b, reason: collision with root package name */
    public int f7425b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f7426c = new Rect();

    public z(k0 k0Var) {
        this.f7424a = k0Var;
    }

    public static y a(k0 k0Var, int i10) {
        if (i10 != 0) {
            int i11 = 1;
            if (i10 == 1) {
                return new y(k0Var, i11);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new y(k0Var, 0);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j(View view);

    public abstract int k(View view);

    public abstract void l(int i10);
}
