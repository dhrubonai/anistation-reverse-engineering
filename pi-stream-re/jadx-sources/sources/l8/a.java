package l8;

import android.widget.TextView;
import msr.pistream.app.viewmodel.ScheduleViewModel;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6891b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f6890a = i10;
        this.f6891b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScheduleViewModel scheduleViewModel;
        boolean z9;
        int i10 = this.f6890a;
        Object obj = this.f6891b;
        switch (i10) {
            case 0:
                d dVar = (d) obj;
                if (dVar.f6902n0 != null) {
                    dVar.Z();
                    dVar.f6904p0.postDelayed(this, 1200L);
                    return;
                }
                return;
            case 1:
                d dVar2 = ((b) obj).f6895a;
                int i11 = d.f6901t0;
                dVar2.Z();
                return;
            default:
                h0 h0Var = (h0) obj;
                if (h0Var.f6949z0 != null && (scheduleViewModel = h0Var.f6942s0) != null) {
                    Boolean bool = (Boolean) scheduleViewModel.f7846c.d();
                    TextView textView = h0Var.f6949z0;
                    ScheduleViewModel scheduleViewModel2 = h0Var.f6942s0;
                    if (bool != null && bool.booleanValue()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    scheduleViewModel2.getClass();
                    textView.setText(ScheduleViewModel.i(z9));
                    h0Var.A0.postDelayed(this, 30000L);
                    return;
                }
                return;
        }
    }
}
