package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hb2 implements x26 {
    public static final rb3 A;
    public static final rb3 B;
    public static final String[] y = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] z = new String[0];
    public final SQLiteDatabase x;

    static {
        vj1 vj1Var = new vj1((byte) 14);
        jf3 jf3Var = jf3.y;
        A = bx7.B(jf3Var, vj1Var);
        B = bx7.B(jf3Var, new vj1((byte) 15));
    }

    public hb2(SQLiteDatabase sQLiteDatabase) {
        this.x = sQLiteDatabase;
    }

    @Override // defpackage.x26
    public final void B() {
        rb3 rb3Var = B;
        if (((Method) rb3Var.getValue()) != null) {
            rb3 rb3Var2 = A;
            if (((Method) rb3Var2.getValue()) != null) {
                Method method = (Method) rb3Var.getValue();
                method.getClass();
                Method method2 = (Method) rb3Var2.getValue();
                method2.getClass();
                Object invoke = method2.invoke(this.x, null);
                if (invoke != null) {
                    method.invoke(invoke, 0, null, 0, null);
                    return;
                } else {
                    ze0.m("Required value was null.");
                    return;
                }
            }
        }
        n();
    }

    @Override // defpackage.x26
    public final boolean L() {
        return this.x.enableWriteAheadLogging();
    }

    @Override // defpackage.x26
    public final void O(Object[] objArr) {
        this.x.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // defpackage.x26
    public final void P() {
        this.x.setTransactionSuccessful();
    }

    @Override // defpackage.x26
    public final Cursor Q(c36 c36Var, CancellationSignal cancellationSignal) {
        Cursor rawQueryWithFactory = this.x.rawQueryWithFactory(new gb2(c36Var, (byte) 0), c36Var.G(), z, null, cancellationSignal);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }

    @Override // defpackage.x26
    public final void R() {
        this.x.beginTransactionNonExclusive();
    }

    @Override // defpackage.x26
    public final void a0() {
        this.x.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.x.close();
    }

    @Override // defpackage.x26
    public final boolean h0() {
        return this.x.isWriteAheadLoggingEnabled();
    }

    @Override // defpackage.x26
    public final boolean isOpen() {
        return this.x.isOpen();
    }

    @Override // defpackage.x26
    public final boolean j() {
        return this.x.inTransaction();
    }

    @Override // defpackage.x26
    public final void n() {
        this.x.beginTransaction();
    }

    @Override // defpackage.x26
    public final Cursor o(c36 c36Var) {
        Cursor rawQueryWithFactory = this.x.rawQueryWithFactory(new gb2(new fd(c36Var, (byte) 1), (byte) 1), c36Var.G(), z, null);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }

    @Override // defpackage.x26
    public final int q0(ContentValues contentValues, Object[] objArr) {
        String str;
        int i = 0;
        if (contentValues.size() != 0) {
            int size = contentValues.size();
            int length = objArr.length + size;
            Object[] objArr2 = new Object[length];
            StringBuilder sb = new StringBuilder("UPDATE ");
            sb.append(y[3]);
            sb.append("WorkSpec SET ");
            for (String str2 : contentValues.keySet()) {
                if (i > 0) {
                    str = ",";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append(str2);
                objArr2[i] = contentValues.get(str2);
                sb.append("=?");
                i++;
            }
            for (int i2 = size; i2 < length; i2++) {
                objArr2[i2] = objArr[i2 - size];
            }
            if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
            }
            h36 x = x(sb.toString());
            jf7.k(x, objArr2);
            return ((ob2) x).z.executeUpdateDelete();
        }
        ze0.k("Empty values");
        return 0;
    }

    @Override // defpackage.x26
    public final void u() {
        this.x.disableWriteAheadLogging();
    }

    @Override // defpackage.x26
    public final void v(String str) {
        this.x.execSQL(str);
    }

    @Override // defpackage.x26
    public final h36 x(String str) {
        str.getClass();
        SQLiteStatement compileStatement = this.x.compileStatement(str);
        compileStatement.getClass();
        return new ob2(compileStatement);
    }
}
