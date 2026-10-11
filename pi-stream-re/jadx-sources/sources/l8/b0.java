package l8;

import android.view.ViewTreeObserver;
import msr.pistream.app.ui.home.screens.MainActivity;

/* loaded from: classes.dex */
public final class b0 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f6897b;

    public b0(MainActivity mainActivity, int i10) {
        this.f6897b = mainActivity;
        this.f6896a = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        MainActivity mainActivity = this.f6897b;
        mainActivity.I.getViewTreeObserver().removeOnPreDrawListener(this);
        int scrollY = mainActivity.I.getScrollY();
        int i10 = this.f6896a;
        if (scrollY != i10) {
            mainActivity.I.scrollTo(0, i10);
            return true;
        }
        return true;
    }
}
