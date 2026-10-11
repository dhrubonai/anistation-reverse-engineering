package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import defpackage.ds6;
import defpackage.lt2;
import defpackage.oi4;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {
    public WeakReference x;

    /* JADX WARN: Type inference failed for: r2v3, types: [jt2, java.lang.Object] */
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        lt2 lt2Var;
        a aVar = (a) this.x.get();
        if (aVar != null && bundle != null) {
            synchronized (aVar.b) {
                MediaSessionCompat$Token mediaSessionCompat$Token = aVar.e;
                IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                int i2 = b.f;
                if (binder == null) {
                    lt2Var = null;
                } else {
                    IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof lt2)) {
                        lt2Var = (lt2) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.e = binder;
                        lt2Var = obj;
                    }
                }
                synchronized (mediaSessionCompat$Token.x) {
                    mediaSessionCompat$Token.z = lt2Var;
                }
                MediaSessionCompat$Token mediaSessionCompat$Token2 = aVar.e;
                ds6 v = oi4.v(bundle);
                synchronized (mediaSessionCompat$Token2.x) {
                    mediaSessionCompat$Token2.A = v;
                }
                aVar.a();
            }
        }
    }
}
