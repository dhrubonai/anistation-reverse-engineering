package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class p65 implements j85, ay0, ri3 {
    public final /* synthetic */ byte x;

    public /* synthetic */ p65(byte b) {
        this.x = b;
    }

    public static /* synthetic */ void b() {
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(int i, long j) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + j);
    }

    public static /* synthetic */ void e(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void f(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void h(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void j(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void k(StringBuilder sb, int i) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void l() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void m(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void o() {
        throw new AssertionError();
    }

    public static /* synthetic */ void p() {
        throw new zf7();
    }

    public yg5 a(u98 u98Var) {
        xg5 g0;
        xg5 xg5Var;
        xg5 xg5Var2;
        byte b = this.x;
        boolean z = true;
        p21 p21Var = p21.x;
        switch (b) {
            case 6:
                fm0 fm0Var = (fm0) u98Var.A;
                xg5 c = fm0Var.c(fm0Var.y);
                xg5 c2 = fm0Var.c(fm0Var.z);
                if (u98Var.i() != p21Var) {
                    z = false;
                }
                return new yg5(c, c2, z);
            case 7:
                fm0 fm0Var2 = (fm0) u98Var.A;
                xg5 c3 = fm0Var2.c(fm0Var2.y);
                xg5 c4 = fm0Var2.c(fm0Var2.z);
                if (u98Var.i() != p21Var) {
                    z = false;
                }
                return zz.x(new yg5(c3, c4, z), u98Var);
            case 8:
                return zz.j(u98Var, h95.K);
            case 9:
                return zz.j(u98Var, pk2.d0);
            default:
                yg5 yg5Var = (yg5) u98Var.z;
                fm0 fm0Var3 = (fm0) u98Var.A;
                if (yg5Var == null) {
                    return zz.j(u98Var, h95.K);
                }
                xg5 xg5Var3 = yg5Var.b;
                xg5 xg5Var4 = yg5Var.a;
                if (u98Var.y) {
                    g0 = zz.g0(u98Var, fm0Var3, xg5Var4);
                    xg5Var2 = xg5Var3;
                    xg5Var3 = xg5Var4;
                    xg5Var = g0;
                } else {
                    g0 = zz.g0(u98Var, fm0Var3, xg5Var3);
                    xg5Var = xg5Var4;
                    xg5Var2 = g0;
                }
                if (!a34.i(g0, xg5Var3)) {
                    if (u98Var.i() != p21Var && (u98Var.i() != p21.z || xg5Var.b <= xg5Var2.b)) {
                        z = false;
                    }
                    return zz.x(new yg5(xg5Var, xg5Var2, z), u98Var);
                }
                return yg5Var;
        }
    }

    @Override // defpackage.ay0
    public void accept(Object obj) {
        ((d95) obj).b.release();
    }

    @Override // defpackage.j85
    public Object apply(Object obj) {
        byte[] decode;
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                st3 a = oy.a();
                a.G(rawQuery.getString(1));
                a.z = du4.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                if (string == null) {
                    decode = null;
                } else {
                    decode = Base64.decode(string, 0);
                }
                a.y = decode;
                arrayList.add(a.f());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // defpackage.ri3
    public void invoke(Object obj) {
        ((io4) obj).K();
    }
}
