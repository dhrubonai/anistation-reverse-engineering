package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f306a;

    /* renamed from: b, reason: collision with root package name */
    public View f307b;

    /* renamed from: c, reason: collision with root package name */
    public View f308c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f309d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f310e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f311f;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f312x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f313y;

    /* renamed from: z, reason: collision with root package name */
    public final int f314z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this);
        WeakHashMap weakHashMap = g0.y0.f4277a;
        g0.h0.q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.a.f3270a);
        boolean z9 = false;
        this.f309d = obtainStyledAttributes.getDrawable(0);
        this.f310e = obtainStyledAttributes.getDrawable(2);
        this.f314z = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f312x = true;
            this.f311f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f312x ? !(this.f309d != null || this.f310e != null) : this.f311f == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f309d;
        if (drawable != null && drawable.isStateful()) {
            this.f309d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f310e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f310e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f311f;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f311f.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f309d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f310e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f311f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f307b = findViewById(R.id.action_bar);
        this.f308c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f306a && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        boolean z10 = true;
        if (this.f312x) {
            Drawable drawable = this.f311f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z10 = false;
            }
        } else {
            if (this.f309d != null) {
                if (this.f307b.getVisibility() == 0) {
                    this.f309d.setBounds(this.f307b.getLeft(), this.f307b.getTop(), this.f307b.getRight(), this.f307b.getBottom());
                } else {
                    View view = this.f308c;
                    if (view != null && view.getVisibility() == 0) {
                        this.f309d.setBounds(this.f308c.getLeft(), this.f308c.getTop(), this.f308c.getRight(), this.f308c.getBottom());
                    } else {
                        this.f309d.setBounds(0, 0, 0, 0);
                    }
                }
            } else {
                z10 = false;
            }
            this.f313y = false;
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f307b == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f314z) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f307b == null) {
            return;
        }
        View.MeasureSpec.getMode(i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f309d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f309d);
        }
        this.f309d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f307b;
            if (view != null) {
                this.f309d.setBounds(view.getLeft(), this.f307b.getTop(), this.f307b.getRight(), this.f307b.getBottom());
            }
        }
        boolean z9 = true;
        if (!this.f312x ? this.f309d != null || this.f310e != null : this.f311f != null) {
            z9 = false;
        }
        setWillNotDraw(z9);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f311f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f311f);
        }
        this.f311f = drawable;
        boolean z9 = this.f312x;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z9 && (drawable2 = this.f311f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z9 ? !(this.f309d != null || this.f310e != null) : this.f311f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        boolean z9;
        Drawable drawable2 = this.f310e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f310e);
        }
        this.f310e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f313y && this.f310e != null) {
                throw null;
            }
        }
        if (!this.f312x ? !(this.f309d != null || this.f310e != null) : this.f311f == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        setWillNotDraw(z9);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(b3 b3Var) {
    }

    public void setTransitioning(boolean z9) {
        int i10;
        this.f306a = z9;
        if (z9) {
            i10 = 393216;
        } else {
            i10 = 262144;
        }
        setDescendantFocusability(i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z9;
        super.setVisibility(i10);
        if (i10 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Drawable drawable = this.f309d;
        if (drawable != null) {
            drawable.setVisible(z9, false);
        }
        Drawable drawable2 = this.f310e;
        if (drawable2 != null) {
            drawable2.setVisible(z9, false);
        }
        Drawable drawable3 = this.f311f;
        if (drawable3 != null) {
            drawable3.setVisible(z9, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f309d;
        boolean z9 = this.f312x;
        if ((drawable == drawable2 && !z9) || ((drawable == this.f310e && this.f313y) || ((drawable == this.f311f && z9) || super.verifyDrawable(drawable)))) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
