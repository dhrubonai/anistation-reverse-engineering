package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wq3 {
    public static final wq3 d = new wq3(new Object());
    public static final String e;
    public static final String f;
    public static final String g;
    public final Uri a;
    public final String b;
    public final Bundle c;

    /* JADX WARN: Type inference failed for: r0v0, types: [st3, java.lang.Object] */
    static {
        String str = eq6.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
    }

    public wq3(st3 st3Var) {
        this.a = (Uri) st3Var.x;
        this.b = (String) st3Var.y;
        this.c = (Bundle) st3Var.z;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq3)) {
            return false;
        }
        wq3 wq3Var = (wq3) obj;
        if (Objects.equals(this.a, wq3Var.a) && Objects.equals(this.b, wq3Var.b)) {
            if (this.c == null) {
                z = true;
            } else {
                z = false;
            }
            if (wq3Var.c == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        Uri uri = this.a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        if (this.c != null) {
            i = 1;
        }
        return i3 + i;
    }
}
