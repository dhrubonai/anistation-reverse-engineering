package c0;

import android.os.Bundle;
import android.os.IBinder;
import r6.h0;

/* loaded from: classes.dex */
public abstract class a {
    public static final void a(Bundle bundle, String str, IBinder iBinder) {
        h0.u(bundle, "bundle");
        h0.u(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
