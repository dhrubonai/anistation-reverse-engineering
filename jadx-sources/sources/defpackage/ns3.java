package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ns3 extends qs3 {
    public final ArrayList w;
    public final js x;

    /* JADX WARN: Type inference failed for: r2v2, types: [so5, js] */
    public ns3(ps3 ps3Var, String str, String str2) {
        super(ps3Var, str, str2, false);
        this.w = new ArrayList();
        this.x = new so5(0);
    }

    public final void i(Collection collection) {
        this.v.clear();
        ArrayList arrayList = this.w;
        arrayList.clear();
        js jsVar = this.x;
        jsVar.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            fs3 fs3Var = (fs3) it.next();
            qs3 a = this.a.a(fs3Var.a.d());
            if (a != null) {
                arrayList.add(a);
                jsVar.put(a.c, fs3Var);
                int i = fs3Var.b;
                if (i == 2 || i == 3) {
                    this.v.add(a);
                }
            }
        }
        rs3.c().a.b(259, this);
    }
}
