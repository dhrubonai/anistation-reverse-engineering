package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import com.anistation.model.Info;
import com.anistation.model.NextAiringEpisode;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class wb implements sb2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ wb(do5 do5Var, v11 v11Var, wj wjVar, sb2 sb2Var) {
        this.x = (byte) 6;
        this.y = do5Var;
        this.A = v11Var;
        this.B = wjVar;
        this.z = sb2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sb2
    public final Object invoke() {
        Integer num;
        NextAiringEpisode nextAiringEpisode;
        Integer episodeNumber;
        pn6 showCompleted$lambda$12;
        int i = 0;
        Object[] objArr = 0;
        Integer num2 = null;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        switch (this.x) {
            case 0:
                ((hg1) this.y).e((sb2) this.z, (eg1) this.A, (ia3) this.B);
                return pn6.a;
            case 1:
                zm6 zm6Var = (zm6) this.y;
                jc2 jc2Var = (jc2) this.z;
                Info info = (Info) this.A;
                w44 w44Var = (w44) this.B;
                if (!zm6Var.g) {
                    if (info != null) {
                        num = info.getTotalEpisodes();
                    } else {
                        num = null;
                    }
                    if (info != null && (nextAiringEpisode = info.getNextAiringEpisode()) != null && (episodeNumber = nextAiringEpisode.getEpisodeNumber()) != null) {
                        i = episodeNumber.intValue() - 1;
                    } else {
                        if (info != null) {
                            num2 = info.getTotalEpisodes();
                        }
                        if (num2 != null) {
                            i = num2.intValue();
                        }
                    }
                    jc2Var.invoke(num, Integer.valueOf(i), Integer.valueOf(zm6Var.e.size()));
                } else {
                    w44Var.setValue(Boolean.TRUE);
                }
                return pn6.a;
            case 2:
                ub2 ub2Var = (ub2) this.y;
                w44 w44Var2 = (w44) this.z;
                w44 w44Var3 = (w44) this.A;
                w44 w44Var4 = (w44) this.B;
                ub2Var.invoke(yo0.I0((Set) w44Var2.getValue()));
                Boolean bool = Boolean.FALSE;
                w44Var3.setValue(bool);
                w44Var2.setValue(tt1.x);
                w44Var4.setValue(bool);
                return pn6.a;
            case 3:
                kd2 kd2Var = (kd2) this.y;
                hj0 hj0Var = (hj0) this.z;
                xr5 xr5Var = (xr5) this.A;
                k14 k14Var = (k14) this.B;
                bu0 bu0Var = kd2Var.M;
                hj0 hj0Var2 = bu0Var.b;
                try {
                    bu0Var.b = hj0Var;
                    xr5 xr5Var2 = kd2Var.G;
                    int[] iArr = kd2Var.o;
                    s34 s34Var = kd2Var.v;
                    kd2Var.o = null;
                    kd2Var.v = null;
                    try {
                        kd2Var.G = xr5Var;
                        boolean z = bu0Var.e;
                        try {
                            bu0Var.e = false;
                            kd2Var.H(k14Var.a, k14Var.g, k14Var.b, true);
                            bu0Var.e = z;
                            kd2Var.G = xr5Var2;
                            kd2Var.o = iArr;
                            kd2Var.v = s34Var;
                            bu0Var.b = hj0Var2;
                            return pn6.a;
                        } catch (Throwable th) {
                            bu0Var.e = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        kd2Var.G = xr5Var2;
                        kd2Var.o = iArr;
                        kd2Var.v = s34Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    bu0Var.b = hj0Var2;
                    throw th3;
                }
            case 4:
                Float f = (Float) this.y;
                py2 py2Var = (py2) this.z;
                Float f2 = (Float) this.A;
                oy2 oy2Var = (oy2) this.B;
                if (!f.equals(py2Var.x) || !f2.equals(py2Var.y)) {
                    py2Var.x = f;
                    py2Var.y = f2;
                    py2Var.A = new l76(oy2Var, db.l, f, f2, null);
                    py2Var.E.b.setValue(Boolean.TRUE);
                    py2Var.B = false;
                    py2Var.C = true;
                }
                return pn6.a;
            case 5:
                showCompleted$lambda$12 = LegacyShowUseCase.showCompleted$lambda$12((Listeners) this.y, (String) this.z, (ShowStatus) this.A, (LegacyShowUseCase) this.B);
                return showCompleted$lambda$12;
            case 6:
                do5 do5Var = (do5) this.y;
                v11 v11Var = (v11) this.A;
                wj wjVar = (wj) this.B;
                sb2 sb2Var = (sb2) this.z;
                if (do5Var.c() == eo5.y) {
                    if (do5Var.e.d().a.containsKey(eo5.z)) {
                        tl7.z(v11Var, null, null, new mz3(wjVar, objArr4 == true ? 1 : 0, objArr == true ? 1 : 0), 3);
                        tl7.z(v11Var, null, null, new j80(do5Var, objArr3 == true ? 1 : 0, (byte) 6), 3);
                        return pn6.a;
                    }
                }
                tl7.z(v11Var, null, null, new j80(do5Var, objArr2 == true ? 1 : 0, (byte) 7), 3).l0(new mm(sb2Var, (byte) 7));
                return pn6.a;
            case 7:
                w74 w74Var = (w74) this.y;
                fb5 fb5Var = (fb5) this.z;
                List list = (List) this.A;
                List list2 = (List) this.B;
                w74Var.c.setValue(fb5Var);
                w74Var.b.setValue(list);
                w74Var.d.setValue(list2);
                return pn6.a;
            case 8:
                zn6 zn6Var = (zn6) this.y;
                f05 f05Var = (f05) this.z;
                Activity activity = (Activity) this.A;
                lb5 lb5Var = (lb5) this.B;
                tn6 tn6Var = zn6Var.a;
                if (b06.L("800363057") != null && !uz5.V("Rewarded_Android") && !uz5.M("Rewarded_Android", "REPLACE_WITH", true)) {
                    if (zn6Var.j == null && !zn6Var.f) {
                        if (!activity.isFinishing() && !activity.isDestroyed()) {
                            zn6Var.j = new yn6(new WeakReference(activity), lb5Var, f05Var);
                            if (zn6Var.i != null) {
                                zn6Var.f();
                            } else if (zn6Var.c) {
                                zn6Var.c();
                            } else {
                                zn6Var.b();
                            }
                        } else {
                            f05Var.invoke(u55.z);
                        }
                    } else {
                        f05Var.invoke(u55.A);
                    }
                } else {
                    f05Var.invoke(u55.B);
                }
                return pn6.a;
            default:
                h77 h77Var = (h77) this.y;
                UUID uuid = (UUID) this.z;
                z92 z92Var = (z92) this.A;
                Context context = (Context) this.B;
                String uuid2 = uuid.toString();
                z77 workSpec = h77Var.c.getWorkSpec(uuid2);
                if (workSpec != null && !workSpec.b.a()) {
                    pu4 pu4Var = h77Var.b;
                    synchronized (pu4Var.k) {
                        try {
                            xk3.d().e(pu4.l, "Moving WorkSpec (" + uuid2 + ") to the foreground");
                            v87 v87Var = (v87) pu4Var.g.remove(uuid2);
                            if (v87Var != null) {
                                if (pu4Var.a == null) {
                                    PowerManager.WakeLock a = hx6.a(pu4Var.b);
                                    pu4Var.a = a;
                                    a.acquire();
                                }
                                pu4Var.f.put(uuid2, v87Var);
                                pu4Var.b.startForegroundService(h46.c(pu4Var.b, fy5.d(v87Var.a), z92Var));
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    i77 d = fy5.d(workSpec);
                    String str = h46.G;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", z92Var.a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", z92Var.b);
                    intent.putExtra("KEY_NOTIFICATION", z92Var.c);
                    intent.putExtra("KEY_WORKSPEC_ID", d.a);
                    intent.putExtra("KEY_GENERATION", d.b);
                    context.startService(intent);
                } else {
                    ze0.m("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                return null;
        }
    }

    public /* synthetic */ wb(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
    }
}
