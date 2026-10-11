package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import defpackage.a34;
import defpackage.ek7;
import defpackage.gi0;
import defpackage.kk5;
import defpackage.pk5;
import defpackage.s25;
import defpackage.sf7;
import defpackage.xh0;
import defpackage.xs3;
import defpackage.zk3;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class MediaIntentReceiver extends BroadcastReceiver {
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";
    private static final String TAG = "MediaIntentReceiver";
    private static final zk3 log = new zk3(TAG, null);

    private static s25 getRemoteMediaClient(gi0 gi0Var) {
        if (gi0Var != null && gi0Var.a()) {
            a34.s();
            return gi0Var.j;
        }
        return null;
    }

    private void seek(gi0 gi0Var, long j) {
        s25 remoteMediaClient;
        if (j != 0 && (remoteMediaClient = getRemoteMediaClient(gi0Var)) != null && !remoteMediaClient.j() && !remoteMediaClient.n()) {
            xs3 xs3Var = new xs3(remoteMediaClient.a() + j);
            a34.s();
            if (!remoteMediaClient.x()) {
                s25.w();
            } else {
                s25.z(new ek7(remoteMediaClient, xs3Var, (byte) 1));
            }
        }
    }

    private void togglePlayback(gi0 gi0Var) {
        s25 remoteMediaClient = getRemoteMediaClient(gi0Var);
        if (remoteMediaClient == null) {
            return;
        }
        remoteMediaClient.q();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        log.b("onReceive action: %s", action);
        if (action != null) {
            xh0 b = xh0.b(context);
            b.getClass();
            a34.s();
            pk5 pk5Var = b.c;
            kk5 d = pk5Var.d();
            if (d != null) {
                switch (action.hashCode()) {
                    case -1699820260:
                        if (action.equals(ACTION_REWIND)) {
                            onReceiveActionRewind(d, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                            return;
                        }
                        break;
                    case -945151566:
                        if (action.equals(ACTION_SKIP_NEXT)) {
                            onReceiveActionSkipNext(d);
                            return;
                        }
                        break;
                    case -945080078:
                        if (action.equals(ACTION_SKIP_PREV)) {
                            onReceiveActionSkipPrev(d);
                            return;
                        }
                        break;
                    case -668151673:
                        if (action.equals(ACTION_STOP_CASTING)) {
                            pk5Var.b(true);
                            return;
                        }
                        break;
                    case -124479363:
                        if (action.equals(ACTION_DISCONNECT)) {
                            pk5Var.b(false);
                            return;
                        }
                        break;
                    case 235550565:
                        if (action.equals(ACTION_TOGGLE_PLAYBACK)) {
                            onReceiveActionTogglePlayback(d);
                            return;
                        }
                        break;
                    case 1362116196:
                        if (action.equals(ACTION_FORWARD)) {
                            onReceiveActionForward(d, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                            return;
                        }
                        break;
                    case 1997055314:
                        if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                            onReceiveActionMediaButton(d, intent);
                            return;
                        }
                        break;
                }
                onReceiveOtherAction(context, action, intent);
            }
        }
    }

    public void onReceiveActionForward(kk5 kk5Var, long j) {
        if (kk5Var instanceof gi0) {
            seek((gi0) kk5Var, j);
        }
    }

    public void onReceiveActionMediaButton(kk5 kk5Var, Intent intent) {
        if ((kk5Var instanceof gi0) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Bundle extras = intent.getExtras();
            a34.x(extras);
            KeyEvent keyEvent = (KeyEvent) extras.get("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                togglePlayback((gi0) kk5Var);
            }
        }
    }

    public void onReceiveActionRewind(kk5 kk5Var, long j) {
        if (kk5Var instanceof gi0) {
            seek((gi0) kk5Var, -j);
        }
    }

    public void onReceiveActionSkipNext(kk5 kk5Var) {
        s25 remoteMediaClient;
        if ((kk5Var instanceof gi0) && (remoteMediaClient = getRemoteMediaClient((gi0) kk5Var)) != null && !remoteMediaClient.n()) {
            a34.s();
            if (!remoteMediaClient.x()) {
                s25.w();
            } else {
                s25.z(new sf7(remoteMediaClient, (byte) 1, false));
            }
        }
    }

    public void onReceiveActionSkipPrev(kk5 kk5Var) {
        s25 remoteMediaClient;
        if ((kk5Var instanceof gi0) && (remoteMediaClient = getRemoteMediaClient((gi0) kk5Var)) != null && !remoteMediaClient.n()) {
            a34.s();
            if (!remoteMediaClient.x()) {
                s25.w();
            } else {
                s25.z(new sf7(remoteMediaClient, (byte) 0, false));
            }
        }
    }

    public void onReceiveActionTogglePlayback(kk5 kk5Var) {
        if (kk5Var instanceof gi0) {
            togglePlayback((gi0) kk5Var);
        }
    }

    @Deprecated
    public void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }

    public void onReceiveOtherAction(Context context, String str, Intent intent) {
    }
}
