package defpackage;

import android.view.autofill.AutofillValue;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class d11 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ e11 y;

    public /* synthetic */ d11(e11 e11Var, bi5 bi5Var) {
        this.x = (byte) 3;
        this.y = e11Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        CharSequence charSequence = null;
        boolean z = false;
        e11 e11Var = this.y;
        switch (b) {
            case 0:
                ti4 ti4Var = e11Var.P.t;
                Boolean bool = Boolean.TRUE;
                ti4Var.setValue(bool);
                e11Var.P.s.setValue(bool);
                uf3 uf3Var = e11Var.P;
                AutofillValue autofillValue = ((ic) obj).a;
                if (autofillValue.isText()) {
                    charSequence = autofillValue.getTextValue();
                }
                charSequence.getClass();
                e11.d1(uf3Var, (String) charSequence, e11Var.Q);
                return bool;
            case 1:
                List list = (List) obj;
                if (e11Var.P.d() != null) {
                    cd6 d = e11Var.P.d();
                    d.getClass();
                    list.add(d.a);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                e11.d1(e11Var.P, ((ko) obj).y, e11Var.Q);
                return Boolean.TRUE;
            default:
                ko koVar = (ko) obj;
                if (e11Var.Q) {
                    vc6 vc6Var = e11Var.P.e;
                    if (vc6Var != null) {
                        List I = te4.I(new Object(), new mq0(koVar, 1));
                        uf3 uf3Var2 = e11Var.P;
                        pz2 pz2Var = uf3Var2.d;
                        r01 r01Var = uf3Var2.v;
                        mc6 k = pz2Var.k(I);
                        vc6Var.a(null, k);
                        r01Var.invoke(k);
                    } else {
                        mc6 mc6Var = e11Var.O;
                        String str = mc6Var.a.y;
                        long j = mc6Var.b;
                        int i = nd6.c;
                        String obj2 = uz5.e0(str, (int) (j >> 32), (int) (j & 4294967295L), koVar).toString();
                        int length = koVar.y.length() + ((int) (e11Var.O.b >> 32));
                        e11Var.P.v.invoke(new mc6(fy5.a(length, length), 4, obj2));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ d11(e11 e11Var, byte b) {
        this.x = b;
        this.y = e11Var;
    }
}
