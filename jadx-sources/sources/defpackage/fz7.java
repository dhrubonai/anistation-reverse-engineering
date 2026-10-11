package defpackage;

import android.app.Application;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fz7 {
    public final ww7 a;

    public fz7(ww7 ww7Var) {
        this.a = ww7Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dx7, ii3, j1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [x62, x, z, java.lang.Runnable] */
    public static x b(v78 v78Var) {
        ?? obj = new Object();
        obj.E = v78Var;
        uw7 uw7Var = new uw7(obj);
        v78Var.getClass();
        qg1 qg1Var = qg1.x;
        v78Var.b.m(new os7(qg1Var, uw7Var));
        v78Var.j();
        int i = z.I;
        ?? zVar = new z(obj, bp.class, dz7.a);
        obj.a(zVar, kb0.I(qg1Var, zVar));
        return zVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [m15, java.lang.Object] */
    public final x a(x28 x28Var) {
        String sb;
        String simpleName = yw7.class.getSimpleName();
        ww7 ww7Var = this.a;
        gs1 c = ww7Var.c(x28Var, simpleName);
        String str = m37.s;
        if (str == null) {
            str = Application.getProcessName();
            m37.s = str;
        }
        if (str == null) {
            sb = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int length = str.length() + 1;
            int identityHashCode = System.identityHashCode(yw7.class);
            StringBuilder sb2 = new StringBuilder(length + String.valueOf(identityHashCode).length());
            sb2.append(str);
            sb2.append("|");
            sb2.append(identityHashCode);
            sb = sb2.toString();
        }
        xf6 xf6Var = new xf6(ww7Var, sb, c, (byte) 10);
        op7 op7Var = op7.E;
        ?? obj = new Object();
        obj.c = c;
        obj.a = xf6Var;
        obj.b = op7Var;
        obj.d = new q12[]{w65.p};
        obj.e = false;
        return b(ww7Var.b(obj.a()));
    }
}
