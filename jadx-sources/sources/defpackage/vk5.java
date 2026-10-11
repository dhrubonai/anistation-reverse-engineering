package defpackage;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vk5 {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public final int a;
    public final String b;
    public final gw3 c;
    public final Bundle d;
    public final MediaSession.Token e;

    static {
        String str = eq6.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
        j = Integer.toString(4, 36);
        k = Integer.toString(5, 36);
        l = Integer.toString(6, 36);
        m = Integer.toString(7, 36);
        n = Integer.toString(8, 36);
        o = Integer.toString(9, 36);
        Integer.toString(10, 36);
    }

    public vk5(int i2, String str, gw3 gw3Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.a = i2;
        this.b = str;
        this.c = gw3Var;
        this.d = bundle;
        this.e = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vk5) {
            vk5 vk5Var = (vk5) obj;
            if (this.a == vk5Var.a && TextUtils.equals(this.b, vk5Var.b) && TextUtils.equals("", "") && this.c == vk5Var.c && Objects.equals(this.e, vk5Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), 0, 1011001300, 10, this.b, "", null, this.c, this.e, null);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.b + " type=0 libraryVersion=1011001300 interfaceVersion=10 service= IMediaSession=" + this.c + " extras=" + this.d + "}";
    }
}
