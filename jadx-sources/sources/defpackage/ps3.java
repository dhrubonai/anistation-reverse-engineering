package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ps3 {
    public final js3 a;
    public final ArrayList b = new ArrayList();
    public final boolean c;
    public final sn3 d;
    public u92 e;

    public ps3(js3 js3Var, boolean z) {
        this.a = js3Var;
        this.d = js3Var.y;
        this.c = z;
    }

    public final qs3 a(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            qs3 qs3Var = (qs3) obj;
            if (qs3Var.b.equals(str)) {
                return qs3Var;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.y).getPackageName() + " }";
    }
}
