package l8;

import android.view.View;
import android.view.ViewParent;
import android.widget.ScrollView;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f6951b;

    public /* synthetic */ i(n nVar, int i10) {
        this.f6950a = i10;
        this.f6951b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6950a;
        final n nVar = this.f6951b;
        switch (i10) {
            case 0:
                int i11 = n.E0;
                View view = nVar.V;
                if (view != null) {
                    for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                        if (parent instanceof ScrollView) {
                            ScrollView scrollView = (ScrollView) parent;
                            nVar.D0 = scrollView;
                            scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: l8.l
                                @Override // android.view.View.OnScrollChangeListener
                                public final void onScrollChange(View view2, int i12, int i13, int i14, int i15) {
                                    int i16 = n.E0;
                                    n.this.X();
                                }
                            });
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                int i12 = n.E0;
                nVar.X();
                return;
        }
    }
}
