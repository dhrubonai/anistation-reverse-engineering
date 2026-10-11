package defpackage;

import com.anistation.model.schedule.AnimeSchedule;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class mo implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ mo(int i, rd3 rd3Var, Object obj) {
        this.x = (byte) 5;
        this.z = rd3Var;
        this.y = i;
        this.A = obj;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        int i = this.y;
        Object obj3 = this.A;
        Object obj4 = this.z;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                no.a((ko) obj4, (List) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            case 1:
                ((Integer) obj2).getClass();
                ((os0) obj4).b(obj3, (kd2) obj, kb0.N(i) | 1);
                return pn6Var;
            case 2:
                ((Integer) obj2).getClass();
                kb0.b((mw4) obj4, (ic2) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            case 3:
                ((Integer) obj2).getClass();
                kb0.c((mw4[]) obj4, (ic2) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            case 4:
                ((Integer) obj2).getClass();
                ((dc3) obj4).d(i, obj3, (kd2) obj, kb0.N(1));
                return pn6Var;
            case 5:
                rd3 rd3Var = (rd3) obj4;
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    rd3Var.d(i, obj3, kd2Var, 0);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 6:
                ((Integer) obj2).getClass();
                ((qe3) obj4).d(i, obj3, (kd2) obj, kb0.N(1));
                return pn6Var;
            case 7:
                ((Integer) obj2).getClass();
                wk6.e((AnimeSchedule) obj4, (ub2) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            default:
                ((Integer) obj2).intValue();
                ((xi6) obj4).a(obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
        }
    }

    public /* synthetic */ mo(byte b, int i, Object obj, Object obj2) {
        this.x = b;
        this.z = obj;
        this.A = obj2;
        this.y = i;
    }

    public /* synthetic */ mo(rd3 rd3Var, int i, Object obj, int i2, byte b) {
        this.x = b;
        this.z = rd3Var;
        this.y = i;
        this.A = obj;
    }
}
