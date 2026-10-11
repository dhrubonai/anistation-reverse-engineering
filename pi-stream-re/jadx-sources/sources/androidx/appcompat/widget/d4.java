package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class d4 extends f.a {

    /* renamed from: b, reason: collision with root package name */
    public int f449b;

    public d4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f449b = 0;
    }

    public d4() {
        this.f449b = 0;
        this.f3622a = 8388627;
    }

    public d4(d4 d4Var) {
        super((f.a) d4Var);
        this.f449b = 0;
        this.f449b = d4Var.f449b;
    }

    public d4(f.a aVar) {
        super(aVar);
        this.f449b = 0;
    }

    public d4(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f449b = 0;
        ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
    }

    public d4(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f449b = 0;
    }
}
