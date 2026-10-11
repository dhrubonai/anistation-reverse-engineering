package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class og4 extends ai2 implements gr0 {
    public final ArrayList a;

    public og4(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof og4) {
                dp0.Y(((gr0) obj).a(), arrayList);
            } else {
                arrayList.add(obj);
            }
        }
        this.a = arrayList;
    }

    @Override // defpackage.gr0
    public final List a() {
        return this.a;
    }
}
