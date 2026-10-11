package defpackage;

import android.media.MediaCodecInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Range;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class h81 implements k81, ay0, xe2, ri3 {
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;

    public /* synthetic */ h81(Object obj, int i) {
        this.y = obj;
        this.x = i;
    }

    @Override // defpackage.xe2
    public void a(ye2 ye2Var, we2 we2Var, long j) {
        l34 l34Var = (l34) this.y;
        int i = this.x;
        a61.a();
        yb1 yb1Var = l34Var.o;
        yb1Var.getClass();
        hp0 hp0Var = l34Var.b;
        synchronized (yb1Var) {
            try {
                io3.B(eq6.l(yb1Var.f, i));
                xb1 xb1Var = (xb1) yb1Var.f.get(i);
                io3.B(!xb1Var.b);
                io3.A("HDR input is not supported.", !hp0.h(hp0Var));
                hp0 hp0Var2 = yb1Var.l;
                if (hp0Var2 == null) {
                    yb1Var.l = hp0Var;
                    hp0Var2 = hp0Var;
                }
                io3.A("Mixing different ColorInfos is not supported.", hp0Var2.equals(hp0Var));
                ef6 ef6Var = new ef6(we2Var, j);
                yb1Var.k.getClass();
                xb1Var.a.add(new wb1(ye2Var, ef6Var, new og5((byte) 7)));
                if (i == yb1Var.o) {
                    yb1Var.d();
                } else {
                    yb1Var.e(xb1Var);
                }
                yb1Var.e.f(new ub1(yb1Var, (byte) 0), true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ay0
    public void accept(Object obj) {
        ag3 ag3Var;
        ag3 ag3Var2;
        dt3 dt3Var = (dt3) this.y;
        int i = this.x;
        try {
            try {
                ag3Var2 = (ag3) ((ii3) obj).get();
                io3.w(ag3Var2, "LibraryResult must not be null");
            } catch (InterruptedException | ExecutionException e) {
                kb0.P("MediaSessionStub", "Library operation failed", e);
                String str = ag3.d;
                ok5 ok5Var = new ok5(-1, Bundle.EMPTY, "no error message provided");
                ag3Var = new ag3(ok5Var.a, SystemClock.elapsedRealtime(), ok5Var);
                ag3Var2 = ag3Var;
                ct3 ct3Var = dt3Var.e;
                ct3Var.getClass();
                ct3Var.d(i, ag3Var2);
            } catch (CancellationException e2) {
                kb0.P("MediaSessionStub", "Library operation cancelled", e2);
                String str2 = ag3.d;
                ok5 ok5Var2 = new ok5(1, Bundle.EMPTY, "no error message provided");
                ag3Var = new ag3(ok5Var2.a, SystemClock.elapsedRealtime(), ok5Var2);
                ag3Var2 = ag3Var;
                ct3 ct3Var2 = dt3Var.e;
                ct3Var2.getClass();
                ct3Var2.d(i, ag3Var2);
            }
            ct3 ct3Var22 = dt3Var.e;
            ct3Var22.getClass();
            ct3Var22.d(i, ag3Var2);
        } catch (RemoteException e3) {
            kb0.P("MediaSessionStub", "Failed to send result to browser " + dt3Var, e3);
        }
    }

    @Override // defpackage.k81
    public int b(MediaCodecInfo mediaCodecInfo) {
        String str = (String) this.y;
        cs csVar = zt1.a;
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        videoCapabilities.getClass();
        Range<Integer> bitrateRange = videoCapabilities.getBitrateRange();
        int i = this.x;
        return Math.abs(bitrateRange.clamp(Integer.valueOf(i)).intValue() - i);
    }

    @Override // defpackage.ri3
    public void invoke(Object obj) {
        ((io4) obj).H(((jp5) this.y).A, this.x);
    }
}
