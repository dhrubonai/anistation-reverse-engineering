package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f337a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f338b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f339c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f340d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f341e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f342f;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f343x;

    /* renamed from: y, reason: collision with root package name */
    public s1 f344y;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f343x = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f341e == null) {
            this.f341e = new TypedValue();
        }
        return this.f341e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f342f == null) {
            this.f342f = new TypedValue();
        }
        return this.f342f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f339c == null) {
            this.f339c = new TypedValue();
        }
        return this.f339c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f340d == null) {
            this.f340d = new TypedValue();
        }
        return this.f340d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f337a == null) {
            this.f337a = new TypedValue();
        }
        return this.f337a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f338b == null) {
            this.f338b = new TypedValue();
        }
        return this.f338b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s1 s1Var = this.f344y;
        if (s1Var != null) {
            s1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        m mVar;
        super.onDetachedFromWindow();
        s1 s1Var = this.f344y;
        if (s1Var != null) {
            f.g0 g0Var = ((f.s) s1Var).f3778b;
            t1 t1Var = g0Var.I;
            if (t1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) t1Var;
                actionBarOverlayLayout.l();
                ActionMenuView actionMenuView = ((g4) actionBarOverlayLayout.f328e).f496a.f375a;
                if (actionMenuView != null && (mVar = actionMenuView.K) != null) {
                    mVar.d();
                    h hVar = mVar.K;
                    if (hVar != null && hVar.b()) {
                        hVar.f5496j.dismiss();
                    }
                }
            }
            if (g0Var.N != null) {
                g0Var.C.getDecorView().removeCallbacks(g0Var.O);
                if (g0Var.N.isShowing()) {
                    try {
                        g0Var.N.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                g0Var.N = null;
            }
            g0.l1 l1Var = g0Var.P;
            if (l1Var != null) {
                l1Var.b();
            }
            j.o oVar = g0Var.B(0).f3670h;
            if (oVar != null) {
                oVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(s1 s1Var) {
        this.f344y = s1Var;
    }
}
