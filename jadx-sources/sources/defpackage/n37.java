package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class n37 {
    public static final ou a;

    static {
        al6 al6Var;
        z05.a(List.class);
        al6 al6Var2 = null;
        try {
            al6Var = z05.d(List.class, sw0.y(z05.d(k37.class, a83.c)));
        } catch (Throwable unused) {
            al6Var = null;
        }
        if (al6Var != null && al6Var.a()) {
            ov3.m("TypeInfo for nullable kotlinType ", al6Var, " must have isNullable set to true");
            return;
        }
        if (!uz5.V("Websocket extensions")) {
            im0 a2 = z05.a(m37.class);
            try {
                al6Var2 = z05.c(m37.class);
            } catch (Throwable unused2) {
            }
            a = new ou("Websocket plugin config", new vk6(a2, false, al6Var2));
            u93.a("io.ktor.client.plugins.websocket.WebSockets");
            return;
        }
        ze0.k("Name can't be blank");
    }
}
