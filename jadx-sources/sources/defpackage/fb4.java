package defpackage;

import android.app.Notification;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fb4 extends qt0 {
    public CharSequence y;

    @Override // defpackage.qt0
    public final void m(dn0 dn0Var) {
        new Notification.BigTextStyle((Notification.Builder) dn0Var.y).setBigContentTitle(null).bigText(this.y);
    }

    @Override // defpackage.qt0
    public final String u() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
