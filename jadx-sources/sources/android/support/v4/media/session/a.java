package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.ResultReceiver;
import defpackage.cq3;
import defpackage.lt2;
import defpackage.ov3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final MediaSessionCompat$Token e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, android.os.ResultReceiver] */
    public a(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        lt2 lt2Var;
        this.e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.y);
        this.a = mediaController;
        synchronized (mediaSessionCompat$Token.x) {
            lt2Var = mediaSessionCompat$Token.z;
        }
        if (lt2Var == null) {
            ?? resultReceiver = new ResultReceiver(null);
            resultReceiver.x = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, resultReceiver);
        }
    }

    public final void a() {
        lt2 lt2Var;
        ArrayList arrayList = this.c;
        MediaSessionCompat$Token mediaSessionCompat$Token = this.e;
        synchronized (mediaSessionCompat$Token.x) {
            lt2Var = mediaSessionCompat$Token.z;
        }
        if (lt2Var == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
        } else if (it.next() != null) {
            ov3.d();
        } else {
            this.d.put(null, new cq3());
            throw null;
        }
    }
}
