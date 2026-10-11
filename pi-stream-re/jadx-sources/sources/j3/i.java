package j3;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6016b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f6015a = i10;
        this.f6016b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int height;
        int i19;
        int height2;
        boolean z9;
        int i20 = this.f6015a;
        Object obj = this.f6016b;
        switch (i20) {
            case 0:
                x xVar = (x) obj;
                xVar.getClass();
                int i21 = i13 - i11;
                int i22 = i17 - i15;
                if (i12 - i10 != i16 - i14 || i21 != i22) {
                    PopupWindow popupWindow = xVar.B;
                    if (popupWindow.isShowing()) {
                        xVar.q();
                        int width = xVar.getWidth() - popupWindow.getWidth();
                        int i23 = xVar.C;
                        popupWindow.update(view, width - i23, (-popupWindow.getHeight()) - i23, -1, -1);
                        return;
                    }
                    return;
                }
                return;
            default:
                d0 d0Var = (d0) obj;
                x xVar2 = d0Var.f5963a;
                int width2 = (xVar2.getWidth() - xVar2.getPaddingLeft()) - xVar2.getPaddingRight();
                int height3 = (xVar2.getHeight() - xVar2.getPaddingBottom()) - xVar2.getPaddingTop();
                ViewGroup viewGroup = d0Var.f5965c;
                int d10 = d0.d(viewGroup);
                boolean z10 = false;
                if (viewGroup != null) {
                    i18 = viewGroup.getPaddingRight() + viewGroup.getPaddingLeft();
                } else {
                    i18 = 0;
                }
                int i24 = d10 - i18;
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                if (viewGroup != null) {
                    i19 = viewGroup.getPaddingBottom() + viewGroup.getPaddingTop();
                } else {
                    i19 = 0;
                }
                int i25 = height - i19;
                int max = Math.max(i24, d0.d(d0Var.f5973k) + d0.d(d0Var.f5971i));
                ViewGroup viewGroup2 = d0Var.f5966d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                int i26 = (height2 * 2) + i25;
                if (width2 > max && height3 > i26) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (d0Var.A != z9) {
                    d0Var.A = z9;
                    view.post(new y(d0Var, 5));
                }
                if (i12 - i10 != i16 - i14) {
                    z10 = true;
                }
                if (!d0Var.A && z10) {
                    view.post(new y(d0Var, 6));
                    return;
                }
                return;
        }
    }
}
