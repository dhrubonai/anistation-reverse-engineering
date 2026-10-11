package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ly3 extends w30 implements Handler.Callback {
    public final nr1 Q;
    public final ky3 R;
    public final Handler S;
    public final hy3 T;
    public wc7 U;
    public boolean V;
    public boolean W;
    public long X;
    public fy3 Y;
    public long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v4, types: [hy3, q61] */
    public ly3(ky3 ky3Var, Looper looper) {
        super(5);
        Handler handler;
        nr1 nr1Var = nr1.J;
        this.R = ky3Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = eq6.a;
            handler = new Handler(looper, this);
        }
        this.S = handler;
        this.Q = nr1Var;
        this.T = new q61(1);
        this.Z = -9223372036854775807L;
    }

    @Override // defpackage.w30
    public final int D(ea2 ea2Var) {
        int i;
        if (this.Q.j(ea2Var)) {
            if (ea2Var.T == 0) {
                i = 4;
            } else {
                i = 2;
            }
            return w30.a(i, 0, 0, 0);
        }
        return w30.a(0, 0, 0, 0);
    }

    public final void H(fy3 fy3Var, ArrayList arrayList) {
        int i = 0;
        while (true) {
            ey3[] ey3VarArr = fy3Var.a;
            if (i < ey3VarArr.length) {
                ea2 a = ey3VarArr[i].a();
                if (a != null) {
                    nr1 nr1Var = this.Q;
                    if (nr1Var.j(a)) {
                        wc7 i2 = nr1Var.i(a);
                        byte[] c = ey3VarArr[i].c();
                        c.getClass();
                        hy3 hy3Var = this.T;
                        hy3Var.f();
                        hy3Var.j(c.length);
                        ByteBuffer byteBuffer = hy3Var.B;
                        String str = eq6.a;
                        byteBuffer.put(c);
                        hy3Var.k();
                        fy3 m = i2.m(hy3Var);
                        if (m != null) {
                            H(m, arrayList);
                        }
                        i++;
                    }
                }
                arrayList.add(ey3VarArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final long I(long j) {
        boolean z;
        boolean z2 = false;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        if (this.Z != -9223372036854775807L) {
            z2 = true;
        }
        io3.B(z2);
        return j - this.Z;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.R.f((fy3) message.obj);
            return true;
        }
        p65.l();
        return false;
    }

    @Override // defpackage.w30
    public final String i() {
        return "MetadataRenderer";
    }

    @Override // defpackage.w30
    public final boolean k() {
        return this.W;
    }

    @Override // defpackage.w30
    public final boolean n() {
        return true;
    }

    @Override // defpackage.w30
    public final void p() {
        this.Y = null;
        this.U = null;
        this.Z = -9223372036854775807L;
    }

    @Override // defpackage.w30
    public final void r(long j, boolean z, boolean z2) {
        this.Y = null;
        this.V = false;
        this.W = false;
    }

    @Override // defpackage.w30
    public final void w(ea2[] ea2VarArr, long j, long j2, jw3 jw3Var) {
        this.U = this.Q.i(ea2VarArr[0]);
        fy3 fy3Var = this.Y;
        if (fy3Var != null) {
            long j3 = fy3Var.b;
            long j4 = (this.Z + j3) - j2;
            if (j3 != j4) {
                fy3Var = new fy3(j4, fy3Var.a);
            }
            this.Y = fy3Var;
        }
        this.Z = j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r15 < (r1.D - 1000000)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0053, code lost:
    
        if (r10 >= (r4 - 1000000)) goto L27;
     */
    @Override // defpackage.w30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(long r15, long r17) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly3.z(long, long):void");
    }
}
