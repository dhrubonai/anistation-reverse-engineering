package p8;

import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f8781b;

    public /* synthetic */ j(FrameLayout frameLayout, int i10) {
        this.f8780a = i10;
        this.f8781b = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8780a;
        FrameLayout frameLayout = this.f8781b;
        switch (i10) {
            case 0:
                frameLayout.setVisibility(8);
                return;
            default:
                frameLayout.setVisibility(8);
                return;
        }
    }
}
