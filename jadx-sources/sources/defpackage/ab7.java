package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ab7 implements zd4 {
    public final long A;
    public final long B;
    public final uh2 x;
    public final short y;
    public final kp z;

    /* JADX WARN: Multi-variable type inference failed */
    public ab7(uh2 uh2Var, int i, kp kpVar, long j, long j2) {
        this.x = uh2Var;
        this.y = i;
        this.z = kpVar;
        this.A = j;
        this.B = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.mw0 a(defpackage.wa7 r4, defpackage.r30 r5, int r6) {
        /*
            jv7 r5 = r5.x
            r0 = 0
            if (r5 != 0) goto L7
            r5 = r0
            goto L9
        L7:
            mw0 r5 = r5.A
        L9:
            if (r5 == 0) goto L35
            boolean r1 = r5.y
            if (r1 == 0) goto L35
            int[] r1 = r5.A
            r2 = 0
            if (r1 != 0) goto L24
            int[] r1 = r5.C
            if (r1 != 0) goto L19
            goto L2b
        L19:
            int r3 = r1.length
            if (r2 >= r3) goto L2b
            r3 = r1[r2]
            if (r3 != r6) goto L21
            goto L35
        L21:
            int r2 = r2 + 1
            goto L19
        L24:
            int r3 = r1.length
            if (r2 >= r3) goto L35
            r3 = r1[r2]
            if (r3 != r6) goto L32
        L2b:
            int r4 = r4.p
            int r6 = r5.B
            if (r4 >= r6) goto L35
            return r5
        L32:
            int r2 = r2 + 1
            goto L24
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab7.a(wa7, r30, int):mw0");
    }

    @Override // defpackage.zd4
    public final void onComplete(Task task) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        uh2 uh2Var = this.x;
        if (uh2Var.e()) {
            j75 j75Var = (j75) i75.n().y;
            if (j75Var == null || j75Var.y) {
                wa7 wa7Var = (wa7) uh2Var.G.get(this.z);
                if (wa7Var != null) {
                    nh2 nh2Var = wa7Var.f;
                    if (nh2Var instanceof r30) {
                        nh2 nh2Var2 = nh2Var;
                        long j3 = this.A;
                        boolean z2 = true;
                        int i6 = 0;
                        if (j3 > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        short s = nh2Var2.r;
                        if (j75Var != null) {
                            z &= j75Var.z;
                            i = j75Var.A;
                            i3 = j75Var.B;
                            i2 = j75Var.x;
                            if (nh2Var2.x != null && !nh2Var2.r()) {
                                mw0 a = a(wa7Var, nh2Var2, this.y);
                                if (a != null) {
                                    if (!a.z || j3 <= 0) {
                                        z2 = false;
                                    }
                                    i3 = a.B;
                                    z = z2;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_DURATION;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i7 = i;
                        int i8 = -1;
                        if (task.d()) {
                            i5 = 0;
                        } else if (((v78) task).d) {
                            i6 = -1;
                            i5 = 100;
                        } else {
                            Exception b = task.b();
                            if (b instanceof bp) {
                                Status status = ((bp) b).x;
                                i4 = status.x;
                                hw0 hw0Var = status.A;
                                if (hw0Var != null) {
                                    i5 = i4;
                                    i6 = hw0Var.y;
                                }
                            } else {
                                i4 = 101;
                            }
                            i5 = i4;
                            i6 = -1;
                        }
                        if (z) {
                            long j4 = this.B;
                            long currentTimeMillis = System.currentTimeMillis();
                            i8 = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = currentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        bb7 bb7Var = new bb7(new ny3(this.y, i5, i6, j, j2, null, null, s, i8), i2, i7, i3);
                        h15 h15Var = uh2Var.J;
                        h15Var.sendMessage(h15Var.obtainMessage(18, bb7Var));
                    }
                }
            }
        }
    }
}
