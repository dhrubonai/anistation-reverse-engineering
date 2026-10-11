package defpackage;

import java.io.Serializable;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class uw1 implements yk3, Serializable {
    public h16 x;
    public LinkedBlockingQueue y;

    @Override // defpackage.yk3
    public final boolean a() {
        return true;
    }

    @Override // defpackage.yk3
    public final boolean b() {
        return true;
    }

    @Override // defpackage.yk3
    public final boolean c() {
        return true;
    }

    @Override // defpackage.yk3
    public final boolean d() {
        return true;
    }

    @Override // defpackage.yk3
    public final boolean e() {
        return true;
    }

    @Override // defpackage.yk3
    public final void f(String str, Throwable th) {
        j(4);
    }

    @Override // defpackage.yk3
    public final void g(String str) {
        j(2);
    }

    @Override // defpackage.yk3
    public final void h(String str) {
        j(5);
    }

    @Override // defpackage.yk3
    public final void info(String str) {
        j(3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, j16] */
    public final void j(int i) {
        ?? obj = new Object();
        System.currentTimeMillis();
        obj.a = i;
        obj.b = this.x;
        Thread.currentThread().getName();
        this.y.add(obj);
    }

    @Override // defpackage.yk3
    public final void trace(String str, Throwable th) {
        j(5);
    }
}
