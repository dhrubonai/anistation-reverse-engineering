package m3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public c f7278a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f7279b;

    /* renamed from: c, reason: collision with root package name */
    public final m1 f7280c;

    /* renamed from: d, reason: collision with root package name */
    public final m1 f7281d;

    /* renamed from: e, reason: collision with root package name */
    public w f7282e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7283f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7284g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7285h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7286i;

    /* renamed from: j, reason: collision with root package name */
    public int f7287j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7288k;

    /* renamed from: l, reason: collision with root package name */
    public int f7289l;

    /* renamed from: m, reason: collision with root package name */
    public int f7290m;

    /* renamed from: n, reason: collision with root package name */
    public int f7291n;
    public int o;

    public k0() {
        d0.h hVar = new d0.h(this, 0);
        d0.h hVar2 = new d0.h(this, 1);
        this.f7280c = new m1(hVar);
        this.f7281d = new m1(hVar2);
        this.f7283f = false;
        this.f7284g = false;
        this.f7285h = true;
        this.f7286i = true;
    }

    public static int F(View view) {
        return ((l0) view.getLayoutParams()).a();
    }

    public static j0 G(Context context, AttributeSet attributeSet, int i10, int i11) {
        j0 j0Var = new j0();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l3.a.f6817a, i10, i11);
        j0Var.f7266a = obtainStyledAttributes.getInt(0, 1);
        j0Var.f7267b = obtainStyledAttributes.getInt(10, 1);
        j0Var.f7268c = obtainStyledAttributes.getBoolean(9, false);
        j0Var.f7269d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return j0Var;
    }

    public static boolean K(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i10) {
                return false;
            }
            return true;
        }
        if (size < i10) {
            return false;
        }
        return true;
    }

    public static void L(View view, int i10, int i11, int i12, int i13) {
        l0 l0Var = (l0) view.getLayoutParams();
        Rect rect = l0Var.f7295b;
        view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) l0Var).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) l0Var).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) l0Var).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) l0Var).bottomMargin);
    }

    public static int g(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i11, i12);
            }
            return size;
        }
        return Math.min(size, Math.max(i11, i12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1a
            if (r8 < 0) goto L11
            goto L1c
        L11:
            if (r8 != r1) goto L2f
            if (r6 == r2) goto L20
            if (r6 == 0) goto L2f
            if (r6 == r3) goto L20
            goto L2f
        L1a:
            if (r8 < 0) goto L1e
        L1c:
            r6 = r3
            goto L31
        L1e:
            if (r8 != r1) goto L22
        L20:
            r8 = r5
            goto L31
        L22:
            if (r8 != r0) goto L2f
            if (r6 == r2) goto L2c
            if (r6 != r3) goto L29
            goto L2c
        L29:
            r8 = r5
            r6 = r7
            goto L31
        L2c:
            r8 = r5
            r6 = r2
            goto L31
        L2f:
            r6 = r7
            r8 = r6
        L31:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.k0.w(boolean, int, int, int, int):int");
    }

    public final int A() {
        RecyclerView recyclerView = this.f7279b;
        WeakHashMap weakHashMap = g0.y0.f4277a;
        return g0.i0.d(recyclerView);
    }

    public final int B() {
        RecyclerView recyclerView = this.f7279b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f7279b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f7279b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f7279b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int H(a3.h hVar, w0 w0Var) {
        return -1;
    }

    public final void I(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((l0) view.getLayoutParams()).f7295b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f7279b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f7279b.C;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean J() {
        return false;
    }

    public void M(int i10) {
        RecyclerView recyclerView = this.f7279b;
        if (recyclerView != null) {
            int e10 = recyclerView.f1238f.e();
            for (int i11 = 0; i11 < e10; i11++) {
                recyclerView.f1238f.d(i11).offsetLeftAndRight(i10);
            }
        }
    }

    public void N(int i10) {
        RecyclerView recyclerView = this.f7279b;
        if (recyclerView != null) {
            int e10 = recyclerView.f1238f.e();
            for (int i11 = 0; i11 < e10; i11++) {
                recyclerView.f1238f.d(i11).offsetTopAndBottom(i10);
            }
        }
    }

    public void O() {
    }

    public void P(RecyclerView recyclerView) {
    }

    public View Q(View view, int i10, a3.h hVar, w0 w0Var) {
        return null;
    }

    public void R(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f7279b;
        a3.h hVar = recyclerView.f1232c;
        w0 w0Var = recyclerView.f1258x0;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z9 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f7279b.canScrollVertically(-1) && !this.f7279b.canScrollHorizontally(-1) && !this.f7279b.canScrollHorizontally(1)) {
                z9 = false;
            }
            accessibilityEvent.setScrollable(z9);
            d0 d0Var = this.f7279b.D;
            if (d0Var != null) {
                accessibilityEvent.setItemCount(d0Var.a());
            }
        }
    }

    public void S(a3.h hVar, w0 w0Var, h0.h hVar2) {
        boolean canScrollVertically = this.f7279b.canScrollVertically(-1);
        AccessibilityNodeInfo accessibilityNodeInfo = hVar2.f4539a;
        if (canScrollVertically || this.f7279b.canScrollHorizontally(-1)) {
            hVar2.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f7279b.canScrollVertically(1) || this.f7279b.canScrollHorizontally(1)) {
            hVar2.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(H(hVar, w0Var), x(hVar, w0Var), false, 0));
    }

    public void T(a3.h hVar, w0 w0Var, View view, h0.h hVar2) {
    }

    public final void U(View view, h0.h hVar) {
        a1 L = RecyclerView.L(view);
        if (L != null && !L.j() && !this.f7278a.j(L.f7153a)) {
            RecyclerView recyclerView = this.f7279b;
            T(recyclerView.f1232c, recyclerView.f1258x0, view, hVar);
        }
    }

    public void V(int i10, int i11) {
    }

    public void W() {
    }

    public void X(int i10, int i11) {
    }

    public void Y(int i10, int i11) {
    }

    public void Z(int i10, int i11) {
    }

    public abstract void a0(a3.h hVar, w0 w0Var);

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r8, int r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.k0.b(android.view.View, int, boolean):void");
    }

    public abstract void b0(w0 w0Var);

    public void c(String str) {
        RecyclerView recyclerView = this.f7279b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public void c0(Parcelable parcelable) {
    }

    public abstract boolean d();

    public Parcelable d0() {
        return null;
    }

    public boolean e() {
        return false;
    }

    public void e0(int i10) {
    }

    public boolean f(l0 l0Var) {
        return l0Var != null;
    }

    public final void f0(a3.h hVar) {
        int v9 = v();
        while (true) {
            v9--;
            if (v9 >= 0) {
                if (!RecyclerView.L(u(v9)).p()) {
                    View u9 = u(v9);
                    i0(v9);
                    hVar.i(u9);
                }
            } else {
                return;
            }
        }
    }

    public final void g0(a3.h hVar) {
        Cloneable cloneable;
        int size = ((ArrayList) hVar.f66c).size();
        int i10 = size - 1;
        while (true) {
            cloneable = hVar.f66c;
            if (i10 < 0) {
                break;
            }
            View view = ((a1) ((ArrayList) cloneable).get(i10)).f7153a;
            a1 L = RecyclerView.L(view);
            if (!L.p()) {
                L.o(false);
                if (L.l()) {
                    this.f7279b.removeDetachedView(view, false);
                }
                h0 h0Var = this.f7279b.f1239f0;
                if (h0Var != null) {
                    h0Var.d(L);
                }
                L.o(true);
                a1 L2 = RecyclerView.L(view);
                L2.f7166n = null;
                L2.o = false;
                L2.f7162j &= -33;
                hVar.j(L2);
            }
            i10--;
        }
        ((ArrayList) cloneable).clear();
        ArrayList arrayList = (ArrayList) hVar.f67d;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.f7279b.invalidate();
        }
    }

    public void h(int i10, int i11, w0 w0Var, n.g gVar) {
    }

    public final void h0(View view, a3.h hVar) {
        c cVar = this.f7278a;
        c0 c0Var = cVar.f7181a;
        int i10 = cVar.f7184d;
        if (i10 != 1) {
            if (i10 != 2) {
                try {
                    cVar.f7184d = 1;
                    cVar.f7185e = view;
                    int indexOfChild = c0Var.f7186a.indexOfChild(view);
                    if (indexOfChild >= 0) {
                        if (cVar.f7182b.f(indexOfChild)) {
                            cVar.k(view);
                        }
                        c0Var.i(indexOfChild);
                    }
                    cVar.f7184d = 0;
                    cVar.f7185e = null;
                    hVar.i(view);
                    return;
                } catch (Throwable th) {
                    cVar.f7184d = 0;
                    cVar.f7185e = null;
                    throw th;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public void i(int i10, n.g gVar) {
    }

    public final void i0(int i10) {
        if (u(i10) != null) {
            c cVar = this.f7278a;
            c0 c0Var = cVar.f7181a;
            int i11 = cVar.f7184d;
            if (i11 != 1) {
                if (i11 != 2) {
                    try {
                        int f10 = cVar.f(i10);
                        View childAt = c0Var.f7186a.getChildAt(f10);
                        if (childAt != null) {
                            cVar.f7184d = 1;
                            cVar.f7185e = childAt;
                            if (cVar.f7182b.f(f10)) {
                                cVar.k(childAt);
                            }
                            c0Var.i(f10);
                        }
                        return;
                    } finally {
                        cVar.f7184d = 0;
                        cVar.f7185e = null;
                    }
                }
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
    }

    public abstract int j(w0 w0Var);

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        if (r10 == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.C()
            int r1 = r8.E()
            int r2 = r8.f7291n
            int r3 = r8.D()
            int r2 = r2 - r3
            int r3 = r8.o
            int r4 = r8.B()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.A()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            if (r13 == 0) goto Lab
            android.view.View r10 = r9.getFocusedChild()
            if (r10 != 0) goto L74
            goto La8
        L74:
            int r11 = r8.C()
            int r13 = r8.E()
            int r3 = r8.f7291n
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r8.o
            int r5 = r8.B()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f7279b
            android.graphics.Rect r5 = r5.A
            r8.y(r10, r5)
            int r10 = r5.left
            int r10 = r10 - r2
            if (r10 >= r3) goto La8
            int r10 = r5.right
            int r10 = r10 - r2
            if (r10 <= r11) goto La8
            int r10 = r5.top
            int r10 = r10 - r1
            if (r10 >= r4) goto La8
            int r10 = r5.bottom
            int r10 = r10 - r1
            if (r10 > r13) goto La6
            goto La8
        La6:
            r10 = r7
            goto La9
        La8:
            r10 = r0
        La9:
            if (r10 == 0) goto Lb0
        Lab:
            if (r2 != 0) goto Lb1
            if (r1 == 0) goto Lb0
            goto Lb1
        Lb0:
            return r0
        Lb1:
            if (r12 == 0) goto Lb7
            r9.scrollBy(r2, r1)
            goto Lba
        Lb7:
            r9.g0(r2, r1, r0)
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.k0.j0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int k(w0 w0Var);

    public final void k0() {
        RecyclerView recyclerView = this.f7279b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int l(w0 w0Var);

    public abstract int l0(int i10, a3.h hVar, w0 w0Var);

    public int m(w0 w0Var) {
        return 0;
    }

    public abstract void m0(int i10);

    public int n(w0 w0Var) {
        return 0;
    }

    public int n0(int i10, a3.h hVar, w0 w0Var) {
        return 0;
    }

    public int o(w0 w0Var) {
        return 0;
    }

    public final void o0(RecyclerView recyclerView) {
        p0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void p(a3.h hVar) {
        int v9 = v();
        while (true) {
            v9--;
            if (v9 >= 0) {
                View u9 = u(v9);
                a1 L = RecyclerView.L(u9);
                if (L.p()) {
                    if (RecyclerView.R0) {
                        Log.d("RecyclerView", "ignoring view " + L);
                    }
                } else if (L.h() && !L.j() && !this.f7279b.D.f7193b) {
                    i0(v9);
                    hVar.j(L);
                } else {
                    u(v9);
                    this.f7278a.c(v9);
                    hVar.k(u9);
                    this.f7279b.f1257x.l(L);
                }
            } else {
                return;
            }
        }
    }

    public final void p0(int i10, int i11) {
        this.f7291n = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.f7289l = mode;
        if (mode == 0 && !RecyclerView.U0) {
            this.f7291n = 0;
        }
        this.o = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f7290m = mode2;
        if (mode2 == 0 && !RecyclerView.U0) {
            this.o = 0;
        }
    }

    public View q(int i10) {
        int v9 = v();
        for (int i11 = 0; i11 < v9; i11++) {
            View u9 = u(i11);
            a1 L = RecyclerView.L(u9);
            if (L != null && L.d() == i10 && !L.p() && (this.f7279b.f1258x0.f7412g || !L.j())) {
                return u9;
            }
        }
        return null;
    }

    public void q0(Rect rect, int i10, int i11) {
        int D = D() + C() + rect.width();
        int B = B() + E() + rect.height();
        RecyclerView recyclerView = this.f7279b;
        WeakHashMap weakHashMap = g0.y0.f4277a;
        RecyclerView.g(this.f7279b, g(i10, D, g0.h0.e(recyclerView)), g(i11, B, g0.h0.d(this.f7279b)));
    }

    public abstract l0 r();

    public final void r0(int i10, int i11) {
        int v9 = v();
        if (v9 == 0) {
            this.f7279b.q(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < v9; i16++) {
            View u9 = u(i16);
            Rect rect = this.f7279b.A;
            y(u9, rect);
            int i17 = rect.left;
            if (i17 < i15) {
                i15 = i17;
            }
            int i18 = rect.right;
            if (i18 > i12) {
                i12 = i18;
            }
            int i19 = rect.top;
            if (i19 < i13) {
                i13 = i19;
            }
            int i20 = rect.bottom;
            if (i20 > i14) {
                i14 = i20;
            }
        }
        this.f7279b.A.set(i15, i13, i12, i14);
        q0(this.f7279b.A, i10, i11);
    }

    public l0 s(Context context, AttributeSet attributeSet) {
        return new l0(context, attributeSet);
    }

    public final void s0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f7279b = null;
            this.f7278a = null;
            this.f7291n = 0;
            this.o = 0;
        } else {
            this.f7279b = recyclerView;
            this.f7278a = recyclerView.f1238f;
            this.f7291n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.f7289l = 1073741824;
        this.f7290m = 1073741824;
    }

    public l0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof l0) {
            return new l0((l0) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new l0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new l0(layoutParams);
    }

    public final boolean t0(View view, int i10, int i11, l0 l0Var) {
        if (!view.isLayoutRequested() && this.f7285h && K(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) l0Var).width) && K(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) l0Var).height)) {
            return false;
        }
        return true;
    }

    public final View u(int i10) {
        c cVar = this.f7278a;
        if (cVar != null) {
            return cVar.d(i10);
        }
        return null;
    }

    public boolean u0() {
        return false;
    }

    public final int v() {
        c cVar = this.f7278a;
        if (cVar != null) {
            return cVar.e();
        }
        return 0;
    }

    public final boolean v0(View view, int i10, int i11, l0 l0Var) {
        if (this.f7285h && K(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) l0Var).width) && K(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) l0Var).height)) {
            return false;
        }
        return true;
    }

    public abstract void w0(RecyclerView recyclerView, int i10);

    public int x(a3.h hVar, w0 w0Var) {
        return -1;
    }

    public final void x0(w wVar) {
        w wVar2 = this.f7282e;
        if (wVar2 != null && wVar != wVar2 && wVar2.f7395e) {
            wVar2.i();
        }
        this.f7282e = wVar;
        RecyclerView recyclerView = this.f7279b;
        z0 z0Var = recyclerView.f1254u0;
        z0Var.f7433x.removeCallbacks(z0Var);
        z0Var.f7429c.abortAnimation();
        if (wVar.f7398h) {
            Log.w("RecyclerView", "An instance of " + wVar.getClass().getSimpleName() + " was started more than once. Each instance of" + wVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        wVar.f7392b = recyclerView;
        wVar.f7393c = this;
        int i10 = wVar.f7391a;
        if (i10 != -1) {
            recyclerView.f1258x0.f7406a = i10;
            wVar.f7395e = true;
            wVar.f7394d = true;
            wVar.f7396f = recyclerView.E.q(i10);
            wVar.f7392b.f1254u0.b();
            wVar.f7398h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public void y(View view, Rect rect) {
        boolean z9 = RecyclerView.Q0;
        l0 l0Var = (l0) view.getLayoutParams();
        Rect rect2 = l0Var.f7295b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) l0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) l0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) l0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) l0Var).bottomMargin);
    }

    public boolean y0() {
        return false;
    }

    public final int z() {
        d0 d0Var;
        RecyclerView recyclerView = this.f7279b;
        if (recyclerView != null) {
            d0Var = recyclerView.getAdapter();
        } else {
            d0Var = null;
        }
        if (d0Var != null) {
            return d0Var.a();
        }
        return 0;
    }
}
