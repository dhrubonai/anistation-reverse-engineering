package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class gv0 {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
