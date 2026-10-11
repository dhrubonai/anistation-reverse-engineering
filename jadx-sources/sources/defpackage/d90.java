package defpackage;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class d90 implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ List y;
    public final /* synthetic */ Serializable z;

    public /* synthetic */ d90(List list, LocalDate localDate, LocalDate localDate2, ic2 ic2Var, DateTimeFormatter dateTimeFormatter, DateTimeFormatter dateTimeFormatter2) {
        this.y = list;
        this.z = localDate;
        this.A = localDate2;
        this.B = ic2Var;
        this.C = dateTimeFormatter;
        this.D = dateTimeFormatter2;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.D;
        Object obj3 = this.C;
        Object obj4 = this.B;
        Object obj5 = this.A;
        Object obj6 = this.z;
        switch (b) {
            case 0:
                em4[] em4VarArr = (em4[]) obj6;
                xo3 xo3Var = (xo3) obj5;
                u05 u05Var = (u05) obj4;
                u05 u05Var2 = (u05) obj3;
                e90 e90Var = (e90) obj2;
                dm4 dm4Var = (dm4) obj;
                int length = em4VarArr.length;
                int i = 0;
                int i2 = 0;
                while (i2 < length) {
                    em4 em4Var = em4VarArr[i2];
                    em4Var.getClass();
                    b90.d(dm4Var, em4Var, (ro3) this.y.get(i), xo3Var.getLayoutDirection(), u05Var.x, u05Var2.x, e90Var.a);
                    i2++;
                    i++;
                }
                return pn6Var;
            default:
                pe3 pe3Var = (pe3) obj;
                pe3Var.getClass();
                List list = this.y;
                pe3Var.B0(list.size(), null, new eo(list, (byte) 4), new os0(802480018, true, new u51(list, (LocalDate) obj6, (LocalDate) obj5, (ic2) obj4, (DateTimeFormatter) obj3, (DateTimeFormatter) obj2)));
                return pn6Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d90(em4[] em4VarArr, List list, xo3 xo3Var, u05 u05Var, u05 u05Var2, e90 e90Var) {
        this.z = em4VarArr;
        this.y = list;
        this.A = xo3Var;
        this.B = u05Var;
        this.C = u05Var2;
        this.D = e90Var;
    }
}
