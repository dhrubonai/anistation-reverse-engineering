package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yd implements ub2 {
    public final /* synthetic */ byte x;
    public Object y;

    public /* synthetic */ yd(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        CancellationException cancellationException = null;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                dm4.j((dm4) obj, (em4) this.y, 0, 0);
                return pn6Var;
            case 1:
                ((sg0) this.y).cancel();
                return pn6Var;
            case 2:
                ((lj1) this.y).d();
                return pn6Var;
            case 3:
                Object obj2 = ((w05) this.y).x;
                if (obj2 != null) {
                    ((fp4) obj2).c.set(true);
                    return pn6Var;
                }
                a34.s0("listener");
                throw null;
            case 4:
                ((qg0) this.y).resumeWith(pn6Var);
                return pn6Var;
            case 5:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ar4 ar4Var = (ar4) this.y;
                if (ar4Var != null) {
                    ar4Var.z = booleanValue;
                }
                return pn6Var;
            case 6:
                Throwable th = (Throwable) obj;
                z36 z36Var = (z36) this.y;
                qg0 qg0Var = z36Var.z;
                if (qg0Var != null) {
                    qg0Var.a(th);
                }
                z36Var.z = null;
                return pn6Var;
            case 7:
                float[] fArr = ((jo3) obj).a;
                ha3 ha3Var = (ha3) this.y;
                if (ha3Var.m()) {
                    te4.B(ha3Var).i(ha3Var, fArr);
                }
                return pn6Var;
            case 8:
                ((ei1) this.y).dispose();
                return pn6Var;
            default:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    if (th2 instanceof CancellationException) {
                        cancellationException = (CancellationException) th2;
                    }
                    if (cancellationException == null) {
                        cancellationException = new CancellationException(th2.getMessage());
                    }
                    ((j43) this.y).s(cancellationException);
                }
                return pn6Var;
        }
    }

    public /* synthetic */ yd() {
        this.x = (byte) 5;
    }
}
