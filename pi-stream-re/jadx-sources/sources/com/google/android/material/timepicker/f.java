package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import g0.h0;
import g0.i0;
import g0.y0;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public abstract class f extends ConstraintLayout {
    public final e H;
    public int I;
    public j6.g J;

    /* JADX WARN: Type inference failed for: r7v2, types: [com.google.android.material.timepicker.e] */
    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        j6.g gVar = new j6.g();
        this.J = gVar;
        j6.h hVar = new j6.h(0.5f);
        j6.k kVar = gVar.f6194a.f6174a;
        kVar.getClass();
        j6.j jVar = new j6.j(kVar);
        jVar.f6208e = hVar;
        jVar.f6209f = hVar;
        jVar.f6210g = hVar;
        jVar.f6211h = hVar;
        gVar.setShapeAppearanceModel(new j6.k(jVar));
        this.J.j(ColorStateList.valueOf(-1));
        j6.g gVar2 = this.J;
        WeakHashMap weakHashMap = y0.f4277a;
        h0.q(this, gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s5.a.f9917s, R.attr.materialClockStyle, 0);
        this.I = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.H = new Runnable() { // from class: com.google.android.material.timepicker.e
            @Override // java.lang.Runnable
            public final void run() {
                f.this.f();
            }
        };
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = y0.f4277a;
            view.setId(i0.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.H;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    public abstract void f();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.H;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.J.j(ColorStateList.valueOf(i10));
    }
}
