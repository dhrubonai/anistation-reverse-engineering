package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class kf7 implements Cloneable {
    public final mf7 x;
    public mf7 y;

    public kf7(mf7 mf7Var) {
        this.x = mf7Var;
        if (!mf7Var.e()) {
            this.y = mf7Var.g();
        } else {
            ze0.k("Default instance must be immutable.");
            throw null;
        }
    }

    public static void a(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String sb2 = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 >= i) {
                list.remove(size2);
            } else {
                throw new NullPointerException(sb2);
            }
        }
    }

    public static void b(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof cg7) {
            List a = ((cg7) iterable).a();
            if (list == null) {
                list.size();
                Iterator it = a.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    if (!(next instanceof we7)) {
                        if (next instanceof byte[]) {
                            byte[] bArr = (byte[]) next;
                            we7.j(bArr, 0, bArr.length);
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                return;
            }
            ov3.d();
            return;
        }
        if (!(iterable instanceof tg7)) {
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size();
                if (list instanceof ArrayList) {
                    ((ArrayList) list).ensureCapacity(list.size() + size);
                } else if (list instanceof vg7) {
                    vg7 vg7Var = (vg7) list;
                    int i = vg7Var.z + size;
                    int length = vg7Var.y.length;
                    if (i > length) {
                        if (length != 0) {
                            while (length < i) {
                                length = zo5.f(length, 3, 2, 1, 10);
                            }
                            vg7Var.y = Arrays.copyOf(vg7Var.y, length);
                        } else {
                            vg7Var.y = new Object[Math.max(i, 10)];
                        }
                    }
                }
            }
            int size2 = list.size();
            if ((iterable instanceof List) && (iterable instanceof RandomAccess)) {
                List list2 = (List) iterable;
                int size3 = list2.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    Object obj = list2.get(i2);
                    if (obj != null) {
                        list.add(obj);
                    } else {
                        a(size2, list);
                        throw null;
                    }
                }
                return;
            }
            for (Object obj2 : iterable) {
                if (obj2 != null) {
                    list.add(obj2);
                } else {
                    a(size2, list);
                    throw null;
                }
            }
            return;
        }
        list.addAll((Collection) iterable);
    }

    public final void c() {
        if (!this.y.e()) {
            mf7 g = this.x.g();
            ug7.c.a(g.getClass()).b(g, this.y);
            this.y = g;
        }
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final kf7 clone() {
        kf7 kf7Var = (kf7) this.x.q(5);
        boolean e = this.y.e();
        mf7 mf7Var = this.y;
        if (e) {
            mf7Var.getClass();
            ug7.c.a(mf7Var.getClass()).f(mf7Var);
            mf7Var.f();
            mf7Var = this.y;
        }
        kf7Var.y = mf7Var;
        return kf7Var;
    }

    public final mf7 e() {
        boolean e = this.y.e();
        mf7 mf7Var = this.y;
        if (e) {
            mf7Var.getClass();
            ug7.c.a(mf7Var.getClass()).f(mf7Var);
            mf7Var.f();
            mf7Var = this.y;
        }
        mf7Var.getClass();
        if (mf7.o(mf7Var, true)) {
            return mf7Var;
        }
        throw new bh7();
    }

    public final void f(mf7 mf7Var) {
        mf7 mf7Var2 = this.x;
        if (!mf7Var2.equals(mf7Var)) {
            if (!this.y.e()) {
                mf7 g = mf7Var2.g();
                ug7.c.a(g.getClass()).b(g, this.y);
                this.y = g;
            }
            mf7 mf7Var3 = this.y;
            ug7.c.a(mf7Var3.getClass()).b(mf7Var3, mf7Var);
        }
    }

    public final void g(byte[] bArr, int i, ff7 ff7Var) {
        if (!this.y.e()) {
            mf7 g = this.x.g();
            ug7.c.a(g.getClass()).b(g, this.y);
            this.y = g;
        }
        try {
            ug7.c.a(this.y.getClass()).g(this.y, bArr, 0, i, new m97(ff7Var));
        } catch (ag7 e) {
            throw e;
        } catch (IOException e2) {
            ov3.k("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
