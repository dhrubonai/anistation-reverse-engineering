package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class jv1 {
    public abstract void bind(m85 m85Var, Object obj);

    public abstract String createQuery();

    public final int handle(g85 g85Var, Object obj) {
        g85Var.getClass();
        if (obj == null) {
            return 0;
        }
        m85 s0 = g85Var.s0(createQuery());
        try {
            bind(s0, obj);
            s0.p0();
            o80.r(s0, null);
            return o80.y(g85Var);
        } finally {
        }
    }

    public final int handleMultiple(g85 g85Var, Object[] objArr) {
        g85Var.getClass();
        int i = 0;
        if (objArr == null) {
            return 0;
        }
        m85 s0 = g85Var.s0(createQuery());
        int i2 = 0;
        while (i2 < objArr.length) {
            try {
                int i3 = i2 + 1;
                try {
                    Object obj = objArr[i2];
                    if (obj != null) {
                        bind(s0, obj);
                        s0.p0();
                        s0.reset();
                        i += o80.y(g85Var);
                    }
                    i2 = i3;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            } finally {
            }
        }
        o80.r(s0, null);
        return i;
    }

    public final int handleMultiple(g85 g85Var, Iterable<Object> iterable) {
        g85Var.getClass();
        int i = 0;
        if (iterable == null) {
            return 0;
        }
        m85 s0 = g85Var.s0(createQuery());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    bind(s0, obj);
                    s0.p0();
                    s0.reset();
                    i += o80.y(g85Var);
                }
            }
            o80.r(s0, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o80.r(s0, th);
                throw th2;
            }
        }
    }
}
