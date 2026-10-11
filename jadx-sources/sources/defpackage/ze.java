package defpackage;

import android.graphics.Bitmap;
import android.media.AudioTrack;
import android.os.Handler;
import android.util.Pair;
import android.view.ActionMode;
import android.view.KeyEvent;
import androidx.work.impl.WorkDatabase;
import com.discord.org.webrtc.EglRenderer;
import com.discord.org.webrtc.VideoFileRenderer;
import com.discord.org.webrtc.VideoFrame;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ze implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ze(ka1 ka1Var, oy oyVar, p65 p65Var, xx xxVar) {
        this.x = (byte) 5;
        this.y = ka1Var;
        this.z = oyVar;
        this.A = xxVar;
    }

    private final void a() {
        boolean z;
        l33 l33Var = (l33) this.y;
        ix5 ix5Var = (ix5) this.z;
        l87 l87Var = (l87) this.A;
        pu4 pu4Var = (pu4) l33Var.y;
        pu4Var.getClass();
        i77 i77Var = ix5Var.a;
        String str = i77Var.a;
        ArrayList arrayList = new ArrayList();
        byte b = 1;
        z77 z77Var = (z77) pu4Var.e.runInTransaction(new ed1(pu4Var, arrayList, str, b));
        if (z77Var == null) {
            xk3.d().g(pu4.l, "Didn't find WorkSpec for id " + i77Var);
            pu4Var.e(i77Var);
            return;
        }
        synchronized (pu4Var.k) {
            try {
                synchronized (pu4Var.k) {
                    if (pu4Var.c(str) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    Set set = (Set) pu4Var.h.get(str);
                    if (((ix5) set.iterator().next()).a.b == i77Var.b) {
                        set.add(ix5Var);
                        xk3.d().a(pu4.l, "Work " + i77Var + " is already enqueued for processing");
                    } else {
                        pu4Var.e(i77Var);
                    }
                    return;
                }
                if (z77Var.t != i77Var.b) {
                    pu4Var.e(i77Var);
                    return;
                }
                ai6 ai6Var = new ai6(pu4Var.b, pu4Var.c, pu4Var.d, pu4Var, pu4Var.e, z77Var, arrayList);
                if (l87Var != null) {
                    ai6Var.h = l87Var;
                }
                v87 v87Var = new v87(ai6Var);
                zf0 C = wc7.C(v87Var.e.b.plus(h98.e()), new t87(v87Var, null, b));
                C.y.a(new ze((Object) pu4Var, (Object) C, (Object) v87Var, (byte) 19), pu4Var.d.e);
                pu4Var.g.put(str, v87Var);
                HashSet hashSet = new HashSet();
                hashSet.add(ix5Var);
                pu4Var.h.put(str, hashSet);
                xk3.d().a(pu4.l, pu4.class.getSimpleName() + ": processing " + i77Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        i77 d;
        ArrayList arrayList;
        boolean z = true;
        byte b = 0;
        boolean z2 = false;
        switch (this.x) {
            case 0:
                af afVar = (af) this.y;
                xe xeVar = (xe) this.z;
                ye yeVar = (ye) this.A;
                ActionMode startActionMode = afVar.a.startActionMode(new v42(xeVar), 1);
                afVar.h = startActionMode;
                if (startActionMode == null) {
                    yeVar.close();
                    return;
                }
                return;
            case 1:
                pz2 pz2Var = (pz2) this.y;
                ea2 ea2Var = (ea2) this.z;
                s61 s61Var = (s61) this.A;
                iw iwVar = (iw) pz2Var.z;
                String str = eq6.a;
                iwVar.w(ea2Var, s61Var);
                return;
            case 2:
                AudioTrack audioTrack = (AudioTrack) this.y;
                Handler handler = (Handler) this.z;
                ui3 ui3Var = (ui3) this.A;
                byte b2 = 8;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new p0(ui3Var, b2));
                    }
                    synchronized (ww.p) {
                        try {
                            int i = ww.r - 1;
                            ww.r = i;
                            if (i == 0) {
                                ScheduledExecutorService scheduledExecutorService = ww.q;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                ww.q = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new p0(ui3Var, b2));
                    }
                    synchronized (ww.p) {
                        try {
                            int i2 = ww.r - 1;
                            ww.r = i2;
                            if (i2 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = ww.q;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                ww.q = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
            case 3:
                WorkDatabase workDatabase = (WorkDatabase) this.y;
                String str2 = (String) this.z;
                l77 l77Var = (l77) this.A;
                Iterator it = workDatabase.workSpecDao().getUnfinishedWorkWithName(str2).iterator();
                while (it.hasNext()) {
                    bb4.q(l77Var, (String) it.next());
                }
                return;
            case 4:
                eq6.a0(((bu3) this.z).l, new gb((st3) this.y, (xv0) this.A, (byte) 14));
                return;
            case 5:
                ka1 ka1Var = (ka1) this.y;
                oy oyVar = (oy) this.z;
                String str3 = oyVar.a;
                xx xxVar = (xx) this.A;
                ka1Var.getClass();
                Logger logger = ka1.f;
                try {
                    gj6 a = ka1Var.c.a(str3);
                    if (a == null) {
                        String str4 = "Transport backend '" + str3 + "' is not registered";
                        logger.warning(str4);
                        new IllegalArgumentException(str4);
                    } else {
                        ka1Var.e.t(new ia1(ka1Var, oyVar, ((si0) a).a(xxVar), b));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 6:
                tp1 tp1Var = (tp1) this.y;
                ((up1) this.z).k(tp1Var.a, tp1Var.b, (Exception) this.A);
                return;
            case 7:
                tp1 tp1Var2 = (tp1) this.y;
                ((up1) this.z).T(tp1Var2.a, tp1Var2.b, (i18) this.A);
                return;
            case 8:
                EglRenderer.h((EglRenderer) this.y, (CountDownLatch) this.z, (EglRenderer.FrameListener) this.A);
                return;
            case 9:
                EglRenderer.d((EglRenderer) this.y, (CountDownLatch) this.z, (EglRenderer.RenderListener) this.A);
                return;
            case 10:
                c41 c41Var = (c41) this.y;
                tl7 tl7Var = (tl7) this.z;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.A;
                try {
                    c92 j = m37.j(c41Var.a);
                    if (j != null) {
                        b92 b92Var = (b92) j.a;
                        synchronized (b92Var.c) {
                            b92Var.e = threadPoolExecutor;
                        }
                        j.a.a(new ms1(tl7Var, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th2) {
                    tl7Var.C(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 11:
                ((ou2) ((i75) this.y).y).b((Bitmap) this.z, (ea2) this.A);
                return;
            case 12:
                rr3 rr3Var = (rr3) this.y;
                jw2 jw2Var = (jw2) this.z;
                jw3 jw3Var = (jw3) this.A;
                c71 c71Var = rr3Var.c;
                o15 g = jw2Var.g();
                tp tpVar = c71Var.d;
                ko4 ko4Var = c71Var.g;
                ko4Var.getClass();
                tpVar.z = nw2.o(g);
                if (!g.isEmpty()) {
                    tpVar.C = (jw3) g.get(0);
                    jw3Var.getClass();
                    tpVar.D = jw3Var;
                }
                if (((jw3) tpVar.B) == null) {
                    tpVar.B = tp.g(ko4Var, (nw2) tpVar.z, (jw3) tpVar.C, (hf6) tpVar.y);
                }
                tpVar.t(ko4Var.G0());
                return;
            case 13:
                bu3 bu3Var = (bu3) this.y;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.z;
                CountDownLatch countDownLatch = (CountDownLatch) this.A;
                zt3 zt3Var = bu3Var.v;
                if (zt3Var != null) {
                    bu3Var.t.w0(zt3Var);
                }
                if (atomicBoolean.compareAndSet(false, true)) {
                    bu3Var.h.V();
                    bu3Var.g.S();
                }
                countDownLatch.countDown();
                return;
            case 14:
                xt3 xt3Var = (xt3) this.y;
                dt3 dt3Var = (dt3) this.z;
                KeyEvent keyEvent = (KeyEvent) this.A;
                bu3 bu3Var2 = xt3Var.b;
                if (bu3Var2.h(dt3Var)) {
                    bu3Var2.a(keyEvent, false, false);
                } else {
                    wu3 wu3Var = bu3Var2.h;
                    xu3 xu3Var = dt3Var.a;
                    wu3Var.getClass();
                    wu3Var.O(1, new du3(wu3Var, (byte) 12), xu3Var, true);
                }
                xt3Var.a = null;
                return;
            case 15:
                bu3 bu3Var3 = (bu3) this.y;
                et3 et3Var = (et3) this.A;
                if (!bu3Var3.i()) {
                    bu3Var3.t();
                    x97.Q(bu3Var3.t, et3Var);
                    return;
                }
                return;
            case 16:
                xw3 xw3Var = (xw3) this.y;
                Pair pair = (Pair) this.z;
                xw3Var.b.i.T(((Integer) pair.first).intValue(), (jw3) pair.second, (i18) this.A);
                return;
            case 17:
                xw3 xw3Var2 = (xw3) this.y;
                Pair pair2 = (Pair) this.z;
                xw3Var2.b.i.k(((Integer) pair2.first).intValue(), (jw3) pair2.second, (Exception) this.A);
                return;
            case 18:
                bo4 bo4Var = (bo4) this.y;
                dv6 dv6Var = (dv6) this.z;
                ns6 ns6Var = (ns6) this.A;
                ea2 ea2Var2 = bo4Var.c;
                ea2Var2.getClass();
                dv6Var.c(new fv6(ns6Var, ea2Var2));
                return;
            case 19:
                pu4 pu4Var = (pu4) this.y;
                zf0 zf0Var = (zf0) this.z;
                v87 v87Var = (v87) this.A;
                pu4Var.getClass();
                try {
                    z = ((Boolean) zf0Var.y.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (pu4Var.k) {
                    try {
                        d = fy5.d(v87Var.a);
                        String str5 = d.a;
                        if (pu4Var.c(str5) == v87Var) {
                            pu4Var.b(str5);
                        }
                        xk3.d().a(pu4.l, pu4.class.getSimpleName() + " " + str5 + " executed; reschedule = " + z);
                        arrayList = new ArrayList(pu4Var.j);
                    } finally {
                    }
                }
                int size = arrayList.size();
                while (b < size) {
                    ((bx1) arrayList.get(b)).b(d, z);
                    b++;
                }
                return;
            case 20:
                ((IUnityAdsInitializationListener) this.y).onInitializationFailed((UnityAds.UnityAdsInitializationError) this.z, (String) this.A);
                return;
            case 21:
                ni6 ni6Var = (ni6) this.y;
                jw2 jw2Var2 = (jw2) this.z;
                oz1 oz1Var = (oz1) this.A;
                ki6 ki6Var = ni6Var.e;
                o15 g2 = jw2Var2.g();
                dn0 dn0Var = ni6Var.d;
                ki6Var.i(g2, (String) dn0Var.z, (String) dn0Var.A, oz1Var);
                return;
            case 22:
                UnityAds.show$lambda$16$lambda$15$lambda$14((IUnityAdsShowListener) this.y, (String) this.z, (Throwable) this.A);
                return;
            case 23:
                UnityAds.load$lambda$22$lambda$21$lambda$20((IUnityAdsLoadListener) this.y, (String) this.z, (Throwable) this.A);
                return;
            case 24:
                ii3 ii3Var = (ii3) this.y;
                fl5 fl5Var = (fl5) this.z;
                try {
                    try {
                        fl5Var.n(((gt) this.A).apply(wc7.s(ii3Var)));
                        return;
                    } catch (Throwable th3) {
                        fl5Var.m(th3);
                        return;
                    }
                } catch (Error | RuntimeException e2) {
                    fl5Var.m(e2);
                    return;
                } catch (CancellationException unused2) {
                    fl5Var.cancel(false);
                    return;
                } catch (ExecutionException e3) {
                    e = e3;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    fl5Var.m(e);
                    return;
                }
            case 25:
                fl5 fl5Var2 = (fl5) this.y;
                f32 f32Var = (f32) this.z;
                tk5 tk5Var = (tk5) this.A;
                try {
                    if (!(fl5Var2.x instanceof x0)) {
                        f32Var.run();
                        fl5Var2.l(tk5Var);
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    fl5Var2.m(th4);
                    return;
                }
            case 26:
                VideoFileRenderer.a((VideoFileRenderer) this.y, (VideoFrame.I420Buffer) this.z, (VideoFrame) this.A);
                return;
            case 27:
                l33 l33Var = (l33) this.y;
                ea2 ea2Var3 = (ea2) this.z;
                s61 s61Var2 = (s61) this.A;
                lt6 lt6Var = (lt6) l33Var.z;
                String str6 = eq6.a;
                lt6Var.x(ea2Var3, s61Var2);
                return;
            case 28:
                a();
                return;
            default:
                s87 s87Var = (s87) this.y;
                r05 r05Var = (r05) this.z;
                v87 v87Var2 = (v87) this.A;
                if (s87Var instanceof p87) {
                    oi3 oi3Var = ((p87) s87Var).a;
                    a87 a87Var = v87Var2.i;
                    String str7 = v87Var2.c;
                    j77 state = a87Var.getState(str7);
                    v87Var2.h.workProgressDao().delete(str7);
                    if (state != null) {
                        if (state == j77.y) {
                            z77 z77Var = v87Var2.a;
                            String str8 = v87Var2.l;
                            if (oi3Var instanceof ni3) {
                                xk3.d().e(w87.a, "Worker result SUCCESS for ".concat(str8));
                                if (z77Var.c()) {
                                    v87Var2.c();
                                } else {
                                    a87Var.setState(j77.z, str7);
                                    e41 e41Var = ((ni3) oi3Var).a;
                                    e41Var.getClass();
                                    a87Var.setOutput(str7, e41Var);
                                    long currentTimeMillis = System.currentTimeMillis();
                                    ce1 ce1Var = v87Var2.j;
                                    for (String str9 : ce1Var.getDependentWorkIds(str7)) {
                                        if (a87Var.getState(str9) == j77.B && ce1Var.hasCompletedAllPrerequisites(str9)) {
                                            String str10 = w87.a;
                                            xk3.d().e(str10, "Setting status to enqueued for " + str9);
                                            a87Var.setState(j77.x, str9);
                                            a87Var.setLastEnqueueTime(str9, currentTimeMillis);
                                            v87Var2.n.add(str9);
                                        }
                                    }
                                }
                            } else {
                                if (oi3Var instanceof mi3) {
                                    xk3.d().e(w87.a, "Worker result RETRY for ".concat(str8));
                                    v87Var2.b(-256);
                                    r05Var.x = z;
                                    return;
                                }
                                xk3.d().e(w87.a, "Worker result FAILURE for ".concat(str8));
                                if (z77Var.c()) {
                                    v87Var2.c();
                                } else {
                                    v87Var2.f(oi3Var);
                                }
                            }
                        } else if (!state.a()) {
                            v87Var2.b(-512);
                            r05Var.x = z;
                            return;
                        }
                    }
                    z = false;
                    r05Var.x = z;
                    return;
                }
                if (s87Var instanceof o87) {
                    v87Var2.a(new li3());
                    r05Var.x = false;
                    return;
                } else {
                    if (s87Var instanceof q87) {
                        r05Var.x = v87Var2.d(((q87) s87Var).a);
                        return;
                    }
                    if (s87Var instanceof r87) {
                        if (((r87) s87Var).a) {
                            z2 = v87Var2.d(-256);
                        } else {
                            v87Var2.a(new li3());
                        }
                        r05Var.x = z2;
                        return;
                    }
                    ze0.l();
                    return;
                }
        }
    }

    public /* synthetic */ ze(Object obj, Object obj2, Object obj3, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }
}
