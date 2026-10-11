package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import g0.h0;
import g0.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockHandView extends View {
    public boolean A;
    public double B;
    public int C;
    public int D;

    /* renamed from: a, reason: collision with root package name */
    public final ValueAnimator f2840a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2841b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2842c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2843d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2844e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f2845f;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f2846x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2847y;

    /* renamed from: z, reason: collision with root package name */
    public float f2848z;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f2840a = new ValueAnimator();
        this.f2842c = new ArrayList();
        Paint paint = new Paint();
        this.f2845f = paint;
        this.f2846x = new RectF();
        this.D = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s5.a.f9903d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        j5.a.a0(context, R.attr.motionDurationLong2, 200);
        j5.a.b0(context, R.attr.motionEasingEmphasizedInterpolator, t5.a.f10035b);
        this.C = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f2843d = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f2847y = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f2844e = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = y0.f4277a;
        h0.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i10) {
        if (i10 == 2) {
            return Math.round(this.C * 0.66f);
        }
        return this.C;
    }

    public final void b(float f10) {
        ValueAnimator valueAnimator = this.f2840a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f10);
    }

    public final void c(float f10) {
        float f11 = f10 % 360.0f;
        this.f2848z = f11;
        this.B = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a10 = a(this.D);
        float cos = (((float) Math.cos(this.B)) * a10) + width;
        float sin = (a10 * ((float) Math.sin(this.B))) + height;
        float f12 = this.f2843d;
        this.f2846x.set(cos - f12, sin - f12, cos + f12, sin + f12);
        Iterator it = this.f2842c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f2838a0 - f11) > 0.001f) {
                clockFaceView.f2838a0 = f11;
                clockFaceView.g();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float a10 = a(this.D);
        float cos = (((float) Math.cos(this.B)) * a10) + f10;
        float f11 = height;
        float sin = (a10 * ((float) Math.sin(this.B))) + f11;
        Paint paint = this.f2845f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f2843d, paint);
        double sin2 = Math.sin(this.B);
        paint.setStrokeWidth(this.f2847y);
        canvas.drawLine(f10, f11, width + ((int) (Math.cos(this.B) * r12)), height + ((int) (r12 * sin2)), paint);
        canvas.drawCircle(f10, f11, this.f2844e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (!this.f2840a.isRunning()) {
            b(this.f2848z);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        float x9 = motionEvent.getX();
        float y9 = motionEvent.getY();
        boolean z12 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z10 = false;
                z9 = false;
            } else {
                z10 = this.A;
                if (this.f2841b) {
                    if (((float) Math.hypot(x9 - (getWidth() / 2), y9 - (getHeight() / 2))) <= a(2) + TypedValue.applyDimension(1, 12, getContext().getResources().getDisplayMetrics())) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    this.D = i10;
                }
                z9 = false;
            }
        } else {
            this.A = false;
            z9 = true;
            z10 = false;
        }
        boolean z13 = this.A;
        int degrees = ((int) Math.toDegrees(Math.atan2(y9 - (getHeight() / 2), x9 - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f10 = degrees;
        if (this.f2848z != f10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z9 || !z11) {
            if (z11 || z10) {
                b(f10);
            }
            this.A = z13 | z12;
            return true;
        }
        z12 = true;
        this.A = z13 | z12;
        return true;
    }
}
