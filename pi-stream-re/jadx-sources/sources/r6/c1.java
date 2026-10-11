package r6;

import java.util.Map;

/* loaded from: classes.dex */
public enum c1 extends d1 {
    public c1() {
        super("VALUE", 1);
    }

    @Override // q6.f
    public final Object apply(Object obj) {
        return ((Map.Entry) obj).getValue();
    }
}
