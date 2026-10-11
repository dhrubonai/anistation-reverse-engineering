package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z95 implements vn5, gp3, tt5, un0, ng7, g25, vm7 {
    public final /* synthetic */ byte x;
    public static final /* synthetic */ z95 y = new z95(12);
    public static final /* synthetic */ z95 z = new z95(13);
    public static final /* synthetic */ z95 A = new z95(14);
    public static final /* synthetic */ z95 B = new z95(15);
    public static final /* synthetic */ z95 C = new z95(16);
    public static final /* synthetic */ z95 D = new z95(17);
    public static final /* synthetic */ z95 E = new z95(18);
    public static final /* synthetic */ z95 F = new z95(19);
    public static final /* synthetic */ z95 G = new z95(20);
    public static final /* synthetic */ z95 H = new z95(21);
    public static final /* synthetic */ z95 I = new z95(22);
    public static final /* synthetic */ z95 J = new z95(23);
    public static final /* synthetic */ z95 K = new z95(24);
    public static final /* synthetic */ z95 L = new z95(25);
    public static final /* synthetic */ z95 M = new z95(26);
    public static final /* synthetic */ z95 N = new z95(27);
    public static final /* synthetic */ z95 O = new z95(28);
    public static final /* synthetic */ z95 P = new z95(29);

    public /* synthetic */ z95(byte b) {
        this.x = b;
    }

    public static MediaCodec h(tp tpVar) {
        String str = ((mp3) tpVar.y).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    @Override // defpackage.vm7
    public Object a() {
        switch (this.x) {
            case 13:
                return new Boolean(((Boolean) ci7.a.get()).booleanValue());
            case 14:
                List list = tq7.a;
                ph7.y.get();
                return (String) qh7.a.h(14, "measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp").get();
            case 15:
                List list2 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(50000L, 72, "measurement.upload.max_public_events_per_day").get()).longValue());
            case 16:
                List list3 = tq7.a;
                ph7.y.get();
                return (String) qh7.a.h(16, "measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d").get();
            case 17:
                List list4 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(21600000L, 52, "measurement.sgtm.upload.retry_max_wait").get();
            case 18:
                List list5 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(5L, 46, "measurement.sgtm.upload.batches_retrieval_limit").get()).longValue());
            case 19:
                List list6 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(86400000L, 5, "measurement.config.cache_time").get();
            case 20:
                List list7 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(1000L, 9, "measurement.upload.debug_upload_interval").get();
            case 21:
                List list8 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(15000L, 64, "measurement.upload.initial_upload_delay_time").get();
            case 22:
                List list9 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(605000L, 15, "measurement.upload.google_signal_max_queue_time").get();
            case 23:
                List list10 = tq7.a;
                wi7.y.get();
                return (Boolean) xi7.a.e(0, "measurement.test.boolean_flag", false).get();
            case 24:
                List list11 = tq7.a;
                wi7.y.get();
                return Integer.valueOf((int) ((Long) xi7.a.f(-2L, 3, "measurement.test.int_flag").get()).longValue());
            case 25:
                List list12 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(100L, 3, "measurement.max_bundles_per_iteration").get()).longValue());
            case 26:
                List list13 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(1L, 18, "measurement.dma_consent.max_daily_dcu_realtime_events").get()).longValue());
            case 27:
                List list14 = tq7.a;
                ph7.y.get();
                return (String) qh7.a.h(32, "measurement.rb.attribution.app_allowlist", "").get();
            case 28:
                List list15 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(864000000L, 57, "measurement.rb.attribution.max_queue_time").get();
            default:
                List list16 = tq7.a;
                ph7.y.get();
                return (Boolean) qh7.a.e(2, "measurement.config.bundle_for_all_apps_on_backgrounded", true).get();
        }
    }

    @Override // defpackage.g25
    public void accept(Object obj, Object obj2) {
        zk3 zk3Var = sm7.G;
        uh7 uh7Var = (uh7) ((t98) obj).m();
        lp i = rv5.i();
        Parcel K2 = uh7Var.K();
        nn7.b(K2, i);
        uh7Var.O(K2, 19);
        ((p76) obj2).b(Boolean.TRUE);
    }

    @Override // defpackage.gp3
    public hp3 b(tp tpVar) {
        int i;
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = h(tpVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) tpVar.B;
            if (surface == null && ((mp3) tpVar.y).h && Build.VERSION.SDK_INT >= 35) {
                i = 8;
            } else {
                i = 0;
            }
            mediaCodec.configure((MediaFormat) tpVar.z, surface, (MediaCrypto) tpVar.C, i);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new y23(mediaCodec, (y23) tpVar.D);
        } catch (IOException | RuntimeException e) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }

    @Override // defpackage.ng7
    public boolean c(Class cls) {
        return false;
    }

    @Override // defpackage.ng7
    public wg7 d(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.vn5
    public w42 e(g16 g16Var) {
        return new mx0(g16Var, (byte) 6);
    }

    @Override // defpackage.un0
    public long f() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[RETURN] */
    @Override // defpackage.tt5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            pa6 r4 = (defpackage.pa6) r4
            pa6 r5 = (defpackage.pa6) r5
            r3 = 0
            r0 = 1
            if (r4 == 0) goto L2d
            if (r5 == 0) goto L2d
            gi6 r1 = r4.a
            gi6 r2 = r5.a
            if (r1 != r2) goto L3b
            xd6 r1 = r4.b
            xd6 r2 = r5.b
            boolean r1 = defpackage.a34.i(r1, r2)
            if (r1 == 0) goto L3b
            boolean r1 = r4.c
            boolean r2 = r5.c
            if (r1 != r2) goto L3b
            boolean r1 = r4.d
            boolean r2 = r5.d
            if (r1 != r2) goto L3b
            boolean r4 = r4.e
            boolean r5 = r5.e
            if (r4 != r5) goto L3b
            goto L3a
        L2d:
            if (r4 != 0) goto L31
            r4 = r0
            goto L32
        L31:
            r4 = r3
        L32:
            if (r5 != 0) goto L36
            r5 = r0
            goto L37
        L36:
            r5 = r3
        L37:
            r4 = r4 ^ r5
            if (r4 != 0) goto L3b
        L3a:
            return r0
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z95.g(java.lang.Object, java.lang.Object):boolean");
    }

    public String toString() {
        switch (this.x) {
            case 0:
                int hashCode = hashCode();
                t80.z(16);
                String num = Integer.toString(hashCode, 16);
                num.getClass();
                return qx1.n("CreationExtras.Key@", num, "<", z05.a(Bundle.class).f(), ">");
            case 2:
                return "SharingStarted.Lazily";
            case 3:
                return "ReusedSlotId";
            case 8:
                int hashCode2 = hashCode();
                t80.z(16);
                String num2 = Integer.toString(hashCode2, 16);
                num2.getClass();
                return qx1.n("CreationExtras.Key@", num2, "<", z05.a(String.class).f(), ">");
            default:
                return super.toString();
        }
    }
}
