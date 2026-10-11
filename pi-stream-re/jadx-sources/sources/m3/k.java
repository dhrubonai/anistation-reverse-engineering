package m3;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7277b;

    public /* synthetic */ k(Object obj, int i10) {
        this.f7276a = i10;
        this.f7277b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7276a;
        Object obj = this.f7277b;
        switch (i10) {
            case 0:
                o oVar = (o) obj;
                int i11 = oVar.A;
                ValueAnimator valueAnimator = oVar.f7333z;
                if (i11 != 1) {
                    if (i11 != 2) {
                        return;
                    }
                } else {
                    valueAnimator.cancel();
                }
                oVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            default:
                ((StaggeredGridLayoutManager) obj).A0();
                return;
        }
    }
}
