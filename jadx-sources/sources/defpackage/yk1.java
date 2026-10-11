package defpackage;

import com.anistation.download.data.model.DownloadRequest;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yk1 extends t36 implements ic2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ fl1 y;
    public final /* synthetic */ DownloadRequest z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yk1(fl1 fl1Var, DownloadRequest downloadRequest, String str, String str2, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.y = fl1Var;
        this.z = downloadRequest;
        this.A = str;
        this.B = str2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                return new yk1(this.y, this.z, this.A, this.B, vz0Var, (byte) 0);
            default:
                return new yk1(this.y, this.z, this.A, this.B, vz0Var, (byte) 1);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v11 v11Var = (v11) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((yk1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((yk1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        String str = this.B;
        String str2 = this.A;
        DownloadRequest downloadRequest = this.z;
        fl1 fl1Var = this.y;
        switch (b) {
            case 0:
                m37.N(obj);
                fl1Var.getClass();
                return wi5.q0(wi5.s0(new d32(new os(fl1.j(downloadRequest, str2), (byte) 1), false, new zg(str, (byte) 11)), new d0(1, fl1Var.b.e, x71.class, "getDownload", "getDownload(Ljava/lang/String;)Landroidx/media3/exoplayer/offline/Download;", 0, (byte) 10)));
            default:
                m37.N(obj);
                fl1Var.getClass();
                return wi5.q0(wi5.s0(new d32(new os(fl1.j(downloadRequest, str2), (byte) 1), false, new zg(str, (byte) 12)), new d0(1, fl1Var.b.e, x71.class, "getDownload", "getDownload(Ljava/lang/String;)Landroidx/media3/exoplayer/offline/Download;", 0, (byte) 12)));
        }
    }
}
