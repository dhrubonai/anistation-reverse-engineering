package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ou2 implements at {
    public final Context a;
    public final qr1 b;
    public final r41 c;
    public final zs d;
    public final boolean e;
    public final ScheduledExecutorService f;
    public b95 g;
    public byte h;
    public volatile byte i;

    public ou2(Context context, qr1 qr1Var, zs zsVar, r41 r41Var, boolean z) {
        boolean z2;
        if (qr1Var.d != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.B(z2);
        io3.B(qr1Var.e != -2147483647);
        this.a = context;
        this.b = qr1Var;
        this.d = zsVar;
        this.c = r41Var;
        this.e = z;
        this.f = Executors.newSingleThreadScheduledExecutor();
        this.h = (byte) 0;
    }

    @Override // defpackage.at
    public final int a(mm5 mm5Var) {
        if (this.h == 2) {
            mm5Var.x = this.i;
        }
        return this.h;
    }

    public final void b(final Bitmap bitmap, final ea2 ea2Var) {
        try {
            b95 b95Var = this.g;
            final byte b = 0;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (b95Var == null) {
                this.g = this.d.d(ea2Var);
                this.f.schedule(new Runnable(this) { // from class: nu2
                    public final /* synthetic */ ou2 y;

                    {
                        this.y = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        ea2 ea2Var2 = ea2Var;
                        Bitmap bitmap2 = bitmap;
                        ou2 ou2Var = this.y;
                        switch (b2) {
                            case 0:
                                ou2Var.b(bitmap2, ea2Var2);
                                return;
                            default:
                                ou2Var.b(bitmap2, ea2Var2);
                                return;
                        }
                    }
                }, 10L, timeUnit);
                return;
            }
            int e = b95Var.e(bitmap, new ex0(this.b.d, r6.e, 0));
            final byte b2 = 1;
            if (e != 1) {
                if (e != 2) {
                    if (e == 3) {
                        this.i = (byte) 100;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f.schedule(new Runnable(this) { // from class: nu2
                    public final /* synthetic */ ou2 y;

                    {
                        this.y = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b2;
                        ea2 ea2Var2 = ea2Var;
                        Bitmap bitmap2 = bitmap;
                        ou2 ou2Var = this.y;
                        switch (b22) {
                            case 0:
                                ou2Var.b(bitmap2, ea2Var2);
                                return;
                            default:
                                ou2Var.b(bitmap2, ea2Var2);
                                return;
                        }
                    }
                }, 10L, timeUnit);
                return;
            }
            this.i = (byte) 100;
            this.g.f();
        } catch (RuntimeException e2) {
            this.d.b(oz1.a(e2, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT));
        } catch (oz1 e3) {
            this.d.b(e3);
        }
    }

    @Override // defpackage.at
    public final rw2 e() {
        return t15.D;
    }

    @Override // defpackage.at
    public final void release() {
        this.h = (byte) 0;
        this.f.shutdownNow();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r3.equals("image/heif") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0079, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L40;
     */
    @Override // defpackage.at
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() {
        /*
            r7 = this;
            r0 = 2
            r7.h = r0
            qr1 r1 = r7.b
            long r2 = r1.d
            zs r4 = r7.d
            r4.f(r2)
            r2 = 1
            r4.c(r2)
            ar3 r1 = r1.a
            android.content.Context r3 = r7.a
            java.lang.String r3 = defpackage.yu5.f(r3, r1)
            r4 = 0
            if (r3 == 0) goto L8e
            java.lang.String r5 = defpackage.eq6.a
            int r5 = r3.hashCode()
            r6 = -1
            switch(r5) {
                case -1487656890: goto L67;
                case -1487464693: goto L5c;
                case -1487464690: goto L53;
                case -1487394660: goto L48;
                case -1487018032: goto L3d;
                case -879272239: goto L32;
                case -879258763: goto L27;
                default: goto L25;
            }
        L25:
            r0 = r6
            goto L71
        L27:
            java.lang.String r0 = "image/png"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L30
            goto L25
        L30:
            r0 = 6
            goto L71
        L32:
            java.lang.String r0 = "image/bmp"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3b
            goto L25
        L3b:
            r0 = 5
            goto L71
        L3d:
            java.lang.String r0 = "image/webp"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L46
            goto L25
        L46:
            r0 = 4
            goto L71
        L48:
            java.lang.String r0 = "image/jpeg"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L51
            goto L25
        L51:
            r0 = 3
            goto L71
        L53:
            java.lang.String r5 = "image/heif"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L71
            goto L25
        L5c:
            java.lang.String r0 = "image/heic"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L65
            goto L25
        L65:
            r0 = r2
            goto L71
        L67:
            java.lang.String r0 = "image/avif"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L70
            goto L25
        L70:
            r0 = r4
        L71:
            switch(r0) {
                case 0: goto L75;
                case 1: goto L7d;
                case 2: goto L7d;
                case 3: goto L7d;
                case 4: goto L7d;
                case 5: goto L7d;
                case 6: goto L7d;
                default: goto L74;
            }
        L74:
            goto L7c
        L75:
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 34
            if (r0 < r5) goto L7c
            goto L7d
        L7c:
            r2 = r4
        L7d:
            if (r2 != 0) goto L80
            goto L8e
        L80:
            vq3 r0 = r1.b
            r0.getClass()
            android.net.Uri r0 = r0.a
            r41 r1 = r7.c
            ii3 r0 = r1.s(r0)
            goto La4
        L8e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Attempted to load a Bitmap from unsupported MIME type: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            bj4 r0 = defpackage.bj4.d(r0)
            zv2 r0 = defpackage.wc7.v(r0)
        La4:
            i75 r1 = new i75
            r2 = 24
            r1.<init>(r7, r2)
            yc2 r2 = new yc2
            r2.<init>(r0, r1, r4)
            java.util.concurrent.ScheduledExecutorService r7 = r7.f
            r0.a(r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ou2.start():void");
    }
}
