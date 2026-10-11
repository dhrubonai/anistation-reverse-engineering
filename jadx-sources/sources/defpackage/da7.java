package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class da7 extends ka7 {
    public static final da7 A = new Object();

    @Override // defpackage.ka7
    public final void a(boolean z) {
        String str;
        Iterator it = Collections.unmodifiableCollection(ia7.c.a).iterator();
        while (it.hasNext()) {
            k6 k6Var = ((ba7) it.next()).e;
            if (k6Var.b.get() != 0) {
                if (z) {
                    str = "foregrounded";
                } else {
                    str = "backgrounded";
                }
                l68.T.a(k6Var.e(), "setState", str, k6Var.a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ka7
    public final boolean b() {
        Iterator it = Collections.unmodifiableCollection(ia7.c.b).iterator();
        while (it.hasNext()) {
            View view = (View) ((ba7) it.next()).d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
