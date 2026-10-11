package com.google.protobuf;

import defpackage.j97;
import defpackage.yb5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z implements j97 {
    public final CodedOutputStream a;

    public z(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.checkNotNull(codedOutputStream, "output");
        this.a = codedOutputStream2;
        codedOutputStream2.wrapper = this;
    }

    public final void a(int i, ByteString byteString) {
        this.a.writeBytes(i, byteString);
    }

    public final void b(int i, int i2) {
        this.a.writeFixed32(i, i2);
    }

    public final void c(int i, long j) {
        this.a.writeFixed64(i, j);
    }

    public final void d(int i, Object obj, yb5 yb5Var) {
        this.a.writeGroup(i, (MessageLite) obj, yb5Var);
    }

    public final void e(int i, int i2) {
        this.a.writeInt32(i, i2);
    }

    public final void f(int i, long j) {
        this.a.writeInt64(i, j);
    }

    public final void g(int i, Object obj, yb5 yb5Var) {
        this.a.writeMessage(i, (MessageLite) obj, yb5Var);
    }

    public final void h(int i, Object obj) {
        boolean z = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.a;
        if (z) {
            codedOutputStream.writeRawMessageSetExtension(i, (ByteString) obj);
        } else {
            codedOutputStream.writeMessageSetExtension(i, (MessageLite) obj);
        }
    }
}
