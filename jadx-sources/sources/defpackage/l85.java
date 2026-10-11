package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l85 implements Closeable {
    public static final au1 C = new au1("proto");
    public final yx A;
    public final sb3 B;
    public final bc5 x;
    public final un0 y;
    public final un0 z;

    public l85(un0 un0Var, un0 un0Var2, yx yxVar, bc5 bc5Var, sb3 sb3Var) {
        this.x = bc5Var;
        this.y = un0Var;
        this.z = un0Var2;
        this.A = yxVar;
        this.B = sb3Var;
    }

    public static String A(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((hy) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object G(Cursor cursor, j85 j85Var) {
        try {
            return j85Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long l(SQLiteDatabase sQLiteDatabase, oy oyVar) {
        Long valueOf;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oyVar.a, String.valueOf(du4.a(oyVar.c))));
        byte[] bArr = oyVar.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            if (!query.moveToNext()) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(query.getLong(0));
            }
            return valueOf;
        } finally {
            query.close();
        }
    }

    public final SQLiteDatabase a() {
        bc5 bc5Var = this.x;
        Objects.requireNonNull(bc5Var);
        un0 un0Var = this.z;
        long f = un0Var.f();
        while (true) {
            try {
                return bc5Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (un0Var.f() < this.A.c + f) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.x.close();
    }

    public final Object p(j85 j85Var) {
        SQLiteDatabase a = a();
        a.beginTransaction();
        try {
            Object apply = j85Var.apply(a);
            a.setTransactionSuccessful();
            return apply;
        } finally {
            a.endTransaction();
        }
    }

    public final void q(long j, rk3 rk3Var, String str) {
        p(new i85(j, str, rk3Var));
    }

    public final Object t(c46 c46Var) {
        SQLiteDatabase a = a();
        un0 un0Var = this.z;
        long f = un0Var.f();
        while (true) {
            try {
                a.beginTransaction();
                try {
                    Object i = c46Var.i();
                    a.setTransactionSuccessful();
                    return i;
                } finally {
                    a.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (un0Var.f() < this.A.c + f) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e);
                }
            }
        }
    }
}
