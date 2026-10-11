package d5;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.tasks.Task;
import f9.x;
import k3.d;
import s4.g;

/* loaded from: classes.dex */
public final class b extends l {

    /* renamed from: a, reason: collision with root package name */
    public static final i f3229a = new i("ClientTelemetry.API", new g(5), new h());

    /* renamed from: b, reason: collision with root package name */
    public static int f3230b = 1;

    public b(Context context) {
        super(context, f3229a, v.f2602b, k.f2487c);
    }

    public Task c(u uVar) {
        com.google.android.gms.common.api.internal.v vVar = new com.google.android.gms.common.api.internal.v();
        vVar.f2473e = new b5.c[]{zad.zaa};
        vVar.f2471c = false;
        vVar.f2472d = new d(uVar, 17);
        return doBestEffortWrite(vVar.a());
    }

    public synchronized int d() {
        int i10;
        i10 = f3230b;
        if (i10 == 1) {
            Context applicationContext = getApplicationContext();
            b5.d dVar = b5.d.f1517d;
            int c6 = dVar.c(applicationContext, 12451000);
            if (c6 == 0) {
                i10 = 4;
                f3230b = 4;
            } else if (dVar.a(applicationContext, null, c6) == null && l5.a.a(applicationContext) != 0) {
                i10 = 3;
                f3230b = 3;
            } else {
                i10 = 2;
                f3230b = 2;
            }
        }
        return i10;
    }

    public b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, t4.b.f10030b, googleSignInOptions, new k(new x(28), Looper.getMainLooper()));
    }
}
