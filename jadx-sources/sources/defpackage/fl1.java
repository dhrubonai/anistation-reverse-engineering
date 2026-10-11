package defpackage;

import android.content.Context;
import android.content.Intent;
import com.anistation.download.data.model.DownloadRequest;
import com.anistation.download.service.ExternalDownloadService;
import com.anistation.download.service.InternalDownloadService;
import com.anistation.model.download.DownloadStorageUsage;
import com.anistation.model.download.EpisodeDownload;
import com.anistation.model.download.EpisodeDownloadState;
import com.anistation.model.download.OfflineDownloadMetadata;
import com.anistation.model.download.OfflineDownloadMetadataKt;
import com.anistation.model.download.external.ExternalDownloadRecord;
import com.anistation.model.watch.Source;
import com.anistation.model.watch.Track;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fl1 implements qk1 {
    public final Context a;
    public final wc4 b;
    public final i02 c;
    public final x02 d;
    public final ml1 e;
    public final rs f;
    public final rs g;
    public final ke0 h;
    public final sx5 i;
    public final vy4 j;
    public final vy4 k;
    public final sx5 l;
    public final vy4 m;

    public fl1(ok1 ok1Var, Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        applicationContext.getClass();
        wc4 w = wc4.g.w(ok1Var, applicationContext);
        this.b = w;
        this.c = i02.d.M(applicationContext);
        this.d = new x02(applicationContext);
        ml1 j = ml1.d.j(ok1Var, applicationContext);
        this.e = j;
        jd4 jd4Var = w.c;
        this.f = new rs(applicationContext, jd4Var, (byte) 1);
        this.g = new rs(applicationContext, jd4Var, (byte) 0);
        ke0 b = db.b(tl7.L(iv5.a(), rh1.a));
        this.h = b;
        sx5 a = tx5.a(nt1.x);
        this.i = a;
        this.j = h41.d(a);
        this.k = j.b;
        sx5 a2 = tx5.a(new DownloadStorageUsage(0L, 0L, 0L, 7, null));
        this.l = a2;
        this.m = h41.d(a2);
        w.f.d.add(new bl1(this));
        m();
        int i = ExternalDownloadService.R;
        te4.N(applicationContext);
        vz0 vz0Var = null;
        tl7.z(b, null, null, new sk1(this, vz0Var, (byte) 0), 3);
        tl7.z(b, null, null, new q8(this, vz0Var, (byte) 5), 3);
    }

    public static ArrayList f(DownloadRequest downloadRequest, String str) {
        List j = j(downloadRequest, str);
        ArrayList arrayList = new ArrayList(zo0.V(j, 10));
        Iterator it = j.iterator();
        while (it.hasNext()) {
            arrayList.add("external:" + ((String) it.next()));
        }
        return arrayList;
    }

    public static List i(String str, int i, String str2, int i2, String str3) {
        String str4;
        Integer valueOf = Integer.valueOf(i);
        if (i <= 0) {
            valueOf = null;
        }
        if (valueOf == null || (str4 = String.valueOf(valueOf.intValue())) == null || str4.equals(str)) {
            str4 = null;
        }
        ArrayList H0 = ms.H0(new String[]{str, str4});
        ArrayList arrayList = new ArrayList();
        int size = H0.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = H0.get(i3);
            i3++;
            String str5 = (String) obj;
            ai3 y = te4.y();
            y.add(h41.x(str5, i2, str2, str3));
            if (str3 == null || str3.equals(OfflineDownloadMetadataKt.resolveAudioTrackKey(null, null, str2))) {
                y.add(h41.x(str5, i2, str2, null));
            }
            dp0.Y(te4.r(y), arrayList);
        }
        return yo0.I0(yo0.M0(arrayList));
    }

    public static List j(DownloadRequest downloadRequest, String str) {
        return i(downloadRequest.getSession().getAnimeId(), downloadRequest.getSession().getAnilistId(), downloadRequest.getSourceType(), downloadRequest.getEpisode().getNumber(), str);
    }

    public static boolean k(OfflineDownloadMetadata offlineDownloadMetadata, String str, int i) {
        if (!a34.i(offlineDownloadMetadata.getAnimeId(), str)) {
            if (i > 0) {
                String anistationId = offlineDownloadMetadata.getAnistationId();
                if ((anistationId != null && !uz5.V(anistationId)) || offlineDownloadMetadata.getAnilistId() != i) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static Track r(List list) {
        Track track;
        Object obj;
        Object obj2;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((Track) obj2).getDefault()) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            Track track2 = (Track) obj2;
            if (track2 != null) {
                return track2;
            }
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (b06.C(((Track) obj).getLang(), "en", true)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            track = (Track) obj;
        } else {
            track = null;
        }
        if (track == null) {
            if (list == null) {
                return null;
            }
            return (Track) yo0.m0(list);
        }
        return track;
    }

    public static EpisodeDownload t(cj1 cj1Var, boolean z) {
        EpisodeDownloadState episodeDownloadState;
        int i;
        x53 x53Var = jk1.a;
        byte[] bArr = cj1Var.a.D;
        bArr.getClass();
        OfflineDownloadMetadata a = jk1.a(bArr);
        if (a == null) {
            return null;
        }
        String str = cj1Var.a.x;
        str.getClass();
        int i2 = cj1Var.b;
        boolean z2 = true;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                if (i2 != 7) {
                                    episodeDownloadState = EpisodeDownloadState.FAILED;
                                } else {
                                    episodeDownloadState = EpisodeDownloadState.RESTARTING;
                                }
                            } else {
                                episodeDownloadState = EpisodeDownloadState.REMOVING;
                            }
                        } else {
                            episodeDownloadState = EpisodeDownloadState.FAILED;
                        }
                    } else {
                        episodeDownloadState = EpisodeDownloadState.COMPLETED;
                    }
                } else {
                    episodeDownloadState = EpisodeDownloadState.DOWNLOADING;
                }
            } else {
                episodeDownloadState = EpisodeDownloadState.STOPPED;
            }
        } else {
            episodeDownloadState = EpisodeDownloadState.QUEUED;
        }
        float f = cj1Var.h.b;
        long j = cj1Var.h.a;
        long j2 = cj1Var.e;
        int i3 = cj1Var.g;
        if (!z || cj1Var.f != 0 || ((i = cj1Var.b) != 0 && i != 7)) {
            z2 = false;
        }
        return new EpisodeDownload(str, a, episodeDownloadState, true, false, f, j, j2, i3, z2, null, null, null, 7184, null);
    }

    public static EpisodeDownload u(ExternalDownloadRecord externalDownloadRecord, boolean z) {
        boolean z2;
        String id = externalDownloadRecord.getRequest().getId();
        OfflineDownloadMetadata metadata = externalDownloadRecord.getRequest().getMetadata();
        EpisodeDownloadState state = externalDownloadRecord.getState();
        float percentDownloaded = externalDownloadRecord.getPercentDownloaded();
        long bytesDownloaded = externalDownloadRecord.getBytesDownloaded();
        long contentLength = externalDownloadRecord.getContentLength();
        int failureReason = externalDownloadRecord.getFailureReason();
        if (z && (externalDownloadRecord.getState() == EpisodeDownloadState.QUEUED || externalDownloadRecord.getState() == EpisodeDownloadState.RESTARTING)) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new EpisodeDownload(id, metadata, state, false, true, percentDownloaded, bytesDownloaded, contentLength, failureReason, z2, externalDownloadRecord.getVideoUri(), externalDownloadRecord.getSubtitleUri(), externalDownloadRecord.getFileName(), 8, null);
    }

    public static String v(Source source) {
        String type = source.getType();
        Locale locale = Locale.ROOT;
        String lowerCase = type.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = uz5.p0(source.getUrl(), '?').toLowerCase(locale);
        lowerCase2.getClass();
        if (!uz5.M(lowerCase, "mpegurl", false) && !b06.A(lowerCase2, ".m3u8", false)) {
            if (!uz5.M(lowerCase, "dash", false) && !b06.A(lowerCase2, ".mpd", false)) {
                if (!uz5.M(lowerCase, "mp4", false) && !b06.A(lowerCase2, ".mp4", false)) {
                    return source.getType();
                }
                return "video/mp4";
            }
            return "application/dash+xml";
        }
        return "application/x-mpegURL";
    }

    public static String w(String str) {
        String lowerCase = uz5.p0(str, '?').toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (!b06.A(lowerCase, ".vtt", false)) {
            if (b06.A(lowerCase, ".srt", false)) {
                return "application/x-subrip";
            }
            if (!b06.A(lowerCase, ".ass", false) && !b06.A(lowerCase, ".ssa", false)) {
                return "text/vtt";
            }
            return "text/x-ssa";
        }
        return "text/vtt";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.lj1 r5, defpackage.xz0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.tk1
            if (r0 == 0) goto L13
            r0 = r6
            tk1 r0 = (defpackage.tk1) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            tk1 r0 = new tk1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.x
            int r6 = r0.z
            r1 = 1
            if (r6 == 0) goto L2c
            if (r6 != r1) goto L25
            defpackage.m37.N(r4)
            goto L7c
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.m37.N(r4)
            r0.z = r1
            qg0 r4 = new qg0
            vz0 r6 = defpackage.wc7.z(r0)
            r4.<init>(r1, r6)
            r4.t()
            cn7 r6 = new cn7
            r6.<init>(r4)
            cn7 r0 = r5.j
            if (r0 != 0) goto L47
            goto L48
        L47:
            r1 = 0
        L48:
            defpackage.io3.B(r1)
            r5.j = r6
            int r0 = r5.c
            if (r0 == 0) goto L5e
            kj1 r6 = new kj1
            lw3 r0 = r5.b
            r0.getClass()
            r6.<init>(r0, r5)
            r5.k = r6
            goto L6a
        L5e:
            android.os.Handler r0 = r5.g
            gb r1 = new gb
            r2 = 23
            r1.<init>(r5, r6, r2)
            r0.post(r1)
        L6a:
            yd r6 = new yd
            r0 = 2
            r6.<init>(r5, r0)
            r4.v(r6)
            java.lang.Object r4 = r4.r()
            w11 r5 = defpackage.w11.x
            if (r4 != r5) goto L7c
            return r5
        L7c:
            pn6 r4 = defpackage.pn6.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl1.a(lj1, xz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r8v2, types: [qq3, pq3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r22, defpackage.xz0 r23) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl1.b(java.lang.String, xz0):java.lang.Object");
    }

    public final void c(OfflineDownloadMetadata offlineDownloadMetadata, String str) {
        Iterable iterable = (Iterable) this.j.x.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!a34.i(((EpisodeDownload) obj).getId(), str)) {
                arrayList.add(obj);
            }
        }
        int anilistId = offlineDownloadMetadata.getAnilistId();
        rs rsVar = this.g;
        int i = 0;
        if (anilistId <= 0 || !a34.i(offlineDownloadMetadata.getAnimeId(), String.valueOf(offlineDownloadMetadata.getAnilistId()))) {
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (a34.i(((EpisodeDownload) obj2).getMetadata().getAnimeId(), offlineDownloadMetadata.getAnimeId())) {
                        break;
                    }
                }
            }
            rs.b(rsVar, offlineDownloadMetadata.getAnimeId());
        }
        if (offlineDownloadMetadata.getAnilistId() > 0) {
            if (!arrayList.isEmpty()) {
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    if (((EpisodeDownload) obj3).getMetadata().getAnilistId() == offlineDownloadMetadata.getAnilistId()) {
                        return;
                    }
                }
            }
            rs.b(rsVar, String.valueOf(offlineDownloadMetadata.getAnilistId()));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:80|81|82|83|84|(1:86)|87|(2:89|(1:91)(1:161))(1:162)|92|(2:(1:95)(1:159)|96)(1:160)|97|(1:99)|(1:101)(1:158)|102|(3:104|(1:106)(1:109)|(1:108))|110|(5:(3:112|(1:114)(1:156)|(15:116|(1:(2:118|(2:121|122)(1:120))(2:154|155))|(1:126)|127|(1:129)(1:153)|130|(1:132)(1:152)|133|134|135|136|137|138|(16:141|17|18|19|(0)(0)|22|(0)|27|28|29|30|31|32|33|34|35)|140))|137|138|(0)|140)|157|127|(0)(0)|130|(0)(0)|133|134|135|136) */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0541, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0542, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x053e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x053f, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03c0 A[Catch: all -> 0x05a1, TryCatch #0 {all -> 0x05a1, blocks: (B:34:0x051f, B:253:0x058d, B:254:0x0590, B:81:0x006b, B:82:0x0248, B:84:0x0261, B:86:0x0287, B:87:0x02a0, B:89:0x02dc, B:91:0x02e2, B:92:0x02f9, B:95:0x031a, B:97:0x0339, B:99:0x03ba, B:101:0x03c0, B:102:0x03c9, B:104:0x03ec, B:108:0x03f6, B:110:0x03f9, B:112:0x03ff, B:116:0x0409, B:118:0x0414, B:124:0x0435, B:126:0x043b, B:127:0x0441, B:129:0x0455, B:130:0x0465, B:132:0x046b, B:133:0x0480, B:120:0x0428, B:164:0x007e, B:165:0x015d, B:167:0x0161, B:171:0x0168, B:175:0x016f, B:177:0x0177, B:179:0x01b0, B:181:0x01bf, B:186:0x01c4, B:189:0x01e2, B:192:0x01ea, B:194:0x01f4, B:195:0x01f6, B:197:0x01fc, B:199:0x020a, B:204:0x0591, B:205:0x0598, B:206:0x01cc, B:208:0x01d3, B:215:0x008f, B:217:0x012a, B:222:0x009f, B:226:0x00ad, B:228:0x00c3, B:230:0x00cb, B:234:0x00d8, B:236:0x00de, B:238:0x00e3, B:239:0x00ea, B:241:0x00eb, B:245:0x0599, B:246:0x05a0, B:52:0x0544, B:54:0x054c, B:55:0x0553, B:57:0x0558, B:60:0x055f, B:61:0x0569, B:40:0x056a, B:42:0x0572, B:43:0x0576, B:45:0x057b, B:48:0x0582, B:49:0x058c), top: B:7:0x0029, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ec A[Catch: all -> 0x05a1, TryCatch #0 {all -> 0x05a1, blocks: (B:34:0x051f, B:253:0x058d, B:254:0x0590, B:81:0x006b, B:82:0x0248, B:84:0x0261, B:86:0x0287, B:87:0x02a0, B:89:0x02dc, B:91:0x02e2, B:92:0x02f9, B:95:0x031a, B:97:0x0339, B:99:0x03ba, B:101:0x03c0, B:102:0x03c9, B:104:0x03ec, B:108:0x03f6, B:110:0x03f9, B:112:0x03ff, B:116:0x0409, B:118:0x0414, B:124:0x0435, B:126:0x043b, B:127:0x0441, B:129:0x0455, B:130:0x0465, B:132:0x046b, B:133:0x0480, B:120:0x0428, B:164:0x007e, B:165:0x015d, B:167:0x0161, B:171:0x0168, B:175:0x016f, B:177:0x0177, B:179:0x01b0, B:181:0x01bf, B:186:0x01c4, B:189:0x01e2, B:192:0x01ea, B:194:0x01f4, B:195:0x01f6, B:197:0x01fc, B:199:0x020a, B:204:0x0591, B:205:0x0598, B:206:0x01cc, B:208:0x01d3, B:215:0x008f, B:217:0x012a, B:222:0x009f, B:226:0x00ad, B:228:0x00c3, B:230:0x00cb, B:234:0x00d8, B:236:0x00de, B:238:0x00e3, B:239:0x00ea, B:241:0x00eb, B:245:0x0599, B:246:0x05a0, B:52:0x0544, B:54:0x054c, B:55:0x0553, B:57:0x0558, B:60:0x055f, B:61:0x0569, B:40:0x056a, B:42:0x0572, B:43:0x0576, B:45:0x057b, B:48:0x0582, B:49:0x058c), top: B:7:0x0029, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03ff A[Catch: all -> 0x05a1, TryCatch #0 {all -> 0x05a1, blocks: (B:34:0x051f, B:253:0x058d, B:254:0x0590, B:81:0x006b, B:82:0x0248, B:84:0x0261, B:86:0x0287, B:87:0x02a0, B:89:0x02dc, B:91:0x02e2, B:92:0x02f9, B:95:0x031a, B:97:0x0339, B:99:0x03ba, B:101:0x03c0, B:102:0x03c9, B:104:0x03ec, B:108:0x03f6, B:110:0x03f9, B:112:0x03ff, B:116:0x0409, B:118:0x0414, B:124:0x0435, B:126:0x043b, B:127:0x0441, B:129:0x0455, B:130:0x0465, B:132:0x046b, B:133:0x0480, B:120:0x0428, B:164:0x007e, B:165:0x015d, B:167:0x0161, B:171:0x0168, B:175:0x016f, B:177:0x0177, B:179:0x01b0, B:181:0x01bf, B:186:0x01c4, B:189:0x01e2, B:192:0x01ea, B:194:0x01f4, B:195:0x01f6, B:197:0x01fc, B:199:0x020a, B:204:0x0591, B:205:0x0598, B:206:0x01cc, B:208:0x01d3, B:215:0x008f, B:217:0x012a, B:222:0x009f, B:226:0x00ad, B:228:0x00c3, B:230:0x00cb, B:234:0x00d8, B:236:0x00de, B:238:0x00e3, B:239:0x00ea, B:241:0x00eb, B:245:0x0599, B:246:0x05a0, B:52:0x0544, B:54:0x054c, B:55:0x0553, B:57:0x0558, B:60:0x055f, B:61:0x0569, B:40:0x056a, B:42:0x0572, B:43:0x0576, B:45:0x057b, B:48:0x0582, B:49:0x058c), top: B:7:0x0029, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0455 A[Catch: all -> 0x05a1, TryCatch #0 {all -> 0x05a1, blocks: (B:34:0x051f, B:253:0x058d, B:254:0x0590, B:81:0x006b, B:82:0x0248, B:84:0x0261, B:86:0x0287, B:87:0x02a0, B:89:0x02dc, B:91:0x02e2, B:92:0x02f9, B:95:0x031a, B:97:0x0339, B:99:0x03ba, B:101:0x03c0, B:102:0x03c9, B:104:0x03ec, B:108:0x03f6, B:110:0x03f9, B:112:0x03ff, B:116:0x0409, B:118:0x0414, B:124:0x0435, B:126:0x043b, B:127:0x0441, B:129:0x0455, B:130:0x0465, B:132:0x046b, B:133:0x0480, B:120:0x0428, B:164:0x007e, B:165:0x015d, B:167:0x0161, B:171:0x0168, B:175:0x016f, B:177:0x0177, B:179:0x01b0, B:181:0x01bf, B:186:0x01c4, B:189:0x01e2, B:192:0x01ea, B:194:0x01f4, B:195:0x01f6, B:197:0x01fc, B:199:0x020a, B:204:0x0591, B:205:0x0598, B:206:0x01cc, B:208:0x01d3, B:215:0x008f, B:217:0x012a, B:222:0x009f, B:226:0x00ad, B:228:0x00c3, B:230:0x00cb, B:234:0x00d8, B:236:0x00de, B:238:0x00e3, B:239:0x00ea, B:241:0x00eb, B:245:0x0599, B:246:0x05a0, B:52:0x0544, B:54:0x054c, B:55:0x0553, B:57:0x0558, B:60:0x055f, B:61:0x0569, B:40:0x056a, B:42:0x0572, B:43:0x0576, B:45:0x057b, B:48:0x0582, B:49:0x058c), top: B:7:0x0029, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x046b A[Catch: all -> 0x05a1, TryCatch #0 {all -> 0x05a1, blocks: (B:34:0x051f, B:253:0x058d, B:254:0x0590, B:81:0x006b, B:82:0x0248, B:84:0x0261, B:86:0x0287, B:87:0x02a0, B:89:0x02dc, B:91:0x02e2, B:92:0x02f9, B:95:0x031a, B:97:0x0339, B:99:0x03ba, B:101:0x03c0, B:102:0x03c9, B:104:0x03ec, B:108:0x03f6, B:110:0x03f9, B:112:0x03ff, B:116:0x0409, B:118:0x0414, B:124:0x0435, B:126:0x043b, B:127:0x0441, B:129:0x0455, B:130:0x0465, B:132:0x046b, B:133:0x0480, B:120:0x0428, B:164:0x007e, B:165:0x015d, B:167:0x0161, B:171:0x0168, B:175:0x016f, B:177:0x0177, B:179:0x01b0, B:181:0x01bf, B:186:0x01c4, B:189:0x01e2, B:192:0x01ea, B:194:0x01f4, B:195:0x01f6, B:197:0x01fc, B:199:0x020a, B:204:0x0591, B:205:0x0598, B:206:0x01cc, B:208:0x01d3, B:215:0x008f, B:217:0x012a, B:222:0x009f, B:226:0x00ad, B:228:0x00c3, B:230:0x00cb, B:234:0x00d8, B:236:0x00de, B:238:0x00e3, B:239:0x00ea, B:241:0x00eb, B:245:0x0599, B:246:0x05a0, B:52:0x0544, B:54:0x054c, B:55:0x0553, B:57:0x0558, B:60:0x055f, B:61:0x0569, B:40:0x056a, B:42:0x0572, B:43:0x0576, B:45:0x057b, B:48:0x0582, B:49:0x058c), top: B:7:0x0029, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01b0 A[Catch: all -> 0x05a1, TryCatch #0 {all -> 0x05a1, blocks: (B:34:0x051f, B:253:0x058d, B:254:0x0590, B:81:0x006b, B:82:0x0248, B:84:0x0261, B:86:0x0287, B:87:0x02a0, B:89:0x02dc, B:91:0x02e2, B:92:0x02f9, B:95:0x031a, B:97:0x0339, B:99:0x03ba, B:101:0x03c0, B:102:0x03c9, B:104:0x03ec, B:108:0x03f6, B:110:0x03f9, B:112:0x03ff, B:116:0x0409, B:118:0x0414, B:124:0x0435, B:126:0x043b, B:127:0x0441, B:129:0x0455, B:130:0x0465, B:132:0x046b, B:133:0x0480, B:120:0x0428, B:164:0x007e, B:165:0x015d, B:167:0x0161, B:171:0x0168, B:175:0x016f, B:177:0x0177, B:179:0x01b0, B:181:0x01bf, B:186:0x01c4, B:189:0x01e2, B:192:0x01ea, B:194:0x01f4, B:195:0x01f6, B:197:0x01fc, B:199:0x020a, B:204:0x0591, B:205:0x0598, B:206:0x01cc, B:208:0x01d3, B:215:0x008f, B:217:0x012a, B:222:0x009f, B:226:0x00ad, B:228:0x00c3, B:230:0x00cb, B:234:0x00d8, B:236:0x00de, B:238:0x00e3, B:239:0x00ea, B:241:0x00eb, B:245:0x0599, B:246:0x05a0, B:52:0x0544, B:54:0x054c, B:55:0x0553, B:57:0x0558, B:60:0x055f, B:61:0x0569, B:40:0x056a, B:42:0x0572, B:43:0x0576, B:45:0x057b, B:48:0x0582, B:49:0x058c), top: B:7:0x0029, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01cc A[Catch: all -> 0x05a1, TryCatch #0 {all -> 0x05a1, blocks: (B:34:0x051f, B:253:0x058d, B:254:0x0590, B:81:0x006b, B:82:0x0248, B:84:0x0261, B:86:0x0287, B:87:0x02a0, B:89:0x02dc, B:91:0x02e2, B:92:0x02f9, B:95:0x031a, B:97:0x0339, B:99:0x03ba, B:101:0x03c0, B:102:0x03c9, B:104:0x03ec, B:108:0x03f6, B:110:0x03f9, B:112:0x03ff, B:116:0x0409, B:118:0x0414, B:124:0x0435, B:126:0x043b, B:127:0x0441, B:129:0x0455, B:130:0x0465, B:132:0x046b, B:133:0x0480, B:120:0x0428, B:164:0x007e, B:165:0x015d, B:167:0x0161, B:171:0x0168, B:175:0x016f, B:177:0x0177, B:179:0x01b0, B:181:0x01bf, B:186:0x01c4, B:189:0x01e2, B:192:0x01ea, B:194:0x01f4, B:195:0x01f6, B:197:0x01fc, B:199:0x020a, B:204:0x0591, B:205:0x0598, B:206:0x01cc, B:208:0x01d3, B:215:0x008f, B:217:0x012a, B:222:0x009f, B:226:0x00ad, B:228:0x00c3, B:230:0x00cb, B:234:0x00d8, B:236:0x00de, B:238:0x00e3, B:239:0x00ea, B:241:0x00eb, B:245:0x0599, B:246:0x05a0, B:52:0x0544, B:54:0x054c, B:55:0x0553, B:57:0x0558, B:60:0x055f, B:61:0x0569, B:40:0x056a, B:42:0x0572, B:43:0x0576, B:45:0x057b, B:48:0x0582, B:49:0x058c), top: B:7:0x0029, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x04fb A[Catch: all -> 0x004c, CancellationException -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #10 {CancellationException -> 0x004f, all -> 0x004c, blocks: (B:15:0x0043, B:24:0x04fb), top: B:14:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0572 A[Catch: all -> 0x0551, TryCatch #9 {all -> 0x0551, blocks: (B:52:0x0544, B:54:0x054c, B:55:0x0553, B:57:0x0558, B:60:0x055f, B:61:0x0569, B:40:0x056a, B:42:0x0572, B:43:0x0576, B:45:0x057b, B:48:0x0582, B:49:0x058c), top: B:7:0x0029, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x057b A[Catch: all -> 0x0551, TryCatch #9 {all -> 0x0551, blocks: (B:52:0x0544, B:54:0x054c, B:55:0x0553, B:57:0x0558, B:60:0x055f, B:61:0x0569, B:40:0x056a, B:42:0x0572, B:43:0x0576, B:45:0x057b, B:48:0x0582, B:49:0x058c), top: B:7:0x0029, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x054c A[Catch: all -> 0x0551, TryCatch #9 {all -> 0x0551, blocks: (B:52:0x0544, B:54:0x054c, B:55:0x0553, B:57:0x0558, B:60:0x055f, B:61:0x0569, B:40:0x056a, B:42:0x0572, B:43:0x0576, B:45:0x057b, B:48:0x0582, B:49:0x058c), top: B:7:0x0029, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0558 A[Catch: all -> 0x0551, TryCatch #9 {all -> 0x0551, blocks: (B:52:0x0544, B:54:0x054c, B:55:0x0553, B:57:0x0558, B:60:0x055f, B:61:0x0569, B:40:0x056a, B:42:0x0572, B:43:0x0576, B:45:0x057b, B:48:0x0582, B:49:0x058c), top: B:7:0x0029, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0287 A[Catch: all -> 0x05a1, TryCatch #0 {all -> 0x05a1, blocks: (B:34:0x051f, B:253:0x058d, B:254:0x0590, B:81:0x006b, B:82:0x0248, B:84:0x0261, B:86:0x0287, B:87:0x02a0, B:89:0x02dc, B:91:0x02e2, B:92:0x02f9, B:95:0x031a, B:97:0x0339, B:99:0x03ba, B:101:0x03c0, B:102:0x03c9, B:104:0x03ec, B:108:0x03f6, B:110:0x03f9, B:112:0x03ff, B:116:0x0409, B:118:0x0414, B:124:0x0435, B:126:0x043b, B:127:0x0441, B:129:0x0455, B:130:0x0465, B:132:0x046b, B:133:0x0480, B:120:0x0428, B:164:0x007e, B:165:0x015d, B:167:0x0161, B:171:0x0168, B:175:0x016f, B:177:0x0177, B:179:0x01b0, B:181:0x01bf, B:186:0x01c4, B:189:0x01e2, B:192:0x01ea, B:194:0x01f4, B:195:0x01f6, B:197:0x01fc, B:199:0x020a, B:204:0x0591, B:205:0x0598, B:206:0x01cc, B:208:0x01d3, B:215:0x008f, B:217:0x012a, B:222:0x009f, B:226:0x00ad, B:228:0x00c3, B:230:0x00cb, B:234:0x00d8, B:236:0x00de, B:238:0x00e3, B:239:0x00ea, B:241:0x00eb, B:245:0x0599, B:246:0x05a0, B:52:0x0544, B:54:0x054c, B:55:0x0553, B:57:0x0558, B:60:0x055f, B:61:0x0569, B:40:0x056a, B:42:0x0572, B:43:0x0576, B:45:0x057b, B:48:0x0582, B:49:0x058c), top: B:7:0x0029, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02dc A[Catch: all -> 0x05a1, TryCatch #0 {all -> 0x05a1, blocks: (B:34:0x051f, B:253:0x058d, B:254:0x0590, B:81:0x006b, B:82:0x0248, B:84:0x0261, B:86:0x0287, B:87:0x02a0, B:89:0x02dc, B:91:0x02e2, B:92:0x02f9, B:95:0x031a, B:97:0x0339, B:99:0x03ba, B:101:0x03c0, B:102:0x03c9, B:104:0x03ec, B:108:0x03f6, B:110:0x03f9, B:112:0x03ff, B:116:0x0409, B:118:0x0414, B:124:0x0435, B:126:0x043b, B:127:0x0441, B:129:0x0455, B:130:0x0465, B:132:0x046b, B:133:0x0480, B:120:0x0428, B:164:0x007e, B:165:0x015d, B:167:0x0161, B:171:0x0168, B:175:0x016f, B:177:0x0177, B:179:0x01b0, B:181:0x01bf, B:186:0x01c4, B:189:0x01e2, B:192:0x01ea, B:194:0x01f4, B:195:0x01f6, B:197:0x01fc, B:199:0x020a, B:204:0x0591, B:205:0x0598, B:206:0x01cc, B:208:0x01d3, B:215:0x008f, B:217:0x012a, B:222:0x009f, B:226:0x00ad, B:228:0x00c3, B:230:0x00cb, B:234:0x00d8, B:236:0x00de, B:238:0x00e3, B:239:0x00ea, B:241:0x00eb, B:245:0x0599, B:246:0x05a0, B:52:0x0544, B:54:0x054c, B:55:0x0553, B:57:0x0558, B:60:0x055f, B:61:0x0569, B:40:0x056a, B:42:0x0572, B:43:0x0576, B:45:0x057b, B:48:0x0582, B:49:0x058c), top: B:7:0x0029, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03ba A[Catch: all -> 0x05a1, TryCatch #0 {all -> 0x05a1, blocks: (B:34:0x051f, B:253:0x058d, B:254:0x0590, B:81:0x006b, B:82:0x0248, B:84:0x0261, B:86:0x0287, B:87:0x02a0, B:89:0x02dc, B:91:0x02e2, B:92:0x02f9, B:95:0x031a, B:97:0x0339, B:99:0x03ba, B:101:0x03c0, B:102:0x03c9, B:104:0x03ec, B:108:0x03f6, B:110:0x03f9, B:112:0x03ff, B:116:0x0409, B:118:0x0414, B:124:0x0435, B:126:0x043b, B:127:0x0441, B:129:0x0455, B:130:0x0465, B:132:0x046b, B:133:0x0480, B:120:0x0428, B:164:0x007e, B:165:0x015d, B:167:0x0161, B:171:0x0168, B:175:0x016f, B:177:0x0177, B:179:0x01b0, B:181:0x01bf, B:186:0x01c4, B:189:0x01e2, B:192:0x01ea, B:194:0x01f4, B:195:0x01f6, B:197:0x01fc, B:199:0x020a, B:204:0x0591, B:205:0x0598, B:206:0x01cc, B:208:0x01d3, B:215:0x008f, B:217:0x012a, B:222:0x009f, B:226:0x00ad, B:228:0x00c3, B:230:0x00cb, B:234:0x00d8, B:236:0x00de, B:238:0x00e3, B:239:0x00ea, B:241:0x00eb, B:245:0x0599, B:246:0x05a0, B:52:0x0544, B:54:0x054c, B:55:0x0553, B:57:0x0558, B:60:0x055f, B:61:0x0569, B:40:0x056a, B:42:0x0572, B:43:0x0576, B:45:0x057b, B:48:0x0582, B:49:0x058c), top: B:7:0x0029, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r14v0, types: [vz0] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v20, types: [y11, vz0] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r56v0, types: [lj1, com.anistation.download.data.model.DownloadRequest] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(com.anistation.download.data.model.DownloadRequest r56, java.lang.String r57, defpackage.xz0 r58) {
        /*
            Method dump skipped, instructions count: 1447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl1.d(com.anistation.download.data.model.DownloadRequest, java.lang.String, xz0):java.io.Serializable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0553 A[Catch: all -> 0x0058, LOOP:0: B:22:0x0551->B:23:0x0553, LOOP_END, TryCatch #0 {all -> 0x0058, blocks: (B:16:0x004d, B:18:0x0538, B:23:0x0553, B:25:0x0559, B:26:0x057a, B:28:0x0580, B:30:0x0595, B:37:0x0543), top: B:15:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0580 A[Catch: all -> 0x0058, LOOP:1: B:26:0x057a->B:28:0x0580, LOOP_END, TryCatch #0 {all -> 0x0058, blocks: (B:16:0x004d, B:18:0x0538, B:23:0x0553, B:25:0x0559, B:26:0x057a, B:28:0x0580, B:30:0x0595, B:37:0x0543), top: B:15:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0442 A[Catch: all -> 0x060b, TryCatch #2 {all -> 0x060b, blocks: (B:31:0x05e4, B:40:0x05ed, B:41:0x05f0, B:45:0x0070, B:47:0x0407, B:49:0x0442, B:53:0x044e, B:55:0x0451, B:57:0x0457, B:61:0x0463, B:63:0x046e, B:69:0x0492, B:71:0x0498, B:72:0x049e, B:74:0x04b2, B:75:0x04c2, B:77:0x04c8, B:78:0x04dd, B:65:0x0486, B:94:0x0087, B:97:0x0246, B:100:0x024c, B:102:0x0256, B:103:0x0258, B:105:0x0260, B:106:0x026f, B:108:0x029a, B:109:0x02b0, B:111:0x02ec, B:113:0x02f2, B:114:0x0309, B:116:0x0355, B:117:0x03da, B:124:0x05f1, B:125:0x05f8, B:127:0x00a2, B:129:0x0218, B:133:0x00b9, B:137:0x00c8, B:139:0x00de, B:141:0x00e6, B:145:0x00f3, B:147:0x00f9, B:149:0x00fe, B:150:0x0105, B:152:0x0106, B:154:0x0175, B:155:0x017b, B:158:0x0181, B:159:0x0187, B:162:0x018d, B:163:0x0193, B:166:0x0199, B:167:0x019f, B:170:0x01a9, B:173:0x01b3, B:176:0x01bd, B:179:0x01c7, B:182:0x01d1, B:189:0x05f9, B:198:0x0603, B:199:0x060a), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0457 A[Catch: all -> 0x060b, TryCatch #2 {all -> 0x060b, blocks: (B:31:0x05e4, B:40:0x05ed, B:41:0x05f0, B:45:0x0070, B:47:0x0407, B:49:0x0442, B:53:0x044e, B:55:0x0451, B:57:0x0457, B:61:0x0463, B:63:0x046e, B:69:0x0492, B:71:0x0498, B:72:0x049e, B:74:0x04b2, B:75:0x04c2, B:77:0x04c8, B:78:0x04dd, B:65:0x0486, B:94:0x0087, B:97:0x0246, B:100:0x024c, B:102:0x0256, B:103:0x0258, B:105:0x0260, B:106:0x026f, B:108:0x029a, B:109:0x02b0, B:111:0x02ec, B:113:0x02f2, B:114:0x0309, B:116:0x0355, B:117:0x03da, B:124:0x05f1, B:125:0x05f8, B:127:0x00a2, B:129:0x0218, B:133:0x00b9, B:137:0x00c8, B:139:0x00de, B:141:0x00e6, B:145:0x00f3, B:147:0x00f9, B:149:0x00fe, B:150:0x0105, B:152:0x0106, B:154:0x0175, B:155:0x017b, B:158:0x0181, B:159:0x0187, B:162:0x018d, B:163:0x0193, B:166:0x0199, B:167:0x019f, B:170:0x01a9, B:173:0x01b3, B:176:0x01bd, B:179:0x01c7, B:182:0x01d1, B:189:0x05f9, B:198:0x0603, B:199:0x060a), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04b2 A[Catch: all -> 0x060b, TryCatch #2 {all -> 0x060b, blocks: (B:31:0x05e4, B:40:0x05ed, B:41:0x05f0, B:45:0x0070, B:47:0x0407, B:49:0x0442, B:53:0x044e, B:55:0x0451, B:57:0x0457, B:61:0x0463, B:63:0x046e, B:69:0x0492, B:71:0x0498, B:72:0x049e, B:74:0x04b2, B:75:0x04c2, B:77:0x04c8, B:78:0x04dd, B:65:0x0486, B:94:0x0087, B:97:0x0246, B:100:0x024c, B:102:0x0256, B:103:0x0258, B:105:0x0260, B:106:0x026f, B:108:0x029a, B:109:0x02b0, B:111:0x02ec, B:113:0x02f2, B:114:0x0309, B:116:0x0355, B:117:0x03da, B:124:0x05f1, B:125:0x05f8, B:127:0x00a2, B:129:0x0218, B:133:0x00b9, B:137:0x00c8, B:139:0x00de, B:141:0x00e6, B:145:0x00f3, B:147:0x00f9, B:149:0x00fe, B:150:0x0105, B:152:0x0106, B:154:0x0175, B:155:0x017b, B:158:0x0181, B:159:0x0187, B:162:0x018d, B:163:0x0193, B:166:0x0199, B:167:0x019f, B:170:0x01a9, B:173:0x01b3, B:176:0x01bd, B:179:0x01c7, B:182:0x01d1, B:189:0x05f9, B:198:0x0603, B:199:0x060a), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04c8 A[Catch: all -> 0x060b, TryCatch #2 {all -> 0x060b, blocks: (B:31:0x05e4, B:40:0x05ed, B:41:0x05f0, B:45:0x0070, B:47:0x0407, B:49:0x0442, B:53:0x044e, B:55:0x0451, B:57:0x0457, B:61:0x0463, B:63:0x046e, B:69:0x0492, B:71:0x0498, B:72:0x049e, B:74:0x04b2, B:75:0x04c2, B:77:0x04c8, B:78:0x04dd, B:65:0x0486, B:94:0x0087, B:97:0x0246, B:100:0x024c, B:102:0x0256, B:103:0x0258, B:105:0x0260, B:106:0x026f, B:108:0x029a, B:109:0x02b0, B:111:0x02ec, B:113:0x02f2, B:114:0x0309, B:116:0x0355, B:117:0x03da, B:124:0x05f1, B:125:0x05f8, B:127:0x00a2, B:129:0x0218, B:133:0x00b9, B:137:0x00c8, B:139:0x00de, B:141:0x00e6, B:145:0x00f3, B:147:0x00f9, B:149:0x00fe, B:150:0x0105, B:152:0x0106, B:154:0x0175, B:155:0x017b, B:158:0x0181, B:159:0x0187, B:162:0x018d, B:163:0x0193, B:166:0x0199, B:167:0x019f, B:170:0x01a9, B:173:0x01b3, B:176:0x01bd, B:179:0x01c7, B:182:0x01d1, B:189:0x05f9, B:198:0x0603, B:199:0x060a), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024a A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.String, cj1] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, w05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(com.anistation.download.data.model.DownloadRequest r58, java.lang.String r59, defpackage.xz0 r60) {
        /*
            Method dump skipped, instructions count: 1553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl1.e(com.anistation.download.data.model.DownloadRequest, java.lang.String, xz0):java.io.Serializable");
    }

    public final EpisodeDownload g(DownloadRequest downloadRequest, String str) {
        Object obj;
        Iterator it = ((Iterable) this.j.x.getValue()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                EpisodeDownload episodeDownload = (EpisodeDownload) obj;
                if (k(episodeDownload.getMetadata(), downloadRequest.getSession().getAnimeId(), downloadRequest.getSession().getAnilistId()) && episodeDownload.getMetadata().getEpisodeNumber() == downloadRequest.getEpisode().getNumber() && a34.i(OfflineDownloadMetadataKt.getAudioTrackKey(episodeDownload.getMetadata()), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (EpisodeDownload) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0183 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00de -> B:20:0x00ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x014b -> B:10:0x014e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r17, int r18, int r19, java.lang.String r20, java.lang.String r21, defpackage.xz0 r22) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl1.h(java.lang.String, int, int, java.lang.String, java.lang.String, xz0):java.lang.Object");
    }

    public final void l(String str) {
        Object obj;
        Iterator it = ((Iterable) this.j.x.getValue()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (a34.i(((EpisodeDownload) obj).getId(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        EpisodeDownload episodeDownload = (EpisodeDownload) obj;
        if (episodeDownload == null || !episodeDownload.getState().getCanPause()) {
            return;
        }
        boolean isExternal = episodeDownload.isExternal();
        Context context = this.a;
        if (isExternal) {
            int i = ExternalDownloadService.R;
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) ExternalDownloadService.class);
            intent.setAction("com.anistation.download.EXTERNAL_PAUSE");
            intent.putExtra("download_id", str);
            context.startForegroundService(intent);
        } else {
            HashMap hashMap = kl1.F;
            context.startService(new Intent(context, (Class<?>) InternalDownloadService.class).setAction("androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON").putExtra("foreground", false).putExtra("content_id", str).putExtra("stop_reason", 1));
        }
        m();
    }

    public final void m() {
        tl7.z(this.h, null, null, new sk1(this, null, (byte) 1), 3);
    }

    public final Object n(xz0 xz0Var) {
        ja1 ja1Var = rh1.a;
        Object V = tl7.V(j91.y, new ji(this, null, (byte) 4), xz0Var);
        if (V == w11.x) {
            return V;
        }
        return pn6.a;
    }

    public final void o(String str) {
        Object obj;
        OfflineDownloadMetadata metadata;
        str.getClass();
        rs rsVar = this.g;
        rsVar.getClass();
        new File(rsVar.b, x97.S(str)).delete();
        Iterator it = ((Iterable) this.j.x.getValue()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (a34.i(((EpisodeDownload) obj).getId(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        EpisodeDownload episodeDownload = (EpisodeDownload) obj;
        if (episodeDownload != null && (metadata = episodeDownload.getMetadata()) != null) {
            c(metadata, str);
        }
        Context context = this.a;
        if ((episodeDownload != null && episodeDownload.isExternal()) || b06.I(str, "external:episode:", false)) {
            int i = ExternalDownloadService.R;
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) ExternalDownloadService.class);
            intent.setAction("com.anistation.download.EXTERNAL_REMOVE");
            intent.putExtra("download_id", str);
            context.startForegroundService(intent);
            return;
        }
        HashMap hashMap = kl1.F;
        context.startService(new Intent(context, (Class<?>) InternalDownloadService.class).setAction("androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD").putExtra("foreground", false).putExtra("content_id", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.xz0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dl1
            if (r0 == 0) goto L13
            r0 = r5
            dl1 r0 = (defpackage.dl1) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            dl1 r0 = new dl1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.x
            int r1 = r0.z
            pn6 r2 = defpackage.pn6.a
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L27
            defpackage.m37.N(r5)
            goto L46
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.m37.N(r5)
            r0.z = r3
            ml1 r5 = r4.e
            ok1 r5 = r5.a
            zl1 r5 = (defpackage.zl1) r5
            java.lang.Object r5 = r5.a(r0)
            w11 r0 = defpackage.w11.x
            if (r5 != r0) goto L42
            goto L43
        L42:
            r5 = r2
        L43:
            if (r5 != r0) goto L46
            return r0
        L46:
            r4.m()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl1.p(xz0):java.lang.Object");
    }

    public final void q(String str) {
        Object obj;
        Iterator it = ((Iterable) this.j.x.getValue()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (a34.i(((EpisodeDownload) obj).getId(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        EpisodeDownload episodeDownload = (EpisodeDownload) obj;
        if (episodeDownload == null || !episodeDownload.getState().getCanResume()) {
            return;
        }
        boolean isExternal = episodeDownload.isExternal();
        Context context = this.a;
        if (isExternal) {
            int i = ExternalDownloadService.R;
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) ExternalDownloadService.class);
            intent.setAction("com.anistation.download.EXTERNAL_RESUME");
            intent.putExtra("download_id", str);
            context.startForegroundService(intent);
        } else {
            HashMap hashMap = kl1.F;
            Intent putExtra = new Intent(context, (Class<?>) InternalDownloadService.class).setAction("androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON").putExtra("foreground", true).putExtra("content_id", str).putExtra("stop_reason", 0);
            String str2 = eq6.a;
            context.startForegroundService(putExtra);
        }
        m();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.String r6, defpackage.xz0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.el1
            if (r0 == 0) goto L13
            r0 = r7
            el1 r0 = (defpackage.el1) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            el1 r0 = new el1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.x
            int r1 = r0.z
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.m37.N(r7)
            goto L44
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            return r2
        L2c:
            defpackage.m37.N(r7)
            ja1 r7 = defpackage.rh1.a
            j91 r7 = defpackage.j91.y
            an r1 = new an
            r4 = 4
            r1.<init>(r5, r6, r2, r4)
            r0.z = r3
            java.lang.Object r7 = defpackage.tl7.V(r7, r1, r0)
            w11 r5 = defpackage.w11.x
            if (r7 != r5) goto L44
            return r5
        L44:
            z45 r7 = (defpackage.z45) r7
            java.lang.Object r5 = r7.x
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl1.s(java.lang.String, xz0):java.lang.Object");
    }
}
