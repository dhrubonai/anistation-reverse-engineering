package s1;

import java.util.Comparator;
import java.util.Date;
import msr.pistream.app.viewmodel.ScheduleViewModel;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9845b;

    public /* synthetic */ u(Object obj, int i10) {
        this.f9844a = i10;
        this.f9845b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long time;
        int i10 = this.f9844a;
        Object obj3 = this.f9845b;
        switch (i10) {
            case 0:
                y yVar = (y) obj3;
                return yVar.c(obj2) - yVar.c(obj);
            default:
                a8.b bVar = (a8.b) obj2;
                ((ScheduleViewModel) obj3).getClass();
                Date g10 = ScheduleViewModel.g((a8.b) obj);
                long j4 = Long.MAX_VALUE;
                if (g10 == null) {
                    time = Long.MAX_VALUE;
                } else {
                    time = g10.getTime();
                }
                Date g11 = ScheduleViewModel.g(bVar);
                if (g11 != null) {
                    j4 = g11.getTime();
                }
                return Long.compare(time, j4);
        }
    }
}
