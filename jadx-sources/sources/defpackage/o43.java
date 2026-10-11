package defpackage;

import java.util.ArrayList;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class o43 implements ox2 {
    public static final /* synthetic */ long A;
    public static final /* synthetic */ long y;
    public static final /* synthetic */ long z;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final ha4 x;

    static {
        Unsafe unsafe = qs.a;
        z = unsafe.objectFieldOffset(o43.class.getDeclaredField("_isCompleting$volatile"));
        A = unsafe.objectFieldOffset(o43.class.getDeclaredField("_rootCause$volatile"));
        y = unsafe.objectFieldOffset(o43.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public o43(ha4 ha4Var, Throwable th) {
        this.x = ha4Var;
        this._rootCause$volatile = th;
    }

    @Override // defpackage.ox2
    public final ha4 a() {
        return this.x;
    }

    public final void b(Throwable th) {
        Throwable c = c();
        if (c == null) {
            qs.a.putObjectVolatile(this, A, th);
            return;
        }
        if (th != c) {
            Unsafe unsafe = qs.a;
            long j = y;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, th);
                return;
            }
            if (objectVolatile instanceof Throwable) {
                if (th == objectVolatile) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(objectVolatile);
                arrayList.add(th);
                unsafe.putObjectVolatile(this, j, arrayList);
                return;
            }
            if (objectVolatile instanceof ArrayList) {
                ((ArrayList) objectVolatile).add(th);
            } else {
                v71.g(objectVolatile, "State is ");
            }
        }
    }

    public final Throwable c() {
        return (Throwable) qs.a.getObjectVolatile(this, A);
    }

    public final boolean d() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (qs.a.getIntVolatile(this, z) == 1) {
            return true;
        }
        return false;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = qs.a;
        long j = y;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else if (objectVolatile instanceof ArrayList) {
            arrayList = (ArrayList) objectVolatile;
        } else {
            v71.g(objectVolatile, "State is ");
            return null;
        }
        Throwable c = c();
        if (c != null) {
            arrayList.add(0, c);
        }
        if (th != null && !th.equals(c)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j, u43.e);
        return arrayList;
    }

    @Override // defpackage.ox2
    public final boolean isActive() {
        if (c() == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + qs.a.getObjectVolatile(this, y) + ", list=" + this.x + ']';
    }
}
