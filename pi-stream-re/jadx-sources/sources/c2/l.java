package c2;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class l extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, c {

    /* renamed from: c, reason: collision with root package name */
    public final j f2026c;

    /* renamed from: e, reason: collision with root package name */
    public final GestureDetector f2028e;

    /* renamed from: a, reason: collision with root package name */
    public final PointF f2024a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    public final PointF f2025b = new PointF();

    /* renamed from: d, reason: collision with root package name */
    public final float f2027d = 25.0f;

    /* renamed from: f, reason: collision with root package name */
    public volatile float f2029f = 3.1415927f;

    public l(Context context, j jVar) {
        this.f2026c = jVar;
        this.f2028e = new GestureDetector(context, this);
    }

    @Override // c2.c
    public final void a(float[] fArr, float f10) {
        this.f2029f = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f2024a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x9 = (motionEvent2.getX() - this.f2024a.x) / this.f2027d;
        float y9 = motionEvent2.getY();
        PointF pointF = this.f2024a;
        float f12 = (y9 - pointF.y) / this.f2027d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f2029f;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.f2025b;
        pointF2.x -= (cos * x9) - (sin * f12);
        float f13 = (cos * f12) + (sin * x9) + pointF2.y;
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        j jVar = this.f2026c;
        PointF pointF3 = this.f2025b;
        synchronized (jVar) {
            float f14 = pointF3.y;
            jVar.f2012x = f14;
            Matrix.setRotateM(jVar.f2010e, 0, -f14, (float) Math.cos(jVar.f2013y), (float) Math.sin(jVar.f2013y), 0.0f);
            Matrix.setRotateM(jVar.f2011f, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f2026c.B.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f2028e.onTouchEvent(motionEvent);
    }
}
