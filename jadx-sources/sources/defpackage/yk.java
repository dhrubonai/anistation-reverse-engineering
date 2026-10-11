package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yk extends x93 implements sb2 {
    public final /* synthetic */ byte y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yk(Object obj, byte b) {
        super(0);
        this.y = b;
        this.z = obj;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        boolean z;
        byte b = this.y;
        Object obj = this.z;
        switch (b) {
            case 0:
                ((w44) obj).setValue(Boolean.FALSE);
                return pn6.a;
            case 1:
                xi6 xi6Var = (xi6) obj;
                Object v = xi6Var.a.v();
                tu1 tu1Var = tu1.z;
                if (v == tu1Var && xi6Var.d.getValue() == tu1Var) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                return (List) obj;
            default:
                try {
                    return (List) ((sb2) obj).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return nt1.x;
                }
        }
    }
}
