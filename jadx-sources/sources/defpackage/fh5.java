package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class fh5 {
    public static final p65 a = l68.M;

    public static final boolean a(nq4 nq4Var) {
        MotionEvent a2;
        List list = nq4Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((uq4) list.get(i)).i == 2) {
                i++;
            } else {
                MotionEvent a3 = nq4Var.a();
                if ((a3 == null || !a3.isFromSource(8194)) && ((a2 = nq4Var.a()) == null || !a2.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
