package j;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.b2;
import androidx.appcompat.widget.u2;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class h0 extends x implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final e A;
    public final f B;
    public PopupWindow.OnDismissListener C;
    public View D;
    public View E;
    public b0 F;
    public ViewTreeObserver G;
    public boolean H;
    public boolean I;
    public int J;
    public int K = 0;
    public boolean L;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5514b;

    /* renamed from: c, reason: collision with root package name */
    public final o f5515c;

    /* renamed from: d, reason: collision with root package name */
    public final l f5516d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5517e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5518f;

    /* renamed from: x, reason: collision with root package name */
    public final int f5519x;

    /* renamed from: y, reason: collision with root package name */
    public final int f5520y;

    /* renamed from: z, reason: collision with root package name */
    public final u2 f5521z;

    public h0(int i10, int i11, Context context, View view, o oVar, boolean z9) {
        int i12 = 1;
        this.A = new e(this, i12);
        this.B = new f(this, i12);
        this.f5514b = context;
        this.f5515c = oVar;
        this.f5517e = z9;
        this.f5516d = new l(oVar, LayoutInflater.from(context), z9, R.layout.abc_popup_menu_item_layout);
        this.f5519x = i10;
        this.f5520y = i11;
        Resources resources = context.getResources();
        this.f5518f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.D = view;
        this.f5521z = new u2(context, i10, i11);
        oVar.b(this, context);
    }

    @Override // j.c0
    public final void a(o oVar, boolean z9) {
        if (oVar != this.f5515c) {
            return;
        }
        dismiss();
        b0 b0Var = this.F;
        if (b0Var != null) {
            b0Var.a(oVar, z9);
        }
    }

    @Override // j.g0
    public final boolean b() {
        if (!this.H && this.f5521z.b()) {
            return true;
        }
        return false;
    }

    @Override // j.g0
    public final void d() {
        View view;
        boolean z9;
        Rect rect;
        boolean z10 = true;
        if (!b()) {
            if (!this.H && (view = this.D) != null) {
                this.E = view;
                u2 u2Var = this.f5521z;
                u2Var.Q.setOnDismissListener(this);
                u2Var.G = this;
                u2Var.P = true;
                androidx.appcompat.widget.g0 g0Var = u2Var.Q;
                g0Var.setFocusable(true);
                View view2 = this.E;
                if (this.G == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.G = viewTreeObserver;
                if (z9) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.A);
                }
                view2.addOnAttachStateChangeListener(this.B);
                u2Var.F = view2;
                u2Var.C = this.K;
                boolean z11 = this.I;
                Context context = this.f5514b;
                l lVar = this.f5516d;
                if (!z11) {
                    this.J = x.m(lVar, context, this.f5518f);
                    this.I = true;
                }
                u2Var.r(this.J);
                g0Var.setInputMethodMode(2);
                Rect rect2 = this.f5607a;
                if (rect2 != null) {
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                u2Var.O = rect;
                u2Var.d();
                b2 b2Var = u2Var.f590c;
                b2Var.setOnKeyListener(this);
                if (this.L) {
                    o oVar = this.f5515c;
                    if (oVar.f5558m != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) b2Var, false);
                        TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                        if (textView != null) {
                            textView.setText(oVar.f5558m);
                        }
                        frameLayout.setEnabled(false);
                        b2Var.addHeaderView(frameLayout, null, false);
                    }
                }
                u2Var.q(lVar);
                u2Var.d();
            } else {
                z10 = false;
            }
        }
        if (z10) {
        } else {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // j.g0
    public final void dismiss() {
        if (b()) {
            this.f5521z.dismiss();
        }
    }

    @Override // j.c0
    public final void e() {
        this.I = false;
        l lVar = this.f5516d;
        if (lVar != null) {
            lVar.notifyDataSetChanged();
        }
    }

    @Override // j.g0
    public final ListView f() {
        return this.f5521z.f590c;
    }

    @Override // j.c0
    public final boolean h() {
        return false;
    }

    @Override // j.c0
    public final void j(b0 b0Var) {
        this.F = b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    @Override // j.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(j.i0 r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L7a
            j.a0 r0 = new j.a0
            android.content.Context r5 = r9.f5514b
            android.view.View r6 = r9.E
            boolean r8 = r9.f5517e
            int r3 = r9.f5519x
            int r4 = r9.f5520y
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            j.b0 r2 = r9.F
            r0.f5495i = r2
            j.x r3 = r0.f5496j
            if (r3 == 0) goto L23
            r3.j(r2)
        L23:
            boolean r2 = j.x.u(r10)
            r0.f5494h = r2
            j.x r3 = r0.f5496j
            if (r3 == 0) goto L30
            r3.o(r2)
        L30:
            android.widget.PopupWindow$OnDismissListener r2 = r9.C
            r0.f5497k = r2
            r2 = 0
            r9.C = r2
            j.o r2 = r9.f5515c
            r2.c(r1)
            androidx.appcompat.widget.u2 r2 = r9.f5521z
            int r3 = r2.f593f
            int r2 = r2.o()
            int r4 = r9.K
            android.view.View r5 = r9.D
            java.util.WeakHashMap r6 = g0.y0.f4277a
            int r5 = g0.i0.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5e
            android.view.View r4 = r9.D
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5e:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L66
            goto L6f
        L66:
            android.view.View r4 = r0.f5492f
            if (r4 != 0) goto L6c
            r0 = r1
            goto L70
        L6c:
            r0.d(r3, r2, r5, r5)
        L6f:
            r0 = r5
        L70:
            if (r0 == 0) goto L7a
            j.b0 r0 = r9.F
            if (r0 == 0) goto L79
            r0.m(r10)
        L79:
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j.h0.k(j.i0):boolean");
    }

    @Override // j.x
    public final void l(o oVar) {
    }

    @Override // j.x
    public final void n(View view) {
        this.D = view;
    }

    @Override // j.x
    public final void o(boolean z9) {
        this.f5516d.f5541c = z9;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.H = true;
        this.f5515c.c(true);
        ViewTreeObserver viewTreeObserver = this.G;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.G = this.E.getViewTreeObserver();
            }
            this.G.removeGlobalOnLayoutListener(this.A);
            this.G = null;
        }
        this.E.removeOnAttachStateChangeListener(this.B);
        PopupWindow.OnDismissListener onDismissListener = this.C;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // j.x
    public final void p(int i10) {
        this.K = i10;
    }

    @Override // j.x
    public final void q(int i10) {
        this.f5521z.f593f = i10;
    }

    @Override // j.x
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.C = onDismissListener;
    }

    @Override // j.x
    public final void s(boolean z9) {
        this.L = z9;
    }

    @Override // j.x
    public final void t(int i10) {
        this.f5521z.j(i10);
    }
}
