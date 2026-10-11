package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class gy7 {
    public static final i75 a;

    /* JADX WARN: Type inference failed for: r5v0, types: [dd7, java.lang.Object, qt0] */
    static {
        id7 id7Var;
        ((xc7) qc7.a).getClass();
        AtomicReference atomicReference = dd7.C;
        String str = "Phlogger";
        if (atomicReference.get() != null) {
            gd7 gd7Var = (gd7) atomicReference.get();
            id7Var = new id7("Phlogger", gd7Var.a, gd7Var.b, gd7Var.c);
        } else {
            int i = 7;
            while (true) {
                if (i >= 0) {
                    char charAt = "Phlogger".charAt(i);
                    if (charAt == '$') {
                        str = "Phlogger".replace('$', '.');
                        break;
                    } else if (charAt == '.') {
                        break;
                    } else {
                        i--;
                    }
                } else {
                    break;
                }
            }
            ?? qt0Var = new qt0(str);
            if (!dd7.z && !dd7.A) {
                if (dd7.B) {
                    gd7 gd7Var2 = id7.E;
                    qt0Var.y = new id7(str, Level.OFF, gd7Var2.b, gd7Var2.c);
                } else {
                    qt0Var.y = null;
                }
            } else {
                qt0Var.y = new hd7(str);
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = ad7.a;
            concurrentLinkedQueue.offer(qt0Var);
            id7Var = qt0Var;
            if (atomicReference.get() != null) {
                while (true) {
                    dd7 dd7Var = (dd7) concurrentLinkedQueue.poll();
                    if (dd7Var == null) {
                        break;
                    }
                    gd7 gd7Var3 = (gd7) atomicReference.get();
                    dd7Var.y = new id7((String) dd7Var.x, gd7Var3.a, gd7Var3.b, gd7Var3.c);
                }
                dd7.M();
                id7Var = qt0Var;
            }
        }
        a = new i75(id7Var, (byte) 3);
    }
}
