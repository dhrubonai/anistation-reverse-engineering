package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class kv1 {
    public abstract void bind(m85 m85Var, Object obj);

    public abstract String createQuery();

    public final void insert(g85 g85Var, Object[] objArr) {
        g85Var.getClass();
        if (objArr == null) {
            return;
        }
        m85 s0 = g85Var.s0(createQuery());
        int i = 0;
        while (i < objArr.length) {
            try {
                int i2 = i + 1;
                try {
                    Object obj = objArr[i];
                    if (obj != null) {
                        bind(s0, obj);
                        s0.p0();
                        s0.reset();
                    }
                    i = i2;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            } finally {
            }
        }
        o80.r(s0, null);
    }

    public final long insertAndReturnId(g85 g85Var, Object obj) {
        g85Var.getClass();
        if (obj == null) {
            return -1L;
        }
        m85 s0 = g85Var.s0(createQuery());
        try {
            bind(s0, obj);
            s0.p0();
            o80.r(s0, null);
            return o80.v(g85Var);
        } finally {
        }
    }

    public final long[] insertAndReturnIdsArray(g85 g85Var, Collection<Object> collection) {
        long j;
        g85Var.getClass();
        if (collection == null) {
            return new long[0];
        }
        m85 s0 = g85Var.s0(createQuery());
        try {
            int size = collection.size();
            long[] jArr = new long[size];
            for (int i = 0; i < size; i++) {
                Object i0 = yo0.i0(i, collection);
                if (i0 != null) {
                    bind(s0, i0);
                    s0.p0();
                    s0.reset();
                    j = o80.v(g85Var);
                } else {
                    j = -1;
                }
                jArr[i] = j;
            }
            o80.r(s0, null);
            return jArr;
        } finally {
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(g85 g85Var, Collection<Object> collection) {
        long j;
        g85Var.getClass();
        if (collection == null) {
            return new Long[0];
        }
        m85 s0 = g85Var.s0(createQuery());
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i = 0; i < size; i++) {
                Object i0 = yo0.i0(i, collection);
                if (i0 != null) {
                    bind(s0, i0);
                    s0.p0();
                    s0.reset();
                    j = o80.v(g85Var);
                } else {
                    j = -1;
                }
                lArr[i] = Long.valueOf(j);
            }
            o80.r(s0, null);
            return lArr;
        } finally {
        }
    }

    public final List<Long> insertAndReturnIdsList(g85 g85Var, Collection<Object> collection) {
        g85Var.getClass();
        if (collection == null) {
            return nt1.x;
        }
        ai3 y = te4.y();
        m85 s0 = g85Var.s0(createQuery());
        try {
            for (Object obj : collection) {
                if (obj != null) {
                    bind(s0, obj);
                    s0.p0();
                    s0.reset();
                    y.add(Long.valueOf(o80.v(g85Var)));
                } else {
                    y.add(-1L);
                }
            }
            o80.r(s0, null);
            return te4.r(y);
        } finally {
        }
    }

    public final void insert(g85 g85Var, Object obj) {
        g85Var.getClass();
        if (obj == null) {
            return;
        }
        m85 s0 = g85Var.s0(createQuery());
        try {
            bind(s0, obj);
            s0.p0();
            o80.r(s0, null);
        } finally {
        }
    }

    public final void insert(g85 g85Var, Iterable<Object> iterable) {
        g85Var.getClass();
        if (iterable == null) {
            return;
        }
        m85 s0 = g85Var.s0(createQuery());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    bind(s0, obj);
                    s0.p0();
                    s0.reset();
                }
            }
            o80.r(s0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o80.r(s0, th);
                throw th2;
            }
        }
    }

    public final long[] insertAndReturnIdsArray(g85 g85Var, Object[] objArr) {
        long j;
        g85Var.getClass();
        if (objArr == null) {
            return new long[0];
        }
        m85 s0 = g85Var.s0(createQuery());
        try {
            int length = objArr.length;
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                if (obj != null) {
                    bind(s0, obj);
                    s0.p0();
                    s0.reset();
                    j = o80.v(g85Var);
                } else {
                    j = -1;
                }
                jArr[i] = j;
            }
            o80.r(s0, null);
            return jArr;
        } finally {
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(g85 g85Var, Object[] objArr) {
        long j;
        g85Var.getClass();
        if (objArr == null) {
            return new Long[0];
        }
        m85 s0 = g85Var.s0(createQuery());
        try {
            int length = objArr.length;
            Long[] lArr = new Long[length];
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                if (obj != null) {
                    bind(s0, obj);
                    s0.p0();
                    s0.reset();
                    j = o80.v(g85Var);
                } else {
                    j = -1;
                }
                lArr[i] = Long.valueOf(j);
            }
            o80.r(s0, null);
            return lArr;
        } finally {
        }
    }

    public final List<Long> insertAndReturnIdsList(g85 g85Var, Object[] objArr) {
        g85Var.getClass();
        if (objArr == null) {
            return nt1.x;
        }
        ai3 y = te4.y();
        m85 s0 = g85Var.s0(createQuery());
        try {
            for (Object obj : objArr) {
                if (obj != null) {
                    bind(s0, obj);
                    s0.p0();
                    s0.reset();
                    y.add(Long.valueOf(o80.v(g85Var)));
                } else {
                    y.add(-1L);
                }
            }
            o80.r(s0, null);
            return te4.r(y);
        } finally {
        }
    }
}
