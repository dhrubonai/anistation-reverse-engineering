package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cs1 {
    public static final long[] e = new long[0];
    public long a;
    public Object b;
    public Object c;
    public Object d;

    public boolean a(t6 t6Var, bz4 bz4Var, ArrayList arrayList, boolean z) {
        Iterator it = ((ConcurrentLinkedQueue) this.d).iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                return false;
            }
            ez4 ez4Var = (ez4) it.next();
            ez4Var.getClass();
            synchronized (ez4Var) {
                if (z) {
                    try {
                        if (ez4Var.g != null) {
                            z2 = true;
                        }
                        if (!z2) {
                            continue;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (ez4Var.h(t6Var, arrayList)) {
                    bz4Var.a(ez4Var);
                    return true;
                }
            }
        }
    }

    public int b(ez4 ez4Var, long j) {
        byte[] bArr = dq6.a;
        ArrayList arrayList = ez4Var.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + ez4Var.b.a.h + " was leaked. Did you forget to close a response body?";
                lm4 lm4Var = lm4.a;
                lm4.a.j(((zy4) reference).a, str);
                arrayList.remove(i);
                ez4Var.j = true;
                if (arrayList.isEmpty()) {
                    ez4Var.q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0129, code lost:
    
        if (r7 != null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.mt7 c(java.lang.String r22, defpackage.mt7 r23) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs1.c(java.lang.String, mt7):mt7");
    }
}
