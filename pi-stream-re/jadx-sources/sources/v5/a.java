package v5;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import g0.i0;
import g0.y0;
import java.util.WeakHashMap;
import r6.h0;

/* loaded from: classes.dex */
public final class a extends h0 {

    /* renamed from: g, reason: collision with root package name */
    public int f10663g;

    /* renamed from: h, reason: collision with root package name */
    public int f10664h = -1;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f10665i;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f10665i = swipeDismissBehavior;
    }

    @Override // r6.h0
    public final int Z(View view) {
        return view.getWidth();
    }

    @Override // r6.h0
    public final boolean b1(View view, int i10) {
        int i11 = this.f10664h;
        if ((i11 == -1 || i11 == i10) && this.f10665i.r(view)) {
            return true;
        }
        return false;
    }

    @Override // r6.h0
    public final void p0(View view, int i10) {
        this.f10664h = i10;
        this.f10663g = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f10665i;
            swipeDismissBehavior.f2645c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f2645c = false;
        }
    }

    @Override // r6.h0
    public final void q0(int i10) {
        this.f10665i.getClass();
    }

    @Override // r6.h0
    public final void r0(View view, int i10, int i11) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f10665i;
        float f10 = width * swipeDismissBehavior.f2648f;
        float width2 = view.getWidth() * swipeDismissBehavior.f2649g;
        float abs = Math.abs(i10 - this.f10663g);
        if (abs <= f10) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f10) / (width2 - f10))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0050, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f10663g) >= java.lang.Math.round(r9.getWidth() * r3.f2647e)) goto L27;
     */
    @Override // r6.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s0(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f10664h = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f10665i
            r4 = 0
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = g0.y0.f4277a
            int r5 = g0.i0.d(r9)
            if (r5 != r2) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r3.f2646d
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L54
            goto L52
        L2a:
            if (r1 <= 0) goto L54
            goto L52
        L2d:
            if (r6 != r2) goto L54
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L54
            goto L52
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L54
            goto L52
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.f10663g
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r3.f2647e
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L54
        L52:
            r1 = r2
            goto L55
        L54:
            r1 = r4
        L55:
            if (r1 == 0) goto L6b
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L66
            int r10 = r9.getLeft()
            int r0 = r8.f10663g
            if (r10 >= r0) goto L64
            goto L66
        L64:
            int r0 = r0 + r11
            goto L6e
        L66:
            int r10 = r8.f10663g
            int r0 = r10 - r11
            goto L6e
        L6b:
            int r0 = r8.f10663g
            r2 = r4
        L6e:
            o0.d r10 = r3.f2643a
            int r11 = r9.getTop()
            boolean r10 = r10.q(r0, r11)
            if (r10 == 0) goto L84
            v5.b r10 = new v5.b
            r10.<init>(r3, r9, r2)
            java.util.WeakHashMap r11 = g0.y0.f4277a
            g0.h0.m(r9, r10)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.a.s0(android.view.View, float, float):void");
    }

    @Override // r6.h0
    public final int y(View view, int i10) {
        boolean z9;
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = y0.f4277a;
        if (i0.d(view) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i11 = this.f10665i.f2646d;
        if (i11 == 0) {
            if (z9) {
                width = this.f10663g - view.getWidth();
                width2 = this.f10663g;
            } else {
                width = this.f10663g;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i11 == 1) {
            if (z9) {
                width = this.f10663g;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f10663g - view.getWidth();
                width2 = this.f10663g;
            }
        } else {
            width = this.f10663g - view.getWidth();
            width2 = view.getWidth() + this.f10663g;
        }
        return Math.min(Math.max(width, i10), width2);
    }

    @Override // r6.h0
    public final int z(View view, int i10) {
        return view.getTop();
    }
}
