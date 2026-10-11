package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class h16 implements yk3 {
    public Method A;
    public uw1 B;
    public final LinkedBlockingQueue C;
    public final boolean D;
    public final String x;
    public volatile yk3 y;
    public Boolean z;

    public h16(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.x = str;
        this.C = linkedBlockingQueue;
        this.D = z;
    }

    @Override // defpackage.yk3
    public final boolean a() {
        return j().a();
    }

    @Override // defpackage.yk3
    public final boolean b() {
        return j().b();
    }

    @Override // defpackage.yk3
    public final boolean c() {
        return j().c();
    }

    @Override // defpackage.yk3
    public final boolean d() {
        return j().d();
    }

    @Override // defpackage.yk3
    public final boolean e() {
        return j().e();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && h16.class == obj.getClass() && this.x.equals(((h16) obj).x)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.yk3
    public final void f(String str, Throwable th) {
        j().f(str, th);
    }

    @Override // defpackage.yk3
    public final void g(String str) {
        j().g(str);
    }

    @Override // defpackage.yk3
    public final void h(String str) {
        j().h(str);
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    @Override // defpackage.yk3
    public final boolean i(int i) {
        return j().i(i);
    }

    @Override // defpackage.yk3
    public final void info(String str) {
        j().info(str);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [yk3, java.lang.Object, uw1] */
    public final yk3 j() {
        if (this.y != null) {
            return this.y;
        }
        if (this.D) {
            return c64.x;
        }
        uw1 uw1Var = this.B;
        if (uw1Var == null) {
            LinkedBlockingQueue linkedBlockingQueue = this.C;
            ?? obj = new Object();
            obj.x = this;
            obj.y = linkedBlockingQueue;
            this.B = obj;
            return obj;
        }
        return uw1Var;
    }

    public final boolean k() {
        Boolean bool;
        Boolean bool2 = this.z;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        try {
            this.A = this.y.getClass().getMethod("log", j16.class);
            bool = Boolean.TRUE;
            this.z = bool;
        } catch (NoSuchMethodException unused) {
            bool = Boolean.FALSE;
            this.z = bool;
        }
        return bool.booleanValue();
    }

    @Override // defpackage.yk3
    public final void trace(String str, Throwable th) {
        j().trace(str, th);
    }
}
