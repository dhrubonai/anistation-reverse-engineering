package org.chromium.net;

import android.os.ParcelFileDescriptor;
import defpackage.fp6;
import defpackage.fq3;
import defpackage.hp6;
import defpackage.sn3;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new fp6(ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new hp6(new fq3(parcelFileDescriptor, (byte) 16));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new fp6(byteBuffer.slice());
    }

    public static UploadDataProvider create(File file) {
        return new hp6(new sn3(file, (byte) 24));
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}
