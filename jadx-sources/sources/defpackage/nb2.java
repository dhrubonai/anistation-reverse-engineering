package defpackage;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class nb2 implements b36 {
    public final /* synthetic */ byte x;
    public final Closeable y;

    public /* synthetic */ nb2(Closeable closeable, byte b) {
        this.x = b;
        this.y = closeable;
    }

    @Override // defpackage.b36
    public final void b(int i, double d) {
        byte b = this.x;
        Closeable closeable = this.y;
        switch (b) {
            case 0:
                ((SQLiteProgram) closeable).bindDouble(i, d);
                return;
            default:
                ((c75) closeable).b(i, d);
                return;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.x) {
            case 0:
                ((SQLiteProgram) this.y).close();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.b36
    public final void e(int i, long j) {
        byte b = this.x;
        Closeable closeable = this.y;
        switch (b) {
            case 0:
                ((SQLiteProgram) closeable).bindLong(i, j);
                return;
            default:
                ((c75) closeable).e(i, j);
                return;
        }
    }

    @Override // defpackage.b36
    public final void f(int i, byte[] bArr) {
        byte b = this.x;
        Closeable closeable = this.y;
        switch (b) {
            case 0:
                ((SQLiteProgram) closeable).bindBlob(i, bArr);
                return;
            default:
                ((c75) closeable).f(i, bArr);
                return;
        }
    }

    @Override // defpackage.b36
    public final void h(int i) {
        byte b = this.x;
        Closeable closeable = this.y;
        switch (b) {
            case 0:
                ((SQLiteProgram) closeable).bindNull(i);
                return;
            default:
                ((c75) closeable).h(i);
                return;
        }
    }

    @Override // defpackage.b36
    public void k() {
        ((SQLiteProgram) this.y).clearBindings();
    }

    @Override // defpackage.b36
    public final void w(int i, String str) {
        byte b = this.x;
        Closeable closeable = this.y;
        switch (b) {
            case 0:
                str.getClass();
                ((SQLiteProgram) closeable).bindString(i, str);
                return;
            default:
                ((c75) closeable).w(i, str);
                return;
        }
    }

    private final void a() {
    }
}
