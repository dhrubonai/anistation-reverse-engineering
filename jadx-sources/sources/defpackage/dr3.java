package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dr3 {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        String str = eq6.a;
        a = Integer.toString(0, 36);
        b = Integer.toString(1, 36);
        c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [dr3, java.lang.Object] */
    public static dr3 a(Bundle bundle) {
        Bundle n = eq6.n(bundle.getBundle(a));
        bundle.getBoolean(b, false);
        bundle.getBoolean(c, false);
        bundle.getBoolean(d, false);
        if (n == null) {
            n = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(n);
        return obj;
    }
}
