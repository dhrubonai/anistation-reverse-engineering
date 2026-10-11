package defpackage;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ww {
    public static final Object p = new Object();
    public static ScheduledExecutorService q;
    public static int r;
    public final AudioTrack a;
    public final rv b;
    public final i75 c;
    public zp2 d;
    public final ax e;
    public final boolean f;
    public final int g;
    public final dn0 h;
    public final ui3 i = new ui3(Thread.currentThread());
    public boolean j;
    public long k;
    public long l;
    public long m;
    public int n;
    public int o;

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, zp2] */
    public ww(AudioTrack audioTrack, rv rvVar, i75 i75Var, f46 f46Var) {
        int i;
        this.a = audioTrack;
        this.b = rvVar;
        this.c = i75Var;
        int i2 = rvVar.a;
        boolean N = eq6.N(i2);
        this.f = N;
        if (N) {
            i = eq6.v(i2) * Integer.bitCount(rvVar.c);
            this.g = i;
        } else {
            i = -1;
            this.g = -1;
        }
        this.e = new ax(new cn7(this), f46Var, audioTrack, rvVar.a, i, rvVar.f);
        if (i75Var != null) {
            final ?? obj = new Object();
            obj.x = audioTrack;
            obj.y = i75Var;
            Handler p2 = eq6.p(null);
            obj.z = p2;
            AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: sw
                @Override // android.media.AudioRouting.OnRoutingChangedListener
                public final void onRoutingChanged(AudioRouting audioRouting) {
                    zp2 zp2Var = zp2.this;
                    if (((sw) zp2Var.A) == null) {
                        return;
                    }
                    zz.F().execute(new gb(zp2Var, audioRouting, (byte) 4));
                }
            };
            obj.A = onRoutingChangedListener;
            audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, p2);
            this.d = obj;
        }
        this.h = audioTrack.isOffloadedPlayback() ? new dn0(this) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a() {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww.a():long");
    }

    public final long b() {
        if (this.f) {
            long j = this.k;
            long j2 = this.g;
            String str = eq6.a;
            return ((j + j2) - 1) / j2;
        }
        return this.l;
    }

    public final boolean c(ByteBuffer byteBuffer, int i, long j) {
        int write;
        i75 i75Var;
        yw ywVar;
        ak6 ak6Var;
        boolean z;
        long j2 = j;
        rv rvVar = this.b;
        boolean z2 = this.f;
        if (!z2 && this.n == 0) {
            this.n = l71.i(rvVar.a, byteBuffer);
        }
        ui3 ui3Var = this.i;
        ui3Var.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = (Thread) ui3Var.c;
        AudioTrack audioTrack = this.a;
        boolean z3 = false;
        if (currentThread == thread) {
            b();
            int underrunCount = audioTrack.getUnderrunCount();
            if (underrunCount > this.o) {
                z = true;
            } else {
                z = false;
            }
            this.o = underrunCount;
            if (z) {
                ui3Var.g(-1, new ze0((byte) 9));
            }
        }
        int remaining = byteBuffer.remaining();
        if (rvVar.d) {
            if (j2 == Long.MIN_VALUE) {
                j2 = this.m;
            } else {
                this.m = j2;
            }
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1, 1000 * j2);
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if (write == -6 || write == -32) {
                z3 = true;
            }
            if (z3 && (i75Var = this.c) != null && (ak6Var = (ywVar = (yw) i75Var.y).h) != null) {
                vu vuVar = vu.f;
                ywVar.g = vuVar;
                ak6Var.d(vuVar);
            }
            throw new lv(write, z3);
        }
        if (write == remaining) {
            z3 = true;
        }
        if (z2) {
            this.k += write;
            return z3;
        }
        if (z3) {
            this.l = (this.n * i) + this.l;
        }
        return z3;
    }
}
