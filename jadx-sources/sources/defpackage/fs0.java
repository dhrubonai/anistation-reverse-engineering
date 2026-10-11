package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaCodecInfo;
import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import com.anistation.download.service.ExternalDownloadService;
import com.google.firebase.FirebaseCommonRegistrar;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class fs0 implements es0, si3, ri3, k81, ve6, dw3, ay0, ko5, j85, c46, xf0 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ fs0(eo3 eo3Var, sz1 sz1Var, oz1 oz1Var) {
        this.x = (byte) 16;
        this.y = eo3Var;
        this.z = oz1Var;
    }

    @Override // defpackage.ko5
    public boolean a() {
        et4 et4Var = (et4) this.y;
        xy xyVar = (xy) this.z;
        boolean z = et4Var.q;
        if (!z) {
            et4Var.h();
            long a = xy.a(et4Var.o, xyVar.a);
            xyVar.a = a;
            boolean z2 = !et4Var.g(et4Var.n, a + xyVar.b);
            et4Var.q = z2;
            return z2;
        }
        return z;
    }

    @Override // defpackage.ay0
    public void accept(Object obj) {
        long max;
        byte b = this.x;
        Object obj2 = this.z;
        Object obj3 = this.y;
        switch (b) {
            case 7:
                gw3 gw3Var = (gw3) obj3;
                hh6 hh6Var = (hh6) obj2;
                fq4 fq4Var = (fq4) obj;
                rw2 rw2Var = hh6Var.H;
                if (!rw2Var.isEmpty()) {
                    gh6 c = hh6Var.a().c();
                    ho6 it = rw2Var.values().iterator();
                    while (it.hasNext()) {
                        dh6 dh6Var = (dh6) it.next();
                        yg6 yg6Var = (yg6) gw3Var.h.E.get(dh6Var.a.b);
                        if (yg6Var != null && dh6Var.a.a == yg6Var.a) {
                            c.a(new dh6(yg6Var, dh6Var.b));
                        } else {
                            c.a(dh6Var);
                        }
                    }
                    hh6Var = c.b();
                }
                fq4Var.L(hh6Var);
                return;
            case 8:
                dt3 dt3Var = (dt3) obj2;
                bu3 bu3Var = (bu3) ((gw3) obj3).e.get();
                if (bu3Var != null && !bu3Var.i()) {
                    aw2 w = wc7.w(Boolean.TRUE);
                    wt3 wt3Var = new wt3(bu3Var, dt3Var, false);
                    w.a(new yc2((Object) w, (Object) wt3Var, (byte) 0), new ba(bu3Var, (byte) 1));
                    return;
                }
                return;
            case 9:
                gw3 gw3Var2 = (gw3) obj3;
                Surface surface = (Surface) obj2;
                fq4 fq4Var2 = (fq4) obj;
                ((bu3) gw3Var2.e.get()).getClass();
                if (surface == null) {
                    fq4Var2.T(null);
                    gw3Var2.p = null;
                    return;
                } else {
                    ew3 ew3Var = new ew3(surface);
                    gw3Var2.p = ew3Var;
                    fq4Var2.T(ew3Var);
                    return;
                }
            case 10:
            default:
                r16 r16Var = (r16) obj3;
                AtomicLong atomicLong = (AtomicLong) obj2;
                e31 e31Var = (e31) obj;
                q16 q16Var = new q16(e31Var.b, i18.K(e31Var.a, e31Var.c));
                r16Var.c.add(q16Var);
                long j = e31Var.d;
                if (j != -9223372036854775807L) {
                    if (atomicLong.get() == -9223372036854775807L) {
                        max = j;
                    } else {
                        max = Math.max(atomicLong.get(), j);
                    }
                    atomicLong.set(max);
                }
                long j2 = r16Var.l;
                if (j2 == -9223372036854775807L || j >= j2) {
                    r16Var.f(q16Var);
                    return;
                }
                return;
            case 11:
                eb2 eb2Var = (eb2) obj3;
                ((qw3) obj).l(eb2Var.y, (jw3) eb2Var.z, (fr3) obj2);
                return;
        }
    }

    @Override // defpackage.j85
    public Object apply(Object obj) {
        l85 l85Var = (l85) this.y;
        oy oyVar = (oy) this.z;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        l85Var.getClass();
        ArrayList arrayList = new ArrayList();
        Long l = l85.l(sQLiteDatabase, oyVar);
        if (l != null) {
            l85.G(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", HandleInvocationsFromAdViewer.KEY_PAYLOAD, "code", "inline"}, "context_id = ?", new String[]{l.toString()}, null, null, null, String.valueOf(l85Var.A.b)), new ia1(l85Var, (Object) arrayList, oyVar, (byte) 6));
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(((hy) arrayList.get(i)).a);
            if (i < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", MediationMetaData.KEY_NAME, "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new k85(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            hy hyVar = (hy) listIterator.next();
            long j2 = hyVar.a;
            if (hashMap.containsKey(Long.valueOf(j2))) {
                tp c = hyVar.c.c();
                for (k85 k85Var : (Set) hashMap.get(Long.valueOf(j2))) {
                    c.a(k85Var.a, k85Var.b);
                }
                listIterator.set(new hy(j2, hyVar.b, c.d()));
            }
        }
        return arrayList;
    }

    @Override // defpackage.k81
    public int b(MediaCodecInfo mediaCodecInfo) {
        String str = (String) this.y;
        hp0 hp0Var = (hp0) this.z;
        hp0Var.getClass();
        if (zt1.g(mediaCodecInfo, str, hp0Var)) {
            return 0;
        }
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.si3
    public void c(Object obj, g42 g42Var) {
        mr3 mr3Var = (mr3) ((r7) obj);
        mr3Var.d((ko4) this.z, new pz2(g42Var, ((c71) this.y).e));
    }

    @Override // defpackage.xf0
    public Object d(wf0 wf0Var) {
        Executor executor = (Executor) this.y;
        sb2 sb2Var = (sb2) this.z;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ji3 ji3Var = new ji3(atomicBoolean, (byte) 1);
        b45 b45Var = wf0Var.c;
        if (b45Var != null) {
            b45Var.a(ji3Var, pg1.x);
        }
        executor.execute(new ki3(atomicBoolean, wf0Var, sb2Var, (byte) 1));
        return pn6.a;
    }

    @Override // defpackage.es0
    public Object h(kz kzVar) {
        byte b = this.x;
        Object obj = this.z;
        String str = (String) this.y;
        switch (b) {
            case 0:
                kr0 kr0Var = (kr0) obj;
                try {
                    Trace.beginSection(str);
                    return kr0Var.f.h(kzVar);
                } finally {
                    Trace.endSection();
                }
            default:
                Context context = (Context) kzVar.b(Context.class);
                byte b2 = ((v71) obj).x;
                String str2 = "";
                switch (b2) {
                    case 23:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            str2 = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        break;
                    case 24:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            str2 = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                        break;
                    case 25:
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            str2 = "tv";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            str2 = "watch";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            str2 = "auto";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            str2 = "embedded";
                            break;
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            str2 = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                        break;
                }
                return new cy(str, str2);
        }
    }

    @Override // defpackage.c46
    public Object i() {
        byte b = this.x;
        Object obj = this.z;
        kp6 kp6Var = (kp6) this.y;
        switch (b) {
            case 17:
                Iterable iterable = (Iterable) obj;
                l85 l85Var = kp6Var.c;
                l85Var.getClass();
                if (iterable.iterator().hasNext()) {
                    l85Var.a().compileStatement("DELETE FROM events WHERE _id in ".concat(l85.A(iterable))).execute();
                }
                return null;
            default:
                Iterator it = ((HashMap) obj).entrySet().iterator();
                while (it.hasNext()) {
                    kp6Var.i.q(((Integer) r2.getValue()).intValue(), rk3.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                return null;
        }
    }

    @Override // defpackage.ri3
    public void invoke(Object obj) {
        byte b = this.x;
        byte b2 = 3;
        Object obj2 = this.z;
        Object obj3 = this.y;
        switch (b) {
            case 2:
                q7 q7Var = (q7) obj3;
                fr3 fr3Var = (fr3) obj2;
                mr3 mr3Var = (mr3) ((r7) obj);
                mr3Var.getClass();
                jw3 jw3Var = q7Var.d;
                if (jw3Var != null) {
                    ea2 ea2Var = fr3Var.c;
                    ea2Var.getClass();
                    int i = fr3Var.d;
                    da1 da1Var = mr3Var.c;
                    kf6 kf6Var = q7Var.b;
                    jw3Var.getClass();
                    eb2 eb2Var = new eb2(ea2Var, i, da1Var.c(kf6Var, jw3Var), (byte) 4);
                    int i2 = fr3Var.b;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 == 3) {
                                    mr3Var.r = eb2Var;
                                    return;
                                }
                                return;
                            }
                        } else {
                            mr3Var.q = eb2Var;
                            return;
                        }
                    }
                    mr3Var.p = eb2Var;
                    return;
                }
                return;
            default:
                oz1 oz1Var = (oz1) obj2;
                s02 s02Var = (s02) obj;
                ((ii6) ((eo3) obj3).y).t.getClass();
                s02Var.getClass();
                ExternalDownloadService externalDownloadService = s02Var.a;
                String str = s02Var.b;
                long j = s02Var.c;
                int i3 = ExternalDownloadService.R;
                if (externalDownloadService.i(j, str)) {
                    externalDownloadService.n();
                    s02Var.d.delete();
                    externalDownloadService.h().f(str, new da(oz1Var.x, b2));
                    externalDownloadService.f(str);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.dw3
    public Object j(final bu3 bu3Var, final dt3 dt3Var, int i) {
        byte b = this.x;
        Object obj = this.z;
        dw3 dw3Var = (dw3) this.y;
        switch (b) {
            case 6:
                final bw3 bw3Var = (bw3) obj;
                if (bu3Var.i()) {
                    return wc7.w(new tk5(-100));
                }
                final byte b2 = 1;
                return eq6.k0((ii3) dw3Var.j(bu3Var, dt3Var, i), new gt() { // from class: fv3
                    /* JADX WARN: Type inference failed for: r0v3, types: [ii3, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v3, types: [ii3, java.lang.Object] */
                    @Override // defpackage.gt
                    public final ii3 apply(Object obj2) {
                        byte b3 = b2;
                        byte b4 = 25;
                        Object obj3 = bw3Var;
                        switch (b3) {
                            case 0:
                                bu3 bu3Var2 = bu3Var;
                                Handler handler = bu3Var2.l;
                                f32 f32Var = new f32(bu3Var2, dt3Var, new ze((Object) bu3Var2, obj3, obj2, (byte) 15));
                                tk5 tk5Var = new tk5(0);
                                String str = eq6.a;
                                ?? obj4 = new Object();
                                eq6.a0(handler, new ze((Object) obj4, f32Var, tk5Var, b4));
                                return obj4;
                            default:
                                List list = (List) obj2;
                                bu3 bu3Var3 = bu3Var;
                                Handler handler2 = bu3Var3.l;
                                dt3 dt3Var2 = dt3Var;
                                f32 f32Var2 = new f32(bu3Var3, dt3Var2, new es3(bu3Var3, (bw3) obj3, dt3Var2, list, (byte) 5));
                                tk5 tk5Var2 = new tk5(0);
                                String str2 = eq6.a;
                                ?? obj5 = new Object();
                                eq6.a0(handler2, new ze((Object) obj5, f32Var2, tk5Var2, b4));
                                return obj5;
                        }
                    }
                });
            default:
                final qi2 qi2Var = (qi2) obj;
                if (bu3Var.i()) {
                    return wc7.w(new tk5(-100));
                }
                final byte b3 = 0;
                return eq6.k0((ii3) dw3Var.j(bu3Var, dt3Var, i), new gt() { // from class: fv3
                    /* JADX WARN: Type inference failed for: r0v3, types: [ii3, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v3, types: [ii3, java.lang.Object] */
                    @Override // defpackage.gt
                    public final ii3 apply(Object obj2) {
                        byte b32 = b3;
                        byte b4 = 25;
                        Object obj3 = qi2Var;
                        switch (b32) {
                            case 0:
                                bu3 bu3Var2 = bu3Var;
                                Handler handler = bu3Var2.l;
                                f32 f32Var = new f32(bu3Var2, dt3Var, new ze((Object) bu3Var2, obj3, obj2, (byte) 15));
                                tk5 tk5Var = new tk5(0);
                                String str = eq6.a;
                                ?? obj4 = new Object();
                                eq6.a0(handler, new ze((Object) obj4, f32Var, tk5Var, b4));
                                return obj4;
                            default:
                                List list = (List) obj2;
                                bu3 bu3Var3 = bu3Var;
                                Handler handler2 = bu3Var3.l;
                                dt3 dt3Var2 = dt3Var;
                                f32 f32Var2 = new f32(bu3Var3, dt3Var2, new es3(bu3Var3, (bw3) obj3, dt3Var2, list, (byte) 5));
                                tk5 tk5Var2 = new tk5(0);
                                String str2 = eq6.a;
                                ?? obj5 = new Object();
                                eq6.a0(handler2, new ze((Object) obj5, f32Var2, tk5Var2, b4));
                                return obj5;
                        }
                    }
                });
        }
    }

    @Override // defpackage.ve6
    public void run() {
        pp3 pp3Var = (pp3) this.y;
        pp3Var.Z.set(pp3Var.y((pz2) this.z, pp3Var.T, 0));
    }

    public /* synthetic */ fs0(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }
}
