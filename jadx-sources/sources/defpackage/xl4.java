package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class xl4 {
    public final ArrayList a;
    public int b;
    public boolean c;
    public ni1 d;
    private volatile /* synthetic */ Object interceptors$delegate;

    public xl4(ni1... ni1VarArr) {
        h98.b();
        this.a = te4.J(Arrays.copyOf(ni1VarArr, ni1VarArr.length));
        this.interceptors$delegate = null;
    }

    public final Object a(Object obj, Object obj2, xz0 xz0Var) {
        yl4 y51Var;
        rl4 rl4Var;
        int size;
        rl4 rl4Var2;
        l11 context = xz0Var.getContext();
        if (((List) this.interceptors$delegate) == null) {
            int i = this.b;
            if (i == 0) {
                this.interceptors$delegate = nt1.x;
                this.c = false;
                this.d = null;
            } else {
                ArrayList arrayList = this.a;
                if (i == 1 && (size = arrayList.size() - 1) >= 0) {
                    int i2 = 0;
                    while (true) {
                        Object obj3 = arrayList.get(i2);
                        if (obj3 instanceof rl4) {
                            rl4Var2 = (rl4) obj3;
                        } else {
                            rl4Var2 = null;
                        }
                        if (rl4Var2 != null && !rl4Var2.c.isEmpty()) {
                            List list = rl4Var2.c;
                            rl4Var2.d = true;
                            this.interceptors$delegate = list;
                            this.c = false;
                            this.d = rl4Var2.a;
                            break;
                        }
                        if (i2 == size) {
                            break;
                        }
                        i2++;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        Object obj4 = arrayList.get(i3);
                        if (obj4 instanceof rl4) {
                            rl4Var = (rl4) obj4;
                        } else {
                            rl4Var = null;
                        }
                        if (rl4Var != null) {
                            List list2 = rl4Var.c;
                            arrayList2.ensureCapacity(list2.size() + arrayList2.size());
                            int size3 = list2.size();
                            for (int i4 = 0; i4 < size3; i4++) {
                                arrayList2.add(list2.get(i4));
                            }
                        }
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                this.interceptors$delegate = arrayList2;
                this.c = false;
                this.d = null;
            }
        }
        this.c = true;
        List list3 = (List) this.interceptors$delegate;
        list3.getClass();
        boolean d = d();
        obj.getClass();
        obj2.getClass();
        context.getClass();
        if (!zl4.a && !d) {
            y51Var = new s36(obj2, obj, list3);
        } else {
            y51Var = new y51(obj, list3, obj2, context);
        }
        return y51Var.a(obj2, xz0Var);
    }

    public final rl4 b(ni1 ni1Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == ni1Var) {
                rl4 rl4Var = new rl4(ni1Var, cm4.i);
                arrayList.set(i, rl4Var);
                return rl4Var;
            }
            if (obj instanceof rl4) {
                rl4 rl4Var2 = (rl4) obj;
                if (rl4Var2.a == ni1Var) {
                    return rl4Var2;
                }
            }
        }
        return null;
    }

    public final int c(ni1 ni1Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == ni1Var || ((obj instanceof rl4) && ((rl4) obj).a == ni1Var)) {
                return i;
            }
        }
        return -1;
    }

    public abstract boolean d();

    public final boolean e(ni1 ni1Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj != ni1Var) {
                if ((obj instanceof rl4) && ((rl4) obj).a == ni1Var) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final void f(ni1 ni1Var, jc2 jc2Var) {
        ni1Var.getClass();
        rl4 b = b(ni1Var);
        if (b != null) {
            List list = (List) this.interceptors$delegate;
            if (!this.a.isEmpty() && list != null && !this.c && (!(list instanceof j73) || (list instanceof l73))) {
                if (a34.i(this.d, ni1Var)) {
                    list.add(jc2Var);
                } else if (ni1Var == yo0.r0(this.a) || c(ni1Var) == this.a.size() - 1) {
                    rl4 b2 = b(ni1Var);
                    b2.getClass();
                    if (b2.d) {
                        b2.c = new ArrayList(b2.c);
                        b2.d = false;
                    }
                    b2.c.add(jc2Var);
                    list.add(jc2Var);
                }
                this.b++;
                return;
            }
            if (b.d) {
                b.c = new ArrayList(b.c);
                b.d = false;
            }
            b.c.add(jc2Var);
            this.b++;
            this.interceptors$delegate = null;
            this.c = false;
            this.d = null;
            return;
        }
        throw new y0("Phase " + ni1Var + " was not registered for this pipeline", (byte) 3);
    }
}
