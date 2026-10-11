package com.google.protobuf;

import com.google.protobuf.MessageLite;
import defpackage.aq6;
import defpackage.qo6;
import defpackage.ro6;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o extends CodedInputStream {
    public final Iterable a;
    public final Iterator b;
    public ByteBuffer c;
    public final boolean d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long m;
    public long n;
    public long o;

    public o(Iterable iterable, int i, boolean z) {
        super();
        this.h = Integer.MAX_VALUE;
        this.f = i;
        this.a = iterable;
        this.b = iterable.iterator();
        this.d = z;
        this.j = 0;
        this.k = 0;
        if (i == 0) {
            this.c = Internal.EMPTY_BYTE_BUFFER;
            this.l = 0L;
            this.m = 0L;
            this.o = 0L;
            this.n = 0L;
            return;
        }
        g();
    }

    public final long a() {
        return this.o - this.l;
    }

    public final void b() {
        if (this.b.hasNext()) {
            g();
            return;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public final void c(int i, byte[] bArr) {
        if (i >= 0 && i <= e()) {
            int i2 = i;
            while (i2 > 0) {
                if (a() == 0) {
                    b();
                }
                int min = Math.min(i2, (int) a());
                long j = min;
                ro6.e(this.l, bArr, i - i2, j);
                i2 -= min;
                this.l += j;
            }
            return;
        }
        if (i <= 0) {
            if (i == 0) {
                return;
            } else {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void checkLastTagWas(int i) {
        if (this.i == i) {
        } else {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public final void d() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = i - this.k;
        int i3 = this.h;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.g = i4;
            this.f = i - i4;
            return;
        }
        this.g = 0;
    }

    public final int e() {
        return (int) (((this.f - this.j) - this.l) + this.m);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void enableAliasing(boolean z) {
        this.e = z;
    }

    public final ByteBuffer f(int i, int i2) {
        int position = this.c.position();
        int limit = this.c.limit();
        ByteBuffer byteBuffer = this.c;
        try {
            try {
                byteBuffer.position(i);
                byteBuffer.limit(i2);
                return this.c.slice();
            } catch (IllegalArgumentException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        } finally {
            byteBuffer.position(position);
            byteBuffer.limit(limit);
        }
    }

    public final void g() {
        ByteBuffer byteBuffer = (ByteBuffer) this.b.next();
        this.c = byteBuffer;
        this.j += (int) (this.l - this.m);
        long position = byteBuffer.position();
        this.l = position;
        this.m = position;
        this.o = this.c.limit();
        long a = ro6.a(this.c);
        this.n = a;
        this.l += a;
        this.m += a;
        this.o += a;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        int i = this.h;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - getTotalBytesRead();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.i;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return (int) (((this.j - this.k) + this.l) - this.m);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        if ((this.j + this.l) - this.m == this.f) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void popLimit(int i) {
        this.h = i;
        d();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int pushLimit(int i) {
        if (i >= 0) {
            int totalBytesRead = getTotalBytesRead() + i;
            int i2 = this.h;
            if (totalBytesRead <= i2) {
                this.h = totalBytesRead;
                d();
                return i2;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean readBool() {
        if (readRawVarint64() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readByteArray() {
        return readRawBytes(readRawVarint32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteBuffer readByteBuffer() {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0) {
            long j = readRawVarint32;
            if (j <= a()) {
                if (!this.d && this.e) {
                    long j2 = this.l + j;
                    this.l = j2;
                    long j3 = j2 - this.n;
                    return f((int) (j3 - j), (int) j3);
                }
                byte[] bArr = new byte[readRawVarint32];
                ro6.e(this.l, bArr, 0L, j);
                this.l += j;
                return ByteBuffer.wrap(bArr);
            }
        }
        if (readRawVarint32 > 0 && readRawVarint32 <= e()) {
            byte[] bArr2 = new byte[readRawVarint32];
            c(readRawVarint32, bArr2);
            return ByteBuffer.wrap(bArr2);
        }
        if (readRawVarint32 == 0) {
            return Internal.EMPTY_BYTE_BUFFER;
        }
        if (readRawVarint32 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteString readBytes() {
        int readRawVarint32 = readRawVarint32();
        boolean z = this.d;
        if (readRawVarint32 > 0) {
            long j = readRawVarint32;
            long j2 = this.o;
            long j3 = this.l;
            if (j <= j2 - j3) {
                if (z && this.e) {
                    int i = (int) (j3 - this.n);
                    ByteString wrap = ByteString.wrap(f(i, readRawVarint32 + i));
                    this.l += j;
                    return wrap;
                }
                byte[] bArr = new byte[readRawVarint32];
                ro6.e(j3, bArr, 0L, j);
                this.l += j;
                return ByteString.wrap(bArr);
            }
        }
        if (readRawVarint32 > 0 && readRawVarint32 <= e()) {
            if (z && this.e) {
                ArrayList arrayList = new ArrayList();
                while (readRawVarint32 > 0) {
                    if (a() == 0) {
                        b();
                    }
                    int min = Math.min(readRawVarint32, (int) a());
                    int i2 = (int) (this.l - this.n);
                    arrayList.add(ByteString.wrap(f(i2, i2 + min)));
                    readRawVarint32 -= min;
                    this.l += min;
                }
                return ByteString.copyFrom(arrayList);
            }
            byte[] bArr2 = new byte[readRawVarint32];
            c(readRawVarint32, bArr2);
            return ByteString.wrap(bArr2);
        }
        if (readRawVarint32 == 0) {
            return ByteString.EMPTY;
        }
        if (readRawVarint32 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final double readDouble() {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readEnum() {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readFixed32() {
        return readRawLittleEndian32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readFixed64() {
        return readRawLittleEndian64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final float readFloat() {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionRegistryLite) {
        checkRecursionLimit();
        this.recursionDepth++;
        MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i, 4));
        this.recursionDepth--;
        return messageLite;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readInt32() {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readInt64() {
        return readRawVarint64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) {
        int readRawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        if (getBytesUntilLimit() == 0) {
            popLimit(pushLimit);
            return messageLite;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte readRawByte() {
        if (a() == 0) {
            b();
        }
        long j = this.l;
        this.l = 1 + j;
        return ro6.c.d(j);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readRawBytes(int i) {
        if (i >= 0) {
            long j = i;
            if (j <= a()) {
                byte[] bArr = new byte[i];
                ro6.e(this.l, bArr, 0L, j);
                this.l += j;
                return bArr;
            }
        }
        if (i >= 0 && i <= e()) {
            byte[] bArr2 = new byte[i];
            c(i, bArr2);
            return bArr2;
        }
        if (i <= 0) {
            if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawLittleEndian32() {
        if (a() >= 4) {
            long j = this.l;
            this.l = 4 + j;
            qo6 qo6Var = ro6.c;
            return ((qo6Var.d(j + 3) & 255) << 24) | (qo6Var.d(j) & 255) | ((qo6Var.d(1 + j) & 255) << 8) | ((qo6Var.d(2 + j) & 255) << 16);
        }
        return ((readRawByte() & 255) << 24) | (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawLittleEndian64() {
        char c;
        long readRawByte;
        byte readRawByte2;
        if (a() >= 8) {
            long j = this.l;
            this.l = 8 + j;
            c = '8';
            readRawByte = (r0.d(j) & 255) | ((r0.d(j + 1) & 255) << 8) | ((r0.d(j + 2) & 255) << 16) | ((r0.d(3 + j) & 255) << 24) | ((r0.d(4 + j) & 255) << 32) | ((r0.d(5 + j) & 255) << 40) | ((r0.d(6 + j) & 255) << 48);
            readRawByte2 = ro6.c.d(j + 7);
        } else {
            c = '8';
            readRawByte = (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48);
            readRawByte2 = readRawByte();
        }
        return readRawByte | ((readRawByte2 & 255) << c);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawVarint32() {
        int i;
        long j = this.l;
        if (this.o != j) {
            long j2 = j + 1;
            qo6 qo6Var = ro6.c;
            byte d = qo6Var.d(j);
            if (d >= 0) {
                this.l++;
                return d;
            }
            if (this.o - this.l >= 10) {
                long j3 = 2 + j;
                int d2 = (qo6Var.d(j2) << 7) ^ d;
                if (d2 < 0) {
                    i = d2 ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int d3 = (qo6Var.d(j3) << 14) ^ d2;
                    if (d3 >= 0) {
                        i = d3 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int d4 = d3 ^ (qo6Var.d(j4) << 21);
                        if (d4 < 0) {
                            i = (-2080896) ^ d4;
                        } else {
                            j4 = 5 + j;
                            byte d5 = qo6Var.d(j5);
                            int i2 = (d4 ^ (d5 << 28)) ^ 266354560;
                            if (d5 < 0) {
                                j5 = 6 + j;
                                if (qo6Var.d(j4) < 0) {
                                    j4 = 7 + j;
                                    if (qo6Var.d(j5) < 0) {
                                        j5 = 8 + j;
                                        if (qo6Var.d(j4) < 0) {
                                            j4 = 9 + j;
                                            if (qo6Var.d(j5) < 0) {
                                                long j6 = j + 10;
                                                if (qo6Var.d(j4) >= 0) {
                                                    i = i2;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.l = j3;
                return i;
            }
        }
        return (int) readRawVarint64SlowPath();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawVarint64() {
        long j;
        long j2;
        long j3;
        long j4 = this.l;
        if (this.o != j4) {
            long j5 = j4 + 1;
            qo6 qo6Var = ro6.c;
            byte d = qo6Var.d(j4);
            if (d >= 0) {
                this.l++;
                return d;
            }
            if (this.o - this.l >= 10) {
                long j6 = 2 + j4;
                int d2 = (qo6Var.d(j5) << 7) ^ d;
                if (d2 < 0) {
                    j = d2 ^ (-128);
                } else {
                    long j7 = 3 + j4;
                    int d3 = (qo6Var.d(j6) << 14) ^ d2;
                    if (d3 >= 0) {
                        j = d3 ^ 16256;
                    } else {
                        long j8 = 4 + j4;
                        int d4 = d3 ^ (qo6Var.d(j7) << 21);
                        if (d4 < 0) {
                            j = (-2080896) ^ d4;
                            j6 = j8;
                        } else {
                            long j9 = 5 + j4;
                            long d5 = (qo6Var.d(j8) << 28) ^ d4;
                            if (d5 >= 0) {
                                j3 = 266354560;
                            } else {
                                j7 = 6 + j4;
                                long d6 = d5 ^ (qo6Var.d(j9) << 35);
                                if (d6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j9 = 7 + j4;
                                    d5 = d6 ^ (qo6Var.d(j7) << 42);
                                    if (d5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j7 = 8 + j4;
                                        d6 = d5 ^ (qo6Var.d(j9) << 49);
                                        if (d6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j9 = 9 + j4;
                                            long d7 = (d6 ^ (qo6Var.d(j7) << 56)) ^ 71499008037633920L;
                                            if (d7 < 0) {
                                                long j10 = j4 + 10;
                                                if (qo6Var.d(j9) >= 0) {
                                                    j6 = j10;
                                                    j = d7;
                                                }
                                            } else {
                                                j = d7;
                                                j6 = j9;
                                            }
                                        }
                                    }
                                }
                                j = j2 ^ d6;
                            }
                            j = j3 ^ d5;
                            j6 = j9;
                        }
                    }
                    j6 = j7;
                }
                this.l = j6;
                return j;
            }
        }
        return readRawVarint64SlowPath();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawVarint64SlowPath() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((readRawByte() & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readSFixed32() {
        return readRawLittleEndian32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readSFixed64() {
        return readRawLittleEndian64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readSInt32() {
        return CodedInputStream.decodeZigZag32(readRawVarint32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readSInt64() {
        return CodedInputStream.decodeZigZag64(readRawVarint64());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String readString() {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0) {
            long j = readRawVarint32;
            long j2 = this.o;
            long j3 = this.l;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[readRawVarint32];
                ro6.e(j3, bArr, 0L, j);
                String str = new String(bArr, Internal.UTF_8);
                this.l += j;
                return str;
            }
        }
        if (readRawVarint32 > 0 && readRawVarint32 <= e()) {
            byte[] bArr2 = new byte[readRawVarint32];
            c(readRawVarint32, bArr2);
            return new String(bArr2, Internal.UTF_8);
        }
        if (readRawVarint32 == 0) {
            return "";
        }
        if (readRawVarint32 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String readStringRequireUtf8() {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0) {
            long j = readRawVarint32;
            long j2 = this.o;
            long j3 = this.l;
            if (j <= j2 - j3) {
                String a = aq6.a(this.c, (int) (j3 - this.m), readRawVarint32);
                this.l += j;
                return a;
            }
        }
        if (readRawVarint32 >= 0 && readRawVarint32 <= e()) {
            byte[] bArr = new byte[readRawVarint32];
            c(readRawVarint32, bArr);
            return aq6.a.b(bArr, 0, readRawVarint32);
        }
        if (readRawVarint32 == 0) {
            return "";
        }
        if (readRawVarint32 <= 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readTag() {
        if (isAtEnd()) {
            this.i = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.i = readRawVarint32;
        if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
            return this.i;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readUInt32() {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readUInt64() {
        return readRawVarint64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void readUnknownGroup(int i, MessageLite.Builder builder) {
        readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void resetSizeCounter() {
        this.k = (int) ((this.j + this.l) - this.m);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i, CodedOutputStream codedOutputStream) {
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType != 4) {
                            if (tagWireType == 5) {
                                int readRawLittleEndian32 = readRawLittleEndian32();
                                codedOutputStream.writeUInt32NoTag(i);
                                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                                return true;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        return false;
                    }
                    codedOutputStream.writeUInt32NoTag(i);
                    skipMessage(codedOutputStream);
                    int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
                    checkLastTagWas(makeTag);
                    codedOutputStream.writeUInt32NoTag(makeTag);
                    return true;
                }
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            long readRawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeUInt32NoTag(i);
            codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
            return true;
        }
        long readRawVarint64 = readRawVarint64();
        codedOutputStream.writeUInt32NoTag(i);
        codedOutputStream.writeUInt64NoTag(readRawVarint64);
        return true;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void skipRawBytes(int i) {
        if (i >= 0 && i <= ((this.f - this.j) - this.l) + this.m) {
            while (i > 0) {
                if (a() == 0) {
                    b();
                }
                int min = Math.min(i, (int) a());
                i -= min;
                this.l += min;
            }
            return;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
        checkRecursionLimit();
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i, 4));
        this.recursionDepth--;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
        int readRawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        if (getBytesUntilLimit() == 0) {
            popLimit(pushLimit);
            return;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i) {
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            for (int i2 = 0; i2 < 10; i2++) {
                if (readRawByte() >= 0) {
                    return true;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }
        if (tagWireType == 1) {
            skipRawBytes(8);
            return true;
        }
        if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        }
        if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType == 5) {
            skipRawBytes(4);
            return true;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }
}
