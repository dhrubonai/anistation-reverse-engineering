package androidx.lifecycle;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f1074a;

    public b0(int i10) {
        if (i10 == 1) {
            this.f1074a = new HashMap();
        } else if (i10 != 3) {
            this.f1074a = new HashMap();
        } else {
            this.f1074a = new HashMap();
        }
    }

    public b0(b0 b0Var) {
        this.f1074a = Collections.unmodifiableMap(new HashMap(b0Var.f1074a));
    }
}
