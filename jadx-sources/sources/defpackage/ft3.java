package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class ft3 {
    public static final Object c = new Object();
    public static final HashMap d = new HashMap();
    public final bu3 a;
    public bt3 b;

    public ft3(Context context, String str, ei0 ei0Var, PendingIntent pendingIntent, nw2 nw2Var, nw2 nw2Var2, nw2 nw2Var3, at3 at3Var, Bundle bundle, Bundle bundle2, p60 p60Var) {
        synchronized (c) {
            HashMap hashMap = d;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, this);
            } else {
                throw new IllegalStateException("Session ID must be unique. ID=".concat(str));
            }
        }
        this.a = new bu3(this, context, str, ei0Var, pendingIntent, nw2Var, nw2Var2, nw2Var3, at3Var, bundle, bundle2, p60Var);
    }
}
