package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sz4 implements cr5 {
    public final View x;

    public sz4(View view) {
        this.x = view;
    }

    public static mg1 b(int i, int i2, int i3) {
        if (i == -2) {
            return lg1.a;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            kg1.a(i4);
            return new kg1(i4);
        }
        int i5 = i2 - i3;
        if (i5 > 0) {
            kg1.a(i5);
            return new kg1(i5);
        }
        return null;
    }

    @Override // defpackage.cr5
    public final Object a(vz0 vz0Var) {
        tq5 c = c();
        if (c != null) {
            return c;
        }
        qg0 qg0Var = new qg0(1, wc7.z(vz0Var));
        qg0Var.t();
        ViewTreeObserver viewTreeObserver = this.x.getViewTreeObserver();
        mw6 mw6Var = new mw6(this, viewTreeObserver, qg0Var);
        viewTreeObserver.addOnPreDrawListener(mw6Var);
        qg0Var.v(new gn1(this, viewTreeObserver, mw6Var, (byte) 1));
        return qg0Var.r();
    }

    public final tq5 c() {
        int i;
        View view = this.x;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i2 = -1;
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = -1;
        }
        mg1 b = b(i, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (b != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                i2 = layoutParams2.height;
            }
            mg1 b2 = b(i2, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
            if (b2 == null) {
                return null;
            }
            return new tq5(b, b2);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof sz4) && a34.i(this.x, ((sz4) obj).x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.x.hashCode() * 31);
    }

    public final String toString() {
        return "RealViewSizeResolver(view=" + this.x + ", subtractPadding=true)";
    }
}
