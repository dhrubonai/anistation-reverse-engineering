package defpackage;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a43 {
    public static final /* synthetic */ w73[] d;
    public final String a;
    public final ThreadLocal b;
    public final w41 c;

    static {
        yv4 yv4Var = new yv4(a43.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        z05.a.getClass();
        d = new w73[]{yv4Var};
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [z33] */
    public a43(Context context, String str) {
        context.getClass();
        this.a = str;
        this.b = new ThreadLocal();
        final byte b = 0;
        final byte b2 = 1;
        this.c = (w41) te4.L(str, new ap1(new ub2(this) { // from class: z33
            public final /* synthetic */ a43 y;

            {
                this.y = this;
            }

            @Override // defpackage.ub2
            public final Object invoke(Object obj) {
                byte b3 = b;
                a43 a43Var = this.y;
                byte b4 = 1;
                char c = 1;
                char c2 = 1;
                switch (b3) {
                    case 0:
                        d21 d21Var = (d21) obj;
                        d21Var.getClass();
                        Log.w(z05.a(a43.class).f(), "CorruptionException in " + a43Var.a + " DataStore running in process " + Process.myPid(), d21Var);
                        return new j44(c == true ? 1 : 0);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = a43Var.a;
                        LinkedHashSet linkedHashSet = qn5.a;
                        linkedHashSet.getClass();
                        vz0 vz0Var = null;
                        return te4.H(new pn5(context2, str2, rn5.a, new dh2(linkedHashSet, vz0Var, b4), new ll1(3, vz0Var, c2 == true ? 1 : 0)));
                }
            }
        }), new ub2(this) { // from class: z33
            public final /* synthetic */ a43 y;

            {
                this.y = this;
            }

            @Override // defpackage.ub2
            public final Object invoke(Object obj) {
                byte b3 = b2;
                a43 a43Var = this.y;
                byte b4 = 1;
                char c = 1;
                char c2 = 1;
                switch (b3) {
                    case 0:
                        d21 d21Var = (d21) obj;
                        d21Var.getClass();
                        Log.w(z05.a(a43.class).f(), "CorruptionException in " + a43Var.a + " DataStore running in process " + Process.myPid(), d21Var);
                        return new j44(c == true ? 1 : 0);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = a43Var.a;
                        LinkedHashSet linkedHashSet = qn5.a;
                        linkedHashSet.getClass();
                        vz0 vz0Var = null;
                        return te4.H(new pn5(context2, str2, rn5.a, new dh2(linkedHashSet, vz0Var, b4), new ll1(3, vz0Var, c2 == true ? 1 : 0)));
                }
            }
        }, 8).a(context, d[0]);
    }
}
