package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.anistation.android.R;
import defpackage.fo3;
import defpackage.go3;
import defpackage.m37;
import defpackage.pm5;
import defpackage.sn3;
import defpackage.t80;
import defpackage.tx4;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends m37 {
    public final go3 u;
    public final ColorStateList v;
    public final pm5 w;
    public byte x;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        int resourceId;
        ColorStateList I;
        new sn3(this);
        this.x = (byte) 5;
        new LinkedHashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tx4.i);
        if (obtainStyledAttributes.hasValue(3)) {
            this.v = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (I = t80.I(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : I;
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.w = pm5.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            obtainStyledAttributes.getResourceId(5, -1);
        }
        pm5 pm5Var = this.w;
        if (pm5Var != null) {
            go3 go3Var = new go3(pm5Var);
            this.u = go3Var;
            go3Var.g(context);
            ColorStateList colorStateList = this.v;
            if (colorStateList != null) {
                go3 go3Var2 = this.u;
                fo3 fo3Var = go3Var2.b;
                if (fo3Var.c != colorStateList) {
                    fo3Var.c = colorStateList;
                    go3Var2.onStateChange(go3Var2.getState());
                }
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.u.setTint(typedValue.data);
            }
        }
        obtainStyledAttributes.getDimension(2, -1.0f);
        obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public SideSheetBehavior() {
        new sn3(this);
        this.x = (byte) 5;
        new LinkedHashSet();
    }
}
