package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y26 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public y26(Context context, Looper looper, f46 f46Var) {
        this.c = new y23((Object) context.getApplicationContext(), (byte) 22);
        this.d = f46Var.a(looper, null);
        this.e = f46Var.a(Looper.getMainLooper(), null);
    }

    public void a(final boolean z, final boolean z2) {
        k46 k46Var = (k46) this.d;
        if (z && z2) {
            k46Var.f(new Runnable() { // from class: fx6
                @Override // java.lang.Runnable
                public final void run() {
                    ((y23) y26.this.c).c0(z, z2);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        ((k46) this.e).g(new sp5(this, atomicBoolean, (byte) 16), 1000L);
        k46Var.f(new Runnable() { // from class: gx6
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(false);
                ((y23) y26.this.c).c0(z, z2);
            }
        });
    }

    public void b(boolean z) {
        if (this.b != z) {
            this.b = z;
            if (this.a) {
                a(true, z);
            }
        }
    }

    public y26(Context context, String str, fr0 fr0Var, boolean z, boolean z2) {
        context.getClass();
        fr0Var.getClass();
        this.c = context;
        this.d = str;
        this.e = fr0Var;
        this.a = z;
        this.b = z2;
    }
}
