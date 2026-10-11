package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class av3 {
    public int a;
    public int b;

    public final boolean equals(Object obj) {
        int i = this.b;
        int i2 = this.a;
        if (this != obj) {
            if (obj instanceof av3) {
                av3 av3Var = (av3) obj;
                int i3 = av3Var.b;
                int i4 = av3Var.a;
                if (i2 >= 0 && i4 >= 0) {
                    if (TextUtils.equals("android.media.session.MediaController", "android.media.session.MediaController") && i2 == i4 && i == i3) {
                        return true;
                    }
                    return false;
                }
                if (TextUtils.equals("android.media.session.MediaController", "android.media.session.MediaController") && i == i3) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash("android.media.session.MediaController", Integer.valueOf(this.b));
    }
}
