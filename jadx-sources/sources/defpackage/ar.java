package defpackage;

import com.anistation.model.update.AppUpdateCheck;
import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ar implements fr {
    public final AppUpdateCheck a;
    public final File b;

    public ar(AppUpdateCheck appUpdateCheck, File file) {
        this.a = appUpdateCheck;
        this.b = file;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ar) {
                ar arVar = (ar) obj;
                if (!this.a.equals(arVar.a) || !this.b.equals(arVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AwaitingInstallPermission(update=" + this.a + ", apkFile=" + this.b + ")";
    }
}
