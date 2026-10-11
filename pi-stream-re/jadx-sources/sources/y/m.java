package y;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.function.IntConsumer;
import l8.r0;
import m8.v0;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11443b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11444c;

    public /* synthetic */ m(Object obj, int i10, int i11) {
        this.f11442a = i11;
        this.f11444c = obj;
        this.f11443b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f11442a;
        int i11 = this.f11443b;
        Object obj = this.f11444c;
        switch (i10) {
            case 0:
                ((z7.c) obj).q(i11);
                return;
            case 1:
                j1.d dVar = ((j1.b) obj).f5632b;
                dVar.getClass();
                boolean z9 = true;
                if (i11 != -3 && i11 != -2) {
                    if (i11 != -1) {
                        if (i11 != 1) {
                            a3.g.A("Unknown focus change type: ", i11, "AudioFocusManager");
                            return;
                        } else {
                            dVar.d(1);
                            dVar.b(1);
                            return;
                        }
                    }
                    dVar.b(-1);
                    dVar.a();
                    return;
                }
                if (i11 != -2) {
                    c1.g gVar = dVar.f5659d;
                    if (gVar == null || gVar.f1696a != 1) {
                        z9 = false;
                    }
                    if (!z9) {
                        dVar.d(3);
                        return;
                    }
                }
                dVar.b(0);
                dVar.d(2);
                return;
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.o.get();
                if (view != null) {
                    sideSheetBehavior.s(view, i11, false);
                    return;
                }
                return;
            case 3:
                i0 i0Var = (i0) obj;
                i0Var.getClass();
                try {
                    ((ProgressBar) i0Var.f2434d).setProgress(Math.max(0, Math.min(100, i11)));
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                r0 r0Var = (r0) obj;
                r0Var.A0.f(r0Var.f7014z0);
                r0.X(r0Var.f7014z0, i11);
                return;
            case 5:
                int[] iArr = v0.f7722a;
                ((IntConsumer) obj).accept(i11);
                return;
            default:
                x8.e eVar = (x8.e) obj;
                Handler handler = eVar.f11401b;
                try {
                    handler.post(new f1.k(eVar, eVar.f11406g.b(i11), i11, 10));
                    return;
                } catch (Exception e10) {
                    Log.e("PagedVM", "loadNext", e10);
                    handler.post(new androidx.activity.b(eVar, 24));
                    return;
                }
        }
    }
}
