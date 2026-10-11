package com.unity3d.ads.adplayer;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import defpackage.q71;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AdTaskRemovalDetectionService extends Service {
    public static final Companion Companion = new Companion(null);
    private static final AtomicBoolean taskRemovedDuringShow = new AtomicBoolean(false);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        Companion.arm();
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        Companion.markTaskRemoved();
        stopSelf();
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final void arm() {
            AdTaskRemovalDetectionService.taskRemovedDuringShow.set(false);
        }

        public final boolean consumeTaskRemoved() {
            return AdTaskRemovalDetectionService.taskRemovedDuringShow.getAndSet(false);
        }

        public final void markTaskRemoved() {
            AdTaskRemovalDetectionService.taskRemovedDuringShow.set(true);
        }

        public final void start(Context context) {
            context.getClass();
            try {
                context.startService(new Intent(context, (Class<?>) AdTaskRemovalDetectionService.class));
            } catch (Throwable unused) {
            }
        }

        public final void stop(Context context) {
            context.getClass();
            try {
                context.stopService(new Intent(context, (Class<?>) AdTaskRemovalDetectionService.class));
            } catch (Throwable unused) {
            }
        }

        private Companion() {
        }
    }
}
