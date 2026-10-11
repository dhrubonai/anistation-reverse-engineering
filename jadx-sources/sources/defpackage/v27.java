package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.anistation.download.data.model.OfflinePlayback;
import com.anistation.model.CoverImage;
import com.anistation.model.Episode;
import com.anistation.model.Info;
import com.anistation.model.Resource;
import com.anistation.model.Title;
import com.anistation.model.download.DownloadStorageType;
import com.anistation.model.download.EpisodeDownload;
import com.anistation.model.download.OfflineDownloadMetadataKt;
import com.anistation.model.download.OfflineSubtitleMetadata;
import com.anistation.model.settings.SubtitleStyleSettings;
import com.anistation.model.watch.Provider;
import com.anistation.model.watch.Server;
import com.anistation.model.watch.Source;
import com.anistation.model.watch.SourcesResponse;
import com.anistation.model.watch.Track;
import com.anistation.model.watch.WatchSession;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v27 extends lg {
    public boolean A;
    public List B;
    public long C;
    public vk4 D;
    public ar3 E;
    public boolean F;
    public boolean G;
    public long H;
    public long I;
    public v17 J;
    public t17 K;
    public final LinkedHashSet L;
    public long M;
    public Long N;
    public bx5 O;
    public t17 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final tv T;
    public final LinkedHashSet U;
    public Integer V;
    public String W;
    public Long X;
    public y17 Y;
    public SourcesResponse Z;
    public boolean a0;
    public boolean b0;
    public final pn c;
    public long c0;
    public final cy6 d;
    public s25 d0;
    public final ot6 e;
    public w17 e0;
    public final cn f;
    public u17 f0;
    public final qk1 g;
    public final k27 g0;
    public final ch1 h;
    public final j27 h0;
    public final jd4 i;
    public final ci0 j;
    public final vy1 k;
    public final ei0 l;
    public final ft3 m;
    public final sx5 n;
    public final sx5 o;
    public final za0 p;
    public final mj0 q;
    public bx5 r;
    public bx5 s;
    public bx5 t;
    public bx5 u;
    public bx5 v;
    public bx5 w;
    public bx5 x;
    public bx5 y;
    public final y23 z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [ha2, ei0] */
    /* JADX WARN: Type inference failed for: r3v30, types: [tv, java.lang.Object] */
    public v27(Application application, pn pnVar, cy6 cy6Var, ot6 ot6Var, cn cnVar, qk1 qk1Var, ch1 ch1Var) {
        super(application);
        vy1 vy1Var;
        String str;
        Resource.Idle idle;
        nt1 nt1Var;
        boolean z;
        boolean isActivity;
        this.c = pnVar;
        this.d = cy6Var;
        this.e = ot6Var;
        this.f = cnVar;
        this.g = qk1Var;
        this.h = ch1Var;
        HashMap hashMap = new HashMap();
        hashMap.put(cp4.d.a, 144179200);
        byte b = 0;
        r91.a("bufferForPlaybackMs", "0", 1500, 0);
        r91.a("bufferForPlaybackAfterRebufferMs", "0", 3000, 0);
        r91.a("minBufferMs", "bufferForPlaybackMs", 30000, 1500);
        r91.a("minBufferMs", "bufferForPlaybackAfterRebufferMs", 30000, 3000);
        r91.a("maxBufferMs", "minBufferMs", 90000, 30000);
        r91 r91Var = new r91(new fm0((byte) 2), 30000, 30000, 90000, 90000, 1500, 1500, 3000, 3000, 50331648, false, hashMap);
        id4 id4Var = new id4();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        id4Var.v = dq6.b(10L, timeUnit);
        id4Var.w = dq6.b(30L, timeUnit);
        jd4 jd4Var = new jd4(id4Var);
        this.i = jd4Var;
        this.j = new ci0(application, jd4Var);
        byte b2 = 1;
        zx1 zx1Var = new zx1(application, new av(application, (byte) 5), new av(application, b2));
        io3.B(!zx1Var.A);
        zx1Var.f = new w91(r91Var, b2);
        io3.B(!zx1Var.A);
        zx1Var.A = true;
        vy1 vy1Var2 = new vy1(zx1Var);
        vy1Var2.u0(0);
        vy1Var2.Y(true);
        if5 if5Var = if5.c;
        vy1Var2.E1();
        if5Var = if5Var == null ? if5.e : if5Var;
        if (!vy1Var2.P.equals(if5Var)) {
            vy1Var2.P = if5Var;
            vy1Var2.l.D.c(5, if5Var).b();
        }
        this.k = vy1Var2;
        u98 u98Var = new u98(application);
        byte b3 = 12;
        cn7 cn7Var = new cn7((byte) 12);
        io3.B(!u98Var.y);
        u98Var.A = cn7Var;
        io3.B(!u98Var.y);
        u98Var.y = true;
        p25 p25Var = new p25(u98Var);
        xv3 xv3Var = new xv3(this, (byte) 20);
        if (p25Var.w != null) {
            vy1Var = p25Var;
        } else {
            vy1Var = vy1Var2;
        }
        ?? ha2Var = new ha2(new fi0(vy1Var2, p25Var, vy1Var, xv3Var));
        ha2Var.u0(0);
        ha2Var.Y(true);
        this.l = ha2Var;
        i27 i27Var = new i27(this);
        d46 d46Var = new d46(new e96(application, (byte) 8));
        ys3 ys3Var = new ys3(application, ha2Var);
        ys3Var.c = "WatchMediaSession_" + UUID.randomUUID();
        ys3Var.d = i27Var;
        PendingIntent pendingIntent = (PendingIntent) d46Var.getValue();
        if (pendingIntent != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                isActivity = pendingIntent.isActivity();
                io3.n(isActivity);
            }
            ys3Var.e = pendingIntent;
        }
        io3.B(!ys3Var.l);
        ys3Var.l = true;
        Object obj = ft3.c;
        int intValue = ((Integer) bu3.D.get()).intValue();
        p60 p60Var = ys3Var.h;
        Context context = ys3Var.a;
        if (p60Var == null) {
            ad adVar = new ad(context);
            adVar.y = (intValue * 2) - 1;
            r41 r41Var = new r41(adVar);
            ys3Var.h = r41Var;
            p60Var = r41Var;
        }
        p60 fr0Var = new fr0(p60Var, intValue, b3);
        ys3Var.h = fr0Var;
        byte b4 = 6;
        if (Build.VERSION.SDK_INT == 29) {
            AtomicReference atomicReference = ys3.m;
            iw2 iw2Var = (iw2) atomicReference.get();
            if (iw2Var == null) {
                Display defaultDisplay = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                Point point2 = new Point();
                defaultDisplay.getRealSize(point2);
                int i = point2.y;
                int i2 = point2.x;
                Point point3 = new Point(i - (i2 - point.x), i2 - (i - point.y));
                iw2Var = new iw2(new int[]{Math.max(point.x / 6, point.y / 6), Math.max(point3.x / 6, point3.y / 6)}, 2);
                atomicReference.set(iw2Var);
            }
            p60 y23Var = new y23(fr0Var, iw2Var, (byte) 16);
            ys3Var.h = y23Var;
            fr0Var = y23Var;
        }
        ys3Var.h = new rt3(fr0Var, b4);
        this.m = new ft3(context, ys3Var.c, ys3Var.b, ys3Var.e, ys3Var.i, ys3Var.j, ys3Var.k, ys3Var.d, ys3Var.f, ys3Var.g, ys3Var.h);
        if (((-1) & 32) != 0) {
            str = "Auto";
        } else {
            str = "1080p";
        }
        String str2 = str;
        SubtitleStyleSettings subtitleStyleSettings = SubtitleStyleSettings.Companion.getDEFAULT();
        Resource.Idle idle2 = Resource.Idle.INSTANCE;
        vz0 vz0Var = null;
        if ((1048576 & (-1)) != 0) {
            idle = idle2;
        } else {
            idle = null;
        }
        int i3 = 4194304 & (-1);
        nt1 nt1Var2 = nt1.x;
        if (i3 != 0) {
            nt1Var = nt1Var2;
        } else {
            nt1Var = null;
        }
        if (((-1) & 67108864) != 0) {
            z = false;
        } else {
            z = true;
        }
        this.n = tx5.a(new ym6(null, null, nt1Var2, null, "mimi", str2, "Fit", false, 1.0f, true, null, "English", nt1Var2, null, "ja", true, false, true, subtitleStyleSettings, idle2, idle, null, nt1Var, null, null, false, z, false, null, false, false, false, false, false, false, false));
        nt1 nt1Var3 = nt1.x;
        this.o = tx5.a(new dq4(false, false, false, 0L, 0L, nt1Var3, false, null, true, false, null));
        za0 d = iv.d(-2, 6, null);
        this.p = d;
        this.q = new mj0(d);
        this.z = new y23((Object) zz.J(this), (byte) 11);
        this.B = nt1Var3;
        this.H = -9223372036854775807L;
        this.L = new LinkedHashSet();
        this.S = true;
        this.T = new Object();
        this.U = new LinkedHashSet();
        this.Y = y17.x;
        this.g0 = new k27(this, b);
        j27 j27Var = new j27(this);
        this.h0 = j27Var;
        tl7.z(zz.J(this), null, null, new vz6(this, vz0Var, (byte) 7), 3);
        tl7.z(zz.J(this), null, null, new vz6(this, vz0Var, b2), 3);
        tl7.z(zz.J(this), null, null, new vz6(this, vz0Var, b4), 3);
        tl7.z(zz.J(this), null, null, new vz6(this, vz0Var, (byte) 3), 3);
        tl7.z(zz.J(this), null, null, new vz6(this, vz0Var, (byte) 2), 3);
        tl7.z(zz.J(this), null, null, new vz6(this, vz0Var, (byte) 4), 3);
        tl7.z(zz.J(this), null, null, new vz6(this, vz0Var, (byte) 8), 3);
        tl7.z(zz.J(this), null, null, new vz6(this, vz0Var, (byte) 9), 3);
        tl7.z(zz.J(this), null, null, new vz6(this, vz0Var, (byte) 5), 3);
        tl7.z(zz.J(this), null, null, new vz6(this, vz0Var, (byte) 10), 3);
        tl7.z(zz.J(this), null, null, new vz6(this, vz0Var, (byte) 12), 3);
        ha2Var.v(j27Var);
        rf1 deviceInfo = ha2Var.a.getDeviceInfo();
        deviceInfo.getClass();
        W(deviceInfo);
    }

    public static Source L(SourcesResponse sourcesResponse) {
        Object obj;
        Object obj2;
        List<Source> sources = sourcesResponse.getSources();
        if (sources == null) {
            sources = nt1.x;
        }
        Iterator<T> it = sources.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (s((Source) obj2)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Source source = (Source) obj2;
        if (source == null) {
            Iterator<T> it2 = sources.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (t((Source) next)) {
                    obj = next;
                    break;
                }
            }
            Source source2 = (Source) obj;
            if (source2 == null) {
                return (Source) yo0.m0(sources);
            }
            return source2;
        }
        return source;
    }

    public static SourcesResponse U(SourcesResponse sourcesResponse) {
        Source L;
        String H = n77.H(sourcesResponse.getPlayback());
        if (H == null || (L = L(sourcesResponse)) == null) {
            return null;
        }
        return SourcesResponse.copy$default(sourcesResponse, te4.H(Source.copy$default(L, H, null, null, 6, null)), null, null, null, null, null, 14, null);
    }

    public static zq3 V(Track track, boolean z) {
        Uri parse = Uri.parse(track.getUrl());
        parse.getClass();
        yq3 yq3Var = new yq3(parse);
        yq3Var.g = track.getId();
        String url = track.getUrl();
        url.getClass();
        String q = nu5.q(url);
        if (q.equals("text/x-ssa")) {
            q = "text/vtt";
        }
        yq3Var.b = qy3.n(q);
        yq3Var.c = track.getLang();
        yq3Var.f = track.getLabel();
        yq3Var.d = z ? 1 : 0;
        return new zq3(yq3Var);
    }

    public static boolean r(Track track) {
        String q = nu5.q(track.getUrl());
        if (!a34.i(q, "text/vtt") && !a34.i(q, "application/ttml+xml") && jf7.o(track.getUrl(), nu5.q(track.getUrl())) == null) {
            return false;
        }
        return true;
    }

    public static boolean s(Source source) {
        if (uz5.M(source.getType(), "mpegurl", true) || uz5.M(source.getType(), "m3u8", true) || uz5.M(source.getUrl(), ".m3u8", true)) {
            return true;
        }
        return false;
    }

    public static boolean t(Source source) {
        if (uz5.M(source.getType(), "mp4", true) || uz5.M(source.getType(), "video/mp4", true) || uz5.M(source.getUrl(), ".mp4", true)) {
            return true;
        }
        return false;
    }

    public static void u(v27 v27Var, int i) {
        v27Var.T.x = null;
        w(v27Var, i, null, false, null, 56);
    }

    public static /* synthetic */ void w(v27 v27Var, int i, Long l, boolean z, Boolean bool, int i2) {
        if ((i2 & 8) != 0) {
            bool = null;
        }
        v27Var.v(i, l, z, bool, false, false);
    }

    public final void A() {
        Resource.Success success;
        List list;
        sx5 sx5Var;
        Object value;
        ei0 ei0Var = this.l;
        if (ei0Var.a.l0()) {
            ei0Var.stop();
            do {
                sx5Var = this.o;
                value = sx5Var.getValue();
            } while (!sx5Var.j(value, dq4.a((dq4) value, true, false, false, 0L, 0L, null, false, null, false, false, null, 2046)));
        }
        ym6 ym6Var = (ym6) this.n.getValue();
        Episode episode = ym6Var.b;
        if (episode != null) {
            int number = episode.getNumber();
            Resource resource = ym6Var.t;
            Episode episode2 = null;
            Object obj = null;
            episode2 = null;
            if (resource instanceof Resource.Success) {
                success = (Resource.Success) resource;
            } else {
                success = null;
            }
            if (success != null && (list = (List) success.getData()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((Episode) obj2).getNumber() < number) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    obj = it.next();
                    if (it.hasNext()) {
                        int number2 = ((Episode) obj).getNumber();
                        do {
                            Object next = it.next();
                            int number3 = ((Episode) next).getNumber();
                            if (number2 < number3) {
                                obj = next;
                                number2 = number3;
                            }
                        } while (it.hasNext());
                    }
                }
                episode2 = (Episode) obj;
            }
            if (episode2 != null) {
                u(this, episode2.getNumber());
            }
        }
    }

    public final void B(OfflinePlayback offlinePlayback, Long l, boolean z) {
        long j;
        ei0 ei0Var;
        Track track;
        boolean z2;
        Object value;
        ym6 ym6Var;
        Track track2;
        ei0 ei0Var2 = this.l;
        if (!ei0Var2.a.getDeviceInfo().a) {
            long longValue = l.longValue();
            sx5 sx5Var = this.n;
            Episode episode = ((ym6) sx5Var.getValue()).b;
            if (episode != null) {
                this.D = new vk4(episode.getNumber(), longValue);
            }
            this.C = longValue;
            while (true) {
                sx5 sx5Var2 = this.o;
                Object value2 = sx5Var2.getValue();
                j = longValue;
                ei0Var = ei0Var2;
                if (sx5Var2.j(value2, dq4.a((dq4) value2, false, false, false, j, 0L, null, false, null, false, false, null, 2039))) {
                    break;
                }
                longValue = j;
                ei0Var2 = ei0Var;
            }
            lw3 mediaSource = offlinePlayback.getMediaSource();
            vy1 vy1Var = this.k;
            vy1Var.E1();
            List singletonList = Collections.singletonList(mediaSource);
            vy1Var.E1();
            vy1Var.x1(singletonList, 0, j, false);
            vy1Var.a();
            OfflineSubtitleMetadata subtitle = offlinePlayback.getMetadata().getSubtitle();
            if (subtitle != null) {
                String lang = subtitle.getLang();
                String label = subtitle.getLabel();
                if (label == null) {
                    label = "English";
                }
                track = new Track("offline_sub", "", lang, label, subtitle.getDefault());
            } else {
                track = null;
            }
            if (((ym6) sx5Var.getValue()).j && track != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            do {
                value = sx5Var.getValue();
                ym6Var = (ym6) value;
                if (z2) {
                    track2 = track;
                } else {
                    track2 = null;
                }
            } while (!sx5Var.j(value, ym6.a(ym6Var, null, null, null, null, null, null, null, false, 0.0f, false, track2, null, null, null, null, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -1025, 15)));
            hb1 hb1Var = (hb1) vy1Var.P0();
            hb1Var.getClass();
            gb1 gb1Var = new gb1(hb1Var);
            gb1Var.m(3, !z2);
            gb1Var.l(z2);
            hh6 b = gb1Var.b();
            vy1Var.L(b);
            ei0Var.L(b);
            ei0Var.Y(z);
            return;
        }
        ze0.m("Disconnect Cast before playing an offline episode.");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01cd  */
    /* JADX WARN: Type inference failed for: r8v30, types: [st3, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(com.anistation.model.watch.SourcesResponse r62, com.anistation.model.Episode r63, java.lang.Long r64, boolean r65, boolean r66) {
        /*
            Method dump skipped, instructions count: 1388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v27.C(com.anistation.model.watch.SourcesResponse, com.anistation.model.Episode, java.lang.Long, boolean, boolean):void");
    }

    public final void D() {
        ar3 ar3Var;
        Object value;
        Uri uri;
        t17 t17Var = this.K;
        if (t17Var == null || (ar3Var = this.E) == null) {
            return;
        }
        long j = j();
        boolean z = this.S;
        this.R = true;
        bx5 bx5Var = this.O;
        if (bx5Var != null) {
            bx5Var.l(null);
        }
        this.O = null;
        this.j.a();
        ci0 ci0Var = this.j;
        String str = ((ym6) this.n.getValue()).o;
        ci0Var.getClass();
        str.getClass();
        vq3 vq3Var = ar3Var.b;
        if (vq3Var != null && (uri = vq3Var.a) != null) {
            List<String> pathSegments = uri.getPathSegments();
            pathSegments.getClass();
            String str2 = (String) yo0.n0(1, pathSegments);
            if (str2 != null) {
                bi0 bi0Var = (bi0) ci0Var.B.get(str2);
                if (bi0Var != null) {
                    bi0Var.h = str;
                }
                nq3 a = ar3Var.a();
                a.e = uri.buildUpon().clearQuery().appendQueryParameter("load", UUID.randomUUID().toString()).build();
                ar3Var = a.a();
            }
        }
        this.E = ar3Var;
        long j2 = this.M + 1;
        this.M = j2;
        this.K = t17.a(t17Var, j2);
        this.f0 = null;
        this.e0 = null;
        this.F = true;
        this.G = z;
        this.H = j;
        this.I = 0L;
        this.C = j;
        this.l.m(ar3Var, j);
        this.l.a();
        this.l.Y(z);
        sx5 sx5Var = this.o;
        do {
            value = sx5Var.getValue();
        } while (!sx5Var.j(value, dq4.a((dq4) value, false, false, false, j, 0L, null, false, null, true, false, null, 1783)));
        g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
    
        if (r4 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 == 0) goto Lc
            boolean r0 = defpackage.uz5.V(r4)
            if (r0 != 0) goto L9
            goto La
        L9:
            r4 = 0
        La:
            if (r4 != 0) goto L1d
        Lc:
            sx5 r4 = r3.n
            java.lang.Object r4 = r4.getValue()
            ym6 r4 = (defpackage.ym6) r4
            boolean r4 = r4.h
            if (r4 == 0) goto L1b
            java.lang.String r4 = "en"
            goto L1d
        L1b:
            java.lang.String r4 = "ja"
        L1d:
            ei0 r0 = r3.l
            ko4 r1 = r0.a
            hh6 r1 = r1.P0()
            gh6 r1 = r1.a()
            r2 = 1
            gh6 r1 = r1.d(r2)
            gh6 r1 = r1.h(r4)
            hh6 r1 = r1.b()
            r0.L(r1)
            vy1 r3 = r3.k
            hh6 r0 = r3.P0()
            hb1 r0 = (defpackage.hb1) r0
            r0.getClass()
            gb1 r1 = new gb1
            r1.<init>(r0)
            r1.d(r2)
            r1.h(r4)
            hh6 r4 = r1.b()
            r3.L(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v27.E(java.lang.String):void");
    }

    public final zw F(List list) {
        String str;
        sv svVar;
        String str2 = ((ym6) this.n.getValue()).o;
        tv tvVar = this.T;
        tvVar.getClass();
        str2.getClass();
        zw Q = h98.Q(str2, list);
        if (Q == null) {
            svVar = null;
        } else {
            if (h98.q(str2, list) == null && !a34.i(tvVar.x, str2)) {
                tvVar.x = str2;
                str = h98.U(str2) + " language is unavailable. Switched to " + Q.b + ".";
            } else {
                str = null;
            }
            svVar = new sv(Q, str);
        }
        if (svVar == null) {
            return null;
        }
        String str3 = svVar.b;
        if (str3 != null) {
            this.p.i(new s17(str3));
        }
        return svVar.a;
    }

    public final long G(int i, Long l) {
        Long y = y(Integer.valueOf(i));
        if (y != null) {
            return y.longValue();
        }
        if (l != null) {
            return l.longValue();
        }
        return this.C;
    }

    public final void H(t17 t17Var, long j) {
        tl7.z(zz.J(this), null, null, new t64(this, t17Var, j, (vz0) null), 3);
    }

    public final boolean I(yx1 yx1Var) {
        Long l;
        Object obj;
        ym6 ym6Var = (ym6) this.n.getValue();
        String str = this.W;
        if (str != null && (l = this.X) != null) {
            long longValue = l.longValue();
            Episode episode = ym6Var.b;
            if (episode != null && !ym6Var.z && longValue == this.c0) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                LinkedHashSet linkedHashSet = this.U;
                if (!linkedHashSet.add(lowerCase)) {
                    return true;
                }
                this.W = null;
                this.X = null;
                Iterator it = i().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        String lowerCase2 = ((Provider) obj).getId().toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        if (!linkedHashSet.contains(lowerCase2)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Provider provider = (Provider) obj;
                if (provider != null) {
                    tl7.z(zz.J(this), null, null, new l27(longValue, this, yx1Var, str, provider, episode, j(), null), 3);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J() {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v27.J():void");
    }

    public final void K(long j) {
        long j2;
        long j3;
        Integer num;
        Object value;
        Integer num2;
        Object value2;
        ei0 ei0Var = this.l;
        ko4 ko4Var = ei0Var.a;
        ko4 ko4Var2 = ei0Var.a;
        long duration = ko4Var.getDuration();
        Long valueOf = Long.valueOf(duration);
        t17 t17Var = null;
        if (duration <= 0) {
            valueOf = null;
        }
        sx5 sx5Var = this.o;
        if (valueOf != null) {
            j2 = valueOf.longValue();
        } else {
            j2 = ((dq4) sx5Var.getValue()).e;
        }
        long j4 = j2;
        if (j4 > 0) {
            j3 = db.D(j, 0L, j4);
        } else if (j < 0) {
            j3 = 0;
        } else {
            j3 = j;
        }
        long j5 = j3;
        ar3 ar3Var = this.E;
        if (ko4Var2.getDeviceInfo().a && ar3Var != null) {
            boolean n = ko4Var2.n();
            this.F = true;
            this.G = n;
            this.H = j5;
            this.I = 0L;
            this.C = j5;
            do {
                value2 = sx5Var.getValue();
            } while (!sx5Var.j(value2, dq4.a((dq4) value2, false, false, false, j5, 0L, null, false, null, true, false, null, 1783)));
            ei0Var.m(ar3Var, j5);
            ei0Var.a();
            ei0Var.Y(n);
            t17 t17Var2 = this.K;
            if (t17Var2 != null) {
                long j6 = this.M + 1;
                this.M = j6;
                t17Var = t17.a(t17Var2, j6);
            }
            this.K = t17Var;
            g();
        } else {
            Episode episode = ((ym6) this.n.getValue()).b;
            if (episode != null) {
                num = Integer.valueOf(episode.getNumber());
            } else {
                num = null;
            }
            if ((ko4Var2.h0() != 3 || ko4Var2.P() == 0) && num != null) {
                this.D = new vk4(num.intValue(), j5);
            } else {
                vk4 vk4Var = this.D;
                if (vk4Var != null) {
                    num2 = Integer.valueOf(vk4Var.a);
                } else {
                    num2 = null;
                }
                if (a34.i(num2, num)) {
                    this.D = null;
                }
            }
            this.C = j5;
            do {
                value = sx5Var.getValue();
            } while (!sx5Var.j(value, dq4.a((dq4) value, false, false, false, j5, 0L, null, false, null, false, false, null, 2039)));
            ei0Var.Q(j5);
        }
        T(Long.valueOf(j5));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(defpackage.xz0 r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.p27
            if (r0 == 0) goto L13
            r0 = r14
            p27 r0 = (defpackage.p27) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            p27 r0 = new p27
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.y
            int r1 = r0.A
            pn6 r2 = defpackage.pn6.a
            r3 = 2
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2c
            defpackage.m37.N(r14)
            return r2
        L2c:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r13)
            r13 = 0
            return r13
        L33:
            int r1 = r0.x
            defpackage.m37.N(r14)
            goto L90
        L39:
            defpackage.m37.N(r14)
            sx5 r14 = r13.n
            java.lang.Object r1 = r14.getValue()
            ym6 r1 = (defpackage.ym6) r1
            com.anistation.model.watch.WatchSession r1 = r1.a
            if (r1 == 0) goto La2
            int r6 = r1.getAnilistId()
            java.lang.Integer r11 = r1.getMalId()
            java.lang.String r1 = r1.getAnistationId()
            if (r1 != 0) goto L5a
            java.lang.String r1 = java.lang.String.valueOf(r6)
        L5a:
            r12 = r1
            java.lang.Object r14 = r14.getValue()
            ym6 r14 = (defpackage.ym6) r14
            com.anistation.model.Episode r14 = r14.b
            if (r14 == 0) goto L6b
            int r14 = r14.getNumber()
            r8 = r14
            goto L6c
        L6b:
            r8 = r4
        L6c:
            r0.x = r6
            r0.A = r4
            pn r14 = r13.c
            r9 = r14
            zn r9 = (defpackage.zn) r9
            r9.getClass()
            xn r7 = new xn
            r10 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            mx0 r14 = new mx0
            r1 = 5
            r14.<init>(r7, r1)
            ja1 r1 = defpackage.rh1.a
            j91 r1 = defpackage.j91.y
            w42 r14 = defpackage.zz.D(r14, r1)
            if (r14 != r5) goto L8f
            goto La1
        L8f:
            r1 = r6
        L90:
            w42 r14 = (defpackage.w42) r14
            q27 r4 = new q27
            r4.<init>(r13)
            r0.x = r1
            r0.A = r3
            java.lang.Object r13 = r14.collect(r4, r0)
            if (r13 != r5) goto La2
        La1:
            return r5
        La2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v27.M(xz0):java.lang.Object");
    }

    public final void N(Track track) {
        ar3 ar3Var;
        Collection collection;
        nw2 nw2Var;
        String str;
        ar3 ar3Var2 = this.E;
        if (ar3Var2 != null) {
            vq3 vq3Var = ar3Var2.b;
            if (vq3Var != null && (nw2Var = vq3Var.g) != null) {
                collection = new ArrayList(zo0.V(nw2Var, 10));
                int size = nw2Var.size();
                int i = 0;
                while (i < size) {
                    Object obj = nw2Var.get(i);
                    i++;
                    zq3 zq3Var = (zq3) obj;
                    yq3 a = zq3Var.a();
                    if (track != null) {
                        str = track.getId();
                    } else {
                        str = null;
                    }
                    a.d = a34.i(str, zq3Var.g) ? 1 : 0;
                    collection.add(new zq3(a));
                }
            } else {
                collection = null;
            }
            if (collection == null) {
                collection = nt1.x;
            }
            nq3 a2 = ar3Var2.a();
            a2.i = nw2.o(collection);
            ar3Var = a2.a();
        } else {
            ar3Var = null;
        }
        this.E = ar3Var;
        this.e0 = null;
        S();
    }

    public final void O(boolean z) {
        sx5 sx5Var;
        Object value;
        do {
            sx5Var = this.o;
            value = sx5Var.getValue();
        } while (!sx5Var.j(value, dq4.a((dq4) value, z, false, false, 0L, 0L, null, false, null, false, false, null, 2046)));
    }

    public final void P(boolean z) {
        sx5 sx5Var;
        Object value;
        do {
            sx5Var = this.o;
            value = sx5Var.getValue();
        } while (!sx5Var.j(value, dq4.a((dq4) value, false, false, z, 0L, 0L, null, false, null, false, false, null, 2043)));
    }

    public final void Q(boolean z) {
        Track track;
        Object value;
        Object value2;
        tl7.z(zz.J(this), null, null, new u27(this, z, null, (byte) 3), 3);
        vy1 vy1Var = this.k;
        ei0 ei0Var = this.l;
        sx5 sx5Var = this.o;
        sx5 sx5Var2 = this.n;
        if (z) {
            List c = ((ym6) sx5Var2.getValue()).c();
            String str = ((ym6) sx5Var2.getValue()).l;
            if (((dq4) sx5Var.getValue()).j) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : c) {
                    if (r((Track) obj)) {
                        arrayList.add(obj);
                    }
                }
                c = arrayList;
            }
            Track R = h98.R(str, c);
            if (((dq4) sx5Var.getValue()).j && R == null) {
                this.p.i(new s17("Subtitles are not available for this Cast source."));
                return;
            }
            while (true) {
                Object value3 = sx5Var2.getValue();
                track = R;
                if (sx5Var2.j(value3, ym6.a((ym6) value3, null, null, null, null, null, null, null, false, 0.0f, true, R, null, null, null, null, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -1537, 15))) {
                    break;
                } else {
                    R = track;
                }
            }
            if (((dq4) sx5Var.getValue()).j) {
                N(track);
                return;
            }
            if (track != null && !((ym6) sx5Var2.getValue()).z) {
                f(track);
                return;
            }
            hh6 b = ei0Var.a.P0().a().m(3, false).l(true).b();
            ei0Var.L(b);
            vy1Var.L(b);
            return;
        }
        do {
            value = sx5Var2.getValue();
        } while (!sx5Var2.j(value, ym6.a((ym6) value, null, null, null, null, null, null, null, false, 0.0f, false, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -1537, 15)));
        do {
            value2 = sx5Var.getValue();
        } while (!sx5Var.j(value2, dq4.a((dq4) value2, false, false, false, 0L, 0L, nt1.x, false, null, false, false, null, 2015)));
        hh6 b2 = ei0Var.a.P0().a().m(3, true).d(3).b();
        ei0Var.L(b2);
        vy1Var.L(b2);
        if (((dq4) sx5Var.getValue()).j) {
            N(null);
        }
    }

    public final void R() {
        J();
        this.A = false;
        bx5 bx5Var = this.r;
        if (bx5Var != null) {
            bx5Var.l(null);
        }
        bx5 bx5Var2 = this.s;
        if (bx5Var2 != null) {
            bx5Var2.l(null);
        }
        bx5 bx5Var3 = this.t;
        if (bx5Var3 != null) {
            bx5Var3.l(null);
        }
        this.c0++;
        bx5 bx5Var4 = this.O;
        if (bx5Var4 != null) {
            bx5Var4.l(null);
        }
        this.O = null;
        this.K = null;
        this.W = null;
        this.X = null;
        ei0 ei0Var = this.l;
        ei0Var.J();
        ei0Var.stop();
        ei0Var.o();
        vy1 vy1Var = this.k;
        vy1Var.Y(false);
        vy1Var.stop();
        vy1Var.o();
        this.E = null;
        this.K = null;
        m();
        ci0 ci0Var = this.j;
        ci0Var.a();
        ci0Var.A.clear();
        ci0Var.B.clear();
        this.h.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
    
        if (r5 == null) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0386 A[LOOP:9: B:230:0x0384->B:231:0x0386, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S() {
        /*
            Method dump skipped, instructions count: 1027
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v27.S():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(java.lang.Long r21) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v27.T(java.lang.Long):void");
    }

    public final void W(rf1 rf1Var) {
        boolean z;
        gi0 gi0Var;
        s25 s25Var;
        sx5 sx5Var;
        Object value;
        dq4 dq4Var;
        boolean z2;
        if (rf1Var.a) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (!z) {
            bx5 bx5Var = this.O;
            if (bx5Var != null) {
                bx5Var.l(null);
            }
            this.O = null;
            this.Q = false;
            m();
            this.K = null;
        }
        if (z) {
            xh0 b = xh0.b(this.b);
            b.getClass();
            a34.s();
            gi0Var = b.c.c();
        } else {
            gi0Var = null;
        }
        if (gi0Var != null) {
            a34.s();
            s25Var = gi0Var.j;
        } else {
            s25Var = null;
        }
        s25 s25Var2 = this.d0;
        if (s25Var != s25Var2) {
            k27 k27Var = this.g0;
            if (s25Var2 != null) {
                s25Var2.r(k27Var);
            }
            if (s25Var != null) {
                s25Var.p(k27Var);
            }
            this.d0 = s25Var;
            this.e0 = null;
            this.f0 = null;
        }
        if (gi0Var != null) {
            a34.s();
            CastDevice castDevice = gi0Var.k;
            if (castDevice != null) {
                str = castDevice.A;
            }
        }
        String str2 = str;
        do {
            sx5Var = this.o;
            value = sx5Var.getValue();
            dq4Var = (dq4) value;
            if (z) {
                z2 = false;
            } else {
                z2 = dq4Var.c;
            }
        } while (!sx5Var.j(value, dq4.a(dq4Var, true, false, z2, 0L, 0L, null, false, null, false, z, str2, 506)));
        if (z) {
            S();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v7, types: [nt1] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    public final void X() {
        Integer num;
        ?? r4;
        Object obj;
        Object value;
        String anistationId;
        String str;
        String str2;
        sx5 sx5Var = this.n;
        ym6 ym6Var = (ym6) sx5Var.getValue();
        WatchSession watchSession = ym6Var.a;
        if (watchSession != null) {
            Episode episode = ym6Var.b;
            EpisodeDownload episodeDownload = null;
            if (episode != null) {
                num = Integer.valueOf(episode.getNumber());
            } else {
                num = null;
            }
            String offlineSourceType = watchSession.getOfflineSourceType();
            if (offlineSourceType == null) {
                if (ym6Var.h) {
                    offlineSourceType = "dub";
                } else {
                    offlineSourceType = "sub";
                }
            }
            String offlineAudioTrackKey = watchSession.getOfflineAudioTrackKey();
            if (offlineAudioTrackKey == null) {
                zw f = ym6Var.f();
                if (f != null) {
                    str = f.c;
                } else {
                    str = null;
                }
                zw f2 = ym6Var.f();
                if (f2 != null) {
                    str2 = f2.b;
                } else {
                    str2 = null;
                }
                offlineAudioTrackKey = OfflineDownloadMetadataKt.resolveAudioTrackKey(str, str2, offlineSourceType);
            }
            if (num != null) {
                int intValue = num.intValue();
                List list = this.B;
                r4 = new ArrayList();
                for (Object obj2 : list) {
                    EpisodeDownload episodeDownload2 = (EpisodeDownload) obj2;
                    if (!a34.i(episodeDownload2.getMetadata().getAnimeId(), watchSession.getAnimeId())) {
                        if (watchSession.getAnilistId() > 0 && ((anistationId = episodeDownload2.getMetadata().getAnistationId()) == null || uz5.V(anistationId))) {
                            if (episodeDownload2.getMetadata().getAnilistId() == watchSession.getAnilistId()) {
                            }
                        }
                    }
                    if (episodeDownload2.getMetadata().getEpisodeNumber() == intValue && a34.i(OfflineDownloadMetadataKt.getAudioTrackKey(episodeDownload2.getMetadata()), offlineAudioTrackKey)) {
                        r4.add(obj2);
                    }
                }
            } else {
                r4 = 0;
            }
            if (r4 == 0) {
                r4 = nt1.x;
            }
            Iterator it = r4.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((EpisodeDownload) obj).getMetadata().getStorageType() == DownloadStorageType.INTERNAL) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            EpisodeDownload episodeDownload3 = (EpisodeDownload) obj;
            Iterator it2 = r4.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ?? next = it2.next();
                if (((EpisodeDownload) next).getMetadata().getStorageType() == DownloadStorageType.EXTERNAL) {
                    episodeDownload = next;
                    break;
                }
            }
            EpisodeDownload episodeDownload4 = episodeDownload;
            do {
                value = sx5Var.getValue();
            } while (!sx5Var.j(value, ym6.a((ym6) value, null, null, null, null, null, null, null, false, 0.0f, false, null, null, null, null, null, false, false, false, null, null, null, null, null, episodeDownload3, episodeDownload4, false, false, false, null, false, false, false, false, false, false, false, -25165825, 15)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y(java.lang.Long r19) {
        /*
            r18 = this;
            r0 = r18
        L2:
            sx5 r1 = r0.o
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            dq4 r3 = (defpackage.dq4) r3
            long r4 = r3.e
            r6 = 0
            if (r19 == 0) goto L25
            long r8 = r19.longValue()
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 <= 0) goto L1c
            r8 = r19
            goto L1d
        L1c:
            r8 = 0
        L1d:
            if (r8 == 0) goto L25
            long r4 = r8.longValue()
        L23:
            r9 = r4
            goto L2a
        L25:
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L23
            r9 = r6
        L2a:
            long r4 = r3.e
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 != 0) goto L31
            goto L43
        L31:
            r16 = 0
            r17 = 2031(0x7ef, float:2.846E-42)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            dq4 r3 = defpackage.dq4.a(r3, r4, r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17)
        L43:
            boolean r1 = r1.j(r2, r3)
            if (r1 == 0) goto L2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v27.Y(java.lang.Long):void");
    }

    public final void Z(String str) {
        tl7.z(zz.J(this), null, null, new t27(this, str, null, (byte) 0), 3);
    }

    public final void a0(String str) {
        tl7.z(zz.J(this), null, null, new t27(this, str, null, (byte) 3), 3);
    }

    @Override // defpackage.vv6
    public final void d() {
        J();
        bx5 bx5Var = this.r;
        if (bx5Var != null) {
            bx5Var.l(null);
        }
        bx5 bx5Var2 = this.s;
        if (bx5Var2 != null) {
            bx5Var2.l(null);
        }
        this.l.w0(this.h0);
        bx5 bx5Var3 = this.O;
        if (bx5Var3 != null) {
            bx5Var3.l(null);
        }
        s25 s25Var = this.d0;
        if (s25Var != null) {
            s25Var.r(this.g0);
        }
        ft3 ft3Var = this.m;
        ft3Var.getClass();
        try {
            synchronized (ft3.c) {
                ft3.d.remove(ft3Var.a.i);
            }
            ft3Var.a.p();
        } catch (Exception unused) {
        }
        this.l.release();
        this.k.release();
        this.j.close();
        this.h.a();
    }

    public final void e(zw zwVar) {
        Integer num = zwVar.e;
        if (num != null) {
            int intValue = num.intValue();
            Integer num2 = zwVar.f;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                ei0 ei0Var = this.l;
                nw2 nw2Var = ei0Var.a.j0().a;
                nw2Var.getClass();
                ph6 ph6Var = (ph6) yo0.n0(intValue, nw2Var);
                if (ph6Var != null) {
                    String str = null;
                    if (ph6Var.b.c != 1 || intValue2 < 0 || intValue2 >= ph6Var.a) {
                        ph6Var = null;
                    }
                    if (ph6Var != null) {
                        gh6 g = ei0Var.a.P0().a().m(1, false).d(1).g(new dh6(ph6Var.b, intValue2));
                        String str2 = zwVar.c;
                        if (str2 != null) {
                            if (!uz5.V(str2)) {
                                str = str2;
                            }
                            if (str != null) {
                                g.h(str);
                            }
                        }
                        hh6 b = g.b();
                        ei0Var.L(b);
                        if (!((dq4) this.o.getValue()).j) {
                            this.k.L(b);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.Iterator] */
    public final void f(Track track) {
        List list;
        List list2;
        String str;
        if (!((dq4) this.o.getValue()).j) {
            vy1 vy1Var = this.k;
            nw2 nw2Var = vy1Var.j0().a;
            nw2Var.getClass();
            ArrayList arrayList = new ArrayList();
            int size = nw2Var.size();
            int i = 0;
            while (i < size) {
                Object obj = nw2Var.get(i);
                i++;
                if (((ph6) obj).b.c == 3) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            int size2 = arrayList.size();
            ph6 ph6Var = null;
            int i2 = -1;
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                ph6 ph6Var2 = (ph6) obj2;
                int i4 = ph6Var2.a;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        break;
                    }
                    ea2 a = ph6Var2.a(i5);
                    a.getClass();
                    if (!uz5.V(track.getId()) && a34.i(a.a, track.getId())) {
                        ph6Var = ph6Var2;
                        i2 = i5;
                        break;
                    }
                    i5++;
                }
                if (ph6Var != null) {
                    break;
                }
            }
            if (ph6Var == null) {
                int size3 = arrayList.size();
                int i6 = 0;
                while (i6 < size3) {
                    Object obj3 = arrayList.get(i6);
                    i6++;
                    ph6 ph6Var3 = (ph6) obj3;
                    int i7 = ph6Var3.a;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i7) {
                            break;
                        }
                        ea2 a2 = ph6Var3.a(i8);
                        a2.getClass();
                        String label = track.getLabel();
                        if (label != null && !uz5.V(label) && (str = a2.b) != null && str.equalsIgnoreCase(track.getLabel())) {
                            ph6Var = ph6Var3;
                            i2 = i8;
                            break;
                        }
                        i8++;
                    }
                    if (ph6Var != null) {
                        break;
                    }
                }
            }
            List list3 = nt1.x;
            sx5 sx5Var = this.n;
            if (ph6Var == null) {
                SourcesResponse sourcesResponse = ((ym6) sx5Var.getValue()).d;
                if (sourcesResponse != null) {
                    list2 = sourcesResponse.getTracks();
                } else {
                    list2 = null;
                }
                if (list2 == null) {
                    list2 = list3;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list2) {
                    Track track2 = (Track) obj4;
                    String lang = track.getLang();
                    if (lang != null && !uz5.V(lang) && !a34.i(track.getLang(), "und") && b06.C(track2.getLang(), track.getLang(), true)) {
                        arrayList2.add(obj4);
                    }
                }
                if (arrayList2.size() == 1) {
                    int size4 = arrayList.size();
                    int i9 = 0;
                    while (i9 < size4) {
                        Object obj5 = arrayList.get(i9);
                        i9++;
                        ph6 ph6Var4 = (ph6) obj5;
                        int i10 = ph6Var4.a;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= i10) {
                                break;
                            }
                            ea2 a3 = ph6Var4.a(i11);
                            a3.getClass();
                            String str2 = a3.d;
                            if (str2 != null && str2.equalsIgnoreCase(track.getLang())) {
                                ph6Var = ph6Var4;
                                i2 = i11;
                                break;
                            }
                            i11++;
                        }
                        if (ph6Var != null) {
                            break;
                        }
                    }
                }
            }
            if (ph6Var == null) {
                SourcesResponse sourcesResponse2 = ((ym6) sx5Var.getValue()).d;
                if (sourcesResponse2 != null) {
                    list = sourcesResponse2.getTracks();
                } else {
                    list = null;
                }
                if (list != null) {
                    list3 = list;
                }
                Iterator it = list3.iterator();
                int i12 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (a34.i(((Track) it.next()).getId(), track.getId())) {
                            break;
                        } else {
                            i12++;
                        }
                    } else {
                        i12 = -1;
                        break;
                    }
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    ph6Var = (ph6) arrayList.get(i12);
                    i2 = 0;
                }
            }
            if (ph6Var != null) {
                hb1 hb1Var = (hb1) vy1Var.P0();
                hb1Var.getClass();
                gb1 gb1Var = new gb1(hb1Var);
                gb1Var.m(3, false);
                gb1Var.d(3);
                gb1Var.g(new dh6(ph6Var.b, i2));
                vy1Var.L(gb1Var.b());
                return;
            }
            hb1 hb1Var2 = (hb1) vy1Var.P0();
            hb1Var2.getClass();
            gb1 gb1Var2 = new gb1(hb1Var2);
            gb1Var2.m(3, false);
            gb1Var2.l(true);
            gb1Var2.d(3);
            String lang2 = track.getLang();
            if (lang2 != null && !uz5.V(lang2) && !a34.i(track.getLang(), "und")) {
                gb1Var2.j(track.getLang());
            }
            vy1Var.L(gb1Var2.b());
        }
    }

    public final void g() {
        t17 t17Var = this.K;
        if (t17Var != null) {
            bx5 bx5Var = this.O;
            if (bx5Var != null && bx5Var.isActive() && a34.i(this.P, t17Var)) {
                return;
            }
            bx5 bx5Var2 = this.O;
            vz0 vz0Var = null;
            if (bx5Var2 != null) {
                bx5Var2.l(null);
            }
            this.P = t17Var;
            this.O = tl7.z(zz.J(this), null, null, new vj6(this, t17Var, vz0Var, (byte) 6), 3);
        }
    }

    public final String h(Set set) {
        Object next;
        Provider provider;
        List i = i();
        LinkedHashSet X = el5.X(this.L, set);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = X.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            linkedHashSet.add(lowerCase);
        }
        ArrayList arrayList = new ArrayList();
        yp1 yp1Var = new yp1(i.iterator());
        while (yp1Var.y.hasNext()) {
            Object next2 = yp1Var.next();
            Provider provider2 = (Provider) ((xx2) next2).b;
            if (provider2.getCastCompatible()) {
                String lowerCase2 = provider2.getId().toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                if (!linkedHashSet.contains(lowerCase2)) {
                    arrayList.add(next2);
                }
            }
        }
        xq0 r = jf7.r(new ui((byte) 27), new ui((byte) 28), new ui((byte) 29));
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            while (it2.hasNext()) {
                Object next3 = it2.next();
                if (r.compare(next, next3) > 0) {
                    next = next3;
                }
            }
        }
        xx2 xx2Var = (xx2) next;
        if (xx2Var == null || (provider = (Provider) xx2Var.b) == null) {
            return null;
        }
        return provider.getId();
    }

    public final List i() {
        ym6 ym6Var = (ym6) this.n.getValue();
        boolean z = ym6Var.h;
        Server server = ym6Var.v;
        List<Provider> list = null;
        if (z) {
            if (server != null) {
                list = server.getDub();
            }
        } else if (server != null) {
            list = server.getSub();
        }
        if (list == null) {
            return nt1.x;
        }
        return list;
    }

    public final long j() {
        Integer num;
        ei0 ei0Var = this.l;
        long Z0 = ei0Var.a.Z0();
        if (Z0 < 0) {
            Z0 = 0;
        }
        long j = ((dq4) this.o.getValue()).d;
        if (j < 0) {
            j = 0;
        }
        Episode episode = ((ym6) this.n.getValue()).b;
        if (episode != null) {
            num = Integer.valueOf(episode.getNumber());
        } else {
            num = null;
        }
        Long y = y(num);
        long j2 = this.H;
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        if (y != null) {
            return y.longValue();
        }
        if (ei0Var.a.h0() == 1) {
            long j3 = this.C;
            if (j3 > 0) {
                return j3;
            }
        }
        if (Z0 <= 0) {
            long j4 = this.C;
            if (j4 > 0) {
                return j4;
            }
            if (j > 0) {
                return j;
            }
        }
        return Z0;
    }

    public final ar3 k(Source source, SourcesResponse sourcesResponse, Episode episode, String str) {
        Resource.Success success;
        Info info;
        Title title;
        String str2;
        String str3;
        CoverImage coverImage;
        List<Track> tracks = sourcesResponse.getTracks();
        if (tracks == null) {
            tracks = nt1.x;
        }
        ArrayList arrayList = new ArrayList(zo0.V(tracks, 10));
        for (Track track : tracks) {
            arrayList.add(V(track, a34.i(track.getId(), str)));
        }
        sx5 sx5Var = this.n;
        Resource resource = ((ym6) sx5Var.getValue()).u;
        Uri uri = null;
        if (resource instanceof Resource.Success) {
            success = (Resource.Success) resource;
        } else {
            success = null;
        }
        if (success != null) {
            info = (Info) success.getData();
        } else {
            info = null;
        }
        String image = episode.getImage();
        if (image == null) {
            if (info != null && (coverImage = info.getCoverImage()) != null) {
                image = coverImage.getExtraLarge();
            } else {
                image = null;
            }
        }
        if (info != null) {
            title = info.getTitle();
        } else {
            title = null;
        }
        String b = e02.b(title);
        String title2 = episode.getTitle();
        if (title2 == null) {
            title2 = qx1.h(episode.getNumber(), "Episode ");
        }
        nq3 nq3Var = new nq3();
        nq3Var.c(source.getUrl());
        WatchSession watchSession = ((ym6) sx5Var.getValue()).a;
        if (watchSession == null || (str2 = watchSession.getAnimeId()) == null) {
            str2 = "unknown";
        }
        nq3Var.b = str2 + ":" + episode.getNumber();
        if (s(source)) {
            str3 = "application/x-mpegURL";
        } else if (t(source)) {
            str3 = "video/mp4";
        } else {
            str3 = "video/x-unknown";
        }
        nq3Var.c = str3;
        hr3 hr3Var = new hr3();
        hr3Var.a = title2;
        hr3Var.e = title2;
        hr3Var.f = b;
        hr3Var.b = b;
        hr3Var.c = b;
        hr3Var.o = Integer.valueOf(episode.getNumber());
        hr3Var.I = 9;
        if (image != null) {
            uri = Uri.parse(image);
            uri.getClass();
        }
        hr3Var.n = uri;
        nq3Var.k = new jr3(hr3Var);
        nq3Var.i = nw2.o(arrayList);
        return nq3Var.a();
    }

    public final String l(String str) {
        Object obj;
        boolean z;
        List i = i();
        str.getClass();
        Iterator it = i.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (b06.C(((Provider) obj).getId(), str, true)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Provider provider = (Provider) obj;
        if (provider == null) {
            z = false;
        } else {
            z = !provider.getCastCompatible();
        }
        if (!z) {
            return null;
        }
        return h(te4.O(str));
    }

    public final void m() {
        this.F = false;
        this.G = false;
        this.H = -9223372036854775807L;
        this.I = 0L;
    }

    public final bx3 n() {
        s25 s25Var;
        bx3 e;
        MediaInfo mediaInfo;
        ar3 ar3Var;
        vq3 vq3Var;
        Uri uri;
        String uri2;
        if (this.K == null || (s25Var = this.d0) == null || (e = s25Var.e()) == null || (mediaInfo = e.x) == null || (ar3Var = this.E) == null || (vq3Var = ar3Var.b) == null || (uri = vq3Var.a) == null || (uri2 = uri.toString()) == null) {
            return null;
        }
        if (!mediaInfo.c().equals(uri2) && !a34.i(mediaInfo.L, uri2)) {
            return null;
        }
        return e;
    }

    public final void o(int i, boolean z) {
        v17 v17Var = new v17(i, z);
        if (v17Var.equals(this.J)) {
            return;
        }
        this.J = v17Var;
        this.L.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        r3 = r2.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bb, code lost:
    
        if (r2.j(r3, defpackage.ym6.a((defpackage.ym6) r3, null, null, null, null, null, null, null, defpackage.a34.i(r1.d, "dub"), 0.0f, false, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -129, 15)) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bd, code lost:
    
        r3 = (defpackage.ym6) r2.getValue();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r44v0, types: [v27] */
    /* JADX WARN: Type inference failed for: r7v0, types: [nt1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(boolean r45, defpackage.xz0 r46) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v27.p(boolean, xz0):java.lang.Object");
    }

    public final void q(boolean z) {
        MediaInfo mediaInfo;
        bx3 e;
        t17 t17Var = this.K;
        if (t17Var != null && ((dq4) this.o.getValue()).j && t17Var.c == this.c0 && this.E != null) {
            if (!z) {
                s25 s25Var = this.d0;
                if (s25Var != null && (e = s25Var.e()) != null) {
                    mediaInfo = e.x;
                } else {
                    mediaInfo = null;
                }
                if (mediaInfo != null && n() == null) {
                    return;
                }
            }
            if (this.Q && !this.R) {
                D();
            } else {
                H(t17Var, j());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e9 A[LOOP:4: B:79:0x01dc->B:89:0x02e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0286 A[EDGE_INSN: B:90:0x0286->B:91:0x0286 BREAK  A[LOOP:4: B:79:0x01dc->B:89:0x02e9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(int r60, java.lang.Long r61, boolean r62, java.lang.Boolean r63, boolean r64, boolean r65) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v27.v(int, java.lang.Long, boolean, java.lang.Boolean, boolean, boolean):void");
    }

    public final void x(String str, String str2) {
        this.p.i(new s17(str + " isn't compatible with Cast. Switched to " + str2 + "."));
    }

    public final Long y(Integer num) {
        vk4 vk4Var = this.D;
        if (vk4Var != null) {
            int i = vk4Var.a;
            if (num == null || i != num.intValue()) {
                vk4Var = null;
            }
            if (vk4Var != null) {
                return Long.valueOf(vk4Var.b);
            }
        }
        return null;
    }

    public final void z() {
        Resource.Success success;
        List list;
        sx5 sx5Var;
        Object value;
        ei0 ei0Var = this.l;
        if (ei0Var.a.l0()) {
            ei0Var.stop();
            do {
                sx5Var = this.o;
                value = sx5Var.getValue();
            } while (!sx5Var.j(value, dq4.a((dq4) value, true, false, false, 0L, 0L, null, false, null, false, false, null, 2046)));
        }
        ym6 ym6Var = (ym6) this.n.getValue();
        Episode episode = ym6Var.b;
        if (episode != null) {
            int number = episode.getNumber();
            Resource resource = ym6Var.t;
            Episode episode2 = null;
            Object obj = null;
            episode2 = null;
            if (resource instanceof Resource.Success) {
                success = (Resource.Success) resource;
            } else {
                success = null;
            }
            if (success != null && (list = (List) success.getData()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((Episode) obj2).getNumber() > number) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    obj = it.next();
                    if (it.hasNext()) {
                        int number2 = ((Episode) obj).getNumber();
                        do {
                            Object next = it.next();
                            int number3 = ((Episode) next).getNumber();
                            if (number2 > number3) {
                                obj = next;
                                number2 = number3;
                            }
                        } while (it.hasNext());
                    }
                }
                episode2 = (Episode) obj;
            }
            if (episode2 != null) {
                u(this, episode2.getNumber());
            }
        }
    }
}
