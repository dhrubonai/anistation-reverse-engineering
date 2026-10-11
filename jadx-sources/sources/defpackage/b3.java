package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class b3 implements ub2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ b3(byte b) {
        this.x = b;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        boolean z = false;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                cr4 cr4Var = (cr4) obj;
                if (cr4Var != null && cr4Var.a == 2) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 1:
                return pn6Var;
            case 2:
                return pn6Var;
            case 3:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case 4:
                return Boolean.TRUE;
            case 5:
                ((Integer) obj).getClass();
                return Float.valueOf(Float.NaN);
            case 6:
                return Boolean.TRUE;
            case 7:
                return new e9(obj);
            case 8:
                return Boolean.TRUE;
            case 9:
                return Boolean.valueOf(q23.E((uh5) obj));
            case 10:
                return (jn4) obj;
            case 11:
                al4 al4Var = (al4) obj;
                tq1 tq1Var = eb.a;
                al4Var.getClass();
                sw0.E(al4Var, tq1Var);
                return ((Context) sw0.E(al4Var, eb.b)).getResources();
            case 12:
                return Boolean.valueOf(q23.E((uh5) obj));
            case 13:
                w73[] w73VarArr = zh5.a;
                ((bi5) obj).b(yh5.y, pn6Var);
                return pn6Var;
            case 14:
                ((Long) obj).getClass();
                return pn6Var;
            case 15:
                w73[] w73VarArr2 = zh5.a;
                ((bi5) obj).b(yh5.x, pn6Var);
                return pn6Var;
            case 16:
                ((Long) obj).getClass();
                return pn6Var;
            case 17:
                return pn6Var;
            case 18:
                ((Long) obj).getClass();
                return pn6Var;
            case 19:
                jg jgVar = (jg) obj;
                jgVar.getHandler().post(new ca(jgVar.O, (byte) 4));
                return pn6Var;
            case 20:
                return pn6Var;
            case 21:
                return pn6Var;
            case 22:
                return pn6Var;
            case 23:
                bi5 bi5Var = (bi5) obj;
                bi5Var.getClass();
                zh5.f(bi5Var, 1);
                return pn6Var;
            case 24:
                bi5 bi5Var2 = (bi5) obj;
                bi5Var2.getClass();
                zh5.f(bi5Var2, 0);
                return pn6Var;
            case 25:
                ((kk) obj).getClass();
                return new ez0(dv1.b(z51.V(300, 6, null), 2), dv1.c(z51.V(300, 6, null), 2));
            case 26:
                ((kk) obj).getClass();
                ez0 ez0Var = new ez0(dv1.b(z51.V(300, 6, null), 2), dv1.c(z51.V(300, 6, null), 2));
                ez0Var.c.i(-1.0f);
                return ez0Var;
            case 27:
                return String.valueOf(obj);
            case 28:
                bi5 bi5Var3 = (bi5) obj;
                bi5Var3.getClass();
                zh5.f(bi5Var3, 6);
                return pn6Var;
            default:
                bi5 bi5Var4 = (bi5) obj;
                bi5Var4.getClass();
                zh5.f(bi5Var4, 2);
                return pn6Var;
        }
    }
}
