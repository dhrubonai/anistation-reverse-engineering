package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yw {
    public static final r26 k = mv5.e(new xw((byte) 0));
    public final Context a;
    public final nr1 b;
    public final rt3 c;
    public final i75 d;
    public ui3 e;
    public f46 f;
    public vu g;
    public ak6 h;
    public Looper i;
    public Context j;

    public yw(zp2 zp2Var) {
        i75 i75Var;
        Context context = (Context) zp2Var.x;
        this.a = context;
        rt3 rt3Var = (rt3) zp2Var.y;
        rt3Var.getClass();
        this.c = rt3Var;
        this.b = (nr1) zp2Var.z;
        this.g = (vu) zp2Var.A;
        if (context == null) {
            i75Var = null;
        } else {
            i75Var = new i75((Object) this, (byte) 7);
        }
        this.d = i75Var;
        this.f = f46.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        if (r0 != r1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ww a(defpackage.rv r9) {
        /*
            r8 = this;
            int r0 = r9.h     // Catch: java.lang.Throwable -> Lae
            int r1 = r9.i     // Catch: java.lang.Throwable -> Lae
            r2 = -1
            r3 = 34
            if (r1 == r2) goto L28
            android.content.Context r2 = r8.a
            if (r2 == 0) goto L28
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            if (r4 < r3) goto L28
            android.content.Context r0 = r8.j     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            if (r0 == 0) goto L1b
            int r0 = defpackage.m9.a(r0)     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            if (r0 == r1) goto L21
        L1b:
            android.content.Context r0 = defpackage.m9.d(r2, r1)     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            r8.j = r0     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
        L21:
            android.content.Context r0 = r8.j     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            r1 = 0
            r7 = r1
            r1 = r0
            r0 = r7
            goto L29
        L28:
            r1 = 0
        L29:
            android.media.AudioFormat$Builder r2 = new android.media.AudioFormat$Builder     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            r2.<init>()     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            int r4 = r9.b     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            android.media.AudioFormat$Builder r2 = r2.setSampleRate(r4)     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            int r4 = r9.c     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            android.media.AudioFormat$Builder r2 = r2.setChannelMask(r4)     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            int r4 = r9.a     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            android.media.AudioFormat$Builder r2 = r2.setEncoding(r4)     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            android.media.AudioFormat r2 = r2.build()     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            ru r4 = r9.g     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            boolean r5 = r9.d     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            r6 = 1
            if (r5 == 0) goto L64
            android.media.AudioAttributes$Builder r4 = new android.media.AudioAttributes$Builder     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            r4.<init>()     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            r5 = 3
            android.media.AudioAttributes$Builder r4 = r4.setContentType(r5)     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            r5 = 16
            android.media.AudioAttributes$Builder r4 = r4.setFlags(r5)     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            android.media.AudioAttributes$Builder r4 = r4.setUsage(r6)     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            android.media.AudioAttributes r4 = r4.build()     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            goto L68
        L64:
            android.media.AudioAttributes r4 = r4.b()     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
        L68:
            android.media.AudioTrack$Builder r5 = new android.media.AudioTrack$Builder     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            r5.<init>()     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            android.media.AudioTrack$Builder r4 = r5.setAudioAttributes(r4)     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            android.media.AudioTrack$Builder r2 = r4.setAudioFormat(r2)     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            android.media.AudioTrack$Builder r2 = r2.setTransferMode(r6)     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            int r4 = r9.f     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            android.media.AudioTrack$Builder r2 = r2.setBufferSizeInBytes(r4)     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            android.media.AudioTrack$Builder r0 = r2.setSessionId(r0)     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            boolean r2 = r9.e     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            r0.setOffloadedPlayback(r2)     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            if (r2 < r3) goto L91
            if (r1 == 0) goto L91
            defpackage.m9.o(r0, r1)     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
        L91:
            android.media.AudioTrack r0 = r0.build()     // Catch: java.lang.Throwable -> Lae java.lang.Throwable -> Lae
            int r1 = r0.getState()
            if (r1 != r6) goto La5
            ww r1 = new ww
            i75 r2 = r8.d
            f46 r8 = r8.f
            r1.<init>(r0, r9, r2, r8)
            return r1
        La5:
            r0.release()     // Catch: java.lang.Exception -> La8
        La8:
            pv r8 = new pv
            r8.<init>()
            throw r8
        Lae:
            r8 = move-exception
            pv r9 = new pv
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yw.a(rv):ww");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ov, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [ov, java.lang.Object] */
    public final ov b(nv nvVar) {
        e(nvVar);
        ea2 ea2Var = nvVar.a;
        ru ruVar = nvVar.b;
        kv n = this.c.n(ea2Var, ruVar);
        ?? obj = new Object();
        int i = 0;
        obj.d = 0;
        String str = ea2Var.p;
        int i2 = ea2Var.M;
        if (!Objects.equals(str, "audio/raw") ? this.g.c(ea2Var, ruVar) != null : i2 == 2) {
            i = 2;
        }
        obj.d = i;
        boolean z = n.a;
        obj.a = z;
        boolean z2 = n.b;
        obj.b = z2;
        boolean z3 = n.c;
        obj.c = z3;
        if (!z && (z2 || z3)) {
            ze0.m("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
            return null;
        }
        ?? obj2 = new Object();
        obj2.a = obj.a;
        obj2.b = obj.b;
        obj2.c = obj.c;
        obj2.d = obj.d;
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARN: Type inference failed for: r2v3, types: [qv, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rv c(defpackage.nv r24) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yw.c(nv):rv");
    }

    public final void d() {
        tu tuVar;
        aw5 aw5Var;
        ui3 ui3Var = this.e;
        if (ui3Var != null) {
            ui3Var.d();
        }
        ak6 ak6Var = this.h;
        if (ak6Var != null) {
            Context context = (Context) ak6Var.b;
            if (ak6Var.a) {
                ak6Var.i = null;
                iv.y(context).unregisterAudioDeviceCallback((wu) ak6Var.e);
                if (Build.VERSION.SDK_INT >= 32 && (tuVar = (tu) ak6Var.h) != null) {
                    Handler handler = (Handler) tuVar.z;
                    Spatializer spatializer = (Spatializer) tuVar.y;
                    if (spatializer != null && (aw5Var = (aw5) tuVar.A) != null && handler != null) {
                        spatializer.removeOnSpatializerStateChangedListener(aw5Var);
                        handler.removeCallbacksAndMessages(null);
                    }
                    ak6Var.h = null;
                }
                context.unregisterReceiver((o9) ak6Var.f);
                xu xuVar = (xu) ak6Var.g;
                if (xuVar != null) {
                    xuVar.a.unregisterContentObserver(xuVar);
                }
                ak6Var.a = false;
            }
        }
    }

    public final void e(nv nvVar) {
        Context context;
        vu b;
        AudioDeviceInfo audioDeviceInfo = nvVar.c;
        ru ruVar = nvVar.b;
        f();
        ak6 ak6Var = this.h;
        if (ak6Var == null && (context = this.a) != null) {
            ak6 ak6Var2 = new ak6(context, new h5((Object) this, (byte) 3), ruVar, audioDeviceInfo);
            this.h = ak6Var2;
            Handler handler = (Handler) ak6Var2.d;
            Context context2 = (Context) ak6Var2.b;
            if (ak6Var2.a) {
                b = (vu) ak6Var2.i;
                b.getClass();
            } else {
                ak6Var2.a = true;
                xu xuVar = (xu) ak6Var2.g;
                if (xuVar != null) {
                    xuVar.a.registerContentObserver(xuVar.b, false, xuVar);
                }
                iv.y(context2).registerAudioDeviceCallback((wu) ak6Var2.e, handler);
                if (Build.VERSION.SDK_INT >= 32 && ((tu) ak6Var2.h) == null) {
                    ak6Var2.h = new tu(context2, new p0((Object) ak6Var2, (byte) 7), Boolean.valueOf(eq6.R(context2)));
                }
                b = vu.b(context2, context2.registerReceiver((o9) ak6Var2.f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (ru) ak6Var2.k, (AudioDeviceInfo) ak6Var2.j, ak6Var2.b());
                ak6Var2.i = b;
            }
            this.g = b;
        } else if (ak6Var != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) ak6Var.j)) {
                ak6Var.j = audioDeviceInfo;
                Context context3 = (Context) ak6Var.b;
                ru ruVar2 = (ru) ak6Var.k;
                List b2 = ak6Var.b();
                o15 o15Var = vu.e;
                ak6Var.d(vu.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), ruVar2, audioDeviceInfo, b2));
            }
            ak6 ak6Var3 = this.h;
            if (!Objects.equals(ruVar, (ru) ak6Var3.k)) {
                ak6Var3.k = ruVar;
                Context context4 = (Context) ak6Var3.b;
                AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) ak6Var3.j;
                List b3 = ak6Var3.b();
                o15 o15Var2 = vu.e;
                ak6Var3.d(vu.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), ruVar, audioDeviceInfo2, b3));
            }
        }
        this.g.getClass();
    }

    public final void f() {
        boolean z;
        String name;
        if (this.a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.i;
        if (looper != null && looper != myLooper) {
            z = false;
        } else {
            z = true;
        }
        String str = "null";
        if (looper == null) {
            name = "null";
        } else {
            name = looper.getThread().getName();
        }
        if (myLooper != null) {
            str = myLooper.getThread().getName();
        }
        if (z) {
            this.i = myLooper;
        } else {
            ze0.m(ss5.f("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, str));
        }
    }
}
