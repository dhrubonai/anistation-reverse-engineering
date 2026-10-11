package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import g0.k2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f808a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f809b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f810c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f811d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        r6.h0.u(context, "context");
        this.f808a = new ArrayList();
        this.f809b = new ArrayList();
        this.f811d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.a.f10124b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void a(View view) {
        if (this.f809b.contains(view)) {
            this.f808a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        y yVar;
        r6.h0.u(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof y) {
            yVar = (y) tag;
        } else {
            yVar = null;
        }
        if (yVar != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        k2 k2Var;
        r6.h0.u(windowInsets, "insets");
        k2 h10 = k2.h(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f810c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            r6.h0.s(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            k2Var = k2.h(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = g0.y0.f4277a;
            WindowInsets g10 = h10.g();
            if (g10 != null) {
                WindowInsets b10 = g0.l0.b(this, g10);
                if (!b10.equals(g10)) {
                    h10 = k2.h(this, b10);
                }
            }
            k2Var = h10;
        }
        if (!k2Var.f4227a.m()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                WeakHashMap weakHashMap2 = g0.y0.f4277a;
                WindowInsets g11 = k2Var.g();
                if (g11 != null) {
                    WindowInsets a10 = g0.l0.a(childAt, g11);
                    if (!a10.equals(g11)) {
                        k2.h(childAt, a10);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        r6.h0.u(canvas, "canvas");
        if (this.f811d) {
            Iterator it = this.f808a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        r6.h0.u(canvas, "canvas");
        r6.h0.u(view, "child");
        if (this.f811d) {
            ArrayList arrayList = this.f808a;
            if ((!arrayList.isEmpty()) && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        r6.h0.u(view, "view");
        this.f809b.remove(view);
        if (this.f808a.remove(view)) {
            this.f811d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends y> F getFragment() {
        b0 b0Var;
        y yVar;
        s0 supportFragmentManager;
        View view = this;
        while (true) {
            b0Var = null;
            if (view != null) {
                Object tag = view.getTag(R.id.fragment_container_view_tag);
                if (tag instanceof y) {
                    yVar = (y) tag;
                } else {
                    yVar = null;
                }
                if (yVar != null) {
                    break;
                }
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            } else {
                yVar = null;
                break;
            }
        }
        if (yVar != null) {
            if (yVar.q()) {
                supportFragmentManager = yVar.j();
            } else {
                throw new IllegalStateException("The Fragment " + yVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
        } else {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof b0) {
                    b0Var = (b0) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (b0Var != null) {
                supportFragmentManager = b0Var.getSupportFragmentManager();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        }
        return (F) supportFragmentManager.B(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        r6.h0.u(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                r6.h0.s(childAt, "view");
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        r6.h0.u(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        r6.h0.s(childAt, "view");
        a(childAt);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        r6.h0.u(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            r6.h0.s(childAt, "view");
            a(childAt);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            r6.h0.s(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z9) {
        this.f811d = z9;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        r6.h0.u(onApplyWindowInsetsListener, "listener");
        this.f810c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        r6.h0.u(view, "view");
        if (view.getParent() == this) {
            this.f809b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, s0 s0Var) {
        super(context, attributeSet);
        View view;
        r6.h0.u(context, "context");
        r6.h0.u(attributeSet, "attrs");
        r6.h0.u(s0Var, "fm");
        this.f808a = new ArrayList();
        this.f809b = new ArrayList();
        this.f811d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.a.f10124b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        y B = s0Var.B(id);
        if (classAttribute != null && B == null) {
            if (id == -1) {
                throw new IllegalStateException(r.f.e("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            m0 E = s0Var.E();
            context.getClassLoader();
            y a10 = E.a(classAttribute);
            r6.h0.s(a10, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a10.T = true;
            a0 a0Var = a10.J;
            if ((a0Var == null ? null : a0Var.C) != null) {
                a10.T = true;
            }
            a aVar = new a(s0Var);
            aVar.o = true;
            a10.U = this;
            aVar.g(getId(), a10, string, 1);
            aVar.f();
        }
        Iterator it = s0Var.f970c.v().iterator();
        while (it.hasNext()) {
            z0 z0Var = (z0) it.next();
            y yVar = z0Var.f1062c;
            if (yVar.N == getId() && (view = yVar.V) != null && view.getParent() == null) {
                yVar.U = this;
                z0Var.b();
            }
        }
    }
}
