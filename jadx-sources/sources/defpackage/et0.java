package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class et0 extends View.DragShadowBuilder {
    public final xd1 a;
    public final long b;
    public final ub2 c;

    public et0(xd1 xd1Var, long j, ub2 ub2Var) {
        this.a = xd1Var;
        this.b = j;
        this.c = ub2Var;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        xg0 xg0Var = new xg0();
        Canvas canvas2 = u9.a;
        t9 t9Var = new t9();
        t9Var.a = canvas;
        wg0 wg0Var = xg0Var.x;
        ud1 ud1Var = wg0Var.a;
        ia3 ia3Var = wg0Var.b;
        vg0 vg0Var = wg0Var.c;
        long j = wg0Var.d;
        wg0Var.a = this.a;
        wg0Var.b = ia3.x;
        wg0Var.c = t9Var;
        wg0Var.d = this.b;
        t9Var.h();
        this.c.invoke(xg0Var);
        t9Var.p();
        wg0Var.a = ud1Var;
        wg0Var.b = ia3Var;
        wg0Var.c = vg0Var;
        wg0Var.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        xd1 xd1Var = this.a;
        point.set(xd1Var.x0(intBitsToFloat / xd1Var.b()), xd1Var.x0(Float.intBitsToFloat((int) (j & 4294967295L)) / xd1Var.b()));
        point2.set(point.x / 2, point.y / 2);
    }
}
