package defpackage;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t76 {
    public final u76 a;
    public final String b;
    public boolean c;
    public m76 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public t76(u76 u76Var, String str) {
        this.a = u76Var;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = dq6.a;
        synchronized (this.a) {
            if (b()) {
                this.a.c(this);
            }
        }
    }

    public final boolean b() {
        m76 m76Var = this.d;
        if (m76Var != null && m76Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((m76) arrayList.get(size)).b) {
                m76 m76Var2 = (m76) arrayList.get(size);
                if (u76.i.isLoggable(Level.FINE)) {
                    ez5.i(m76Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(m76 m76Var, long j) {
        m76Var.getClass();
        synchronized (this.a) {
            if (this.c) {
                if (m76Var.b) {
                    if (u76.i.isLoggable(Level.FINE)) {
                        ez5.i(m76Var, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                } else {
                    if (u76.i.isLoggable(Level.FINE)) {
                        ez5.i(m76Var, this, "schedule failed (queue is shutdown)");
                    }
                    throw new RejectedExecutionException();
                }
            }
            if (d(m76Var, j, false)) {
                this.a.c(this);
            }
        }
    }

    public final boolean d(m76 m76Var, long j, boolean z) {
        String concat;
        m76Var.getClass();
        t76 t76Var = m76Var.c;
        if (t76Var != this) {
            if (t76Var == null) {
                m76Var.c = this;
            } else {
                ze0.m("task is in multiple queues");
                return false;
            }
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.e;
        int indexOf = arrayList.indexOf(m76Var);
        if (indexOf != -1) {
            if (m76Var.d <= j2) {
                if (u76.i.isLoggable(Level.FINE)) {
                    ez5.i(m76Var, this, "already scheduled");
                    return false;
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        m76Var.d = j2;
        if (u76.i.isLoggable(Level.FINE)) {
            if (z) {
                concat = "run again after ".concat(ez5.d(j2 - nanoTime));
            } else {
                concat = "scheduled after ".concat(ez5.d(j2 - nanoTime));
            }
            ez5.i(m76Var, this, concat);
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (((m76) obj).d - nanoTime > j) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, m76Var);
        if (i != 0) {
            return false;
        }
        return true;
    }

    public final void e() {
        byte[] bArr = dq6.a;
        synchronized (this.a) {
            this.c = true;
            if (b()) {
                this.a.c(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
