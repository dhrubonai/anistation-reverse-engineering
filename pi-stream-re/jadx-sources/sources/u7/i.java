package u7;

import f9.x;
import p7.a0;

/* loaded from: classes.dex */
public final class i extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f10320c;

    public i(Runnable runnable, long j4, x xVar) {
        super(j4, xVar);
        this.f10320c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f10320c.run();
        } finally {
            this.f10319b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f10320c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(a0.z(runnable));
        sb.append(", ");
        sb.append(this.f10318a);
        sb.append(", ");
        sb.append(this.f10319b);
        sb.append(']');
        return sb.toString();
    }
}
