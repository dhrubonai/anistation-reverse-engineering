package defpackage;

import com.anistation.model.update.AppUpdateCheck;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class er implements fr {
    public final AppUpdateCheck a;

    public er(AppUpdateCheck appUpdateCheck) {
        this.a = appUpdateCheck;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof er) || !this.a.equals(((er) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Installing(update=" + this.a + ")";
    }
}
