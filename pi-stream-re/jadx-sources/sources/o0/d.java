package o0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import g.f;
import g0.y0;
import java.util.Arrays;
import java.util.WeakHashMap;
import r6.h0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: v, reason: collision with root package name */
    public static final c f8079v = new c(0);

    /* renamed from: a, reason: collision with root package name */
    public int f8080a;

    /* renamed from: b, reason: collision with root package name */
    public int f8081b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f8083d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f8084e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f8085f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f8086g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f8087h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f8088i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f8089j;

    /* renamed from: k, reason: collision with root package name */
    public int f8090k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f8091l;

    /* renamed from: m, reason: collision with root package name */
    public final float f8092m;

    /* renamed from: n, reason: collision with root package name */
    public final float f8093n;
    public final int o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f8094p;

    /* renamed from: q, reason: collision with root package name */
    public final h0 f8095q;

    /* renamed from: r, reason: collision with root package name */
    public View f8096r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8097s;

    /* renamed from: t, reason: collision with root package name */
    public final ViewGroup f8098t;

    /* renamed from: c, reason: collision with root package name */
    public int f8082c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final f f8099u = new f(this, 4);

    public d(Context context, ViewGroup viewGroup, h0 h0Var) {
        if (viewGroup != null) {
            if (h0Var != null) {
                this.f8098t = viewGroup;
                this.f8095q = h0Var;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.f8081b = viewConfiguration.getScaledTouchSlop();
                this.f8092m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f8093n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f8094p = new OverScroller(context, f8079v);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public final void a() {
        this.f8082c = -1;
        float[] fArr = this.f8083d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f8084e, 0.0f);
            Arrays.fill(this.f8085f, 0.0f);
            Arrays.fill(this.f8086g, 0.0f);
            Arrays.fill(this.f8087h, 0);
            Arrays.fill(this.f8088i, 0);
            Arrays.fill(this.f8089j, 0);
            this.f8090k = 0;
        }
        VelocityTracker velocityTracker = this.f8091l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8091l = null;
        }
    }

    public final void b(View view, int i10) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f8098t;
        if (parent == viewGroup) {
            this.f8096r = view;
            this.f8082c = i10;
            this.f8095q.p0(view, i10);
            p(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
    }

    public final boolean c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f8087h[i10] & i11) != i11 || (0 & i11) == 0 || (this.f8089j[i10] & i11) == i11 || (this.f8088i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f8081b;
        if (abs <= i12 && abs2 <= i12) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f8095q.getClass();
        }
        if ((this.f8088i[i10] & i11) != 0 || abs <= this.f8081b) {
            return false;
        }
        return true;
    }

    public final boolean d(View view, float f10, float f11) {
        boolean z9;
        boolean z10;
        if (view == null) {
            return false;
        }
        h0 h0Var = this.f8095q;
        if (h0Var.Z(view) > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (h0Var.a0() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 && z10) {
            float f12 = (f11 * f11) + (f10 * f10);
            int i10 = this.f8081b;
            if (f12 <= i10 * i10) {
                return false;
            }
            return true;
        }
        if (z9) {
            if (Math.abs(f10) <= this.f8081b) {
                return false;
            }
            return true;
        }
        if (!z10 || Math.abs(f11) <= this.f8081b) {
            return false;
        }
        return true;
    }

    public final void e(int i10) {
        float[] fArr = this.f8083d;
        if (fArr != null) {
            int i11 = this.f8090k;
            boolean z9 = true;
            int i12 = 1 << i10;
            if ((i12 & i11) == 0) {
                z9 = false;
            }
            if (z9) {
                fArr[i10] = 0.0f;
                this.f8084e[i10] = 0.0f;
                this.f8085f[i10] = 0.0f;
                this.f8086g[i10] = 0.0f;
                this.f8087h[i10] = 0;
                this.f8088i[i10] = 0;
                this.f8089j[i10] = 0;
                this.f8090k = (~i12) & i11;
            }
        }
    }

    public final int f(int i10, int i11, int i12) {
        int abs;
        if (i10 == 0) {
            return 0;
        }
        float width = this.f8098t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs2 = Math.abs(i11);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final boolean g() {
        if (this.f8080a == 2) {
            OverScroller overScroller = this.f8094p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f8096r.getLeft();
            int top = currY - this.f8096r.getTop();
            if (left != 0) {
                View view = this.f8096r;
                WeakHashMap weakHashMap = y0.f4277a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f8096r;
                WeakHashMap weakHashMap2 = y0.f4277a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f8095q.r0(this.f8096r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f8098t.post(this.f8099u);
            }
        }
        if (this.f8080a != 2) {
            return false;
        }
        return true;
    }

    public final View h(int i10, int i11) {
        ViewGroup viewGroup = this.f8098t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f8095q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f8096r
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f8096r
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f8094p
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.p(r11)
            return r11
        L1e:
            android.view.View r12 = r10.f8096r
            float r0 = r10.f8093n
            int r0 = (int) r0
            float r6 = r10.f8092m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L2e
            r13 = r11
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r13 <= 0) goto L34
            r13 = r6
            goto L35
        L34:
            int r13 = -r6
        L35:
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L3c
            goto L43
        L3c:
            if (r7 <= r6) goto L44
            if (r14 <= 0) goto L42
            r14 = r6
            goto L44
        L42:
            int r11 = -r6
        L43:
            r14 = r11
        L44:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L5d
            float r11 = (float) r6
            float r6 = (float) r8
            goto L5f
        L5d:
            float r11 = (float) r11
            float r6 = (float) r9
        L5f:
            float r11 = r11 / r6
            if (r14 == 0) goto L65
            float r0 = (float) r7
            float r6 = (float) r8
            goto L67
        L65:
            float r0 = (float) r0
            float r6 = (float) r9
        L67:
            float r0 = r0 / r6
            r6.h0 r6 = r10.f8095q
            int r12 = r6.Z(r12)
            int r12 = r10.f(r4, r13, r12)
            int r13 = r6.a0()
            int r13 = r10.f(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.p(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.d.i(int, int, int, int):boolean");
    }

    public final boolean j(int i10) {
        boolean z9;
        if ((this.f8090k & (1 << i10)) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f8091l == null) {
            this.f8091l = VelocityTracker.obtain();
        }
        this.f8091l.addMovement(motionEvent);
        int i11 = 0;
        h0 h0Var = this.f8095q;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f8080a == 1 && pointerId == this.f8082c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i11 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i11);
                                            if (pointerId2 != this.f8082c) {
                                                View h10 = h((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                                                View view = this.f8096r;
                                                if (h10 == view && s(view, pointerId2)) {
                                                    i10 = this.f8082c;
                                                    break;
                                                }
                                            }
                                            i11++;
                                        } else {
                                            i10 = -1;
                                            break;
                                        }
                                    }
                                    if (i10 == -1) {
                                        l();
                                    }
                                }
                                e(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x9 = motionEvent.getX(actionIndex);
                        float y9 = motionEvent.getY(actionIndex);
                        n(x9, y9, pointerId3);
                        if (this.f8080a == 0) {
                            s(h((int) x9, (int) y9), pointerId3);
                            if ((this.f8087h[pointerId3] & 0) != 0) {
                                h0Var.getClass();
                                return;
                            }
                            return;
                        }
                        int i12 = (int) x9;
                        int i13 = (int) y9;
                        View view2 = this.f8096r;
                        if (view2 != null && i12 >= view2.getLeft() && i12 < view2.getRight() && i13 >= view2.getTop() && i13 < view2.getBottom()) {
                            i11 = 1;
                        }
                        if (i11 != 0) {
                            s(this.f8096r, pointerId3);
                            return;
                        }
                        return;
                    }
                    if (this.f8080a == 1) {
                        this.f8097s = true;
                        h0Var.s0(this.f8096r, 0.0f, 0.0f);
                        this.f8097s = false;
                        if (this.f8080a == 1) {
                            p(0);
                        }
                    }
                    a();
                    return;
                }
                if (this.f8080a == 1) {
                    if (j(this.f8082c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f8082c);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f8085f;
                        int i14 = this.f8082c;
                        int i15 = (int) (x10 - fArr[i14]);
                        int i16 = (int) (y10 - this.f8086g[i14]);
                        int left = this.f8096r.getLeft() + i15;
                        int top = this.f8096r.getTop() + i16;
                        int left2 = this.f8096r.getLeft();
                        int top2 = this.f8096r.getTop();
                        if (i15 != 0) {
                            left = h0Var.y(this.f8096r, left);
                            WeakHashMap weakHashMap = y0.f4277a;
                            this.f8096r.offsetLeftAndRight(left - left2);
                        }
                        if (i16 != 0) {
                            top = h0Var.z(this.f8096r, top);
                            WeakHashMap weakHashMap2 = y0.f4277a;
                            this.f8096r.offsetTopAndBottom(top - top2);
                        }
                        if (i15 != 0 || i16 != 0) {
                            h0Var.r0(this.f8096r, left, top);
                        }
                        o(motionEvent);
                        return;
                    }
                    return;
                }
                int pointerCount2 = motionEvent.getPointerCount();
                while (i11 < pointerCount2) {
                    int pointerId4 = motionEvent.getPointerId(i11);
                    if (j(pointerId4)) {
                        float x11 = motionEvent.getX(i11);
                        float y11 = motionEvent.getY(i11);
                        float f10 = x11 - this.f8083d[pointerId4];
                        float f11 = y11 - this.f8084e[pointerId4];
                        m(f10, f11, pointerId4);
                        if (this.f8080a != 1) {
                            View h11 = h((int) x11, (int) y11);
                            if (d(h11, f10, f11) && s(h11, pointerId4)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i11++;
                }
                o(motionEvent);
                return;
            }
            if (this.f8080a == 1) {
                l();
            }
            a();
            return;
        }
        float x12 = motionEvent.getX();
        float y12 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View h12 = h((int) x12, (int) y12);
        n(x12, y12, pointerId5);
        s(h12, pointerId5);
        if ((this.f8087h[pointerId5] & 0) != 0) {
            h0Var.getClass();
        }
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f8091l;
        float f10 = this.f8092m;
        velocityTracker.computeCurrentVelocity(1000, f10);
        float xVelocity = this.f8091l.getXVelocity(this.f8082c);
        float abs = Math.abs(xVelocity);
        float f11 = this.f8093n;
        float f12 = 0.0f;
        if (abs < f11) {
            xVelocity = 0.0f;
        } else if (abs > f10) {
            if (xVelocity > 0.0f) {
                xVelocity = f10;
            } else {
                xVelocity = -f10;
            }
        }
        float yVelocity = this.f8091l.getYVelocity(this.f8082c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f11) {
            if (abs2 > f10) {
                if (yVelocity <= 0.0f) {
                    f10 = -f10;
                }
                f12 = f10;
            } else {
                f12 = yVelocity;
            }
        }
        this.f8097s = true;
        this.f8095q.s0(this.f8096r, xVelocity, f12);
        this.f8097s = false;
        if (this.f8080a == 1) {
            p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final void m(float f10, float f11, int i10) {
        boolean c6 = c(f10, f11, i10, 1);
        boolean z9 = c6;
        if (c(f11, f10, i10, 4)) {
            z9 = (c6 ? 1 : 0) | 4;
        }
        boolean z10 = z9;
        if (c(f10, f11, i10, 2)) {
            z10 = (z9 ? 1 : 0) | 2;
        }
        ?? r02 = z10;
        if (c(f11, f10, i10, 8)) {
            r02 = (z10 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f8088i;
            iArr[i10] = iArr[i10] | r02;
            this.f8095q.getClass();
        }
    }

    public final void n(float f10, float f11, int i10) {
        float[] fArr = this.f8083d;
        int i11 = 0;
        if (fArr == null || fArr.length <= i10) {
            int i12 = i10 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f8084e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f8085f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f8086g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f8087h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f8088i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f8089j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f8083d = fArr2;
            this.f8084e = fArr3;
            this.f8085f = fArr4;
            this.f8086g = fArr5;
            this.f8087h = iArr;
            this.f8088i = iArr2;
            this.f8089j = iArr3;
        }
        float[] fArr9 = this.f8083d;
        this.f8085f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f8084e;
        this.f8086g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f8087h;
        int i13 = (int) f10;
        int i14 = (int) f11;
        ViewGroup viewGroup = this.f8098t;
        int left = viewGroup.getLeft();
        int i15 = this.o;
        if (i13 < left + i15) {
            i11 = 1;
        }
        if (i14 < viewGroup.getTop() + i15) {
            i11 |= 4;
        }
        if (i13 > viewGroup.getRight() - i15) {
            i11 |= 2;
        }
        if (i14 > viewGroup.getBottom() - i15) {
            i11 |= 8;
        }
        iArr7[i10] = i11;
        this.f8090k |= 1 << i10;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (j(pointerId)) {
                float x9 = motionEvent.getX(i10);
                float y9 = motionEvent.getY(i10);
                this.f8085f[pointerId] = x9;
                this.f8086g[pointerId] = y9;
            }
        }
    }

    public final void p(int i10) {
        this.f8098t.removeCallbacks(this.f8099u);
        if (this.f8080a != i10) {
            this.f8080a = i10;
            this.f8095q.q0(i10);
            if (this.f8080a == 0) {
                this.f8096r = null;
            }
        }
    }

    public final boolean q(int i10, int i11) {
        if (this.f8097s) {
            return i(i10, i11, (int) this.f8091l.getXVelocity(this.f8082c), (int) this.f8091l.getYVelocity(this.f8082c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        if (r13 != r12) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.d.r(android.view.MotionEvent):boolean");
    }

    public final boolean s(View view, int i10) {
        if (view == this.f8096r && this.f8082c == i10) {
            return true;
        }
        if (view != null && this.f8095q.b1(view, i10)) {
            this.f8082c = i10;
            b(view, i10);
            return true;
        }
        return false;
    }
}
