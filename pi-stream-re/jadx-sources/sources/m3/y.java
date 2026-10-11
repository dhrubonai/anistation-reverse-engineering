package m3;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class y extends z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7423d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(k0 k0Var, int i10) {
        super(k0Var);
        this.f7423d = i10;
    }

    @Override // m3.z
    public final int b(View view) {
        int bottom;
        int i10;
        int i11 = this.f7423d;
        k0 k0Var = this.f7424a;
        switch (i11) {
            case 0:
                l0 l0Var = (l0) view.getLayoutParams();
                k0Var.getClass();
                bottom = view.getRight() + ((l0) view.getLayoutParams()).f7295b.right;
                i10 = ((ViewGroup.MarginLayoutParams) l0Var).rightMargin;
                break;
            default:
                l0 l0Var2 = (l0) view.getLayoutParams();
                k0Var.getClass();
                bottom = view.getBottom() + ((l0) view.getLayoutParams()).f7295b.bottom;
                i10 = ((ViewGroup.MarginLayoutParams) l0Var2).bottomMargin;
                break;
        }
        return bottom + i10;
    }

    @Override // m3.z
    public final int c(View view) {
        int measuredHeight;
        int i10;
        int i11 = this.f7423d;
        k0 k0Var = this.f7424a;
        switch (i11) {
            case 0:
                l0 l0Var = (l0) view.getLayoutParams();
                k0Var.getClass();
                Rect rect = ((l0) view.getLayoutParams()).f7295b;
                measuredHeight = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) l0Var).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) l0Var).rightMargin;
                break;
            default:
                l0 l0Var2 = (l0) view.getLayoutParams();
                k0Var.getClass();
                Rect rect2 = ((l0) view.getLayoutParams()).f7295b;
                measuredHeight = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) l0Var2).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) l0Var2).bottomMargin;
                break;
        }
        return measuredHeight + i10;
    }

    @Override // m3.z
    public final int d(View view) {
        int top;
        int i10;
        int i11 = this.f7423d;
        k0 k0Var = this.f7424a;
        switch (i11) {
            case 0:
                l0 l0Var = (l0) view.getLayoutParams();
                k0Var.getClass();
                top = view.getLeft() - ((l0) view.getLayoutParams()).f7295b.left;
                i10 = ((ViewGroup.MarginLayoutParams) l0Var).leftMargin;
                break;
            default:
                l0 l0Var2 = (l0) view.getLayoutParams();
                k0Var.getClass();
                top = view.getTop() - ((l0) view.getLayoutParams()).f7295b.top;
                i10 = ((ViewGroup.MarginLayoutParams) l0Var2).topMargin;
                break;
        }
        return top - i10;
    }

    @Override // m3.z
    public final int e() {
        int i10 = this.f7423d;
        k0 k0Var = this.f7424a;
        switch (i10) {
            case 0:
                return k0Var.f7291n;
            default:
                return k0Var.o;
        }
    }

    @Override // m3.z
    public final int f() {
        int i10;
        int B;
        int i11 = this.f7423d;
        k0 k0Var = this.f7424a;
        switch (i11) {
            case 0:
                i10 = k0Var.f7291n;
                B = k0Var.D();
                break;
            default:
                i10 = k0Var.o;
                B = k0Var.B();
                break;
        }
        return i10 - B;
    }

    @Override // m3.z
    public final int g() {
        int i10 = this.f7423d;
        k0 k0Var = this.f7424a;
        switch (i10) {
            case 0:
                return k0Var.f7289l;
            default:
                return k0Var.f7290m;
        }
    }

    @Override // m3.z
    public final int h() {
        int i10 = this.f7423d;
        k0 k0Var = this.f7424a;
        switch (i10) {
            case 0:
                return k0Var.C();
            default:
                return k0Var.E();
        }
    }

    @Override // m3.z
    public final int i() {
        int E;
        int B;
        int i10 = this.f7423d;
        k0 k0Var = this.f7424a;
        switch (i10) {
            case 0:
                E = k0Var.f7291n - k0Var.C();
                B = k0Var.D();
                break;
            default:
                E = k0Var.o - k0Var.E();
                B = k0Var.B();
                break;
        }
        return E - B;
    }

    @Override // m3.z
    public final int j(View view) {
        int i10 = this.f7423d;
        Rect rect = this.f7426c;
        k0 k0Var = this.f7424a;
        switch (i10) {
            case 0:
                k0Var.I(view, rect);
                return rect.right;
            default:
                k0Var.I(view, rect);
                return rect.bottom;
        }
    }

    @Override // m3.z
    public final int k(View view) {
        int i10 = this.f7423d;
        Rect rect = this.f7426c;
        k0 k0Var = this.f7424a;
        switch (i10) {
            case 0:
                k0Var.I(view, rect);
                return rect.left;
            default:
                k0Var.I(view, rect);
                return rect.top;
        }
    }

    @Override // m3.z
    public final void l(int i10) {
        int i11 = this.f7423d;
        k0 k0Var = this.f7424a;
        switch (i11) {
            case 0:
                k0Var.M(i10);
                return;
            default:
                k0Var.N(i10);
                return;
        }
    }

    public final int m(View view) {
        int measuredWidth;
        int i10;
        int i11 = this.f7423d;
        k0 k0Var = this.f7424a;
        switch (i11) {
            case 0:
                l0 l0Var = (l0) view.getLayoutParams();
                k0Var.getClass();
                Rect rect = ((l0) view.getLayoutParams()).f7295b;
                measuredWidth = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) l0Var).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) l0Var).bottomMargin;
                break;
            default:
                l0 l0Var2 = (l0) view.getLayoutParams();
                k0Var.getClass();
                Rect rect2 = ((l0) view.getLayoutParams()).f7295b;
                measuredWidth = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) l0Var2).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) l0Var2).rightMargin;
                break;
        }
        return measuredWidth + i10;
    }
}
