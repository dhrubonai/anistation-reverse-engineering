package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ct6 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ ct6(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                dt6 dt6Var = (dt6) obj;
                dt6Var.x.postVsyncCallback(dt6Var);
                return;
            case 1:
                ii6 ii6Var = (ii6) ((xv3) obj).y;
                long j = ii6Var.g;
                LinkedHashMap linkedHashMap = a61.a;
                synchronized (a61.class) {
                }
                Locale locale = Locale.US;
                oz1 oz1Var = new oz1("Muxer error", new IllegalStateException(qx1.j(j, "Abort: no output sample written in the last ", " milliseconds. DebugTrace: \"Tracing disabled\"")), 7002, 0);
                pz1 pz1Var = ii6Var.r;
                if (pz1Var != null) {
                    pz1Var.b(oz1Var);
                    return;
                } else {
                    ii6Var.p.v(new qz1().a(), oz1Var);
                    return;
                }
            default:
                zp2 zp2Var = (zp2) obj;
                ((l85) zp2Var.A).t(new xv3(zp2Var, (byte) 21));
                return;
        }
    }
}
