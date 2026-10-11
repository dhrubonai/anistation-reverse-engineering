package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ru3 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ fq4 y;
    public final /* synthetic */ int z;

    public /* synthetic */ ru3(fq4 fq4Var, int i, byte b) {
        this.x = b;
        this.y = fq4Var;
        this.z = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        int i = this.z;
        fq4 fq4Var = this.y;
        switch (b) {
            case 0:
                if (fq4Var.t0(25) || fq4Var.t0(33)) {
                    if (fq4Var.t0(33)) {
                        fq4Var.F(i, 1);
                        return;
                    } else {
                        fq4Var.R0(i);
                        return;
                    }
                }
                return;
            default:
                if (fq4Var.t0(26) || fq4Var.t0(34)) {
                    if (i != -100) {
                        if (i != -1) {
                            if (i != 1) {
                                if (i != 100) {
                                    if (i != 101) {
                                        h11.r(i, "onAdjustVolume: Ignoring unknown direction: ", "VolumeProviderCompat");
                                        return;
                                    } else if (fq4Var.t0(34)) {
                                        fq4Var.D(1, !fq4Var.h1());
                                        return;
                                    } else {
                                        fq4Var.v0(!fq4Var.h1());
                                        return;
                                    }
                                }
                                if (fq4Var.t0(34)) {
                                    fq4Var.D(1, false);
                                    return;
                                } else {
                                    fq4Var.v0(false);
                                    return;
                                }
                            }
                            if (fq4Var.t0(34)) {
                                fq4Var.G(1);
                                return;
                            } else {
                                fq4Var.N0();
                                return;
                            }
                        }
                        if (fq4Var.t0(34)) {
                            fq4Var.i0(1);
                            return;
                        } else {
                            fq4Var.E();
                            return;
                        }
                    }
                    if (fq4Var.t0(34)) {
                        fq4Var.D(1, true);
                        return;
                    } else {
                        fq4Var.v0(true);
                        return;
                    }
                }
                return;
        }
    }
}
