package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sr7 extends zq7 {
    public static final String[] B = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    public boolean A;
    public final cl7 z;

    public sr7(gu7 gu7Var) {
        super(gu7Var);
        this.z = new cl7(this, ((gu7) this.x).x);
    }

    @Override // defpackage.zq7
    public final boolean O() {
        return false;
    }

    public final void P() {
        int delete;
        gu7 gu7Var = (gu7) this.x;
        L();
        try {
            SQLiteDatabase R = R();
            if (R != null && (delete = R.delete("messages", null, null)) > 0) {
                es7 es7Var = gu7Var.C;
                gu7.l(es7Var);
                es7Var.K.b(Integer.valueOf(delete), "Reset local analytics data. records");
            }
        } catch (SQLiteException e) {
            es7 es7Var2 = gu7Var.C;
            gu7.l(es7Var2);
            es7Var2.C.b(e, "Error resetting local analytics data. error");
        }
    }

    public final void Q() {
        gu7 gu7Var = (gu7) this.x;
        L();
        if (!this.A && gu7Var.x.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase R = R();
                        if (R == null) {
                            this.A = true;
                            return;
                        }
                        R.beginTransaction();
                        R.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        R.setTransactionSuccessful();
                        R.endTransaction();
                        R.close();
                        return;
                    } catch (SQLiteException e) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        es7 es7Var = gu7Var.C;
                        gu7.l(es7Var);
                        es7Var.C.b(e, "Error deleting app launch break from local database");
                        this.A = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e2) {
                    es7 es7Var2 = gu7Var.C;
                    gu7.l(es7Var2);
                    es7Var2.C.b(e2, "Error deleting app launch break from local database");
                    this.A = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
            }
            es7 es7Var3 = gu7Var.C;
            gu7.l(es7Var3);
            es7Var3.F.a("Error deleting app launch break from local database in reasonable time");
        }
    }

    public final SQLiteDatabase R() {
        if (this.A) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.z.getWritableDatabase();
        if (writableDatabase == null) {
            this.A = true;
            return null;
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:95:0x0088, B:97:0x008e, B:65:0x00ae, B:67:0x00cf, B:70:0x00d8, B:73:0x00de, B:74:0x00f8, B:42:0x0120, B:44:0x0126, B:45:0x0129, B:33:0x015b, B:21:0x0144), top: B:94:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean S(int r19, byte[] r20) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sr7.S(int, byte[]):boolean");
    }
}
