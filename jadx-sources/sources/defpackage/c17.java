package defpackage;

import com.anistation.model.watch.Track;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class c17 implements ic2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ ub2 B;
    public final /* synthetic */ short C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ List y;
    public final /* synthetic */ float z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c17(String str, List list, float f, boolean z, ub2 ub2Var, int i) {
        this.D = str;
        this.y = list;
        this.z = f;
        this.A = z;
        this.B = ub2Var;
        this.C = i;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        short s = this.C;
        Object obj3 = this.D;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int N = kb0.N(s | 1);
                lt5.e(this.A, (Track) obj3, this.y, this.z, this.B, (kd2) obj, N);
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                int N2 = kb0.N(s | 1);
                lt5.c((String) obj3, this.y, this.z, this.A, this.B, (kd2) obj, N2);
                return pn6Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c17(boolean z, Track track, List list, float f, ub2 ub2Var, int i) {
        this.A = z;
        this.D = track;
        this.y = list;
        this.z = f;
        this.B = ub2Var;
        this.C = i;
    }
}
