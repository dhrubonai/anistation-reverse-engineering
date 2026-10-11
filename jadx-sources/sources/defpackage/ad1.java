package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ad1 implements gd1, c46 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ long z;

    public /* synthetic */ ad1(kp6 kp6Var, Iterable iterable, oy oyVar, long j) {
        this.x = (byte) 2;
        this.y = kp6Var;
        this.B = iterable;
        this.A = oyVar;
        this.z = j;
    }

    @Override // defpackage.gd1
    public ScheduledFuture a(cn7 cn7Var) {
        byte b = this.x;
        Object obj = this.A;
        long j = this.z;
        Object obj2 = this.B;
        fd1 fd1Var = (fd1) this.y;
        switch (b) {
            case 0:
                return fd1Var.y.schedule(new dd1(fd1Var, (Runnable) obj2, cn7Var, (byte) 1), j, (TimeUnit) obj);
            default:
                return fd1Var.y.schedule(new ed1(fd1Var, (Callable) obj2, cn7Var, (byte) 0), j, (TimeUnit) obj);
        }
    }

    @Override // defpackage.c46
    public Object i() {
        kp6 kp6Var = (kp6) this.y;
        Iterable iterable = (Iterable) this.B;
        oy oyVar = (oy) this.A;
        l85 l85Var = kp6Var.c;
        l85Var.getClass();
        if (iterable.iterator().hasNext()) {
            String concat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(l85.A(iterable));
            SQLiteDatabase a = l85Var.a();
            a.beginTransaction();
            try {
                a.compileStatement(concat).execute();
                Cursor rawQuery = a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        l85Var.q(rawQuery.getInt(0), rk3.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                a.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a.setTransactionSuccessful();
            } finally {
                a.endTransaction();
            }
        }
        l85Var.p(new tv3(kp6Var.g.f() + this.z, oyVar));
        return null;
    }

    public /* synthetic */ ad1(fd1 fd1Var, Object obj, long j, TimeUnit timeUnit, byte b) {
        this.x = b;
        this.y = fd1Var;
        this.B = obj;
        this.z = j;
        this.A = timeUnit;
    }
}
