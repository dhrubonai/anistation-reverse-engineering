package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class fw7 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ qx7 y;

    public /* synthetic */ fw7(qx7 qx7Var, byte b) {
        this.x = b;
        this.y = qx7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        byte b = this.x;
        qx7 qx7Var = this.y;
        switch (b) {
            case 0:
                qx7Var.i0();
                return;
            case 1:
                cw7 cw7Var = qx7Var.N;
                gu7 gu7Var = cw7Var.a;
                au7 au7Var = gu7Var.D;
                qx7 qx7Var2 = gu7Var.J;
                bt7 bt7Var = gu7Var.B;
                gu7.l(au7Var);
                au7Var.L();
                if (cw7Var.d()) {
                    if (cw7Var.c()) {
                        gu7.j(bt7Var);
                        bt7Var.T.h(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        gu7.k(qx7Var2);
                        qx7Var2.S("auto", "_cmpx", bundle);
                    } else {
                        gu7.j(bt7Var);
                        tu tuVar = bt7Var.T;
                        String g = tuVar.g();
                        if (TextUtils.isEmpty(g)) {
                            es7 es7Var = gu7Var.C;
                            gu7.l(es7Var);
                            es7Var.D.a("Cache still valid but referrer not found");
                        } else {
                            long j = 3600000;
                            long g2 = bt7Var.U.g() / 3600000;
                            Uri parse = Uri.parse(g);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String str2 : parse.getQueryParameterNames()) {
                                bundle2.putString(str2, parse.getQueryParameter(str2));
                                j = j;
                            }
                            ((Bundle) pair.second).putLong("_cc", (g2 - 1) * j);
                            Object obj = pair.first;
                            if (obj == null) {
                                str = "app";
                            } else {
                                str = (String) obj;
                            }
                            gu7.k(qx7Var2);
                            qx7Var2.S(str, "_cmp", (Bundle) pair.second);
                        }
                        tuVar.h(null);
                    }
                    gu7.j(bt7Var);
                    bt7Var.U.h(0L);
                    return;
                }
                return;
            case 2:
                qx7Var.L();
                gu7 gu7Var2 = (gu7) qx7Var.x;
                bt7 bt7Var2 = gu7Var2.B;
                es7 es7Var2 = gu7Var2.C;
                gu7.j(bt7Var2);
                ss7 ss7Var = bt7Var2.Q;
                if (!ss7Var.a()) {
                    sb6 sb6Var = bt7Var2.R;
                    long g3 = sb6Var.g();
                    sb6Var.h(1 + g3);
                    if (g3 >= 5) {
                        gu7.l(es7Var2);
                        es7Var2.F.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        ss7Var.b(true);
                        return;
                    } else {
                        gw7 gw7Var = qx7Var.P;
                        if (gw7Var == null) {
                            gw7Var = new gw7(qx7Var, gu7Var2, (byte) 3, false);
                            qx7Var.P = gw7Var;
                        }
                        gw7Var.b(0L);
                        return;
                    }
                }
                gu7.l(es7Var2);
                es7Var2.J.a("Deferred Deep Link already retrieved. Not fetching again.");
                return;
            default:
                qx7Var.i0();
                return;
        }
    }
}
