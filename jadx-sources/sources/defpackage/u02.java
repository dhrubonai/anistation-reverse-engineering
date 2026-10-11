package defpackage;

import android.app.NotificationManager;
import com.anistation.download.service.ExternalDownloadService;
import com.anistation.model.download.external.ExternalDownloadRecord;
import java.io.File;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u02 implements Runnable {
    public final /* synthetic */ mm5 A;
    public final /* synthetic */ float B;
    public final /* synthetic */ ExternalDownloadService x;
    public final /* synthetic */ String y;
    public final /* synthetic */ long z;

    public u02(ExternalDownloadService externalDownloadService, String str, long j, mm5 mm5Var, float f) {
        this.x = externalDownloadService;
        this.y = str;
        this.z = j;
        this.A = mm5Var;
        this.B = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int a;
        Integer num;
        ExternalDownloadService externalDownloadService = this.x;
        ii6 ii6Var = externalDownloadService.G;
        long j = this.z;
        String str = this.y;
        if (externalDownloadService.i(j, str) && ii6Var != null) {
            ii6Var.i();
            pz1 pz1Var = ii6Var.r;
            byte b = 0;
            mm5 mm5Var = this.A;
            if (pz1Var == null) {
                a = 0;
            } else {
                a = pz1Var.a(mm5Var);
            }
            if (a == 2) {
                float f = this.B;
                num = Integer.valueOf(db.C((int) ((((100.0f - f) * mm5Var.x) / 100.0f) + f), 0, 99));
            } else {
                num = null;
            }
            Iterator it = externalDownloadService.p(str).iterator();
            if (it.hasNext()) {
                long length = ((File) it.next()).length();
                while (it.hasNext()) {
                    long length2 = ((File) it.next()).length();
                    if (length < length2) {
                        length = length2;
                    }
                }
                externalDownloadService.h().f(str, new t02(num, length, b));
                ExternalDownloadRecord c = externalDownloadService.h().c(str);
                if (c != null) {
                    ((NotificationManager) externalDownloadService.getSystemService(NotificationManager.class)).notify(2201, externalDownloadService.a(c, num, length, false, false));
                }
                externalDownloadService.D.postDelayed(this, 500L);
                return;
            }
            qi2.e();
        }
    }
}
