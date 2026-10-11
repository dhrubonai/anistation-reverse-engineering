package defpackage;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class y95 implements vn5, gd4, tt5, k11, vm7 {
    public final /* synthetic */ byte x;
    public static final /* synthetic */ y95 y = new y95(10);
    public static final /* synthetic */ y95 z = new y95(13);
    public static final /* synthetic */ y95 A = new y95(14);
    public static final /* synthetic */ y95 B = new y95(15);
    public static final /* synthetic */ y95 C = new y95(16);
    public static final /* synthetic */ y95 D = new y95(17);
    public static final /* synthetic */ y95 E = new y95(18);
    public static final /* synthetic */ y95 F = new y95(19);
    public static final /* synthetic */ y95 G = new y95(20);
    public static final /* synthetic */ y95 H = new y95(21);
    public static final /* synthetic */ y95 I = new y95(22);
    public static final /* synthetic */ y95 J = new y95(23);
    public static final /* synthetic */ y95 K = new y95(24);
    public static final /* synthetic */ y95 L = new y95(25);
    public static final /* synthetic */ y95 M = new y95(26);
    public static final /* synthetic */ y95 N = new y95(27);
    public static final /* synthetic */ y95 O = new y95(28);
    public static final /* synthetic */ y95 P = new y95(29);

    public y95() {
        this.x = (byte) 7;
        new ConcurrentHashMap();
    }

    public static Font h(FontFamily fontFamily, int i) {
        int i2;
        int i3;
        if ((i & 1) != 0) {
            i2 = 700;
        } else {
            i2 = CommonGatewayClient.CODE_400;
        }
        if ((i & 2) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        FontStyle fontStyle = new FontStyle(i2, i3);
        Font font = fontFamily.getFont(0);
        int k = k(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int k2 = k(fontStyle, font2.getStyle());
            if (k2 < k) {
                font = font2;
                k = k2;
            }
        }
        return font;
    }

    public static int k(FontStyle fontStyle, FontStyle fontStyle2) {
        int i;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    public static final yf7 l(long j, Object obj) {
        int i;
        yf7 yf7Var = (yf7) ih7.h(j, obj);
        if (!((re7) yf7Var).x) {
            int size = yf7Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            yf7 l = yf7Var.l(i);
            ih7.i(j, obj, l);
            return l;
        }
        return yf7Var;
    }

    @Override // defpackage.vm7
    public Object a() {
        switch (this.x) {
            case 13:
                return new Boolean(((Boolean) ai7.b.get()).booleanValue());
            case 14:
                List list = tq7.a;
                ph7.y.get();
                return (String) qh7.a.h(4, "measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid").get();
            case 15:
                List list2 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(1000L, 69, "measurement.upload.max_error_events_per_day").get()).longValue());
            case 16:
                List list3 = tq7.a;
                ph7.y.get();
                return (String) qh7.a.h(78, "measurement.upload.url", "https://app-measurement.com/a").get();
            case 17:
                List list4 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(86400000L, 29, "measurement.monitoring.sample_period_millis").get();
            case 18:
                List list5 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(5000L, 47, "measurement.sgtm.upload.max_queued_batches").get()).longValue());
            case 19:
                List list6 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(240000L, 40, "measurement.sgtm.batch.long_queuing_threshold").get();
            case 20:
                List list7 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(10000L, 33, "measurement.upload.realtime_upload_interval").get();
            case 21:
                List list8 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(604800000L, 34, "measurement.upload.refresh_blacklisted_config_interval").get();
            case 22:
                List list9 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(518400000L, 73, "measurement.upload.max_queue_time").get();
            case 23:
                List list10 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(1000L, 38, "measurement.service_client.reconnect_millis").get();
            case 24:
                List list11 = tq7.a;
                wi7.y.get();
                return (Long) xi7.a.f(-1L, 1, "measurement.test.cached_long_flag").get();
            case 25:
                List list12 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(500L, 19, "measurement.upload.max_event_parameter_value_length").get()).longValue());
            case 26:
                List list13 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(7L, 26, "measurement.rb.attribution.client.min_ad_services_version").get()).longValue());
            case 27:
                List list14 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(3600000L, 12, "measurement.session.engagement_interval").get();
            case 28:
                List list15 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(65536L, 75, "measurement.upload.max_batch_size").get()).longValue());
            default:
                List list16 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(1000L, 24, "measurement.rb.max_trigger_registrations_per_day").get()).longValue());
        }
    }

    @Override // defpackage.gd4
    public long b(c12 c12Var) {
        return -1L;
    }

    @Override // defpackage.gd4
    public hf5 c() {
        return new zy(-9223372036854775807L);
    }

    @Override // defpackage.vn5
    public w42 e(g16 g16Var) {
        return new jt1((byte) 1);
    }

    public Typeface f(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily i2 = i((v92[]) list.get(0), contentResolver);
            if (i2 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(i2);
            for (int i3 = 1; i3 < list.size(); i3++) {
                FontFamily i4 = i((v92[]) list.get(i3), contentResolver);
                if (i4 != null) {
                    customFallbackBuilder.addCustomFallback(i4);
                }
            }
            return customFallbackBuilder.setStyle(h(i2, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    @Override // defpackage.tt5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            oa6 r4 = (defpackage.oa6) r4
            oa6 r5 = (defpackage.oa6) r5
            r3 = 0
            r0 = 1
            if (r4 == 0) goto L35
            if (r5 == 0) goto L35
            float r1 = r4.e
            float r2 = r5.e
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L43
            float r1 = r4.f
            float r2 = r5.f
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L43
            ia3 r1 = r4.b
            ia3 r2 = r5.b
            if (r1 != r2) goto L43
            p82 r1 = r4.c
            p82 r2 = r5.c
            boolean r1 = defpackage.a34.i(r1, r2)
            if (r1 == 0) goto L43
            long r1 = r4.d
            long r4 = r5.d
            boolean r4 = defpackage.rx0.b(r1, r4)
            if (r4 == 0) goto L43
            goto L42
        L35:
            if (r4 != 0) goto L39
            r4 = r0
            goto L3a
        L39:
            r4 = r3
        L3a:
            if (r5 != 0) goto L3e
            r5 = r0
            goto L3f
        L3e:
            r5 = r3
        L3f:
            r4 = r4 ^ r5
            if (r4 != 0) goto L43
        L42:
            return r0
        L43:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y95.g(java.lang.Object, java.lang.Object):boolean");
    }

    public FontFamily i(v92[] v92VarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (v92 v92Var : v92VarArr) {
            if (Objects.equals(v92Var.a.getScheme(), "systemfont")) {
                font = j(v92Var);
            } else {
                try {
                    Uri uri = v92Var.a;
                    str = v92Var.e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, null);
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(v92Var.c).setSlant(v92Var.d ? 1 : 0).setTtcIndex(v92Var.b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font j(v92 v92Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    public String toString() {
        switch (this.x) {
            case 0:
                int hashCode = hashCode();
                t80.z(16);
                String num = Integer.toString(hashCode, 16);
                num.getClass();
                return qx1.n("CreationExtras.Key@", num, "<", z05.a(ew6.class).f(), ">");
            case 2:
                return "SharingStarted.Eagerly";
            case 8:
                int hashCode2 = hashCode();
                t80.z(16);
                String num2 = Integer.toString(hashCode2, 16);
                num2.getClass();
                return qx1.n("CreationExtras.Key@", num2, "<", z05.a(Application.class).f(), ">");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ y95(byte b) {
        this.x = b;
    }

    @Override // defpackage.gd4
    public void d(long j) {
    }
}
