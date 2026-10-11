package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pn3 extends g2 {
    public final /* synthetic */ Map.Entry x;
    public final /* synthetic */ tn3 y;

    public pn3(Map.Entry entry, tn3 tn3Var) {
        this.x = entry;
        this.y = tn3Var;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.x.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.x;
        return this.y.j(entry.getKey(), entry.getValue());
    }
}
