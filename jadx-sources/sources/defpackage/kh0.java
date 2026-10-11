package defpackage;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.cast.framework.OptionsProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kh0 implements q30 {
    public static kh0 D;
    public Object A;
    public Object B;
    public Object C;
    public boolean x;
    public final Object y;
    public final Object z;

    public kh0(Context context) {
        String packageName = context.getPackageName();
        String processName = Application.getProcessName();
        if (TextUtils.equals(processName, packageName)) {
            this.A = context.getApplicationContext();
            this.y = new ArrayList();
            this.z = new HashSet();
        } else {
            String str = eq6.a;
            Locale locale = Locale.US;
            ze0.m(qx1.n("The method must be called on the main process (", packageName, "), but was called on the process (", processName, ")."));
            throw null;
        }
    }

    public void a(hh0 hh0Var) {
        v78 e;
        tl7.U();
        if (((xh0) this.B) == null && ((Throwable) this.C) == null && !this.x) {
            Context context = hh0Var.x;
            Executor F = zz.F();
            zk3 zk3Var = xh0.k;
            a34.s();
            if (xh0.m == null) {
                final Context applicationContext = context.getApplicationContext();
                final OptionsProvider d = xh0.d(xh0.c(applicationContext));
                final di0 castOptions = d.getCastOptions(applicationContext);
                final wb7 wb7Var = new wb7(applicationContext);
                final dn7 dn7Var = new dn7(applicationContext, rs3.d(applicationContext), castOptions, wb7Var);
                e = hz5.d(F, new Callable() { // from class: lv7
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        Context context2 = applicationContext;
                        di0 di0Var = castOptions;
                        OptionsProvider optionsProvider = d;
                        dn7 dn7Var2 = dn7Var;
                        wb7 wb7Var2 = wb7Var;
                        synchronized (xh0.l) {
                            try {
                                if (xh0.m == null) {
                                    xh0.m = new xh0(context2, di0Var, optionsProvider.getAdditionalSessionProviders(context2), dn7Var2, wb7Var2);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return xh0.m;
                    }
                });
            } else {
                e = hz5.e(xh0.m);
            }
            e.e(new h5((Object) this, (byte) 4));
            this.x = true;
            return;
        }
        kb0.O("Cast", "Tried to initialize an already initialized Cast.");
    }

    public void b(hw0 hw0Var) {
        wa7 wa7Var = (wa7) ((uh2) this.C).G.get((kp) this.z);
        if (wa7Var != null) {
            wa7Var.m(hw0Var);
        }
    }

    @Override // defpackage.q30
    public void j(hw0 hw0Var) {
        ((uh2) this.C).J.post(new yc2((byte) 10, this, hw0Var, false));
    }

    public kh0(uh2 uh2Var, nh2 nh2Var, kp kpVar) {
        Objects.requireNonNull(uh2Var);
        this.C = uh2Var;
        this.A = null;
        this.B = null;
        this.x = false;
        this.y = nh2Var;
        this.z = kpVar;
    }
}
