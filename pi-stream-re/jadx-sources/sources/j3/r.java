package j3;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c1.z0;
import m3.a1;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class r extends m3.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final String[] f6078d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f6079e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable[] f6080f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f6081g;

    public r(x xVar, String[] strArr, Drawable[] drawableArr) {
        this.f6081g = xVar;
        this.f6078d = strArr;
        this.f6079e = new String[strArr.length];
        this.f6080f = drawableArr;
    }

    @Override // m3.d0
    public final int a() {
        return this.f6078d.length;
    }

    @Override // m3.d0
    public final long b(int i10) {
        return i10;
    }

    @Override // m3.d0
    public final void c(a1 a1Var, int i10) {
        q qVar = (q) a1Var;
        boolean e10 = e(i10);
        View view = qVar.f7153a;
        if (e10) {
            view.setLayoutParams(new m3.l0(-1, -2));
        } else {
            view.setLayoutParams(new m3.l0(0, 0));
        }
        qVar.f6074u.setText(this.f6078d[i10]);
        String str = this.f6079e[i10];
        TextView textView = qVar.f6075v;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        Drawable drawable = this.f6080f[i10];
        ImageView imageView = qVar.f6076w;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // m3.d0
    public final a1 d(RecyclerView recyclerView) {
        x xVar = this.f6081g;
        return new q(xVar, LayoutInflater.from(xVar.getContext()).inflate(R.layout.exo_styled_settings_list_item, (ViewGroup) recyclerView, false));
    }

    public final boolean e(int i10) {
        x xVar = this.f6081g;
        z0 z0Var = xVar.f6136y0;
        if (z0Var == null) {
            return false;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                return true;
            }
            if (!((c1.i) z0Var).d(30) || !((c1.i) xVar.f6136y0).d(29)) {
                return false;
            }
            return true;
        }
        return ((c1.i) z0Var).d(13);
    }
}
