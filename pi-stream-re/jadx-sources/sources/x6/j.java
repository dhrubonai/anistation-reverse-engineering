package x6;

import java.util.Collection;
import r6.h0;

/* loaded from: classes.dex */
public abstract class j extends com.bumptech.glide.c {
    public static final int o0(Iterable iterable) {
        h0.u(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
