package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import defpackage.aq6;
import defpackage.qi2;
import defpackage.ro6;
import defpackage.yb5;
import defpackage.yp6;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x extends CodedOutputStream {
    public final ByteBuffer a;
    public final ByteBuffer b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public long g;

    public x(ByteBuffer byteBuffer) {
        super();
        this.a = byteBuffer;
        this.b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long a = ro6.a(byteBuffer);
        this.c = a;
        long position = byteBuffer.position() + a;
        this.d = position;
        long limit = a + byteBuffer.limit();
        this.e = limit;
        this.f = limit - 10;
        this.g = position;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void flush() {
        this.a.position((int) (this.g - this.c));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return (int) (this.g - this.d);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        return (int) (this.e - this.g);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte[] bArr, int i, int i2) {
        long j = this.e;
        if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
            long j2 = i2;
            long j3 = j - j2;
            long j4 = this.g;
            if (j3 >= j4) {
                ro6.c.b(bArr, i, j4, j2);
                this.g += j2;
                return;
            }
        }
        if (bArr == null) {
            qi2.m("value");
            return;
        }
        throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.g), Long.valueOf(j), Integer.valueOf(i2)));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBool(int i, boolean z) {
        writeTag(i, 0);
        write(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i, byte[] bArr, int i2, int i3) {
        writeTag(i, 2);
        writeByteArrayNoTag(bArr, i2, i3);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArrayNoTag(byte[] bArr, int i, int i2) {
        writeUInt32NoTag(i2);
        write(bArr, i, i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteBuffer(int i, ByteBuffer byteBuffer) {
        writeTag(i, 2);
        writeUInt32NoTag(byteBuffer.capacity());
        writeRawBytes(byteBuffer);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBytes(int i, ByteString byteString) {
        writeTag(i, 2);
        writeBytesNoTag(byteString);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBytesNoTag(ByteString byteString) {
        writeUInt32NoTag(byteString.size());
        byteString.writeTo(this);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed32(int i, int i2) {
        writeTag(i, 5);
        writeFixed32NoTag(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed32NoTag(int i) {
        this.b.putInt((int) (this.g - this.c), i);
        this.g += 4;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64(int i, long j) {
        writeTag(i, 1);
        writeFixed64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64NoTag(long j) {
        this.b.putLong((int) (this.g - this.c), j);
        this.g += 8;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32(int i, int i2) {
        writeTag(i, 0);
        writeInt32NoTag(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32NoTag(int i) {
        if (i >= 0) {
            writeUInt32NoTag(i);
        } else {
            writeUInt64NoTag(i);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void writeLazy(byte[] bArr, int i, int i2) {
        write(bArr, i, i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessage(int i, MessageLite messageLite) {
        writeTag(i, 2);
        writeMessageNoTag(messageLite);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite, yb5 yb5Var) {
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(yb5Var));
        yb5Var.f(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageSetExtension(int i, MessageLite messageLite) {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeMessage(3, messageLite);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeRawBytes(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            return;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        write(duplicate);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeRawMessageSetExtension(int i, ByteString byteString) {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeBytes(3, byteString);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeString(int i, String str) {
        writeTag(i, 2);
        writeStringNoTag(str);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeStringNoTag(String str) {
        long j = this.c;
        ByteBuffer byteBuffer = this.b;
        long j2 = this.g;
        try {
            int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
            int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                int i = ((int) (this.g - j)) + computeUInt32SizeNoTag2;
                byteBuffer.position(i);
                aq6.b(str, byteBuffer);
                int position = byteBuffer.position() - i;
                writeUInt32NoTag(position);
                this.g += position;
                return;
            }
            int c = aq6.c(str);
            writeUInt32NoTag(c);
            byteBuffer.position((int) (this.g - j));
            aq6.b(str, byteBuffer);
            this.g += c;
        } catch (yp6 e) {
            this.g = j2;
            byteBuffer.position((int) (j2 - j));
            inefficientWriteStringNoTag(str, e);
        } catch (IllegalArgumentException e2) {
            throw new CodedOutputStream.OutOfSpaceException(e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new CodedOutputStream.OutOfSpaceException(e3);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeTag(int i, int i2) {
        writeUInt32NoTag(WireFormat.makeTag(i, i2));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32(int i, int i2) {
        writeTag(i, 0);
        writeUInt32NoTag(i2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32NoTag(int i) {
        if (this.g <= this.f) {
            while (true) {
                int i2 = i & (-128);
                long j = this.g;
                if (i2 == 0) {
                    this.g = 1 + j;
                    ro6.n(j, (byte) i);
                    return;
                } else {
                    this.g = j + 1;
                    ro6.n(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                long j2 = this.g;
                long j3 = this.e;
                if (j2 < j3) {
                    if ((i & (-128)) == 0) {
                        this.g = 1 + j2;
                        ro6.n(j2, (byte) i);
                        return;
                    } else {
                        this.g = j2 + 1;
                        ro6.n(j2, (byte) ((i & 127) | 128));
                        i >>>= 7;
                    }
                } else {
                    throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(j2), Long.valueOf(j3), 1));
                }
            }
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i, long j) {
        writeTag(i, 0);
        writeUInt64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j) {
        if (this.g <= this.f) {
            while (true) {
                long j2 = j & (-128);
                long j3 = this.g;
                if (j2 == 0) {
                    this.g = 1 + j3;
                    ro6.n(j3, (byte) j);
                    return;
                } else {
                    this.g = j3 + 1;
                    ro6.n(j3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j4 = this.g;
                long j5 = this.e;
                if (j4 < j5) {
                    if ((j & (-128)) == 0) {
                        this.g = 1 + j4;
                        ro6.n(j4, (byte) j);
                        return;
                    } else {
                        this.g = j4 + 1;
                        ro6.n(j4, (byte) ((((int) j) & 127) | 128));
                        j >>>= 7;
                    }
                } else {
                    throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(j4), Long.valueOf(j5), 1));
                }
            }
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void writeLazy(ByteBuffer byteBuffer) {
        write(byteBuffer);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i, byte[] bArr) {
        writeByteArray(i, bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessage(int i, MessageLite messageLite, yb5 yb5Var) {
        writeTag(i, 2);
        writeMessageNoTag(messageLite, yb5Var);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite) {
        writeUInt32NoTag(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte b) {
        long j = this.g;
        long j2 = this.e;
        if (j < j2) {
            this.g = 1 + j;
            ro6.n(j, b);
            return;
        }
        throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(j), Long.valueOf(j2), 1));
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.b;
        try {
            int remaining = byteBuffer.remaining();
            byteBuffer2.position((int) (this.g - this.c));
            byteBuffer2.put(byteBuffer);
            this.g += remaining;
        } catch (BufferOverflowException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
        }
    }
}
