package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pu7 implements Runnable {
    public final /* synthetic */ long A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public pu7(py7 py7Var, Bundle bundle, dy7 dy7Var, dy7 dy7Var2, long j) {
        this.x = (byte) 2;
        this.y = bundle;
        this.z = dy7Var;
        this.B = dy7Var2;
        this.A = j;
        Objects.requireNonNull(py7Var);
        this.C = py7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        Object obj = this.B;
        Object obj2 = this.z;
        Object obj3 = this.C;
        Object obj4 = this.y;
        switch (b) {
            case 0:
                String str = (String) obj2;
                z18 z18Var = ((nv7) obj3).e;
                String str2 = (String) obj4;
                if (str2 == null) {
                    z18Var.f().L();
                    String str3 = z18Var.d0;
                    if (str3 == null || str3.equals(str)) {
                        z18Var.d0 = str;
                        z18Var.c0 = null;
                        return;
                    }
                    return;
                }
                dy7 dy7Var = new dy7(this.A, (String) obj, str2);
                z18Var.f().L();
                String str4 = z18Var.d0;
                if (str4 != null) {
                    str4.equals(str);
                }
                z18Var.d0 = str;
                z18Var.c0 = dy7Var;
                return;
            case 1:
                qx7 qx7Var = (qx7) obj3;
                String str5 = (String) obj4;
                String str6 = (String) obj2;
                qx7Var.W(this.A, this.B, str5, str6);
                return;
            default:
                Bundle bundle = (Bundle) obj4;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                py7 py7Var = (py7) obj3;
                i28 i28Var = ((gu7) py7Var.x).F;
                gu7.j(i28Var);
                py7Var.R((dy7) obj2, (dy7) obj, this.A, true, i28Var.V("screen_view", bundle, null, false));
                return;
        }
    }

    public /* synthetic */ pu7(Object obj, String str, String str2, Object obj2, long j, byte b) {
        this.x = b;
        this.y = str;
        this.z = str2;
        this.B = obj2;
        this.A = j;
        this.C = obj;
    }
}
