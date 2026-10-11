package l8;

import android.view.View;
import msr.pistream.app.ui.home.screens.MainActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7001b;

    public /* synthetic */ r(Object obj, int i10) {
        this.f7000a = i10;
        this.f7001b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f7000a;
        Object obj = this.f7001b;
        switch (i10) {
            case 0:
                ((s) obj).f7015a.f7021s0.c();
                return;
            case 1:
                z zVar = ((d0) obj).f6914s0;
                if (zVar != null) {
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
                }
                return;
            default:
                z zVar2 = ((r0) obj).f7008t0;
                if (zVar2 != null) {
                    zVar2.a();
                    return;
                }
                return;
        }
    }
}
