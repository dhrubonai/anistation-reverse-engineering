package defpackage;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mr3 implements r7 {
    public int A;
    public boolean B;
    public final Context a;
    public final da1 c;
    public final PlaybackSession d;
    public String j;
    public PlaybackMetrics.Builder k;
    public int l;
    public yx1 o;
    public eb2 p;
    public eb2 q;
    public eb2 r;
    public ea2 s;
    public ea2 t;
    public ea2 u;
    public boolean v;
    public byte w;
    public boolean x;
    public int y;
    public int z;
    public final Executor b = zz.F();
    public final jf6 f = new jf6();
    public final hf6 g = new hf6();
    public final HashMap i = new HashMap();
    public final HashMap h = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int m = 0;
    public int n = 0;

    public mr3(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        da1 da1Var = new da1();
        this.c = da1Var;
        da1Var.d = this;
    }

    public final boolean a(eb2 eb2Var) {
        String str;
        if (eb2Var != null) {
            String str2 = (String) eb2Var.A;
            da1 da1Var = this.c;
            synchronized (da1Var) {
                str = da1Var.f;
            }
            if (str2.equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b() {
        long longValue;
        long longValue2;
        int i;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.k.setVideoFramesDropped(this.y);
            this.k.setVideoFramesPlayed(this.z);
            Long l = (Long) this.h.get(this.j);
            PlaybackMetrics.Builder builder2 = this.k;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l2 = (Long) this.i.get(this.j);
            PlaybackMetrics.Builder builder3 = this.k;
            if (l2 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l2.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.k;
            if (l2 != null && l2.longValue() > 0) {
                i = 1;
            } else {
                i = 0;
            }
            builder4.setStreamSource(i);
            build = this.k.build();
            this.b.execute(new f32((Object) this, (Object) build, (byte) 11));
        }
        this.k = null;
        this.j = null;
        this.A = 0;
        this.y = 0;
        this.z = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.B = false;
    }

    public final void c(kf6 kf6Var, jw3 jw3Var) {
        int b;
        PlaybackMetrics.Builder builder = this.k;
        if (jw3Var == null || (b = kf6Var.b(jw3Var.a)) == -1) {
            return;
        }
        hf6 hf6Var = this.g;
        int i = 0;
        kf6Var.f(b, hf6Var, false);
        int i2 = hf6Var.c;
        jf6 jf6Var = this.f;
        kf6Var.n(i2, jf6Var);
        vq3 vq3Var = jf6Var.c.b;
        int i3 = 2;
        if (vq3Var != null) {
            int L = eq6.L(vq3Var.a, vq3Var.b);
            if (L != 0) {
                if (L != 1) {
                    if (L != 2) {
                        i = 1;
                    } else {
                        i = 4;
                    }
                } else {
                    i = 5;
                }
            } else {
                i = 3;
            }
        }
        builder.setStreamType(i);
        if (jf6Var.m != -9223372036854775807L && !jf6Var.k && !jf6Var.i && !jf6Var.a()) {
            builder.setMediaDurationMillis(eq6.l0(jf6Var.m));
        }
        if (!jf6Var.a()) {
            i3 = 1;
        }
        builder.setPlaybackType(i3);
        this.B = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x064d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0530  */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v51, types: [eb2] */
    /* JADX WARN: Type inference failed for: r10v56 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.ko4 r23, defpackage.pz2 r24) {
        /*
            Method dump skipped, instructions count: 1664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr3.d(ko4, pz2):void");
    }

    public final void e(q7 q7Var, String str) {
        jw3 jw3Var = q7Var.d;
        if (jw3Var != null && jw3Var.c()) {
            return;
        }
        b();
        this.j = str;
        this.k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.11.1");
        c(q7Var.b, jw3Var);
    }

    public final void f(q7 q7Var, String str) {
        jw3 jw3Var = q7Var.d;
        if ((jw3Var == null || !jw3Var.c()) && str.equals(this.j)) {
            b();
        }
        this.h.remove(str);
        this.i.remove(str);
    }

    public final void g(int i, long j, ea2 ea2Var, int i2) {
        int i3;
        String str;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
        if (ea2Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    if (i2 != 3) {
                        i3 = 1;
                    } else {
                        i3 = 4;
                    }
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str2 = ea2Var.o;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = ea2Var.p;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = ea2Var.l;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i4 = ea2Var.k;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = ea2Var.w;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = ea2Var.x;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = ea2Var.J;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = ea2Var.L;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str5 = ea2Var.d;
            if (str5 != null) {
                String str6 = eq6.a;
                String[] split = str5.split("-", -1);
                String str7 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str7, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = ea2Var.B;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        this.b.execute(new f32((Object) this, (Object) timeSinceCreatedMillis.build(), (byte) 8));
    }
}
