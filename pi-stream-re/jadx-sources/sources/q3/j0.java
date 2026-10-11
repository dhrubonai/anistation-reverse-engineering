package q3;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
public final class j0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final WindowId f9158a;

    public j0(View view) {
        this.f9158a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof j0) && ((j0) obj).f9158a.equals(this.f9158a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9158a.hashCode();
    }
}
