package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hk1 extends Thread {
    public final boolean A;
    public final int B;
    public volatile fk1 C;
    public volatile boolean D;
    public Exception E;
    public long F = -1;
    public final il1 x;
    public final cm1 y;
    public final pk1 z;

    public hk1(il1 il1Var, cm1 cm1Var, pk1 pk1Var, boolean z, int i, fk1 fk1Var) {
        this.x = il1Var;
        this.y = cm1Var;
        this.z = pk1Var;
        this.A = z;
        this.B = i;
        this.C = fk1Var;
    }

    public final void a(boolean z) {
        if (z) {
            this.C = null;
        }
        if (!this.D) {
            this.D = true;
            this.y.cancel();
            interrupt();
        }
    }

    public final void b(float f, long j, long j2) {
        this.z.a = j2;
        this.z.b = f;
        if (j != this.F) {
            this.F = j;
            fk1 fk1Var = this.C;
            if (fk1Var != null) {
                fk1Var.obtainMessage(11, (int) (j >> 32), (int) j, this).sendToTarget();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.A) {
                this.y.remove();
            } else {
                long j = -1;
                int i = 0;
                while (!this.D) {
                    try {
                        this.y.a(this);
                        break;
                    } catch (IOException e) {
                        if (!this.D) {
                            long j2 = this.z.a;
                            if (j2 != j) {
                                i = 0;
                                j = j2;
                            }
                            int i2 = i + 1;
                            if (i2 <= this.B) {
                                Thread.sleep(Math.min(i * UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_DURATION));
                                i = i2;
                            } else {
                                throw e;
                            }
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e2) {
            this.E = e2;
        }
        fk1 fk1Var = this.C;
        if (fk1Var != null) {
            fk1Var.obtainMessage(10, this).sendToTarget();
        }
    }
}
