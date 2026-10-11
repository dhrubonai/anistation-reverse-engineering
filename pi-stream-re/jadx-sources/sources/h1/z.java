package h1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4646a;

    /* renamed from: b, reason: collision with root package name */
    public Map f4647b;

    public z(int i10) {
        if (i10 != 1) {
            this.f4646a = new HashMap();
        } else {
            this.f4646a = new HashMap();
            this.f4647b = new HashMap();
        }
    }

    public final synchronized Map a() {
        if (this.f4647b == null) {
            this.f4647b = Collections.unmodifiableMap(new HashMap(this.f4646a));
        }
        return this.f4647b;
    }
}
