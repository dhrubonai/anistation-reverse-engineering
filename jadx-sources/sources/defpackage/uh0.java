package defpackage;

import com.anistation.model.Episode;
import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uh0 implements sb2 {
    public final /* synthetic */ byte x;
    public final Object y;
    public final /* synthetic */ Object z;

    public uh0(ep2 ep2Var, hp2 hp2Var) {
        this.x = (byte) 2;
        this.z = ep2Var;
        this.y = hp2Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj = this.y;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                ((ub2) obj).invoke((yh0) obj2);
                return pn6Var;
            case 1:
                ((xe1) obj2).invoke(Integer.valueOf(((Episode) obj).getNumber()));
                return pn6Var;
            default:
                ep2 ep2Var = (ep2) obj2;
                hp2 hp2Var = (hp2) obj;
                try {
                    if (!hp2Var.a(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    do {
                    } while (hp2Var.a(false, this));
                    ep2Var.a(1, 9, null);
                } catch (IOException e) {
                    ep2Var.a(2, 2, e);
                } catch (Throwable th) {
                    ep2Var.a(3, 3, null);
                    dq6.d(hp2Var);
                    throw th;
                }
                dq6.d(hp2Var);
                return pn6Var;
        }
    }

    public /* synthetic */ uh0(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }
}
