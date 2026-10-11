package b7;

import i7.l;
import i7.m;
import r6.h0;

/* loaded from: classes.dex */
public abstract class h extends c implements i7.f {
    private final int arity;

    public h(z6.e eVar) {
        super(eVar);
        this.arity = 2;
    }

    @Override // i7.f
    public int getArity() {
        return this.arity;
    }

    @Override // b7.a
    public String toString() {
        if (getCompletion() == null) {
            l.f5413a.getClass();
            String a10 = m.a(this);
            h0.s(a10, "renderLambdaToString(...)");
            return a10;
        }
        return super.toString();
    }
}
