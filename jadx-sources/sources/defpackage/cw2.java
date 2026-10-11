package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class cw2 extends rw2 {
    /* JADX WARN: Type inference failed for: r1v0, types: [eb2, bw2] */
    public static cw2 j(HashMap hashMap) {
        int i;
        Set entrySet = hashMap.entrySet();
        if (entrySet instanceof Collection) {
            i = entrySet.size();
        } else {
            i = 4;
        }
        ?? eb2Var = new eb2(i);
        eb2Var.K(entrySet);
        return eb2Var.g();
    }

    @Override // defpackage.rw2
    /* renamed from: i */
    public final gw2 values() {
        return ((n15) this).E.keySet();
    }

    @Override // defpackage.rw2, java.util.Map
    public final Collection values() {
        return ((n15) this).E.keySet();
    }
}
