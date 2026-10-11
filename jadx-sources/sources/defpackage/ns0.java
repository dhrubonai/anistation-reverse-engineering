package defpackage;

import com.anistation.download.service.ExternalDownloadService;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ns0 extends n6 implements ic2 {
    public final /* synthetic */ byte x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ns0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.x = b;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                int intValue = ((Number) obj2).intValue();
                ((os0) this.receiver).a(intValue, (kd2) obj);
                return pn6Var;
            case 1:
                nk1 nk1Var = (nk1) obj;
                ExternalDownloadService externalDownloadService = (ExternalDownloadService) this.receiver;
                int i = ExternalDownloadService.R;
                externalDownloadService.getClass();
                if (nk1Var.b && (!nk1Var.a.getDownloadOverWifiOnly() || nk1Var.c)) {
                    z = true;
                } else {
                    z = false;
                }
                externalDownloadService.K = z;
                externalDownloadService.L = nk1Var.a();
                if (externalDownloadService.J) {
                    if (externalDownloadService.K) {
                        externalDownloadService.j();
                    } else {
                        ArrayDeque arrayDeque = externalDownloadService.E;
                        String str = externalDownloadService.F;
                        if (str != null) {
                            externalDownloadService.h().f(str, new f01((byte) 22));
                            arrayDeque.remove(str);
                            arrayDeque.addFirst(str);
                            ExternalDownloadService.m(externalDownloadService);
                        }
                        externalDownloadService.j();
                    }
                }
                return pn6Var;
            case 2:
                long j = ((ur6) obj).a;
                jd5 jd5Var = (jd5) this.receiver;
                tl7.z(jd5Var.g0.c(), null, null, new a3(jd5Var, j, null, (byte) 2), 3);
                return pn6Var;
            default:
                long j2 = ((ur6) obj).a;
                jd5 jd5Var2 = (jd5) this.receiver;
                tl7.z(jd5Var2.g0.c(), null, null, new a3(jd5Var2, j2, null, (byte) 3), 3);
                return pn6Var;
        }
    }
}
