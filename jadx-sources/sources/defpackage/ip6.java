package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ip6 implements c46 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ l85 y;

    public /* synthetic */ ip6(l85 l85Var, byte b) {
        this.x = b;
        this.y = l85Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zp2] */
    @Override // defpackage.c46
    public final Object i() {
        SQLiteDatabase a;
        byte b = this.x;
        l85 l85Var = this.y;
        switch (b) {
            case 0:
                l85Var.getClass();
                int i = bn0.e;
                ?? obj = new Object();
                obj.x = null;
                obj.y = new ArrayList();
                obj.z = null;
                obj.A = "";
                HashMap hashMap = new HashMap();
                a = l85Var.a();
                a.beginTransaction();
                try {
                    bn0 bn0Var = (bn0) l85.G(a.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new ia1((Object) l85Var, (Object) hashMap, (Object) obj, (byte) 7));
                    a.setTransactionSuccessful();
                    return bn0Var;
                } finally {
                }
            default:
                long f = l85Var.y.f() - l85Var.A.d;
                a = l85Var.a();
                a.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(f)};
                    Cursor rawQuery = a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            l85Var.q(rawQuery.getInt(0), rk3.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = a.delete("events", "timestamp_ms < ?", strArr);
                    a.setTransactionSuccessful();
                    a.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
        }
    }
}
