package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import f.p0;
import f0.d;
import g0.h0;
import g0.i0;
import g0.k2;
import g0.l0;
import g0.n0;
import g0.v;
import g0.w;
import g0.x;
import g0.y0;
import i.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import l1.f0;
import msr.pistream.app.R;
import n.k;
import t.a;
import u.b;
import u.c;
import u.e;
import u.f;
import x.j;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements v, w {
    public static final String K;
    public static final Class[] L;
    public static final ThreadLocal M;
    public static final f N;
    public static final d O;
    public View A;
    public View B;
    public m4.d C;
    public boolean D;
    public k2 E;
    public boolean F;
    public Drawable G;
    public ViewGroup.OnHierarchyChangeListener H;
    public p0 I;
    public final x J;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f773a;

    /* renamed from: b, reason: collision with root package name */
    public final g f774b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f775c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f776d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f777e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f778f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f779x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f780y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f781z;

    static {
        String str;
        Package r02 = CoordinatorLayout.class.getPackage();
        if (r02 != null) {
            str = r02.getName();
        } else {
            str = null;
        }
        K = str;
        N = new f(0);
        L = new Class[]{Context.class, AttributeSet.class};
        M = new ThreadLocal();
        O = new d(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f773a = new ArrayList();
        this.f774b = new g(2);
        this.f775c = new ArrayList();
        this.f776d = new ArrayList();
        this.f777e = new int[2];
        this.f778f = new int[2];
        this.J = new x();
        int[] iArr = a.f9950a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            f0.v(this, context, iArr, attributeSet, obtainStyledAttributes);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f781z = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f781z[i10] = (int) (r1[i10] * f10);
            }
        }
        this.G = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new c(this));
        WeakHashMap weakHashMap = y0.f4277a;
        if (h0.c(this) == 0) {
            h0.s(this, 1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) O.j();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void l(int i10, Rect rect, Rect rect2, u.d dVar, int i11, int i12) {
        int width;
        int height;
        int i13 = dVar.f10106c;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
        int i14 = dVar.f10107d;
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        if ((i14 & 112) == 0) {
            i14 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & 112;
        if (i17 != 1) {
            if (i17 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i18 != 16) {
            if (i18 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i15 != 1) {
            if (i15 != 5) {
                width -= i11;
            }
        } else {
            width -= i11 / 2;
        }
        if (i16 != 16) {
            if (i16 != 80) {
                height -= i12;
            }
        } else {
            height -= i12 / 2;
        }
        rect2.set(width, height, i11 + width, i12 + height);
    }

    public static u.d n(View view) {
        u.d dVar = (u.d) view.getLayoutParams();
        if (!dVar.f10105b) {
            b bVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                bVar = (b) cls.getAnnotation(b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    u.a aVar = (u.a) bVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    u.a aVar2 = dVar.f10104a;
                    if (aVar2 != aVar) {
                        if (aVar2 != null) {
                            aVar2.e();
                        }
                        dVar.f10104a = aVar;
                        dVar.f10105b = true;
                        if (aVar != null) {
                            aVar.c(dVar);
                        }
                    }
                } catch (Exception e10) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            dVar.f10105b = true;
        }
        return dVar;
    }

    public static void u(View view, int i10) {
        u.d dVar = (u.d) view.getLayoutParams();
        int i11 = dVar.f10112i;
        if (i11 != i10) {
            WeakHashMap weakHashMap = y0.f4277a;
            view.offsetLeftAndRight(i10 - i11);
            dVar.f10112i = i10;
        }
    }

    public static void v(View view, int i10) {
        u.d dVar = (u.d) view.getLayoutParams();
        int i11 = dVar.f10113j;
        if (i11 != i10) {
            WeakHashMap weakHashMap = y0.f4277a;
            view.offsetTopAndBottom(i10 - i11);
            dVar.f10113j = i10;
        }
    }

    @Override // g0.v
    public final void a(View view, View view2, int i10, int i11) {
        x xVar = this.J;
        if (i11 == 1) {
            xVar.f4271b = i10;
        } else {
            xVar.f4270a = i10;
        }
        this.B = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((u.d) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    @Override // g0.v
    public final void b(View view, int i10) {
        x xVar = this.J;
        if (i10 == 1) {
            xVar.f4271b = 0;
        } else {
            xVar.f4270a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            u.d dVar = (u.d) childAt.getLayoutParams();
            if (dVar.a(i10)) {
                u.a aVar = dVar.f10104a;
                if (aVar != null) {
                    aVar.p(childAt, view, i10);
                }
                if (i10 != 0) {
                    if (i10 == 1) {
                        dVar.o = false;
                    }
                } else {
                    dVar.f10117n = false;
                }
                dVar.getClass();
            }
        }
        this.B = null;
    }

    @Override // g0.v
    public final void c(View view, int i10, int i11, int[] iArr, int i12) {
        u.a aVar;
        int childCount = getChildCount();
        int i13 = 0;
        int i14 = 0;
        boolean z9 = false;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                u.d dVar = (u.d) childAt.getLayoutParams();
                if (dVar.a(i12) && (aVar = dVar.f10104a) != null) {
                    int[] iArr2 = this.f777e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.j(childAt, view, i11, iArr2, i12);
                    if (i10 > 0) {
                        i13 = Math.max(i13, iArr2[0]);
                    } else {
                        i13 = Math.min(i13, iArr2[0]);
                    }
                    if (i11 > 0) {
                        i14 = Math.max(i14, iArr2[1]);
                    } else {
                        i14 = Math.min(i14, iArr2[1]);
                    }
                    z9 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z9) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof u.d) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // g0.w
    public final void d(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        u.a aVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z9 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                u.d dVar = (u.d) childAt.getLayoutParams();
                if (dVar.a(i14) && (aVar = dVar.f10104a) != null) {
                    int[] iArr2 = this.f777e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.k(this, childAt, i11, i12, i13, iArr2);
                    if (i12 > 0) {
                        min = Math.max(i15, iArr2[0]);
                    } else {
                        min = Math.min(i15, iArr2[0]);
                    }
                    i15 = min;
                    if (i13 > 0) {
                        min2 = Math.max(i16, iArr2[1]);
                    } else {
                        min2 = Math.min(i16, iArr2[1]);
                    }
                    i16 = min2;
                    z9 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z9) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        u.a aVar = ((u.d) view.getLayoutParams()).f10104a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.G;
        boolean z9 = false;
        if (drawable != null && drawable.isStateful()) {
            z9 = false | drawable.setState(drawableState);
        }
        if (z9) {
            invalidate();
        }
    }

    @Override // g0.v
    public final void e(View view, int i10, int i11, int i12, int i13, int i14) {
        d(view, i10, i11, i12, i13, 0, this.f778f);
    }

    @Override // g0.v
    public final boolean f(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z9 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                u.d dVar = (u.d) childAt.getLayoutParams();
                u.a aVar = dVar.f10104a;
                if (aVar != null) {
                    boolean o = aVar.o(childAt, i10, i11);
                    z9 |= o;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            dVar.o = o;
                        }
                    } else {
                        dVar.f10117n = o;
                    }
                } else if (i11 != 0) {
                    if (i11 == 1) {
                        dVar.o = false;
                    }
                } else {
                    dVar.f10117n = false;
                }
            }
        }
        return z9;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new u.d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new u.d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f773a);
    }

    public final k2 getLastWindowInsets() {
        return this.E;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        x xVar = this.J;
        return xVar.f4271b | xVar.f4270a;
    }

    public Drawable getStatusBarBackground() {
        return this.G;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(u.d dVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    public final void i(View view, Rect rect, boolean z9) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z9) {
                k(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public final ArrayList j(View view) {
        g gVar = this.f774b;
        int i10 = ((k) gVar.f5199e).f7891c;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) ((k) gVar.f5199e).l(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((k) gVar.f5199e).h(i11));
            }
        }
        ArrayList arrayList3 = this.f776d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = u.g.f10121a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = u.g.f10121a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        u.g.a(this, view, matrix);
        ThreadLocal threadLocal3 = u.g.f10122b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i10) {
        int[] iArr = this.f781z;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i10, int i11) {
        d dVar = O;
        Rect g10 = g();
        k(view, g10);
        try {
            return g10.contains(i10, i11);
        } finally {
            g10.setEmpty();
            dVar.b(g10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.D) {
            if (this.C == null) {
                this.C = new m4.d(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.C);
        }
        if (this.E == null) {
            WeakHashMap weakHashMap = y0.f4277a;
            if (h0.b(this)) {
                l0.c(this);
            }
        }
        this.f780y = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.D && this.C != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.C);
        }
        View view = this.B;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f780y = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        if (this.F && this.G != null) {
            k2 k2Var = this.E;
            if (k2Var != null) {
                i10 = k2Var.e();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.G.setBounds(0, 0, getWidth(), i10);
                this.G.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r8 = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return r8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        u.a aVar;
        WeakHashMap weakHashMap = y0.f4277a;
        int d10 = i0.d(this);
        ArrayList arrayList = this.f773a;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8 && ((aVar = ((u.d) view.getLayoutParams()).f10104a) == null || !aVar.g(this, view, d10))) {
                q(view, d10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0197, code lost:
    
        if (r0.h(r32, r19, r25, r20, r26) == false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                u.d dVar = (u.d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    u.a aVar = dVar.f10104a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        u.a aVar;
        int childCount = getChildCount();
        boolean z9 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                u.d dVar = (u.d) childAt.getLayoutParams();
                if (dVar.a(0) && (aVar = dVar.f10104a) != null) {
                    z9 |= aVar.i(view);
                }
            }
        }
        return z9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        c(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        e(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        a(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.f7897a);
        SparseArray sparseArray = eVar.f10119c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            u.a aVar = n(childAt).f10104a;
            if (id != -1 && aVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                aVar.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n9;
        e eVar = new e(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            u.a aVar = ((u.d) childAt.getLayoutParams()).f10104a;
            if (id != -1 && aVar != null && (n9 = aVar.n(childAt)) != null) {
                sparseArray.append(id, n9);
            }
        }
        eVar.f10119c = sparseArray;
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return f(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.A
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.A
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            u.d r6 = (u.d) r6
            u.a r6 = r6.f10104a
            if (r6 == 0) goto L29
            android.view.View r7 = r0.A
            boolean r6 = r6.q(r7, r1)
            goto L2a
        L29:
            r6 = r5
        L2a:
            android.view.View r7 = r0.A
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.t(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c1 A[EDGE_INSN: B:114:0x02c1->B:102:0x02c1 BREAK  A[LOOP:2: B:106:0x02a5->B:112:0x02bc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r25) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i10) {
        boolean z9;
        Rect g10;
        Rect g11;
        u.d dVar = (u.d) view.getLayoutParams();
        View view2 = dVar.f10114k;
        int i11 = 0;
        if (view2 == null && dVar.f10109f != -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            d dVar2 = O;
            if (view2 != null) {
                g10 = g();
                g11 = g();
                try {
                    k(view2, g10);
                    u.d dVar3 = (u.d) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    l(i10, g10, g11, dVar3, measuredWidth, measuredHeight);
                    h(dVar3, g11, measuredWidth, measuredHeight);
                    view.layout(g11.left, g11.top, g11.right, g11.bottom);
                    return;
                } finally {
                    g10.setEmpty();
                    dVar2.b(g10);
                    g11.setEmpty();
                    dVar2.b(g11);
                }
            }
            int i12 = dVar.f10108e;
            if (i12 >= 0) {
                u.d dVar4 = (u.d) view.getLayoutParams();
                int i13 = dVar4.f10106c;
                if (i13 == 0) {
                    i13 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
                int i14 = absoluteGravity & 7;
                int i15 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i10 == 1) {
                    i12 = width - i12;
                }
                int m5 = m(i12) - measuredWidth2;
                if (i14 != 1) {
                    if (i14 == 5) {
                        m5 += measuredWidth2;
                    }
                } else {
                    m5 += measuredWidth2 / 2;
                }
                if (i15 != 16) {
                    if (i15 == 80) {
                        i11 = measuredHeight2 + 0;
                    }
                } else {
                    i11 = 0 + (measuredHeight2 / 2);
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar4).leftMargin, Math.min(m5, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar4).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) dVar4).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            u.d dVar5 = (u.d) view.getLayoutParams();
            g10 = g();
            g10.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar5).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar5).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) dVar5).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) dVar5).bottomMargin);
            if (this.E != null) {
                WeakHashMap weakHashMap = y0.f4277a;
                if (h0.b(this) && !h0.b(view)) {
                    g10.left = this.E.c() + g10.left;
                    g10.top = this.E.e() + g10.top;
                    g10.right -= this.E.d();
                    g10.bottom -= this.E.b();
                }
            }
            g11 = g();
            int i16 = dVar5.f10106c;
            if ((i16 & 7) == 0) {
                i16 |= 8388611;
            }
            if ((i16 & 112) == 0) {
                i16 |= 48;
            }
            g0.k.b(i16, view.getMeasuredWidth(), view.getMeasuredHeight(), g10, g11, i10);
            view.layout(g11.left, g11.top, g11.right, g11.bottom);
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public final boolean r(MotionEvent motionEvent, int i10) {
        boolean z9;
        int i11;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f775c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            if (isChildrenDrawingOrderEnabled) {
                i11 = getChildDrawingOrder(childCount, i12);
            } else {
                i11 = i12;
            }
            arrayList.add(getChildAt(i11));
        }
        f fVar = N;
        if (fVar != null) {
            Collections.sort(arrayList, fVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z10 = false;
        boolean z11 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            u.d dVar = (u.d) view.getLayoutParams();
            u.a aVar = dVar.f10104a;
            if ((z10 || z11) && actionMasked != 0) {
                if (aVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i10 != 0) {
                        if (i10 == 1) {
                            aVar.q(view, motionEvent2);
                        }
                    } else {
                        aVar.f(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z10 && aVar != null) {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            z10 = aVar.q(view, motionEvent);
                        }
                    } else {
                        z10 = aVar.f(this, view, motionEvent);
                    }
                    if (z10) {
                        this.A = view;
                    }
                }
                if (dVar.f10104a == null) {
                    dVar.f10116m = false;
                }
                boolean z12 = dVar.f10116m;
                if (z12) {
                    z9 = true;
                } else {
                    z9 = z12 | false;
                    dVar.f10116m = z9;
                }
                if (z9 && !z12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z9 && !z11) {
                    break;
                }
            }
        }
        arrayList.clear();
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        u.a aVar = ((u.d) view.getLayoutParams()).f10104a;
        if (aVar != null) {
            aVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        super.requestDisallowInterceptTouchEvent(z9);
        if (z9 && !this.f779x) {
            t(false);
            this.f779x = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x007a, code lost:
    
        if (r10 != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z9) {
        super.setFitsSystemWindows(z9);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.H = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z9;
        Drawable drawable2 = this.G;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.G = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.G.setState(getDrawableState());
                }
                Drawable drawable4 = this.G;
                WeakHashMap weakHashMap = y0.f4277a;
                a0.c.b(drawable4, i0.d(this));
                Drawable drawable5 = this.G;
                if (getVisibility() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                drawable5.setVisible(z9, false);
                this.G.setCallback(this);
            }
            WeakHashMap weakHashMap2 = y0.f4277a;
            h0.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = j.getDrawable(getContext(), i10);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z9;
        super.setVisibility(i10);
        if (i10 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Drawable drawable = this.G;
        if (drawable != null && drawable.isVisible() != z9) {
            this.G.setVisible(z9, false);
        }
    }

    public final void t(boolean z9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            u.a aVar = ((u.d) childAt.getLayoutParams()).f10104a;
            if (aVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z9) {
                    aVar.f(this, childAt, obtain);
                } else {
                    aVar.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((u.d) getChildAt(i11).getLayoutParams()).f10116m = false;
        }
        this.A = null;
        this.f779x = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.G) {
            return false;
        }
        return true;
    }

    public final void w() {
        WeakHashMap weakHashMap = y0.f4277a;
        if (h0.b(this)) {
            if (this.I == null) {
                this.I = new p0(this, 7);
            }
            n0.u(this, this.I);
            setSystemUiVisibility(1280);
            return;
        }
        n0.u(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof u.d) {
            return new u.d((u.d) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new u.d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new u.d(layoutParams);
    }
}
