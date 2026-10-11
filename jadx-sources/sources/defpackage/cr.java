package defpackage;

import com.anistation.model.update.AppUpdateCheck;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cr implements fr {
    public final String a;
    public final AppUpdateCheck b;

    public cr(String str, AppUpdateCheck appUpdateCheck) {
        this.a = str;
        this.b = appUpdateCheck;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cr) {
                cr crVar = (cr) obj;
                if (!this.a.equals(crVar.a) || !a34.i(this.b, crVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        AppUpdateCheck appUpdateCheck = this.b;
        if (appUpdateCheck == null) {
            hashCode = 0;
        } else {
            hashCode = appUpdateCheck.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Error(message=" + this.a + ", update=" + this.b + ")";
    }
}
