package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class si0 implements gj6 {
    public final cn7 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final un0 e;
    public final un0 f;

    public si0(Context context, un0 un0Var, un0 un0Var2) {
        l53 l53Var = new l53();
        cx cxVar = cx.a;
        l53Var.a(m50.class, cxVar);
        l53Var.a(tx.class, cxVar);
        fx fxVar = fx.a;
        l53Var.a(tk3.class, fxVar);
        l53Var.a(ey.class, fxVar);
        dx dxVar = dx.a;
        l53Var.a(zm0.class, dxVar);
        l53Var.a(ux.class, dxVar);
        bx bxVar = bx.a;
        l53Var.a(w9.class, bxVar);
        l53Var.a(rx.class, bxVar);
        ex exVar = ex.a;
        l53Var.a(qk3.class, exVar);
        l53Var.a(dy.class, exVar);
        gx gxVar = gx.a;
        l53Var.a(s84.class, gxVar);
        l53Var.a(gy.class, gxVar);
        l53Var.d = true;
        this.a = new cn7(l53Var);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(ee0.c);
        this.e = un0Var2;
        this.f = un0Var;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(zo5.l("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (((defpackage.q84) defpackage.q84.x.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xx a(defpackage.xx r8) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si0.a(xx):xx");
    }
}
