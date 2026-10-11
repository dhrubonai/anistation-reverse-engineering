package g0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class z1 extends c2 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f4287e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f4288f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f4289g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f4290h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f4291c;

    /* renamed from: d, reason: collision with root package name */
    public z.d f4292d;

    public z1() {
        this.f4291c = i();
    }

    private static WindowInsets i() {
        if (!f4288f) {
            try {
                f4287e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f4288f = true;
        }
        Field field = f4287e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
            }
        }
        if (!f4290h) {
            try {
                f4289g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            f4290h = true;
        }
        Constructor constructor = f4289g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e13) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
            }
        }
        return null;
    }

    @Override // g0.c2
    public k2 b() {
        a();
        k2 h10 = k2.h(null, this.f4291c);
        z.d[] dVarArr = this.f4174b;
        i2 i2Var = h10.f4227a;
        i2Var.o(dVarArr);
        i2Var.q(this.f4292d);
        return h10;
    }

    @Override // g0.c2
    public void e(z.d dVar) {
        this.f4292d = dVar;
    }

    @Override // g0.c2
    public void g(z.d dVar) {
        WindowInsets windowInsets = this.f4291c;
        if (windowInsets != null) {
            this.f4291c = windowInsets.replaceSystemWindowInsets(dVar.f11856a, dVar.f11857b, dVar.f11858c, dVar.f11859d);
        }
    }

    public z1(k2 k2Var) {
        super(k2Var);
        this.f4291c = k2Var.g();
    }
}
