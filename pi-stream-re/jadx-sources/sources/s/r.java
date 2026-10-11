package s;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class r extends b {

    /* renamed from: x, reason: collision with root package name */
    public boolean f9723x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9724y;

    @Override // s.b
    public void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f9715b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 6) {
                    this.f9723x = true;
                } else if (index == 13) {
                    this.f9724y = true;
                }
            }
        }
    }

    public abstract void h(q.h hVar, int i10, int i11);

    @Override // s.b, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f9723x || this.f9724y) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.f9590b; i10++) {
                View view = (View) constraintLayout.f764a.get(this.f9589a[i10]);
                if (view != null) {
                    if (this.f9723x) {
                        view.setVisibility(visibility);
                    }
                    if (this.f9724y && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        c();
    }
}
