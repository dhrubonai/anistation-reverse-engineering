package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class xd2 implements Iterator, j73 {
    public final Object A;
    public final /* synthetic */ byte x;
    public int y;
    public Object z;

    public xd2(s44 s44Var) {
        this.x = (byte) 2;
        this.A = s44Var;
        this.y = -1;
        this.z = io3.V(new r44(s44Var, this, null));
    }

    public void a() {
        Object invoke;
        int i;
        int i2 = this.y;
        u22 u22Var = (u22) this.A;
        if (i2 == -2) {
            invoke = ((sb2) u22Var.b).invoke();
        } else {
            ub2 ub2Var = (ub2) u22Var.c;
            Object obj = this.z;
            obj.getClass();
            invoke = ub2Var.invoke(obj);
        }
        this.z = invoke;
        if (invoke == null) {
            i = 0;
        } else {
            i = 1;
        }
        this.y = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.x;
        Object obj = this.A;
        switch (b) {
            case 0:
                if (this.y < 0) {
                    a();
                }
                if (this.y != 1) {
                    return false;
                }
                return true;
            case 1:
                return ((ri5) this.z).hasNext();
            case 2:
                return ((ri5) this.z).hasNext();
            case 3:
                if (this.y >= ((Map) obj).size()) {
                    return false;
                }
                return true;
            default:
                s06 s06Var = (s06) obj;
                Iterator it = (Iterator) this.z;
                while (this.y < s06Var.b && it.hasNext()) {
                    it.next();
                    this.y++;
                }
                if (this.y >= s06Var.c || !it.hasNext()) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.x;
        Object obj = this.A;
        Object obj2 = null;
        switch (b) {
            case 0:
                if (this.y < 0) {
                    a();
                }
                if (this.y != 0) {
                    Object obj3 = this.z;
                    obj3.getClass();
                    this.y = -1;
                    return obj3;
                }
                qi2.e();
                return null;
            case 1:
                return ((ri5) this.z).next();
            case 2:
                return ((ri5) this.z).next();
            case 3:
                if (hasNext()) {
                    obj2 = this.z;
                    this.y++;
                    Object obj4 = ((Map) obj).get(obj2);
                    if (obj4 != null) {
                        this.z = ((xh3) obj4).b;
                    } else {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
                    }
                } else {
                    qi2.e();
                }
                return obj2;
            default:
                s06 s06Var = (s06) obj;
                Iterator it = (Iterator) this.z;
                while (this.y < s06Var.b && it.hasNext()) {
                    it.next();
                    this.y++;
                }
                int i = this.y;
                if (i < s06Var.c) {
                    this.y = i + 1;
                    return it.next();
                }
                qi2.e();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.x;
        Object obj = this.A;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i = this.y;
                if (i != -1) {
                    ((i44) obj).y.i(i);
                    this.y = -1;
                    return;
                }
                return;
            case 2:
                int i2 = this.y;
                if (i2 != -1) {
                    ((s44) obj).y.m(i2);
                    this.y = -1;
                    return;
                }
                return;
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public xd2(s06 s06Var) {
        this.x = (byte) 4;
        this.A = s06Var;
        this.z = s06Var.a.iterator();
    }

    public xd2(u22 u22Var) {
        this.x = (byte) 0;
        this.A = u22Var;
        this.y = -2;
    }

    public xd2(Object obj, Map map) {
        this.x = (byte) 3;
        this.z = obj;
        this.A = map;
    }

    public xd2(i44 i44Var) {
        this.x = (byte) 1;
        this.A = i44Var;
        this.y = -1;
        this.z = io3.V(new h44(i44Var, this, null));
    }
}
