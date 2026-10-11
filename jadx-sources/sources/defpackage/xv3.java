package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.anistation.download.service.ExternalDownloadService;
import com.discord.org.webrtc.VideoFrame;
import com.discord.org.webrtc.VideoSink;
import com.discord.org.webrtc.VideoSource;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class xv3 implements aw3, tn3, ff0, ri3, b35, si3, ay0, c46, VideoSink {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ xv3(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // defpackage.ff0
    public void a(long j, long j2, long j3) {
        float f;
        gv4 gv4Var = (gv4) this.y;
        if (gv4Var.e == null) {
            return;
        }
        if (j != -1 && j != 0) {
            f = eq6.Y(j2, j);
        } else {
            f = -1.0f;
        }
        float f2 = f;
        hk1 hk1Var = gv4Var.e;
        hk1Var.getClass();
        hk1Var.b(f2, j, j2);
    }

    @Override // defpackage.ay0
    public void accept(Object obj) {
        byte b = this.x;
        Object obj2 = this.y;
        switch (b) {
            case 12:
                ((jw2) obj2).c((e31) obj);
                return;
            case 13:
                e31 e31Var = (e31) obj;
                e31Var.getClass();
                nw2 nw2Var = e31Var.a;
                nw2Var.getClass();
                ((w05) obj2).x = nw2Var;
                return;
            default:
                ((mi6) obj2).b((oz1) obj);
                return;
        }
    }

    @Override // defpackage.aw3
    public void b(fq4 fq4Var, dt3 dt3Var) {
        ((ay0) this.y).accept(fq4Var);
    }

    @Override // defpackage.si3
    public void c(Object obj, g42 g42Var) {
        ((io4) obj).B((fi0) this.y, new ho4(g42Var));
    }

    public void d() {
        ic2 ic2Var = (ic2) this.y;
        synchronized (mt5.c) {
            mt5.h = yo0.t0(ic2Var, mt5.h);
        }
    }

    @Override // defpackage.b35
    public void e(long j, zi4 zi4Var) {
        byte b = this.x;
        kg5 kg5Var = (kg5) this.y;
        switch (b) {
            case 9:
                bx7.o(j, zi4Var, kg5Var.c);
                return;
            default:
                bx7.p(j, zi4Var, kg5Var.c);
                return;
        }
    }

    @Override // defpackage.c46
    public Object i() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 17:
                l85 l85Var = ((kp6) obj).i;
                SQLiteDatabase a = l85Var.a();
                a.beginTransaction();
                try {
                    a.compileStatement("DELETE FROM log_event_dropped").execute();
                    a.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + l85Var.y.f()).execute();
                    a.setTransactionSuccessful();
                    return null;
                } finally {
                    a.endTransaction();
                }
            default:
                zp2 zp2Var = (zp2) obj;
                Iterator it = ((Iterable) ((l85) zp2Var.y).p(new p65((byte) 2))).iterator();
                while (it.hasNext()) {
                    ((dn0) zp2Var.z).N((oy) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // defpackage.ri3
    public void invoke(Object obj) {
        byte b = this.x;
        byte b2 = 1;
        Object obj2 = this.y;
        switch (b) {
            case 6:
                ((io4) obj).A((qh6) obj2);
                return;
            case 7:
                ((io4) obj).H((kf6) obj2, 1);
                return;
            case 8:
                ((io4) obj).Q((rf1) obj2);
                return;
            default:
                s02 s02Var = (s02) obj;
                ((ii6) ((eo3) obj2).y).t.getClass();
                File file = s02Var.d;
                ExternalDownloadService externalDownloadService = s02Var.a;
                String str = s02Var.b;
                long j = s02Var.c;
                int i = ExternalDownloadService.R;
                if (externalDownloadService.i(j, str)) {
                    externalDownloadService.n();
                    externalDownloadService.h().f(str, new j02(file, b2));
                    externalDownloadService.e(str, file, j);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.tn3
    public Object j(Object obj, Object obj2) {
        return tl7.S((List) ((Collection) obj2), new on3(((z24) this.y).C, obj));
    }

    @Override // com.discord.org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        VideoSource.b((VideoSource) this.y, videoFrame);
    }

    public /* synthetic */ xv3(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
    }
}
