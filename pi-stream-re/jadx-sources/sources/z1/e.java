package z1;

import android.os.SystemClock;
import f1.v;

/* loaded from: classes.dex */
public final /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f11899a;

    public final void a(int i10) {
        int i11;
        g gVar = this.f11899a;
        synchronized (gVar) {
            int i12 = gVar.f11923m;
            if (i12 == 0 || gVar.f11914d) {
                if (i12 != i10) {
                    gVar.f11923m = i10;
                    if (i10 != 1 && i10 != 0 && i10 != 8) {
                        gVar.f11921k = gVar.b(i10);
                        ((v) gVar.f11913c).getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (gVar.f11916f > 0) {
                            i11 = (int) (elapsedRealtime - gVar.f11917g);
                        } else {
                            i11 = 0;
                        }
                        gVar.c(i11, gVar.f11918h, gVar.f11921k);
                        gVar.f11917g = elapsedRealtime;
                        gVar.f11918h = 0L;
                        gVar.f11920j = 0L;
                        gVar.f11919i = 0L;
                        t tVar = gVar.f11915e;
                        tVar.f11957b.clear();
                        tVar.f11959d = -1;
                        tVar.f11960e = 0;
                        tVar.f11961f = 0;
                    }
                }
            }
        }
    }
}
