package y;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f11440a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f11441b;

    public l(Resources resources, Resources.Theme theme) {
        this.f11440a = resources;
        this.f11441b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f11440a.equals(lVar.f11440a) && f0.b.a(this.f11441b, lVar.f11441b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return f0.b.b(this.f11440a, this.f11441b);
    }
}
