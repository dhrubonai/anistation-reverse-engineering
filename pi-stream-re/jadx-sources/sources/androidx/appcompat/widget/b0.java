package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f416a;

    /* renamed from: b, reason: collision with root package name */
    public final f.p0 f417b;

    public b0(TextView textView) {
        this.f416a = textView;
        this.f417b = new f.p0(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((j6.e) this.f417b.f3762b).o(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f416a.getContext().obtainStyledAttributes(attributeSet, e.a.f3278i, i10, 0);
        try {
            boolean z9 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z9 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z9);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z9) {
        ((j6.e) this.f417b.f3762b).w(z9);
    }

    public final void d(boolean z9) {
        ((j6.e) this.f417b.f3762b).z(z9);
    }
}
