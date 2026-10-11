package defpackage;

import com.anistation.download.data.model.DownloadRequest;
import com.anistation.model.Episode;
import com.anistation.model.Info;
import com.anistation.model.MediaFormat;
import com.anistation.model.watch.Source;
import com.anistation.model.watch.SourcesResponse;
import com.anistation.model.watch.Track;
import com.anistation.model.watch.WatchSession;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z17 extends t36 implements ic2 {
    public final /* synthetic */ WatchSession A;
    public final /* synthetic */ Episode B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ Info E;
    public final /* synthetic */ ym6 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ Source H;
    public final /* synthetic */ SourcesResponse I;
    public final /* synthetic */ Track J;
    public final /* synthetic */ String K;
    public final /* synthetic */ String L;
    public final /* synthetic */ String M;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ v27 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z17(v27 v27Var, WatchSession watchSession, Episode episode, String str, String str2, Info info, ym6 ym6Var, String str3, Source source, SourcesResponse sourcesResponse, Track track, String str4, String str5, String str6, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = v27Var;
        this.A = watchSession;
        this.B = episode;
        this.C = str;
        this.D = str2;
        this.E = info;
        this.F = ym6Var;
        this.G = str3;
        this.H = source;
        this.I = sourcesResponse;
        this.J = track;
        this.K = str4;
        this.L = str5;
        this.M = str6;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                return new z17(this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, vz0Var, (byte) 0);
            default:
                return new z17(this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, vz0Var, (byte) 1);
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
                return ((z17) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((z17) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object value;
        String str;
        Integer num;
        qk1 qk1Var;
        Object d;
        Object value2;
        Object value3;
        String str2;
        Integer num2;
        pn6 pn6Var;
        Object e;
        Object value4;
        byte b = this.x;
        pn6 pn6Var2 = pn6.a;
        String str3 = this.M;
        ym6 ym6Var = this.F;
        Episode episode = this.B;
        w11 w11Var = w11.x;
        v27 v27Var = this.z;
        Info info = this.E;
        MediaFormat mediaFormat = null;
        switch (b) {
            case 0:
                za0 za0Var = v27Var.p;
                qk1 qk1Var2 = v27Var.g;
                sx5 sx5Var = v27Var.n;
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                        d = ((z45) obj).x;
                        qk1Var = qk1Var2;
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    do {
                        value = sx5Var.getValue();
                    } while (!sx5Var.j(value, ym6.a((ym6) value, null, null, null, null, null, null, null, false, 0.0f, false, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, false, false, true, null, false, false, false, false, false, false, false, -134217729, 15)));
                    if (info != null) {
                        str = info.getBannerImage();
                    } else {
                        str = null;
                    }
                    if (info != null) {
                        num = info.getSeasonYear();
                    } else {
                        num = null;
                    }
                    if (info != null) {
                        mediaFormat = info.getFormat();
                    }
                    qk1Var = qk1Var2;
                    DownloadRequest downloadRequest = new DownloadRequest(this.A, this.B, this.C, this.D, str, num, mediaFormat, episode.getAiredAt(), ym6Var.e, this.G, this.H, this.I, this.J, this.K, this.L);
                    this.y = true;
                    d = ((fl1) qk1Var).d(downloadRequest, str3, this);
                    if (d == w11Var) {
                        return w11Var;
                    }
                }
                if (!(d instanceof y45)) {
                    ((fl1) qk1Var).m();
                    za0Var.i(new s17("Download started."));
                }
                Throwable b2 = z45.b(d);
                if (b2 != null) {
                    String message = b2.getMessage();
                    if (message == null) {
                        message = "Could not start download";
                    }
                    za0Var.i(new s17(message));
                }
                do {
                    value2 = sx5Var.getValue();
                } while (!sx5Var.j(value2, ym6.a((ym6) value2, null, null, null, null, null, null, null, false, 0.0f, false, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -134217729, 15)));
                return pn6Var2;
            default:
                za0 za0Var2 = v27Var.p;
                qk1 qk1Var3 = v27Var.g;
                sx5 sx5Var2 = v27Var.n;
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                        e = ((z45) obj).x;
                        pn6Var = pn6Var2;
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    do {
                        value3 = sx5Var2.getValue();
                    } while (!sx5Var2.j(value3, ym6.a((ym6) value3, null, null, null, null, null, null, null, false, 0.0f, false, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, false, false, true, null, false, false, false, false, false, false, false, -134217729, 15)));
                    if (info != null) {
                        str2 = info.getBannerImage();
                    } else {
                        str2 = null;
                    }
                    if (info != null) {
                        num2 = info.getSeasonYear();
                    } else {
                        num2 = null;
                    }
                    if (info != null) {
                        mediaFormat = info.getFormat();
                    }
                    pn6Var = pn6Var2;
                    DownloadRequest downloadRequest2 = new DownloadRequest(this.A, this.B, this.C, this.D, str2, num2, mediaFormat, episode.getAiredAt(), ym6Var.e, this.G, this.H, this.I, this.J, this.K, this.L);
                    this.y = true;
                    e = ((fl1) qk1Var3).e(downloadRequest2, str3, this);
                    if (e == w11Var) {
                        return w11Var;
                    }
                }
                if (!(e instanceof y45)) {
                    ((fl1) qk1Var3).m();
                    za0Var2.i(new s17("External download started."));
                }
                Throwable b3 = z45.b(e);
                if (b3 != null) {
                    String message2 = b3.getMessage();
                    if (message2 == null) {
                        message2 = "Could not start external download";
                    }
                    za0Var2.i(new s17(message2));
                }
                do {
                    value4 = sx5Var2.getValue();
                } while (!sx5Var2.j(value4, ym6.a((ym6) value4, null, null, null, null, null, null, null, false, 0.0f, false, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -134217729, 15)));
                return pn6Var;
        }
    }
}
