package defpackage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class c50 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ int z;

    public /* synthetic */ c50(os0 os0Var, Object obj, Object obj2, Object obj3, int i) {
        this.x = (byte) 1;
        this.y = os0Var;
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
        this.z = i;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        Object obj3 = this.C;
        Object obj4 = this.B;
        Object obj5 = this.y;
        Object obj6 = this.A;
        pn6 pn6Var = pn6.a;
        int i = this.z;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                io3.c((xr4) obj6, (os0) obj5, (ng6) obj3, (os0) obj4, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            case 1:
                ((Integer) obj2).getClass();
                int N = kb0.N(i) | 1;
                ((os0) obj5).h(this.A, this.B, this.C, (kd2) obj, N);
                return pn6Var;
            case 2:
                ((Integer) obj2).intValue();
                v94.d((af3) obj6, (List) obj5, (LocalDate) obj4, (ic2) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            case 3:
                ((Integer) obj2).getClass();
                w65.j((ArrayList) obj6, (List) obj5, (Set) obj4, (Set) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            case 4:
                ((Integer) obj2).getClass();
                int N2 = kb0.N(i | 1);
                te4.j((Boolean) obj6, this.y, (og3) obj4, (ub2) obj3, (kd2) obj, N2);
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                w65.i((kb5) obj6, (w74) obj5, (sb2) obj4, (sb2) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
        }
    }

    public /* synthetic */ c50(xr4 xr4Var, os0 os0Var, ng6 ng6Var, os0 os0Var2, int i) {
        this.x = (byte) 0;
        this.A = xr4Var;
        this.y = os0Var;
        this.C = ng6Var;
        this.B = os0Var2;
        this.z = i;
    }

    public /* synthetic */ c50(Object obj, Object obj2, Object obj3, Object obj4, int i, byte b) {
        this.x = b;
        this.A = obj;
        this.y = obj2;
        this.B = obj3;
        this.C = obj4;
        this.z = i;
    }
}
