package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f334a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f335b;

    /* renamed from: c, reason: collision with root package name */
    public int f336c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f336c = -1;
        int[] iArr = e.a.f3280k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        g0.y0.k(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f334a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f334a);
        }
    }

    private void setStacked(boolean z9) {
        int i10;
        int i11;
        if (this.f335b != z9) {
            if (!z9 || this.f334a) {
                this.f335b = z9;
                setOrientation(z9 ? 1 : 0);
                if (z9) {
                    i10 = 8388613;
                } else {
                    i10 = 80;
                }
                setGravity(i10);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    if (z9) {
                        i11 = 8;
                    } else {
                        i11 = 4;
                    }
                    findViewById.setVisibility(i11);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z9;
        int i13;
        int paddingBottom;
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        if (this.f334a) {
            if (size > this.f336c && this.f335b) {
                setStacked(false);
            }
            this.f336c = size;
        }
        if (!this.f335b && View.MeasureSpec.getMode(i10) == 1073741824) {
            i12 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z9 = true;
        } else {
            i12 = i10;
            z9 = false;
        }
        super.onMeasure(i12, i11);
        if (this.f334a && !this.f335b) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                setStacked(true);
                z9 = true;
            }
        }
        if (z9) {
            super.onMeasure(i10, i11);
        }
        int childCount = getChildCount();
        int i15 = 0;
        while (true) {
            i13 = -1;
            if (i15 < childCount) {
                if (getChildAt(i15).getVisibility() == 0) {
                    break;
                } else {
                    i15++;
                }
            } else {
                i15 = -1;
                break;
            }
        }
        if (i15 >= 0) {
            View childAt = getChildAt(i15);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i14 = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f335b) {
                int i16 = i15 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i16 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i16).getVisibility() == 0) {
                        i13 = i16;
                        break;
                    }
                    i16++;
                }
                if (i13 >= 0) {
                    paddingBottom = getChildAt(i13).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            i14 += paddingBottom;
        }
        WeakHashMap weakHashMap = g0.y0.f4277a;
        if (g0.h0.d(this) != i14) {
            setMinimumHeight(i14);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z9) {
        if (this.f334a != z9) {
            this.f334a = z9;
            if (!z9 && this.f335b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
