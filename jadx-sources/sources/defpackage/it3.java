package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class it3 extends MediaSession.Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ it3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public mt3 a() {
        mt3 mt3Var;
        jt3 jt3Var;
        synchronized (((jt3) this.b).b) {
            mt3Var = (mt3) ((jt3) this.b).c.get();
        }
        if (mt3Var != null) {
            jt3 jt3Var2 = (jt3) this.b;
            synchronized (mt3Var.d) {
                jt3Var = mt3Var.l;
            }
            if (jt3Var2 == jt3Var) {
                return mt3Var;
            }
            return null;
        }
        return null;
    }

    public nt3 b() {
        nt3 nt3Var;
        jt3 jt3Var;
        synchronized (((jt3) this.b).b) {
            nt3Var = (nt3) ((jt3) this.b).c.get();
        }
        if (nt3Var != null) {
            jt3 jt3Var2 = (jt3) this.b;
            synchronized (nt3Var.d) {
                jt3Var = nt3Var.h;
            }
            if (jt3Var2 == jt3Var) {
                return nt3Var;
            }
            return null;
        }
        return null;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        kt2 kt2Var;
        ds6 ds6Var;
        lt2 lt2Var;
        ds6 ds6Var2;
        pt3 pt3Var = null;
        IBinder asBinder = null;
        IBinder asBinder2 = null;
        pt3Var = null;
        switch (this.a) {
            case 0:
                mt3 a = a();
                if (a != null) {
                    Bundle n = eq6.n(bundle);
                    try {
                        if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                            if (resultReceiver != null) {
                                Bundle bundle2 = new Bundle();
                                qt3 qt3Var = a.c;
                                synchronized (qt3Var.x) {
                                    kt2Var = qt3Var.z;
                                }
                                if (kt2Var != null) {
                                    asBinder2 = kt2Var.asBinder();
                                }
                                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", asBinder2);
                                synchronized (qt3Var.x) {
                                    ds6Var = qt3Var.A;
                                }
                                if (ds6Var != null) {
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putParcelable("a", new ParcelImpl(ds6Var));
                                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                                }
                                resultReceiver.send(0, bundle2);
                                return;
                            }
                            return;
                        }
                        if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                            if (n != null) {
                                ((jt3) this.b).a((jq3) a34.G(n.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), jq3.CREATOR));
                                return;
                            }
                            return;
                        }
                        if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                            if (n != null) {
                                ((jt3) this.b).b((jq3) a34.G(n.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), jq3.CREATOR), n.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                                return;
                            }
                            return;
                        }
                        if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                            if (n != null) {
                                ((jt3) this.b).u((jq3) a34.G(n.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), jq3.CREATOR));
                                return;
                            }
                            return;
                        } else {
                            if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                                List list = a.h;
                                if (list != null && n != null) {
                                    int i = n.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                                    if (i >= 0 && i < list.size()) {
                                        pt3Var = (pt3) list.get(i);
                                    }
                                    if (pt3Var != null) {
                                        ((jt3) this.b).u(pt3Var.x);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            ((jt3) this.b).c(str, n, resultReceiver);
                            return;
                        }
                    } catch (BadParcelableException unused) {
                        kb0.s("MediaSessionCompat", "Could not unparcel the extra data.");
                        return;
                    }
                }
                return;
            default:
                nt3 b = b();
                if (b != null) {
                    st3.l(bundle);
                    try {
                        if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                            Bundle bundle4 = new Bundle();
                            MediaSessionCompat$Token mediaSessionCompat$Token = b.c;
                            synchronized (mediaSessionCompat$Token.x) {
                                lt2Var = mediaSessionCompat$Token.z;
                            }
                            if (lt2Var != null) {
                                asBinder = lt2Var.asBinder();
                            }
                            bundle4.putBinder("android.support.v4.media.session.EXTRA_BINDER", asBinder);
                            synchronized (mediaSessionCompat$Token.x) {
                                ds6Var2 = mediaSessionCompat$Token.A;
                            }
                            if (ds6Var2 != null) {
                                Bundle bundle5 = new Bundle();
                                bundle5.putParcelable("a", new ParcelImpl(ds6Var2));
                                bundle4.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle5);
                            }
                            resultReceiver.send(0, bundle4);
                            return;
                        }
                        if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                            return;
                        }
                        if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                            bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                            return;
                        } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                            return;
                        } else {
                            str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT");
                            return;
                        }
                    } catch (BadParcelableException unused2) {
                        Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                        return;
                    }
                }
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                jt3 jt3Var = (jt3) obj;
                if (a() != null) {
                    Bundle n = eq6.n(bundle);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            if (n != null) {
                                jt3Var.p((Uri) n.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), eq6.n(n.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                            jt3Var.q();
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            if (n != null) {
                                jt3Var.r(n.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"), eq6.n(n.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            if (n != null) {
                                jt3Var.s(n.getString("android.support.v4.media.session.action.ARGUMENT_QUERY"), eq6.n(n.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            if (n != null) {
                                jt3Var.t((Uri) n.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), eq6.n(n.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            if (n != null) {
                                n.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            if (n != null) {
                                jt3Var.C(n.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            if (n != null) {
                                jt3Var.D(n.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                            if (n != null) {
                                ay4 ay4Var = (ay4) a34.G(n.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), ay4.CREATOR);
                                eq6.n(n.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                                jt3Var.B(ay4Var);
                            }
                        } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            if (n != null) {
                                jt3Var.z(n.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                            }
                        } else {
                            jt3Var.e(str, n);
                        }
                        return;
                    } catch (BadParcelableException unused) {
                        kb0.s("MediaSessionCompat", "Could not unparcel the data.");
                        return;
                    }
                }
                return;
            default:
                jt3 jt3Var2 = (jt3) obj;
                if (b() != null) {
                    st3.l(bundle);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            st3.l(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                            if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                                bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                                st3.l(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                                bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                                st3.l(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                                st3.l(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                                bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                                bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                                bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                                st3.l(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                                bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                            } else {
                                jt3Var2.d(str);
                            }
                        }
                        return;
                    } catch (BadParcelableException unused2) {
                        Log.e("MediaSessionCompat", "Could not unparcel the data.");
                        return;
                    }
                }
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        switch (this.a) {
            case 0:
                if (a() != null) {
                    ((jt3) this.b).f();
                    return;
                }
                return;
            default:
                b();
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (a() != null && (((jt3) obj).g(intent) || super.onMediaButtonEvent(intent))) {
                    return true;
                }
                return false;
            default:
                if (b() != null && (((jt3) obj).g(intent) || super.onMediaButtonEvent(intent))) {
                    return true;
                }
                return false;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (a() != null) {
                    ((jt3) obj).h();
                    return;
                }
                return;
            default:
                if (b() != null) {
                    ((jt3) obj).h();
                    return;
                }
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (a() != null) {
                    ((jt3) obj).k();
                    return;
                }
                return;
            default:
                if (b() != null) {
                    ((jt3) obj).k();
                    return;
                }
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        switch (this.a) {
            case 0:
                if (a() != null) {
                    ((jt3) this.b).n(str, eq6.n(bundle));
                    return;
                }
                return;
            default:
                if (b() != null) {
                    st3.l(bundle);
                    return;
                }
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        switch (this.a) {
            case 0:
                if (a() != null) {
                    ((jt3) this.b).o(str, eq6.n(bundle));
                    return;
                }
                return;
            default:
                if (b() != null) {
                    st3.l(bundle);
                    return;
                }
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        switch (this.a) {
            case 0:
                if (a() != null) {
                    ((jt3) this.b).p(uri, eq6.n(bundle));
                    return;
                }
                return;
            default:
                if (b() != null) {
                    st3.l(bundle);
                    return;
                }
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        switch (this.a) {
            case 0:
                if (a() != null) {
                    ((jt3) this.b).q();
                    return;
                }
                return;
            default:
                b();
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        switch (this.a) {
            case 0:
                if (a() != null) {
                    ((jt3) this.b).r(str, eq6.n(bundle));
                    return;
                }
                return;
            default:
                if (b() != null) {
                    st3.l(bundle);
                    return;
                }
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        switch (this.a) {
            case 0:
                if (a() != null) {
                    ((jt3) this.b).s(str, eq6.n(bundle));
                    return;
                }
                return;
            default:
                if (b() != null) {
                    st3.l(bundle);
                    return;
                }
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        switch (this.a) {
            case 0:
                if (a() != null) {
                    ((jt3) this.b).t(uri, eq6.n(bundle));
                    return;
                }
                return;
            default:
                if (b() != null) {
                    st3.l(bundle);
                    return;
                }
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        switch (this.a) {
            case 0:
                if (a() != null) {
                    ((jt3) this.b).v();
                    return;
                }
                return;
            default:
                b();
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (a() != null) {
                    ((jt3) obj).w(j);
                    return;
                }
                return;
            default:
                if (b() != null) {
                    ((jt3) obj).w(j);
                    return;
                }
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        switch (this.a) {
            case 0:
                if (a() != null) {
                    ((jt3) this.b).z(f);
                    return;
                }
                return;
            default:
                b();
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0023. Please report as an issue. */
    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        ay4 ay4Var;
        ay4 d;
        float f;
        ay4 ay4Var2 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        RatingCompat ratingCompat = null;
        ay4Var2 = null;
        ay4Var2 = null;
        float f2 = 0.0f;
        switch (this.a) {
            case 0:
                if (a() != null) {
                    jt3 jt3Var = (jt3) this.b;
                    if (rating != null) {
                        int ratingStyle = rating.getRatingStyle();
                        if (rating.isRated()) {
                            switch (ratingStyle) {
                                case 1:
                                    if (rating.hasHeart()) {
                                        f2 = 1.0f;
                                    }
                                    ay4Var = new ay4(1, f2);
                                    break;
                                case 2:
                                    if (rating.isThumbUp()) {
                                        f2 = 1.0f;
                                    }
                                    ay4Var = new ay4(2, f2);
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    d = ay4.d(ratingStyle, rating.getStarRating());
                                    ay4Var2 = d;
                                    break;
                                case 6:
                                    d = ay4.c(rating.getPercentRating());
                                    ay4Var2 = d;
                                    break;
                            }
                            ay4Var2 = ay4Var;
                        } else {
                            switch (ratingStyle) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    ay4Var2 = new ay4(ratingStyle, -1.0f);
                                    break;
                            }
                        }
                        ay4Var2.getClass();
                        ay4Var2.z = rating;
                    }
                    jt3Var.A(ay4Var2);
                    return;
                }
                return;
            default:
                if (b() != null && rating != null) {
                    int b = zx4.b(rating);
                    if (zx4.e(rating)) {
                        switch (b) {
                            case 1:
                                if (zx4.d(rating)) {
                                    f2 = 1.0f;
                                }
                                ratingCompat = new RatingCompat(1, f2);
                                break;
                            case 2:
                                if (zx4.f(rating)) {
                                    f2 = 1.0f;
                                }
                                ratingCompat = new RatingCompat(2, f2);
                                break;
                            case 3:
                            case 4:
                            case 5:
                                float c = zx4.c(rating);
                                if (b != 3) {
                                    if (b != 4) {
                                        if (b != 5) {
                                            Log.e("Rating", "Invalid rating style (" + b + ") for a star rating");
                                            break;
                                        } else {
                                            f = 5.0f;
                                        }
                                    } else {
                                        f = 4.0f;
                                    }
                                } else {
                                    f = 3.0f;
                                }
                                if (c >= 0.0f && c <= f) {
                                    ratingCompat = new RatingCompat(b, c);
                                    break;
                                } else {
                                    Log.e("Rating", "Trying to set out of range star-based rating");
                                    break;
                                }
                                break;
                            case 6:
                                float a = zx4.a(rating);
                                if (a >= 0.0f && a <= 100.0f) {
                                    ratingCompat = new RatingCompat(6, a);
                                    break;
                                } else {
                                    Log.e("Rating", "Invalid percentage-based rating value");
                                    break;
                                }
                                break;
                            default:
                                return;
                        }
                    } else {
                        switch (b) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                ratingCompat = new RatingCompat(b, -1.0f);
                                break;
                        }
                    }
                    ratingCompat.getClass();
                    return;
                }
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (a() != null) {
                    ((jt3) obj).E();
                    return;
                }
                return;
            default:
                if (b() != null) {
                    ((jt3) obj).E();
                    return;
                }
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (a() != null) {
                    ((jt3) obj).H();
                    return;
                }
                return;
            default:
                if (b() != null) {
                    ((jt3) obj).H();
                    return;
                }
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        switch (this.a) {
            case 0:
                if (a() != null) {
                    ((jt3) this.b).K(j);
                    return;
                }
                return;
            default:
                b();
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        switch (this.a) {
            case 0:
                if (a() != null) {
                    ((jt3) this.b).L();
                    return;
                }
                return;
            default:
                b();
                return;
        }
    }
}
