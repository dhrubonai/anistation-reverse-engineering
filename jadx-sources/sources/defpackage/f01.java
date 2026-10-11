package defpackage;

import com.anistation.download.service.ExternalDownloadService;
import com.anistation.model.Episode;
import com.anistation.model.download.EpisodeDownload;
import com.anistation.model.download.EpisodeDownloadState;
import com.anistation.model.download.external.ExternalDownloadRecord;
import com.anistation.model.library.WatchProgress;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class f01 implements ub2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ f01(zp2 zp2Var) {
        this.x = (byte) 4;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        vz0 vz0Var = null;
        boolean z = false;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                WatchProgress watchProgress = (WatchProgress) obj;
                watchProgress.getClass();
                return vc2.a(watchProgress.getAnilistId(), watchProgress.getId());
            case 1:
                return pn6Var;
            case 2:
                j11 j11Var = (j11) obj;
                if (!(j11Var instanceof n11)) {
                    return null;
                }
                return (n11) j11Var;
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                return str + " : " + value;
            case 4:
                np2 np2Var = (np2) obj;
                np2Var.getClass();
                np2Var.c = false;
                np2Var.a.add(new k51(2, vz0Var));
                return pn6Var;
            case 5:
                return Boolean.valueOf(jf7.n(obj));
            case 6:
                cn0 cn0Var = (cn0) obj;
                cn0Var.getClass();
                cn0Var.a.D.f(ir2.f, new a7(3, vz0Var));
                return pn6Var;
            case 7:
                e04 e04Var = (e04) obj;
                e04Var.getClass();
                im0 a = z05.a(zl1.class);
                st0 st0Var = new st0((byte) 12);
                v83 v83Var = v83.x;
                n77.u(zz.u(a, st0Var, v83Var, e04Var, 8), z05.a(ok1.class));
                n77.u(zz.u(z05.a(fl1.class), new st0((byte) 13), v83Var, e04Var, 8), z05.a(qk1.class));
                return pn6Var;
            case 8:
                EpisodeDownload episodeDownload = (EpisodeDownload) obj;
                episodeDownload.getClass();
                return episodeDownload.getId();
            case 9:
                e53 e53Var = (e53) obj;
                e53Var.getClass();
                e53Var.c = true;
                e53Var.a = true;
                return pn6Var;
            case 10:
                if (((ExternalDownloadRecord) obj).getState() == EpisodeDownloadState.REMOVING) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                e04 e04Var2 = (e04) obj;
                e04Var2.getClass();
                iz5.b(e04Var2, z05.a(tm1.class), new st0((byte) 14));
                return pn6Var;
            case 12:
                ((sc3) obj).getClass();
                return new li2(tl7.e(sc3.b));
            case 13:
                return Boolean.TRUE;
            case 14:
                return pn6Var;
            case 15:
                Episode episode = (Episode) obj;
                episode.getClass();
                return episode.getId();
            case 16:
                String str2 = (String) obj;
                str2.getClass();
                String valueOf = String.valueOf(str2.charAt(0));
                valueOf.getClass();
                Locale locale = Locale.ROOT;
                String upperCase = valueOf.toUpperCase(locale);
                upperCase.getClass();
                String lowerCase = str2.substring(1).toLowerCase(locale);
                lowerCase.getClass();
                return upperCase.concat(lowerCase);
            case 17:
                e53 e53Var2 = (e53) obj;
                e53Var2.getClass();
                e53Var2.c = true;
                e53Var2.a = true;
                return pn6Var;
            case 18:
                ExternalDownloadRecord externalDownloadRecord = (ExternalDownloadRecord) obj;
                int i = ExternalDownloadService.R;
                externalDownloadRecord.getClass();
                return ExternalDownloadRecord.copy$default(externalDownloadRecord, null, EpisodeDownloadState.REMOVING, 0.0f, 0L, 0L, 0, null, null, null, 0L, null, 2045, null);
            case 19:
                ExternalDownloadRecord externalDownloadRecord2 = (ExternalDownloadRecord) obj;
                int i2 = ExternalDownloadService.R;
                externalDownloadRecord2.getClass();
                return oi4.L(externalDownloadRecord2, true);
            case 20:
                ExternalDownloadRecord externalDownloadRecord3 = (ExternalDownloadRecord) obj;
                int i3 = ExternalDownloadService.R;
                externalDownloadRecord3.getClass();
                return oi4.L(externalDownloadRecord3, false);
            case 21:
                ExternalDownloadRecord externalDownloadRecord4 = (ExternalDownloadRecord) obj;
                int i4 = ExternalDownloadService.R;
                externalDownloadRecord4.getClass();
                return ExternalDownloadRecord.copy$default(externalDownloadRecord4, null, EpisodeDownloadState.REMOVING, 0.0f, 0L, 0L, 0, null, null, null, 0L, null, 2045, null);
            case 22:
                ExternalDownloadRecord externalDownloadRecord5 = (ExternalDownloadRecord) obj;
                int i5 = ExternalDownloadService.R;
                externalDownloadRecord5.getClass();
                return ExternalDownloadRecord.copy$default(externalDownloadRecord5, null, EpisodeDownloadState.QUEUED, 0.0f, 0L, 0L, 0, null, null, null, 0L, null, 2013, null);
            case 23:
                ExternalDownloadRecord externalDownloadRecord6 = (ExternalDownloadRecord) obj;
                int i6 = ExternalDownloadService.R;
                externalDownloadRecord6.getClass();
                return ExternalDownloadRecord.copy$default(externalDownloadRecord6, null, EpisodeDownloadState.DOWNLOADING, 0.0f, 0L, 0L, 0, null, null, null, 0L, null, 1565, null);
            case 24:
                return ExternalDownloadRecord.copy$default((ExternalDownloadRecord) obj, null, EpisodeDownloadState.FAILED, 0.0f, 0L, 0L, 10002, null, null, null, 0L, null, 2013, null);
            case 25:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new bq5(absolutePath);
            case 26:
                return obj;
            case 27:
                return pn6Var;
            case 28:
                return pn6Var;
            default:
                return pn6Var;
        }
    }

    public /* synthetic */ f01(byte b) {
        this.x = b;
    }
}
