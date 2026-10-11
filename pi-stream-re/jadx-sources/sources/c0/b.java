package c0;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import r6.h0;

/* loaded from: classes.dex */
public abstract class b {
    public static final void a(Bundle bundle, String str, Size size) {
        h0.u(bundle, "bundle");
        h0.u(str, "key");
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        h0.u(bundle, "bundle");
        h0.u(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
