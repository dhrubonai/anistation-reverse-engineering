package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pa1 {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;

    public pa1(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final void a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((dw5) obj).getClass();
                dp0.Y(null, arrayList2);
            }
            List I0 = yo0.I0(yo0.N0(arrayList2));
            int size2 = I0.size();
            for (int i2 = 0; i2 < size2; i2++) {
                cw5 cw5Var = (cw5) I0.get(i2);
                cw5Var.getClass();
                ViewGroup viewGroup = this.a;
                viewGroup.getClass();
                if (!cw5Var.a) {
                    cw5Var.b(viewGroup);
                }
                cw5Var.a = true;
            }
            return;
        }
        throw null;
    }
}
