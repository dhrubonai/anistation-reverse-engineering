package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.anistation.android.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.af2;
import defpackage.fo3;
import defpackage.go3;
import defpackage.m37;
import defpackage.pm5;
import defpackage.t80;
import defpackage.tx4;
import defpackage.u70;
import defpackage.ze0;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends m37 {
    public final pm5 A;
    public boolean B;
    public final ValueAnimator C;
    public final int D;
    public final boolean E;
    public int F;
    public final boolean u;
    public int v;
    public boolean w;
    public final go3 x;
    public final ColorStateList y;
    public final boolean z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        int resourceId;
        ColorStateList I;
        this.u = true;
        new af2(this);
        this.F = 4;
        new ArrayList();
        new ArrayList();
        new SparseIntArray();
        new SparseIntArray();
        new SparseIntArray();
        new Rect();
        context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tx4.a);
        int i3 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.y = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (I = t80.I(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : I;
        }
        if (obtainStyledAttributes.hasValue(24)) {
            this.A = pm5.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        pm5 pm5Var = this.A;
        if (pm5Var != null) {
            go3 go3Var = new go3(pm5Var);
            this.x = go3Var;
            go3Var.g(context);
            ColorStateList colorStateList = this.y;
            if (colorStateList != null) {
                go3 go3Var2 = this.x;
                fo3 fo3Var = go3Var2.b;
                if (fo3Var.c != colorStateList) {
                    fo3Var.c = colorStateList;
                    go3Var2.onStateChange(go3Var2.getState());
                }
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.x.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C = ofFloat;
        ofFloat.setDuration(500L);
        this.C.addUpdateListener(new u70(this));
        obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(12);
        if (peekValue != null && (i2 = peekValue.data) == -1) {
            P(i2);
        } else {
            P(obtainStyledAttributes.getDimensionPixelSize(12, -1));
        }
        boolean z = obtainStyledAttributes.getBoolean(10, false);
        if (this.E != z) {
            this.E = z;
            if (!z && this.F == 5 && this.F != 4) {
                this.F = 4;
            }
        }
        obtainStyledAttributes.getBoolean(16, false);
        boolean z2 = obtainStyledAttributes.getBoolean(8, true);
        if (this.u != z2) {
            this.u = z2;
            if (!z2 || (i = this.F) != 6) {
                i3 = this.F;
                i = i3;
            }
            if (i == i3) {
                i3 = i;
            } else {
                this.F = i3;
            }
            Q(i3);
        }
        obtainStyledAttributes.getBoolean(15, false);
        obtainStyledAttributes.getBoolean(5, true);
        obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getInt(13, 0);
        float f = obtainStyledAttributes.getFloat(9, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(7);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i4 = peekValue2.data;
                if (i4 >= 0) {
                    this.D = i4;
                    Q(this.F);
                } else {
                    ze0.k("offset must be greater than or equal to 0");
                    throw null;
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(7, 0);
                if (dimensionPixelOffset >= 0) {
                    this.D = dimensionPixelOffset;
                    Q(this.F);
                } else {
                    ze0.k("offset must be greater than or equal to 0");
                    throw null;
                }
            }
            obtainStyledAttributes.getInt(14, UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
            obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.getBoolean(4, true);
            obtainStyledAttributes.getBoolean(20, false);
            obtainStyledAttributes.getBoolean(21, false);
            obtainStyledAttributes.getBoolean(22, false);
            obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.getBoolean(17, false);
            obtainStyledAttributes.getBoolean(18, false);
            obtainStyledAttributes.getBoolean(19, false);
            this.z = obtainStyledAttributes.getBoolean(26, true);
            obtainStyledAttributes.recycle();
            ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        ze0.k("ratio must be a float value between 0 and 1");
        throw null;
    }

    public final void P(int i) {
        boolean z = this.w;
        if (i == -1) {
            if (!z) {
                this.w = true;
            }
        } else {
            if (!z && this.v == i) {
                return;
            }
            this.w = false;
            this.v = Math.max(0, i);
        }
    }

    public final void Q(int i) {
        boolean z;
        go3 go3Var;
        if (i != 2) {
            if (this.F == 3 && this.z) {
                z = true;
            } else {
                z = false;
            }
            if (this.B != z && (go3Var = this.x) != null) {
                this.B = z;
                ValueAnimator valueAnimator = this.C;
                float f = 1.0f;
                if (valueAnimator != null) {
                    if (valueAnimator.isRunning()) {
                        valueAnimator.reverse();
                        return;
                    }
                    float f2 = go3Var.b.h;
                    if (z) {
                        f = 0.0f;
                    }
                    valueAnimator.setFloatValues(f2, f);
                    valueAnimator.start();
                    return;
                }
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                if (this.B) {
                    f = 0.0f;
                }
                fo3 fo3Var = go3Var.b;
                if (fo3Var.h != f) {
                    fo3Var.h = f;
                    go3Var.f = true;
                    go3Var.g = true;
                    go3Var.invalidateSelf();
                }
            }
        }
    }

    public BottomSheetBehavior() {
        this.u = true;
        new af2(this);
        this.F = 4;
        new ArrayList();
        new ArrayList();
        new SparseIntArray();
        new SparseIntArray();
        new SparseIntArray();
        new Rect();
    }
}
