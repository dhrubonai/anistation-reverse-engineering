package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.ConnectivityManager;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qj implements bi1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qj(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.bi1
    public final void dispose() {
        Float f;
        boolean isTerminated;
        w57 w57Var;
        ko4 ko4Var;
        byte b = this.a;
        int i = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Activity activity = (Activity) obj2;
                if (activity != null && (f = (Float) obj) != null) {
                    sj.c(activity, f.floatValue());
                    return;
                }
                return;
            case 1:
                ((og3) obj2).getLifecycle().b((pq) obj);
                return;
            case 2:
                oz ozVar = (oz) obj2;
                bt0 bt0Var = (bt0) obj;
                if (ozVar.a != null) {
                    bt0Var.b.f();
                    return;
                }
                if (ozVar.b != null) {
                    nz nzVar = bt0Var.a;
                    ArrayList arrayList = nzVar.a;
                    CopyOnWriteArrayList copyOnWriteArrayList = nzVar.c;
                    Iterator it = copyOnWriteArrayList.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        AutoCloseable autoCloseable = (AutoCloseable) it.next();
                        if (autoCloseable instanceof AutoCloseable) {
                            autoCloseable.close();
                        } else if (autoCloseable instanceof ExecutorService) {
                            ExecutorService executorService = (ExecutorService) autoCloseable;
                            if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                                executorService.shutdown();
                                boolean z = false;
                                while (!isTerminated) {
                                    try {
                                        isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                    } catch (InterruptedException unused) {
                                        if (!z) {
                                            executorService.shutdownNow();
                                            z = true;
                                        }
                                    }
                                }
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                            }
                        } else if (autoCloseable instanceof TypedArray) {
                            ((TypedArray) autoCloseable).recycle();
                        } else {
                            p65.b();
                            return;
                        }
                    }
                    copyOnWriteArrayList.clear();
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj3 = arrayList.get(i);
                        i++;
                        ((qd4) obj3).f();
                    }
                    arrayList.clear();
                    return;
                }
                ze0.m("Unreachable");
                return;
            case 3:
                ((ko4) obj2).w0((th0) obj);
                return;
            case 4:
                ((rs3) obj2).e((wh0) obj);
                return;
            case 5:
                ((ry2) obj2).a.k((py2) obj);
                return;
            case 6:
                ((df3) obj2).z.k(obj);
                return;
            case 7:
                ((ht0) obj2).f();
                ((w74) obj).e = null;
                return;
            case 8:
                ((ConnectivityManager) obj2).unregisterNetworkCallback((j94) obj);
                return;
            case 9:
                w44 w44Var = (w44) obj;
                Activity u = iv.u((Context) obj2);
                if (u != null) {
                    Window window = u.getWindow();
                    fq3 fq3Var = new fq3(window.getDecorView());
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 35) {
                        w57Var = new w57(window, fq3Var, (byte) 1);
                    } else if (i2 >= 30) {
                        w57Var = new w57(window, fq3Var, (byte) 1);
                    } else {
                        w57Var = new w57(window, fq3Var, (byte) 0);
                    }
                    w57Var.h();
                    w57Var.f(!((Boolean) w44Var.getValue()).booleanValue());
                    w57Var.e(!((Boolean) w44Var.getValue()).booleanValue());
                    return;
                }
                return;
            case 10:
                Activity activity2 = (Activity) obj2;
                if (activity2 != null) {
                    if (iv.E((Context) obj)) {
                        tk4 tk4Var = t80.f;
                        if (tk4Var != null && tk4Var.b(activity2)) {
                            t80.f = null;
                            tk4Var.a();
                        }
                        activity2.setRequestedOrientation(-1);
                        return;
                    }
                    if (activity2.getRequestedOrientation() != -1) {
                        t80.p(activity2);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ((bp4) obj2).disable();
                ((w44) obj).setValue(Boolean.FALSE);
                return;
            case 12:
                aq4 aq4Var = (aq4) obj2;
                if (aq4Var != null && (ko4Var = (ko4) obj) != null) {
                    ko4Var.w0(aq4Var);
                    return;
                }
                return;
            case 13:
                ((hd6) obj2).c.remove((ub2) obj);
                return;
            case 14:
                ((xi6) obj2).k.remove((xi6) obj);
                return;
            case 15:
                xi6 xi6Var = (xi6) obj2;
                pi6 pi6Var = (pi6) ((qi6) obj).b.getValue();
                if (pi6Var != null) {
                    xi6Var.j.remove(pi6Var.x);
                    return;
                }
                return;
            case 16:
                ((xi6) obj2).j.remove((ui6) obj);
                return;
            default:
                z57 z57Var = (z57) obj2;
                View view = (View) obj;
                int i3 = z57Var.u - 1;
                z57Var.u = i3;
                if (i3 == 0) {
                    int i4 = pv6.a;
                    kv6.b(view, null);
                    c57.a(view, null);
                    view.removeOnAttachStateChangeListener(z57Var.v);
                    return;
                }
                return;
        }
    }
}
