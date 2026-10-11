package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ay7 implements r26 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ r26 y;

    public /* synthetic */ ay7(r26 r26Var, byte b) {
        this.x = b;
        this.y = r26Var;
    }

    @Override // defpackage.r26
    public final Object get() {
        byte b = this.x;
        r26 r26Var = this.y;
        switch (b) {
            case 0:
                Object obj = sx7.j;
                return (g38) ((jg4) r26Var.get()).c();
            default:
                p04 p04Var = (p04) r26Var.get();
                p04Var.getClass();
                hk6 hk6Var = new hk6(dp7.c);
                return new n04(hk6Var, p04Var.y.schedule(hk6Var, 10000L, TimeUnit.MILLISECONDS));
        }
    }
}
