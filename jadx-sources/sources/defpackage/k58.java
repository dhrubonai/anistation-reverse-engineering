package defpackage;

import java.io.File;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k58 extends o58 implements e58 {
    public final FileOutputStream x;
    public final File y;

    public k58(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.x = fileOutputStream;
        this.y = file;
    }

    @Override // defpackage.e58
    public final File a() {
        return this.y;
    }
}
