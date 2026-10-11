package m3;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class w {

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f7392b;

    /* renamed from: c, reason: collision with root package name */
    public k0 f7393c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7394d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7395e;

    /* renamed from: f, reason: collision with root package name */
    public View f7396f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7398h;

    /* renamed from: k, reason: collision with root package name */
    public PointF f7401k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f7402l;

    /* renamed from: n, reason: collision with root package name */
    public float f7404n;

    /* renamed from: a, reason: collision with root package name */
    public int f7391a = -1;

    /* renamed from: g, reason: collision with root package name */
    public final u0 f7397g = new u0();

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f7399i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f7400j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    public boolean f7403m = false;
    public int o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f7405p = 0;

    public w(Context context) {
        this.f7402l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i10, int i11, int i12, int i13, int i14) {
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 == 1) {
                    return i13 - i11;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        }
        return i12 - i10;
    }

    public int b(View view, int i10) {
        k0 k0Var = this.f7393c;
        if (k0Var != null && k0Var.d()) {
            l0 l0Var = (l0) view.getLayoutParams();
            return a((view.getLeft() - ((l0) view.getLayoutParams()).f7295b.left) - ((ViewGroup.MarginLayoutParams) l0Var).leftMargin, view.getRight() + ((l0) view.getLayoutParams()).f7295b.right + ((ViewGroup.MarginLayoutParams) l0Var).rightMargin, k0Var.C(), k0Var.f7291n - k0Var.D(), i10);
        }
        return 0;
    }

    public float c(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public final int d(int i10) {
        return (int) Math.ceil(e(i10) / 0.3356d);
    }

    public int e(int i10) {
        float abs = Math.abs(i10);
        if (!this.f7403m) {
            this.f7404n = c(this.f7402l);
            this.f7403m = true;
        }
        return (int) Math.ceil(abs * this.f7404n);
    }

    public PointF f(int i10) {
        Object obj = this.f7393c;
        if (obj instanceof v0) {
            return ((v0) obj).a(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + v0.class.getCanonicalName());
        return null;
    }

    public final void g(int i10, int i11) {
        PointF f10;
        RecyclerView recyclerView = this.f7392b;
        int i12 = -1;
        if (this.f7391a == -1 || recyclerView == null) {
            i();
        }
        if (this.f7394d && this.f7396f == null && this.f7393c != null && (f10 = f(this.f7391a)) != null) {
            float f11 = f10.x;
            if (f11 != 0.0f || f10.y != 0.0f) {
                recyclerView.d0((int) Math.signum(f11), (int) Math.signum(f10.y), null);
            }
        }
        boolean z9 = false;
        this.f7394d = false;
        View view = this.f7396f;
        u0 u0Var = this.f7397g;
        if (view != null) {
            this.f7392b.getClass();
            a1 L = RecyclerView.L(view);
            if (L != null) {
                i12 = L.d();
            }
            if (i12 == this.f7391a) {
                h(this.f7396f, recyclerView.f1258x0, u0Var);
                u0Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f7396f = null;
            }
        }
        if (this.f7395e) {
            w0 w0Var = recyclerView.f1258x0;
            if (this.f7392b.E.v() == 0) {
                i();
            } else {
                int i13 = this.o;
                int i14 = i13 - i10;
                if (i13 * i14 <= 0) {
                    i14 = 0;
                }
                this.o = i14;
                int i15 = this.f7405p;
                int i16 = i15 - i11;
                if (i15 * i16 <= 0) {
                    i16 = 0;
                }
                this.f7405p = i16;
                if (i14 == 0 && i16 == 0) {
                    PointF f12 = f(this.f7391a);
                    if (f12 != null) {
                        if (f12.x != 0.0f || f12.y != 0.0f) {
                            float f13 = f12.y;
                            float sqrt = (float) Math.sqrt((f13 * f13) + (r10 * r10));
                            float f14 = f12.x / sqrt;
                            f12.x = f14;
                            float f15 = f12.y / sqrt;
                            f12.y = f15;
                            this.f7401k = f12;
                            this.o = (int) (f14 * 10000.0f);
                            this.f7405p = (int) (f15 * 10000.0f);
                            int e10 = e(10000);
                            LinearInterpolator linearInterpolator = this.f7399i;
                            u0Var.f7381a = (int) (this.o * 1.2f);
                            u0Var.f7382b = (int) (this.f7405p * 1.2f);
                            u0Var.f7383c = (int) (e10 * 1.2f);
                            u0Var.f7385e = linearInterpolator;
                            u0Var.f7386f = true;
                        }
                    }
                    u0Var.f7384d = this.f7391a;
                    i();
                }
            }
            if (u0Var.f7384d >= 0) {
                z9 = true;
            }
            u0Var.a(recyclerView);
            if (z9 && this.f7395e) {
                this.f7394d = true;
                recyclerView.f1254u0.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(android.view.View r7, m3.w0 r8, m3.u0 r9) {
        /*
            r6 = this;
            android.graphics.PointF r8 = r6.f7401k
            r0 = 1
            r1 = -1
            r2 = 0
            r3 = 0
            if (r8 == 0) goto L15
            float r8 = r8.x
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 != 0) goto Lf
            goto L15
        Lf:
            if (r8 <= 0) goto L13
            r8 = r0
            goto L16
        L13:
            r8 = r1
            goto L16
        L15:
            r8 = r3
        L16:
            int r8 = r6.b(r7, r8)
            android.graphics.PointF r4 = r6.f7401k
            if (r4 == 0) goto L29
            float r4 = r4.y
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L25
            goto L29
        L25:
            if (r2 <= 0) goto L2a
            r1 = r0
            goto L2a
        L29:
            r1 = r3
        L2a:
            m3.k0 r2 = r6.f7393c
            if (r2 == 0) goto L6e
            boolean r4 = r2.e()
            if (r4 != 0) goto L35
            goto L6e
        L35:
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            m3.l0 r3 = (m3.l0) r3
            int r4 = r7.getTop()
            android.view.ViewGroup$LayoutParams r5 = r7.getLayoutParams()
            m3.l0 r5 = (m3.l0) r5
            android.graphics.Rect r5 = r5.f7295b
            int r5 = r5.top
            int r4 = r4 - r5
            int r5 = r3.topMargin
            int r4 = r4 - r5
            int r5 = r7.getBottom()
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            m3.l0 r7 = (m3.l0) r7
            android.graphics.Rect r7 = r7.f7295b
            int r7 = r7.bottom
            int r5 = r5 + r7
            int r7 = r3.bottomMargin
            int r5 = r5 + r7
            int r7 = r2.E()
            int r3 = r2.o
            int r2 = r2.B()
            int r3 = r3 - r2
            int r3 = a(r4, r5, r7, r3, r1)
        L6e:
            int r7 = r8 * r8
            int r1 = r3 * r3
            int r1 = r1 + r7
            double r1 = (double) r1
            double r1 = java.lang.Math.sqrt(r1)
            int r7 = (int) r1
            int r7 = r6.d(r7)
            if (r7 <= 0) goto L8d
            int r8 = -r8
            int r1 = -r3
            android.view.animation.DecelerateInterpolator r2 = r6.f7400j
            r9.f7381a = r8
            r9.f7382b = r1
            r9.f7383c = r7
            r9.f7385e = r2
            r9.f7386f = r0
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.w.h(android.view.View, m3.w0, m3.u0):void");
    }

    public final void i() {
        if (this.f7395e) {
            this.f7395e = false;
            this.f7405p = 0;
            this.o = 0;
            this.f7401k = null;
            this.f7392b.f1258x0.f7406a = -1;
            this.f7396f = null;
            this.f7391a = -1;
            this.f7394d = false;
            k0 k0Var = this.f7393c;
            if (k0Var.f7282e == this) {
                k0Var.f7282e = null;
            }
            this.f7393c = null;
            this.f7392b = null;
        }
    }
}
