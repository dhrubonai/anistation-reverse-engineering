package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gk extends x93 implements ic2 {
    public static final gk A;
    public static final gk z;
    public final /* synthetic */ byte y;

    static {
        int i = 2;
        z = new gk(i, (byte) 0);
        A = new gk(i, (byte) 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gk(int i, byte b) {
        super(i);
        this.y = b;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z2 = true;
        switch (this.y) {
            case 0:
                long j = ((k13) obj).a;
                long j2 = ((k13) obj2).a;
                Map map = sw6.a;
                return z51.O(0.0f, 400.0f, new k13(4294967297L), 1);
            default:
                tu1 tu1Var = (tu1) obj2;
                if (((tu1) obj) != tu1Var || tu1Var != tu1.z) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
        }
    }
}
