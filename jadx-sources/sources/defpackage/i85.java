package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class i85 implements j85, c46 {
    public final /* synthetic */ long x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ i85(long j, Object obj, Object obj2) {
        this.y = obj;
        this.z = obj2;
        this.x = j;
    }

    @Override // defpackage.j85
    public Object apply(Object obj) {
        boolean z;
        String str = (String) this.y;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        byte b = ((rk3) this.z).x;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(b)});
        try {
            if (rawQuery.getCount() > 0) {
                z = true;
            } else {
                z = false;
            }
            rawQuery.close();
            long j = this.x;
            if (!z) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(b));
                contentValues.put("events_dropped_count", Long.valueOf(j));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL(qx1.j(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(b)});
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.c46
    public Object i() {
        kp6 kp6Var = (kp6) this.y;
        oy oyVar = (oy) this.z;
        l85 l85Var = kp6Var.c;
        long f = kp6Var.g.f() + this.x;
        l85Var.getClass();
        l85Var.p(new tv3(f, oyVar));
        return null;
    }
}
