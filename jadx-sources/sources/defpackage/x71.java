package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x71 {
    public static final String e = g(3, 4);
    public static final String[] f = {"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    public final cx5 b;
    public boolean d;
    public final String a = "ExoPlayerDownloads";
    public final Object c = new Object();

    public x71(cx5 cx5Var) {
        this.b = cx5Var;
    }

    public static ArrayList a(String str) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            String str2 = eq6.a;
            for (String str3 : str.split(",", -1)) {
                String[] split = str3.split("\\.", -1);
                if (split.length == 3) {
                    z = true;
                } else {
                    z = false;
                }
                io3.B(z);
                arrayList.add(new vy5(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2])));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [pk1, java.lang.Object] */
    public static cj1 e(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        int i = 0;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri parse = Uri.parse(string2);
        String n = qy3.n(cursor.getString(1));
        ArrayList a = a(cursor.getString(3));
        if (blob.length <= 0) {
            blob = null;
        }
        il1 il1Var = new il1(string, parse, n, a, blob, cursor.getString(4), cursor.getBlob(5), null, null);
        ?? obj = new Object();
        obj.a = cursor.getLong(13);
        obj.b = cursor.getFloat(12);
        int i2 = cursor.getInt(6);
        if (i2 == 4) {
            i = cursor.getInt(11);
        }
        return new cj1(il1Var, i2, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i, obj);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [pk1, java.lang.Object] */
    public static cj1 f(Cursor cursor) {
        String str;
        int i = 0;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri parse = Uri.parse(string2);
        String string3 = cursor.getString(1);
        if ("dash".equals(string3)) {
            str = "application/dash+xml";
        } else if ("hls".equals(string3)) {
            str = "application/x-mpegURL";
        } else if ("ss".equals(string3)) {
            str = "application/vnd.ms-sstr+xml";
        } else {
            str = "video/x-unknown";
        }
        il1 il1Var = new il1(string, parse, qy3.n(str), a(cursor.getString(3)), null, cursor.getString(4), cursor.getBlob(5), null, null);
        ?? obj = new Object();
        obj.a = cursor.getLong(13);
        obj.b = cursor.getFloat(12);
        int i2 = cursor.getInt(6);
        if (i2 == 4) {
            i = cursor.getInt(11);
        }
        return new cj1(il1Var, i2, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i, obj);
    }

    public static String g(int... iArr) {
        if (iArr.length == 0) {
            return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        }
        StringBuilder sb = new StringBuilder("state IN (");
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(iArr[i]);
        }
        sb.append(')');
        return sb.toString();
    }

    public final void b() {
        ArrayList arrayList;
        synchronized (this.c) {
            if (this.d) {
                return;
            }
            try {
                int i = 0;
                int a = as6.a(this.b.getReadableDatabase(), 0, "");
                if (a != 3) {
                    SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        as6.b(writableDatabase, 0, "", 3);
                        if (a == 2) {
                            arrayList = h(writableDatabase);
                        } else {
                            arrayList = new ArrayList();
                        }
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(this.a));
                        writableDatabase.execSQL("CREATE TABLE " + this.a + " (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        int size = arrayList.size();
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            j((cj1) obj, writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.d = true;
            } catch (SQLException e2) {
                throw new IOException(e2);
            }
        }
    }

    public final Cursor c(String str, String[] strArr) {
        try {
            return this.b.getReadableDatabase().query(this.a, f, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e2) {
            throw new IOException(e2);
        }
    }

    public final cj1 d(String str) {
        b();
        try {
            Cursor c = c("id = ?", new String[]{str});
            try {
                if (c.getCount() == 0) {
                    c.close();
                    return null;
                }
                c.moveToNext();
                cj1 e2 = e(c);
                c.close();
                return e2;
            } finally {
            }
        } catch (SQLiteException e3) {
            throw new IOException(e3);
        }
    }

    public final ArrayList h(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        String str = this.a;
        if (!eq6.i0(sQLiteDatabase, str)) {
            return arrayList;
        }
        Cursor query = sQLiteDatabase.query(str, new String[]{"id", "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(f(query));
            } finally {
            }
        }
        query.close();
        return arrayList;
    }

    public final void i(cj1 cj1Var) {
        b();
        try {
            j(cj1Var, this.b.getWritableDatabase());
        } catch (SQLiteException e2) {
            throw new IOException(e2);
        }
    }

    public final void j(cj1 cj1Var, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = cj1Var.a.B;
        if (bArr == null) {
            bArr = eq6.b;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", cj1Var.a.x);
        contentValues.put("mime_type", cj1Var.a.z);
        contentValues.put("uri", cj1Var.a.y.toString());
        List list = cj1Var.a.A;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            vy5 vy5Var = (vy5) list.get(i);
            sb.append(vy5Var.x);
            sb.append('.');
            sb.append(vy5Var.y);
            sb.append('.');
            sb.append(vy5Var.z);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", cj1Var.a.C);
        contentValues.put("data", cj1Var.a.D);
        contentValues.put("state", Integer.valueOf(cj1Var.b));
        contentValues.put("start_time_ms", Long.valueOf(cj1Var.c));
        contentValues.put("update_time_ms", Long.valueOf(cj1Var.d));
        contentValues.put("content_length", Long.valueOf(cj1Var.e));
        contentValues.put("stop_reason", Integer.valueOf(cj1Var.f));
        contentValues.put("failure_reason", Integer.valueOf(cj1Var.g));
        contentValues.put("percent_downloaded", Float.valueOf(cj1Var.h.b));
        contentValues.put("bytes_downloaded", Long.valueOf(cj1Var.h.a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow(this.a, null, contentValues);
    }

    public final void k() {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.b.getWritableDatabase().update(this.a, contentValues, "state = 2", null);
        } catch (SQLException e2) {
            throw new IOException(e2);
        }
    }

    public final void l() {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.b.getWritableDatabase().update(this.a, contentValues, null, null);
        } catch (SQLException e2) {
            throw new IOException(e2);
        }
    }

    public final void m(String str, int i) {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.b.getWritableDatabase().update(this.a, contentValues, e + " AND id = ?", new String[]{str});
        } catch (SQLException e2) {
            throw new IOException(e2);
        }
    }
}
