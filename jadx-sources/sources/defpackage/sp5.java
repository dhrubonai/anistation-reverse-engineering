package defpackage;

import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.PowerManager;
import android.view.Surface;
import com.discord.org.webrtc.VideoFileRenderer;
import com.discord.org.webrtc.VideoFrame;
import com.discord.org.webrtc.VideoSource;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.services.ads.UnityAdsImplementation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class sp5 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ sp5(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [ew2, jw2] */
    /* JADX WARN: Type inference failed for: r9v2, types: [ew2, jw2] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Uri build;
        PowerManager.WakeLock wakeLock;
        int i = 0;
        switch (this.x) {
            case 0:
                ((up5) ((ok2) this.y).z).d.a((ns6) this.z);
                return;
            case 1:
                gw5 gw5Var = (gw5) this.y;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.z;
                int i2 = gw5.I;
                SurfaceTexture surfaceTexture2 = gw5Var.D;
                Surface surface = gw5Var.E;
                Surface surface2 = new Surface(surfaceTexture);
                gw5Var.D = surfaceTexture;
                gw5Var.E = surface2;
                Iterator it = gw5Var.x.iterator();
                while (it.hasNext()) {
                    ((py1) it.next()).x.y1(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 2:
                sn3 sn3Var = (sn3) this.y;
                my5 my5Var = (my5) this.z;
                cn7 cn7Var = (cn7) ((wz2) sn3Var.y).f;
                cn7Var.getClass();
                ol2 ol2Var = (ol2) cn7Var.x;
                io3.B(ol2Var.k);
                nw2 nw2Var = my5Var.e;
                HashSet hashSet = ol2Var.h;
                z62 listIterator = nw2Var.listIterator(0);
                while (listIterator.hasNext()) {
                    ky5 ky5Var = (ky5) listIterator.next();
                    String str = ky5Var.a;
                    ly5 ly5Var = ky5Var.c;
                    String str2 = ky5Var.b;
                    if (hashSet.contains(str) && !hashSet.contains(str2)) {
                        ?? ew2Var = new ew2(4);
                        ?? ew2Var2 = new ew2(4);
                        nw2 nw2Var2 = ol2Var.d;
                        rw2 rw2Var = ly5Var.c;
                        int size = nw2Var2.size();
                        int i3 = i;
                        while (i3 < size) {
                            Object obj = nw2Var2.get(i3);
                            i3++;
                            om2 om2Var = (om2) obj;
                            Uri uri = (Uri) om2Var.b.get(str);
                            String str3 = om2Var.a.b;
                            uri.getClass();
                            if (rw2Var.containsKey(str3)) {
                                build = (Uri) rw2Var.get(str3);
                                build.getClass();
                            } else {
                                build = ol2.b(uri, ly5Var).build();
                            }
                            if (build != null) {
                                ew2Var.c(build);
                                ew2Var2.c(uri);
                            }
                        }
                        ol2.d(ky5Var, ol2Var.e, ew2Var, ew2Var2);
                        ol2.d(ky5Var, ol2Var.f, ew2Var, ew2Var2);
                        ol2.d(ky5Var, ol2Var.g, ew2Var, ew2Var2);
                        hashSet.add(str2);
                        af2 af2Var = ol2Var.b;
                        o15 g = ew2Var.g();
                        o15 g2 = ew2Var2.g();
                        HashMap hashMap = ((b91) af2Var.y).A;
                        if (g.A == g2.A) {
                            z = true;
                        } else {
                            z = false;
                        }
                        io3.B(z);
                        for (int i4 = 0; i4 < g.A; i4++) {
                            a91 a91Var = (a91) hashMap.get(g2.get(i4));
                            a91Var.getClass();
                            Uri uri2 = (Uri) g.get(i4);
                            a91Var.a.b.put(str2, uri2);
                            HashMap hashMap2 = a91Var.b;
                            z81 z81Var = (z81) hashMap2.get(uri2);
                            if (z81Var == null) {
                                hashMap2.put(uri2, new z81(a91Var.d, uri2, str2));
                            } else {
                                z81Var.y.add(str2);
                            }
                            hashMap.put(uri2, a91Var);
                        }
                        i = 0;
                    }
                }
                ol2Var.m = my5Var.d;
                ol2Var.e(-9223372036854775807L);
                return;
            case 3:
                ((l33) ((zp2) this.y).z).r((ix5) this.z, 3);
                return;
            case 4:
                Runnable runnable = (Runnable) this.y;
                th6 th6Var = (th6) this.z;
                try {
                    runnable.run();
                    return;
                } finally {
                    th6Var.a();
                }
            case 5:
                ni6 ni6Var = (ni6) this.y;
                jw2 jw2Var = (jw2) this.z;
                ki6 ki6Var = ni6Var.e;
                o15 g3 = jw2Var.g();
                dn0 dn0Var = ni6Var.d;
                ki6Var.e(g3, (String) dn0Var.z, (String) dn0Var.A);
                return;
            case 6:
                UnityAdsImplementation.lambda$load$1((IUnityAdsLoadListener) this.y, (String) this.z);
                return;
            case 7:
                fl5 fl5Var = (fl5) this.y;
                ii3 ii3Var = (ii3) this.z;
                if (fl5Var.x instanceof x0) {
                    ii3Var.cancel(false);
                    return;
                }
                return;
            case 8:
                VideoFileRenderer.d((VideoFileRenderer) this.y, (VideoFrame) this.z);
                return;
            case 9:
                VideoFileRenderer.b((VideoFileRenderer) this.y, (CountDownLatch) this.z);
                return;
            case 10:
                ts6 ts6Var = (ts6) this.y;
                ss6 ss6Var = (ss6) this.z;
                ts6Var.getClass();
                try {
                    ss6Var.run();
                    return;
                } catch (Exception e) {
                    ts6Var.b(e);
                    return;
                }
            case 11:
                l33 l33Var = (l33) this.y;
                String str4 = (String) this.z;
                lt6 lt6Var = (lt6) l33Var.z;
                String str5 = eq6.a;
                lt6Var.d(str4);
                return;
            case 12:
                l33 l33Var2 = (l33) this.y;
                hv6 hv6Var = (hv6) this.z;
                lt6 lt6Var2 = (lt6) l33Var2.z;
                String str6 = eq6.a;
                lt6Var2.a(hv6Var);
                return;
            case 13:
                l33 l33Var3 = (l33) this.y;
                Exception exc = (Exception) this.z;
                lt6 lt6Var3 = (lt6) l33Var3.z;
                String str7 = eq6.a;
                lt6Var3.D(exc);
                return;
            case 14:
                l33 l33Var4 = (l33) this.y;
                io0 io0Var = (io0) this.z;
                lt6 lt6Var4 = (lt6) l33Var4.z;
                String str8 = eq6.a;
                lt6Var4.s(io0Var);
                return;
            case 15:
                VideoSource.c((VideoSource) this.y, (VideoFrame) this.z);
                return;
            case 16:
                y26 y26Var = (y26) this.y;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.z;
                y23 y23Var = (y23) y26Var.c;
                if (atomicBoolean.get()) {
                    new Thread(new sp5(y23Var, atomicBoolean, (byte) 17), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 17:
                y23 y23Var2 = (y23) this.y;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.z;
                synchronized (y23Var2) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) y23Var2.z) != null) {
                        wakeLock.release();
                    }
                }
                return;
            default:
                b97 b97Var = (b97) this.y;
                fg3 fg3Var = (fg3) this.z;
                if (!b97Var.z) {
                    b97Var.A = fg3Var;
                    fg3Var.a(b97Var);
                    return;
                }
                return;
        }
    }
}
