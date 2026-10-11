package l8;

import android.widget.ScrollView;
import msr.pistream.app.ui.home.screens.MainActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6966b;

    public /* synthetic */ m0(Object obj, int i10) {
        this.f6965a = i10;
        this.f6966b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6965a;
        Object obj = this.f6966b;
        switch (i10) {
            case 0:
                z zVar = (z) obj;
                int i11 = zVar.f7035a;
                MainActivity mainActivity = zVar.f7036b;
                switch (i11) {
                    case 0:
                        mainActivity.T();
                        return;
                    default:
                        mainActivity.T();
                        return;
                }
            case 1:
                MainActivity mainActivity2 = ((z) obj).f7036b;
                mainActivity2.P(mainActivity2.Q, mainActivity2.R, false);
                return;
            case 2:
                ((a0) obj).f6894c.L.setVisibility(8);
                return;
            default:
                int i12 = d0.f6908v0;
                ((ScrollView) obj).scrollTo(0, 0);
                return;
        }
    }
}
