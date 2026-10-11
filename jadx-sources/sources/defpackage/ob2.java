package defpackage;

import android.database.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ob2 extends nb2 implements h36 {
    public final SQLiteStatement z;

    public ob2(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement, (byte) 0);
        this.z = sQLiteStatement;
    }

    @Override // defpackage.h36
    public final void i() {
        this.z.execute();
    }
}
