package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v74 {
    public final sx5 a = tx5.a(x74.a);
    public final sx5 b;
    public final vy4 c;
    public final bs d;
    public final bs e;
    public o74 f;
    public int g;
    public u74 h;
    public final g44 i;
    public final g44 j;
    public final g44 k;
    public boolean l;
    public boolean m;
    public boolean n;

    public v74() {
        sx5 a = tx5.a(new s74());
        this.b = a;
        this.c = h41.d(a);
        this.d = new bs();
        this.e = new bs();
        this.i = pg4.a();
        this.j = pg4.a();
        this.k = pg4.a();
    }

    public final void a(m74 m74Var, u74 u74Var, int i) {
        g44 g44Var;
        boolean z;
        m74Var.getClass();
        if (u74Var.a == null) {
            if (i != 0) {
                if (i != 1) {
                    g44Var = this.i;
                } else {
                    g44Var = this.j;
                }
            } else {
                g44Var = this.k;
            }
            g44Var.g(u74Var);
            u74Var.a = m74Var;
            ((s74) this.c.x.getValue()).getClass();
            if (i != 0) {
                if (i != 1) {
                    z = this.n;
                } else {
                    z = this.l;
                }
            } else {
                z = this.m;
            }
            u74Var.b(z);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(u74Var);
        m74 m74Var2 = u74Var.a;
        sb.append("' is already added to dispatcher ");
        sb.append(m74Var2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        bs bsVar = this.d;
        boolean z6 = true;
        if (!bsVar.isEmpty()) {
            Iterator it = bsVar.iterator();
            while (it.hasNext()) {
                o74 o74Var = (o74) it.next();
                if (o74Var.e || o74Var.f) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        bs bsVar2 = this.e;
        if (!bsVar2.isEmpty()) {
            Iterator it2 = bsVar2.iterator();
            while (it2.hasNext()) {
                o74 o74Var2 = (o74) it2.next();
                if (o74Var2.e || o74Var2.f) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (!z && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.m != z) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.l != z2) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.n == z3) {
            z6 = false;
        }
        if (z4) {
            g44 g44Var = this.k;
            Object[] objArr = g44Var.b;
            long[] jArr = g44Var.c;
            int i = g44Var.e;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
                ((u74) objArr[i]).b(z);
                i = i2;
            }
        }
        if (z5) {
            g44 g44Var2 = this.j;
            Object[] objArr2 = g44Var2.b;
            long[] jArr2 = g44Var2.c;
            int i3 = g44Var2.e;
            while (i3 != Integer.MAX_VALUE) {
                int i4 = (int) ((jArr2[i3] >> 31) & 2147483647L);
                ((u74) objArr2[i3]).b(z2);
                i3 = i4;
            }
        }
        if (z6) {
            g44 g44Var3 = this.i;
            Object[] objArr3 = g44Var3.b;
            long[] jArr3 = g44Var3.c;
            int i5 = g44Var3.e;
            while (i5 != Integer.MAX_VALUE) {
                int i6 = (int) ((jArr3[i5] >> 31) & 2147483647L);
                ((u74) objArr3[i5]).b(z3);
                i5 = i6;
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        o74 o74Var3 = this.f;
        if (o74Var3 == null) {
            o74Var3 = c(0);
        }
        d(o74Var3);
    }

    public final o74 c(int i) {
        Object obj;
        Object obj2;
        Object obj3;
        bs bsVar = this.e;
        bs bsVar2 = this.d;
        Object obj4 = null;
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    Iterator it = bsVar2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj3 = it.next();
                            if (((o74) obj3).f) {
                                break;
                            }
                        } else {
                            obj3 = null;
                            break;
                        }
                    }
                    o74 o74Var = (o74) obj3;
                    if (o74Var == null) {
                        Iterator it2 = bsVar.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (((o74) next).f) {
                                obj4 = next;
                                break;
                            }
                        }
                        return (o74) obj4;
                    }
                    return o74Var;
                }
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = bsVar2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj2 = it3.next();
                    o74 o74Var2 = (o74) obj2;
                    if (o74Var2.e || o74Var2.f) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            o74 o74Var3 = (o74) obj2;
            if (o74Var3 == null) {
                Iterator it4 = bsVar.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    o74 o74Var4 = (o74) next2;
                    if (o74Var4.e || o74Var4.f) {
                        obj4 = next2;
                        break;
                    }
                }
                return (o74) obj4;
            }
            return o74Var3;
        }
        Iterator it5 = bsVar2.iterator();
        while (true) {
            if (it5.hasNext()) {
                obj = it5.next();
                if (((o74) obj).e) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        o74 o74Var5 = (o74) obj;
        if (o74Var5 == null) {
            Iterator it6 = bsVar.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Object next3 = it6.next();
                if (((o74) next3).e) {
                    obj4 = next3;
                    break;
                }
            }
            return (o74) obj4;
        }
        return o74Var5;
    }

    public final void d(o74 o74Var) {
        s74 s74Var;
        o74 o74Var2 = this.f;
        if (o74Var2 == null) {
            o74Var2 = c(0);
        }
        if (a34.i(o74Var2, o74Var)) {
            if (o74Var2 == null) {
                s74Var = new s74();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it = this.d.iterator();
                while (it.hasNext()) {
                    o74 o74Var3 = (o74) it.next();
                    if (o74Var3.e && !o74Var3.b.isEmpty()) {
                        arrayList.addAll(o74Var3.b);
                    }
                }
                Iterator<E> it2 = this.e.iterator();
                while (it2.hasNext()) {
                    o74 o74Var4 = (o74) it2.next();
                    if (o74Var4.e && !o74Var4.b.isEmpty()) {
                        arrayList.addAll(o74Var4.b);
                    }
                }
                t74 t74Var = o74Var2.a;
                List list = o74Var2.c;
                t74Var.getClass();
                list.getClass();
                s74Var = new s74(t74Var, arrayList, list, arrayList.size());
            }
            sx5 sx5Var = this.b;
            if (!a34.i((s74) sx5Var.getValue(), s74Var)) {
                sx5Var.l(null, s74Var);
                g44 g44Var = this.k;
                Object[] objArr = g44Var.b;
                long[] jArr = g44Var.c;
                int i = g44Var.e;
                while (i != Integer.MAX_VALUE) {
                    int i2 = (int) (2147483647L & (jArr[i] >> 31));
                    ((u74) objArr[i]).getClass();
                    i = i2;
                }
                g44 g44Var2 = this.j;
                Object[] objArr2 = g44Var2.b;
                long[] jArr2 = g44Var2.c;
                int i3 = g44Var2.e;
                while (i3 != Integer.MAX_VALUE) {
                    int i4 = (int) ((jArr2[i3] >> 31) & 2147483647L);
                    ((u74) objArr2[i3]).getClass();
                    i3 = i4;
                }
                g44 g44Var3 = this.i;
                Object[] objArr3 = g44Var3.b;
                long[] jArr3 = g44Var3.c;
                int i5 = g44Var3.e;
                while (i5 != Integer.MAX_VALUE) {
                    int i6 = (int) ((jArr3[i5] >> 31) & 2147483647L);
                    ((u74) objArr3[i5]).getClass();
                    i5 = i6;
                }
            }
        }
    }
}
