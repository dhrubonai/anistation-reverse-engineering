package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bw6 implements AutoCloseable {
    public final String x;
    public final kz y;

    public bw6(String str, kz kzVar) {
        this.x = str;
        this.y = kzVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        kz kzVar = this.y;
        String str = this.x;
        zp2 zp2Var = (zp2) kzVar.z;
        zp2Var.getClass();
        dc5 dc5Var = (dc5) ((ConcurrentHashMap) zp2Var.z).get(str);
        if (dc5Var != null) {
            st3 st3Var = (st3) ((kz) zp2Var.x).A;
            st3Var.getClass();
            int i = 0;
            k03[] k03VarArr = (k03[]) ((ConcurrentHashMap) st3Var.y).values().toArray(new k03[0]);
            ArrayList arrayList = new ArrayList();
            for (k03 k03Var : k03VarArr) {
                if (k03Var instanceof fc5) {
                    arrayList.add(k03Var);
                }
            }
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                fc5 fc5Var = (fc5) obj;
                fc5Var.getClass();
                synchronized (fc5Var) {
                    fc5Var.b.remove(dc5Var.b);
                }
            }
            ((ConcurrentHashMap) zp2Var.z).remove(dc5Var.b);
        }
    }
}
