package defpackage;

import com.google.protobuf.CodedInputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public enum y67 extends a77 {
    public y67() {
        super("STRICT", 1);
    }

    @Override // defpackage.a77
    public final Object a(CodedInputStream codedInputStream) {
        return codedInputStream.readStringRequireUtf8();
    }
}
