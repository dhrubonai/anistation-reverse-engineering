package defpackage;

import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import com.unity3d.ads.core.domain.WebViewScreenCapture;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ux1 extends tx1 {
    public final st3 c0;
    public final int d0;
    public final ArrayList e0;
    public final long f0;
    public final LogSessionId g0;
    public int h0;
    public long i0;

    public ux1(st3 st3Var, int i, ok2 ok2Var, zs zsVar, LogSessionId logSessionId, int i2) {
        super(2, ok2Var, zsVar);
        this.c0 = st3Var;
        this.d0 = i;
        this.g0 = logSessionId;
        this.e0 = new ArrayList();
        this.h0 = -1;
        this.i0 = -9223372036854775807L;
        this.f0 = i2 != -2147483647 ? 1000000 / i2 : -9223372036854775807L;
    }

    @Override // defpackage.tx1
    public final boolean I() {
        MediaCodec.BufferInfo bufferInfo;
        long j;
        if (this.S.d()) {
            this.R.f();
            this.T = true;
            return false;
        }
        p71 p71Var = this.S;
        if (p71Var.f(false)) {
            bufferInfo = p71Var.a;
        } else {
            bufferInfo = null;
        }
        if (bufferInfo != null) {
            long j2 = bufferInfo.presentationTimeUs;
            long j3 = j2 - this.Q;
            if (j3 >= 0) {
                ArrayList arrayList = this.e0;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((Long) arrayList.get(i)).longValue() == j2) {
                        arrayList.remove(i);
                    }
                }
                long j4 = this.i0;
                long j5 = this.f0;
                if (j5 != -9223372036854775807L && j4 != -9223372036854775807L && j3 < j4) {
                    this.S.i();
                    return true;
                }
                if (this.R.d() != this.h0 && this.R.h(j3)) {
                    this.S.j(j3, true);
                    if (j5 != -9223372036854775807L) {
                        long j6 = this.i0;
                        if (j6 == -9223372036854775807L) {
                            j = j3 + j5;
                        } else {
                            j = j6 + j5;
                        }
                        this.i0 = j;
                    }
                    return true;
                }
            }
            this.S.i();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r10.equals("SM-X900") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (android.os.Build.MODEL.startsWith("SM-F936") != false) goto L34;
     */
    @Override // defpackage.tx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(defpackage.ea2 r14) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux1.J(ea2):void");
    }

    @Override // defpackage.tx1
    public final void K(q61 q61Var) {
        long j = this.O;
        g95 g95Var = this.F;
        g95Var.getClass();
        boolean z = true;
        if ((g95Var.G() & 1) == 0 || j == -9223372036854775807L || q61Var.D - this.H < j) {
            z = false;
        }
        long j2 = q61Var.D;
        if (j2 >= this.I && !z) {
            return;
        }
        this.e0.add(Long.valueOf(j2));
    }

    @Override // defpackage.tx1
    public final ea2 M(ea2 ea2Var) {
        if (this.d0 == 3 && hp0.h(ea2Var.H)) {
            da2 a = ea2Var.a();
            a.G = hp0.h;
            return new ea2(a);
        }
        return ea2Var;
    }

    @Override // defpackage.tx1
    public final ea2 N(ea2 ea2Var) {
        hp0 hp0Var = ea2Var.H;
        if (hp0Var == null || !hp0Var.f()) {
            hp0Var = hp0.h;
        }
        if (this.d0 == 1 && hp0.h(hp0Var)) {
            hp0Var = hp0.h;
        }
        da2 a = ea2Var.a();
        a.G = hp0Var;
        return new ea2(a);
    }

    @Override // defpackage.tx1
    public final boolean Q(q61 q61Var) {
        if (!q61Var.d(4)) {
            q61Var.B.getClass();
            if (this.S == null) {
                q61Var.D -= this.Q;
            }
        }
        return false;
    }

    @Override // defpackage.w30
    public final long g(long j, long j2) {
        if (this.E == 1) {
            return 1000000L;
        }
        int i = this.h0;
        if (i == -1) {
            return 10000L;
        }
        return i * WebViewScreenCapture.CACHE_TTL_MS;
    }

    @Override // defpackage.w30
    public final String i() {
        return "ExoAssetLoaderVideoRenderer";
    }

    @Override // defpackage.tx1
    public final void L(ea2 ea2Var) {
    }
}
