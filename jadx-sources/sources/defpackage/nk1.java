package defpackage;

import com.anistation.model.download.DownloadSettings;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nk1 {
    public final DownloadSettings a;
    public final boolean b;
    public final boolean c;

    public nk1(DownloadSettings downloadSettings, boolean z, boolean z2) {
        downloadSettings.getClass();
        this.a = downloadSettings;
        this.b = z;
        this.c = z2;
    }

    public final boolean a() {
        if (this.a.getDownloadOverWifiOnly() && !this.c) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk1)) {
            return false;
        }
        nk1 nk1Var = (nk1) obj;
        if (a34.i(this.a, nk1Var.a) && this.b == nk1Var.b && this.c == nk1Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + zo5.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadPolicyState(settings=");
        sb.append(this.a);
        sb.append(", isConnected=");
        sb.append(this.b);
        sb.append(", isUnmetered=");
        return qx1.r(sb, this.c, ")");
    }
}
