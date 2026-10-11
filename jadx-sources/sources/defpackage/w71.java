package defpackage;

import android.database.Cursor;
import java.io.Closeable;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w71 implements Closeable {
    public final /* synthetic */ byte x;
    public final Object y;

    public w71() {
        this.x = (byte) 1;
        this.y = new Inflater(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                ((Cursor) obj).close();
                return;
            default:
                ((Inflater) obj).end();
                return;
        }
    }

    public w71(Cursor cursor) {
        this.x = (byte) 0;
        this.y = cursor;
    }
}
