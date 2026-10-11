package com.anistation.download.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.anistation.android.R;
import com.anistation.download.service.ExternalDownloadService;
import com.anistation.model.download.EpisodeDownloadState;
import com.anistation.model.download.OfflineDownloadMetadata;
import com.anistation.model.download.external.ExternalDownloadRecord;
import com.anistation.model.download.external.ExternalDownloadRequest;
import com.anistation.model.download.external.ExternalStreamKey;
import com.anistation.model.download.external.ExternalSubtitleRequest;
import com.unity3d.services.core.device.MimeTypes;
import defpackage.a34;
import defpackage.ar3;
import defpackage.bi6;
import defpackage.bx5;
import defpackage.bx7;
import defpackage.bz4;
import defpackage.c41;
import defpackage.cg0;
import defpackage.cn7;
import defpackage.d46;
import defpackage.da;
import defpackage.db;
import defpackage.e0;
import defpackage.f01;
import defpackage.gb4;
import defpackage.h02;
import defpackage.hi6;
import defpackage.hr3;
import defpackage.hu1;
import defpackage.i02;
import defpackage.ia;
import defpackage.ii6;
import defpackage.io3;
import defpackage.iv5;
import defpackage.j02;
import defpackage.ja1;
import defpackage.jd4;
import defpackage.jf3;
import defpackage.jr3;
import defpackage.jw2;
import defpackage.ke0;
import defpackage.kz;
import defpackage.l33;
import defpackage.l35;
import defpackage.lx2;
import defpackage.ml1;
import defpackage.nk1;
import defpackage.nq3;
import defpackage.o02;
import defpackage.ou0;
import defpackage.p65;
import defpackage.pr1;
import defpackage.pz2;
import defpackage.q02;
import defpackage.q26;
import defpackage.q8;
import defpackage.qg0;
import defpackage.qm3;
import defpackage.qr1;
import defpackage.qy3;
import defpackage.r02;
import defpackage.rb3;
import defpackage.rh1;
import defpackage.rr1;
import defpackage.rt3;
import defpackage.s02;
import defpackage.sb2;
import defpackage.te4;
import defpackage.tl7;
import defpackage.tp;
import defpackage.u02;
import defpackage.v02;
import defpackage.vy5;
import defpackage.vz0;
import defpackage.wc4;
import defpackage.wc7;
import defpackage.wp;
import defpackage.x02;
import defpackage.y11;
import defpackage.y91;
import defpackage.yo0;
import defpackage.zo0;
import defpackage.zw2;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ExternalDownloadService extends Service {
    public static final /* synthetic */ int R = 0;
    public final d46 A;
    public final d46 B;
    public final ke0 C;
    public final Handler D;
    public final ArrayDeque E;
    public String F;
    public ii6 G;
    public u02 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public bx5 M;
    public bx5 N;
    public boolean O;
    public long P;
    public int Q;
    public final rb3 x = bx7.B(jf3.x, new r02(this, (byte) 0));
    public final d46 y;
    public final d46 z;

    public ExternalDownloadService() {
        final byte b = 0;
        this.y = new d46(new sb2(this) { // from class: k02
            public final /* synthetic */ ExternalDownloadService y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                byte b2 = b;
                ExternalDownloadService externalDownloadService = this.y;
                switch (b2) {
                    case 0:
                        int i = ExternalDownloadService.R;
                        return i02.d.M(externalDownloadService);
                    case 1:
                        int i2 = ExternalDownloadService.R;
                        return wc4.g.w((ok1) externalDownloadService.x.getValue(), externalDownloadService);
                    case 2:
                        int i3 = ExternalDownloadService.R;
                        return new x02(externalDownloadService);
                    default:
                        int i4 = ExternalDownloadService.R;
                        return ml1.d.j((ok1) externalDownloadService.x.getValue(), externalDownloadService);
                }
            }
        });
        final byte b2 = 1;
        this.z = new d46(new sb2(this) { // from class: k02
            public final /* synthetic */ ExternalDownloadService y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                byte b22 = b2;
                ExternalDownloadService externalDownloadService = this.y;
                switch (b22) {
                    case 0:
                        int i = ExternalDownloadService.R;
                        return i02.d.M(externalDownloadService);
                    case 1:
                        int i2 = ExternalDownloadService.R;
                        return wc4.g.w((ok1) externalDownloadService.x.getValue(), externalDownloadService);
                    case 2:
                        int i3 = ExternalDownloadService.R;
                        return new x02(externalDownloadService);
                    default:
                        int i4 = ExternalDownloadService.R;
                        return ml1.d.j((ok1) externalDownloadService.x.getValue(), externalDownloadService);
                }
            }
        });
        final byte b3 = 2;
        this.A = new d46(new sb2(this) { // from class: k02
            public final /* synthetic */ ExternalDownloadService y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                byte b22 = b3;
                ExternalDownloadService externalDownloadService = this.y;
                switch (b22) {
                    case 0:
                        int i = ExternalDownloadService.R;
                        return i02.d.M(externalDownloadService);
                    case 1:
                        int i2 = ExternalDownloadService.R;
                        return wc4.g.w((ok1) externalDownloadService.x.getValue(), externalDownloadService);
                    case 2:
                        int i3 = ExternalDownloadService.R;
                        return new x02(externalDownloadService);
                    default:
                        int i4 = ExternalDownloadService.R;
                        return ml1.d.j((ok1) externalDownloadService.x.getValue(), externalDownloadService);
                }
            }
        });
        final byte b4 = 3;
        this.B = new d46(new sb2(this) { // from class: k02
            public final /* synthetic */ ExternalDownloadService y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                byte b22 = b4;
                ExternalDownloadService externalDownloadService = this.y;
                switch (b22) {
                    case 0:
                        int i = ExternalDownloadService.R;
                        return i02.d.M(externalDownloadService);
                    case 1:
                        int i2 = ExternalDownloadService.R;
                        return wc4.g.w((ok1) externalDownloadService.x.getValue(), externalDownloadService);
                    case 2:
                        int i3 = ExternalDownloadService.R;
                        return new x02(externalDownloadService);
                    default:
                        int i4 = ExternalDownloadService.R;
                        return ml1.d.j((ok1) externalDownloadService.x.getValue(), externalDownloadService);
                }
            }
        });
        q26 a = iv5.a();
        ja1 ja1Var = rh1.a;
        this.C = db.b(tl7.L(a, qm3.a.B));
        this.D = new Handler(Looper.getMainLooper());
        this.E = new ArrayDeque();
        this.L = true;
    }

    public static void m(ExternalDownloadService externalDownloadService) {
        ia iaVar = new ia(0, externalDownloadService, ExternalDownloadService.class, "processNext", "processNext()V", 0, (byte) 13);
        vz0 vz0Var = null;
        externalDownloadService.F = null;
        externalDownloadService.P++;
        externalDownloadService.O = true;
        externalDownloadService.n();
        ii6 ii6Var = externalDownloadService.G;
        if (ii6Var != null) {
            ii6Var.b();
        }
        externalDownloadService.G = null;
        bx5 bx5Var = externalDownloadService.M;
        externalDownloadService.M = null;
        if (bx5Var != null) {
            bx5Var.l(null);
        }
        externalDownloadService.N = tl7.z(externalDownloadService.C, null, null, new e0((Object) bx5Var, (Object) externalDownloadService, (Object) iaVar, vz0Var, (byte) 18), 3);
    }

    public static String o(long j) {
        if (j <= 0) {
            return "0 MB";
        }
        float f = ((float) j) / 1048576.0f;
        if (f < 1024.0f) {
            return String.format(Locale.US, "%.0f MB", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        }
        return String.format(Locale.US, "%.2f GB", Arrays.copyOf(new Object[]{Float.valueOf(f / 1024.0f)}, 1));
    }

    public final Notification a(ExternalDownloadRecord externalDownloadRecord, Integer num, long j, boolean z, boolean z2) {
        OfflineDownloadMetadata offlineDownloadMetadata;
        String string;
        String string2;
        ExternalDownloadRequest request;
        PendingIntent pendingIntent = null;
        if (externalDownloadRecord != null && (request = externalDownloadRecord.getRequest()) != null) {
            offlineDownloadMetadata = request.getMetadata();
        } else {
            offlineDownloadMetadata = null;
        }
        if (offlineDownloadMetadata != null) {
            string = offlineDownloadMetadata.getAnimeTitle() + " • " + offlineDownloadMetadata.getEpisodeTitle();
        } else {
            string = getString(R.string.download_service_downloading_episode);
            string.getClass();
        }
        if (z) {
            string2 = getString(R.string.download_service_waiting_for_wifi);
        } else if (z2) {
            string2 = getString(R.string.download_service_waiting_for_network);
        } else if (num != null) {
            string2 = num + "% • " + o(j);
        } else if (j > 0) {
            string2 = o(j);
        } else {
            string2 = getString(R.string.download_service_preparing);
        }
        string2.getClass();
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage != null) {
            pendingIntent = PendingIntent.getActivity(this, 0, launchIntentForPackage, 201326592);
        }
        gb4 gb4Var = new gb4(this, "episode_downloads");
        gb4Var.u.icon = android.R.drawable.stat_sys_download;
        gb4Var.e = gb4.c(string);
        gb4Var.f = gb4.c(string2);
        gb4Var.d(8, true);
        gb4Var.d(2, true);
        gb4Var.p = "progress";
        gb4Var.i = -1;
        gb4Var.g = pendingIntent;
        if (num == null) {
            gb4Var.l = (byte) 0;
            gb4Var.m = 0;
            gb4Var.n = true;
        } else {
            int intValue = num.intValue();
            gb4Var.l = (byte) 100;
            gb4Var.m = intValue;
            gb4Var.n = false;
        }
        if (externalDownloadRecord != null) {
            Intent intent = new Intent(this, (Class<?>) ExternalDownloadService.class);
            intent.setAction("com.anistation.download.EXTERNAL_REMOVE");
            intent.putExtra("download_id", externalDownloadRecord.getRequest().getId());
            gb4Var.a(0, PendingIntent.getService(this, externalDownloadRecord.getRequest().getId().hashCode(), intent, 201326592), getString(R.string.download_service_cancel));
        }
        Notification b = gb4Var.b();
        b.getClass();
        return b;
    }

    public final Object b(String str, ExternalSubtitleRequest externalSubtitleRequest, Map map, o02 o02Var) {
        qg0 qg0Var = new qg0(1, wc7.z(o02Var));
        qg0Var.t();
        File file = new File(getCacheDir(), "external_exports");
        file.mkdirs();
        Pattern compile = Pattern.compile("[^A-Za-z0-9._-]");
        compile.getClass();
        str.getClass();
        String replaceAll = compile.matcher(str).replaceAll("_");
        replaceAll.getClass();
        File createTempFile = File.createTempFile(replaceAll, ".subtitle.partial", file);
        kz kzVar = new kz((byte) 8);
        kzVar.E(externalSubtitleRequest.getUrl());
        for (Map.Entry entry : map.entrySet()) {
            kzVar.y((String) entry.getKey(), (String) entry.getValue());
        }
        l35 r = kzVar.r();
        jd4 jd4Var = ((wc4) this.z.getValue()).c;
        jd4Var.getClass();
        bz4 bz4Var = new bz4(jd4Var, r);
        qg0Var.v(new cg0(bz4Var, (byte) 1));
        bz4Var.d(new rt3((Object) createTempFile, (Object) qg0Var, (byte) 22));
        return qg0Var.r();
    }

    public final void c(String str) {
        if (!a34.i(str, this.F)) {
            ArrayDeque arrayDeque = this.E;
            if (!arrayDeque.contains(str)) {
                arrayDeque.addLast(str);
            }
        }
    }

    public final void d() {
        List a = h().a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            ExternalDownloadRecord externalDownloadRecord = (ExternalDownloadRecord) obj;
            if (externalDownloadRecord.getState() == EpisodeDownloadState.QUEUED || externalDownloadRecord.getState() == EpisodeDownloadState.RESTARTING) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            c(((ExternalDownloadRecord) obj2).getRequest().getId());
        }
    }

    public final void e(String str, File file, long j) {
        ExternalDownloadRecord c = h().c(str);
        if (c == null) {
            file.delete();
            f(str);
        } else {
            h().f(str, new j02(file, (byte) 0));
            this.M = tl7.z(this.C, null, null, new o02(c, this, str, j, file, null), 3);
        }
    }

    public final void f(String str) {
        if (!a34.i(this.F, str)) {
            return;
        }
        n();
        this.G = null;
        this.M = null;
        this.F = null;
        j();
    }

    public final x02 g() {
        return (x02) this.A.getValue();
    }

    public final i02 h() {
        return (i02) this.y.getValue();
    }

    public final boolean i(long j, String str) {
        if (a34.i(this.F, str) && this.P == j) {
            return true;
        }
        return false;
    }

    public final void j() {
        EpisodeDownloadState episodeDownloadState;
        EpisodeDownloadState episodeDownloadState2;
        ExternalDownloadRecord externalDownloadRecord;
        long j;
        if (!this.I && !this.O && this.Q <= 0 && this.F == null) {
            boolean z = this.K;
            Object obj = null;
            ArrayDeque arrayDeque = this.E;
            if (!z) {
                if (arrayDeque.isEmpty()) {
                    List<ExternalDownloadRecord> a = h().a();
                    if (a == null || !a.isEmpty()) {
                        for (ExternalDownloadRecord externalDownloadRecord2 : a) {
                            if (externalDownloadRecord2.getState() != EpisodeDownloadState.QUEUED && externalDownloadRecord2.getState() != EpisodeDownloadState.RESTARTING) {
                            }
                        }
                    }
                    stopForeground(1);
                    stopSelf();
                    return;
                }
                String str = (String) yo0.l0(arrayDeque);
                if (str == null || (externalDownloadRecord = h().c(str)) == null) {
                    Iterator it = h().a().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((ExternalDownloadRecord) next).getState() == EpisodeDownloadState.QUEUED) {
                            obj = next;
                            break;
                        }
                    }
                    externalDownloadRecord = (ExternalDownloadRecord) obj;
                }
                ExternalDownloadRecord externalDownloadRecord3 = externalDownloadRecord;
                if (externalDownloadRecord3 != null) {
                    j = externalDownloadRecord3.getBytesDownloaded();
                } else {
                    j = 0;
                }
                startForeground(2201, a(externalDownloadRecord3, null, j, this.L, true), 1);
                return;
            }
            String str2 = null;
            while (!arrayDeque.isEmpty() && str2 == null) {
                String str3 = (String) arrayDeque.removeFirst();
                i02 h = h();
                str3.getClass();
                ExternalDownloadRecord c = h.c(str3);
                if (c != null) {
                    episodeDownloadState = c.getState();
                } else {
                    episodeDownloadState = null;
                }
                if (episodeDownloadState != EpisodeDownloadState.QUEUED) {
                    if (c != null) {
                        episodeDownloadState2 = c.getState();
                    } else {
                        episodeDownloadState2 = null;
                    }
                    if (episodeDownloadState2 == EpisodeDownloadState.RESTARTING) {
                    }
                }
                str2 = str3;
            }
            if (str2 == null) {
                stopForeground(1);
                stopSelf();
                return;
            }
            ExternalDownloadRecord c2 = h().c(str2);
            if (c2 == null) {
                j();
                return;
            }
            this.F = c2.getRequest().getId();
            h().f(c2.getRequest().getId(), new f01((byte) 23));
            startForeground(2201, a(c2, Integer.valueOf((int) c2.getPercentDownloaded()), c2.getBytesDownloaded(), false, false), 1);
            long j2 = this.P + 1;
            this.P = j2;
            bx5 z2 = tl7.z(this.C, null, y11.y, new q02((Object) this, (Object) c2, j2, (vz0) null, (byte) 0), 1);
            this.M = z2;
            z2.start();
        }
    }

    public final void k(ExternalDownloadRecord externalDownloadRecord, String str) {
        gb4 gb4Var = new gb4(this, "episode_downloads");
        gb4Var.u.icon = android.R.drawable.stat_sys_download_done;
        gb4Var.e = gb4.c(externalDownloadRecord.getRequest().getMetadata().getAnimeTitle() + " • " + externalDownloadRecord.getRequest().getMetadata().getEpisodeTitle());
        gb4Var.f = gb4.c(getString(R.string.download_service_external_saved, externalDownloadRecord.getRequest().getDestinationName(), str));
        gb4Var.d(16, true);
        gb4Var.i = -1;
        Notification b = gb4Var.b();
        b.getClass();
        ((NotificationManager) getSystemService(NotificationManager.class)).notify((externalDownloadRecord.getRequest().getId().hashCode() & 4095) + 2300, b);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [mm5, java.lang.Object] */
    public final void l(ExternalDownloadRecord externalDownloadRecord, File file, long j) {
        wp a;
        String str;
        float f;
        float f2;
        OfflineDownloadMetadata metadata = externalDownloadRecord.getRequest().getMetadata();
        for (File file2 : p(externalDownloadRecord.getRequest().getId())) {
            if (!a34.i(file2, file)) {
                file2.delete();
                nq3 nq3Var = new nq3();
                nq3Var.c(metadata.getSourceUrl());
                String id = externalDownloadRecord.getRequest().getId();
                id.getClass();
                nq3Var.b = id;
                nq3Var.c = metadata.getSourceMimeType();
                List<ExternalStreamKey> streamKeys = externalDownloadRecord.getRequest().getStreamKeys();
                ArrayList arrayList = new ArrayList(zo0.V(streamKeys, 10));
                for (ExternalStreamKey externalStreamKey : streamKeys) {
                    arrayList.add(new vy5(externalStreamKey.getPeriodIndex(), externalStreamKey.getGroupIndex(), externalStreamKey.getStreamIndex()));
                }
                nq3Var.b(arrayList);
                hr3 hr3Var = new hr3();
                hr3Var.a = metadata.getEpisodeTitle();
                hr3Var.e = metadata.getEpisodeTitle();
                hr3Var.f = metadata.getAnimeTitle();
                hr3Var.b = metadata.getAnimeTitle();
                hr3Var.c = metadata.getAnimeTitle();
                hr3Var.o = Integer.valueOf(metadata.getEpisodeNumber());
                hr3Var.I = 9;
                nq3Var.k = new jr3(hr3Var);
                ar3 a2 = nq3Var.a();
                Context applicationContext = getApplicationContext();
                wc4 wc4Var = (wc4) this.z.getValue();
                Map<String, String> headers = metadata.getHeaders();
                wc4Var.getClass();
                headers.getClass();
                l33 l33Var = new l33(wc4Var.c);
                l33Var.o(headers);
                tp tpVar = new tp(getApplicationContext(), new c41(new rt3(getApplicationContext(), (byte) 15)), new y91(new pz2(applicationContext, l33Var)), null);
                String id2 = externalDownloadRecord.getRequest().getId();
                hi6 hi6Var = new hi6(getApplicationContext());
                hi6Var.k = tpVar;
                String n = qy3.n(MimeTypes.VIDEO_H264);
                io3.p(qy3.m(n), "Not a video MIME type: %s", n);
                hi6Var.c = n;
                String n2 = qy3.n("audio/mp4a-latm");
                io3.p(qy3.i(n2), "Not an audio MIME type: %s", n2);
                hi6Var.b = n2;
                hi6Var.j.a(new s02(this, id2, j, file2));
                bi6 bi6Var = hi6Var.d;
                if (bi6Var == null) {
                    a = new wp((byte) 4);
                    a.b = -1;
                } else {
                    a = bi6Var.a();
                }
                String str2 = hi6Var.b;
                if (str2 != null) {
                    a.w(str2);
                }
                String str3 = hi6Var.c;
                if (str3 != null) {
                    a.x(str3);
                }
                bi6 b = a.b();
                hi6Var.d = b;
                String str4 = b.b;
                cn7 cn7Var = hi6Var.o;
                if (str4 != null) {
                    io3.D(((lx2) cn7Var.x).a(qy3.h(str4)).contains(str4), "Unsupported sample MIME type %s", str4);
                }
                String str5 = hi6Var.d.c;
                if (str5 != null) {
                    io3.D(((lx2) cn7Var.x).a(qy3.h(str5)).contains(str5), "Unsupported sample MIME type %s", str5);
                }
                ii6 ii6Var = new ii6(hi6Var.a, hi6Var.d, hi6Var.e, hi6Var.f, hi6Var.g, hi6Var.h, hi6Var.i, hi6Var.j, hi6Var.k, hi6Var.l, hi6Var.m, hi6Var.n, hi6Var.o, hi6Var.p, hi6Var.q);
                this.G = ii6Var;
                try {
                    if (file != null) {
                        List H = te4.H(new qr1(new pr1(a2)));
                        zw2 zw2Var = rr1.e;
                        rt3 rt3Var = new rt3(zw2.p(1, 2));
                        ((jw2) rt3Var.y).d(H);
                        ou0 a3 = new ou0(new rr1(rt3Var), new rr1[0]).a();
                        ii6 ii6Var2 = this.G;
                        if (ii6Var2 != null) {
                            ii6Var2.e(a3, file2.getAbsolutePath(), file.getAbsolutePath());
                        }
                    } else {
                        ii6Var.g(a2, file2.getAbsolutePath());
                    }
                    if (file != null) {
                        f = externalDownloadRecord.getPercentDownloaded();
                    } else {
                        f = 0.0f;
                    }
                    f2 = f;
                    n();
                    str = id2;
                } catch (Exception unused) {
                    str = id2;
                }
                try {
                    u02 u02Var = new u02(this, str, j, new Object(), f2);
                    this.D.post(u02Var);
                    this.H = u02Var;
                    return;
                } catch (Exception unused2) {
                    ii6 ii6Var3 = this.G;
                    if (ii6Var3 != null) {
                        ii6Var3.b();
                    }
                    file2.delete();
                    h().f(str, new da(10001, (byte) 3));
                    f(str);
                    return;
                }
            }
        }
        p65.h("Collection contains no element matching the predicate.");
    }

    public final void n() {
        u02 u02Var = this.H;
        if (u02Var != null) {
            this.D.removeCallbacks(u02Var);
        }
        this.H = null;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        boolean z;
        ExternalDownloadRecord copy$default;
        super.onCreate();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        if (notificationManager.getNotificationChannel("episode_downloads") == null) {
            NotificationChannel notificationChannel = new NotificationChannel("episode_downloads", getString(R.string.download_service_channel), 2);
            notificationChannel.setDescription(getString(R.string.download_service_channel_description));
            notificationManager.createNotificationChannel(notificationChannel);
        }
        i02 h = h();
        synchronized (h.c) {
            try {
                h02 d = h.d();
                List<ExternalDownloadRecord> list = d.b;
                ArrayList arrayList = new ArrayList(zo0.V(list, 10));
                boolean z2 = false;
                for (ExternalDownloadRecord externalDownloadRecord : list) {
                    externalDownloadRecord.getClass();
                    int i = v02.a[externalDownloadRecord.getState().ordinal()];
                    if (i != 1 && i != 2) {
                        copy$default = externalDownloadRecord;
                        z = true;
                    } else {
                        z = true;
                        copy$default = ExternalDownloadRecord.copy$default(externalDownloadRecord, null, EpisodeDownloadState.QUEUED, 0.0f, 0L, 0L, 0, null, null, null, 0L, null, 2013, null);
                    }
                    if (!a34.i(copy$default, externalDownloadRecord)) {
                        externalDownloadRecord = ExternalDownloadRecord.copy$default(copy$default, null, null, 0.0f, 0L, 0L, 0, null, null, null, System.currentTimeMillis(), null, 1535, null);
                        z2 = z;
                    }
                    arrayList.add(externalDownloadRecord);
                }
                if (z2) {
                    h.g(new h02(d.a, arrayList));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d();
        tl7.z(this.C, null, null, new hu1(this, null, (byte) 9), 3);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.P++;
        n();
        ii6 ii6Var = this.G;
        if (ii6Var != null) {
            ii6Var.b();
        }
        this.G = null;
        db.t(this.C, null);
        super.onDestroy();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2, types: [vz0] */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        boolean z;
        String str;
        ExternalDownloadRecord f;
        this.J = true;
        nk1 nk1Var = (nk1) ((ml1) this.B.getValue()).c.x.getValue();
        if (nk1Var.b && (!nk1Var.a.getDownloadOverWifiOnly() || nk1Var.c)) {
            z = true;
        } else {
            z = false;
        }
        this.K = z;
        boolean a = nk1Var.a();
        this.L = a;
        startForeground(2201, a(null, null, 0L, a, !this.K), 1);
        ?? r8 = 0;
        EpisodeDownloadState episodeDownloadState = null;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            ke0 ke0Var = this.C;
            ArrayDeque arrayDeque = this.E;
            switch (hashCode) {
                case -832046725:
                    if (str.equals("com.anistation.download.EXTERNAL_REMOVE")) {
                        String stringExtra = intent.getStringExtra("download_id");
                        if (stringExtra != null) {
                            arrayDeque.remove(stringExtra);
                            boolean i3 = a34.i(this.F, stringExtra);
                            this.Q++;
                            h().f(stringExtra, new f01((byte) 18));
                            if (i3) {
                                m(this);
                            }
                            tl7.z(ke0Var, null, null, new q8(this, stringExtra, r8, (byte) 7), 3);
                            break;
                        }
                    }
                    break;
                case -831862492:
                    if (str.equals("com.anistation.download.EXTERNAL_RESUME")) {
                        String stringExtra2 = intent.getStringExtra("download_id");
                        if (stringExtra2 != null && (f = h().f(stringExtra2, new f01((byte) 20))) != null && f.getState() == EpisodeDownloadState.QUEUED) {
                            c(stringExtra2);
                            break;
                        }
                    }
                    break;
                case -21696323:
                    if (str.equals("com.anistation.download.EXTERNAL_REMOVE_ALL")) {
                        if (!this.I) {
                            this.I = true;
                            arrayDeque.clear();
                            List a2 = h().a();
                            Iterator it = a2.iterator();
                            while (it.hasNext()) {
                                h().f(((ExternalDownloadRecord) it.next()).getRequest().getId(), new f01((byte) 21));
                            }
                            if (this.F != null) {
                                m(this);
                            }
                            tl7.z(ke0Var, null, null, new q8(this, a2, r8, (byte) 6), 3);
                            break;
                        }
                    }
                    break;
                case 1218127359:
                    if (str.equals("com.anistation.download.EXTERNAL_PAUSE")) {
                        String stringExtra3 = intent.getStringExtra("download_id");
                        if (stringExtra3 != null) {
                            h().f(stringExtra3, new f01((byte) 19));
                            ExternalDownloadRecord c = h().c(stringExtra3);
                            if (c != null) {
                                r8 = c.getState();
                            }
                            if (r8 == EpisodeDownloadState.STOPPED) {
                                arrayDeque.remove(stringExtra3);
                                if (a34.i(this.F, stringExtra3)) {
                                    m(this);
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 1585228753:
                    if (str.equals("com.anistation.download.EXTERNAL_ENQUEUE")) {
                        String stringExtra4 = intent.getStringExtra("download_id");
                        if (stringExtra4 != null) {
                            if (!stringExtra4.equals(this.F)) {
                                ExternalDownloadRecord c2 = h().c(stringExtra4);
                                if (c2 != null) {
                                    episodeDownloadState = c2.getState();
                                }
                                if (episodeDownloadState == EpisodeDownloadState.QUEUED) {
                                    Iterator it2 = p(stringExtra4).iterator();
                                    while (it2.hasNext()) {
                                        ((File) it2.next()).delete();
                                    }
                                }
                            }
                            c(stringExtra4);
                            break;
                        }
                    }
                    break;
            }
            j();
            return 1;
        }
        d();
        j();
        return 1;
    }

    public final List p(String str) {
        File file = new File(getFilesDir(), "external_exports");
        file.mkdirs();
        Pattern compile = Pattern.compile("[^A-Za-z0-9._-]");
        compile.getClass();
        str.getClass();
        String replaceAll = compile.matcher(str).replaceAll("_");
        replaceAll.getClass();
        return te4.I(new File(file, replaceAll.concat(".partial.mp4")), new File(file, replaceAll.concat(".resume.mp4")));
    }
}
