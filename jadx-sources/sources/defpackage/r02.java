package defpackage;

import com.anistation.download.service.ExternalDownloadService;
import com.anistation.download.service.InternalDownloadService;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r02 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ r02(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        Object valueOf;
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return w65.B((ExternalDownloadService) obj).d(z05.a(ok1.class), null, null);
            case 1:
                ArrayList arrayList = ((nd2) obj).a;
                p44 p44Var = new p44(arrayList.size());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    h83 h83Var = (h83) arrayList.get(i);
                    Object obj2 = h83Var.b;
                    int i2 = h83Var.a;
                    if (obj2 != null) {
                        valueOf = new v43(Integer.valueOf(i2), h83Var.b);
                    } else {
                        valueOf = Integer.valueOf(i2);
                    }
                    v24.a(p44Var, valueOf, h83Var);
                }
                return new v24(p44Var);
            case 2:
                return w65.B((InternalDownloadService) obj).d(z05.a(ok1.class), null, null);
            default:
                return new xx0[((w42[]) obj).length];
        }
    }
}
