package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface x26 extends Closeable {
    void B();

    boolean L();

    void O(Object[] objArr);

    void P();

    Cursor Q(c36 c36Var, CancellationSignal cancellationSignal);

    void R();

    void a0();

    boolean h0();

    boolean isOpen();

    boolean j();

    void n();

    Cursor o(c36 c36Var);

    int q0(ContentValues contentValues, Object[] objArr);

    void u();

    void v(String str);

    h36 x(String str);
}
