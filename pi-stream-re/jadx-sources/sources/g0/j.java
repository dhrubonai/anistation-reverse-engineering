package g0;

import android.view.DisplayCutout;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f4221a;

    public j(DisplayCutout displayCutout) {
        this.f4221a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            return f0.b.a(this.f4221a, ((j) obj).f4221a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f4221a;
        if (displayCutout != null) {
            hashCode = displayCutout.hashCode();
            return hashCode;
        }
        return 0;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f4221a + "}";
    }
}
