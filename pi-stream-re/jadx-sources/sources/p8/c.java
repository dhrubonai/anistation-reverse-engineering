package p8;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f8767b;

    public /* synthetic */ c(ValueAnimator valueAnimator, int i10) {
        this.f8766a = i10;
        this.f8767b = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8766a;
        ValueAnimator valueAnimator = this.f8767b;
        switch (i10) {
            case 0:
                valueAnimator.start();
                return;
            case 1:
                valueAnimator.start();
                return;
            case 2:
                valueAnimator.start();
                return;
            default:
                valueAnimator.start();
                return;
        }
    }
}
