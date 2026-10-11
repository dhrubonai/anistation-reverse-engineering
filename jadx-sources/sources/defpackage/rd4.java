package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class rd4 {
    public boolean b;
    public final ArrayList a = new ArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public rd4(boolean z) {
        this.b = z;
    }

    public abstract void b();

    public final void e(boolean z) {
        boolean z2;
        this.b = z;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            qd4 qd4Var = (qd4) obj;
            if (qd4Var.i && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            qd4Var.g(z2);
        }
    }

    public void a() {
    }

    public void c(lz lzVar) {
    }

    public void d(lz lzVar) {
    }
}
