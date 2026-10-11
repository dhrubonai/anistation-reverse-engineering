package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.anistation.android.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class q0 extends ViewGroup {
    public qu0 A;
    public yt0 B;
    public mi C;
    public boolean D;
    public boolean E;
    public boolean F;
    public WeakReference x;
    public IBinder y;
    public b97 z;

    public q0(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        nc ncVar = new nc(this, (byte) 1);
        addOnAttachStateChangeListener(ncVar);
        p65 p65Var = new p65((byte) 25);
        n03.u(this).a.add(p65Var);
        this.C = new mi((Object) this, (Object) ncVar, (Object) p65Var, (byte) 16);
    }

    private final void setParentContext(qu0 qu0Var) {
        if (this.A != qu0Var) {
            this.A = qu0Var;
            if (qu0Var != null) {
                this.x = null;
            }
            b97 b97Var = this.z;
            if (b97Var != null) {
                b97Var.a();
                this.z = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.y != iBinder) {
            this.y = iBinder;
            this.x = null;
        }
    }

    public abstract void a(int i, kd2 kd2Var);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.B == null) {
                oa oaVar = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof oa) {
                        oaVar = (oa) childAt;
                    }
                }
                if (oaVar != null) {
                    oaVar.setComposeViewContext(l(zz.C(this), oaVar.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                f();
            }
        }
    }

    public final void c() {
        if (this.E) {
            return;
        }
        ov3.g(qx1.m("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
    }

    public final void d() {
        yt0 yt0Var;
        if (this.A == null && !isAttachedToWindow() && ((yt0Var = this.B) == null || !yt0Var.a.isAttachedToWindow())) {
            ze0.m("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            f();
        }
    }

    public final void e() {
        oa oaVar;
        View childAt = getChildAt(0);
        if (childAt instanceof oa) {
            oaVar = (oa) childAt;
        } else {
            oaVar = null;
        }
        if (oaVar != null && oaVar.a1) {
            oaVar.getComposeViewContext().b();
            oaVar.a1 = false;
        }
        b97 b97Var = this.z;
        if (b97Var != null) {
            b97Var.a();
        }
        this.z = null;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        if (this.z == null) {
            boolean z = false;
            Object[] objArr = 0;
            try {
                this.E = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    yt0 yt0Var = this.B;
                    if (yt0Var == null) {
                        yt0Var = j();
                    }
                    this.z = e97.a(this, yt0Var, new os0(1003123809, true, new o0((Object) this, (byte) (objArr == true ? 1 : 0))));
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.E = false;
            }
        }
    }

    public void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m163getAutoClearFocusBehavior4UtRPd4() {
        hx hxVar;
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        if (tag instanceof hx) {
            hxVar = (hx) tag;
        } else {
            hxVar = null;
        }
        if (hxVar != null) {
            return hxVar.a;
        }
        return 1;
    }

    public final yt0 getComposeViewContext$ui() {
        return this.B;
    }

    public final boolean getHasComposition() {
        if (this.z != null) {
            return true;
        }
        return false;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.D;
    }

    public void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        if (this.F && !super.isTransitionGroup()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yt0 j() {
        /*
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = r1
            goto L1c
        L9:
            r0 = 0
            android.view.View r0 = r9.getChildAt(r0)
            boolean r2 = r0 instanceof defpackage.oa
            if (r2 == 0) goto L15
            oa r0 = (defpackage.oa) r0
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L7
            yt0 r0 = r0.getComposeViewContext()
        L1c:
            android.view.View r4 = defpackage.zz.C(r9)
            yt0 r2 = defpackage.zz.H(r4)
            if (r2 != 0) goto L87
            qu0 r5 = r9.k()
            og3 r9 = defpackage.rz5.c(r4)
            if (r9 != 0) goto L3a
            if (r0 == 0) goto L37
            og3 r9 = r0.d()
            goto L38
        L37:
            r9 = r1
        L38:
            if (r9 == 0) goto L3c
        L3a:
            r6 = r9
            goto L42
        L3c:
            java.lang.String r9 = "Composed into the View which doesn't propagate ViewTreeLifecycleOwner!"
            defpackage.ze0.m(r9)
            return r1
        L42:
            ga5 r9 = defpackage.qs5.f(r4)
            if (r9 != 0) goto L56
            if (r0 == 0) goto L53
            r0.g()
            ga5 r9 = r0.e
            r9.getClass()
            goto L54
        L53:
            r9 = r1
        L54:
            if (r9 == 0) goto L58
        L56:
            r7 = r9
            goto L5e
        L58:
            java.lang.String r9 = "Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!"
            defpackage.ze0.m(r9)
            return r1
        L5e:
            ew6 r9 = defpackage.ss5.d(r4)
            if (r9 != 0) goto L6d
            if (r0 == 0) goto L6b
            r0.g()
            ew6 r1 = r0.f
        L6b:
            r8 = r1
            goto L6e
        L6d:
            r8 = r9
        L6e:
            yt0 r2 = new yt0
            android.view.View r9 = defpackage.zz.C(r4)
            yt0 r3 = defpackage.zz.H(r9)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r2)
            r0 = 2131361883(0x7f0a005b, float:1.834353E38)
            r4.setTag(r0, r9)
            return r2
        L87:
            yt0 r9 = r9.l(r4, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0.j():yt0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r3 > 0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Type inference failed for: r0v0, types: [qu0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [qu0] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [qu0] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [h05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.qu0 k() {
        /*
            r5 = this;
            qu0 r0 = r5.A
            if (r0 != 0) goto L8c
            qu0 r0 = defpackage.p67.a(r5)
            if (r0 == 0) goto Lb
            goto L20
        Lb:
            android.view.ViewParent r1 = r5.getParent()
        Lf:
            if (r0 != 0) goto L20
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L20
            android.view.View r1 = (android.view.View) r1
            qu0 r0 = defpackage.p67.a(r1)
            android.view.ViewParent r1 = defpackage.nz5.d(r1)
            goto Lf
        L20:
            d05 r1 = defpackage.d05.y
            r2 = 0
            if (r0 == 0) goto L48
            boolean r3 = r0 instanceof defpackage.h05
            if (r3 == 0) goto L3d
            r3 = r0
            h05 r3 = (defpackage.h05) r3
            sx5 r3 = r3.u
            java.lang.Object r3 = r3.getValue()
            d05 r3 = (defpackage.d05) r3
            int r3 = r3.compareTo(r1)
            if (r3 <= 0) goto L3b
            goto L3d
        L3b:
            r3 = r2
            goto L3e
        L3d:
            r3 = r0
        L3e:
            if (r3 == 0) goto L49
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r3)
            r5.x = r4
            goto L49
        L48:
            r0 = r2
        L49:
            if (r0 != 0) goto L8c
            java.lang.ref.WeakReference r0 = r5.x
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r0.get()
            qu0 r0 = (defpackage.qu0) r0
            if (r0 == 0) goto L6d
            boolean r3 = r0 instanceof defpackage.h05
            if (r3 == 0) goto L6e
            r3 = r0
            h05 r3 = (defpackage.h05) r3
            sx5 r3 = r3.u
            java.lang.Object r3 = r3.getValue()
            d05 r3 = (defpackage.d05) r3
            int r3 = r3.compareTo(r1)
            if (r3 <= 0) goto L6d
            goto L6e
        L6d:
            r0 = r2
        L6e:
            if (r0 != 0) goto L8c
            h05 r0 = defpackage.p67.b(r5)
            sx5 r3 = r0.u
            java.lang.Object r3 = r3.getValue()
            d05 r3 = (defpackage.d05) r3
            int r1 = r3.compareTo(r1)
            if (r1 <= 0) goto L83
            r2 = r0
        L83:
            if (r2 == 0) goto L8c
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r2)
            r5.x = r1
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0.k():qu0");
    }

    public final yt0 l(View view, yt0 yt0Var) {
        qu0 k = k();
        og3 c = rz5.c(view);
        ew6 d = ss5.d(view);
        ga5 f = qs5.f(view);
        if (k == yt0Var.c() && c == yt0Var.d()) {
            yt0Var.g();
            if (d == yt0Var.f) {
                yt0Var.g();
                ga5 ga5Var = yt0Var.e;
                ga5Var.getClass();
                if (f == ga5Var) {
                    return yt0Var;
                }
            }
        }
        if (k.k() != yt0Var.c().k()) {
            e();
        }
        if (c == null) {
            c = yt0Var.d();
        }
        og3 og3Var = c;
        if (f == null) {
            yt0Var.g();
            f = yt0Var.e;
            f.getClass();
        }
        yt0 yt0Var2 = new yt0(yt0Var, view, k, og3Var, f, d);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(yt0Var2));
        return yt0Var2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        p44 p44Var = p67.a;
        Object d = nz5.d(this);
        View view = this;
        while (d instanceof View) {
            View view2 = (View) d;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            d = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new p0((Object) this, (byte) 0));
        } else {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        h(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m164setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new hx(i));
    }

    public final void setComposeViewContext$ui(yt0 yt0Var) {
        oa oaVar;
        if (this.B != yt0Var) {
            if (yt0Var == null) {
                e();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                if (childAt instanceof oa) {
                    oaVar = (oa) childAt;
                } else {
                    oaVar = null;
                }
                if (oaVar != null) {
                    if (oaVar.getCoroutineContext() != yt0Var.c().k()) {
                        e();
                    }
                    oaVar.setComposeViewContext(yt0Var);
                }
            }
            this.B = yt0Var;
        }
    }

    public final void setParentCompositionContext(qu0 qu0Var) {
        setParentContext(qu0Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.D = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((oa) ((kh4) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.F = true;
    }

    public final void setViewCompositionStrategy(qv6 qv6Var) {
        mi miVar = this.C;
        if (miVar != null) {
            miVar.invoke();
        }
        ((hz5) qv6Var).getClass();
        nc ncVar = new nc(this, (byte) 1);
        addOnAttachStateChangeListener(ncVar);
        p65 p65Var = new p65((byte) 25);
        n03.u(this).a.add(p65Var);
        this.C = new mi((Object) this, (Object) ncVar, (Object) p65Var, (byte) 16);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
