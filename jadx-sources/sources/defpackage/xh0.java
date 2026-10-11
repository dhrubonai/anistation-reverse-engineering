package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.framework.OptionsProvider;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xh0 {
    public static final zk3 k = new zk3("CastContext", null);
    public static final Object l = new Object();
    public static volatile xh0 m;
    public final Context a;
    public final ui7 b;
    public final pk5 c;
    public final qd7 d;
    public final di0 e;
    public final wb7 f;
    public final gl7 g;
    public final List h;
    public final qn7 i;
    public final vl7 j;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v4, types: [hk7] */
    /* JADX WARN: Type inference failed for: r9v2, types: [sa7] */
    public xh0(Context context, di0 di0Var, List list, dn7 dn7Var, wb7 wb7Var) {
        ?? r12;
        p88 p88Var;
        p88 p88Var2;
        ConnectivityManager connectivityManager;
        LinkProperties linkProperties;
        this.a = context;
        this.e = di0Var;
        this.f = wb7Var;
        this.h = list;
        xm7 xm7Var = new xm7(context);
        qn7 qn7Var = dn7Var.i;
        this.i = qn7Var;
        el7 el7Var = null;
        if (!TextUtils.isEmpty(di0Var.x)) {
            this.j = new vl7(context, di0Var, dn7Var);
        } else {
            this.j = null;
        }
        HashMap hashMap = new HashMap();
        vl7 vl7Var = this.j;
        if (vl7Var != null) {
            hashMap.put(vl7Var.b, vl7Var.c);
        }
        final byte b = 1;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vl7 vl7Var2 = (vl7) it.next();
                a34.y(vl7Var2, "Additional SessionProvider must not be null.");
                String str = vl7Var2.b;
                a34.v(str, "Category for SessionProvider must not be null or empty string.");
                a34.m("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, vl7Var2.c);
            }
        }
        di0Var.M = new my7(1);
        try {
            ui7 a = il7.a(context, di0Var, dn7Var, hashMap);
            this.b = a;
            try {
                fh7 fh7Var = (fh7) a;
                Parcel L = fh7Var.L(fh7Var.K(), 6);
                IBinder readStrongBinder = L.readStrongBinder();
                if (readStrongBinder == null) {
                    r12 = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    if (queryLocalInterface instanceof hk7) {
                        r12 = (hk7) queryLocalInterface;
                    } else {
                        r12 = new sa7(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", (byte) 1);
                    }
                }
                L.recycle();
                this.d = new qd7(r12);
                try {
                    fh7 fh7Var2 = (fh7) a;
                    Parcel L2 = fh7Var2.L(fh7Var2.K(), 5);
                    IBinder readStrongBinder2 = L2.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        if (queryLocalInterface2 instanceof el7) {
                            el7Var = (el7) queryLocalInterface2;
                        } else {
                            el7Var = new sa7(readStrongBinder2, "com.google.android.gms.cast.framework.ISessionManager", (byte) 1);
                        }
                    }
                    L2.recycle();
                    pk5 pk5Var = new pk5(el7Var, context);
                    this.c = pk5Var;
                    a34.v("PrecacheManager", "The log tag cannot be null or empty.");
                    final byte b2 = 0;
                    if (qn7Var != null) {
                        qn7Var.f = pk5Var;
                        qn7Var.c.post(new on7(qn7Var, (byte) 0));
                    }
                    ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                    if (newFixedThreadPool instanceof p88) {
                        p88Var2 = (p88) newFixedThreadPool;
                    } else {
                        if (newFixedThreadPool instanceof ScheduledExecutorService) {
                            p88Var = new t88((ScheduledExecutorService) newFixedThreadPool);
                        } else {
                            p88Var = new p88(newFixedThreadPool);
                        }
                        p88Var2 = p88Var;
                    }
                    jp7 jp7Var = new jp7(context, p88Var2);
                    a34.v("BaseNetUtils", "The log tag cannot be null or empty.");
                    jp7.l.b("Start monitoring connectivity changes", new Object[0]);
                    if (!jp7Var.f && (connectivityManager = jp7Var.c) != null) {
                        Context context2 = jp7Var.g;
                        if (t80.A(context2, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                            Network activeNetwork = connectivityManager.getActiveNetwork();
                            if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                                jp7Var.a(activeNetwork, linkProperties);
                            }
                            NetworkRequest.Builder addTransportType = new NetworkRequest.Builder().addTransportType(1);
                            if (jp7Var.i) {
                                addTransportType.setIncludeOtherUidNetworks(true);
                            } else {
                                context2.registerReceiver(jp7Var.j, new IntentFilter("android.net.wifi.STATE_CHANGE"));
                            }
                            connectivityManager.registerNetworkCallback(addTransportType.build(), jp7Var.b);
                            jp7Var.f = true;
                        }
                    }
                    gl7 gl7Var = new gl7();
                    this.g = gl7Var;
                    try {
                        fh7 fh7Var3 = (fh7) a;
                        Parcel K = fh7Var3.K();
                        nn7.c(K, gl7Var);
                        fh7Var3.M(K, 3);
                        gl7Var.f.add(xm7Var.a);
                        if (!Collections.unmodifiableList(di0Var.I).isEmpty()) {
                            zk3 zk3Var = k;
                            Log.i(zk3Var.a, zk3Var.c("Setting Route Discovery for appIds: ".concat(String.valueOf(Collections.unmodifiableList(di0Var.I))), new Object[0]));
                            List unmodifiableList = Collections.unmodifiableList(di0Var.I);
                            zk3 zk3Var2 = xm7.f;
                            int size = unmodifiableList.size();
                            StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
                            sb.append("SetRouteDiscovery for ");
                            sb.append(size);
                            sb.append(" IDs");
                            zk3Var2.b(sb.toString(), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            Iterator it2 = unmodifiableList.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet.add(gy5.s((String) it2.next()));
                            }
                            Map map = xm7Var.c;
                            zk3Var2.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (map) {
                                try {
                                    for (String str2 : linkedHashSet) {
                                        qm7 qm7Var = (qm7) map.get(gy5.s(str2));
                                        if (qm7Var != null) {
                                            hashMap2.put(str2, qm7Var);
                                        }
                                    }
                                    map.clear();
                                    map.putAll(hashMap2);
                                } finally {
                                }
                            }
                            zk3Var2.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map.keySet())), new Object[0]);
                            LinkedHashSet linkedHashSet2 = xm7Var.d;
                            synchronized (linkedHashSet2) {
                                linkedHashSet2.clear();
                                linkedHashSet2.addAll(linkedHashSet);
                            }
                            xm7Var.i();
                        }
                        v78 f = wb7Var.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS"});
                        ke4 ke4Var = new ke4(this) { // from class: ps7
                            public final /* synthetic */ xh0 y;

                            {
                                this.y = this;
                            }

                            @Override // defpackage.ke4
                            public final void onSuccess(Object obj) {
                                int i;
                                int i2;
                                Set singleton;
                                a48 a48Var;
                                f28 c;
                                switch (b2) {
                                    case 0:
                                        xh0 xh0Var = this.y;
                                        Bundle bundle = (Bundle) obj;
                                        if (kv7.k) {
                                            Context context3 = xh0Var.a;
                                            wb7 wb7Var2 = xh0Var.f;
                                            kv7 kv7Var = new kv7(context3, wb7Var2, xh0Var.c, xh0Var.i, xh0Var.g);
                                            if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE")) {
                                                i = bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0);
                                            } else if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) {
                                                i = 1;
                                            } else {
                                                i = 0;
                                            }
                                            boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
                                            boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", false);
                                            kv7.k = z2;
                                            if (i == 0) {
                                                if (z || z2) {
                                                    i = 0;
                                                } else {
                                                    return;
                                                }
                                            }
                                            kv7Var.h = new un7(context3, bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS", 5L));
                                            String packageName = context3.getPackageName();
                                            Locale locale = Locale.ROOT;
                                            String j = h11.j(packageName, ".client_cast_analytics_data");
                                            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                                                i2 = 1;
                                            } else {
                                                i2 = 2;
                                            }
                                            kv7Var.i = i2;
                                            hj6.b(context3);
                                            hj6 a2 = hj6.a();
                                            ee0 ee0Var = ee0.e;
                                            a2.getClass();
                                            if (ee0Var != null) {
                                                singleton = Collections.unmodifiableSet(ee0.d);
                                            } else {
                                                singleton = Collections.singleton(new au1("proto"));
                                            }
                                            st3 a3 = oy.a();
                                            ee0Var.getClass();
                                            a3.x = "cct";
                                            String str3 = ee0Var.a;
                                            String str4 = ee0Var.b;
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            a3.y = ("1$" + str3 + "\\" + str4).getBytes(Charset.forName("UTF-8"));
                                            oy f2 = a3.f();
                                            au1 au1Var = new au1("proto");
                                            if (singleton.contains(au1Var)) {
                                                kv7Var.g = new st3(f2, au1Var, a2);
                                                if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                                                    kv7Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
                                                }
                                                SharedPreferences sharedPreferences = context3.getApplicationContext().getSharedPreferences(j, 0);
                                                if (i != 0) {
                                                    o76 b3 = o76.b();
                                                    b3.d = new hv7(wb7Var2, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, (byte) 1);
                                                    b3.a = new q12[]{v94.t};
                                                    b3.b = false;
                                                    b3.c = (short) 8426;
                                                    wb7Var2.d(0, b3.a()).a(r76.a, new ad(kv7Var, packageName, i, sharedPreferences));
                                                }
                                                if (z) {
                                                    a34.x(sharedPreferences);
                                                    zk3 zk3Var3 = a48.i;
                                                    synchronized (a48.class) {
                                                        a48Var = a48.k;
                                                        if (a48Var == null) {
                                                            a48Var = new a48(sharedPreferences, kv7Var, packageName);
                                                            a48.k = a48Var;
                                                        }
                                                    }
                                                    String str5 = a48Var.c;
                                                    SharedPreferences sharedPreferences2 = a48Var.b;
                                                    HashSet hashSet = a48Var.f;
                                                    String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                                                    String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                                                    hashSet.clear();
                                                    HashSet hashSet2 = a48Var.g;
                                                    hashSet2.clear();
                                                    a48Var.h = 0L;
                                                    String str6 = a48.j;
                                                    if (str6.equals(string) && str5.equals(string2)) {
                                                        a48Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                                                        long currentTimeMillis = System.currentTimeMillis();
                                                        HashSet hashSet3 = new HashSet();
                                                        for (String str7 : sharedPreferences2.getAll().keySet()) {
                                                            if (str7.startsWith("feature_usage_timestamp_")) {
                                                                long j2 = sharedPreferences2.getLong(str7, 0L);
                                                                if (j2 != 0 && currentTimeMillis - j2 > 1209600000) {
                                                                    hashSet3.add(str7);
                                                                } else if (str7.startsWith("feature_usage_timestamp_reported_feature_")) {
                                                                    f28 c2 = a48.c(str7.substring(41));
                                                                    if (c2 != null) {
                                                                        hashSet2.add(c2);
                                                                        hashSet.add(c2);
                                                                    }
                                                                } else if (str7.startsWith("feature_usage_timestamp_detected_feature_") && (c = a48.c(str7.substring(41))) != null) {
                                                                    hashSet.add(c);
                                                                }
                                                            }
                                                        }
                                                        a48Var.b(hashSet3);
                                                        a48Var.e.post(a48Var.d);
                                                    } else {
                                                        HashSet hashSet4 = new HashSet();
                                                        for (String str8 : sharedPreferences2.getAll().keySet()) {
                                                            if (str8.startsWith("feature_usage_timestamp_")) {
                                                                hashSet4.add(str8);
                                                            }
                                                        }
                                                        hashSet4.add("feature_usage_last_report_time");
                                                        a48Var.b(hashSet4);
                                                        sharedPreferences2.edit().putString("feature_usage_sdk_version", str6).putString("feature_usage_package_name", str5).apply();
                                                    }
                                                    a48.a(f28.CAST_CONTEXT);
                                                }
                                                if (kv7.k) {
                                                    synchronized (l68.class) {
                                                        if (l68.y == null) {
                                                            l68 l68Var = new l68((byte) 0);
                                                            new ConcurrentHashMap();
                                                            l68.y = l68Var;
                                                        }
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", au1Var, singleton));
                                        }
                                        return;
                                    default:
                                        new q18((Bundle) obj);
                                        return;
                                }
                            }
                        };
                        lj2 lj2Var = r76.a;
                        f.a(lj2Var, ke4Var);
                        o76 b3 = o76.b();
                        b3.d = new hv7(wb7Var, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}, (byte) 2);
                        b3.a = new q12[]{v94.u};
                        b3.b = false;
                        b3.c = (short) 8427;
                        wb7Var.d(0, b3.a()).a(lj2Var, new ke4(this) { // from class: ps7
                            public final /* synthetic */ xh0 y;

                            {
                                this.y = this;
                            }

                            @Override // defpackage.ke4
                            public final void onSuccess(Object obj) {
                                int i;
                                int i2;
                                Set singleton;
                                a48 a48Var;
                                f28 c;
                                switch (b) {
                                    case 0:
                                        xh0 xh0Var = this.y;
                                        Bundle bundle = (Bundle) obj;
                                        if (kv7.k) {
                                            Context context3 = xh0Var.a;
                                            wb7 wb7Var2 = xh0Var.f;
                                            kv7 kv7Var = new kv7(context3, wb7Var2, xh0Var.c, xh0Var.i, xh0Var.g);
                                            if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE")) {
                                                i = bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0);
                                            } else if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) {
                                                i = 1;
                                            } else {
                                                i = 0;
                                            }
                                            boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
                                            boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", false);
                                            kv7.k = z2;
                                            if (i == 0) {
                                                if (z || z2) {
                                                    i = 0;
                                                } else {
                                                    return;
                                                }
                                            }
                                            kv7Var.h = new un7(context3, bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS", 5L));
                                            String packageName = context3.getPackageName();
                                            Locale locale = Locale.ROOT;
                                            String j = h11.j(packageName, ".client_cast_analytics_data");
                                            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                                                i2 = 1;
                                            } else {
                                                i2 = 2;
                                            }
                                            kv7Var.i = i2;
                                            hj6.b(context3);
                                            hj6 a2 = hj6.a();
                                            ee0 ee0Var = ee0.e;
                                            a2.getClass();
                                            if (ee0Var != null) {
                                                singleton = Collections.unmodifiableSet(ee0.d);
                                            } else {
                                                singleton = Collections.singleton(new au1("proto"));
                                            }
                                            st3 a3 = oy.a();
                                            ee0Var.getClass();
                                            a3.x = "cct";
                                            String str3 = ee0Var.a;
                                            String str4 = ee0Var.b;
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            a3.y = ("1$" + str3 + "\\" + str4).getBytes(Charset.forName("UTF-8"));
                                            oy f2 = a3.f();
                                            au1 au1Var = new au1("proto");
                                            if (singleton.contains(au1Var)) {
                                                kv7Var.g = new st3(f2, au1Var, a2);
                                                if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                                                    kv7Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
                                                }
                                                SharedPreferences sharedPreferences = context3.getApplicationContext().getSharedPreferences(j, 0);
                                                if (i != 0) {
                                                    o76 b32 = o76.b();
                                                    b32.d = new hv7(wb7Var2, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, (byte) 1);
                                                    b32.a = new q12[]{v94.t};
                                                    b32.b = false;
                                                    b32.c = (short) 8426;
                                                    wb7Var2.d(0, b32.a()).a(r76.a, new ad(kv7Var, packageName, i, sharedPreferences));
                                                }
                                                if (z) {
                                                    a34.x(sharedPreferences);
                                                    zk3 zk3Var3 = a48.i;
                                                    synchronized (a48.class) {
                                                        a48Var = a48.k;
                                                        if (a48Var == null) {
                                                            a48Var = new a48(sharedPreferences, kv7Var, packageName);
                                                            a48.k = a48Var;
                                                        }
                                                    }
                                                    String str5 = a48Var.c;
                                                    SharedPreferences sharedPreferences2 = a48Var.b;
                                                    HashSet hashSet = a48Var.f;
                                                    String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                                                    String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                                                    hashSet.clear();
                                                    HashSet hashSet2 = a48Var.g;
                                                    hashSet2.clear();
                                                    a48Var.h = 0L;
                                                    String str6 = a48.j;
                                                    if (str6.equals(string) && str5.equals(string2)) {
                                                        a48Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                                                        long currentTimeMillis = System.currentTimeMillis();
                                                        HashSet hashSet3 = new HashSet();
                                                        for (String str7 : sharedPreferences2.getAll().keySet()) {
                                                            if (str7.startsWith("feature_usage_timestamp_")) {
                                                                long j2 = sharedPreferences2.getLong(str7, 0L);
                                                                if (j2 != 0 && currentTimeMillis - j2 > 1209600000) {
                                                                    hashSet3.add(str7);
                                                                } else if (str7.startsWith("feature_usage_timestamp_reported_feature_")) {
                                                                    f28 c2 = a48.c(str7.substring(41));
                                                                    if (c2 != null) {
                                                                        hashSet2.add(c2);
                                                                        hashSet.add(c2);
                                                                    }
                                                                } else if (str7.startsWith("feature_usage_timestamp_detected_feature_") && (c = a48.c(str7.substring(41))) != null) {
                                                                    hashSet.add(c);
                                                                }
                                                            }
                                                        }
                                                        a48Var.b(hashSet3);
                                                        a48Var.e.post(a48Var.d);
                                                    } else {
                                                        HashSet hashSet4 = new HashSet();
                                                        for (String str8 : sharedPreferences2.getAll().keySet()) {
                                                            if (str8.startsWith("feature_usage_timestamp_")) {
                                                                hashSet4.add(str8);
                                                            }
                                                        }
                                                        hashSet4.add("feature_usage_last_report_time");
                                                        a48Var.b(hashSet4);
                                                        sharedPreferences2.edit().putString("feature_usage_sdk_version", str6).putString("feature_usage_package_name", str5).apply();
                                                    }
                                                    a48.a(f28.CAST_CONTEXT);
                                                }
                                                if (kv7.k) {
                                                    synchronized (l68.class) {
                                                        if (l68.y == null) {
                                                            l68 l68Var = new l68((byte) 0);
                                                            new ConcurrentHashMap();
                                                            l68.y = l68Var;
                                                        }
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", au1Var, singleton));
                                        }
                                        return;
                                    default:
                                        new q18((Bundle) obj);
                                        return;
                                }
                            }
                        });
                    } catch (RemoteException e) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e);
                    }
                } catch (RemoteException e2) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e2);
                }
            } catch (RemoteException e3) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e3);
            }
        } catch (RemoteException e4) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e4);
        }
    }

    public static xh0 b(Context context) {
        a34.s();
        if (m == null) {
            synchronized (l) {
                if (m == null) {
                    Context applicationContext = context.getApplicationContext();
                    OptionsProvider d = d(c(applicationContext));
                    di0 castOptions = d.getCastOptions(applicationContext);
                    wb7 wb7Var = new wb7(applicationContext);
                    try {
                        m = new xh0(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new dn7(applicationContext, rs3.d(applicationContext), castOptions, wb7Var), wb7Var);
                    } catch (h04 e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return m;
    }

    public static String c(Context context) {
        Bundle bundle;
        try {
            ApplicationInfo a = f97.a(context).a(128, context.getPackageName());
            if (a != null && (bundle = a.metaData) != null) {
                return bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public static OptionsProvider d(String str) {
        try {
            if (str != null) {
                return (OptionsProvider) Class.forName(str).asSubclass(OptionsProvider.class).getDeclaredConstructor(null).newInstance(null);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (ReflectiveOperationException e) {
            throw new IllegalStateException("Failed to initialize CastContext with manifest options.", e);
        }
    }

    public final ks3 a() {
        a34.s();
        try {
            fh7 fh7Var = (fh7) this.b;
            Parcel L = fh7Var.L(fh7Var.K(), 1);
            Bundle bundle = (Bundle) nn7.a(L, Bundle.CREATOR);
            L.recycle();
            return ks3.b(bundle);
        } catch (RemoteException e) {
            k.a(e, "Unable to call %s on %s.", "getMergedSelectorAsBundle", ui7.class.getSimpleName());
            return null;
        }
    }
}
