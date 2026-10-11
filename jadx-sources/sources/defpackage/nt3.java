package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nt3 implements kt3 {
    public final MediaSession a;
    public final b b;
    public final MediaSessionCompat$Token c;
    public final Object d = new Object();
    public final RemoteCallbackList e = new RemoteCallbackList();
    public PlaybackStateCompat f;
    public MediaMetadataCompat g;
    public jt3 h;

    public nt3(Context context) {
        MediaSession mediaSession = new MediaSession(context, "CastMediaSession", null);
        this.a = mediaSession;
        b bVar = new b(this);
        this.b = bVar;
        this.c = new MediaSessionCompat$Token(mediaSession.getSessionToken(), bVar);
        mediaSession.setFlags(3);
    }

    public final void a(jt3 jt3Var, Handler handler) {
        it3 it3Var;
        synchronized (this.d) {
            this.h = jt3Var;
            MediaSession mediaSession = this.a;
            fu fuVar = null;
            if (jt3Var == null) {
                it3Var = null;
            } else {
                it3Var = (it3) jt3Var.d;
            }
            mediaSession.setCallback(it3Var, handler);
            if (jt3Var != null) {
                synchronized (jt3Var.b) {
                    try {
                        jt3Var.c = new WeakReference(this);
                        fu fuVar2 = (fu) jt3Var.e;
                        if (fuVar2 != null) {
                            fuVar2.removeCallbacksAndMessages(null);
                        }
                        if (handler != null) {
                            fuVar = new fu(jt3Var, handler.getLooper(), (byte) 6);
                        }
                        jt3Var.e = fuVar;
                    } finally {
                    }
                }
            }
        }
    }
}
