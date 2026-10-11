package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cp4 {
    public static final cp4 c = new cp4("");
    public static final cp4 d = new cp4("preload");
    public final String a;
    public final eo3 b;

    public cp4(String str) {
        eo3 eo3Var;
        this.a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            eo3Var = new eo3((byte) 9, false);
            eo3Var.y = lr3.g();
        } else {
            eo3Var = null;
        }
        this.b = eo3Var;
    }

    public final synchronized LogSessionId a() {
        eo3 eo3Var;
        eo3Var = this.b;
        eo3Var.getClass();
        return (LogSessionId) eo3Var.y;
    }
}
