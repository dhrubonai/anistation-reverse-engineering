package k0;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {
    public static final int I = ViewConfiguration.getTapTimeout();
    public final float[] A;
    public final float[] B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final ListView H;

    /* renamed from: a, reason: collision with root package name */
    public final a f6297a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f6298b;

    /* renamed from: c, reason: collision with root package name */
    public final View f6299c;

    /* renamed from: d, reason: collision with root package name */
    public g.f f6300d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f6301e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f6302f;

    /* renamed from: x, reason: collision with root package name */
    public int f6303x;

    /* renamed from: y, reason: collision with root package name */
    public int f6304y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f6305z;

    public g(ListView listView) {
        a aVar = new a();
        this.f6297a = aVar;
        this.f6298b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f6301e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f6302f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f6305z = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.A = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.B = fArr5;
        this.f6299c = listView;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f6303x = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f6304y = I;
        aVar.f6288a = 500;
        aVar.f6289b = 500;
        this.H = listView;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f6301e
            r0 = r0[r7]
            float[] r1 = r3.f6302f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f6298b
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            goto L58
        L3c:
            float[] r0 = r3.f6305z
            r0 = r0[r7]
            float[] r1 = r3.A
            r1 = r1[r7]
            float[] r2 = r3.B
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r2 = b(r4, r1, r7)
            goto L58
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r2 = -r4
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.g.a(float, float, float, int):float");
    }

    public final float c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f6303x;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2 || f10 >= 0.0f) {
                return 0.0f;
            }
            return f10 / (-f11);
        }
        if (f10 >= f11) {
            return 0.0f;
        }
        if (f10 >= 0.0f) {
            return 1.0f - (f10 / f11);
        }
        if (!this.F || i10 != 1) {
            return 0.0f;
        }
        return 1.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        if (r0 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.G
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r10.getActionMasked()
            r2 = 3
            r3 = 1
            if (r0 == 0) goto L1a
            if (r0 == r3) goto L16
            r4 = 2
            if (r0 == r4) goto L1e
            if (r0 == r2) goto L16
            goto L7b
        L16:
            r8.e()
            goto L7b
        L1a:
            r8.E = r3
            r8.C = r1
        L1e:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            android.view.View r5 = r8.f6299c
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.a(r0, r4, r6, r1)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.a(r10, r9, r4, r3)
            k0.a r10 = r8.f6297a
            r10.f6290c = r0
            r10.f6291d = r9
            boolean r9 = r8.F
            if (r9 != 0) goto L7b
            boolean r9 = r8.f()
            if (r9 == 0) goto L7b
            g.f r9 = r8.f6300d
            if (r9 != 0) goto L5f
            g.f r9 = new g.f
            r9.<init>(r8, r2)
            r8.f6300d = r9
        L5f:
            r8.F = r3
            r8.D = r3
            boolean r9 = r8.C
            if (r9 != 0) goto L74
            int r9 = r8.f6304y
            if (r9 <= 0) goto L74
            g.f r10 = r8.f6300d
            long r6 = (long) r9
            java.util.WeakHashMap r9 = g0.y0.f4277a
            g0.h0.n(r5, r10, r6)
            goto L79
        L74:
            g.f r9 = r8.f6300d
            r9.run()
        L79:
            r8.C = r3
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.g.d(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void e() {
        int i10 = 0;
        if (this.D) {
            this.F = false;
            return;
        }
        a aVar = this.f6297a;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (currentAnimationTimeMillis - aVar.f6292e);
        int i12 = aVar.f6289b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f6296i = i10;
        aVar.f6295h = aVar.a(currentAnimationTimeMillis);
        aVar.f6294g = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            r8 = this;
            k0.a r0 = r8.f6297a
            float r1 = r0.f6291d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f6290c
            java.lang.Math.abs(r0)
            r0 = 0
            if (r1 == 0) goto L50
            android.widget.ListView r2 = r8.H
            int r3 = r2.getCount()
            r4 = 1
            if (r3 != 0) goto L1c
            goto L4b
        L1c:
            int r5 = r2.getChildCount()
            int r6 = r2.getFirstVisiblePosition()
            int r7 = r6 + r5
            if (r1 <= 0) goto L3a
            if (r7 < r3) goto L49
            int r5 = r5 - r4
            android.view.View r1 = r2.getChildAt(r5)
            int r1 = r1.getBottom()
            int r2 = r2.getHeight()
            if (r1 > r2) goto L49
            goto L4b
        L3a:
            if (r1 >= 0) goto L4b
            if (r6 > 0) goto L49
            android.view.View r1 = r2.getChildAt(r0)
            int r1 = r1.getTop()
            if (r1 < 0) goto L49
            goto L4b
        L49:
            r1 = r4
            goto L4c
        L4b:
            r1 = r0
        L4c:
            if (r1 != 0) goto L4f
            goto L50
        L4f:
            r0 = r4
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.g.f():boolean");
    }

    @Override // android.view.View.OnTouchListener
    public final /* bridge */ /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        d(view, motionEvent);
        return false;
    }
}
