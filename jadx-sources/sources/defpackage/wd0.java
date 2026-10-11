package defpackage;

import com.google.protobuf.ByteOutput;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Internal;
import com.google.protobuf.l;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class wd0 extends l {
    public final byte[] x;

    public wd0(byte[] bArr) {
        bArr.getClass();
        this.x = bArr;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.x, c(), size()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.l
    public final boolean b(l lVar, int i, int i2) {
        if (i2 <= lVar.size()) {
            int i3 = i + i2;
            if (i3 <= lVar.size()) {
                if (lVar instanceof wd0) {
                    wd0 wd0Var = (wd0) lVar;
                    byte[] bArr = wd0Var.x;
                    int c = c() + i2;
                    int c2 = c();
                    int c3 = wd0Var.c() + i;
                    while (c2 < c) {
                        if (this.x[c2] != bArr[c3]) {
                            return false;
                        }
                        c2++;
                        c3++;
                    }
                    return true;
                }
                return lVar.substring(i, i3).equals(substring(0, i2));
            }
            StringBuilder u = qx1.u("Ran off end of other: ", i, ", ", i2, ", ");
            u.append(lVar.size());
            throw new IllegalArgumentException(u.toString());
        }
        throw new IllegalArgumentException("Length too large: " + i2 + size());
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i) {
        return this.x[i];
    }

    public int c() {
        return 0;
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.x, c(), size());
    }

    @Override // com.google.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.x, i, bArr, i2, i3);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof ByteString) && size() == ((ByteString) obj).size()) {
                if (size() == 0) {
                    return true;
                }
                if (obj instanceof wd0) {
                    wd0 wd0Var = (wd0) obj;
                    int peekCachedHashCode = peekCachedHashCode();
                    int peekCachedHashCode2 = wd0Var.peekCachedHashCode();
                    if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
                        return b(wd0Var, 0, size());
                    }
                } else {
                    return obj.equals(this);
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.l, com.google.protobuf.ByteString
    public byte internalByteAt(int i) {
        return this.x[i];
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        int c = c();
        return aq6.a.k(this.x, c, size() + c);
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.x, c(), size(), true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new ByteArrayInputStream(this.x, c(), size());
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i, int i2, int i3) {
        return Internal.partialHash(i, this.x, c() + i2, i3);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i, int i2, int i3) {
        int c = c() + i2;
        return aq6.a.l(i, c, i3 + c, this.x);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.x.length;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i, int i2) {
        int checkRange = ByteString.checkRange(i, i2, size());
        if (checkRange == 0) {
            return ByteString.EMPTY;
        }
        return new rd0(this.x, c() + i, checkRange);
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(this.x, c(), size(), charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) {
        byteOutput.writeLazy(this.x, c(), size());
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i, int i2) {
        outputStream.write(this.x, c() + i, i2);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) {
        outputStream.write(toByteArray());
    }
}
