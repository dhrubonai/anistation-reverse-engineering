package b2;

import c1.n1;
import c1.o1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f1299a;

    public b(o1 o1Var) {
        this.f1299a = o1Var;
    }

    public final void a() {
        try {
            ((b) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(o1.class).newInstance(this.f1299a)).a();
        } catch (Exception e10) {
            int i10 = n1.f1866a;
            if (e10 instanceof n1) {
                throw ((n1) e10);
            }
            throw new n1(e10);
        }
    }
}
