package defpackage;

import java.io.File;
import java.io.FileInputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i58 extends m58 implements e58 {
    public final File x;

    public i58(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.x = file;
    }

    @Override // defpackage.e58
    public final File a() {
        return this.x;
    }
}
