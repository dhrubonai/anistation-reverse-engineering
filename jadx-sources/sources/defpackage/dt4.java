package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dt4 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ et4 f;

    public dt4(et4 et4Var, List list) {
        this.f = et4Var;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            hz2.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
