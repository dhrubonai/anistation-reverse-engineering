package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f451b;

    public /* synthetic */ e(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f450a = i10;
        this.f451b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f450a;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f451b;
        switch (i10) {
            case 0:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.N = actionBarOverlayLayout.f327d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.O);
                return;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.N = actionBarOverlayLayout.f327d.animate().translationY(-actionBarOverlayLayout.f327d.getHeight()).setListener(actionBarOverlayLayout.O);
                return;
        }
    }
}
