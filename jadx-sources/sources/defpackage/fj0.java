package defpackage;

import android.opengl.EGLDisplay;
import android.util.SparseArray;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class fj0 implements ss6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fj0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ss6
    public final void run() {
        boolean z = false;
        boolean z2 = false;
        byte b = 1;
        switch (this.a) {
            case 0:
                ((ve2) ((dn0) this.b).y).d((we2) this.c);
                return;
            case 1:
                ((hc1) this.b).b((gc1) this.c, true);
                return;
            case 2:
                a12 a12Var = (a12) this.b;
                if (((oa1) this.c) == a12Var.B) {
                    a12Var.J++;
                    a12Var.r();
                    return;
                }
                return;
            case 3:
                h32 h32Var = (h32) this.b;
                i36 i36Var = (i36) this.c;
                if (h32Var.o == null && !Objects.equals(h32Var.z, i36Var)) {
                    i36 i36Var2 = h32Var.z;
                    if (i36Var2 != null && (i36Var == null || !i36Var2.a.equals(i36Var.a))) {
                        Executor executor = h32Var.i;
                        EGLDisplay eGLDisplay = h32Var.d;
                        if (h32Var.B != null) {
                            try {
                                try {
                                    try {
                                        oa1 oa1Var = h32Var.s;
                                        if (oa1Var != null) {
                                            oa1Var.release();
                                            h32Var.s = null;
                                        }
                                        a34.S(eGLDisplay, h32Var.e, h32Var.f, 1, 1);
                                        a34.Q(eGLDisplay, h32Var.B);
                                    } catch (ns6 e) {
                                        executor.execute(new f32(h32Var, e, b));
                                    }
                                } catch (ze2 e2) {
                                    executor.execute(new f32(h32Var, e2, z ? (byte) 1 : (byte) 0));
                                }
                                h32Var.B = null;
                            } catch (Throwable th) {
                                h32Var.B = null;
                                throw th;
                            }
                        }
                    }
                    i36 i36Var3 = h32Var.z;
                    if (i36Var3 == null || i36Var == null || i36Var3.b != i36Var.b || i36Var3.c != i36Var.c || i36Var3.d != i36Var.d) {
                        z = true;
                    }
                    h32Var.y = z;
                    h32Var.z = i36Var;
                    return;
                }
                return;
            case 4:
                jh6 jh6Var = (jh6) this.b;
                ef6 ef6Var = (ef6) this.c;
                ((ve2) jh6Var.z).c((oe2) jh6Var.y, ef6Var.a, ef6Var.b);
                return;
            case 5:
                b86 b86Var = (b86) this.b;
                we2 we2Var = (we2) this.c;
                g34 g34Var = b86Var.B;
                g34Var.getClass();
                int i = we2Var.a;
                a34.O();
                l34 l34Var = g34Var.x;
                SparseArray sparseArray = l34Var.j;
                String str = eq6.a;
                if (sparseArray.indexOfKey(i) >= 0) {
                    z2 = true;
                }
                io3.B(z2);
                k34 k34Var = (k34) sparseArray.get(i);
                k34Var.a.a(k34Var.b);
                sparseArray.remove(i);
                l34Var.b();
                return;
            default:
                ts6 ts6Var = (ts6) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                synchronized (ts6Var.e) {
                    ts6Var.g = false;
                }
                countDownLatch.countDown();
                return;
        }
    }
}
