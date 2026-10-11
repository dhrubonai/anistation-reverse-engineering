package defpackage;

import java.lang.Thread;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ut7 implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ au7 b;

    public ut7(au7 au7Var, String str) {
        this.b = au7Var;
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        es7 es7Var = ((gu7) this.b.x).C;
        gu7.l(es7Var);
        es7Var.C.b(th, this.a);
    }
}
