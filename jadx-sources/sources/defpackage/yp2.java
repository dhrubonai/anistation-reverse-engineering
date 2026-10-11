package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public class yp2 implements v11 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A;
    public static final ou B;
    private volatile /* synthetic */ int received = 0;
    public final wp2 x;
    public nr2 y;
    public f91 z;

    static {
        al6 al6Var;
        im0 a = z05.a(Object.class);
        try {
            al6Var = z05.c(Object.class);
        } catch (Throwable unused) {
            al6Var = null;
        }
        B = new ou("CustomResponse", new vk6(a, false, al6Var));
        A = AtomicIntegerFieldUpdater.newUpdater(yp2.class, "received");
    }

    public yp2(wp2 wp2Var) {
        this.x = wp2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
    
        if (r8 != r5) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vk6 r7, defpackage.vz0 r8) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp2.a(vk6, vz0):java.lang.Object");
    }

    public boolean b() {
        return false;
    }

    public final nr2 c() {
        nr2 nr2Var = this.y;
        if (nr2Var != null) {
            return nr2Var;
        }
        a34.s0("request");
        throw null;
    }

    public final f91 d() {
        f91 f91Var = this.z;
        if (f91Var != null) {
            return f91Var;
        }
        a34.s0("response");
        throw null;
    }

    public final mv0 getAttributes() {
        return c().getAttributes();
    }

    @Override // defpackage.v11
    public final l11 getCoroutineContext() {
        return d().getCoroutineContext();
    }

    public final String toString() {
        return "HttpClientCall[" + c().getUrl() + ", " + d().c() + ']';
    }
}
