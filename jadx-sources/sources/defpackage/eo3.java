package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.media.metrics.EditingEndedEvent;
import android.media.metrics.EditingSession;
import android.net.ConnectivityManager;
import com.google.android.gms.cast.MediaInfo;
import com.google.protobuf.ByteString;
import com.google.protobuf.u1;
import com.unity3d.ads.RewardedAd;
import com.unity3d.ads.RewardedShowListener;
import com.unity3d.ads.ShowFinishState;
import com.unity3d.ads.UnityAdsError;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class eo3 implements zh1, ki6, r54, nw4, q42, p16, c36, or, RewardedShowListener, qz5, sl {
    public final /* synthetic */ byte x;
    public Object y;

    public eo3(kh6 kh6Var) {
        this.x = (byte) 28;
        kh6Var.getClass();
        String str = b77.a;
        ArrayList J = te4.J(new n50(kh6Var.b, (byte) 0), new n50(kh6Var.c, (byte) 1), new n50(kh6Var.d, (byte) 2));
        Object systemService = kh6Var.a.getSystemService("connectivity");
        systemService.getClass();
        J.add(new g94((ConnectivityManager) systemService));
        this.y = J;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static java.util.ArrayList w(defpackage.eo3 r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo3.w(eo3, java.lang.String):java.util.ArrayList");
    }

    @Override // defpackage.q42
    public float C(float f, float f2) {
        double b = ((ps) this.y).b(f2);
        double d = k42.a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * b) * r8.a * r8.b))) + f;
    }

    @Override // defpackage.c36
    public String G() {
        return ((f36) this.y).y;
    }

    @Override // defpackage.c36
    public void I(b36 b36Var) {
        f36 f36Var = (f36) this.y;
        int length = f36Var.A.length;
        for (int i = 1; i < length; i++) {
            int i2 = f36Var.A[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                b36Var.h(i);
                            }
                        } else {
                            byte[] bArr = f36Var.E[i];
                            bArr.getClass();
                            b36Var.f(i, bArr);
                        }
                    } else {
                        String str = f36Var.D[i];
                        str.getClass();
                        b36Var.w(i, str);
                    }
                } else {
                    b36Var.b(i, f36Var.C[i]);
                }
            } else {
                b36Var.e(i, f36Var.B[i]);
            }
        }
    }

    @Override // defpackage.qz5
    public Set a() {
        return ((sz5) it5.b((kk2) this.y)).a();
    }

    @Override // defpackage.r54
    public void b(long j) {
        h55 h55Var = (h55) this.y;
        h55Var.q.c(j);
        ni6 ni6Var = h55Var.w;
        ni6Var.getClass();
        ni6Var.g();
        ni6Var.i.d(null, 4, 0, 0).b();
    }

    @Override // defpackage.zh1
    public nc1 c() {
        return (oc1) this.y;
    }

    @Override // defpackage.r54
    public void d(long j) {
        ((h55) this.y).q.d(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [j1, java.lang.Object, fl5] */
    @Override // defpackage.ki6
    public void e(o15 o15Var, String str, String str2) {
        h55 h55Var = (h55) this.y;
        qz1 qz1Var = h55Var.q;
        v94.R(qz1Var, o15Var, str, str2);
        h55Var.w = null;
        byte b = h55Var.s;
        boolean z = false;
        if (b == 1) {
            h55Var.s = (byte) 2;
            ou0 ou0Var = h55Var.b;
            ou0Var.getClass();
            int i = zw2.z;
            ou0 a = gv5.a(ou0Var, new oq5(2), h55Var.u);
            h55Var.x.getClass();
            t54 t54Var = h55Var.x;
            if (t54Var.m == 1) {
                z = true;
            }
            io3.B(z);
            t54Var.m = (byte) 2;
            t54 t54Var2 = h55Var.x;
            dj6 dj6Var = h55Var.u;
            dj6Var.getClass();
            h55Var.e(a, t54Var2, dj6Var.a, false);
            return;
        }
        if (b == 2) {
            h55Var.x = null;
            ou0 ou0Var2 = h55Var.b;
            if (!((rr1) ou0Var2.b.get(0)).b.contains(1)) {
                h55Var.i.u(h55Var.q.a());
                return;
            }
            h55Var.s = (byte) 3;
            String str3 = h55Var.p;
            str3.getClass();
            t54 t54Var3 = new t54(str3, h55Var.n, h55Var.r, 0, null);
            String str4 = h55Var.o;
            str4.getClass();
            int i2 = zw2.z;
            ou0 a2 = gv5.a(ou0Var2, new oq5(1), null);
            ou0 b2 = a2.b();
            ArrayList arrayList = new ArrayList(a2.b);
            nq3 nq3Var = new nq3();
            nq3Var.c(str4);
            o15 s = nw2.s(new qr1(new pr1(nq3Var.a())));
            rt3 rt3Var = new rt3(new oq5(2));
            ((jw2) rt3Var.y).d(s);
            arrayList.add(new rr1(rt3Var));
            b2.c(arrayList);
            b2.e = true;
            h55Var.e(b2.a(), t54Var3, 0L, false);
            return;
        }
        if (b == 3) {
            h55Var.s = (byte) 4;
            String str5 = h55Var.p;
            str5.getClass();
            File file = new File(str5);
            String str6 = h55Var.o;
            str6.getClass();
            File file2 = new File(str6);
            ?? obj = new Object();
            new cj6(obj, file, file2).start();
            h55Var.v = obj;
            obj.a(new yc2((Object) obj, (Object) new fq3((Object) h55Var, (byte) 7), (byte) (null == true ? 1 : 0)), new uy1(h55Var.k, null == true ? 1 : 0));
            return;
        }
        h55Var.i.u(qz1Var.a());
    }

    @Override // defpackage.q42
    public float f() {
        return 0.0f;
    }

    @Override // defpackage.r54
    public void g(int i, ea2 ea2Var, int i2, int i3) {
        v94.S(((h55) this.y).q, i, ea2Var, i2, i3);
    }

    @Override // defpackage.nw4
    public Object get() {
        return new bc5(Integer.valueOf(bc5.A).intValue(), (Context) ((nw4) this.y).get(), "com.google.android.datatransport.events");
    }

    @Override // defpackage.r54
    public void h() {
        switch (this.x) {
            case 12:
                ((h55) this.y).i.h();
                return;
            default:
                ii6 ii6Var = (ii6) this.y;
                cs1 cs1Var = ii6Var.y;
                boolean z = true;
                char c = 1;
                if (cs1Var != null) {
                    ScheduledFuture scheduledFuture = (ScheduledFuture) cs1Var.d;
                    scheduledFuture.getClass();
                    scheduledFuture.cancel(false);
                    cs1Var.d = ((ScheduledExecutorService) cs1Var.c).schedule(new ct6((xv3) cs1Var.b, c == true ? 1 : 0), cs1Var.a, TimeUnit.MILLISECONDS);
                    return;
                }
                if (ii6Var.g != -9223372036854775807L) {
                    z = false;
                }
                io3.B(z);
                return;
        }
    }

    @Override // defpackage.ki6
    public void i(o15 o15Var, String str, String str2, oz1 oz1Var) {
        h55 h55Var = (h55) this.y;
        qz1 qz1Var = h55Var.q;
        v94.R(qz1Var, o15Var, str, str2);
        if (oz1Var.x == 7003) {
            h55Var.x = null;
            h55Var.w = null;
            qz1Var.b();
            qz1Var.p = (byte) 6;
            h55Var.d();
            return;
        }
        eo3 eo3Var = h55Var.i;
        qz1Var.q = oz1Var;
        eo3Var.v(qz1Var.a(), oz1Var);
    }

    @Override // defpackage.qz5
    public void j(String str, Iterable iterable) {
        str.getClass();
        iterable.getClass();
        kk2 kk2Var = (kk2) this.y;
        String f = lo0.f(str, false);
        ArrayList arrayList = new ArrayList(zo0.V(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            str2.getClass();
            arrayList.add(lo0.f(str2, true));
        }
        kk2Var.j(f, arrayList);
    }

    public void k(List list) {
        for (int i = 0; i < list.size(); i++) {
            ((HashSet) this.y).add(new lk5(((Integer) list.get(i)).intValue()));
        }
    }

    @Override // defpackage.q42
    public float l(float f, long j) {
        float f2;
        long j2 = j / 1000000;
        j42 a = ((ps) this.y).a(f);
        long j3 = a.c;
        if (j3 > 0) {
            f2 = ((float) j2) / ((float) j3);
        } else {
            f2 = 1.0f;
        }
        return (((Math.signum(a.a) * kc.a(f2).b) * a.b) / ((float) j3)) * 1000.0f;
    }

    @Override // defpackage.or
    public Object m(wc5 wc5Var, Float f, Float f2, ub2 ub2Var, xs5 xs5Var) {
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        Object d = ct5.d(wc5Var, Math.signum(floatValue2) * Math.abs(floatValue), floatValue, n03.a(0.0f, floatValue2, 28), (ll) this.y, ub2Var, xs5Var);
        if (d == w11.x) {
            return d;
        }
        return (il) d;
    }

    public ur3 n() {
        ur3 ur3Var = (ur3) this.y;
        if (ur3Var.x != null) {
            if (!Double.isNaN(ur3Var.A) && ur3Var.A < 0.0d) {
                ze0.k("startTime cannot be negative or NaN.");
                return null;
            }
            if (!Double.isNaN(ur3Var.B)) {
                if (!Double.isNaN(ur3Var.C) && ur3Var.C >= 0.0d) {
                    return ur3Var;
                }
                ze0.k("preloadTime cannot be negative or Nan.");
                return null;
            }
            ze0.k("playbackDuration cannot be NaN.");
            return null;
        }
        ze0.k("media cannot be null.");
        return null;
    }

    public void o(ByteString byteString) {
        if (byteString.isBalanced()) {
            int binarySearch = Arrays.binarySearch(u1.C, byteString.size());
            if (binarySearch < 0) {
                binarySearch = (-(binarySearch + 1)) - 1;
            }
            int b = u1.b(binarySearch + 1);
            ArrayDeque arrayDeque = (ArrayDeque) this.y;
            if (!arrayDeque.isEmpty() && ((ByteString) arrayDeque.peek()).size() < b) {
                int b2 = u1.b(binarySearch);
                ByteString byteString2 = (ByteString) arrayDeque.pop();
                while (!arrayDeque.isEmpty() && ((ByteString) arrayDeque.peek()).size() < b2) {
                    byteString2 = new u1((ByteString) arrayDeque.pop(), byteString2);
                }
                u1 u1Var = new u1(byteString2, byteString);
                while (!arrayDeque.isEmpty()) {
                    int binarySearch2 = Arrays.binarySearch(u1.C, u1Var.x);
                    if (binarySearch2 < 0) {
                        binarySearch2 = (-(binarySearch2 + 1)) - 1;
                    }
                    if (((ByteString) arrayDeque.peek()).size() >= u1.b(binarySearch2 + 1)) {
                        break;
                    } else {
                        u1Var = new u1((ByteString) arrayDeque.pop(), u1Var);
                    }
                }
                arrayDeque.push(u1Var);
                return;
            }
            arrayDeque.push(byteString);
            return;
        }
        if (byteString instanceof u1) {
            u1 u1Var2 = (u1) byteString;
            o(u1Var2.y);
            o(u1Var2.z);
            return;
        }
        qi2.i(byteString.getClass(), "Has a new type of ByteString been created? Found ");
    }

    @Override // com.unity3d.ads.ShowListener
    public void onClicked(RewardedAd rewardedAd) {
        rewardedAd.getClass();
    }

    @Override // com.unity3d.ads.ShowListener
    public void onCompleted(RewardedAd rewardedAd, ShowFinishState showFinishState) {
        rewardedAd.getClass();
        showFinishState.getClass();
        zn6 zn6Var = (zn6) this.y;
        zn6Var.e(new lb5((Object) zn6Var, (Object) showFinishState, (byte) 17));
    }

    @Override // com.unity3d.ads.ShowListener
    public void onFailed(RewardedAd rewardedAd, UnityAdsError unityAdsError) {
        rewardedAd.getClass();
        unityAdsError.getClass();
        zn6 zn6Var = (zn6) this.y;
        zn6Var.e(new xn6(zn6Var, unityAdsError, (byte) 1));
    }

    @Override // com.unity3d.ads.RewardedShowListener
    public void onRewarded(RewardedAd rewardedAd) {
        rewardedAd.getClass();
        zn6 zn6Var = (zn6) this.y;
        zn6Var.e(new un6(zn6Var, (byte) 2));
    }

    @Override // com.unity3d.ads.ShowListener
    public void onStarted(RewardedAd rewardedAd) {
        rewardedAd.getClass();
        zn6 zn6Var = (zn6) this.y;
        zn6Var.e(new un6(zn6Var, (byte) 1));
    }

    @Override // defpackage.c36
    public int p() {
        return ((f36) this.y).A.length;
    }

    @Override // defpackage.q42
    public float q(float f, float f2, long j) {
        float f3;
        long j2 = j / 1000000;
        j42 a = ((ps) this.y).a(f2);
        long j3 = a.c;
        if (j3 > 0) {
            f3 = ((float) j2) / ((float) j3);
        } else {
            f3 = 1.0f;
        }
        return (Math.signum(a.a) * a.b * kc.a(f3).a) + f;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.hx3 r(defpackage.ev2 r18, defpackage.gx3 r19, defpackage.tq5 r20, defpackage.xa5 r21) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo3.r(ev2, gx3, tq5, xa5):hx3");
    }

    public void s(String str, String str2) {
        str2.getClass();
        oa0 oa0Var = (oa0) this.y;
        db.o(oa0Var, str);
        db.o(oa0Var, ": ");
        db.o(oa0Var, str2);
        oa0Var.l0((byte) 13);
        oa0Var.l0((byte) 10);
    }

    public gx3 t(ev2 ev2Var, Object obj, mg4 mg4Var, h95 h95Var) {
        String str;
        String h;
        af0 af0Var = ev2Var.i;
        Map map = ev2Var.d;
        if (af0Var != af0.DISABLED) {
            List list = ((kz4) this.y).d.c;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    ai4 ai4Var = (ai4) list.get(i);
                    de deVar = (de) ai4Var.x;
                    if (((im0) ((e73) ai4Var.y)).g(obj)) {
                        deVar.getClass();
                        switch (deVar.a) {
                            case 0:
                                lp6 lp6Var = (lp6) obj;
                                if (a34.i(lp6Var.c, "android.resource")) {
                                    Configuration configuration = mg4Var.a.getResources().getConfiguration();
                                    Bitmap.Config[] configArr = pq6.a;
                                    str = lp6Var + ":" + (configuration.uiMode & 48);
                                    break;
                                }
                                break;
                            case 1:
                                lp6 lp6Var2 = (lp6) obj;
                                String str2 = lp6Var2.c;
                                if ((str2 == null || str2.equals("file")) && lp6Var2.e != null) {
                                    Bitmap.Config[] configArr2 = pq6.a;
                                    if ((!a34.i(lp6Var2.c, "file") || !a34.i(yo0.m0(ct5.i(lp6Var2)), "android_asset")) && ((Boolean) wk6.p(mg4Var, hv2.c)).booleanValue() && (h = ct5.h(lp6Var2)) != null) {
                                        n22 n22Var = mg4Var.f;
                                        String str3 = qj4.y;
                                        str = lp6Var2 + "-" + ((Long) n22Var.I(r18.l(h)).g);
                                        break;
                                    }
                                }
                                break;
                            default:
                                str = ((lp6) obj).a;
                                break;
                        }
                        str = null;
                        if (str != null) {
                        }
                    }
                    i++;
                } else {
                    str = null;
                }
            }
            if (str != null) {
                if (!((List) wk6.o(ev2Var, hv2.a)).isEmpty()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.put("coil#size", mg4Var.b.toString());
                    return new gx3(str, linkedHashMap);
                }
                return new gx3(str, map);
            }
        }
        return null;
    }

    public void u(sz1 sz1Var) {
        EditingEndedEvent.Builder finalProgressPercent;
        EditingEndedEvent build;
        EditingSession editingSession;
        ii6 ii6Var = (ii6) this.y;
        ii6Var.d();
        ii6Var.h.g(-1, new xv3(this, sz1Var, (byte) 15));
        if (ii6Var.a()) {
            ur1 ur1Var = ii6Var.x;
            ur1Var.getClass();
            boolean z = ii6Var.s;
            tr1 tr1Var = ur1Var.e;
            finalProgressPercent = ur1Var.a(1).setFinalProgressPercent(100.0f);
            ur1Var.f(finalProgressPercent, sz1Var, z);
            ArrayList c = ur1.c(sz1Var.q);
            for (int i = 0; i < c.size(); i++) {
                finalProgressPercent.addInputMediaItemInfo(bu.f(c.get(i)));
            }
            finalProgressPercent.setOutputMediaItemInfo(ur1.d(sz1Var));
            build = finalProgressPercent.build();
            if (!tr1Var.y && (editingSession = tr1Var.x) != null) {
                editingSession.reportEditingEndedEvent(build);
                tr1Var.y = true;
            }
            try {
                h11.A(tr1Var);
            } catch (Exception e) {
                kb0.t("EditingMetricsCollector", "error while closing the metrics reporter", e);
            }
        }
        ii6Var.r = null;
        ii6Var.s = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [mm5, java.lang.Object] */
    public void v(sz1 sz1Var, oz1 oz1Var) {
        int a;
        int i;
        EditingEndedEvent.Builder errorCode;
        EditingEndedEvent build;
        EditingSession editingSession;
        ii6 ii6Var = (ii6) this.y;
        ii6Var.d();
        ii6Var.h.g(-1, new fs0(this, sz1Var, oz1Var));
        if (ii6Var.a()) {
            ?? obj = new Object();
            ii6Var.i();
            pz1 pz1Var = ii6Var.r;
            if (pz1Var == 0) {
                a = 0;
            } else {
                a = pz1Var.a(obj);
            }
            if (a == 2) {
                i = obj.x;
            } else {
                i = -1;
            }
            if (ii6Var.x == null) {
                ii6Var.f();
            }
            ur1 ur1Var = ii6Var.x;
            ur1Var.getClass();
            boolean z = ii6Var.s;
            tr1 tr1Var = ur1Var.e;
            errorCode = ur1Var.a(3).setErrorCode(ur1.f.get(oz1Var.x, 1));
            if (i != -1) {
                errorCode.setFinalProgressPercent(i);
            }
            ur1Var.f(errorCode, sz1Var, z);
            ArrayList c = ur1.c(sz1Var.q);
            for (int i2 = 0; i2 < c.size(); i2++) {
                errorCode.addInputMediaItemInfo(bu.f(c.get(i2)));
            }
            errorCode.setOutputMediaItemInfo(ur1.d(sz1Var));
            build = errorCode.build();
            if (!tr1Var.y && (editingSession = tr1Var.x) != null) {
                editingSession.reportEditingEndedEvent(build);
                tr1Var.y = true;
            }
            try {
                h11.A(tr1Var);
            } catch (Exception e) {
                kb0.t("EditingMetricsCollector", "error while closing the metrics reporter", e);
            }
        }
        ii6Var.r = null;
        ii6Var.s = false;
    }

    public void x(xq2 xq2Var, String str, String str2) {
        xq2Var.getClass();
        str.getClass();
        oa0 oa0Var = (oa0) this.y;
        et5.m(oa0Var, xq2Var.a, 0, 14);
        oa0Var.l0((byte) 32);
        et5.m(oa0Var, str, 0, 14);
        oa0Var.l0((byte) 32);
        et5.m(oa0Var, str2, 0, 14);
        oa0Var.l0((byte) 13);
        oa0Var.l0((byte) 10);
    }

    @Override // defpackage.q42
    public long y(float f) {
        return ((long) (Math.exp(((ps) this.y).b(f) / (k42.a - 1.0d)) * 1000.0d)) * 1000000;
    }

    public w42 z(z77 z77Var) {
        z77Var.getClass();
        ArrayList arrayList = (ArrayList) this.y;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((gx0) obj).c(z77Var)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(zo0.V(arrayList2, 10));
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            arrayList3.add(((gx0) obj2).b(z77Var.j));
        }
        return sw0.m(new mx0((w42[]) yo0.I0(arrayList3).toArray(new w42[0]), (byte) 7));
    }

    @Override // defpackage.sl
    public n42 get(int i) {
        return (n42) this.y;
    }

    public /* synthetic */ eo3(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    public /* synthetic */ eo3(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
    }

    public /* synthetic */ eo3(byte b, boolean z) {
        this.x = b;
    }

    public eo3(MediaInfo mediaInfo) {
        this.x = (byte) 3;
        ur3 ur3Var = new ur3(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.y = ur3Var;
        } else {
            ze0.k("media cannot be null.");
            throw null;
        }
    }

    public eo3(JSONObject jSONObject) {
        this.x = (byte) 3;
        this.y = new ur3(jSONObject);
    }

    public eo3(byte b) {
        this.x = b;
        switch (b) {
            case 13:
                this.y = new ArrayDeque();
                return;
            case 15:
                this.y = new HashSet();
                return;
            case 18:
                this.y = new p18((byte) 14);
                return;
            default:
                this.y = new Object();
                return;
        }
    }

    public eo3(ud1 ud1Var) {
        this.x = (byte) 17;
        this.y = new ps(ow5.a, ud1Var);
    }

    public eo3(p82 p82Var, xo3 xo3Var, ia3 ia3Var) {
        this.x = (byte) 21;
        this.y = new st3((byte) 27);
    }

    public eo3(long[] jArr) {
        w34 w34Var;
        this.x = (byte) 16;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            w34Var = new w34(copyOf.length);
            int i = w34Var.b;
            if (i >= 0) {
                if (copyOf.length != 0) {
                    w34Var.b(copyOf.length + i);
                    long[] jArr2 = w34Var.a;
                    int i2 = w34Var.b;
                    if (i != i2) {
                        ms.z0(jArr2, jArr2, copyOf.length + i, i, i2);
                    }
                    ms.z0(copyOf, jArr2, i, 0, copyOf.length);
                    w34Var.b += copyOf.length;
                }
            } else {
                ze0.g("");
                throw null;
            }
        } else {
            w34Var = new w34();
        }
        this.y = w34Var;
    }
}
