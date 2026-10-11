package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class yy4 implements Runnable {
    public final tf0 x;
    public volatile AtomicInteger y = new AtomicInteger(0);
    public final /* synthetic */ bz4 z;

    public yy4(bz4 bz4Var, tf0 tf0Var) {
        this.z = bz4Var;
        this.x = tf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jd4 jd4Var;
        String str;
        String concat = "OkHttp ".concat(this.z.y.a.f());
        bz4 bz4Var = this.z;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            bz4Var.A.h();
            boolean z = false;
            try {
                try {
                } catch (Throwable th) {
                    bz4Var.x.x.b(this);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.x.onResponse(bz4Var, bz4Var.g());
                jd4Var = bz4Var.x;
            } catch (IOException e2) {
                e = e2;
                z = true;
                if (z) {
                    lm4 lm4Var = lm4.a;
                    lm4 lm4Var2 = lm4.a;
                    StringBuilder sb = new StringBuilder("Callback failure for ");
                    if (bz4Var.J) {
                        str = "canceled ";
                    } else {
                        str = "";
                    }
                    sb.append(str + "call to " + bz4Var.y.a.f());
                    String sb2 = sb.toString();
                    lm4Var2.getClass();
                    lm4.i(sb2, 4, e);
                } else {
                    this.x.onFailure(bz4Var, e);
                }
                jd4Var = bz4Var.x;
                jd4Var.x.b(this);
            } catch (Throwable th3) {
                th = th3;
                z = true;
                bz4Var.c();
                if (!z) {
                    IOException iOException = new IOException("canceled due to " + th);
                    n03.i(iOException, th);
                    this.x.onFailure(bz4Var, iOException);
                }
                throw th;
            }
            jd4Var.x.b(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
