package defpackage;

import com.anistation.download.service.ExternalDownloadService;
import com.anistation.model.download.external.ExternalDownloadRecord;
import com.anistation.model.download.external.ExternalSubtitleRequest;
import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m02 extends t36 implements ic2 {
    public final /* synthetic */ File A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ ExternalDownloadRecord D;
    public final /* synthetic */ w05 E;
    public final /* synthetic */ w05 F;
    public /* synthetic */ Object x;
    public final /* synthetic */ w05 y;
    public final /* synthetic */ ExternalDownloadService z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m02(w05 w05Var, ExternalDownloadService externalDownloadService, File file, String str, String str2, ExternalDownloadRecord externalDownloadRecord, w05 w05Var2, w05 w05Var3, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = w05Var;
        this.z = externalDownloadService;
        this.A = file;
        this.B = str;
        this.C = str2;
        this.D = externalDownloadRecord;
        this.E = w05Var2;
        this.F = w05Var3;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        m02 m02Var = new m02(this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, vz0Var);
        m02Var.x = obj;
        return m02Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        m02 m02Var = (m02) create((v11) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        m02Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        String str;
        v11 v11Var = (v11) this.x;
        m37.N(obj);
        final l11 coroutineContext = v11Var.getCoroutineContext();
        int i = ExternalDownloadService.R;
        ExternalDownloadService externalDownloadService = this.z;
        x02 g = externalDownloadService.g();
        ExternalDownloadRecord externalDownloadRecord = this.D;
        String destinationTreeUri = externalDownloadRecord.getRequest().getDestinationTreeUri();
        final byte b = 0;
        sb2 sb2Var = new sb2() { // from class: l02
            @Override // defpackage.sb2
            public final Object invoke() {
                byte b2 = b;
                pn6 pn6Var = pn6.a;
                l11 l11Var = coroutineContext;
                switch (b2) {
                    case 0:
                        h98.o(l11Var);
                        return pn6Var;
                    default:
                        h98.o(l11Var);
                        return pn6Var;
                }
            }
        };
        File file = this.A;
        String str2 = this.B;
        String str3 = this.C;
        this.y.x = g.c(file, str2, "video/mp4", str3, destinationTreeUri, sb2Var);
        File file2 = (File) this.E.x;
        if (file2 != null) {
            ExternalSubtitleRequest subtitle = externalDownloadRecord.getRequest().getSubtitle();
            if (subtitle != null) {
                x02 g2 = externalDownloadService.g();
                String fileName = subtitle.getFileName();
                String fileName2 = subtitle.getFileName();
                final byte b2 = 1;
                if (b06.A(fileName2, ".vtt", true)) {
                    str = "text/vtt";
                } else if (b06.A(fileName2, ".srt", true)) {
                    str = "application/x-subrip";
                } else if (!b06.A(fileName2, ".ass", true) && !b06.A(fileName2, ".ssa", true)) {
                    str = "text/plain";
                } else {
                    str = "text/x-ssa";
                }
                this.F.x = g2.c(file2, fileName, str, str3, externalDownloadRecord.getRequest().getDestinationTreeUri(), new sb2() { // from class: l02
                    @Override // defpackage.sb2
                    public final Object invoke() {
                        byte b22 = b2;
                        pn6 pn6Var = pn6.a;
                        l11 l11Var = coroutineContext;
                        switch (b22) {
                            case 0:
                                h98.o(l11Var);
                                return pn6Var;
                            default:
                                h98.o(l11Var);
                                return pn6Var;
                        }
                    }
                });
            } else {
                ze0.k("Required value was null.");
                return null;
            }
        }
        h98.o(v11Var.getCoroutineContext());
        return pn6.a;
    }
}
