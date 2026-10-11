package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public abstract class g2 extends ViewGroup {
    public int[] A;
    public Drawable B;
    public int C;
    public int D;
    public int E;
    public int F;

    /* renamed from: a, reason: collision with root package name */
    public boolean f486a;

    /* renamed from: b, reason: collision with root package name */
    public int f487b;

    /* renamed from: c, reason: collision with root package name */
    public int f488c;

    /* renamed from: d, reason: collision with root package name */
    public int f489d;

    /* renamed from: e, reason: collision with root package name */
    public int f490e;

    /* renamed from: f, reason: collision with root package name */
    public int f491f;

    /* renamed from: x, reason: collision with root package name */
    public float f492x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f493y;

    /* renamed from: z, reason: collision with root package name */
    public int[] f494z;

    public g2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f486a = true;
        this.f487b = -1;
        this.f488c = 0;
        this.f490e = 8388659;
        int[] iArr = e.a.f3283n;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        o3 o3Var = new o3(context, obtainStyledAttributes);
        g0.y0.k(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        int h10 = o3Var.h(1, -1);
        if (h10 >= 0) {
            setOrientation(h10);
        }
        int h11 = o3Var.h(0, -1);
        if (h11 >= 0) {
            setGravity(h11);
        }
        boolean a10 = o3Var.a(2, true);
        if (!a10) {
            setBaselineAligned(a10);
        }
        this.f492x = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f487b = o3Var.h(3, -1);
        this.f493y = o3Var.a(7, false);
        setDividerDrawable(o3Var.e(5));
        this.E = o3Var.h(8, 0);
        this.F = o3Var.d(6, 0);
        o3Var.p();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f2;
    }

    public final void f(Canvas canvas, int i10) {
        this.B.setBounds(getPaddingLeft() + this.F, i10, (getWidth() - getPaddingRight()) - this.F, this.D + i10);
        this.B.draw(canvas);
    }

    public final void g(Canvas canvas, int i10) {
        this.B.setBounds(i10, getPaddingTop() + this.F, this.C + i10, (getHeight() - getPaddingBottom()) - this.F);
        this.B.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f487b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f487b;
        if (childCount > i11) {
            View childAt = getChildAt(i11);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f487b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i12 = this.f488c;
            if (this.f489d == 1 && (i10 = this.f490e & 112) != 48) {
                if (i10 != 16) {
                    if (i10 == 80) {
                        i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f491f;
                    }
                } else {
                    i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f491f) / 2;
                }
            }
            return i12 + ((LinearLayout.LayoutParams) ((f2) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f487b;
    }

    public Drawable getDividerDrawable() {
        return this.B;
    }

    public int getDividerPadding() {
        return this.F;
    }

    public int getDividerWidth() {
        return this.C;
    }

    public int getGravity() {
        return this.f490e;
    }

    public int getOrientation() {
        return this.f489d;
    }

    public int getShowDividers() {
        return this.E;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f492x;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public f2 generateDefaultLayoutParams() {
        int i10 = this.f489d;
        if (i10 == 0) {
            return new f2(-2);
        }
        if (i10 == 1) {
            return new f2(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public f2 generateLayoutParams(AttributeSet attributeSet) {
        return new f2(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public f2 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new f2(layoutParams);
    }

    public final boolean k(int i10) {
        if (i10 == 0) {
            if ((this.E & 1) == 0) {
                return false;
            }
            return true;
        }
        if (i10 == getChildCount()) {
            if ((this.E & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((this.E & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        int left2;
        int bottom;
        if (this.B == null) {
            return;
        }
        int i11 = 0;
        if (this.f489d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && k(i11)) {
                    f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((f2) childAt.getLayoutParams())).topMargin) - this.D);
                }
                i11++;
            }
            if (k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.D;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((f2) childAt2.getLayoutParams())).bottomMargin;
                }
                f(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a10 = n4.a(this);
        while (i11 < virtualChildCount2) {
            View childAt3 = getChildAt(i11);
            if (childAt3 != null && childAt3.getVisibility() != 8 && k(i11)) {
                f2 f2Var = (f2) childAt3.getLayoutParams();
                if (a10) {
                    left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) f2Var).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) f2Var).leftMargin) - this.C;
                }
                g(canvas, left2);
            }
            i11++;
        }
        if (k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (a10) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i10 = this.C;
                    right = left - i10;
                }
            } else {
                f2 f2Var2 = (f2) childAt4.getLayoutParams();
                if (a10) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) f2Var2).leftMargin;
                    i10 = this.C;
                    right = left - i10;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) f2Var2).rightMargin;
                }
            }
            g(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0199  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g2.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:357:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x06e7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g2.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z9) {
        this.f486a = z9;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f487b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.B) {
            return;
        }
        this.B = drawable;
        boolean z9 = false;
        if (drawable != null) {
            this.C = drawable.getIntrinsicWidth();
            this.D = drawable.getIntrinsicHeight();
        } else {
            this.C = 0;
            this.D = 0;
        }
        if (drawable == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.F = i10;
    }

    public void setGravity(int i10) {
        if (this.f490e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f490e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f490e;
        if ((8388615 & i12) != i11) {
            this.f490e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z9) {
        this.f493y = z9;
    }

    public void setOrientation(int i10) {
        if (this.f489d != i10) {
            this.f489d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.E) {
            requestLayout();
        }
        this.E = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f490e;
        if ((i12 & 112) != i11) {
            this.f490e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f492x = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
