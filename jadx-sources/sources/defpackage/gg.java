package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gg implements vo3 {
    public final /* synthetic */ sv6 a;
    public final /* synthetic */ za3 b;

    public gg(sv6 sv6Var, za3 za3Var) {
        this.a = sv6Var;
        this.b = za3Var;
    }

    @Override // defpackage.vo3
    public final int a(j23 j23Var, List list, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        sv6 sv6Var = this.a;
        ViewGroup.LayoutParams layoutParams = sv6Var.getLayoutParams();
        layoutParams.getClass();
        sv6Var.measure(makeMeasureSpec, jg.l(0, i, layoutParams.height));
        return sv6Var.getMeasuredWidth();
    }

    @Override // defpackage.vo3
    public final wo3 b(xo3 xo3Var, List list, long j) {
        sv6 sv6Var = this.a;
        int childCount = sv6Var.getChildCount();
        ot1 ot1Var = ot1.x;
        if (childCount == 0) {
            return xo3Var.L(rx0.j(j), rx0.i(j), ot1Var, new b3((byte) 21));
        }
        if (rx0.j(j) != 0) {
            sv6Var.getChildAt(0).setMinimumWidth(rx0.j(j));
        }
        if (rx0.i(j) != 0) {
            sv6Var.getChildAt(0).setMinimumHeight(rx0.i(j));
        }
        int j2 = rx0.j(j);
        int h = rx0.h(j);
        ViewGroup.LayoutParams layoutParams = sv6Var.getLayoutParams();
        layoutParams.getClass();
        int l = jg.l(j2, h, layoutParams.width);
        int i = rx0.i(j);
        int g = rx0.g(j);
        ViewGroup.LayoutParams layoutParams2 = sv6Var.getLayoutParams();
        layoutParams2.getClass();
        sv6Var.measure(l, jg.l(i, g, layoutParams2.height));
        return xo3Var.L(sv6Var.getMeasuredWidth(), sv6Var.getMeasuredHeight(), ot1Var, new cg(sv6Var, this.b, (byte) 2));
    }

    @Override // defpackage.vo3
    public final int c(j23 j23Var, List list, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        sv6 sv6Var = this.a;
        ViewGroup.LayoutParams layoutParams = sv6Var.getLayoutParams();
        layoutParams.getClass();
        sv6Var.measure(makeMeasureSpec, jg.l(0, i, layoutParams.height));
        return sv6Var.getMeasuredWidth();
    }

    @Override // defpackage.vo3
    public final int d(j23 j23Var, List list, int i) {
        sv6 sv6Var = this.a;
        ViewGroup.LayoutParams layoutParams = sv6Var.getLayoutParams();
        layoutParams.getClass();
        sv6Var.measure(jg.l(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return sv6Var.getMeasuredHeight();
    }

    @Override // defpackage.vo3
    public final int e(j23 j23Var, List list, int i) {
        sv6 sv6Var = this.a;
        ViewGroup.LayoutParams layoutParams = sv6Var.getLayoutParams();
        layoutParams.getClass();
        sv6Var.measure(jg.l(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return sv6Var.getMeasuredHeight();
    }
}
