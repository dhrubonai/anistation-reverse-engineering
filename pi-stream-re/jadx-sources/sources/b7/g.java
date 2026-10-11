package b7;

import i7.l;
import i7.m;
import r6.h0;

/* loaded from: classes.dex */
public abstract class g extends f implements i7.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f1544a;

    public g(z6.e eVar) {
        super(eVar);
        this.f1544a = 2;
    }

    @Override // i7.f
    public final int getArity() {
        return this.f1544a;
    }

    @Override // b7.a
    public final String toString() {
        if (getCompletion() == null) {
            l.f5413a.getClass();
            String a10 = m.a(this);
            h0.s(a10, "renderLambdaToString(...)");
            return a10;
        }
        return super.toString();
    }
}
