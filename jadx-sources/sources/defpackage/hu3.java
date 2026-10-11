package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class hu3 implements vu3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wu3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ hu3(wu3 wu3Var, int i, byte b) {
        this.a = b;
        this.b = wu3Var;
        this.c = i;
    }

    @Override // defpackage.vu3
    public final void a(dt3 dt3Var) {
        byte b = this.a;
        boolean z = true;
        int i = 1;
        z = true;
        int i2 = this.c;
        wu3 wu3Var = this.b;
        switch (b) {
            case 0:
                bu3 bu3Var = wu3Var.i;
                bu3Var.t();
                fq4 fq4Var = bu3Var.t;
                int i3 = of3.a;
                if (i2 != -1 && i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        ze0.k(qx1.h(i2, "Unrecognized ShuffleMode: "));
                        return;
                    }
                } else {
                    z = false;
                }
                fq4Var.r(z);
                return;
            default:
                bu3 bu3Var2 = wu3Var.i;
                bu3Var2.t();
                fq4 fq4Var2 = bu3Var2.t;
                int i4 = of3.a;
                if (i2 != -1 && i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2 && i2 != 3) {
                            kb0.O("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i2 + " was converted to `Player.REPEAT_MODE_OFF`");
                        } else {
                            i = 2;
                        }
                    }
                    fq4Var2.u0(i);
                    return;
                }
                i = 0;
                fq4Var2.u0(i);
                return;
        }
    }
}
