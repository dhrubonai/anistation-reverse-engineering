package msr.pistream.app.viewmodel;

import a8.h;
import android.util.Log;
import androidx.lifecycle.c0;
import androidx.lifecycle.w0;
import dagger.hilt.android.lifecycle.HiltViewModel;
import e8.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;
import msr.pistream.app.viewmodel.PlayerViewModel;
import r6.h0;
import y7.b;
import y7.e;
import y7.u;

@HiltViewModel
/* loaded from: classes.dex */
public class PlayerViewModel extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final u f7825a;

    /* renamed from: b, reason: collision with root package name */
    public final b f7826b;

    /* renamed from: c, reason: collision with root package name */
    public final e f7827c;

    /* renamed from: d, reason: collision with root package name */
    public final a f7828d;

    /* renamed from: k, reason: collision with root package name */
    public a8.e f7835k;

    /* renamed from: l, reason: collision with root package name */
    public String f7836l;

    /* renamed from: m, reason: collision with root package name */
    public String f7837m;

    /* renamed from: s, reason: collision with root package name */
    public Future f7842s;

    /* renamed from: t, reason: collision with root package name */
    public Future f7843t;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f7829e = Executors.newFixedThreadPool(3);

    /* renamed from: f, reason: collision with root package name */
    public final c0 f7830f = new c0();

    /* renamed from: g, reason: collision with root package name */
    public final c0 f7831g = new c0(Boolean.FALSE);

    /* renamed from: h, reason: collision with root package name */
    public final c0 f7832h = new c0();

    /* renamed from: i, reason: collision with root package name */
    public final c0 f7833i = new c0();

    /* renamed from: j, reason: collision with root package name */
    public final c0 f7834j = new c0();

    /* renamed from: n, reason: collision with root package name */
    public final c0 f7838n = new c0(b8.a.d(Collections.emptyList()));
    public final ConcurrentHashMap o = new ConcurrentHashMap();

    /* renamed from: p, reason: collision with root package name */
    public final AtomicLong f7839p = new AtomicLong(0);

    /* renamed from: q, reason: collision with root package name */
    public final ConcurrentHashMap f7840q = new ConcurrentHashMap();

    /* renamed from: r, reason: collision with root package name */
    public final Object f7841r = new Object();

    public PlayerViewModel(u uVar, b bVar, e eVar, a aVar) {
        this.f7825a = uVar;
        this.f7826b = bVar;
        this.f7827c = eVar;
        this.f7828d = aVar;
    }

    public final void b() {
        synchronized (this.f7841r) {
            Future future = this.f7842s;
            if (future != null && !future.isDone()) {
                future.cancel(true);
            }
            Future future2 = this.f7843t;
            if (future2 != null && !future2.isDone()) {
                future2.cancel(true);
            }
            this.f7842s = null;
            this.f7843t = null;
        }
    }

    public final boolean c(long j4) {
        if (j4 != this.f7839p.get()) {
            return true;
        }
        return false;
    }

    public final void d(final a8.e eVar) {
        String str;
        if (eVar == null) {
            return;
        }
        b();
        final long incrementAndGet = this.f7839p.incrementAndGet();
        this.f7835k = eVar;
        this.f7832h.h(null);
        String O0 = h0.O0(eVar.f188f);
        if (O0 == null) {
            O0 = h0.O0(eVar.f184b);
        }
        String str2 = O0;
        if (str2 != null && !str2.equals(this.f7837m) && !str2.equals(this.f7836l)) {
            this.f7836l = null;
        }
        if (str2 != null) {
            this.f7837m = str2;
            if (!str2.isEmpty()) {
                List list = (List) this.o.get(str2);
                if (list != null) {
                    if (!c(incrementAndGet)) {
                        this.f7838n.h(b8.a.d(new ArrayList(list)));
                    }
                } else {
                    this.f7829e.execute(new b2.c0(this, str2, incrementAndGet, 1));
                }
            }
        }
        final String str3 = this.f7836l;
        StringBuilder sb = new StringBuilder();
        String str4 = eVar.f184b;
        if (str4 == null) {
            str4 = String.valueOf(eVar.f186d);
        }
        sb.append(str4);
        sb.append("|dub:");
        if (str3 != null) {
            str = str3;
        } else {
            str = "-";
        }
        sb.append(str);
        final String sb2 = sb.toString();
        if (this.f7840q.containsKey(sb2)) {
            List list2 = (List) this.f7840q.get(sb2);
            if (c(incrementAndGet)) {
                return;
            }
            this.f7830f.h(b8.a.d(list2));
            e(list2);
            this.f7831g.h(Boolean.FALSE);
            if (!c(incrementAndGet)) {
                this.f7833i.h(b8.a.d(Collections.emptyList()));
                return;
            }
            return;
        }
        this.f7830f.h(b8.a.c());
        this.f7831g.h(Boolean.TRUE);
        Future<?> submit = this.f7829e.submit(new Runnable() { // from class: x8.f
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList f10;
                long j4 = incrementAndGet;
                String str5 = sb2;
                PlayerViewModel playerViewModel = PlayerViewModel.this;
                c0 c0Var = playerViewModel.f7830f;
                c0 c0Var2 = playerViewModel.f7831g;
                try {
                    if (!playerViewModel.c(j4)) {
                        String str6 = str3;
                        a8.e eVar2 = eVar;
                        e8.a aVar = playerViewModel.f7828d;
                        if (str6 != null) {
                            f10 = aVar.f3594a.f(eVar2, str6);
                        } else {
                            f10 = aVar.f3594a.f(eVar2, null);
                        }
                        if (!playerViewModel.c(j4)) {
                            if (f10.isEmpty()) {
                                c0Var2.h(Boolean.FALSE);
                                c0Var.h(b8.a.a("Failed to load sources"));
                                return;
                            }
                            ConcurrentHashMap concurrentHashMap = playerViewModel.f7840q;
                            concurrentHashMap.put(str5, new ArrayList(f10));
                            c0Var.h(b8.a.d(new ArrayList(f10)));
                            if (playerViewModel.f7832h.d() == null) {
                                playerViewModel.e(f10);
                            }
                            if (!playerViewModel.c(j4)) {
                                aVar.getClass();
                                if (c8.b.c(f10)) {
                                    concurrentHashMap.put(str5, new ArrayList(f10));
                                    c0Var2.h(Boolean.FALSE);
                                    return;
                                }
                                List c6 = aVar.c(eVar2, str6);
                                if (!playerViewModel.c(j4)) {
                                    ArrayList a10 = c8.b.a(f10, c6);
                                    if (!a10.isEmpty() && a10.size() != f10.size()) {
                                        concurrentHashMap.put(str5, new ArrayList(a10));
                                        c0Var.h(b8.a.d(new ArrayList(a10)));
                                    }
                                    c0Var2.h(Boolean.FALSE);
                                }
                            }
                        }
                    }
                } catch (CancellationException unused) {
                } catch (Exception e10) {
                    Log.e("PlayerVM", "load sources", e10);
                    if (!playerViewModel.c(j4)) {
                        c0Var2.h(Boolean.FALSE);
                        c0Var.h(b8.a.a("Failed to load sources"));
                    }
                }
            }
        });
        synchronized (this.f7841r) {
            this.f7842s = submit;
        }
        if (!c(incrementAndGet)) {
            this.f7833i.h(b8.a.d(Collections.emptyList()));
        }
    }

    public final void e(List list) {
        c0 c0Var = this.f7832h;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                if (!this.f7826b.f11636a.b(hVar)) {
                    c0Var.h(hVar);
                    return;
                }
            }
            c0Var.h((h) list.get(0));
            return;
        }
        c0Var.h(null);
    }

    @Override // androidx.lifecycle.w0
    public final void onCleared() {
        this.f7829e.shutdown();
    }
}
