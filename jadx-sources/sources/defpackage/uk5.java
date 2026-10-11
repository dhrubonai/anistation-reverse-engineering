package defpackage;

import android.media.session.MediaSession;
import android.os.Bundle;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uk5 {
    public static final String b;
    public static final String c;
    public final vk5 a;

    static {
        cr3.a("media3.session");
        String str = eq6.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
    }

    public uk5(int i, String str, gw3 gw3Var, Bundle bundle, MediaSession.Token token) {
        this.a = new vk5(i, str, gw3Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uk5)) {
            return false;
        }
        return this.a.equals(((uk5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
