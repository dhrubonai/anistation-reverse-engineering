package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.d;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.anistation.android.R;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a58 {
    public static final zk3 v = new zk3("MediaSessionManager", null);
    public final Context a;
    public final di0 b;
    public final dn7 c;
    public final pk5 d;
    public final ob4 e;
    public final ComponentName f;
    public final ComponentName g;
    public final kz h;
    public final kz i;
    public final jy7 j;
    public final h15 k;
    public final la l;
    public final k27 m;
    public s25 n;
    public CastDevice o;
    public st3 p;
    public boolean q;
    public PlaybackStateCompat.CustomAction r;
    public PlaybackStateCompat.CustomAction s;
    public PlaybackStateCompat.CustomAction t;
    public PlaybackStateCompat.CustomAction u;

    public a58(Context context, di0 di0Var, dn7 dn7Var) {
        pk5 pk5Var;
        ob4 ob4Var;
        String str;
        ComponentName componentName;
        String str2;
        ComponentName componentName2;
        ob4 ob4Var2;
        int size;
        this.a = context;
        this.b = di0Var;
        this.c = dn7Var;
        zk3 zk3Var = xh0.k;
        a34.s();
        xh0 xh0Var = xh0.m;
        jy7 jy7Var = null;
        if (xh0Var != null) {
            a34.s();
            pk5Var = xh0Var.c;
        } else {
            pk5Var = null;
        }
        this.d = pk5Var;
        zh0 zh0Var = di0Var.C;
        if (zh0Var == null) {
            ob4Var = null;
        } else {
            ob4Var = zh0Var.A;
        }
        this.e = ob4Var;
        this.m = new k27(this, (byte) 3);
        if (zh0Var == null) {
            str = null;
        } else {
            str = zh0Var.y;
        }
        if (!TextUtils.isEmpty(str)) {
            componentName = new ComponentName(context, str);
        } else {
            componentName = null;
        }
        this.f = componentName;
        if (zh0Var == null) {
            str2 = null;
        } else {
            str2 = zh0Var.x;
        }
        if (!TextUtils.isEmpty(str2)) {
            componentName2 = new ComponentName(context, str2);
        } else {
            componentName2 = null;
        }
        this.g = componentName2;
        kz kzVar = new kz(context);
        this.h = kzVar;
        kzVar.B = new ub7(this, (byte) 6);
        kz kzVar2 = new kz(context);
        this.i = kzVar2;
        kzVar2.B = new uw7(this);
        this.k = new h15(Looper.getMainLooper(), (byte) 4);
        zk3 zk3Var2 = jy7.u;
        zh0 zh0Var2 = di0Var.C;
        if (zh0Var2 != null && (ob4Var2 = zh0Var2.A) != null) {
            ep7 ep7Var = ob4Var2.c0;
            if (ep7Var != null) {
                ArrayList a = y58.a(ep7Var);
                int[] b = y58.b(ep7Var);
                if (a == null) {
                    size = 0;
                } else {
                    size = a.size();
                }
                if (a != null && !a.isEmpty()) {
                    if (a.size() > 5) {
                        Log.e(zk3Var2.a, zk3Var2.c(bb4.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                    } else if (b != null && (b.length) != 0) {
                        for (int i : b) {
                            if (i < 0 || i >= size) {
                                Log.e(zk3Var2.a, zk3Var2.c(bb4.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                                break;
                            }
                        }
                    } else {
                        Log.e(zk3Var2.a, zk3Var2.c(bb4.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                    }
                } else {
                    Log.e(zk3Var2.a, zk3Var2.c(bb4.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                }
            }
            jy7Var = new jy7(context);
        }
        this.j = jy7Var;
        this.l = new la((Object) this, (byte) 28);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [st3, java.lang.Object] */
    public final void a(s25 s25Var, CastDevice castDevice) {
        zh0 zh0Var;
        ComponentName componentName;
        Looper mainLooper;
        int i;
        di0 di0Var = this.b;
        if (di0Var == null) {
            zh0Var = null;
        } else {
            zh0Var = di0Var.C;
        }
        if (!this.q && di0Var != null && zh0Var != null && this.e != null && s25Var != null && castDevice != null && (componentName = this.g) != null) {
            this.n = s25Var;
            s25Var.p(this.m);
            this.o = castDevice;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            Context context = this.a;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
            if (zh0Var.C) {
                ?? obj = new Object();
                obj.z = new ArrayList();
                if (context != null) {
                    if (!TextUtils.isEmpty("CastMediaSession")) {
                        if (componentName == null) {
                            int i2 = s46.b;
                            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                            intent2.setPackage(context.getPackageName());
                            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent2, 0);
                            if (queryBroadcastReceivers.size() == 1) {
                                ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                                componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                            } else {
                                if (queryBroadcastReceivers.size() > 1) {
                                    Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                                }
                                componentName = null;
                            }
                            if (componentName == null) {
                                Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                            }
                        }
                        if (componentName != null && broadcast == null) {
                            Intent intent3 = new Intent("android.intent.action.MEDIA_BUTTON");
                            intent3.setComponent(componentName);
                            if (Build.VERSION.SDK_INT >= 31) {
                                i = 33554432;
                            } else {
                                i = 0;
                            }
                            broadcast = PendingIntent.getBroadcast(context, 0, intent3, i);
                        }
                        nt3 nt3Var = new nt3(context);
                        obj.x = nt3Var;
                        if (Looper.myLooper() != null) {
                            mainLooper = Looper.myLooper();
                        } else {
                            mainLooper = Looper.getMainLooper();
                        }
                        obj.I(new jt3((byte) 1), new Handler(mainLooper));
                        nt3Var.a.setMediaButtonReceiver(broadcast);
                        obj.y = new fq3(context, (st3) obj);
                        if (st3.A == 0) {
                            st3.A = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                        }
                        this.p = obj;
                        d(0, null);
                        CastDevice castDevice2 = this.o;
                        if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.A)) {
                            Bundle bundle = new Bundle();
                            String string = context.getResources().getString(R.string.cast_casting_to_device, this.o.A);
                            js jsVar = MediaMetadataCompat.z;
                            if (jsVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) jsVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                                ze0.k("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                                return;
                            } else {
                                bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                                obj.J(new MediaMetadataCompat(bundle));
                            }
                        }
                        obj.I(new v18(this), null);
                        ((nt3) obj.x).a.setActive(true);
                        Iterator it = ((ArrayList) obj.z).iterator();
                        if (!it.hasNext()) {
                            this.c.N(obj);
                        } else {
                            throw qx1.f(it);
                        }
                    } else {
                        ze0.k("tag must not be null or empty");
                        throw null;
                    }
                } else {
                    ze0.k("context must not be null");
                    throw null;
                }
            }
            this.q = true;
            b();
            return;
        }
        v.b("skip attaching media session", new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a8  */
    /* JADX WARN: Type inference failed for: r4v5, types: [fk7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [fk7, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a58.b():void");
    }

    public final void c(Bitmap bitmap, int i) {
        String str;
        st3 st3Var = this.p;
        if (st3Var == null) {
            return;
        }
        if (bitmap == null || bitmap.getWidth() <= 1 || bitmap.getHeight() <= 1) {
            bitmap = Bitmap.createBitmap(2, 2, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        Bundle bundle = (Bundle) h().y;
        if (i == 0) {
            str = "android.media.metadata.DISPLAY_ICON";
        } else {
            str = "android.media.metadata.ALBUM_ART";
        }
        js jsVar = MediaMetadataCompat.z;
        if (jsVar.containsKey(str) && ((Integer) jsVar.get(str)).intValue() != 2) {
            ze0.k(qx1.m("The ", str, " key cannot be used to put a Bitmap"));
        } else {
            bundle.putParcelable(str, bitmap);
            st3Var.J(new MediaMetadataCompat(bundle));
        }
    }

    public final void d(int i, MediaInfo mediaInfo) {
        PlaybackStateCompat a;
        RemoteCallbackList remoteCallbackList;
        st3 st3Var;
        ir3 ir3Var;
        long j;
        Bitmap bitmap;
        PendingIntent activity;
        long j2;
        ep7 ep7Var;
        long j3;
        st3 st3Var2 = this.p;
        if (st3Var2 != null) {
            Bundle bundle = new Bundle();
            d dVar = new d();
            s25 s25Var = this.n;
            if (s25Var != null && this.j != null) {
                if (s25Var.v() == 0 || s25Var.j()) {
                    j2 = 0;
                } else {
                    j2 = s25Var.a();
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                dVar.b = i;
                dVar.c = j2;
                dVar.f = elapsedRealtime;
                dVar.d = 1.0f;
                if (i == 0) {
                    a = dVar.a();
                } else {
                    ob4 ob4Var = this.e;
                    if (ob4Var != null) {
                        ep7Var = ob4Var.c0;
                    } else {
                        ep7Var = null;
                    }
                    s25 s25Var2 = this.n;
                    if (s25Var2 == null || s25Var2.j() || this.n.n()) {
                        j3 = 0;
                    } else {
                        j3 = 256;
                    }
                    if (ep7Var != null) {
                        ArrayList a2 = y58.a(ep7Var);
                        if (a2 != null) {
                            int size = a2.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj = a2.get(i2);
                                i2++;
                                ab4 ab4Var = (ab4) obj;
                                String str = ab4Var.x;
                                if (!TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) && !TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) && !TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                    f(dVar, str, ab4Var);
                                } else {
                                    j3 = e(i, bundle, str) | j3;
                                }
                            }
                        }
                    } else if (ob4Var != null) {
                        ArrayList arrayList = ob4Var.x;
                        int size2 = arrayList.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = arrayList.get(i3);
                            i3++;
                            String str2 = (String) obj2;
                            if (!TextUtils.equals(str2, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) && !TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_PREV) && !TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                f(dVar, str2, null);
                            } else {
                                j3 |= e(i, bundle, str2);
                            }
                        }
                    }
                    dVar.e = j3;
                    a = dVar.a();
                }
            } else {
                a = dVar.a();
            }
            nt3 nt3Var = (nt3) st3Var2.x;
            nt3Var.f = a;
            synchronized (nt3Var.d) {
                int beginBroadcast = nt3Var.e.beginBroadcast() - 1;
                while (true) {
                    remoteCallbackList = nt3Var.e;
                    if (beginBroadcast < 0) {
                        break;
                    }
                    try {
                        ((ht2) remoteCallbackList.getBroadcastItem(beginBroadcast)).J(a);
                    } catch (RemoteException unused) {
                    }
                    beginBroadcast--;
                }
                remoteCallbackList.finishBroadcast();
            }
            MediaSession mediaSession = nt3Var.a;
            PlaybackState playbackState = a.I;
            if (playbackState == null) {
                PlaybackState.Builder d = tn4.d();
                tn4.x(d, a.x, a.y, a.A, a.E);
                tn4.u(d, a.z);
                tn4.s(d, a.B);
                tn4.v(d, a.D);
                ArrayList arrayList2 = a.F;
                int size3 = arrayList2.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    PlaybackStateCompat.CustomAction customAction = (PlaybackStateCompat.CustomAction) obj3;
                    PlaybackState.CustomAction.Builder e = tn4.e(customAction.x, customAction.y, customAction.z);
                    tn4.w(e, customAction.A);
                    tn4.a(d, tn4.b(e));
                }
                tn4.t(d, a.G);
                un4.b(d, a.H);
                playbackState = tn4.c(d);
                a.I = playbackState;
            }
            mediaSession.setPlaybackState(playbackState);
            ob4 ob4Var2 = this.e;
            if (ob4Var2 != null && ob4Var2.d0) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            }
            if (ob4Var2 != null && ob4Var2.e0) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
            }
            if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
                ((nt3) st3Var2.x).a.setExtras(bundle);
            }
            if (i != 0) {
                if (this.n != null) {
                    ComponentName componentName = this.f;
                    if (componentName == null) {
                        activity = null;
                    } else {
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        activity = PendingIntent.getActivity(this.a, 0, intent, 201326592);
                    }
                    if (activity != null) {
                        ((nt3) st3Var2.x).a.setSessionActivity(activity);
                    }
                }
                s25 s25Var3 = this.n;
                if (s25Var3 != null && (st3Var = this.p) != null && mediaInfo != null && (ir3Var = mediaInfo.A) != null) {
                    if (s25Var3.j()) {
                        j = 0;
                    } else {
                        j = mediaInfo.B;
                    }
                    String c = ir3Var.c("com.google.android.gms.cast.metadata.TITLE");
                    String c2 = ir3Var.c("com.google.android.gms.cast.metadata.SUBTITLE");
                    fq3 h = h();
                    js jsVar = MediaMetadataCompat.z;
                    if (jsVar.containsKey("android.media.metadata.DURATION") && ((Integer) jsVar.get("android.media.metadata.DURATION")).intValue() != 0) {
                        ze0.k("The android.media.metadata.DURATION key cannot be used to put a long");
                        return;
                    }
                    ((Bundle) h.y).putLong("android.media.metadata.DURATION", j);
                    if (c != null) {
                        h.n("android.media.metadata.TITLE", c);
                        h.n("android.media.metadata.DISPLAY_TITLE", c);
                    }
                    if (c2 != null) {
                        h.n("android.media.metadata.DISPLAY_SUBTITLE", c2);
                    }
                    st3Var.J(new MediaMetadataCompat((Bundle) h.y));
                    Uri g = g(ir3Var);
                    if (g != null) {
                        this.h.G(g);
                        bitmap = null;
                    } else {
                        bitmap = null;
                        c(null, 0);
                    }
                    Uri g2 = g(ir3Var);
                    if (g2 != null) {
                        this.i.G(g2);
                        return;
                    } else {
                        c(bitmap, 3);
                        return;
                    }
                }
                return;
            }
            st3Var2.J(new MediaMetadataCompat(new Bundle()));
        }
    }

    public final long e(int i, Bundle bundle, String str) {
        long j;
        int hashCode = str.hashCode();
        if (hashCode != -945151566) {
            if (hashCode != -945080078) {
                if (hashCode == 235550565 && str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    if (i == 3) {
                        j = 514;
                        i = 3;
                    } else {
                        j = 512;
                    }
                    if (i != 2) {
                        return j;
                    }
                    return 516L;
                }
            } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                s25 s25Var = this.n;
                if (s25Var != null && s25Var.h()) {
                    bx3 e = s25Var.e();
                    a34.x(e);
                    if (!e.d(128L) && e.M == 0) {
                        Integer num = (Integer) e.U.get(e.z);
                        if (num != null && num.intValue() > 0) {
                            return 16L;
                        }
                    } else {
                        return 16L;
                    }
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                return 0L;
            }
        } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
            s25 s25Var2 = this.n;
            if (s25Var2 != null && s25Var2.h()) {
                bx3 e2 = s25Var2.e();
                a34.x(e2);
                if (!e2.d(64L) && e2.M == 0) {
                    Integer num2 = (Integer) e2.U.get(e2.z);
                    if (num2 != null && num2.intValue() < e2.N.size() - 1) {
                        return 32L;
                    }
                } else {
                    return 32L;
                }
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        return 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.support.v4.media.session.d r12, java.lang.String r13, defpackage.ab4 r14) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a58.f(android.support.v4.media.session.d, java.lang.String, ab4):void");
    }

    public final Uri g(ir3 ir3Var) {
        e37 e37Var;
        zh0 zh0Var = this.b.C;
        if (zh0Var != null) {
            zh0Var.c();
        }
        List list = ir3Var.x;
        if (list != null && !list.isEmpty()) {
            e37Var = (e37) ir3Var.x.get(0);
        } else {
            e37Var = null;
        }
        if (e37Var == null) {
            return null;
        }
        return e37Var.y;
    }

    public final fq3 h() {
        MediaMetadata metadata;
        st3 st3Var = this.p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (st3Var != null && (metadata = ((a) ((fq3) st3Var.y).y).a.getMetadata()) != null) {
            js jsVar = MediaMetadataCompat.z;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.y = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        if (mediaMetadataCompat == null) {
            return new fq3((byte) 1);
        }
        return new fq3(mediaMetadataCompat);
    }

    public final void i() {
        jy7 jy7Var = this.j;
        if (jy7Var != null) {
            v.b("Stopping media notification.", new Object[0]);
            kz kzVar = jy7Var.i;
            kzVar.H();
            kzVar.B = null;
            NotificationManager notificationManager = jy7Var.b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void j(boolean z) {
        if (this.b.D) {
            h15 h15Var = this.k;
            la laVar = this.l;
            if (laVar != null) {
                h15Var.removeCallbacks(laVar);
            }
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    h15Var.postDelayed(laVar, 1000L);
                }
            }
        }
    }

    public final void k() {
        if (!this.b.D) {
            return;
        }
        this.k.removeCallbacks(this.l);
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
        intent.setPackage(context.getPackageName());
        context.stopService(intent);
    }
}
