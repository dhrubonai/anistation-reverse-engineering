package b7;

import z6.i;
import z6.j;

/* loaded from: classes.dex */
public abstract class f extends a {
    public f(z6.e eVar) {
        super(eVar);
        boolean z9;
        if (eVar != null) {
            if (eVar.getContext() == j.f12080a) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // z6.e
    public final i getContext() {
        return j.f12080a;
    }
}
