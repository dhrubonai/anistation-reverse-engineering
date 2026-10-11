package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n94 {
    public static n94 f;
    public final Executor a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public int d;
    public boolean e;

    public n94(Context context) {
        Executor F = zz.F();
        this.a = F;
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        F.execute(new f32((Object) this, (Object) context, (byte) 19));
    }

    public static synchronized n94 a(Context context) {
        n94 n94Var;
        synchronized (n94.class) {
            n94Var = f;
            if (n94Var == null) {
                n94Var = new n94(context);
                f = n94Var;
            }
        }
        return n94Var;
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void c(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            m94 m94Var = (m94) it.next();
            if (m94Var.a.get() == null) {
                copyOnWriteArrayList.remove(m94Var);
            }
        }
        synchronized (this.c) {
            try {
                if (this.e && this.d == i) {
                    return;
                }
                this.e = true;
                this.d = i;
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    m94 m94Var2 = (m94) it2.next();
                    m94Var2.b.execute(new a92(m94Var2, (byte) 11));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
