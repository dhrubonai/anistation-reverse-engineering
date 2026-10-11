package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lb2 extends SQLiteOpenHelper {
    public static final /* synthetic */ int E = 0;
    public final boolean A;
    public boolean B;
    public final lu4 C;
    public boolean D;
    public final Context x;
    public final cn7 y;
    public final fr0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb2(Context context, String str, final cn7 cn7Var, final fr0 fr0Var, boolean z) {
        super(context, str, null, fr0Var.y, new DatabaseErrorHandler() { // from class: ib2
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = lb2.E;
                sQLiteDatabase.getClass();
                cn7 cn7Var2 = cn7Var;
                hb2 hb2Var = (hb2) cn7Var2.x;
                if (hb2Var == null || !hb2Var.x.equals(sQLiteDatabase)) {
                    hb2Var = new hb2(sQLiteDatabase);
                    cn7Var2.x = hb2Var;
                }
                SQLiteDatabase sQLiteDatabase2 = hb2Var.x;
                fr0.this.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + hb2Var + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        fr0.j(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                fr0.j((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                fr0.j(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    hb2Var.close();
                } catch (IOException unused2) {
                }
            }
        });
        String str2;
        context.getClass();
        fr0Var.getClass();
        this.x = context;
        this.y = cn7Var;
        this.z = fr0Var;
        this.A = z;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            str2.getClass();
        } else {
            str2 = str;
        }
        this.C = new lu4(str2, context.getCacheDir(), false);
    }

    public final x26 a(boolean z) {
        boolean z2;
        lu4 lu4Var = this.C;
        try {
            if (!this.D && getDatabaseName() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            lu4Var.a(z2);
            this.B = false;
            SQLiteDatabase p = p(z);
            if (this.B) {
                close();
                x26 a = a(z);
                lu4Var.b();
                return a;
            }
            hb2 l = l(p);
            lu4Var.b();
            return l;
        } catch (Throwable th) {
            lu4Var.b();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        lu4 lu4Var = this.C;
        try {
            lu4Var.a(lu4Var.a);
            super.close();
            this.y.x = null;
            this.D = false;
        } finally {
            lu4Var.b();
        }
    }

    public final hb2 l(SQLiteDatabase sQLiteDatabase) {
        cn7 cn7Var = this.y;
        hb2 hb2Var = (hb2) cn7Var.x;
        if (hb2Var != null && hb2Var.x.equals(sQLiteDatabase)) {
            return hb2Var;
        }
        hb2 hb2Var2 = new hb2(sQLiteDatabase);
        cn7Var.x = hb2Var2;
        return hb2Var2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.B;
        fr0 fr0Var = this.z;
        if (!z && fr0Var.y != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            l(sQLiteDatabase);
            fr0Var.getClass();
        } catch (Throwable th) {
            throw new jb2(kb2.x, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((o65) this.z.z).c(new w26(l(sQLiteDatabase)));
        } catch (Throwable th) {
            throw new jb2(kb2.y, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.B = true;
        try {
            this.z.n(l(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new jb2(kb2.A, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.B) {
            try {
                fr0 fr0Var = this.z;
                hb2 l = l(sQLiteDatabase);
                o65 o65Var = (o65) fr0Var.z;
                o65Var.e(new w26(l));
                o65Var.h = l;
            } catch (Throwable th) {
                throw new jb2(kb2.B, th);
            }
        }
        this.D = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.B = true;
        try {
            this.z.n(l(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new jb2(kb2.z, th);
        }
    }

    public final SQLiteDatabase p(boolean z) {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.D;
        Context context = this.x;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            readableDatabase3.getClass();
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase2 = getWritableDatabase();
                    readableDatabase2.getClass();
                } else {
                    readableDatabase2 = getReadableDatabase();
                    readableDatabase2.getClass();
                }
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof jb2) {
                    jb2 jb2Var = (jb2) th;
                    int ordinal = jb2Var.x.ordinal();
                    th = jb2Var.y;
                    if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3) {
                        if (ordinal == 4) {
                            if (!(th instanceof SQLiteException)) {
                                throw th;
                            }
                        } else {
                            ze0.l();
                            return null;
                        }
                    } else {
                        throw th;
                    }
                }
                if ((th instanceof SQLiteException) && databaseName != null && this.A) {
                    context.deleteDatabase(databaseName);
                    try {
                        if (z) {
                            readableDatabase = getWritableDatabase();
                            readableDatabase.getClass();
                        } else {
                            readableDatabase = getReadableDatabase();
                            readableDatabase.getClass();
                        }
                        return readableDatabase;
                    } catch (jb2 e) {
                        throw e.y;
                    }
                }
                throw th;
            }
        }
    }
}
