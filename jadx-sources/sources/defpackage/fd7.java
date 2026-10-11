package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fd7 extends kd7 {
    public static final fd7 b = new fd7(ld7.a);
    public final AtomicReference a;

    public fd7(kd7 kd7Var) {
        this.a = new AtomicReference(kd7Var);
    }

    @Override // defpackage.kd7
    public final void a(String str, Level level, boolean z) {
        ((kd7) this.a.get()).a(str, level, z);
    }

    @Override // defpackage.kd7
    public final wd7 b() {
        return ((kd7) this.a.get()).b();
    }

    @Override // defpackage.kd7
    public final rv5 c() {
        return ((kd7) this.a.get()).c();
    }
}
