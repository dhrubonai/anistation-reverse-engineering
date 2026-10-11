package q3;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public final View f9197b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9196a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9198c = new ArrayList();

    public z(View view) {
        this.f9197b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f9197b == zVar.f9197b && this.f9196a.equals(zVar.f9196a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9196a.hashCode() + (this.f9197b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = p.j.a("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        a10.append(this.f9197b);
        a10.append("\n");
        String s9 = a3.g.s(a10.toString(), "    values:");
        HashMap hashMap = this.f9196a;
        for (String str : hashMap.keySet()) {
            s9 = s9 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return s9;
    }
}
