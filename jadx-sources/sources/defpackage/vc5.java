package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vc5 implements lh4 {
    public final int x;
    public final List y;
    public Float z = null;
    public Float A = null;
    public hc5 B = null;
    public hc5 C = null;

    public vc5(int i, ArrayList arrayList) {
        this.x = i;
        this.y = arrayList;
    }

    @Override // defpackage.lh4
    public final boolean u() {
        return this.y.contains(this);
    }
}
