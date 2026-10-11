package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class su1 {
    public static final String a = xk3.f("EnqueueRunnable");

    public static final void a(c77 c77Var) {
        boolean z;
        l77 l77Var = c77Var.a;
        HashSet hashSet = new HashSet();
        hashSet.addAll(c77Var.e);
        HashSet a2 = c77.a(c77Var);
        Iterator it = hashSet.iterator();
        while (true) {
            if (it.hasNext()) {
                if (a2.contains((String) it.next())) {
                    z = true;
                    break;
                }
            } else {
                hashSet.removeAll(c77Var.e);
                z = false;
                break;
            }
        }
        if (!z) {
            l77Var.getClass();
            pv0 pv0Var = l77Var.b;
            WorkDatabase workDatabase = l77Var.c;
            workDatabase.getClass();
            workDatabase.beginTransaction();
            try {
                pv0Var.getClass();
                o80.q(workDatabase, pv0Var, c77Var);
                boolean b = b(c77Var);
                workDatabase.setTransactionSuccessful();
                if (b) {
                    wb5.b(pv0Var, workDatabase, l77Var.e);
                    return;
                }
                return;
            } finally {
                workDatabase.endTransaction();
            }
        }
        ze0.h("WorkContinuation has cycles (", c77Var, ")");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(defpackage.c77 r24) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.su1.b(c77):boolean");
    }
}
