package defpackage;

import android.os.Looper;
import android.os.SystemClock;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r08 extends zq7 {
    public boolean A;
    public final ub7 B;
    public final g90 C;
    public final fk7 D;
    public h15 z;

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, g90] */
    /* JADX WARN: Type inference failed for: r4v4, types: [fk7, java.lang.Object] */
    public r08(gu7 gu7Var) {
        super(gu7Var);
        this.A = true;
        this.B = new ub7(this, (byte) 7);
        ?? obj = new Object();
        obj.A = this;
        gu7 gu7Var2 = (gu7) this.x;
        obj.z = new l08(obj, gu7Var2, (byte) 0);
        gu7Var2.H.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        obj.x = elapsedRealtime;
        obj.y = elapsedRealtime;
        this.C = obj;
        ?? obj2 = new Object();
        obj2.y = this;
        this.D = obj2;
    }

    @Override // defpackage.zq7
    public final boolean O() {
        return false;
    }

    public final void P() {
        L();
        if (this.z == null) {
            this.z = new h15(Looper.getMainLooper(), (byte) 3);
        }
    }
}
