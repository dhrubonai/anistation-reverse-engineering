package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gm7 extends TimerTask {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ gm7(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        BasePendingResult basePendingResult;
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                km7 km7Var = (km7) obj;
                s25 s25Var = km7Var.e;
                s25Var.y(km7Var.a);
                s25Var.b.postDelayed(this, km7Var.b);
                return;
            default:
                nq3 nq3Var = (nq3) obj;
                ArrayDeque arrayDeque = (ArrayDeque) nq3Var.h;
                if (!arrayDeque.isEmpty() && ((BasePendingResult) nq3Var.k) == null && nq3Var.a != 0) {
                    s25 s25Var2 = (s25) nq3Var.c;
                    int[] d = qi0.d(arrayDeque);
                    s25Var2.getClass();
                    a34.s();
                    if (!s25Var2.x()) {
                        basePendingResult = s25.w();
                    } else {
                        od7 od7Var = new od7(s25Var2, d, (byte) 1);
                        s25.z(od7Var);
                        basePendingResult = od7Var;
                    }
                    nq3Var.k = basePendingResult;
                    basePendingResult.f(new ex7(nq3Var, (byte) 0));
                    arrayDeque.clear();
                    return;
                }
                return;
        }
    }
}
