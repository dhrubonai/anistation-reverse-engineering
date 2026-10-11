package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l05 implements da5 {
    public final LinkedHashSet a = new LinkedHashSet();

    public l05(ea5 ea5Var) {
        ea5Var.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.da5
    public final Bundle a() {
        ArrayList<String> arrayList;
        Bundle g = h98.g((ai4[]) Arrays.copyOf(new ai4[0], 0));
        List I0 = yo0.I0(this.a);
        if (I0 instanceof ArrayList) {
            arrayList = (ArrayList) I0;
        } else {
            arrayList = new ArrayList<>(I0);
        }
        g.putStringArrayList("classes_to_restore", arrayList);
        return g;
    }
}
