package com.google.android.recaptcha.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bumptech.glide.c;
import i7.e;
import java.util.ArrayList;
import java.util.List;
import msr.pistream.app.download.PiStreamDownloadService;
import r6.h0;
import x6.m;
import x6.o;

/* loaded from: classes.dex */
public final class zzaz extends SQLiteOpenHelper {
    public static final zzax zza = new zzax(null);
    private static final int zzb;
    private static zzaz zzc;

    static {
        int zzb2;
        zzb2 = zzax.zzb("18.4.0");
        zzb = zzb2;
    }

    public /* synthetic */ zzaz(Context context, e eVar) {
        super(context, "cesdb", (SQLiteDatabase.CursorFactory) null, zzb);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final int zza(List list) {
        if (list.isEmpty()) {
            return 0;
        }
        return getWritableDatabase().delete("ce", "id IN ".concat(m.r0(list, ", ", "(", ")", zzay.zza, 24)), null);
    }

    public final int zzb() {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", null);
        int i10 = -1;
        try {
            if (rawQuery.moveToNext()) {
                i10 = rawQuery.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
        rawQuery.close();
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [x6.o] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    public final List zzd() {
        Cursor query = getReadableDatabase().query("ce", null, null, null, null, null, "ts ASC");
        ?? arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    int i10 = query.getInt(query.getColumnIndexOrThrow(PiStreamDownloadService.EXTRA_ID));
                    String string = query.getString(query.getColumnIndexOrThrow("ss"));
                    long j4 = query.getLong(query.getColumnIndexOrThrow("ts"));
                    h0.q(string);
                    arrayList.add(new zzba(string, j4, i10));
                } catch (Exception unused) {
                    arrayList = o.f11318a;
                }
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    public final boolean zzf(zzba zzbaVar) {
        if (zza(c.L(zzbaVar)) == 1) {
            return true;
        }
        return false;
    }
}
