package defpackage;

import com.google.protobuf.ByteOutput;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Internal;
import com.google.protobuf.l;
import com.google.protobuf.u1;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t94 extends l {
    public final ByteBuffer x;

    public t94(ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        this.x = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return this.x.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        return Collections.singletonList(this.x.asReadOnlyBuffer());
    }

    @Override // com.google.protobuf.l
    public final boolean b(l lVar, int i, int i2) {
        return substring(0, i2).equals(lVar.substring(i, i2 + i));
    }

    @Override // com.google.protobuf.ByteString
    public final byte byteAt(int i) {
        try {
            return this.x.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    public final ByteBuffer c(int i, int i2) {
        ByteBuffer byteBuffer = this.x;
        if (i >= byteBuffer.position() && i2 <= byteBuffer.limit() && i <= i2) {
            ByteBuffer slice = byteBuffer.slice();
            slice.position(i - byteBuffer.position());
            slice.limit(i2 - byteBuffer.position());
            return slice;
        }
        throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.x.slice());
    }

    @Override // com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer slice = this.x.slice();
        slice.position(i);
        slice.get(bArr, i2, i3);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        ByteBuffer byteBuffer = this.x;
        if (byteBuffer.remaining() != byteString.size()) {
            return false;
        }
        if (byteBuffer.remaining() == 0) {
            return true;
        }
        if (obj instanceof t94) {
            return byteBuffer.equals(((t94) obj).x);
        }
        if (obj instanceof u1) {
            return obj.equals(this);
        }
        return byteBuffer.equals(byteString.asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        nu5 nu5Var = aq6.a;
        ByteBuffer byteBuffer = this.x;
        if (nu5Var.m(byteBuffer, 0, byteBuffer.position(), byteBuffer.remaining()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.x, true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new na0(this);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.x.get(i4);
        }
        return i;
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i, int i2, int i3) {
        return aq6.a.m(this.x, i, i2, i3 + i2);
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.x.remaining();
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i, int i2) {
        try {
            return new t94(c(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int i;
        ByteBuffer byteBuffer = this.x;
        if (byteBuffer.hasArray()) {
            byteArray = byteBuffer.array();
            i = byteBuffer.position() + byteBuffer.arrayOffset();
            length = byteBuffer.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            i = 0;
        }
        return new String(byteArray, i, length, charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) {
        byteOutput.writeLazy(this.x.slice());
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i, int i2) {
        int length;
        WritableByteChannel writableByteChannel;
        ByteBuffer byteBuffer = this.x;
        if (byteBuffer.hasArray()) {
            outputStream.write(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset() + i, i2);
            return;
        }
        ByteBuffer c = c(i, i2 + i);
        ThreadLocal threadLocal = dc0.a;
        int position = c.position();
        try {
            if (c.hasArray()) {
                outputStream.write(c.array(), c.arrayOffset() + c.position(), c.remaining());
            } else {
                long j = dc0.c;
                byte[] bArr = null;
                if (j >= 0 && dc0.b.isInstance(outputStream)) {
                    try {
                        writableByteChannel = (WritableByteChannel) ro6.l(j, outputStream);
                    } catch (ClassCastException unused) {
                        writableByteChannel = null;
                    }
                    if (writableByteChannel != null) {
                        writableByteChannel.write(c);
                    }
                }
                int max = Math.max(c.remaining(), 1024);
                ThreadLocal threadLocal2 = dc0.a;
                SoftReference softReference = (SoftReference) threadLocal2.get();
                if (softReference != null) {
                    bArr = (byte[]) softReference.get();
                }
                if (bArr == null || ((length = bArr.length) < max && length < max * 0.5f)) {
                    bArr = new byte[max];
                    if (max <= 16384) {
                        threadLocal2.set(new SoftReference(bArr));
                    }
                }
                while (c.hasRemaining()) {
                    int min = Math.min(c.remaining(), bArr.length);
                    c.get(bArr, 0, min);
                    outputStream.write(bArr, 0, min);
                }
            }
            c.position(position);
        } catch (Throwable th) {
            c.position(position);
            throw th;
        }
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) {
        outputStream.write(toByteArray());
    }
}
