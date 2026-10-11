package i7;

import java.io.Serializable;
import r6.h0;

/* loaded from: classes.dex */
public abstract class h implements f, Serializable {
    private final int arity;

    public h(int i10) {
        this.arity = i10;
    }

    @Override // i7.f
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        l.f5413a.getClass();
        String a10 = m.a(this);
        h0.s(a10, "renderLambdaToString(...)");
        return a10;
    }
}
