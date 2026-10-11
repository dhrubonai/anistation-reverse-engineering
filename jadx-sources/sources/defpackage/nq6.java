package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class nq6 {
    public static final Set a = ms.U0(new String[]{"Date", "Expires", "Last-Modified", "If-Modified-Since", "If-Unmodified-Since"});

    public static final void a(nk2 nk2Var, yg4 yg4Var, cu5 cu5Var) {
        String str;
        String str2;
        kk2 kk2Var = new kk2((byte) 0);
        kk2Var.i(nk2Var);
        kk2Var.i(yg4Var.c());
        new sz5((Map) kk2Var.x, true).b(new cu5(cu5Var, (byte) 10));
        if (nk2Var.get("User-Agent") == null && yg4Var.c().get("User-Agent") == null) {
            int i = mn4.a;
            cu5Var.invoke("User-Agent", "ktor-client");
        }
        jz0 b = yg4Var.b();
        if (b != null) {
            str = b.toString();
        } else {
            str = yg4Var.c().get("Content-Type");
            if (str == null) {
                str = nk2Var.get("Content-Type");
            }
        }
        Long a2 = yg4Var.a();
        if ((a2 == null || (str2 = String.valueOf(a2.longValue())) == null) && (str2 = yg4Var.c().get("Content-Length")) == null) {
            str2 = nk2Var.get("Content-Length");
        }
        if (str != null) {
            cu5Var.invoke("Content-Type", str);
        }
        if (str2 != null) {
            cu5Var.invoke("Content-Length", str2);
        }
    }
}
