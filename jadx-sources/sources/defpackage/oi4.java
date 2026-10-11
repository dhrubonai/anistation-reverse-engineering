package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.versionedparcelable.ParcelImpl;
import com.anistation.android.R;
import com.anistation.model.animelist.AnimeListImportProvider;
import com.anistation.model.animelist.WatchStatus;
import com.anistation.model.download.EpisodeDownloadState;
import com.anistation.model.download.external.ExternalDownloadRecord;
import com.anistation.model.library.WatchProgress;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.ByteArrayInputStream;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class oi4 {
    public static final os0 a = new os0(-1131826196, false, new vs0(28));
    public static final Object b = new Object();
    public static final Object c = new Object();
    public static final StackTraceElement[] d = new StackTraceElement[0];
    public static final String[] e = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_type", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};
    public static final String[] f = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_ct", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
    public static final String[] g = {"items"};
    public static final String[] h = {"affiliation", "coupon", "creative_name", "creative_slot", InAppPurchaseMetaData.KEY_CURRENCY, "_ct", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", InAppPurchaseMetaData.KEY_PRICE, "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};
    public static Boolean i;

    public static final yz3 A(yz3 yz3Var, float f2, float f3) {
        return yz3Var.w(new yc4(f2, f3));
    }

    public static final Object B(Object[] objArr, sb2 sb2Var, kd2 kd2Var) {
        return C(Arrays.copyOf(objArr, objArr.length), wk6.c, sb2Var, kd2Var, 3456);
    }

    public static final Object C(Object[] objArr, ja5 ja5Var, sb2 sb2Var, kd2 kd2Var, int i2) {
        Object[] objArr2;
        ja5 ja5Var2;
        boolean z;
        Object obj;
        Object obj2;
        Object d2;
        long j = kd2Var.T;
        t80.z(36);
        String l = Long.toString(j, 36);
        l.getClass();
        ja5Var.getClass();
        n95 n95Var = (n95) kd2Var.j(p95.a);
        Object Q = kd2Var.Q();
        Object obj3 = null;
        Object obj4 = au0.a;
        if (Q == obj4) {
            if (n95Var != null && (d2 = n95Var.d(l)) != null) {
                obj2 = ja5Var.j(d2);
            } else {
                obj2 = null;
            }
            if (obj2 == null) {
                obj2 = sb2Var.invoke();
            }
            objArr2 = objArr;
            ja5Var2 = ja5Var;
            Object i95Var = new i95(ja5Var2, n95Var, l, obj2, objArr2);
            kd2Var.n0(i95Var);
            Q = i95Var;
        } else {
            objArr2 = objArr;
            ja5Var2 = ja5Var;
        }
        i95 i95Var2 = (i95) Q;
        if (Arrays.equals(objArr2, i95Var2.B)) {
            obj3 = i95Var2.A;
        }
        if (obj3 == null) {
            obj3 = sb2Var.invoke();
        }
        boolean h2 = kd2Var.h(i95Var2);
        if ((((i2 & 112) ^ 48) > 32 && kd2Var.h(ja5Var2)) || (i2 & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        boolean h3 = h2 | z | kd2Var.h(n95Var) | kd2Var.f(l) | kd2Var.h(obj3) | kd2Var.h(objArr2);
        Object Q2 = kd2Var.Q();
        if (!h3 && Q2 != obj4) {
            obj = obj3;
        } else {
            Object[] objArr3 = objArr2;
            obj = obj3;
            Object d25Var = new d25(i95Var2, ja5Var2, n95Var, l, obj, objArr3, (byte) 0);
            kd2Var.n0(d25Var);
            Q2 = d25Var;
        }
        db.m((sb2) Q2, kd2Var);
        return obj;
    }

    public static final Object D(Object[] objArr, ja5 ja5Var, sb2 sb2Var, kd2 kd2Var, int i2) {
        return C(Arrays.copyOf(objArr, objArr.length), ja5Var, sb2Var, kd2Var, ((i2 << 3) & 7168) | (i2 & 112) | 384);
    }

    public static final yz3 E(yz3 yz3Var, float f2, float f3) {
        if (f2 == 1.0f && f3 == 1.0f) {
            return yz3Var;
        }
        return io3.P(yz3Var, f2, f3, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 1048572);
    }

    public static final void F(vz0 vz0Var, s0 s0Var) {
        try {
            kh1.a(wc7.z(vz0Var), pn6.a);
        } catch (Throwable th) {
            n(s0Var, th);
            throw null;
        }
    }

    public static final Bitmap.Config G(int i2) {
        if (i2 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i2 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i2 == 2) {
            return Bitmap.Config.RGB_565;
        }
        if (i2 == 3) {
            return Bitmap.Config.RGBA_F16;
        }
        if (i2 == 4) {
            return Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static String H(int i2) {
        Object[] objArr = {Integer.valueOf(Color.red(i2)), Integer.valueOf(Color.green(i2)), Integer.valueOf(Color.blue(i2)), Double.valueOf(Color.alpha(i2) / 255.0d)};
        String str = eq6.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static final List I(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableList(new ArrayList(list));
            }
            return Collections.singletonList(yo0.k0(list));
        }
        return nt1.x;
    }

    public static final Map J(Map map) {
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableMap(new LinkedHashMap(map));
            }
            Map.Entry entry = (Map.Entry) yo0.j0(map.entrySet());
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }
        return ot1.x;
    }

    public static int K(mg1 mg1Var, xa5 xa5Var) {
        if (mg1Var instanceof kg1) {
            return ((kg1) mg1Var).a;
        }
        int ordinal = xa5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return Integer.MAX_VALUE;
            }
            ze0.l();
            return 0;
        }
        return Integer.MIN_VALUE;
    }

    public static final ExternalDownloadRecord L(ExternalDownloadRecord externalDownloadRecord, boolean z) {
        if (z && externalDownloadRecord.getState().getCanPause()) {
            return ExternalDownloadRecord.copy$default(externalDownloadRecord, null, EpisodeDownloadState.STOPPED, 0.0f, 0L, 0L, 0, null, null, null, 0L, null, 2045, null);
        }
        if (!z && externalDownloadRecord.getState().getCanResume()) {
            return ExternalDownloadRecord.copy$default(externalDownloadRecord, null, EpisodeDownloadState.QUEUED, 0.0f, 0L, 0L, 0, null, null, null, 0L, null, 2045, null);
        }
        return externalDownloadRecord;
    }

    public static final void a(final WatchProgress watchProgress, yz3 yz3Var, boolean z, final boolean z2, final sb2 sb2Var, final ub2 ub2Var, sb2 sb2Var2, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        float f2;
        Object valueOf;
        Object obj;
        float f3;
        String str;
        boolean z4;
        float f4;
        float f5;
        boolean z5;
        boolean z6;
        final boolean z7;
        ub2Var.getClass();
        sb2Var2.getClass();
        kd2Var.f0(-1105711215);
        if (kd2Var.h(watchProgress)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (kd2Var.f(yz3Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        if (kd2Var.g(z)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5;
        if (kd2Var.g(z2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i13 = i12 | i6;
        if (kd2Var.h(sb2Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i14 = i13 | i7;
        if (kd2Var.h(ub2Var)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i15 = i14 | i8;
        if (kd2Var.h(sb2Var2)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i16 = i15 | i9;
        boolean z8 = false;
        if ((599187 & i16) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kd2Var.V(i16 & 1, z3)) {
            Context context = (Context) kd2Var.j(eb.b);
            Object thumbnailImage = watchProgress.getThumbnailImage();
            if (thumbnailImage == null) {
                thumbnailImage = watchProgress.getCoverImage();
            }
            boolean f6 = kd2Var.f(thumbnailImage) | kd2Var.f(context);
            Object Q = kd2Var.Q();
            Object obj2 = au0.a;
            if (f6 || Q == obj2) {
                bv2 bv2Var = new bv2(context);
                bv2Var.c = thumbnailImage;
                hv2.a(bv2Var, true);
                Q = bv2Var.a();
                kd2Var.n0(Q);
            }
            final ev2 ev2Var = (ev2) Q;
            boolean e2 = kd2Var.e(watchProgress.getPositionMs()) | kd2Var.e(watchProgress.getDurationMs());
            Object Q2 = kd2Var.Q();
            if (!e2 && Q2 != obj2) {
                valueOf = Q2;
            } else {
                if (watchProgress.getDurationMs() > 0) {
                    f2 = db.B(((float) watchProgress.getPositionMs()) / ((float) watchProgress.getDurationMs()), 0.0f, 1.0f);
                } else {
                    f2 = 0.0f;
                }
                valueOf = Float.valueOf(f2);
                kd2Var.n0(valueOf);
            }
            float floatValue = ((Number) valueOf).floatValue();
            long durationMs = watchProgress.getDurationMs();
            boolean e3 = kd2Var.e(watchProgress.getPositionMs()) | kd2Var.e(durationMs);
            Object Q3 = kd2Var.Q();
            if (e3 || Q3 == obj2) {
                long durationMs2 = watchProgress.getDurationMs() - watchProgress.getPositionMs();
                if (durationMs2 < 0) {
                    durationMs2 = 0;
                }
                long j = durationMs2 / 60000;
                if (j <= 0) {
                    obj = "Finishing up";
                } else {
                    obj = j + "m left";
                }
                Q3 = obj;
                kd2Var.n0(Q3);
            }
            String str2 = (String) Q3;
            boolean e4 = kd2Var.e(watchProgress.getDurationMs());
            Object Q4 = kd2Var.Q();
            if (e4 || Q4 == obj2) {
                Q4 = e02.d(watchProgress.getDurationMs());
                kd2Var.n0(Q4);
            }
            String str3 = (String) Q4;
            boolean d2 = kd2Var.d(watchProgress.getEpisodeNumber()) | kd2Var.f(str2);
            Object Q5 = kd2Var.Q();
            if (!d2 && Q5 != obj2) {
                f3 = floatValue;
                str = str3;
            } else {
                StringBuilder sb = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                sb.append("Episode " + watchProgress.getEpisodeNumber());
                sb.append(" • ");
                sb.append(str2);
                String sb2 = sb.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                int i17 = 0;
                while (i17 < size) {
                    arrayList2.add(((ho) arrayList.get(i17)).a(sb.length()));
                    i17++;
                    str3 = str3;
                    floatValue = floatValue;
                }
                f3 = floatValue;
                str = str3;
                Q5 = new ko(sb2, arrayList2);
                kd2Var.n0(Q5);
            }
            final ko koVar = (ko) Q5;
            if (((Configuration) kd2Var.j(eb.a)).smallestScreenWidthDp >= 600) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                f4 = 220.0f;
            } else {
                f4 = 150.0f;
            }
            if (z4) {
                f5 = 260.0f;
            } else {
                f5 = 180.0f;
            }
            o75 o75Var = ((cn5) kd2Var.j(dn5.a)).c;
            boolean f7 = kd2Var.f(o75Var);
            Object Q6 = kd2Var.Q();
            if (f7 || Q6 == obj2) {
                Object o75Var2 = new o75(o75Var.a, o75Var.b, new wm1(0.0f), new wm1(0.0f));
                kd2Var.n0(o75Var2);
                Q6 = o75Var2;
            }
            o75 o75Var3 = (o75) Q6;
            yz3 g2 = ar5.g(ar5.n(yz3Var, 0.0f, f5, 1), f4, 0.0f, 2);
            if ((i16 & 896) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((57344 & i16) == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z9 = z5 | z6;
            if ((458752 & i16) == 131072) {
                z8 = true;
            }
            boolean h2 = z9 | z8 | kd2Var.h(watchProgress);
            Object Q7 = kd2Var.Q();
            if (!h2 && Q7 != obj2) {
                z7 = z;
            } else {
                z7 = z;
                Q7 = new sb2() { // from class: zz0
                    @Override // defpackage.sb2
                    public final Object invoke() {
                        if (z7) {
                            sb2Var.invoke();
                        } else {
                            ub2Var.invoke(Integer.valueOf(watchProgress.getEpisodeNumber()));
                        }
                        return pn6.a;
                    }
                };
                kd2Var.n0(Q7);
            }
            final boolean z10 = z7;
            final String str4 = str;
            final float f8 = f3;
            l36.a(kb0.z(g2, false, (sb2) Q7, sb2Var2, kd2Var, ((i16 << 6) & 234881024) | 196608, 47), o75Var3, ((mp0) kd2Var.j(op0.a)).n, 0L, 0.0f, 0.0f, null, nx7.R(2044586924, new ic2() { // from class: a01
                @Override // defpackage.ic2
                public final Object invoke(Object obj3, Object obj4) {
                    boolean z11;
                    t53 t53Var;
                    boolean z12;
                    kd2 kd2Var2 = (kd2) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 3) != 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (kd2Var2.V(intValue & 1, z11)) {
                        vz3 vz3Var = vz3.x;
                        yz3 c2 = ar5.c(vz3Var, 1.0f);
                        tr trVar = x97.z;
                        w50 w50Var = pk2.K;
                        xp0 a2 = vp0.a(trVar, w50Var, kd2Var2, 6);
                        int hashCode = Long.hashCode(kd2Var2.T);
                        al4 l = kd2Var2.l();
                        yz3 E = o80.E(kd2Var2, c2);
                        tt0.d.getClass();
                        kd2Var2.h0();
                        boolean z13 = kd2Var2.S;
                        t53 t53Var2 = za3.p0;
                        if (z13) {
                            kd2Var2.k(t53Var2);
                        } else {
                            kd2Var2.q0();
                        }
                        st0 st0Var = p7.F;
                        ss5.i(st0Var, kd2Var2, a2);
                        ys0 ys0Var = p7.E;
                        ss5.i(ys0Var, kd2Var2, l);
                        Integer valueOf2 = Integer.valueOf(hashCode);
                        st0 st0Var2 = p7.G;
                        ss5.i(st0Var2, kd2Var2, valueOf2);
                        ss5.h(kd2Var2);
                        ys0 ys0Var2 = p7.D;
                        ss5.i(ys0Var2, kd2Var2, E);
                        yz3 k = n03.k(wc7.h(vz3Var), n03.w(kd2Var2).c);
                        long j2 = n03.r(kd2Var2).p;
                        ao2 ao2Var = io3.h;
                        yz3 h3 = bx7.h(k, j2, ao2Var);
                        y50 y50Var = pk2.y;
                        vo3 c3 = b90.c(y50Var, false);
                        int hashCode2 = Long.hashCode(kd2Var2.T);
                        al4 l2 = kd2Var2.l();
                        yz3 E2 = o80.E(kd2Var2, h3);
                        kd2Var2.h0();
                        if (kd2Var2.S) {
                            kd2Var2.k(t53Var2);
                        } else {
                            kd2Var2.q0();
                        }
                        ss5.i(st0Var, kd2Var2, c3);
                        ss5.i(ys0Var, kd2Var2, l2);
                        h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
                        ss5.i(ys0Var2, kd2Var2, E2);
                        WatchProgress watchProgress2 = WatchProgress.this;
                        String animeTitle = watchProgress2.getAnimeTitle();
                        cz0 cz0Var = pk2.O;
                        z22 z22Var = ar5.c;
                        tl7.a(ev2Var, animeTitle, z22Var, cz0Var, kd2Var2, 1573248);
                        long b2 = ep0.b(0.75f, ep0.b);
                        long j3 = ep0.e;
                        xd6 a3 = xd6.a(n03.y(kd2Var2).o, hz5.g(11), null, null, 0L, null, 0L, null, 16777213);
                        y50 y50Var2 = pk2.G;
                        n90 n90Var = n90.a;
                        n03.c(str4, n77.V(n90Var.a(vz3Var, y50Var2), 0.0f, 0.0f, 4.0f, 6.0f, 3), null, b2, null, j3, a3, null, kd2Var2, 199680, 148);
                        yz3 a4 = n90Var.a(bx7.h(ar5.e(ar5.c(vz3Var, 1.0f), 3.0f), ep0.b(0.4f, n03.r(kd2Var2).o), ao2Var), pk2.F);
                        vo3 c4 = b90.c(y50Var, false);
                        int hashCode3 = Long.hashCode(kd2Var2.T);
                        al4 l3 = kd2Var2.l();
                        yz3 E3 = o80.E(kd2Var2, a4);
                        kd2Var2.h0();
                        if (kd2Var2.S) {
                            t53Var = t53Var2;
                            kd2Var2.k(t53Var);
                        } else {
                            t53Var = t53Var2;
                            kd2Var2.q0();
                        }
                        ss5.i(st0Var, kd2Var2, c4);
                        ss5.i(ys0Var, kd2Var2, l3);
                        h11.q(hashCode3, kd2Var2, st0Var2, kd2Var2);
                        ss5.i(ys0Var2, kd2Var2, E3);
                        b90.a(bx7.h(ar5.c(vz3Var, f8).w(ar5.b), n03.r(kd2Var2).a, ao2Var), kd2Var2, 0);
                        kd2Var2.q(true);
                        if (z10) {
                            kd2Var2.e0(-1993899195);
                            yz3 h4 = bx7.h(z22Var, ep0.b(0.4f, n03.r(kd2Var2).n), ao2Var);
                            vo3 c5 = b90.c(pk2.C, false);
                            int hashCode4 = Long.hashCode(kd2Var2.T);
                            al4 l4 = kd2Var2.l();
                            yz3 E4 = o80.E(kd2Var2, h4);
                            kd2Var2.h0();
                            if (kd2Var2.S) {
                                kd2Var2.k(t53Var);
                            } else {
                                kd2Var2.q0();
                            }
                            ss5.i(st0Var, kd2Var2, c5);
                            ss5.i(ys0Var, kd2Var2, l4);
                            h11.q(hashCode4, kd2Var2, st0Var2, kd2Var2);
                            ss5.i(ys0Var2, kd2Var2, E4);
                            sb2 sb2Var3 = sb2Var;
                            boolean f9 = kd2Var2.f(sb2Var3);
                            Object Q8 = kd2Var2.Q();
                            if (f9 || Q8 == au0.a) {
                                Q8 = new mm(sb2Var3, (byte) 3);
                                kd2Var2.n0(Q8);
                            }
                            h98.a(z2, (ub2) Q8, null, kd2Var2, 0);
                            z12 = true;
                            kd2Var2.q(true);
                            kd2Var2.q(false);
                        } else {
                            z12 = true;
                            kd2Var2.e0(-1993394670);
                            kd2Var2.q(false);
                        }
                        kd2Var2.q(z12);
                        yz3 V = n77.V(ar5.c(vz3Var, 1.0f), 0.0f, 5.0f, 0.0f, 0.0f, 13);
                        xp0 a5 = vp0.a(trVar, w50Var, kd2Var2, 6);
                        int hashCode5 = Long.hashCode(kd2Var2.T);
                        al4 l5 = kd2Var2.l();
                        yz3 E5 = o80.E(kd2Var2, V);
                        kd2Var2.h0();
                        if (kd2Var2.S) {
                            kd2Var2.k(t53Var);
                        } else {
                            kd2Var2.q0();
                        }
                        ss5.i(st0Var, kd2Var2, a5);
                        ss5.i(ys0Var, kd2Var2, l5);
                        h11.q(hashCode5, kd2Var2, st0Var2, kd2Var2);
                        ss5.i(ys0Var2, kd2Var2, E5);
                        yz3 c6 = ar5.c(vz3Var, 1.0f);
                        z75 a6 = y75.a(x97.B, pk2.H, kd2Var2, 54);
                        int hashCode6 = Long.hashCode(kd2Var2.T);
                        al4 l6 = kd2Var2.l();
                        yz3 E6 = o80.E(kd2Var2, c6);
                        kd2Var2.h0();
                        if (kd2Var2.S) {
                            kd2Var2.k(t53Var);
                        } else {
                            kd2Var2.q0();
                        }
                        ss5.i(st0Var, kd2Var2, a6);
                        ss5.i(ys0Var, kd2Var2, l6);
                        h11.q(hashCode6, kd2Var2, st0Var2, kd2Var2);
                        ss5.i(ys0Var2, kd2Var2, E6);
                        yz3 V2 = n77.V(new ob3(1.0f, true), 0.0f, 5.0f, 0.0f, 0.0f, 13);
                        xp0 a7 = vp0.a(new vr(3.0f, false, new ze0((byte) 5)), w50Var, kd2Var2, 6);
                        int hashCode7 = Long.hashCode(kd2Var2.T);
                        al4 l7 = kd2Var2.l();
                        yz3 E7 = o80.E(kd2Var2, V2);
                        kd2Var2.h0();
                        if (kd2Var2.S) {
                            kd2Var2.k(t53Var);
                        } else {
                            kd2Var2.q0();
                        }
                        ss5.i(st0Var, kd2Var2, a7);
                        ss5.i(ys0Var, kd2Var2, l7);
                        h11.q(hashCode7, kd2Var2, st0Var2, kd2Var2);
                        ss5.i(ys0Var2, kd2Var2, E7);
                        kd2Var2.e0(2017464921);
                        String episodeTitle = watchProgress2.getEpisodeTitle();
                        if (uz5.V(episodeTitle)) {
                            episodeTitle = lz5.g(R.string.episode_num, new Object[]{Integer.valueOf(watchProgress2.getEpisodeNumber())}, kd2Var2);
                        }
                        kd2Var2.q(false);
                        xd6 xd6Var = n03.y(kd2Var2).j;
                        s92 s92Var = s92.C;
                        yc6.b(episodeTitle, null, n03.r(kd2Var2).o, 0L, s92Var, null, 0L, null, 0L, 2, false, 1, 0, xd6Var, kd2Var2, 1572864, 28032, 102330);
                        String animeTitle2 = watchProgress2.getAnimeTitle();
                        if (animeTitle2 == null) {
                            kd2Var2.e0(2017487941);
                            animeTitle2 = lz5.g(R.string.episode_num, new Object[]{Integer.valueOf(watchProgress2.getEpisodeNumber())}, kd2Var2);
                            kd2Var2.q(false);
                        } else {
                            kd2Var2.e0(2017487073);
                            kd2Var2.q(false);
                        }
                        yc6.b(animeTitle2, null, ep0.b(0.8f, n03.r(kd2Var2).o), 0L, null, null, 0L, null, 0L, 2, false, 1, 0, n03.y(kd2Var2).k, kd2Var2, 0, 28032, 102394);
                        xd6 xd6Var2 = n03.y(kd2Var2).o;
                        yc6.c(koVar, n77.V(vz3Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), ep0.b(0.55f, n03.r(kd2Var2).o), 0L, s92Var, 0L, null, 0L, 2, false, 1, 0, null, null, xd6Var2, kd2Var2, 1572912, 28032, 233400);
                        kd2Var2.q(true);
                        kd2Var2.q(true);
                        kd2Var2.q(true);
                        kd2Var2.q(true);
                    } else {
                        kd2Var2.Y();
                    }
                    return pn6.a;
                }
            }, kd2Var), kd2Var, 12582912, 120);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new jh(watchProgress, yz3Var, z, z2, sb2Var, ub2Var, sb2Var2, i2);
        }
    }

    public static e45 b(int i2, s92 s92Var) {
        return new e45(i2, s92Var, new r92(new q92[0]));
    }

    public static final void c(final xm6 xm6Var, final String str, final ub2 ub2Var, final ub2 ub2Var2, final sb2 sb2Var, final ub2 ub2Var3, final sb2 sb2Var2, yz3 yz3Var, kd2 kd2Var, final int i2) {
        int i3;
        boolean z;
        final yz3 yz3Var2;
        int i4;
        t53 t53Var;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        kd2 kd2Var2 = kd2Var;
        xm6Var.getClass();
        str.getClass();
        ub2Var.getClass();
        ub2Var2.getClass();
        sb2Var.getClass();
        ub2Var3.getClass();
        sb2Var2.getClass();
        kd2Var2.f0(-473276645);
        if (kd2Var2.h(xm6Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i11 = i3 | i2;
        if ((i2 & 48) == 0) {
            if (kd2Var2.f(str)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i11 |= i10;
        }
        if ((i2 & 384) == 0) {
            if (kd2Var2.h(ub2Var)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i11 |= i9;
        }
        if ((i2 & 3072) == 0) {
            if (kd2Var2.h(ub2Var2)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i11 |= i8;
        }
        if ((i2 & 24576) == 0) {
            if (kd2Var2.h(sb2Var)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i11 |= i7;
        }
        if ((196608 & i2) == 0) {
            if (kd2Var2.h(ub2Var3)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i11 |= i6;
        }
        if ((1572864 & i2) == 0) {
            if (kd2Var2.h(sb2Var2)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i11 |= i5;
        }
        int i12 = i11 | 12582912;
        if ((i12 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var2.V(i12 & 1, z)) {
            yz3 V = n77.V(ar5.c, 0.0f, 6.0f, 0.0f, 10.0f, 5);
            tr trVar = x97.z;
            w50 w50Var = pk2.K;
            xp0 a2 = vp0.a(trVar, w50Var, kd2Var2, 0);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, V);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z3 = kd2Var2.S;
            t53 t53Var2 = za3.p0;
            if (z3) {
                kd2Var2.k(t53Var2);
            } else {
                kd2Var2.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var2, a2);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var2, valueOf);
            ss5.h(kd2Var2);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var2, E);
            vz3 vz3Var = vz3.x;
            yz3 R = n77.R(bx7.h(ar5.c(vz3Var, 1.0f), n03.r(kd2Var2).p, n03.w(kd2Var2).c), 16.0f);
            xp0 a3 = vp0.a(x97.R(15.0f), w50Var, kd2Var2, 6);
            int hashCode2 = Long.hashCode(kd2Var2.T);
            al4 l2 = kd2Var2.l();
            yz3 E2 = o80.E(kd2Var2, R);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var2);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, a3);
            ss5.i(ys0Var, kd2Var2, l2);
            h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E2);
            yc6.b(lz5.f(R.string.import_point1, kd2Var2), null, ep0.b(0.75f, n03.r(kd2Var2).o), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, n03.y(kd2Var2).k, kd2Var2, 0, 0, 131066);
            yc6.b(lz5.f(R.string.import_point2, kd2Var2), null, ep0.b(0.75f, n03.r(kd2Var2).o), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, n03.y(kd2Var2).k, kd2Var, 0, 0, 131066);
            kd2Var.q(true);
            ov5.a(kd2Var, ar5.e(vz3Var, 24.0f));
            final byte b2 = 0;
            q23.b(ar5.c(vz3Var, 1.0f), new vr(10.0f, true, new ze0((byte) 4)), x97.R(10.0f), null, 0, 0, nx7.R(183038560, new jc2() { // from class: dx2
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v0 */
                /* JADX WARN: Type inference failed for: r12v1, types: [int, boolean] */
                /* JADX WARN: Type inference failed for: r12v9 */
                @Override // defpackage.jc2
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z4;
                    boolean z5;
                    ?? r12;
                    int i13;
                    int i14;
                    xh4 H;
                    boolean z6;
                    tq1 tq1Var;
                    long j;
                    xm6 xm6Var2;
                    Iterator it;
                    long j2;
                    boolean z7;
                    tq1 tq1Var2;
                    long j3;
                    int i15;
                    byte b3 = b2;
                    pn6 pn6Var = pn6.a;
                    vz3 vz3Var2 = vz3.x;
                    boolean z8 = true;
                    Object obj4 = au0.a;
                    ub2 ub2Var4 = ub2Var2;
                    xm6 xm6Var3 = xm6Var;
                    switch (b3) {
                        case 0:
                            Object obj5 = null;
                            kd2 kd2Var3 = (kd2) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((t62) obj).getClass();
                            if ((intValue & 17) != 16) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (kd2Var3.V(intValue & 1, z4)) {
                                Iterator it2 = AnimeListImportProvider.getEntries().iterator();
                                kd2 kd2Var4 = kd2Var3;
                                while (it2.hasNext()) {
                                    AnimeListImportProvider animeListImportProvider = (AnimeListImportProvider) it2.next();
                                    if (animeListImportProvider == xm6Var3.q) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    int[] iArr = gx2.a;
                                    int i16 = iArr[animeListImportProvider.ordinal()];
                                    if (i16 != 1) {
                                        if (i16 == 2) {
                                            i13 = -1428192077;
                                            i14 = R.string.myanimelist;
                                            r12 = 0;
                                        } else {
                                            kd2Var4.e0(-1428196926);
                                            kd2Var4.q(false);
                                            ze0.l();
                                            return obj5;
                                        }
                                    } else {
                                        r12 = 0;
                                        i13 = -1428194769;
                                        i14 = R.string.anilist;
                                    }
                                    String i17 = h11.i(kd2Var4, i13, i14, kd2Var4, r12);
                                    int i18 = iArr[animeListImportProvider.ordinal()];
                                    if (i18 != 1) {
                                        if (i18 == 2) {
                                            kd2Var4.e0(-1428184330);
                                            H = w65.H(R.drawable.myanimelist, kd2Var4, r12);
                                            kd2Var4.q(r12);
                                        } else {
                                            kd2Var4.e0(-1428189272);
                                            kd2Var4.q(r12);
                                            ze0.l();
                                            return obj5;
                                        }
                                    } else {
                                        kd2Var4.e0(-1428187118);
                                        H = w65.H(R.drawable.anilist, kd2Var4, r12);
                                        kd2Var4.q(r12);
                                    }
                                    yz3 e2 = ar5.e(ar5.l(vz3Var2, 170.0f), 45.0f);
                                    boolean f2 = kd2Var4.f(ub2Var4) | kd2Var4.d(animeListImportProvider.ordinal());
                                    Object Q = kd2Var4.Q();
                                    if (f2 || Q == obj4) {
                                        Q = new va1(ub2Var4, animeListImportProvider, (byte) 12);
                                        kd2Var4.n0(Q);
                                    }
                                    yz3 A = kb0.A(e2, false, null, null, false, (sb2) Q, kd2Var4, 6, 31);
                                    if (z5) {
                                        kd2Var4.e0(-1428173125);
                                        tq1Var = op0.a;
                                        j = ((mp0) kd2Var4.j(tq1Var)).o;
                                        z6 = false;
                                        kd2Var4.q(false);
                                    } else {
                                        z6 = false;
                                        kd2Var4.e0(-1428171082);
                                        tq1Var = op0.a;
                                        j = ((mp0) kd2Var4.j(tq1Var)).p;
                                        kd2Var4.q(false);
                                    }
                                    if (z5) {
                                        kd2Var4.e0(-1428168487);
                                        xm6Var2 = xm6Var3;
                                        it = it2;
                                        j2 = ((mp0) kd2Var4.j(tq1Var)).n;
                                        kd2Var4.q(z6);
                                    } else {
                                        xm6Var2 = xm6Var3;
                                        it = it2;
                                        kd2Var4.e0(-1428166501);
                                        j2 = ((mp0) kd2Var4.j(tq1Var)).o;
                                        kd2Var4.q(z6);
                                    }
                                    kd2 kd2Var5 = kd2Var4;
                                    wk6.b(A, null, j, j2, null, nx7.R(273024621, new df(H, animeListImportProvider, i17, (byte) 7), kd2Var4), kd2Var5, 196608, 18);
                                    it2 = it;
                                    kd2Var4 = kd2Var5;
                                    xm6Var3 = xm6Var2;
                                    obj5 = null;
                                }
                            } else {
                                kd2Var3.Y();
                            }
                            return pn6Var;
                        default:
                            kd2 kd2Var6 = (kd2) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((t62) obj).getClass();
                            if ((intValue2 & 17) != 16) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (kd2Var6.V(intValue2 & 1, z7)) {
                                Iterator it3 = WatchStatus.getEntries().iterator();
                                while (it3.hasNext()) {
                                    WatchStatus watchStatus = (WatchStatus) it3.next();
                                    boolean contains = xm6Var3.p.contains(watchStatus);
                                    x50 x50Var = pk2.I;
                                    vr vrVar = new vr(10.0f, z8, new ze0((byte) 6));
                                    yz3 k = n03.k(vz3Var2, ((cn5) kd2Var6.j(dn5.a)).c);
                                    if (contains) {
                                        kd2Var6.e0(-1226977390);
                                        tq1Var2 = op0.a;
                                        j3 = ep0.b(0.15f, ((mp0) kd2Var6.j(tq1Var2)).o);
                                        kd2Var6.q(false);
                                    } else {
                                        kd2Var6.e0(-1226974874);
                                        tq1Var2 = op0.a;
                                        j3 = ((mp0) kd2Var6.j(tq1Var2)).p;
                                        kd2Var6.q(false);
                                    }
                                    tq1 tq1Var3 = tq1Var2;
                                    yz3 h2 = bx7.h(k, j3, io3.h);
                                    boolean f3 = kd2Var6.f(ub2Var4) | kd2Var6.d(watchStatus.ordinal());
                                    Object Q2 = kd2Var6.Q();
                                    if (f3 || Q2 == obj4) {
                                        Q2 = new va1(ub2Var4, watchStatus, (byte) 11);
                                        kd2Var6.n0(Q2);
                                    }
                                    Iterator it4 = it3;
                                    pn6 pn6Var2 = pn6Var;
                                    kd2 kd2Var7 = kd2Var6;
                                    yz3 S = n77.S(kb0.A(h2, false, null, null, false, (sb2) Q2, kd2Var7, 0, 31), 12.0f, 10.0f);
                                    z75 a4 = y75.a(vrVar, x50Var, kd2Var7, 54);
                                    int hashCode3 = Long.hashCode(kd2Var7.T);
                                    al4 l3 = kd2Var7.l();
                                    yz3 E3 = o80.E(kd2Var7, S);
                                    tt0.d.getClass();
                                    kd2Var7.h0();
                                    if (kd2Var7.S) {
                                        kd2Var7.k(za3.p0);
                                    } else {
                                        kd2Var7.q0();
                                    }
                                    ss5.i(p7.F, kd2Var7, a4);
                                    ss5.i(p7.E, kd2Var7, l3);
                                    ss5.i(p7.G, kd2Var7, Integer.valueOf(hashCode3));
                                    ss5.h(kd2Var7);
                                    ss5.i(p7.D, kd2Var7, E3);
                                    boolean f4 = kd2Var7.f(ub2Var4) | kd2Var7.d(watchStatus.ordinal());
                                    Object Q3 = kd2Var7.Q();
                                    if (!f4 && Q3 != obj4) {
                                        i15 = 0;
                                    } else {
                                        i15 = 0;
                                        Q3 = new fx2(ub2Var4, watchStatus, (byte) 0);
                                        kd2Var7.n0(Q3);
                                    }
                                    h98.a(contains, (ub2) Q3, null, kd2Var7, i15);
                                    yc6.b(watchStatus.getLabel(), null, ((mp0) kd2Var7.j(tq1Var3)).o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var7.j(pl6.a)).k, kd2Var7, 0, 0, 131066);
                                    kd2Var7.q(true);
                                    z8 = true;
                                    kd2Var6 = kd2Var7;
                                    pn6Var = pn6Var2;
                                    it3 = it4;
                                }
                                return pn6Var;
                            }
                            kd2Var6.Y();
                            return pn6Var;
                    }
                }
            }, kd2Var), kd2Var, 1573302, 56);
            ov5.a(kd2Var, ar5.e(vz3Var, 24.0f));
            String f2 = lz5.f(R.string.username, kd2Var);
            if (xm6Var.q == AnimeListImportProvider.ANILIST) {
                i4 = R.string.anilist_username;
            } else {
                i4 = R.string.mal_username;
            }
            int i13 = i12 >> 3;
            o80.a(str, ub2Var, null, f2, lz5.f(i4, kd2Var), null, 7, new o83(0, 0, 126), null, t80.b, nx7.R(1973425173, new q(str, ub2Var, (byte) 20), kd2Var), false, kd2Var, (i13 & 14) | 819462144 | (i13 & 112), 6, 2340);
            ov5.a(kd2Var, ar5.e(vz3Var, 24.0f));
            yz3 c2 = ar5.c(vz3Var, 1.0f);
            byte b3 = 6;
            xp0 a4 = vp0.a(x97.R(8.0f), w50Var, kd2Var, 6);
            int hashCode3 = Long.hashCode(kd2Var.T);
            al4 l3 = kd2Var.l();
            yz3 E3 = o80.E(kd2Var, c2);
            kd2Var.h0();
            if (kd2Var.S) {
                t53Var = t53Var2;
                kd2Var.k(t53Var);
            } else {
                t53Var = t53Var2;
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, a4);
            ss5.i(ys0Var, kd2Var, l3);
            h11.q(hashCode3, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E3);
            yz3 c3 = ar5.c(vz3Var, 1.0f);
            z75 a5 = y75.a(x97.B, pk2.I, kd2Var, 54);
            int hashCode4 = Long.hashCode(kd2Var.T);
            al4 l4 = kd2Var.l();
            yz3 E4 = o80.E(kd2Var, c3);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, a5);
            ss5.i(ys0Var, kd2Var, l4);
            h11.q(hashCode4, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E4);
            yc6.b(lz5.f(R.string.clean_import, kd2Var), null, n03.r(kd2Var).o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, n03.y(kd2Var).h, kd2Var, 0, 0, 131066);
            boolean z4 = xm6Var.o;
            if ((i12 & 57344) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object Q = kd2Var.Q();
            if (z2 || Q == au0.a) {
                Q = new mm(sb2Var, b3);
                kd2Var.n0(Q);
            }
            sw0.a(z4, (ub2) Q, null, false, kd2Var, 0, 12);
            final byte b4 = 1;
            kd2Var.q(true);
            yc6.b(lz5.f(R.string.delete_your_existing_anime, kd2Var), null, ep0.b(0.6f, n03.r(kd2Var).o), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, n03.y(kd2Var).k, kd2Var, 0, 0, 131066);
            kd2Var.q(true);
            ov5.a(kd2Var, ar5.e(vz3Var, 28.0f));
            yc6.b(lz5.f(R.string.status_filter, kd2Var), null, n03.r(kd2Var).o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, n03.y(kd2Var).h, kd2Var, 0, 0, 131066);
            ov5.a(kd2Var, ar5.e(vz3Var, 14.0f));
            q23.b(ar5.c(vz3Var, 1.0f), x97.R(10.0f), x97.R(10.0f), null, 0, 0, nx7.R(1065329929, new jc2() { // from class: dx2
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v0 */
                /* JADX WARN: Type inference failed for: r12v1, types: [int, boolean] */
                /* JADX WARN: Type inference failed for: r12v9 */
                @Override // defpackage.jc2
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z42;
                    boolean z5;
                    ?? r12;
                    int i132;
                    int i14;
                    xh4 H;
                    boolean z6;
                    tq1 tq1Var;
                    long j;
                    xm6 xm6Var2;
                    Iterator it;
                    long j2;
                    boolean z7;
                    tq1 tq1Var2;
                    long j3;
                    int i15;
                    byte b32 = b4;
                    pn6 pn6Var = pn6.a;
                    vz3 vz3Var2 = vz3.x;
                    boolean z8 = true;
                    Object obj4 = au0.a;
                    ub2 ub2Var4 = ub2Var3;
                    xm6 xm6Var3 = xm6Var;
                    switch (b32) {
                        case 0:
                            Object obj5 = null;
                            kd2 kd2Var3 = (kd2) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((t62) obj).getClass();
                            if ((intValue & 17) != 16) {
                                z42 = true;
                            } else {
                                z42 = false;
                            }
                            if (kd2Var3.V(intValue & 1, z42)) {
                                Iterator it2 = AnimeListImportProvider.getEntries().iterator();
                                kd2 kd2Var4 = kd2Var3;
                                while (it2.hasNext()) {
                                    AnimeListImportProvider animeListImportProvider = (AnimeListImportProvider) it2.next();
                                    if (animeListImportProvider == xm6Var3.q) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    int[] iArr = gx2.a;
                                    int i16 = iArr[animeListImportProvider.ordinal()];
                                    if (i16 != 1) {
                                        if (i16 == 2) {
                                            i132 = -1428192077;
                                            i14 = R.string.myanimelist;
                                            r12 = 0;
                                        } else {
                                            kd2Var4.e0(-1428196926);
                                            kd2Var4.q(false);
                                            ze0.l();
                                            return obj5;
                                        }
                                    } else {
                                        r12 = 0;
                                        i132 = -1428194769;
                                        i14 = R.string.anilist;
                                    }
                                    String i17 = h11.i(kd2Var4, i132, i14, kd2Var4, r12);
                                    int i18 = iArr[animeListImportProvider.ordinal()];
                                    if (i18 != 1) {
                                        if (i18 == 2) {
                                            kd2Var4.e0(-1428184330);
                                            H = w65.H(R.drawable.myanimelist, kd2Var4, r12);
                                            kd2Var4.q(r12);
                                        } else {
                                            kd2Var4.e0(-1428189272);
                                            kd2Var4.q(r12);
                                            ze0.l();
                                            return obj5;
                                        }
                                    } else {
                                        kd2Var4.e0(-1428187118);
                                        H = w65.H(R.drawable.anilist, kd2Var4, r12);
                                        kd2Var4.q(r12);
                                    }
                                    yz3 e2 = ar5.e(ar5.l(vz3Var2, 170.0f), 45.0f);
                                    boolean f22 = kd2Var4.f(ub2Var4) | kd2Var4.d(animeListImportProvider.ordinal());
                                    Object Q2 = kd2Var4.Q();
                                    if (f22 || Q2 == obj4) {
                                        Q2 = new va1(ub2Var4, animeListImportProvider, (byte) 12);
                                        kd2Var4.n0(Q2);
                                    }
                                    yz3 A = kb0.A(e2, false, null, null, false, (sb2) Q2, kd2Var4, 6, 31);
                                    if (z5) {
                                        kd2Var4.e0(-1428173125);
                                        tq1Var = op0.a;
                                        j = ((mp0) kd2Var4.j(tq1Var)).o;
                                        z6 = false;
                                        kd2Var4.q(false);
                                    } else {
                                        z6 = false;
                                        kd2Var4.e0(-1428171082);
                                        tq1Var = op0.a;
                                        j = ((mp0) kd2Var4.j(tq1Var)).p;
                                        kd2Var4.q(false);
                                    }
                                    if (z5) {
                                        kd2Var4.e0(-1428168487);
                                        xm6Var2 = xm6Var3;
                                        it = it2;
                                        j2 = ((mp0) kd2Var4.j(tq1Var)).n;
                                        kd2Var4.q(z6);
                                    } else {
                                        xm6Var2 = xm6Var3;
                                        it = it2;
                                        kd2Var4.e0(-1428166501);
                                        j2 = ((mp0) kd2Var4.j(tq1Var)).o;
                                        kd2Var4.q(z6);
                                    }
                                    kd2 kd2Var5 = kd2Var4;
                                    wk6.b(A, null, j, j2, null, nx7.R(273024621, new df(H, animeListImportProvider, i17, (byte) 7), kd2Var4), kd2Var5, 196608, 18);
                                    it2 = it;
                                    kd2Var4 = kd2Var5;
                                    xm6Var3 = xm6Var2;
                                    obj5 = null;
                                }
                            } else {
                                kd2Var3.Y();
                            }
                            return pn6Var;
                        default:
                            kd2 kd2Var6 = (kd2) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((t62) obj).getClass();
                            if ((intValue2 & 17) != 16) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (kd2Var6.V(intValue2 & 1, z7)) {
                                Iterator it3 = WatchStatus.getEntries().iterator();
                                while (it3.hasNext()) {
                                    WatchStatus watchStatus = (WatchStatus) it3.next();
                                    boolean contains = xm6Var3.p.contains(watchStatus);
                                    x50 x50Var = pk2.I;
                                    vr vrVar = new vr(10.0f, z8, new ze0((byte) 6));
                                    yz3 k = n03.k(vz3Var2, ((cn5) kd2Var6.j(dn5.a)).c);
                                    if (contains) {
                                        kd2Var6.e0(-1226977390);
                                        tq1Var2 = op0.a;
                                        j3 = ep0.b(0.15f, ((mp0) kd2Var6.j(tq1Var2)).o);
                                        kd2Var6.q(false);
                                    } else {
                                        kd2Var6.e0(-1226974874);
                                        tq1Var2 = op0.a;
                                        j3 = ((mp0) kd2Var6.j(tq1Var2)).p;
                                        kd2Var6.q(false);
                                    }
                                    tq1 tq1Var3 = tq1Var2;
                                    yz3 h2 = bx7.h(k, j3, io3.h);
                                    boolean f3 = kd2Var6.f(ub2Var4) | kd2Var6.d(watchStatus.ordinal());
                                    Object Q22 = kd2Var6.Q();
                                    if (f3 || Q22 == obj4) {
                                        Q22 = new va1(ub2Var4, watchStatus, (byte) 11);
                                        kd2Var6.n0(Q22);
                                    }
                                    Iterator it4 = it3;
                                    pn6 pn6Var2 = pn6Var;
                                    kd2 kd2Var7 = kd2Var6;
                                    yz3 S = n77.S(kb0.A(h2, false, null, null, false, (sb2) Q22, kd2Var7, 0, 31), 12.0f, 10.0f);
                                    z75 a42 = y75.a(vrVar, x50Var, kd2Var7, 54);
                                    int hashCode32 = Long.hashCode(kd2Var7.T);
                                    al4 l32 = kd2Var7.l();
                                    yz3 E32 = o80.E(kd2Var7, S);
                                    tt0.d.getClass();
                                    kd2Var7.h0();
                                    if (kd2Var7.S) {
                                        kd2Var7.k(za3.p0);
                                    } else {
                                        kd2Var7.q0();
                                    }
                                    ss5.i(p7.F, kd2Var7, a42);
                                    ss5.i(p7.E, kd2Var7, l32);
                                    ss5.i(p7.G, kd2Var7, Integer.valueOf(hashCode32));
                                    ss5.h(kd2Var7);
                                    ss5.i(p7.D, kd2Var7, E32);
                                    boolean f4 = kd2Var7.f(ub2Var4) | kd2Var7.d(watchStatus.ordinal());
                                    Object Q3 = kd2Var7.Q();
                                    if (!f4 && Q3 != obj4) {
                                        i15 = 0;
                                    } else {
                                        i15 = 0;
                                        Q3 = new fx2(ub2Var4, watchStatus, (byte) 0);
                                        kd2Var7.n0(Q3);
                                    }
                                    h98.a(contains, (ub2) Q3, null, kd2Var7, i15);
                                    yc6.b(watchStatus.getLabel(), null, ((mp0) kd2Var7.j(tq1Var3)).o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var7.j(pl6.a)).k, kd2Var7, 0, 0, 131066);
                                    kd2Var7.q(true);
                                    z8 = true;
                                    kd2Var6 = kd2Var7;
                                    pn6Var = pn6Var2;
                                    it3 = it4;
                                }
                                return pn6Var;
                            }
                            kd2Var6.Y();
                            return pn6Var;
                    }
                }
            }, kd2Var), kd2Var, 1573302, 56);
            ov5.a(kd2Var, ar5.e(vz3Var, 30.0f));
            String f3 = lz5.f(R.string.import_list, kd2Var);
            yz3 c4 = ar5.c(vz3Var, 1.0f);
            boolean z5 = xm6Var.y;
            nx7.a(f3, c4, null, null, !z5, z5, 0.0f, 0L, 0L, n03.y(kd2Var).j, null, sb2Var2, kd2Var, 48, (i12 >> 12) & 896, 3020);
            kd2Var2 = kd2Var;
            kd2Var2.q(true);
            yz3Var2 = vz3Var;
        } else {
            kd2Var2.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new ic2() { // from class: ex2
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    oi4.c(xm6.this, str, ub2Var, ub2Var2, sb2Var, ub2Var3, sb2Var2, yz3Var2, (kd2) obj, kb0.N(i2 | 1));
                    return pn6.a;
                }
            };
        }
    }

    public static final void d(w74 w74Var, boolean z, sb2 sb2Var, sb2 sb2Var2, kd2 kd2Var, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        kd2Var.f0(1220469155);
        if ((i2 & 6) == 0) {
            if (kd2Var.f(w74Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.g(z)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (kd2Var.h(sb2Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (kd2Var.h(sb2Var2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i3 & 1, z2)) {
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (Q == q18Var) {
                Q = new t53((byte) 24);
                kd2Var.n0(Q);
            }
            sb2 sb2Var3 = (sb2) Q;
            Object Q2 = kd2Var.Q();
            if (Q2 == q18Var) {
                Q2 = new t53((byte) 26);
                kd2Var.n0(Q2);
            }
            int i8 = (i3 & 14) | 3504;
            int i9 = i3 << 9;
            e(w74Var, false, sb2Var3, (sb2) Q2, z, sb2Var, sb2Var2, kd2Var, (i9 & 3670016) | i8 | (57344 & i9) | (458752 & i9));
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new p74(w74Var, z, sb2Var, sb2Var2, i2);
        }
    }

    public static final void e(final w74 w74Var, final boolean z, final sb2 sb2Var, final sb2 sb2Var2, final boolean z2, final sb2 sb2Var3, final sb2 sb2Var4, kd2 kd2Var, final int i2) {
        int i3;
        final sb2 sb2Var5;
        sb2 sb2Var6;
        boolean z3;
        sb2 sb2Var7;
        sb2 sb2Var8;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        kd2Var.f0(898330592);
        if ((i2 & 6) == 0) {
            if (kd2Var.f(w74Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.g(z)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        if ((i2 & 384) == 0) {
            sb2Var5 = sb2Var;
            if (kd2Var.h(sb2Var5)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        } else {
            sb2Var5 = sb2Var;
        }
        if ((i2 & 3072) == 0) {
            sb2Var6 = sb2Var2;
            if (kd2Var.h(sb2Var6)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        } else {
            sb2Var6 = sb2Var2;
        }
        if ((i2 & 24576) == 0) {
            z3 = z2;
            if (kd2Var.g(z3)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        } else {
            z3 = z2;
        }
        if ((196608 & i2) == 0) {
            sb2Var7 = sb2Var3;
            if (kd2Var.h(sb2Var7)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        } else {
            sb2Var7 = sb2Var3;
        }
        if ((1572864 & i2) == 0) {
            sb2Var8 = sb2Var4;
            if (kd2Var.h(sb2Var8)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        } else {
            sb2Var8 = sb2Var4;
        }
        boolean z13 = false;
        if ((i3 & 599187) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (kd2Var.V(i3 & 1, z4)) {
            n74 n74Var = (n74) kd2Var.j(zj3.a);
            if (n74Var != null) {
                Object navigationEventDispatcher = n74Var.getNavigationEventDispatcher();
                int i11 = i3 & 14;
                if (i11 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Object Q = kd2Var.Q();
                Object obj2 = au0.a;
                if (z5 || Q == obj2) {
                    Q = new ht0((t74) w74Var.c.getValue(), new pz3((Object) w74Var, (byte) 3));
                    kd2Var.n0(Q);
                }
                final ht0 ht0Var = (ht0) Q;
                boolean h2 = kd2Var.h(ht0Var);
                if ((i3 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z14 = h2 | z6;
                if ((i3 & 896) == 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z15 = z14 | z7;
                if ((i3 & 7168) == 2048) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z16 = z15 | z8;
                if ((57344 & i3) == 16384) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z17 = z16 | z9;
                if ((458752 & i3) == 131072) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z18 = z17 | z10;
                if ((i3 & 3670016) == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z19 = z11 | z18;
                if (i11 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z20 = z19 | z12;
                Object Q2 = kd2Var.Q();
                if (!z20 && Q2 != obj2) {
                    obj = obj2;
                } else {
                    final sb2 sb2Var9 = sb2Var6;
                    obj = obj2;
                    final boolean z21 = z3;
                    final sb2 sb2Var10 = sb2Var7;
                    final sb2 sb2Var11 = sb2Var8;
                    Object obj3 = new sb2() { // from class: q74
                        @Override // defpackage.sb2
                        public final Object invoke() {
                            ht0 ht0Var2 = ht0.this;
                            boolean z22 = ht0Var2.f;
                            boolean z23 = z;
                            if (z22 != z23) {
                                ht0Var2.f = z23;
                                m74 m74Var = ht0Var2.g;
                                if (m74Var != null) {
                                    m74Var.b.b();
                                }
                            }
                            ht0Var2.i = sb2Var5;
                            ht0Var2.g(z21);
                            ht0Var2.j = sb2Var10;
                            ht0Var2.k = sb2Var11;
                            w74 w74Var2 = w74Var;
                            t74 t74Var = (t74) w74Var2.c.getValue();
                            List list = (List) w74Var2.b.getValue();
                            List list2 = (List) w74Var2.d.getValue();
                            t74Var.getClass();
                            list.getClass();
                            list2.getClass();
                            ht0Var2.a = t74Var;
                            ht0Var2.b = list;
                            ht0Var2.c = list2;
                            m74 m74Var2 = ht0Var2.g;
                            if (m74Var2 != null) {
                                m74Var2.b.d(ht0Var2);
                            }
                            return pn6.a;
                        }
                    };
                    kd2Var.n0(obj3);
                    Q2 = obj3;
                }
                db.m((sb2) Q2, kd2Var);
                if (i11 == 4) {
                    z13 = true;
                }
                boolean h3 = z13 | kd2Var.h(ht0Var) | kd2Var.h(navigationEventDispatcher);
                Object Q3 = kd2Var.Q();
                if (h3 || Q3 == obj) {
                    Q3 = new bg((Object) w74Var, (Object) ht0Var, navigationEventDispatcher, (byte) 20);
                    kd2Var.n0(Q3);
                }
                db.c(w74Var, (ub2) Q3, kd2Var);
            } else {
                ze0.m("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                return;
            }
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: r74
                @Override // defpackage.ic2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    oi4.e(w74.this, z, sb2Var, sb2Var2, z2, sb2Var3, sb2Var4, (kd2) obj4, kb0.N(i2 | 1));
                    return pn6.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final java.lang.String r45, final java.lang.String r46, final int r47, final boolean r48, final defpackage.ub2 r49, defpackage.yz3 r50, boolean r51, defpackage.th4 r52, defpackage.kd2 r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi4.f(java.lang.String, java.lang.String, int, boolean, ub2, yz3, boolean, th4, kd2, int, int):void");
    }

    public static yz3 g(yz3 yz3Var) {
        Map map = sw6.a;
        return n03.l(yz3Var).w(new vq5(z51.O(0.0f, 400.0f, new k13(4294967297L), 1)));
    }

    public static final Bitmap h(pc pcVar) {
        if (pcVar instanceof pc) {
            return pcVar.a;
        }
        ov3.g("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static final int i(yl3 yl3Var, f7 f7Var) {
        long z0;
        yl3 o0 = yl3Var.o0();
        if (o0 == null) {
            ez2.b("Child of " + yl3Var + " cannot be null when calculating alignment line");
        }
        if (yl3Var.u0().a().containsKey(f7Var)) {
            Integer num = (Integer) yl3Var.u0().a().get(f7Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int P = o0.P(f7Var);
            if (P != Integer.MIN_VALUE) {
                boolean z = yl3Var.K;
                boolean z2 = yl3Var.L;
                o0.K = true;
                yl3Var.L = true;
                yl3Var.K0();
                o0.K = z;
                yl3Var.L = z2;
                if (f7Var instanceof vn2) {
                    z0 = o0.z0() & 4294967295L;
                } else {
                    z0 = o0.z0() >> 32;
                }
                return P + ((int) z0);
            }
        }
        return Integer.MIN_VALUE;
    }

    public static int j(int i2, int i3) {
        boolean z;
        long j = i2 + i3;
        int i4 = (int) j;
        if (j == i4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return i4;
        }
        throw new ArithmeticException(qx1.l("overflow: checkedAdd(", i2, ", ", i3, ")"));
    }

    public static final long k(int i2, int i3, tq5 tq5Var, xa5 xa5Var, tq5 tq5Var2) {
        int i4;
        int i5;
        if (!a34.i(tq5Var, tq5.c)) {
            i2 = K(tq5Var.a, xa5Var);
            i3 = K(tq5Var.b, xa5Var);
        }
        mg1 mg1Var = tq5Var2.a;
        mg1 mg1Var2 = tq5Var2.b;
        if ((mg1Var instanceof kg1) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i5 = ((kg1) mg1Var).a)) {
            i2 = i5;
        }
        if ((mg1Var2 instanceof kg1) && i3 != Integer.MIN_VALUE && i3 != Integer.MAX_VALUE && i3 > (i4 = ((kg1) mg1Var2).a)) {
            i3 = i4;
        }
        return (i3 & 4294967295L) | (i2 << 32);
    }

    public static final double l(int i2, int i3, int i4, int i5, xa5 xa5Var, tq5 tq5Var) {
        double max;
        double d2 = i2;
        double d3 = i4 / d2;
        double d4 = i3;
        double d5 = i5 / d4;
        int ordinal = xa5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                max = Math.min(d3, d5);
            } else {
                ze0.l();
                return 0.0d;
            }
        } else {
            max = Math.max(d3, d5);
        }
        if (tq5Var.a instanceof kg1) {
            double d6 = ((kg1) r9).a / d2;
            if (max > d6) {
                max = d6;
            }
        }
        if (tq5Var.b instanceof kg1) {
            double d7 = ((kg1) r9).a / d4;
            if (max > d7) {
                return d7;
            }
        }
        return max;
    }

    public static Bitmap m(byte[] bArr, int i2, BitmapFactory.Options options, int i3) {
        int i4 = 0;
        int i5 = 1;
        if (i3 != -1) {
            if (options == null) {
                options = new BitmapFactory.Options();
            }
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i2, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int max = Math.max(options.outWidth, options.outHeight); max > i3; max /= 2) {
                options.inSampleSize *= 2;
            }
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i2, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (decodeByteArray != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                lx1 lx1Var = new lx1(byteArrayInputStream);
                byteArrayInputStream.close();
                hx1 c2 = lx1Var.c("Orientation");
                if (c2 != null) {
                    try {
                        i5 = c2.e(lx1Var.f);
                    } catch (NumberFormatException unused) {
                    }
                }
                switch (i5) {
                    case 3:
                    case 4:
                        i4 = 180;
                        break;
                    case 5:
                    case 8:
                        i4 = 270;
                        break;
                    case 6:
                    case 7:
                        i4 = 90;
                        break;
                }
                if (i4 != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i4);
                    return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
                }
                return decodeByteArray;
            } finally {
            }
        } else {
            throw bj4.a("Could not decode image data", new IllegalStateException());
        }
    }

    public static final void n(vz0 vz0Var, Throwable th) {
        if (th instanceof ih1) {
            th = ((ih1) th).x;
        }
        vz0Var.resumeWith(new y45(th));
        throw th;
    }

    public static int o(int i2, int i3) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i3 != 0) {
            int i4 = i2 / i3;
            int i5 = i2 - (i3 * i4);
            if (i5 != 0) {
                boolean z = true;
                int i6 = ((i2 ^ i3) >> 31) | 1;
                switch (z03.a[roundingMode.ordinal()]) {
                    case 1:
                        if (i5 != 0) {
                            z = false;
                        }
                        a34.z(z);
                        return i4;
                    case 2:
                        return i4;
                    case 3:
                        if (i6 >= 0) {
                            return i4;
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                        if (i6 <= 0) {
                            return i4;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int abs = Math.abs(i5);
                        int abs2 = abs - (Math.abs(i3) - abs);
                        if (abs2 == 0) {
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                            return i4;
                        }
                        if (abs2 <= 0) {
                            return i4;
                        }
                        break;
                    default:
                        p65.o();
                        return 0;
                }
                return i4 + i6;
            }
            return i4;
        }
        throw new ArithmeticException("/ by zero");
    }

    public static final Object p(w41 w41Var, ic2 ic2Var, xz0 xz0Var) {
        return w41Var.a(new ps4(ic2Var, null, (byte) 1), xz0Var);
    }

    public static kq3 q(q41 q41Var, String str, byte[] bArr, Map map) {
        Throwable th;
        Map map2;
        List list;
        byte[] b2;
        v41 v41Var;
        iy5 iy5Var = new iy5(q41Var);
        Map map3 = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        io3.w(parse, "The uri must be set.");
        v41 v41Var2 = new v41(parse, 0L, 2, bArr, map, 0L, -1L, null, 1);
        boolean z = false;
        int i2 = 0;
        v41 v41Var3 = v41Var2;
        while (true) {
            try {
                t41 t41Var = new t41(iy5Var, v41Var3);
                try {
                    b2 = pd0.b(t41Var);
                    v41Var = v41Var2;
                } catch (oq2 e2) {
                    e = e2;
                }
                try {
                    hj3 hj3Var = new hj3(-1L, v41Var, SystemClock.elapsedRealtime());
                    hj3Var.f = iy5Var.z;
                    hj3Var.g = iy5Var.A;
                    hj3Var.d = b2.length;
                    ij3 ij3Var = new ij3(hj3Var);
                    l33 l33Var = new l33((byte) 3, (Object) b2, z);
                    l33Var.z = ij3Var;
                    kq3 kq3Var = new kq3(l33Var);
                    eq6.h(t41Var);
                    return kq3Var;
                } catch (oq2 e3) {
                    e = e3;
                    v41Var2 = v41Var;
                    try {
                        int i3 = e.z;
                        String str2 = null;
                        if ((i3 == 307 || i3 == 308) && i2 < 5 && (map2 = e.A) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(0);
                        }
                        if (str2 != null) {
                            i2++;
                            u41 a2 = v41Var3.a();
                            a2.a = Uri.parse(str2);
                            v41Var3 = a2.a();
                            eq6.h(t41Var);
                        } else {
                            throw e;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        Throwable th3 = th;
                        eq6.h(t41Var);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th32 = th;
                    eq6.h(t41Var);
                    throw th32;
                }
                eq6.h(t41Var);
            } catch (Exception e4) {
                throw new lq3(v41Var2, iy5Var.z, iy5Var.x.s(), iy5Var.y, e4);
            }
        }
    }

    public static final String r(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final Rect s(TextPaint textPaint, CharSequence charSequence, int i2, int i3) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i2 - 1, i3, MetricAffectingSpan.class) != i3) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i2 < i3) {
                    int nextSpanTransition = spanned.nextSpanTransition(i2, i3, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i2, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    textPaint2.getTextBounds(charSequence, i2, nextSpanTransition, rect2);
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i2 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        textPaint.getTextBounds(charSequence, i2, i3, rect3);
        return rect3;
    }

    public static Drawable t(Context context, int i2) {
        return h45.c().d(context, i2);
    }

    public static final gg3 u(og3 og3Var) {
        og3Var.getClass();
        fg3 lifecycle = og3Var.getLifecycle();
        lifecycle.getClass();
        cn7 cn7Var = lifecycle.a;
        while (true) {
            gg3 gg3Var = (gg3) ((AtomicReference) cn7Var.x).get();
            if (gg3Var != null) {
                return gg3Var;
            }
            q26 a2 = iv5.a();
            ja1 ja1Var = rh1.a;
            gg3 gg3Var2 = new gg3(lifecycle, tl7.L(a2, qm3.a.B));
            AtomicReference atomicReference = (AtomicReference) cn7Var.x;
            do {
                vz0 vz0Var = null;
                if (atomicReference.compareAndSet(null, gg3Var2)) {
                    ja1 ja1Var2 = rh1.a;
                    tl7.z(gg3Var2, qm3.a.B, null, new yh(gg3Var2, vz0Var, (byte) 13), 2);
                    return gg3Var2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static ds6 v(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 != null) {
                bundle2.setClassLoader(oi4.class.getClassLoader());
                Parcelable parcelable = bundle2.getParcelable("a");
                if (parcelable instanceof ParcelImpl) {
                    return ((ParcelImpl) parcelable).x;
                }
                throw new IllegalArgumentException("Invalid parcel");
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static boolean w(Throwable th) {
        if (Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(")) {
            return true;
        }
        return false;
    }

    public static boolean x(Throwable th) {
        if (Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(")) {
            return true;
        }
        return false;
    }

    public static int y(int i2) {
        boolean z;
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i2 > 0) {
            boolean z2 = true;
            switch (z03.a[roundingMode.ordinal()]) {
                case 1:
                    if (i2 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (((i2 - 1) & i2) != 0) {
                        z2 = false;
                    }
                    a34.z(z & z2);
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    return 32 - Integer.numberOfLeadingZeros(i2 - 1);
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
                    return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i2))) >>> 31);
                default:
                    p65.o();
                    return 0;
            }
            return 31 - Integer.numberOfLeadingZeros(i2);
        }
        ze0.k(qx1.i(i2, "x (", ") must be > 0"));
        return 0;
    }

    public static final yz3 z(yz3 yz3Var, ub2 ub2Var) {
        return yz3Var.w(new bd4(ub2Var));
    }
}
