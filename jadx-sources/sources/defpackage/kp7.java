package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class kp7 implements Runnable {
    public final /* synthetic */ sp7 A;
    public final long x;
    public final long y;
    public final boolean z;

    public kp7(sp7 sp7Var, boolean z) {
        Objects.requireNonNull(sp7Var);
        this.A = sp7Var;
        this.x = System.currentTimeMillis();
        this.y = SystemClock.elapsedRealtime();
        this.z = z;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        sp7 sp7Var = this.A;
        if (sp7Var.d) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            sp7Var.b(e, false, this.z);
            b();
        }
    }

    public void b() {
    }
}
