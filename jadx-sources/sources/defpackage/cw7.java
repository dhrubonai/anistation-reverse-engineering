package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cw7 {
    public final gu7 a;

    public cw7(gu7 gu7Var) {
        this.a = gu7Var;
    }

    public boolean a() {
        es7 es7Var = this.a.C;
        gu7.l(es7Var);
        return Log.isLoggable(es7Var.R(), 3);
    }

    public void b(Bundle bundle, String str) {
        String uri;
        gu7 gu7Var = this.a;
        au7 au7Var = gu7Var.D;
        bt7 bt7Var = gu7Var.B;
        gu7.l(au7Var);
        au7Var.L();
        if (!gu7Var.a()) {
            if (bundle.isEmpty()) {
                uri = null;
            } else {
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                uri = builder.build().toString();
            }
            if (!TextUtils.isEmpty(uri)) {
                gu7.j(bt7Var);
                bt7Var.T.h(uri);
                sb6 sb6Var = bt7Var.U;
                gu7Var.H.getClass();
                sb6Var.h(System.currentTimeMillis());
            }
        }
    }

    public boolean c() {
        if (d()) {
            gu7 gu7Var = this.a;
            gu7Var.H.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            bt7 bt7Var = gu7Var.B;
            gu7.j(bt7Var);
            if (currentTimeMillis - bt7Var.U.g() > gu7Var.A.T(null, tq7.i0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean d() {
        bt7 bt7Var = this.a.B;
        gu7.j(bt7Var);
        if (bt7Var.U.g() > 0) {
            return true;
        }
        return false;
    }

    public cw7(dw7 dw7Var, gu7 gu7Var) {
        this.a = gu7Var;
    }
}
