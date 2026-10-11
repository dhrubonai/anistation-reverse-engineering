package defpackage;

import android.media.metrics.EditingSession;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tr1 implements AutoCloseable {
    public EditingSession x;
    public boolean y;

    @Override // java.lang.AutoCloseable
    public final void close() {
        EditingSession editingSession = this.x;
        if (editingSession != null) {
            editingSession.close();
            this.x = null;
        }
    }
}
