package defpackage;

import android.os.Parcel;
import com.unity3d.ads.adplayer.DisplayRecoverer;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xb5 implements nw4, w16, tn0, ja5, un0, g25, vm7 {
    public static xb5 y;
    public final /* synthetic */ byte x;
    public static final /* synthetic */ xb5 z = new xb5((byte) 12);
    public static final /* synthetic */ xb5 A = new xb5((byte) 13);
    public static final /* synthetic */ xb5 B = new xb5((byte) 14);
    public static final /* synthetic */ xb5 C = new xb5((byte) 15);
    public static final /* synthetic */ xb5 D = new xb5((byte) 16);
    public static final /* synthetic */ xb5 E = new xb5((byte) 17);
    public static final /* synthetic */ xb5 F = new xb5((byte) 18);
    public static final /* synthetic */ xb5 G = new xb5((byte) 19);
    public static final /* synthetic */ xb5 H = new xb5((byte) 20);
    public static final /* synthetic */ xb5 I = new xb5((byte) 21);
    public static final /* synthetic */ xb5 J = new xb5((byte) 22);
    public static final /* synthetic */ xb5 K = new xb5((byte) 23);
    public static final /* synthetic */ xb5 L = new xb5((byte) 24);
    public static final /* synthetic */ xb5 M = new xb5((byte) 25);
    public static final /* synthetic */ xb5 N = new xb5((byte) 26);
    public static final /* synthetic */ xb5 O = new xb5((byte) 27);
    public static final /* synthetic */ xb5 P = new xb5((byte) 28);
    public static final /* synthetic */ xb5 Q = new xb5((byte) 29);

    public xb5(ay5 ay5Var) {
        this.x = (byte) 2;
    }

    public static final gg7 b(Object obj, Object obj2) {
        gg7 gg7Var = (gg7) obj;
        gg7 gg7Var2 = (gg7) obj2;
        if (!gg7Var2.isEmpty()) {
            if (!gg7Var.x) {
                gg7Var = gg7Var.a();
            }
            gg7Var.c();
            if (!gg7Var2.isEmpty()) {
                gg7Var.putAll(gg7Var2);
            }
        }
        return gg7Var;
    }

    @Override // defpackage.w16
    public int A(ea2 ea2Var) {
        return 1;
    }

    @Override // defpackage.vm7
    public Object a() {
        switch (this.x) {
            case 13:
                return new Boolean(((Boolean) gi7.a.get()).booleanValue());
            case 14:
                List list = tq7.a;
                return (String) ei7.a.get();
            case 15:
                List list2 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(10000L, 68, "measurement.upload.max_conversions_per_day").get()).longValue());
            case 16:
                List list3 = tq7.a;
                ph7.y.get();
                return (String) qh7.a.h(44, "measurement.sgtm.service_upload_apps_list", "").get();
            case 17:
                List list4 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(1800000L, 41, "measurement.sgtm.batch.retry_interval").get();
            case 18:
                List list5 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(5000L, 50, "measurement.sgtm.upload.min_delay_after_startup").get();
            case 19:
                List list6 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(43200000L, 63, "measurement.upload.backoff_period").get();
            case 20:
                List list7 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(500L, 28, "measurement.upload.minimum_delay").get();
            case 21:
                List list8 = tq7.a;
                ph7.y.get();
                return (String) qh7.a.h(8, "measurement.config.url_scheme", HttpRequest.DEFAULT_SCHEME).get();
            case 22:
                List list9 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(4L, 17, "measurement.lifetimevalue.max_currency_tracked").get()).longValue());
            case 23:
                List list10 = tq7.a;
                wi7.y.get();
                return (String) xi7.a.h(5, "measurement.test.string_flag", "---").get();
            case 24:
                List list11 = tq7.a;
                wi7.y.get();
                fk7 fk7Var = xi7.a;
                AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) fk7Var.x;
                v08 v08Var = (v08) atomicReferenceArray.get(2);
                if (v08Var == null) {
                    v08 v08Var2 = new v08("measurement.test.double_flag", (yh2) ((qb7) fk7Var.y).y);
                    while (true) {
                        if (atomicReferenceArray.compareAndSet(2, null, v08Var2)) {
                            v08Var = v08Var2;
                        } else if (atomicReferenceArray.get(2) != null) {
                            v08Var = (v08) atomicReferenceArray.get(2);
                            v08Var.getClass();
                        }
                    }
                }
                return (Double) v08Var.get();
            case 25:
                List list12 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(604800000L, 61, "measurement.sdk.attribution.cache.ttl").get();
            case 26:
                List list13 = tq7.a;
                ph7.y.get();
                return (String) qh7.a.h(60, "measurement.rb.attribution.uri_scheme", HttpRequest.DEFAULT_SCHEME).get();
            case 27:
                List list14 = tq7.a;
                ph7.y.get();
                return (String) qh7.a.h(80, "measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot").get();
            case 28:
                List list15 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(16L, 54, "measurement.rb.attribution.max_retry_delay_seconds").get()).longValue());
            default:
                List list16 = tq7.a;
                ph7.y.get();
                return (Boolean) qh7.a.e(31, "measurement.config.notify_trigger_uris_on_backgrounded", true).get();
        }
    }

    @Override // defpackage.g25
    public void accept(Object obj, Object obj2) {
        zk3 zk3Var = sm7.G;
        uh7 uh7Var = (uh7) ((t98) obj).m();
        lp i = rv5.i();
        Parcel K2 = uh7Var.K();
        nn7.b(K2, i);
        uh7Var.O(K2, 1);
        ((p76) obj2).b(null);
    }

    @Override // defpackage.un0
    public long f() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.nw4
    public Object get() {
        xb5 xb5Var = new xb5((byte) 8);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            hashMap.put(cu4.x, new ly(DisplayRecoverer.DEFAULT_MAX_BACKGROUND_AGE_MS, 86400000L, set));
            if (set != null) {
                hashMap.put(cu4.z, new ly(1000L, 86400000L, set));
                if (set != null) {
                    Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(ub5.x, ub5.y)));
                    if (unmodifiableSet != null) {
                        hashMap.put(cu4.y, new ly(86400000L, 86400000L, unmodifiableSet));
                        if (hashMap.keySet().size() >= cu4.values().length) {
                            new HashMap();
                            return new ky(xb5Var, hashMap);
                        }
                        ze0.m("Not all priorities have been configured");
                        return null;
                    }
                    qi2.m("Null flags");
                    return null;
                }
                qi2.m("Null flags");
                return null;
            }
            qi2.m("Null flags");
            return null;
        }
        qi2.m("Null flags");
        return null;
    }

    @Override // defpackage.w16
    public boolean i(ea2 ea2Var) {
        return false;
    }

    @Override // defpackage.ja5
    public Object j(Object obj) {
        qc5 qc5Var;
        List list = (List) obj;
        Object obj2 = list.get(0);
        obj2.getClass();
        int intValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        obj3.getClass();
        int intValue2 = ((Integer) obj3).intValue();
        Object obj4 = list.get(2);
        obj4.getClass();
        int intValue3 = ((Integer) obj4).intValue();
        ai3 y2 = te4.y();
        int i = 3;
        while (true) {
            int i2 = intValue2 + 3;
            qc5Var = de6.i;
            if (i >= i2) {
                break;
            }
            y2.add(qc5Var.j(list.get(i)));
            i++;
        }
        ai3 r = te4.r(y2);
        ai3 y3 = te4.y();
        while (i < intValue2 + intValue3 + 3) {
            y3.add(qc5Var.j(list.get(i)));
            i++;
        }
        return new hn6(intValue, r, te4.r(y3));
    }

    @Override // defpackage.w16
    public y16 s(ea2 ea2Var) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // defpackage.ja5
    public Object u(i95 i95Var, Object obj) {
        qc5 qc5Var;
        hn6 hn6Var = (hn6) obj;
        ai3 y2 = te4.y();
        y2.add(Integer.valueOf(hn6Var.a));
        zt5 zt5Var = hn6Var.b;
        y2.add(Integer.valueOf(zt5Var.size()));
        zt5 zt5Var2 = hn6Var.c;
        y2.add(Integer.valueOf(zt5Var2.size()));
        int size = zt5Var.size();
        int i = 0;
        while (true) {
            qc5Var = de6.i;
            if (i >= size) {
                break;
            }
            y2.add(qc5Var.u(i95Var, zt5Var.get(i)));
            i++;
        }
        int size2 = zt5Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            y2.add(qc5Var.u(i95Var, zt5Var2.get(i2)));
        }
        return te4.r(y2);
    }

    public /* synthetic */ xb5(byte b) {
        this.x = b;
    }
}
