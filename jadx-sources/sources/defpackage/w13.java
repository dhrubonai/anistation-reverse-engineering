package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class w13 {
    public static final AtomicReferenceFieldUpdater[] a;
    private volatile pg0 acceptHandlerReference;
    private volatile pg0 connectHandlerReference;
    private volatile pg0 readHandlerReference;
    private volatile pg0 writeHandlerReference;

    static {
        sf0 sf0Var;
        pg5.y.getClass();
        pg5[] pg5VarArr = pg5.z;
        ArrayList arrayList = new ArrayList(pg5VarArr.length);
        for (pg5 pg5Var : pg5VarArr) {
            int ordinal = pg5Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            sf0Var = v13.x;
                        } else {
                            ze0.l();
                            return;
                        }
                    } else {
                        sf0Var = u13.x;
                    }
                } else {
                    sf0Var = t13.x;
                }
            } else {
                sf0Var = s13.x;
            }
            arrayList.add(AtomicReferenceFieldUpdater.newUpdater(w13.class, pg0.class, sf0Var.getName()));
        }
        a = (AtomicReferenceFieldUpdater[]) arrayList.toArray(new AtomicReferenceFieldUpdater[0]);
    }

    public final String toString() {
        return "R " + this.readHandlerReference + " W " + this.writeHandlerReference + " C " + this.connectHandlerReference + " A " + this.acceptHandlerReference;
    }
}
