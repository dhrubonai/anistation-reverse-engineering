package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qk7 {
    public static final String A;
    public final zk3 a;
    public final String b;
    public xf6 c;
    public final List d;
    public long e;
    public bx3 f;
    public Long g;
    public fq3 h;
    public int i;
    public final bl7 j;
    public final bl7 k;
    public final bl7 l;
    public final bl7 m;
    public final bl7 n;
    public final bl7 o;
    public final bl7 p;
    public final bl7 q;
    public final bl7 r;
    public final bl7 s;
    public final bl7 t;
    public final bl7 u;
    public final bl7 v;
    public final bl7 w;
    public final bl7 x;
    public final bl7 y;
    public final bl7 z;

    static {
        Pattern pattern = qi0.a;
        A = "urn:x-cast:com.google.cast.media";
    }

    public qk7() {
        String str = A;
        qi0.b(str);
        this.b = str;
        this.a = new zk3("MediaControlChannel", null);
        this.d = Collections.synchronizedList(new ArrayList());
        this.i = -1;
        bl7 bl7Var = new bl7(86400000L, "load");
        this.j = bl7Var;
        bl7 bl7Var2 = new bl7(86400000L, "pause");
        this.k = bl7Var2;
        bl7 bl7Var3 = new bl7(86400000L, "play");
        this.l = bl7Var3;
        bl7 bl7Var4 = new bl7(86400000L, "stop");
        this.m = bl7Var4;
        bl7 bl7Var5 = new bl7(10000L, "seek");
        this.n = bl7Var5;
        bl7 bl7Var6 = new bl7(86400000L, "volume");
        this.o = bl7Var6;
        bl7 bl7Var7 = new bl7(86400000L, "mute");
        this.p = bl7Var7;
        bl7 bl7Var8 = new bl7(86400000L, "status");
        this.q = bl7Var8;
        bl7 bl7Var9 = new bl7(86400000L, "activeTracks");
        this.r = bl7Var9;
        bl7 bl7Var10 = new bl7(86400000L, "trackStyle");
        bl7 bl7Var11 = new bl7(86400000L, "queueInsert");
        this.s = bl7Var11;
        bl7 bl7Var12 = new bl7(86400000L, "queueUpdate");
        this.t = bl7Var12;
        bl7 bl7Var13 = new bl7(86400000L, "queueRemove");
        this.u = bl7Var13;
        bl7 bl7Var14 = new bl7(86400000L, "queueReorder");
        this.v = bl7Var14;
        bl7 bl7Var15 = new bl7(86400000L, "queueFetchItemIds");
        this.w = bl7Var15;
        bl7 bl7Var16 = new bl7(86400000L, "queueFetchItemRange");
        this.y = bl7Var16;
        this.x = new bl7(86400000L, "queueFetchItems");
        bl7 bl7Var17 = new bl7(86400000L, "setPlaybackRate");
        this.z = bl7Var17;
        bl7 bl7Var18 = new bl7(86400000L, "skipAd");
        l(bl7Var);
        l(bl7Var2);
        l(bl7Var3);
        l(bl7Var4);
        l(bl7Var5);
        l(bl7Var6);
        l(bl7Var7);
        l(bl7Var8);
        l(bl7Var9);
        l(bl7Var10);
        l(bl7Var11);
        l(bl7Var12);
        l(bl7Var13);
        l(bl7Var14);
        l(bl7Var15);
        l(bl7Var16);
        l(bl7Var16);
        l(bl7Var17);
        l(bl7Var18);
        j();
    }

    public static int[] e(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    public static y95 k(JSONObject jSONObject) {
        MediaError.c(jSONObject);
        y95 y95Var = new y95((byte) 12);
        Pattern pattern = qi0.a;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return y95Var;
    }

    public final void a(wk7 wk7Var, int i, long j, int i2, Integer num) {
        boolean z;
        if (j != -1 && j < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 33);
            sb.append("playPosition cannot be negative: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        JSONObject jSONObject = new JSONObject();
        long n = n();
        try {
            jSONObject.put("requestId", n);
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", b());
            if (i != 0) {
                jSONObject.put("currentItemId", i);
            }
            if (i2 != 0) {
                jSONObject.put("jump", i2);
            }
            String M = wk6.M(num);
            if (M != null) {
                jSONObject.put("repeatMode", M);
            }
            if (j != -1) {
                Pattern pattern = qi0.a;
                jSONObject.put("currentTime", j / 1000.0d);
            }
            int i3 = this.i;
            if (i3 != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                jSONObject.put("sequenceNumber", i3);
            }
        } catch (JSONException unused) {
        }
        m(n, jSONObject.toString());
        this.t.a(n, new fk7(this, wk7Var));
    }

    public final long b() {
        bx3 bx3Var = this.f;
        if (bx3Var != null) {
            return bx3Var.y;
        }
        throw new Exception();
    }

    public final long c(double d, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j;
        }
        long j3 = j + ((long) (elapsedRealtime * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 < 0) {
            return 0L;
        }
        return j3;
    }

    public final void d(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.i = jSONObject.optInt("sequenceNumber", -1);
        } else {
            zk3 zk3Var = this.a;
            Log.w(zk3Var.a, zk3Var.c(str.concat(" message is missing a sequence number."), new Object[0]));
        }
    }

    public final void f() {
        fq3 fq3Var = this.h;
        if (fq3Var != null) {
            s25 s25Var = (s25) fq3Var.y;
            for (km7 km7Var : s25Var.j.values()) {
                if (s25Var.h() && !km7Var.d) {
                    s25 s25Var2 = km7Var.e;
                    h15 h15Var = s25Var2.b;
                    gm7 gm7Var = km7Var.c;
                    h15Var.removeCallbacks(gm7Var);
                    km7Var.d = true;
                    s25Var2.b.postDelayed(gm7Var, km7Var.b);
                } else if (!s25Var.h() && km7Var.d) {
                    km7Var.e.b.removeCallbacks(km7Var.c);
                    km7Var.d = false;
                }
                if (km7Var.d && (s25Var.i() || s25Var.u() || s25Var.l() || s25Var.k())) {
                    s25Var.y(km7Var.a);
                }
            }
            Iterator it = s25Var.g.iterator();
            if (!it.hasNext()) {
                Iterator it2 = s25Var.h.iterator();
                while (it2.hasNext()) {
                    ((r25) it2.next()).o();
                }
                return;
            }
            throw qx1.f(it);
        }
    }

    public final void g() {
        fq3 fq3Var = this.h;
        if (fq3Var != null) {
            s25 s25Var = (s25) fq3Var.y;
            Iterator it = s25Var.g.iterator();
            if (!it.hasNext()) {
                Iterator it2 = s25Var.h.iterator();
                while (it2.hasNext()) {
                    ((r25) it2.next()).l();
                }
                return;
            }
            throw qx1.f(it);
        }
    }

    public final void h() {
        fq3 fq3Var = this.h;
        if (fq3Var != null) {
            s25 s25Var = (s25) fq3Var.y;
            Iterator it = s25Var.g.iterator();
            if (!it.hasNext()) {
                Iterator it2 = s25Var.h.iterator();
                while (it2.hasNext()) {
                    ((r25) it2.next()).n();
                }
                return;
            }
            throw qx1.f(it);
        }
    }

    public final void i() {
        fq3 fq3Var = this.h;
        if (fq3Var != null) {
            s25 s25Var = (s25) fq3Var.y;
            Iterator it = s25Var.g.iterator();
            if (!it.hasNext()) {
                Iterator it2 = s25Var.h.iterator();
                while (it2.hasNext()) {
                    ((r25) it2.next()).m();
                }
                return;
            }
            throw qx1.f(it);
        }
    }

    public final void j() {
        this.e = 0L;
        this.f = null;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((bl7) it.next()).e(2002);
        }
    }

    public final void l(bl7 bl7Var) {
        this.d.add(bl7Var);
    }

    public final void m(long j, String str) {
        Object[] objArr = {str, null};
        zk3 zk3Var = this.a;
        String str2 = zk3Var.a;
        if (!Build.TYPE.equals("user") && zk3Var.b && Log.isLoggable(str2, 2)) {
            Log.v(str2, zk3Var.c("Sending text message: %s to: %s", objArr));
        }
        xf6 xf6Var = this.c;
        if (xf6Var == null) {
            Log.e(str2, zk3Var.c("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        sm7 sm7Var = (sm7) xf6Var.y;
        if (sm7Var != null) {
            String str3 = this.b;
            qi0.b(str3);
            if (!TextUtils.isEmpty(str)) {
                if (str.length() <= 524288) {
                    o76 b = o76.b();
                    b.d = new l87(sm7Var, str3, str, (byte) 3);
                    b.c = (short) 8405;
                    v78 d = sm7Var.d(1, b.a());
                    d.b.m(new os7(r76.a, new ok2(xf6Var, j, (byte) 8)));
                    d.j();
                    return;
                }
                zk3 zk3Var2 = sm7.G;
                Log.w(zk3Var2.a, zk3Var2.c("Message send failed. Message exceeds maximum size", new Object[0]));
                ze0.k("Message exceeds maximum size524288");
                return;
            }
            ze0.k("The message payload cannot be null or empty");
            return;
        }
        ze0.m("Device is not connected");
    }

    public final long n() {
        xf6 xf6Var = this.c;
        if (xf6Var == null) {
            zk3 zk3Var = this.a;
            Log.e(zk3Var.a, zk3Var.c("Attempt to generate requestId without a sink", new Object[0]));
            return 0L;
        }
        return ((AtomicLong) xf6Var.z).getAndIncrement();
    }

    public final long o() {
        MediaInfo mediaInfo;
        MediaInfo mediaInfo2;
        long j;
        er3 er3Var;
        bx3 bx3Var = this.f;
        MediaInfo mediaInfo3 = null;
        if (bx3Var == null) {
            mediaInfo = null;
        } else {
            mediaInfo = bx3Var.x;
        }
        long j2 = 0;
        if (mediaInfo != null && bx3Var != null) {
            Long l = this.g;
            if (l != null) {
                if (l.equals(4294967296000L)) {
                    bx3 bx3Var2 = this.f;
                    if (bx3Var2.R != null) {
                        long longValue = l.longValue();
                        bx3 bx3Var3 = this.f;
                        if (bx3Var3 != null && (er3Var = bx3Var3.R) != null) {
                            long j3 = er3Var.y;
                            j2 = !er3Var.A ? c(1.0d, j3, -1L) : j3;
                        }
                        return Math.min(longValue, j2);
                    }
                    if (bx3Var2 == null) {
                        mediaInfo2 = null;
                    } else {
                        mediaInfo2 = bx3Var2.x;
                    }
                    if (mediaInfo2 != null) {
                        j = mediaInfo2.B;
                    } else {
                        j = 0;
                    }
                    if (j >= 0) {
                        long longValue2 = l.longValue();
                        bx3 bx3Var4 = this.f;
                        if (bx3Var4 != null) {
                            mediaInfo3 = bx3Var4.x;
                        }
                        if (mediaInfo3 != null) {
                            j2 = mediaInfo3.B;
                        }
                        return Math.min(longValue2, j2);
                    }
                }
                return l.longValue();
            }
            if (this.e != 0) {
                double d = bx3Var.A;
                long j4 = bx3Var.D;
                int i = bx3Var.B;
                if (d != 0.0d && i == 2) {
                    return c(d, j4, mediaInfo.B);
                }
                return j4;
            }
        }
        return 0L;
    }
}
