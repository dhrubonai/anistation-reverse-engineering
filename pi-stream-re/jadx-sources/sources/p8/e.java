package p8;

import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n8.a f8772b;

    public /* synthetic */ e(n8.a aVar, int i10) {
        this.f8771a = i10;
        this.f8772b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8771a;
        n8.a aVar = this.f8772b;
        switch (i10) {
            case 0:
                aVar.f8024b.F.d("");
                return;
            default:
                FrameLayout frameLayout = aVar.f8024b.W;
                if (frameLayout != null && frameLayout.getVisibility() == 0) {
                    TextView textView = aVar.f8024b.f7762m0;
                    frameLayout.animate().alpha(0.0f).setDuration(180L).withEndAction(new j(frameLayout, 1)).start();
                    if (textView != null) {
                        textView.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
