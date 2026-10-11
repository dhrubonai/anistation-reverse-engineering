package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class gq3 extends Binder implements dt2 {
    /* JADX WARN: Type inference failed for: r0v2, types: [ct2, dt2, java.lang.Object] */
    public static dt2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (queryLocalInterface != null && (queryLocalInterface instanceof dt2)) {
            return (dt2) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.e = iBinder;
        return obj;
    }
}
