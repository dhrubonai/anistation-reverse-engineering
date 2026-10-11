package r3;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class a extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z5.a f9325a;

    public a(z5.a aVar) {
        this.f9325a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f9325a.f12059b.F;
        if (colorStateList != null) {
            a0.b.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        z5.c cVar = this.f9325a.f12059b;
        ColorStateList colorStateList = cVar.F;
        if (colorStateList != null) {
            a0.b.g(drawable, colorStateList.getColorForState(cVar.J, colorStateList.getDefaultColor()));
        }
    }
}
