package defpackage;

import com.anistation.model.update.AppUpdateCheck;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zq implements fr {
    public final AppUpdateCheck a;

    public zq(AppUpdateCheck appUpdateCheck) {
        appUpdateCheck.getClass();
        this.a = appUpdateCheck;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zq) && a34.i(this.a, ((zq) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Available(update=" + this.a + ")";
    }
}
