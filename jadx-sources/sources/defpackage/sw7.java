package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sw7 implements Runnable {
    public final /* synthetic */ long A;
    public final /* synthetic */ Bundle B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ qx7 F;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ long z;

    public sw7(qx7 qx7Var, String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.x = str;
        this.y = str2;
        this.z = j;
        this.A = j2;
        this.B = bundle;
        this.C = z;
        this.D = z2;
        this.E = z3;
        this.F = qx7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.F.U(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E);
    }
}
