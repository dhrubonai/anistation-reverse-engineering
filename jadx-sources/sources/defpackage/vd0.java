package defpackage;

import com.google.protobuf.CodedOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vd0 {
    public final CodedOutputStream a;
    public final byte[] b;

    public vd0(int i) {
        byte[] bArr = new byte[i];
        this.b = bArr;
        this.a = CodedOutputStream.newInstance(bArr);
    }
}
