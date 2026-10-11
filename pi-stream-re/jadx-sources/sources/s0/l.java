package s0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* loaded from: classes.dex */
public final class l implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public final TransformationMethod f9750a;

    public l(TransformationMethod transformationMethod) {
        this.f9750a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f9750a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && q0.l.a().b() == 1) {
            q0.l a10 = q0.l.a();
            a10.getClass();
            return a10.f(0, charSequence.length(), charSequence);
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z9, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f9750a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z9, i10, rect);
        }
    }
}
