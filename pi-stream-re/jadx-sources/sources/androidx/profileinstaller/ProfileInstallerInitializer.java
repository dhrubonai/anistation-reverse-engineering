package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import f.m0;
import java.util.Collections;
import java.util.List;
import k3.h;
import o3.b;
import w1.o;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // o3.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // o3.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new o(11);
        }
        h.a(new m0(17, this, context.getApplicationContext()));
        return new o(11);
    }
}
