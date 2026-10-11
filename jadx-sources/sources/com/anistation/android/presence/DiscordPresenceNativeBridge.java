package com.anistation.android.presence;

import android.util.Log;
import defpackage.y45;
import defpackage.yg1;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class DiscordPresenceNativeBridge {
    public static final DiscordPresenceNativeBridge a = new Object();
    public static final boolean b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.anistation.android.presence.DiscordPresenceNativeBridge, java.lang.Object] */
    static {
        boolean z;
        try {
            System.loadLibrary("anistation_discord");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            Log.w("DiscordPresence", "Discord presence native bridge is unavailable", e);
            z = false;
        }
        b = z;
    }

    private final native void nativeClear();

    private final native void nativeRunCallbacks();

    private final native boolean nativeStart(String str);

    private final native void nativeStop();

    private final native void nativeUpdate(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, String str7, String str8);

    public final void a() {
        if (b) {
            try {
                nativeClear();
            } catch (Throwable unused) {
            }
        }
    }

    public final void b() {
        if (b) {
            try {
                nativeRunCallbacks();
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean c() {
        Object y45Var;
        if (b) {
            try {
                y45Var = Boolean.valueOf(nativeStart("1543212125684764693"));
            } catch (Throwable th) {
                y45Var = new y45(th);
            }
            Object obj = Boolean.FALSE;
            if (y45Var instanceof y45) {
                y45Var = obj;
            }
            return ((Boolean) y45Var).booleanValue();
        }
        return false;
    }

    public final void d() {
        if (b) {
            try {
                nativeStop();
            } catch (Throwable unused) {
            }
        }
    }

    public final void e(yg1 yg1Var) {
        long j;
        if (b) {
            try {
                String str = yg1Var.a;
                String str2 = yg1Var.b;
                String str3 = yg1Var.c;
                String str4 = yg1Var.d;
                String str5 = yg1Var.e;
                String str6 = yg1Var.f;
                Long l = yg1Var.g;
                long j2 = 0;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                Long l2 = yg1Var.h;
                if (l2 != null) {
                    j2 = l2.longValue();
                }
                nativeUpdate(str, str2, str3, str4, str5, str6, j, j2, yg1Var.i, yg1Var.j);
            } catch (Throwable unused) {
            }
        }
    }
}
