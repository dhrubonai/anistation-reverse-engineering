package a1;

import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.o;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p.j;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public int f17a;

    /* renamed from: b, reason: collision with root package name */
    public c f18b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f23g;

    /* renamed from: h, reason: collision with root package name */
    public volatile a f24h;

    /* renamed from: i, reason: collision with root package name */
    public volatile a f25i;

    public b(SignInHubActivity signInHubActivity) {
        ThreadPoolExecutor threadPoolExecutor = a.f8y;
        this.f19c = false;
        this.f20d = false;
        this.f21e = true;
        this.f22f = false;
        signInHubActivity.getApplicationContext();
        this.f23g = threadPoolExecutor;
    }

    public final void a() {
        if (this.f24h != null) {
            if (!this.f19c) {
                this.f22f = true;
            }
            if (this.f25i != null) {
                this.f24h.getClass();
                this.f24h = null;
                return;
            }
            this.f24h.getClass();
            a aVar = this.f24h;
            aVar.f13d.set(true);
            if (aVar.f11b.cancel(false)) {
                this.f25i = this.f24h;
            }
            this.f24h = null;
        }
    }

    public final void b() {
        if (this.f25i == null && this.f24h != null) {
            this.f24h.getClass();
            a aVar = this.f24h;
            Executor executor = this.f23g;
            if (aVar.f12c != 1) {
                int b10 = j.b(aVar.f12c);
                if (b10 != 1) {
                    if (b10 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f12c = 2;
            aVar.f10a.f27a = null;
            executor.execute(aVar.f11b);
        }
    }

    public final void c() {
        a5.e eVar = (a5.e) this;
        Iterator it = eVar.f102k.iterator();
        if (!it.hasNext()) {
            try {
                eVar.f101j.tryAcquire(0, 5L, TimeUnit.SECONDS);
                return;
            } catch (InterruptedException e10) {
                Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
                Thread.currentThread().interrupt();
                return;
            }
        }
        ((o) it.next()).getClass();
        throw new UnsupportedOperationException();
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        w7.b.e(this, sb);
        sb.append(" id=");
        sb.append(this.f17a);
        sb.append("}");
        return sb.toString();
    }
}
