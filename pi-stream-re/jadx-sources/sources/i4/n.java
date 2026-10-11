package i4;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.b0;
import androidx.fragment.app.s0;
import f9.x;
import java.util.Map;

/* loaded from: classes.dex */
public final class n implements Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    public static final x f5358e = new x(21);

    /* renamed from: a, reason: collision with root package name */
    public volatile com.bumptech.glide.o f5359a;

    /* renamed from: b, reason: collision with root package name */
    public final x f5360b;

    /* renamed from: c, reason: collision with root package name */
    public final g f5361c;

    /* renamed from: d, reason: collision with root package name */
    public final l f5362d;

    public n(x xVar) {
        g xVar2;
        xVar = xVar == null ? f5358e : xVar;
        this.f5360b = xVar;
        this.f5362d = new l(xVar);
        if (e4.u.f3519f && e4.u.f3518e) {
            xVar2 = new f();
        } else {
            xVar2 = new x(19);
        }
        this.f5361c = xVar2;
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final com.bumptech.glide.o b(Context context) {
        boolean z9;
        boolean z10;
        if (context != null) {
            char[] cArr = p4.m.f8575a;
            boolean z11 = true;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && !(context instanceof Application)) {
                if (context instanceof b0) {
                    b0 b0Var = (b0) context;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        return b(b0Var.getApplicationContext());
                    }
                    if (!b0Var.isDestroyed()) {
                        this.f5361c.d(b0Var);
                        Activity a10 = a(b0Var);
                        if (a10 != null && a10.isFinishing()) {
                            z11 = false;
                        }
                        com.bumptech.glide.b a11 = com.bumptech.glide.b.a(b0Var.getApplicationContext());
                        androidx.lifecycle.p lifecycle = b0Var.getLifecycle();
                        s0 supportFragmentManager = b0Var.getSupportFragmentManager();
                        l lVar = this.f5362d;
                        lVar.getClass();
                        p4.m.a();
                        p4.m.a();
                        com.bumptech.glide.o oVar = (com.bumptech.glide.o) ((Map) lVar.f5356a).get(lifecycle);
                        if (oVar == null) {
                            i iVar = new i(lifecycle);
                            x xVar = (x) lVar.f5357b;
                            l lVar2 = new l(lVar, supportFragmentManager);
                            xVar.getClass();
                            com.bumptech.glide.o oVar2 = new com.bumptech.glide.o(a11, iVar, lVar2, b0Var);
                            ((Map) lVar.f5356a).put(lifecycle, oVar2);
                            iVar.c(new k(lVar, lifecycle));
                            if (z11) {
                                oVar2.j();
                            }
                            return oVar2;
                        }
                        return oVar;
                    }
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return b(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f5359a == null) {
                synchronized (this) {
                    if (this.f5359a == null) {
                        com.bumptech.glide.b a12 = com.bumptech.glide.b.a(context.getApplicationContext());
                        x xVar2 = this.f5360b;
                        x xVar3 = new x(17);
                        x xVar4 = new x(20);
                        Context applicationContext = context.getApplicationContext();
                        xVar2.getClass();
                        this.f5359a = new com.bumptech.glide.o(a12, xVar3, xVar4, applicationContext);
                    }
                }
            }
            return this.f5359a;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
