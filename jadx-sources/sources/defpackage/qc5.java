package defpackage;

import android.net.Uri;
import android.util.JsonReader;
import android.util.JsonToken;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qc5 implements rc5, fj4, ja5, mr6, es0, vm7 {
    public static qc5 y;
    public final /* synthetic */ byte x;
    public static final /* synthetic */ qc5 z = new qc5(12);
    public static final /* synthetic */ qc5 A = new qc5(13);
    public static final /* synthetic */ qc5 B = new qc5(14);
    public static final /* synthetic */ qc5 C = new qc5(15);
    public static final /* synthetic */ qc5 D = new qc5(16);
    public static final /* synthetic */ qc5 E = new qc5(17);
    public static final /* synthetic */ qc5 F = new qc5(18);
    public static final /* synthetic */ qc5 G = new qc5(19);
    public static final /* synthetic */ qc5 H = new qc5(20);
    public static final /* synthetic */ qc5 I = new qc5(21);
    public static final /* synthetic */ qc5 J = new qc5(22);
    public static final /* synthetic */ qc5 K = new qc5(23);
    public static final /* synthetic */ qc5 L = new qc5(24);
    public static final /* synthetic */ qc5 M = new qc5(25);
    public static final /* synthetic */ qc5 N = new qc5(26);
    public static final /* synthetic */ qc5 O = new qc5(27);
    public static final /* synthetic */ qc5 P = new qc5(28);
    public static final /* synthetic */ qc5 Q = new qc5(29);

    public /* synthetic */ qc5(byte b) {
        this.x = b;
    }

    public static z56 c(int i) {
        if (768 <= i && i < 772) {
            return (z56) z56.z.get(i - 768);
        }
        ze0.k(qx1.h(i, "Invalid TLS version code "));
        return null;
    }

    public static void f(JsonReader jsonReader, jw2 jw2Var) {
        jsonReader.beginArray();
        boolean z2 = false;
        while (jsonReader.hasNext()) {
            if (jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                jsonReader.beginObject();
                String str = null;
                String str2 = null;
                ly5 ly5Var = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (nextName.equals("BASE-ID") && jsonReader.peek().equals(JsonToken.STRING)) {
                        str = jsonReader.nextString();
                    } else if (nextName.equals("ID") && jsonReader.peek().equals(JsonToken.STRING)) {
                        str2 = jsonReader.nextString();
                    } else if (nextName.equals("URI-REPLACEMENT") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                        jsonReader.beginObject();
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        HashMap hashMap3 = new HashMap();
                        String str3 = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            if (nextName2.equals("HOST") && jsonReader.peek().equals(JsonToken.STRING)) {
                                str3 = jsonReader.nextString();
                                if (str3.isEmpty()) {
                                    throw bj4.c("The HOST string is present but empty");
                                }
                            } else if (nextName2.equals("PARAMS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName3 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        hashMap.put(nextName3, jsonReader.nextString());
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else if (nextName2.equals("PER-VARIANT-URIS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        hashMap2.put(nextName4, Uri.parse(jsonReader.nextString()));
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else if (nextName2.equals("PER-RENDITION-URIS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        hashMap3.put(nextName5, Uri.parse(jsonReader.nextString()));
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        ly5Var = new ly5(str3, hashMap, hashMap2, hashMap3);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (str != null) {
                    if (str2 != null) {
                        if (ly5Var != null) {
                            jw2Var.c(new ky5(str, str2, ly5Var));
                            z2 = true;
                        } else {
                            throw bj4.c("URI-REPLACEMENT field is missing in a PATHWAY-CLONE object");
                        }
                    } else {
                        throw bj4.c("ID field is missing in a PATHWAY-CLONE object");
                    }
                } else {
                    throw bj4.c("BASE-ID field is missing in a PATHWAY-CLONE object");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        if (z2) {
        } else {
            throw bj4.c("The PATHWAY-CLONES array is present but empty");
        }
    }

    public static void g(JsonReader jsonReader, jw2 jw2Var) {
        HashSet hashSet = new HashSet();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            if (jsonReader.peek().equals(JsonToken.STRING)) {
                String nextString = jsonReader.nextString();
                if (hashSet.add(nextString)) {
                    jw2Var.c(nextString);
                } else {
                    throw bj4.c("The pathway ID (" + nextString + ") appears more than once in the PATHWAY-PRIORITY array");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        if (!hashSet.isEmpty()) {
        } else {
            throw bj4.c("The PATHWAY-PRIORITY array is present but empty");
        }
    }

    @Override // defpackage.vm7
    public Object a() {
        switch (this.x) {
            case 13:
                return new Boolean(((Boolean) mi7.a.get()).booleanValue());
            case 14:
                List list = tq7.a;
                return (String) ei7.b.get();
            case 15:
                List list2 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(10L, 74, "measurement.upload.max_realtime_events_per_day").get()).longValue());
            case 16:
                List list3 = tq7.a;
                ph7.y.get();
                return (String) qh7.a.h(45, "measurement.sgtm.upload.backoff_http_codes", "404,429,503,504").get();
            case 17:
                List list4 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(21600000L, 43, "measurement.sgtm.batch.retry_max_wait").get();
            case 18:
                List list5 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(1000L, 49, "measurement.sgtm.upload.min_delay_after_broadcast").get();
            case 19:
                List list6 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(3600000L, 79, "measurement.upload.window_interval").get();
            case 20:
                List list7 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(60000L, 27, "measurement.alarm_manager.minimum_interval").get();
            case 21:
                List list8 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(1800000L, 77, "measurement.upload.retry_time").get();
            case 22:
                List list9 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(200L, 22, "measurement.audience.filter_result_max_count").get()).longValue());
            case 23:
                List list10 = tq7.a;
                ph7.y.get();
                return (String) qh7.a.h(7, "measurement.config.url_authority", "app-measurement.com").get();
            case 24:
                List list11 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(50L, 21, "measurement.experiment.max_ids").get()).longValue());
            case 25:
                List list12 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(7200000L, 62, "measurement.redaction.app_instance_id.ttl").get();
            case 26:
                List list13 = tq7.a;
                ph7.y.get();
                return (String) qh7.a.h(56, "measurement.rb.attribution.uri_authority", "google-analytics.com").get();
            case 27:
                List list14 = tq7.a;
                ph7.y.get();
                return (String) qh7.a.h(13, "measurement.rb.attribution.event_params", "value|currency").get();
            case 28:
                List list15 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(90L, 55, "measurement.rb.attribution.client.min_time_after_boot_seconds").get()).longValue());
            default:
                List list16 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(3000L, 30, "measurement.rb.attribution.notify_app_delay_millis").get()).longValue());
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ew2, jw2] */
    /* JADX WARN: Type inference failed for: r12v7, types: [ew2, jw2] */
    @Override // defpackage.fj4
    public Object d(Uri uri, t41 t41Var) {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(t41Var));
        try {
            if (jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                ?? ew2Var = new ew2(4);
                ?? ew2Var2 = new ew2(4);
                jsonReader.beginObject();
                Uri uri2 = null;
                int i = 1;
                long j = -9223372036854775807L;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (nextName.equals("VERSION") && jsonReader.peek().equals(JsonToken.NUMBER)) {
                        i = jsonReader.nextInt();
                    } else if (nextName.equals("TTL") && jsonReader.peek().equals(JsonToken.NUMBER)) {
                        j = jsonReader.nextInt() * 1000;
                    } else if (nextName.equals("RELOAD-URI") && jsonReader.peek().equals(JsonToken.STRING)) {
                        uri2 = Uri.parse(jsonReader.nextString());
                    } else if (nextName.equals("PATHWAY-PRIORITY") && jsonReader.peek().equals(JsonToken.BEGIN_ARRAY)) {
                        g(jsonReader, ew2Var);
                    } else if (nextName.equals("PATHWAY-CLONES") && jsonReader.peek().equals(JsonToken.BEGIN_ARRAY)) {
                        f(jsonReader, ew2Var2);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                o15 g = ew2Var.g();
                if (!g.isEmpty()) {
                    my5 my5Var = new my5(i, j, uri2, g, ew2Var2.g());
                    jsonReader.close();
                    return my5Var;
                }
                throw bj4.c("PATHWAY-PRIORITY field is missing");
            }
            throw bj4.c("Steering manifest JSON should be an object at root");
        } catch (Throwable th) {
            try {
                jsonReader.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.es0
    public /* synthetic */ Object h(kz kzVar) {
        return AnalyticsConnectorRegistrar.zza(kzVar);
    }

    @Override // defpackage.ja5
    public Object j(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        obj2.getClass();
        int intValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        obj3.getClass();
        String str = (String) obj3;
        Object obj4 = list.get(2);
        obj4.getClass();
        String str2 = (String) obj4;
        Object obj5 = list.get(3);
        obj5.getClass();
        int intValue2 = ((Integer) obj5).intValue();
        Object obj6 = list.get(4);
        obj6.getClass();
        long a = fy5.a(intValue2, ((Integer) obj6).intValue());
        Object obj7 = list.get(5);
        obj7.getClass();
        int intValue3 = ((Integer) obj7).intValue();
        Object obj8 = list.get(6);
        obj8.getClass();
        long a2 = fy5.a(intValue3, ((Integer) obj8).intValue());
        Object obj9 = list.get(7);
        obj9.getClass();
        return new de6(intValue, str, str2, a, a2, ((Long) obj9).longValue(), false, 64);
    }

    @Override // defpackage.ja5
    public Object u(i95 i95Var, Object obj) {
        de6 de6Var = (de6) obj;
        Integer valueOf = Integer.valueOf(de6Var.a);
        String str = de6Var.b;
        String str2 = de6Var.c;
        long j = de6Var.d;
        int i = nd6.c;
        Integer valueOf2 = Integer.valueOf((int) (j >> 32));
        Integer valueOf3 = Integer.valueOf((int) (j & 4294967295L));
        long j2 = de6Var.e;
        return te4.I(valueOf, str, str2, valueOf2, valueOf3, Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (4294967295L & j2)), Long.valueOf(de6Var.f));
    }

    @Override // defpackage.mr6
    public int v() {
        return 0;
    }

    @Override // defpackage.mr6
    public int x() {
        return 0;
    }

    @Override // defpackage.kr6
    public rl y(long j, rl rlVar, rl rlVar2, rl rlVar3) {
        if (j < 0) {
            return rlVar;
        }
        return rlVar2;
    }

    @Override // defpackage.kr6
    public rl o(long j, rl rlVar, rl rlVar2, rl rlVar3) {
        return rlVar3;
    }

    @Override // defpackage.rc5
    public void onScrollLimit(int i, int i2, int i3, boolean z2) {
    }

    @Override // defpackage.rc5
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
