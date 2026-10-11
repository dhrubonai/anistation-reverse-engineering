package f;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public int f3622a;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3622a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.a.f3271b);
        this.f3622a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public a() {
        super(-2, -2);
        this.f3622a = 8388627;
    }

    public a(a aVar) {
        super((ViewGroup.MarginLayoutParams) aVar);
        this.f3622a = 0;
        this.f3622a = aVar.f3622a;
    }

    public a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3622a = 0;
    }
}
