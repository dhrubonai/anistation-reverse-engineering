package z;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class g implements n4.d {

    /* renamed from: a, reason: collision with root package name */
    public int f11861a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11862b;

    public g(int i10, boolean z9) {
        this.f11861a = i10;
        this.f11862b = z9;
    }

    @Override // n4.d
    public final boolean a(Object obj, n4.c cVar) {
        Drawable drawable = (Drawable) obj;
        m4.f fVar = (m4.f) cVar;
        Drawable drawable2 = ((ImageView) fVar.f7444a).getDrawable();
        if (drawable2 == null) {
            drawable2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f11862b);
        transitionDrawable.startTransition(this.f11861a);
        ((ImageView) fVar.f7444a).setImageDrawable(transitionDrawable);
        return true;
    }
}
