package w8;

import java.io.File;
import java.util.function.ToLongFunction;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements ToLongFunction {
    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return ((File) obj).lastModified();
    }
}
