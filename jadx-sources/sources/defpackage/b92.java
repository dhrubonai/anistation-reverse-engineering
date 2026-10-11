package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b92 implements js1 {
    public final Context a;
    public final z82 b;
    public final Object c = new Object();
    public Handler d;
    public ThreadPoolExecutor e;
    public ThreadPoolExecutor f;
    public tl7 g;

    public b92(Context context, z82 z82Var) {
        bb4.r(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = z82Var;
    }

    @Override // defpackage.js1
    public final void a(tl7 tl7Var) {
        synchronized (this.c) {
            this.g = tl7Var;
        }
        synchronized (this.c) {
            try {
                if (this.g == null) {
                    return;
                }
                ThreadPoolExecutor threadPoolExecutor = this.e;
                if (threadPoolExecutor == null) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new fv0("emojiCompat", (byte) 0));
                    threadPoolExecutor2.allowCoreThreadTimeOut(true);
                    this.f = threadPoolExecutor2;
                    this.e = threadPoolExecutor2;
                    threadPoolExecutor = threadPoolExecutor2;
                }
                threadPoolExecutor.execute(new a92(this, (byte) 0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.c) {
            try {
                this.g = null;
                Handler handler = this.d;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.d = null;
                ThreadPoolExecutor threadPoolExecutor = this.f;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.e = null;
                this.f = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final v92 c() {
        try {
            Context context = this.a;
            Object[] objArr = {this.b};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            u92 a = y82.a(context, Collections.unmodifiableList(arrayList));
            boolean z = a.c;
            if (!z) {
                v92[] v92VarArr = (v92[]) a.b.get(0);
                if (v92VarArr != null && v92VarArr.length != 0) {
                    return v92VarArr[0];
                }
                v71.i("fetchFonts failed (empty result)");
                return null;
            }
            v71.i(qx1.i(z ? 1 : 0, "fetchFonts failed (", ")"));
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            ov3.k("provider not found", e);
            return null;
        }
    }
}
