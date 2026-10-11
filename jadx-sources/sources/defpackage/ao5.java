package defpackage;

import android.app.Application;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ao5 implements ic2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ ao5(byte b) {
        this.x = b;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        byte b = this.x;
        Integer num = null;
        boolean z = false;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((do5) obj2).c();
            case 1:
                ((Integer) obj2).getClass();
                h26.b(kb0.N(1), (kd2) obj);
                return pn6Var;
            case 2:
                cb6 cb6Var = (cb6) obj2;
                Float valueOf = Float.valueOf(cb6Var.a.h());
                if (((rg4) cb6Var.f.getValue()) == rg4.x) {
                    z = true;
                }
                return te4.I(valueOf, Boolean.valueOf(z));
            case 3:
                j11 j11Var = (j11) obj2;
                if (j11Var instanceof le6) {
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    }
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 1;
                    }
                    if (i == 0) {
                        return j11Var;
                    }
                    return Integer.valueOf(i + 1);
                }
                return obj;
            case 4:
                le6 le6Var = (le6) obj;
                j11 j11Var2 = (j11) obj2;
                if (le6Var != null) {
                    return le6Var;
                }
                if (!(j11Var2 instanceof le6)) {
                    return null;
                }
                return (le6) j11Var2;
            case 5:
                qe6 qe6Var = (qe6) obj;
                j11 j11Var3 = (j11) obj2;
                if (j11Var3 instanceof le6) {
                    le6 le6Var2 = (le6) j11Var3;
                    l11 l11Var = qe6Var.a;
                    Object b2 = le6Var2.b();
                    Object[] objArr = qe6Var.b;
                    int i2 = qe6Var.d;
                    objArr[i2] = b2;
                    le6[] le6VarArr = qe6Var.c;
                    qe6Var.d = i2 + 1;
                    le6VarArr[i2] = le6Var2;
                }
                return qe6Var;
            case 6:
                p7.H.invoke(obj);
                return pn6Var;
            case 7:
                ((Integer) obj2).getClass();
                t80.g(kb0.N(1), (kd2) obj);
                return pn6Var;
            case 8:
                ((Integer) obj2).getClass();
                t80.f(kb0.N(1), (kd2) obj);
                return pn6Var;
            case 9:
                ((Integer) obj2).getClass();
                t80.h(kb0.N(1), (kd2) obj);
                return pn6Var;
            case 10:
                ((Integer) obj2).getClass();
                t80.j(kb0.N(1), (kd2) obj);
                return pn6Var;
            case 11:
                dc5 dc5Var = (dc5) obj;
                dc5Var.getClass();
                ((li4) obj2).getClass();
                return new v27((Application) dc5Var.d(z05.a(Application.class), null, null), (pn) dc5Var.d(z05.a(pn.class), null, null), (cy6) dc5Var.d(z05.a(cy6.class), null, null), (ot6) dc5Var.d(z05.a(ot6.class), null, null), (cn) dc5Var.d(z05.a(cn.class), null, null), (qk1) dc5Var.d(z05.a(qk1.class), null, null), (ch1) dc5Var.d(z05.a(ch1.class), null, null));
            case 12:
                kd2 kd2Var = (kd2) obj;
                ((Integer) obj2).getClass();
                kd2Var.e0(617190293);
                w32 w32Var = new w32(0);
                kd2Var.q(false);
                return w32Var;
            default:
                kd2 kd2Var2 = (kd2) obj;
                ((Integer) obj2).getClass();
                kd2Var2.e0(-2058602921);
                w32 w32Var2 = new w32(0);
                kd2Var2.q(false);
                return w32Var2;
        }
    }

    public /* synthetic */ ao5(int i, byte b) {
        this.x = b;
    }
}
