package k1;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import c1.c1;
import c1.d1;
import c1.s0;
import com.google.android.gms.common.internal.o0;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f0 implements c, g0 {
    public boolean A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6354a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f6355b;

    /* renamed from: c, reason: collision with root package name */
    public final PlaybackSession f6356c;

    /* renamed from: i, reason: collision with root package name */
    public String f6362i;

    /* renamed from: j, reason: collision with root package name */
    public PlaybackMetrics.Builder f6363j;

    /* renamed from: k, reason: collision with root package name */
    public int f6364k;

    /* renamed from: n, reason: collision with root package name */
    public s0 f6367n;
    public y.c o;

    /* renamed from: p, reason: collision with root package name */
    public y.c f6368p;

    /* renamed from: q, reason: collision with root package name */
    public y.c f6369q;

    /* renamed from: r, reason: collision with root package name */
    public c1.v f6370r;

    /* renamed from: s, reason: collision with root package name */
    public c1.v f6371s;

    /* renamed from: t, reason: collision with root package name */
    public c1.v f6372t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6373u;

    /* renamed from: v, reason: collision with root package name */
    public int f6374v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6375w;

    /* renamed from: x, reason: collision with root package name */
    public int f6376x;

    /* renamed from: y, reason: collision with root package name */
    public int f6377y;

    /* renamed from: z, reason: collision with root package name */
    public int f6378z;

    /* renamed from: e, reason: collision with root package name */
    public final d1 f6358e = new d1();

    /* renamed from: f, reason: collision with root package name */
    public final c1 f6359f = new c1();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f6361h = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f6360g = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final long f6357d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    public int f6365l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f6366m = 0;

    public f0(Context context, PlaybackSession playbackSession) {
        this.f6354a = context.getApplicationContext();
        this.f6356c = playbackSession;
        c0 c0Var = new c0();
        this.f6355b = c0Var;
        c0Var.f6344d = this;
    }

    public static int c(int i10) {
        switch (f1.b0.u(i10)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    public final boolean a(y.c cVar) {
        String str;
        if (cVar != null) {
            String str2 = (String) cVar.f11425c;
            c0 c0Var = this.f6355b;
            synchronized (c0Var) {
                str = c0Var.f6346f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        long longValue;
        long longValue2;
        int i10;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f6363j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f6378z);
            this.f6363j.setVideoFramesDropped(this.f6376x);
            this.f6363j.setVideoFramesPlayed(this.f6377y);
            Long l10 = (Long) this.f6360g.get(this.f6362i);
            PlaybackMetrics.Builder builder2 = this.f6363j;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l11 = (Long) this.f6361h.get(this.f6362i);
            PlaybackMetrics.Builder builder3 = this.f6363j;
            if (l11 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l11.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.f6363j;
            if (l11 != null && l11.longValue() > 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            builder4.setStreamSource(i10);
            build = this.f6363j.build();
            this.f6356c.reportPlaybackMetrics(build);
        }
        this.f6363j = null;
        this.f6362i = null;
        this.f6378z = 0;
        this.f6376x = 0;
        this.f6377y = 0;
        this.f6370r = null;
        this.f6371s = null;
        this.f6372t = null;
        this.A = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c4, code lost:
    
        if (r10.contains("format=m3u8-aapl") != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(c1.e1 r10, v1.w r11) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.f0.d(c1.e1, v1.w):void");
    }

    public final void e(b bVar, String str) {
        v1.w wVar = bVar.f6325d;
        if ((wVar == null || !wVar.b()) && str.equals(this.f6362i)) {
            b();
        }
        this.f6360g.remove(str);
        this.f6361h.remove(str);
    }

    public final void f(int i10, long j4, c1.v vVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i12;
        String str;
        timeSinceCreatedMillis = o0.h(i10).setTimeSinceCreatedMillis(j4 - this.f6357d);
        if (vVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i11 != 1) {
                i12 = 3;
                if (i11 != 2) {
                    if (i11 != 3) {
                        i12 = 1;
                    } else {
                        i12 = 4;
                    }
                }
            } else {
                i12 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str2 = vVar.f1934l;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = vVar.f1935m;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = vVar.f1932j;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i13 = vVar.f1931i;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = vVar.f1939r;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = vVar.f1940s;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = vVar.f1947z;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = vVar.A;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str5 = vVar.f1926d;
            if (str5 != null) {
                int i18 = f1.b0.f3799a;
                String[] split = str5.split("-", -1);
                String str6 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = vVar.f1941t;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        PlaybackSession playbackSession = this.f6356c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }
}
