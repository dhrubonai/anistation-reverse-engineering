package u5;

import android.view.View;
import g0.y0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final View f10289a;

    /* renamed from: b, reason: collision with root package name */
    public int f10290b;

    /* renamed from: c, reason: collision with root package name */
    public int f10291c;

    /* renamed from: d, reason: collision with root package name */
    public int f10292d;

    public e(View view) {
        this.f10289a = view;
    }

    public final void a() {
        int i10 = this.f10292d;
        View view = this.f10289a;
        int top = i10 - (view.getTop() - this.f10290b);
        WeakHashMap weakHashMap = y0.f4277a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f10291c));
    }
}
