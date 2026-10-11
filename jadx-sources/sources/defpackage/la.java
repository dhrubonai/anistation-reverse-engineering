package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class la implements Runnable {
    public final /* synthetic */ byte x;
    public final Object y;

    public la(ta7 ta7Var, vb7 vb7Var) {
        this.x = (byte) 13;
        Objects.requireNonNull(ta7Var);
        this.y = vb7Var;
    }

    private final void a() {
        os7 os7Var = (os7) this.y;
        synchronized (os7Var.z) {
            ((yd4) os7Var.A).f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x02da, code lost:
    
        if (r14.w0() >= 242600) goto L71;
     */
    /* JADX WARN: Type inference failed for: r0v83, types: [j18, df7] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.la.run():void");
    }

    public /* synthetic */ la(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    public la(ea7 ea7Var) {
        this.x = (byte) 9;
        this.y = ea7Var.f;
    }

    public la(ib7 ib7Var) {
        this.x = (byte) 12;
        Objects.requireNonNull(ib7Var);
        this.y = ib7Var;
    }

    public la(rs7 rs7Var, boolean z) {
        this.x = (byte) 19;
        this.y = rs7Var;
    }

    public la(z18 z18Var, c41 c41Var) {
        this.x = (byte) 24;
        this.y = z18Var;
    }
}
