package defpackage;

import com.anistation.model.download.OfflineDownloadMetadata;
import com.anistation.model.download.OfflineSubtitleMetadata;
import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bl1 implements gk1 {
    public final /* synthetic */ fl1 a;

    public bl1(fl1 fl1Var) {
        this.a = fl1Var;
    }

    @Override // defpackage.gk1
    public final void a(ik1 ik1Var) {
        this.a.m();
    }

    @Override // defpackage.gk1
    public final void b(ik1 ik1Var, cj1 cj1Var) {
        cj1Var.getClass();
        this.a.m();
    }

    @Override // defpackage.gk1
    public final void f(ik1 ik1Var, cj1 cj1Var) {
        OfflineSubtitleMetadata subtitle;
        String fileName;
        cj1Var.getClass();
        x53 x53Var = jk1.a;
        il1 il1Var = cj1Var.a;
        byte[] bArr = il1Var.D;
        String str = il1Var.x;
        bArr.getClass();
        OfflineDownloadMetadata a = jk1.a(bArr);
        fl1 fl1Var = this.a;
        if (a != null && (subtitle = a.getSubtitle()) != null && (fileName = subtitle.getFileName()) != null) {
            rs rsVar = fl1Var.f;
            rsVar.getClass();
            if (!uz5.V(fileName)) {
                new File(rsVar.b, fileName).delete();
            }
        }
        rs rsVar2 = fl1Var.g;
        str.getClass();
        rsVar2.getClass();
        new File(rsVar2.b, x97.S(str)).delete();
        if (a != null) {
            str.getClass();
            fl1Var.c(a, str);
        }
        fl1Var.m();
    }
}
