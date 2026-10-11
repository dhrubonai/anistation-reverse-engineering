package m3;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class l0 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public a1 f7294a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f7295b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7296c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7297d;

    public l0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7295b = new Rect();
        this.f7296c = true;
        this.f7297d = false;
    }

    public final int a() {
        return this.f7294a.d();
    }

    public final boolean b() {
        if ((this.f7294a.f7162j & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        return this.f7294a.j();
    }

    public l0(int i10, int i11) {
        super(i10, i11);
        this.f7295b = new Rect();
        this.f7296c = true;
        this.f7297d = false;
    }

    public l0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f7295b = new Rect();
        this.f7296c = true;
        this.f7297d = false;
    }

    public l0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f7295b = new Rect();
        this.f7296c = true;
        this.f7297d = false;
    }

    public l0(l0 l0Var) {
        super((ViewGroup.LayoutParams) l0Var);
        this.f7295b = new Rect();
        this.f7296c = true;
        this.f7297d = false;
    }
}
