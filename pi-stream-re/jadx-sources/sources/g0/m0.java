package g0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class m0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public k2 f4230a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f4232c;

    public m0(View view, y yVar) {
        this.f4231b = view;
        this.f4232c = yVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        k2 h10 = k2.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        y yVar = this.f4232c;
        if (i10 < 30) {
            n0.a(windowInsets, this.f4231b);
            if (h10.equals(this.f4230a)) {
                return yVar.o(view, h10).g();
            }
        }
        this.f4230a = h10;
        k2 o = yVar.o(view, h10);
        if (i10 >= 30) {
            return o.g();
        }
        WeakHashMap weakHashMap = y0.f4277a;
        l0.c(view);
        return o.g();
    }
}
