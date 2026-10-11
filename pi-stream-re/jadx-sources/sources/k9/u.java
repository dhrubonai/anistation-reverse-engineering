package k9;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface u extends Closeable, Flushable {
    y c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void w(g gVar, long j4);
}
