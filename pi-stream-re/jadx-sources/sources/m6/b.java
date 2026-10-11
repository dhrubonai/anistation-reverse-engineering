package m6;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7456b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f7455a = i10;
        this.f7456b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z9) {
        int i10 = this.f7455a;
        Object obj = this.f7456b;
        switch (i10) {
            case 0:
                d dVar = (d) obj;
                dVar.t(dVar.u());
                return;
            case 1:
                k kVar = (k) obj;
                kVar.f7479l = z9;
                kVar.q();
                if (!z9) {
                    kVar.t(false);
                    kVar.f7480m = false;
                    return;
                }
                return;
            case 2:
                GradientDrawable gradientDrawable = (GradientDrawable) obj;
                int i11 = w8.i.f11061a;
                if (!z9) {
                    gradientDrawable = null;
                }
                view.setForeground(gradientDrawable);
                return;
            default:
                ImageView imageView = (ImageView) obj;
                if (z9) {
                    imageView.setColorFilter(w8.i.f11065e);
                    return;
                } else {
                    int i12 = w8.i.f11061a;
                    imageView.clearColorFilter();
                    return;
                }
        }
    }
}
