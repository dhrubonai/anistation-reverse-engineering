package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class go4 {
    public static final go4 b = new fo4().b();
    public static final String c;
    public final g42 a;

    static {
        String str = eq6.a;
        c = Integer.toString(0, 36);
    }

    public go4(g42 g42Var) {
        this.a = g42Var;
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            g42 g42Var = this.a;
            if (i < g42Var.a.size()) {
                arrayList.add(Integer.valueOf(g42Var.a(i)));
                i++;
            } else {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go4)) {
            return false;
        }
        return this.a.equals(((go4) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
