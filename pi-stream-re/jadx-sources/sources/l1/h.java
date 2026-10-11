package l1;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.Looper;
import j1.h1;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6660a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f6661b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f6662c;

    /* renamed from: d, reason: collision with root package name */
    public final j1.c0 f6663d;

    /* renamed from: e, reason: collision with root package name */
    public final f.c0 f6664e;

    /* renamed from: f, reason: collision with root package name */
    public final g f6665f;

    /* renamed from: g, reason: collision with root package name */
    public e f6666g;

    /* renamed from: h, reason: collision with root package name */
    public i f6667h;

    /* renamed from: i, reason: collision with root package name */
    public c1.g f6668i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6669j;

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(android.content.Context r2, l1.h0 r3, c1.g r4, l1.i r5) {
        /*
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            r1.f6660a = r2
            r1.f6661b = r3
            r1.f6668i = r4
            r1.f6667h = r5
            int r3 = f1.b0.f3799a
            android.os.Looper r3 = android.os.Looper.myLooper()
            if (r3 == 0) goto L18
            goto L1c
        L18:
            android.os.Looper r3 = android.os.Looper.getMainLooper()
        L1c:
            android.os.Handler r4 = new android.os.Handler
            r5 = 0
            r4.<init>(r3, r5)
            r1.f6662c = r4
            int r3 = f1.b0.f3799a
            r0 = 23
            if (r3 < r0) goto L30
            j1.c0 r0 = new j1.c0
            r0.<init>(r1)
            goto L31
        L30:
            r0 = r5
        L31:
            r1.f6663d = r0
            r0 = 21
            if (r3 < r0) goto L3d
            f.c0 r0 = new f.c0
            r0.<init>(r1)
            goto L3e
        L3d:
            r0 = r5
        L3e:
            r1.f6664e = r0
            l1.e r0 = l1.e.f6644c
            r0 = 17
            if (r3 < r0) goto L5a
            java.lang.String r3 = f1.b0.f3801c
            java.lang.String r0 = "Amazon"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L58
            java.lang.String r0 = "Xiaomi"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L5a
        L58:
            r3 = 1
            goto L5b
        L5a:
            r3 = 0
        L5b:
            if (r3 == 0) goto L64
            java.lang.String r3 = "external_surround_sound_enabled"
            android.net.Uri r3 = android.provider.Settings.Global.getUriFor(r3)
            goto L65
        L64:
            r3 = r5
        L65:
            if (r3 == 0) goto L70
            l1.g r5 = new l1.g
            android.content.ContentResolver r2 = r2.getContentResolver()
            r5.<init>(r1, r4, r2, r3)
        L70:
            r1.f6665f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.h.<init>(android.content.Context, l1.h0, c1.g, l1.i):void");
    }

    public final void a(e eVar) {
        boolean z9;
        h1 h1Var;
        if (this.f6669j && !eVar.equals(this.f6666g)) {
            this.f6666g = eVar;
            w0 w0Var = this.f6661b.f6670a;
            if (w0Var.f6770i0 == Looper.myLooper()) {
                z9 = true;
            } else {
                z9 = false;
            }
            w7.b.u(z9);
            if (!eVar.equals(w0Var.f6788y)) {
                w0Var.f6788y = eVar;
                f.p0 p0Var = w0Var.f6783t;
                if (p0Var != null) {
                    z0 z0Var = (z0) p0Var.f3762b;
                    synchronized (z0Var.f5706a) {
                        h1Var = z0Var.H;
                    }
                    if (h1Var != null) {
                        ((y1.p) h1Var).k();
                    }
                }
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        i iVar = this.f6667h;
        i iVar2 = null;
        if (iVar == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = iVar.f6671a;
        }
        if (f1.b0.a(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        if (audioDeviceInfo != null) {
            iVar2 = new i(audioDeviceInfo);
        }
        this.f6667h = iVar2;
        a(e.c(this.f6660a, this.f6668i, iVar2));
    }
}
