package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class c02 {
    public static final List a;

    /* JADX WARN: Type inference failed for: r0v1, types: [l93, java.lang.Object] */
    static {
        try {
            Iterator it = Arrays.asList(new Object()).iterator();
            it.getClass();
            a = wi5.u0(wi5.o0(it));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
