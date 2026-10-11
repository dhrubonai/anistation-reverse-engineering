package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import defpackage.bh0;
import defpackage.q23;
import defpackage.qx1;
import defpackage.tx4;
import defpackage.ze0;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends q23 {
    public bh0 i;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        Paint paint = new Paint();
        Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tx4.b);
            obtainStyledAttributes.getInt(0, 0);
            Y(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public final void Y(int i) {
        bh0 bh0Var;
        if (i != 0 && i != 1) {
            ze0.k(qx1.h(i, "invalid orientation:"));
            return;
        }
        bh0 bh0Var2 = this.i;
        if (bh0Var2 != null && i == bh0Var2.a) {
            return;
        }
        if (i != 0) {
            if (i == 1) {
                bh0Var = new bh0(1);
            } else {
                ze0.k("invalid orientation");
                return;
            }
        } else {
            bh0Var = new bh0(0);
        }
        this.i = bh0Var;
    }

    public CarouselLayoutManager() {
        Paint paint = new Paint();
        Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
        Y(0);
    }
}
