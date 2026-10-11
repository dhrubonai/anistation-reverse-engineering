package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class dd1 implements Runnable {
    public final /* synthetic */ cn7 A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ fd1 y;
    public final /* synthetic */ Runnable z;

    public /* synthetic */ dd1(fd1 fd1Var, Runnable runnable, cn7 cn7Var, byte b) {
        this.x = b;
        this.y = fd1Var;
        this.z = runnable;
        this.A = cn7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        final cn7 cn7Var = this.A;
        final Runnable runnable = this.z;
        fd1 fd1Var = this.y;
        switch (b) {
            case 0:
                final byte b2 = 0;
                fd1Var.x.execute(new Runnable() { // from class: bd1
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        cn7 cn7Var2 = cn7Var;
                        Runnable runnable2 = runnable;
                        switch (b3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((hd1) cn7Var2.x).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((hd1) cn7Var2.x).l(e2);
                                    return;
                                }
                            default:
                                hd1 hd1Var = (hd1) cn7Var2.x;
                                try {
                                    runnable2.run();
                                    hd1Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    hd1Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                final byte b3 = 2;
                fd1Var.x.execute(new Runnable() { // from class: bd1
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        cn7 cn7Var2 = cn7Var;
                        Runnable runnable2 = runnable;
                        switch (b32) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((hd1) cn7Var2.x).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((hd1) cn7Var2.x).l(e2);
                                    return;
                                }
                            default:
                                hd1 hd1Var = (hd1) cn7Var2.x;
                                try {
                                    runnable2.run();
                                    hd1Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    hd1Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final byte b4 = 1;
                fd1Var.x.execute(new Runnable() { // from class: bd1
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b4;
                        cn7 cn7Var2 = cn7Var;
                        Runnable runnable2 = runnable;
                        switch (b32) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((hd1) cn7Var2.x).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((hd1) cn7Var2.x).l(e2);
                                    return;
                                }
                            default:
                                hd1 hd1Var = (hd1) cn7Var2.x;
                                try {
                                    runnable2.run();
                                    hd1Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    hd1Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
