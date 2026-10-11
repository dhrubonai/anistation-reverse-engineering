package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class h22 implements ao0 {
    public final File a;
    public final nj5 b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public h22(File file, nj5 nj5Var) {
        this.a = file;
        this.b = nj5Var;
    }

    @Override // defpackage.ao0
    public final void close() {
        this.c.set(true);
    }
}
