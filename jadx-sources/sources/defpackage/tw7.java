package defpackage;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tw7 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ AtomicReference y;
    public final /* synthetic */ qx7 z;

    public tw7(qx7 qx7Var, AtomicReference atomicReference, byte b) {
        this.x = b;
        switch (b) {
            case 1:
                this.y = atomicReference;
                Objects.requireNonNull(qx7Var);
                this.z = qx7Var;
                return;
            case 2:
                this.y = atomicReference;
                Objects.requireNonNull(qx7Var);
                this.z = qx7Var;
                return;
            case 3:
                this.y = atomicReference;
                Objects.requireNonNull(qx7Var);
                this.z = qx7Var;
                return;
            case 4:
                this.y = atomicReference;
                Objects.requireNonNull(qx7Var);
                this.z = qx7Var;
                return;
            default:
                this.y = atomicReference;
                Objects.requireNonNull(qx7Var);
                this.z = qx7Var;
                return;
        }
    }

    private final void a() {
        AtomicReference atomicReference = this.y;
        synchronized (atomicReference) {
            try {
                try {
                    gu7 gu7Var = (gu7) this.z.x;
                    atomicReference.set(Double.valueOf(gu7Var.A.V(gu7Var.p().R(), tq7.e0)));
                } finally {
                    this.y.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.x) {
            case 0:
                AtomicReference atomicReference = this.y;
                synchronized (atomicReference) {
                    try {
                        try {
                            gu7 gu7Var = (gu7) this.z.x;
                            atomicReference.set(Boolean.valueOf(gu7Var.A.W(gu7Var.p().R(), tq7.a0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.y;
                synchronized (atomicReference2) {
                    try {
                        try {
                            gu7 gu7Var2 = (gu7) this.z.x;
                            atomicReference2.set(gu7Var2.A.S(gu7Var2.p().R(), tq7.b0));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.y;
                synchronized (atomicReference3) {
                    try {
                        try {
                            gu7 gu7Var3 = (gu7) this.z.x;
                            atomicReference3.set(Long.valueOf(gu7Var3.A.T(gu7Var3.p().R(), tq7.c0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                AtomicReference atomicReference4 = this.y;
                synchronized (atomicReference4) {
                    try {
                        try {
                            gu7 gu7Var4 = (gu7) this.z.x;
                            atomicReference4.set(Integer.valueOf(gu7Var4.A.U(gu7Var4.p().R(), tq7.d0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 4:
                a();
                return;
            case 5:
                qx7 qx7Var = this.z;
                bt7 bt7Var = ((gu7) qx7Var.x).B;
                gu7.j(bt7Var);
                Bundle a = bt7Var.K.a();
                zz7 n = ((gu7) qx7Var.x).n();
                AtomicReference atomicReference5 = this.y;
                n.L();
                n.M();
                n.Z(new w47(n, atomicReference5, n.b0(false), a, (byte) 9));
                return;
            default:
                zz7 n2 = ((gu7) this.z.x).n();
                e18 c = e18.c(cy7.SGTM_CLIENT);
                AtomicReference atomicReference6 = this.y;
                n2.L();
                n2.M();
                n2.Z(new w47(n2, atomicReference6, n2.b0(false), c, (byte) 10));
                return;
        }
    }

    public /* synthetic */ tw7(qx7 qx7Var, AtomicReference atomicReference, byte b, boolean z) {
        this.x = b;
        this.z = qx7Var;
        this.y = atomicReference;
    }
}
