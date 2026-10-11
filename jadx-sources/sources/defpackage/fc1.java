package defpackage;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Pair;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fc1 implements vs6 {
    public boolean a;
    public oe2 b;
    public ExecutorService c;
    public xe2 d;
    public byte e;
    public boolean f;
    public boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public fc1(boolean z, oe2 oe2Var, ExecutorService executorService, xe2 xe2Var, int i, boolean z2, boolean z3) {
        this.a = z;
        this.b = oe2Var;
        this.c = executorService;
        this.d = xe2Var;
        this.e = i;
        this.f = z2;
        this.g = z3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fc1, java.lang.Object] */
    public fc1 a() {
        ?? obj = new Object();
        obj.c = this.c;
        obj.b = this.b;
        obj.d = this.d;
        obj.e = this.e;
        obj.a = !this.a;
        obj.f = this.f;
        obj.g = this.g;
        return obj;
    }

    public hc1 b(final Context context, final hp0 hp0Var, final boolean z, final Executor executor, final ws6 ws6Var) {
        ExecutorService executorService;
        boolean z2;
        final boolean z3;
        ExecutorService executorService2 = this.c;
        if (executorService2 == null) {
            String str = eq6.a;
            executorService = Executors.newSingleThreadExecutor(new fv0("Effect:DefaultVideoFrameProcessor:GlThread", (byte) 2));
        } else {
            executorService = executorService2;
        }
        if (executorService2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        final ts6 ts6Var = new ts6(executorService, z2, new ac1(ws6Var, (byte) 1));
        oe2 oe2Var = this.b;
        if (oe2Var != null && executorService2 != null) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (oe2Var == null) {
            oe2Var = new rt3((byte) 17);
        }
        final oe2 oe2Var2 = oe2Var;
        try {
            return (hc1) executorService.submit(new Callable() { // from class: ec1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int[] iArr;
                    Pair create;
                    oe2 oe2Var3 = oe2Var2;
                    fc1 fc1Var = fc1.this;
                    xe2 xe2Var = fc1Var.d;
                    byte b = fc1Var.e;
                    boolean z4 = fc1Var.a;
                    boolean z5 = fc1Var.f;
                    boolean z6 = fc1Var.g;
                    int i = hc1.y;
                    EGLDisplay Y = a34.Y();
                    hp0 hp0Var2 = hp0Var;
                    boolean h = hp0.h(hp0Var2);
                    if (h) {
                        iArr = a34.i;
                    } else {
                        iArr = a34.h;
                    }
                    try {
                        EGLContext l = oe2Var3.l(Y, 3, iArr);
                        create = Pair.create(l, oe2Var3.K(l, Y));
                    } catch (ze2 unused) {
                        EGLContext l2 = oe2Var3.l(Y, 2, iArr);
                        create = Pair.create(l2, oe2Var3.K(l2, Y));
                    }
                    Pair pair = create;
                    gp0 a = hp0Var2.a();
                    a.c = 1;
                    a.e = null;
                    hp0 a2 = a.a();
                    if (!h) {
                        a2 = hp0Var2;
                    }
                    ws6 ws6Var2 = ws6Var;
                    ac1 ac1Var = new ac1(ws6Var2, (byte) 0);
                    Context context2 = context;
                    ts6 ts6Var2 = ts6Var;
                    Executor executor2 = executor;
                    wz2 wz2Var = new wz2(context2, a2, oe2Var3, ts6Var2, executor2, ac1Var, z4, z5, z6);
                    EGLContext eGLContext = (EGLContext) pair.first;
                    EGLSurface eGLSurface = (EGLSurface) pair.second;
                    boolean z7 = z;
                    return new hc1(context2, oe2Var3, z3, Y, wz2Var, ts6Var2, ws6Var2, executor2, new h32(context2, Y, eGLContext, eGLSurface, hp0Var2, ts6Var2, executor2, ws6Var2, xe2Var, b, z7), z7, hp0Var2, null);
                }
            }).get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new ns6(e);
        } catch (ExecutionException e2) {
            throw new ns6(e2);
        }
    }
}
