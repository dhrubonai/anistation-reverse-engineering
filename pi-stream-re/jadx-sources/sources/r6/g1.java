package r6;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class g1 extends w7.b {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Comparator f9463u;

    public g1(l1 l1Var) {
        this.f9463u = l1Var;
    }

    @Override // w7.b
    public final Map E() {
        return new TreeMap(this.f9463u);
    }
}
