package w5;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import j6.f;
import j6.g;

/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10998b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f10997a = i10;
        this.f10998b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f10997a;
        Object obj = this.f10998b;
        switch (i10) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = ((BottomSheetBehavior) obj).f2663i;
                if (gVar != null) {
                    f fVar = gVar.f6194a;
                    if (fVar.f6183j != floatValue) {
                        fVar.f6183j = floatValue;
                        gVar.f6198e = true;
                        gVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((TextInputLayout) obj).J0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
