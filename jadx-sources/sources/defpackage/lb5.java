package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import androidx.work.impl.WorkDatabase;
import com.anistation.model.AnimeWatchOrderItem;
import com.anistation.model.Info;
import com.anistation.model.NextAiringEpisode;
import com.anistation.model.Resource;
import com.anistation.model.schedule.AnimeSchedule;
import com.anistation.model.settings.SubtitleFontFamily;
import com.anistation.model.watch.Provider;
import com.unity3d.ads.RewardedAd;
import com.unity3d.ads.ShowFinishState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class lb5 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ lb5(hd6 hd6Var, jo joVar, wf wfVar) {
        this.x = (byte) 14;
        this.y = joVar;
        this.z = wfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [nd6] */
    /* JADX WARN: Type inference failed for: r16v3, types: [nd6] */
    @Override // defpackage.sb2
    public final Object invoke() {
        int i;
        long j;
        cd6 d;
        uf3 uf3Var;
        ko koVar;
        CharSequence charSequence;
        int i2;
        u55 u55Var;
        int S;
        Integer num;
        NextAiringEpisode nextAiringEpisode;
        Integer episodeNumber;
        Object obj;
        boolean z;
        byte b = 13;
        byte b2 = 10;
        int i3 = 2;
        boolean z2 = true;
        int i4 = 0;
        vz0 vz0Var = null;
        Integer num2 = null;
        switch (this.x) {
            case 0:
                ub2 ub2Var = (ub2) this.y;
                AnimeSchedule animeSchedule = (AnimeSchedule) this.z;
                ub2Var.invoke(vc2.a(animeSchedule.getAnilistId(), animeSchedule.getId()));
                return pn6.a;
            case 1:
                ic6 ic6Var = (ic6) this.y;
                ti4 ti4Var = ic6Var.c;
                sb2 sb2Var = (sb2) this.z;
                o96 g = ic6Var.g();
                try {
                    g.c("", 0, g.y.length());
                    ss5.g(g);
                    ic6Var.a(g);
                    ti4Var.setValue(Boolean.FALSE);
                    ic6Var.f(false);
                    sb2Var.invoke();
                    return pn6.a;
                } catch (Throwable th) {
                    ti4Var.setValue(Boolean.FALSE);
                    ic6Var.f(false);
                    throw th;
                }
            case 2:
                Context context = (Context) this.y;
                sm3 sm3Var = (sm3) this.z;
                if (Build.VERSION.SDK_INT >= 33 && t80.A(context, "android.permission.POST_NOTIFICATIONS") != 0) {
                    sm3Var.a("android.permission.POST_NOTIFICATIONS");
                }
                return pn6.a;
            case 3:
                hm5 hm5Var = (hm5) this.y;
                tl7.z(zz.J(hm5Var), null, null, new e05(hm5Var, new nj4((Resources) this.z, (byte) 20), new nl5(1, si.a, si.class, "show", "show(Ljava/lang/String;)V", 0, (byte) 0), null, (byte) 6), 3);
                return pn6.a;
            case 4:
                hm5 hm5Var2 = (hm5) this.y;
                Context context2 = (Context) this.z;
                tg5 tg5Var = new tg5((byte) 12);
                tg5 tg5Var2 = new tg5(b);
                context2.getClass();
                tl7.z(zz.J(hm5Var2), null, null, new l5(hm5Var2, context2, tg5Var, tg5Var2, null, (byte) 15), 3);
                return pn6.a;
            case 5:
                hm5 hm5Var3 = (hm5) this.y;
                tl7.z(zz.J(hm5Var3), null, null, new q8(hm5Var3, new vf((String) this.z, (byte) 4), vz0Var, b2), 3);
                return pn6.a;
            case 6:
                String str = (String) this.y;
                sb2 sb2Var2 = (sb2) this.z;
                si siVar = si.a;
                si.a(str);
                sb2Var2.invoke();
                return pn6.a;
            case 7:
                r82 r82Var = (r82) this.y;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.z;
                synchronized (mn5.b) {
                    LinkedHashMap linkedHashMap = mn5.c;
                    linkedHashMap.remove(r82Var);
                    if (linkedHashMap.isEmpty()) {
                        xk3.d().a(b77.a, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(mn5.a);
                        mn5.f = null;
                        mn5.d = null;
                        mn5.e = false;
                    }
                }
                return pn6.a;
            case 8:
                ((ub2) this.y).invoke(new ep0(((l16) this.z).b));
                return pn6.a;
            case 9:
                ((ub2) this.y).invoke((SubtitleFontFamily) this.z);
                return pn6.a;
            case 10:
                Context context3 = (Context) this.y;
                TextClassification textClassification = (TextClassification) this.z;
                String text = textClassification.getText();
                if (text != null) {
                    i4 = text.hashCode();
                }
                lz5.d(PendingIntent.getActivity(context3, i4, textClassification.getIntent(), 201326592));
                return pn6.a;
            case 11:
                u96 u96Var = (u96) this.y;
                u05 u05Var = (u05) this.z;
                u96Var.Q.d();
                if (u96Var.K && ((lf3) ((r47) t80.C(u96Var, bv0.u))).a()) {
                    i3 = 1;
                }
                int i5 = u05Var.x;
                int i6 = i3 * i5;
                u05Var.x = i5 * (-1);
                return Integer.valueOf(i6);
            case 12:
                cc6 cc6Var = (cc6) this.y;
                fa6 fa6Var = (fa6) this.z;
                if (!cc6Var.h) {
                    m82 m82Var = fa6Var.W;
                    if (m82Var.K) {
                        h82.j1(m82Var.S);
                    }
                }
                return pn6.a;
            case 13:
                jb6 jb6Var = (jb6) this.y;
                long j2 = ((k13) ((w44) this.z).getValue()).a;
                xc4 g2 = jb6Var.g();
                long j3 = 9205357640488583168L;
                if (g2 != null) {
                    long j4 = g2.a;
                    ko k = jb6Var.k();
                    if (k != null && k.y.length() != 0) {
                        cj2 cj2Var = (cj2) jb6Var.q.getValue();
                        if (cj2Var == null) {
                            i = -1;
                        } else {
                            i = lb6.a[cj2Var.ordinal()];
                        }
                        if (i != -1) {
                            if (i != 1 && i != 2) {
                                if (i == 3) {
                                    long j5 = jb6Var.l().b;
                                    int i7 = nd6.c;
                                    j = j5 & 4294967295L;
                                } else {
                                    ze0.l();
                                    return null;
                                }
                            } else {
                                long j6 = jb6Var.l().b;
                                int i8 = nd6.c;
                                j = j6 >> 32;
                            }
                            int i9 = (int) j;
                            uf3 uf3Var2 = jb6Var.d;
                            if (uf3Var2 != null && (d = uf3Var2.d()) != null && (uf3Var = jb6Var.d) != null && (koVar = (ko) uf3Var.a.b) != null) {
                                jb6Var.b.b(i9);
                                int C = db.C(i9, 0, koVar.y.length());
                                float intBitsToFloat = Float.intBitsToFloat((int) (d.d(j4) >> 32));
                                bd6 bd6Var = d.a;
                                o24 o24Var = bd6Var.b;
                                int d2 = o24Var.d(C);
                                float f = bd6Var.f(d2);
                                float g3 = bd6Var.g(d2);
                                float B = db.B(intBitsToFloat, Math.min(f, g3), Math.max(f, g3));
                                if (k13.a(j2, 0L) || Math.abs(intBitsToFloat - B) <= ((int) (j2 >> 32)) / 2) {
                                    float f2 = o24Var.f(d2);
                                    j3 = (Float.floatToRawIntBits(B) << 32) | (Float.floatToRawIntBits(((o24Var.b(d2) - f2) / 2.0f) + f2) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new xc4(j3);
            case 14:
                jo joVar = (jo) this.y;
                wf wfVar = (wf) this.z;
                vh3 vh3Var = (vh3) joVar.a;
                if (vh3Var instanceof uh3) {
                    try {
                        wfVar.a(((uh3) vh3Var).a);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return pn6.a;
            case 15:
                gi6 gi6Var = (gi6) this.y;
                h95 h95Var = (h95) this.z;
                p96 c = gi6Var.a.c();
                nh5 nh5Var = (nh5) gi6Var.d.getValue();
                l13 l13Var = new l13((byte) 2);
                StringBuilder sb = new StringBuilder();
                boolean z3 = false;
                while (i4 < c.A.length()) {
                    int codePointAt = Character.codePointAt(c, i4);
                    h95Var.getClass();
                    if (codePointAt == 10) {
                        i2 = 32;
                    } else if (codePointAt == 13) {
                        i2 = 65279;
                    } else {
                        i2 = codePointAt;
                    }
                    int charCount = Character.charCount(codePointAt);
                    if (i2 != codePointAt) {
                        l13Var.i(sb.length(), sb.length() + charCount, Character.charCount(i2));
                        z3 = true;
                    }
                    sb.appendCodePoint(i2);
                    i4 += charCount;
                    z3 = z3;
                }
                CharSequence sb2 = sb.toString();
                if (z3) {
                    charSequence = sb2;
                } else {
                    charSequence = c;
                }
                if (charSequence == c) {
                    return null;
                }
                long e = xt5.e(c.B, l13Var, nh5Var);
                nd6 nd6Var = c.C;
                if (nd6Var != null) {
                    vz0Var = new nd6(xt5.e(nd6Var.a, l13Var, nh5Var));
                }
                return new ei6(new p96(charSequence, e, vz0Var, null, null, null, null, 120), l13Var);
            case 16:
                zn6 zn6Var = (zn6) this.y;
                if (zn6Var.i == ((RewardedAd) this.z)) {
                    zn6Var.i = null;
                    zn6Var.c();
                }
                return pn6.a;
            case 17:
                zn6 zn6Var2 = (zn6) this.y;
                ShowFinishState showFinishState = (ShowFinishState) this.z;
                if (zn6Var2.h && showFinishState == ShowFinishState.COMPLETED) {
                    u55Var = u55.x;
                } else {
                    u55Var = u55.y;
                }
                if (zn6Var2.f) {
                    zn6Var2.f = false;
                    zn6Var2.g = false;
                    zn6Var2.h = false;
                    zn6Var2.a(u55Var);
                    zn6Var2.c();
                }
                return pn6.a;
            case 18:
                ArrayList arrayList = (ArrayList) this.y;
                op6 op6Var = (op6) this.z;
                String str2 = op6Var.C;
                if (arrayList.isEmpty() || (S = uz5.S(str2, '/', op6Var.F.x.length() + 3, 4)) == -1) {
                    return "";
                }
                int U = uz5.U(str2, new char[]{'?', '#'}, S, false);
                if (U == -1) {
                    return str2.substring(S);
                }
                return str2.substring(S, U);
            case 19:
                ub2 ub2Var2 = (ub2) this.y;
                AnimeWatchOrderItem animeWatchOrderItem = (AnimeWatchOrderItem) this.z;
                ub2Var2.invoke(vc2.a(animeWatchOrderItem.getAnilistId(), animeWatchOrderItem.getId()));
                return pn6.a;
            case 20:
                ym6 ym6Var = (ym6) this.y;
                jc2 jc2Var = (jc2) this.z;
                Resource resource = ym6Var.u;
                if ((resource instanceof Resource.Success) && (ym6Var.t instanceof Resource.Success)) {
                    Info info = (Info) ((Resource.Success) resource).getData();
                    if (info != null) {
                        num = info.getTotalEpisodes();
                    } else {
                        num = null;
                    }
                    Resource.Success success = (Resource.Success) resource;
                    Info info2 = (Info) success.getData();
                    if (info2 != null && (nextAiringEpisode = info2.getNextAiringEpisode()) != null && (episodeNumber = nextAiringEpisode.getEpisodeNumber()) != null) {
                        i4 = episodeNumber.intValue() - 1;
                    } else {
                        Info info3 = (Info) success.getData();
                        if (info3 != null) {
                            num2 = info3.getTotalEpisodes();
                        }
                        if (num2 != null) {
                            i4 = num2.intValue();
                        }
                    }
                    jc2Var.invoke(num, Integer.valueOf(i4), Integer.valueOf(ym6Var.c.size()));
                }
                return pn6.a;
            case 21:
                e9 e9Var = (e9) this.y;
                px5 px5Var = (px5) this.z;
                if (e9Var.c.getValue() != xx6.z || ((Number) px5Var.getValue()).floatValue() <= 0.99f) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 22:
                r05 r05Var = (r05) this.y;
                ei0 ei0Var = (ei0) this.z;
                boolean l0 = ei0Var.a.l0();
                r05Var.x = l0;
                if (l0) {
                    ei0Var.J();
                }
                return pn6.a;
            case 23:
                v27 v27Var = (v27) this.y;
                boolean z4 = ((dq4) ((w44) this.z).getValue()).b;
                ei0 ei0Var2 = v27Var.l;
                if (z4) {
                    ei0Var2.J();
                } else {
                    ei0Var2.p0();
                }
                return pn6.a;
            case 24:
                ((ub2) this.y).invoke(((Provider) this.z).getId());
                return pn6.a;
            default:
                l77 l77Var = (l77) this.y;
                yk4 yk4Var = (yk4) this.z;
                pn6 pn6Var = pn6.a;
                a87 workSpecDao = l77Var.c.workSpecDao();
                List workSpecIdAndStatesForName = workSpecDao.getWorkSpecIdAndStatesForName("anistation_periodic_backup");
                if (workSpecIdAndStatesForName.size() <= 1) {
                    x77 x77Var = (x77) yo0.m0(workSpecIdAndStatesForName);
                    if (x77Var == null) {
                        su1.a(new c77(l77Var, "anistation_periodic_backup", px1.y, te4.H(yk4Var), 0));
                    } else {
                        String str3 = x77Var.a;
                        z77 workSpec = workSpecDao.getWorkSpec(str3);
                        if (workSpec != null) {
                            if (workSpec.c()) {
                                if (x77Var.b == j77.C) {
                                    workSpecDao.delete(str3);
                                    su1.a(new c77(l77Var, "anistation_periodic_backup", px1.y, te4.H(yk4Var), 0));
                                } else {
                                    z77 b3 = z77.b(yk4Var.b, x77Var.a, null, null, 0, 0L, 0, 0, 0L, 0, 33554430);
                                    pu4 pu4Var = l77Var.f;
                                    pu4Var.getClass();
                                    WorkDatabase workDatabase = l77Var.c;
                                    workDatabase.getClass();
                                    pv0 pv0Var = l77Var.b;
                                    pv0Var.getClass();
                                    List list = l77Var.e;
                                    list.getClass();
                                    Set set = yk4Var.c;
                                    String str4 = "OneTime";
                                    String str5 = b3.a;
                                    z77 workSpec2 = workDatabase.workSpecDao().getWorkSpec(str5);
                                    if (workSpec2 != null) {
                                        if (!workSpec2.b.a()) {
                                            if (!(workSpec2.c() ^ b3.c())) {
                                                synchronized (pu4Var.k) {
                                                    if (pu4Var.c(str5) != null) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                }
                                                if (!z) {
                                                    Iterator it = list.iterator();
                                                    while (it.hasNext()) {
                                                        ((tb5) it.next()).d(str5);
                                                    }
                                                }
                                                workDatabase.runInTransaction(new z40(workDatabase, str5, workSpec2, b3, list, set, z, l77Var));
                                                if (!z) {
                                                    wb5.b(pv0Var, workDatabase, list);
                                                }
                                            } else {
                                                if (!workSpec2.c()) {
                                                    obj = "OneTime";
                                                } else {
                                                    obj = "Periodic";
                                                }
                                                if (b3.c()) {
                                                    str4 = "Periodic";
                                                }
                                                throw new UnsupportedOperationException("Can't update " + obj + " Worker to " + ((Object) str4) + " Worker. Update operation must preserve worker's type.");
                                            }
                                        }
                                    } else {
                                        ze0.k(qx1.m("Worker with ", str5, " doesn't exist"));
                                        return null;
                                    }
                                }
                            } else {
                                ov3.g("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                                return null;
                            }
                        } else {
                            ze0.m(qx1.m("WorkSpec with ", str3, ", that matches a name \"anistation_periodic_backup\", wasn't found"));
                            return null;
                        }
                    }
                    return pn6Var;
                }
                ov3.g("Can't apply UPDATE policy to the chains of work.");
                return null;
        }
    }

    public /* synthetic */ lb5(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }
}
