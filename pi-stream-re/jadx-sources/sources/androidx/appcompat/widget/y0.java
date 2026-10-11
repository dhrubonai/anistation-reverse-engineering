package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class y0 extends z7.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f710l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f711m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ WeakReference f712n;
    public final /* synthetic */ f1 o;

    public y0(f1 f1Var, int i10, int i11, WeakReference weakReference) {
        this.o = f1Var;
        this.f710l = i10;
        this.f711m = i11;
        this.f712n = weakReference;
    }

    @Override // z7.c
    public final void q(int i10) {
    }

    @Override // z7.c
    public final void r(Typeface typeface) {
        int i10;
        boolean z9;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f710l) != -1) {
            if ((this.f711m & 2) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            typeface = e1.a(typeface, i10, z9);
        }
        f1 f1Var = this.o;
        if (f1Var.f481m) {
            f1Var.f480l = typeface;
            TextView textView = (TextView) this.f712n.get();
            if (textView != null) {
                WeakHashMap weakHashMap = g0.y0.f4277a;
                if (g0.k0.b(textView)) {
                    textView.post(new z0(textView, typeface, f1Var.f478j));
                } else {
                    textView.setTypeface(typeface, f1Var.f478j);
                }
            }
        }
    }
}
