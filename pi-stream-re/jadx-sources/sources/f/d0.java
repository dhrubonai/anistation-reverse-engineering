package f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import androidx.fragment.app.m1;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class d0 implements b4.y {

    /* renamed from: a, reason: collision with root package name */
    public Object f3644a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3645b;

    public /* synthetic */ d0(Object obj, Object obj2) {
        this.f3644a = obj;
        this.f3645b = obj2;
    }

    public final void a() {
        Object obj = this.f3644a;
        if (((BroadcastReceiver) obj) != null) {
            try {
                ((g0) this.f3645b).B.unregisterReceiver((BroadcastReceiver) obj);
            } catch (IllegalArgumentException unused) {
            }
            this.f3644a = null;
        }
    }

    public final void b() {
        m1 m1Var = (m1) this.f3644a;
        c0.d dVar = (c0.d) this.f3645b;
        HashSet hashSet = m1Var.f936e;
        if (hashSet.remove(dVar) && hashSet.isEmpty()) {
            m1Var.b();
        }
    }

    public abstract IntentFilter c();

    public abstract int d();

    public final boolean e() {
        int d10 = a3.g.d(((m1) this.f3644a).f934c.V);
        int i10 = ((m1) this.f3644a).f932a;
        if (d10 != i10 && (d10 == 2 || i10 == 2)) {
            return false;
        }
        return true;
    }

    public abstract void f();

    public final void g() {
        a();
        IntentFilter c6 = c();
        if (c6 != null && c6.countActions() != 0) {
            if (((BroadcastReceiver) this.f3644a) == null) {
                this.f3644a = new c0(this, 0);
            }
            ((g0) this.f3645b).B.registerReceiver((BroadcastReceiver) this.f3644a, c6);
        }
    }

    @Override // b4.y
    public final b4.x j(b4.c0 c0Var) {
        Context context = (Context) this.f3644a;
        Class cls = (Class) this.f3645b;
        return new c4.d(context, c0Var.b(File.class, cls), c0Var.b(Uri.class, cls), cls);
    }

    public d0(g0 g0Var) {
        this.f3645b = g0Var;
    }
}
