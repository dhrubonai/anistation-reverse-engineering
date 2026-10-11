package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import j3.a;
import j3.b;
import j3.j0;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f1195d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final b f1196a;

    /* renamed from: b, reason: collision with root package name */
    public float f1197b;

    /* renamed from: c, reason: collision with root package name */
    public int f1198c;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1198c = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, j0.f6028a, 0, 0);
            try {
                this.f1198c = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f1196a = new b(this);
    }

    public int getResizeMode() {
        return this.f1198c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f1197b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = (this.f1197b / (f12 / f13)) - 1.0f;
        float abs = Math.abs(f14);
        b bVar = this.f1196a;
        if (abs <= 0.01f) {
            if (!bVar.f5943a) {
                bVar.f5943a = true;
                bVar.f5944b.post(bVar);
                return;
            }
            return;
        }
        int i12 = this.f1198c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 4) {
                        if (f14 > 0.0f) {
                            f10 = this.f1197b;
                        } else {
                            f11 = this.f1197b;
                        }
                    }
                } else {
                    f10 = this.f1197b;
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f1197b;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f14 > 0.0f) {
            f11 = this.f1197b;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f1197b;
            measuredWidth = (int) (f13 * f10);
        }
        if (!bVar.f5943a) {
            bVar.f5943a = true;
            bVar.f5944b.post(bVar);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f1197b != f10) {
            this.f1197b = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
    }

    public void setResizeMode(int i10) {
        if (this.f1198c != i10) {
            this.f1198c = i10;
            requestLayout();
        }
    }
}
