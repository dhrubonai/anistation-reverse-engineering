package defpackage;

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hb4 extends qt0 {
    public int[] y;
    public MediaSessionCompat$Token z;

    @Override // defpackage.qt0
    public final void m(dn0 dn0Var) {
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) dn0Var.y;
        if (i >= 34) {
            db4.d(builder, db4.b(eb4.a(db4.a(), null, 0, null, Boolean.FALSE), this.y, this.z));
        } else {
            db4.d(builder, db4.b(db4.a(), this.y, this.z));
        }
    }
}
