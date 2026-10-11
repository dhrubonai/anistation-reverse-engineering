package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class k03 {
    public final r50 a;

    public k03(r50 r50Var) {
        this.a = r50Var;
    }

    public Object a(tp tpVar) {
        Iterable iterable;
        i18 i18Var = (i18) tpVar.y;
        r50 r50Var = this.a;
        r50Var.toString();
        i18Var.getClass();
        zf3 zf3Var = zf3.B;
        zf3Var.compareTo(zf3.x);
        try {
            li4 li4Var = (li4) tpVar.C;
            if (li4Var == null) {
                li4Var = new li4(3, null);
            }
            return r50Var.d.invoke((dc5) tpVar.z, li4Var);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(e);
            sb.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            stackTrace.getClass();
            int i = 0;
            while (i < stackTrace.length) {
                String className = stackTrace[i].getClassName();
                className.getClass();
                if (uz5.M(className, "sun.reflect", false)) {
                    break;
                }
                i++;
            }
            if (i != 0) {
                if (i != 1) {
                    iterable = Arrays.asList(ms.D0(stackTrace, 0, i));
                    iterable.getClass();
                } else {
                    iterable = te4.H(stackTrace[0]);
                }
            } else {
                iterable = nt1.x;
            }
            sb.append(yo0.q0(iterable, "\n\t", null, null, null, 62));
            r50Var.toString();
            zf3Var.compareTo(zf3.A);
            throw new nw("Could not create instance for '" + r50Var + '\'', e, (byte) 4);
        }
    }

    public Object b(tp tpVar) {
        return a(tpVar);
    }
}
