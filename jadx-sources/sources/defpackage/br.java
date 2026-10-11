package defpackage;

import com.anistation.model.update.AppUpdateCheck;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class br implements fr {
    public final AppUpdateCheck a;
    public final int b;

    public br(AppUpdateCheck appUpdateCheck, int i) {
        this.a = appUpdateCheck;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof br) {
                br brVar = (br) obj;
                if (!this.a.equals(brVar.a) || this.b != brVar.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Downloading(update=" + this.a + ", progress=" + this.b + ")";
    }
}
