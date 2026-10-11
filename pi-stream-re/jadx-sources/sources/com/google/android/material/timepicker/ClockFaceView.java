package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import g0.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import msr.pistream.app.R;
import p7.a0;
import s.m;

/* loaded from: classes.dex */
class ClockFaceView extends f implements d {
    public final ClockHandView K;
    public final Rect L;
    public final RectF M;
    public final Rect N;
    public final SparseArray O;
    public final c P;
    public final int[] Q;
    public final float[] R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public String[] W;

    /* renamed from: a0, reason: collision with root package name */
    public float f2838a0;

    /* renamed from: b0, reason: collision with root package name */
    public final ColorStateList f2839b0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = new Rect();
        this.M = new RectF();
        this.N = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.O = sparseArray;
        this.R = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s5.a.f9902c, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList u9 = a0.u(context, obtainStyledAttributes, 1);
        this.f2839b0 = u9;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.K = clockHandView;
        this.S = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = u9.getColorForState(new int[]{android.R.attr.state_selected}, u9.getDefaultColor());
        this.Q = new int[]{colorForState, colorForState, u9.getDefaultColor()};
        clockHandView.f2842c.add(this);
        int defaultColor = x.j.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList u10 = a0.u(context, obtainStyledAttributes, 0);
        setBackgroundColor(u10 != null ? u10.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.P = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.W = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z9 = false;
        for (int i10 = 0; i10 < Math.max(this.W.length, size); i10++) {
            TextView textView = (TextView) sparseArray.get(i10);
            if (i10 >= this.W.length) {
                removeView(textView);
                sparseArray.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i10, textView);
                    addView(textView);
                }
                textView.setText(this.W[i10]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i10));
                int i11 = (i10 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i11));
                z9 = i11 > 1 ? true : z9;
                y0.l(textView, this.P);
                textView.setTextColor(this.f2839b0);
            }
        }
        ClockHandView clockHandView2 = this.K;
        if (clockHandView2.f2841b && !z9) {
            clockHandView2.D = 1;
        }
        clockHandView2.f2841b = z9;
        clockHandView2.invalidate();
        this.T = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.U = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.V = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.f
    public final void f() {
        int i10;
        m mVar = new m();
        mVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i12 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i12 == null) {
                    i12 = 1;
                }
                if (!hashMap.containsKey(i12)) {
                    hashMap.put(i12, new ArrayList());
                }
                ((List) hashMap.get(i12)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i10 = Math.round(this.I * 0.66f);
            } else {
                i10 = this.I;
            }
            Iterator it = list.iterator();
            float f10 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = mVar.f9713c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new s.h());
                }
                s.i iVar = ((s.h) hashMap2.get(Integer.valueOf(id))).f9649d;
                iVar.f9683w = R.id.circle_center;
                iVar.f9684x = i10;
                iVar.f9685y = f10;
                f10 += 360.0f / list.size();
            }
        }
        mVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i13 = 0;
        while (true) {
            SparseArray sparseArray = this.O;
            if (i13 < sparseArray.size()) {
                ((TextView) sparseArray.get(i13)).setVisibility(0);
                i13++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        boolean z9;
        RadialGradient radialGradient;
        RectF rectF2 = this.K.f2846x;
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        int i10 = 0;
        while (true) {
            sparseArray = this.O;
            int size = sparseArray.size();
            rectF = this.M;
            rect = this.L;
            if (i10 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f10) {
                    textView = textView2;
                    f10 = height;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            TextView textView3 = (TextView) sparseArray.get(i11);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                textView3.setSelected(z9);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.N);
                rectF.inset(r8.left, r8.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.Q, this.R, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.W.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.V / Math.max(Math.max(this.T / displayMetrics.heightPixels, this.U / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
