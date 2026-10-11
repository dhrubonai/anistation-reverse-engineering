package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kj1 implements kw3, nr3, Handler.Callback {
    public final HandlerThread C;
    public final Handler D;
    public kf6 E;
    public hf5 F;
    public or3[] G;
    public boolean H;
    public final lw3 x;
    public final lj1 y;
    public final fm0 z = new fm0((byte) 2);
    public final ArrayList A = new ArrayList();
    public final Handler B = eq6.q(new jj1(this, 0));

    public kj1(lw3 lw3Var, lj1 lj1Var) {
        this.x = lw3Var;
        this.y = lj1Var;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
        this.C = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.D = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // defpackage.nr3
    public final void a(or3 or3Var) {
        ArrayList arrayList = this.A;
        arrayList.remove(or3Var);
        if (arrayList.isEmpty()) {
            this.D.removeMessages(2);
            this.B.sendEmptyMessage(1);
        }
    }

    @Override // defpackage.kw3
    public final void b(t30 t30Var, kf6 kf6Var) {
        or3[] or3VarArr;
        if (this.E == null) {
            if (kf6Var.m(0, new jf6(), 0L).a()) {
                this.B.obtainMessage(2, new IOException()).sendToTarget();
                return;
            }
            this.E = kf6Var;
            this.G = new or3[kf6Var.h()];
            int i = 0;
            while (true) {
                or3VarArr = this.G;
                if (i >= or3VarArr.length) {
                    break;
                }
                or3 b = this.x.b(new jw3(kf6Var.l(i)), this.z, 0L);
                this.G[i] = b;
                this.A.add(b);
                i++;
            }
            for (or3 or3Var : or3VarArr) {
                or3Var.o(this, 0L);
            }
        }
    }

    @Override // defpackage.ti5
    public final void g(ui5 ui5Var) {
        or3 or3Var = (or3) ui5Var;
        if (this.A.contains(or3Var)) {
            this.D.obtainMessage(3, or3Var).sendToTarget();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        Handler handler = this.D;
        lw3 lw3Var = this.x;
        if (i != 1) {
            ArrayList arrayList = this.A;
            int i2 = 0;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    or3[] or3VarArr = this.G;
                    if (or3VarArr != null) {
                        int length = or3VarArr.length;
                        while (i2 < length) {
                            lw3Var.h(or3VarArr[i2]);
                            i2++;
                        }
                    }
                    if (lw3Var instanceof qv4) {
                        ((qv4) lw3Var).v = null;
                    }
                    ((t30) lw3Var).p(this);
                    handler.removeCallbacksAndMessages(null);
                    this.C.quit();
                    return true;
                }
                or3 or3Var = (or3) message.obj;
                if (arrayList.contains(or3Var)) {
                    pj3 pj3Var = new pj3();
                    pj3Var.a = 0L;
                    or3Var.q(new qj3(pj3Var));
                }
                return true;
            }
            try {
                if (this.G == null) {
                    lw3Var.d();
                } else {
                    while (i2 < arrayList.size()) {
                        ((or3) arrayList.get(i2)).i();
                        i2++;
                    }
                }
                handler.sendEmptyMessageDelayed(2, 100L);
                return true;
            } catch (IOException e) {
                this.B.obtainMessage(2, e).sendToTarget();
                return true;
            }
        }
        if (lw3Var instanceof qv4) {
            ((qv4) lw3Var).v = this;
        }
        ((t30) lw3Var).m(this, cp4.c, z20.a);
        handler.sendEmptyMessage(2);
        return true;
    }
}
