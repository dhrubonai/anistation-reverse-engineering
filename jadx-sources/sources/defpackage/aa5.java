package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class aa5 implements da5 {
    public final ea5 a;
    public boolean b;
    public Bundle c;
    public final d46 d;

    public aa5(ea5 ea5Var, ew6 ew6Var) {
        ea5Var.getClass();
        this.a = ea5Var;
        this.d = new d46(new nj4(ew6Var, (byte) 11));
    }

    @Override // defpackage.da5
    public final Bundle a() {
        Bundle g = h98.g((ai4[]) Arrays.copyOf(new ai4[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            g.putAll(bundle);
        }
        for (Map.Entry entry : ((ba5) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((or0) ((v95) entry.getValue()).a.B).a();
            if (!a.isEmpty()) {
                str.getClass();
                g.putBundle(str, a);
            }
        }
        this.b = false;
        return g;
    }

    public final void b() {
        if (!this.b) {
            Bundle a = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle g = h98.g((ai4[]) Arrays.copyOf(new ai4[0], 0));
            Bundle bundle = this.c;
            if (bundle != null) {
                g.putAll(bundle);
            }
            if (a != null) {
                g.putAll(a);
            }
            this.c = g;
            this.b = true;
        }
    }
}
