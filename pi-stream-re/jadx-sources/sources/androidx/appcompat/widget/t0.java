package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class t0 extends o2 implements v0 {
    public CharSequence U;
    public ListAdapter V;
    public final Rect W;
    public int X;
    public final /* synthetic */ w0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(w0 w0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.Y = w0Var;
        this.W = new Rect();
        this.F = w0Var;
        this.P = true;
        this.Q.setFocusable(true);
        this.G = new f.d(1, this, w0Var);
    }

    @Override // androidx.appcompat.widget.v0
    public final void g(CharSequence charSequence) {
        this.U = charSequence;
    }

    @Override // androidx.appcompat.widget.v0
    public final void k(int i10) {
        this.X = i10;
    }

    @Override // androidx.appcompat.widget.v0
    public final void m(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        boolean b10 = b();
        s();
        g0 g0Var = this.Q;
        g0Var.setInputMethodMode(2);
        d();
        b2 b2Var = this.f590c;
        b2Var.setChoiceMode(1);
        o0.d(b2Var, i10);
        o0.c(b2Var, i11);
        w0 w0Var = this.Y;
        int selectedItemPosition = w0Var.getSelectedItemPosition();
        b2 b2Var2 = this.f590c;
        if (b() && b2Var2 != null) {
            b2Var2.setListSelectionHidden(false);
            b2Var2.setSelection(selectedItemPosition);
            if (b2Var2.getChoiceMode() != 0) {
                b2Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!b10 && (viewTreeObserver = w0Var.getViewTreeObserver()) != null) {
            j.e eVar = new j.e(this, 3);
            viewTreeObserver.addOnGlobalLayoutListener(eVar);
            g0Var.setOnDismissListener(new s0(this, eVar));
        }
    }

    @Override // androidx.appcompat.widget.v0
    public final CharSequence p() {
        return this.U;
    }

    @Override // androidx.appcompat.widget.o2, androidx.appcompat.widget.v0
    public final void q(ListAdapter listAdapter) {
        super.q(listAdapter);
        this.V = listAdapter;
    }

    public final void s() {
        int i10;
        int i11;
        Drawable e10 = e();
        w0 w0Var = this.Y;
        if (e10 != null) {
            e10.getPadding(w0Var.f695y);
            if (n4.a(w0Var)) {
                i10 = w0Var.f695y.right;
            } else {
                i10 = -w0Var.f695y.left;
            }
        } else {
            Rect rect = w0Var.f695y;
            rect.right = 0;
            rect.left = 0;
            i10 = 0;
        }
        int paddingLeft = w0Var.getPaddingLeft();
        int paddingRight = w0Var.getPaddingRight();
        int width = w0Var.getWidth();
        int i12 = w0Var.f694x;
        if (i12 == -2) {
            int a10 = w0Var.a((SpinnerAdapter) this.V, e());
            int i13 = w0Var.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = w0Var.f695y;
            int i14 = (i13 - rect2.left) - rect2.right;
            if (a10 > i14) {
                a10 = i14;
            }
            r(Math.max(a10, (width - paddingLeft) - paddingRight));
        } else if (i12 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i12);
        }
        if (n4.a(w0Var)) {
            i11 = (((width - paddingRight) - this.f592e) - this.X) + i10;
        } else {
            i11 = paddingLeft + this.X + i10;
        }
        this.f593f = i11;
    }
}
