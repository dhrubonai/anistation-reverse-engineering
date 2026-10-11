package k7;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import r6.h0;

/* loaded from: classes.dex */
public final class a extends j7.a {
    @Override // j7.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        h0.s(current, "current(...)");
        return current;
    }
}
