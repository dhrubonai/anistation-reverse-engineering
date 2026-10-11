package z6;

import h7.p;
import java.io.Serializable;
import r6.h0;

/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final j f12080a = new j();

    public final int hashCode() {
        return 0;
    }

    @Override // z6.i
    public final g r(h hVar) {
        h0.u(hVar, "key");
        return null;
    }

    @Override // z6.i
    public final i t(i iVar) {
        h0.u(iVar, "context");
        return iVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // z6.i
    public final i v(h hVar) {
        h0.u(hVar, "key");
        return this;
    }

    @Override // z6.i
    public final Object x(Object obj, p pVar) {
        h0.u(pVar, "operation");
        return obj;
    }
}
