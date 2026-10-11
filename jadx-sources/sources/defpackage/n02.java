package defpackage;

import com.anistation.download.service.ExternalDownloadService;
import java.io.File;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n02 extends t36 implements ic2 {
    public final /* synthetic */ w05 A;
    public final /* synthetic */ ExternalDownloadService B;
    public final /* synthetic */ String C;
    public final /* synthetic */ r05 x;
    public final /* synthetic */ w05 y;
    public final /* synthetic */ w05 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n02(r05 r05Var, w05 w05Var, w05 w05Var2, w05 w05Var3, ExternalDownloadService externalDownloadService, String str, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = r05Var;
        this.y = w05Var;
        this.z = w05Var2;
        this.A = w05Var3;
        this.B = externalDownloadService;
        this.C = str;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new n02(this.x, this.y, this.z, this.A, this.B, this.C, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        n02 n02Var = (n02) create((v11) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        n02Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        m37.N(obj);
        r05 r05Var = this.x;
        boolean z = r05Var.x;
        ExternalDownloadService externalDownloadService = this.B;
        if (!z) {
            w02 w02Var = (w02) this.y.x;
            if (w02Var != null) {
                int i = ExternalDownloadService.R;
                externalDownloadService.g().b(w02Var.a.toString());
            }
            w02 w02Var2 = (w02) this.z.x;
            if (w02Var2 != null) {
                int i2 = ExternalDownloadService.R;
                externalDownloadService.g().b(w02Var2.a.toString());
            }
        }
        File file = (File) this.A.x;
        if (file != null) {
            file.delete();
        }
        if (r05Var.x) {
            int i3 = ExternalDownloadService.R;
            Iterator it = externalDownloadService.p(this.C).iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
        }
        return pn6.a;
    }
}
