package m6;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import g0.h0;
import g0.y0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f7531a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f7532b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f7533c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Context context, int i10, String[] strArr) {
        super(context, i10, strArr);
        this.f7533c = tVar;
        a();
    }

    public final void a() {
        boolean z9;
        ColorStateList colorStateList;
        boolean z10;
        boolean z11;
        t tVar = this.f7533c;
        ColorStateList colorStateList2 = tVar.B;
        if (colorStateList2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        ColorStateList colorStateList3 = null;
        if (!z9) {
            colorStateList = null;
        } else {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        }
        this.f7532b = colorStateList;
        if (tVar.A != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (tVar.B != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int[] iArr2 = {R.attr.state_hovered, -16842919};
                int[] iArr3 = {R.attr.state_selected, -16842919};
                colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{z.a.b(tVar.B.getColorForState(iArr3, 0), tVar.A), z.a.b(tVar.B.getColorForState(iArr2, 0), tVar.A), tVar.A});
            }
        }
        this.f7531a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z9;
        View view2 = super.getView(i10, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            t tVar = this.f7533c;
            Drawable drawable = null;
            if (tVar.getText().toString().contentEquals(textView.getText())) {
                if (tVar.A != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    ColorDrawable colorDrawable = new ColorDrawable(tVar.A);
                    if (this.f7532b != null) {
                        a0.b.h(colorDrawable, this.f7531a);
                        drawable = new RippleDrawable(this.f7532b, colorDrawable, null);
                    } else {
                        drawable = colorDrawable;
                    }
                }
            }
            WeakHashMap weakHashMap = y0.f4277a;
            h0.q(textView, drawable);
        }
        return view2;
    }
}
