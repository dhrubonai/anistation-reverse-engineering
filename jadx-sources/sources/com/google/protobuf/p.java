package com.google.protobuf;

import com.google.protobuf.MessageLite;
import defpackage.aq6;
import defpackage.qx1;
import defpackage.ze0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p extends CodedInputStream {
    public final InputStream a;
    public final byte[] b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public p(InputStream inputStream, int i) {
        super();
        this.h = Integer.MAX_VALUE;
        Internal.checkNotNull(inputStream, "input");
        this.a = inputStream;
        this.b = new byte[i];
        this.c = 0;
        this.e = 0;
        this.g = 0;
    }

    public final byte[] a(int i, boolean z) {
        byte[] b = b(i);
        if (b != null) {
            if (z) {
                return (byte[]) b.clone();
            }
            return b;
        }
        int i2 = this.e;
        int i3 = this.c;
        int i4 = i3 - i2;
        this.g += i3;
        this.e = 0;
        this.c = 0;
        ArrayList c = c(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.b, i2, bArr, 0, i4);
        int size = c.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = c.get(i5);
            i5++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] b(int i) {
        if (i == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        if (i >= 0) {
            int i2 = this.g;
            int i3 = this.e;
            int i4 = i2 + i3 + i;
            if (i4 - this.sizeLimit <= 0) {
                int i5 = this.h;
                if (i4 <= i5) {
                    int i6 = this.c - i3;
                    int i7 = i - i6;
                    InputStream inputStream = this.a;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > inputStream.available()) {
                                return null;
                            }
                        } catch (InvalidProtocolBufferException e) {
                            e.setThrownFromInputStream();
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.b, this.e, bArr, 0, i6);
                    this.g += this.c;
                    this.e = 0;
                    this.c = 0;
                    while (i6 < i) {
                        try {
                            int read = inputStream.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.g += read;
                                i6 += read;
                            } else {
                                throw InvalidProtocolBufferException.truncatedMessage();
                            }
                        } catch (InvalidProtocolBufferException e2) {
                            e2.setThrownFromInputStream();
                            throw e2;
                        }
                    }
                    return bArr;
                }
                skipRawBytes((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public final ArrayList c(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, CodedOutputStream.DEFAULT_BUFFER_SIZE);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.a.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.g += read;
                    i2 += read;
                } else {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void checkLastTagWas(int i) {
        if (this.f == i) {
        } else {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public final void d() {
        int i = this.c + this.d;
        this.c = i;
        int i2 = this.g + i;
        int i3 = this.h;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.d = i4;
            this.c = i - i4;
            return;
        }
        this.d = 0;
    }

    public final void e(int i) {
        if (!f(i)) {
            if (i > (this.sizeLimit - this.g) - this.e) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final boolean f(int i) {
        InputStream inputStream = this.a;
        int i2 = this.e;
        int i3 = i2 + i;
        int i4 = this.c;
        if (i3 > i4) {
            int i5 = this.sizeLimit;
            int i6 = this.g;
            if (i <= (i5 - i6) - i2 && i6 + i2 + i <= this.h) {
                byte[] bArr = this.b;
                if (i2 > 0) {
                    if (i4 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    i6 = this.g + i2;
                    this.g = i6;
                    i4 = this.c - i2;
                    this.c = i4;
                    this.e = 0;
                }
                try {
                    int read = inputStream.read(bArr, i4, Math.min(bArr.length - i4, (this.sizeLimit - i6) - i4));
                    if (read != 0 && read >= -1 && read <= bArr.length) {
                        if (read > 0) {
                            this.c += read;
                            d();
                            if (this.c >= i) {
                                return true;
                            }
                            return f(i);
                        }
                    } else {
                        throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.setThrownFromInputStream();
                    throw e;
                }
            }
            return false;
        }
        ze0.m(qx1.i(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        return false;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        int i = this.h;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.g + this.e);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.f;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return this.g + this.e;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        if (this.e == this.c && !f(1)) {
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
            int i2 = this.g + this.e + i;
            int i3 = this.h;
            if (i2 <= i3) {
                this.h = i2;
                d();
                return i3;
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
        int readRawVarint32 = readRawVarint32();
        int i = this.c;
        int i2 = this.e;
        if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
            byte[] copyOfRange = Arrays.copyOfRange(this.b, i2, i2 + readRawVarint32);
            this.e += readRawVarint32;
            return copyOfRange;
        }
        if (readRawVarint32 >= 0) {
            return a(readRawVarint32, false);
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteBuffer readByteBuffer() {
        int readRawVarint32 = readRawVarint32();
        int i = this.c;
        int i2 = this.e;
        if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
            ByteBuffer wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.b, i2, i2 + readRawVarint32));
            this.e += readRawVarint32;
            return wrap;
        }
        if (readRawVarint32 == 0) {
            return Internal.EMPTY_BYTE_BUFFER;
        }
        if (readRawVarint32 >= 0) {
            return ByteBuffer.wrap(a(readRawVarint32, true));
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteString readBytes() {
        int readRawVarint32 = readRawVarint32();
        int i = this.c;
        int i2 = this.e;
        int i3 = i - i2;
        byte[] bArr = this.b;
        if (readRawVarint32 <= i3 && readRawVarint32 > 0) {
            ByteString copyFrom = ByteString.copyFrom(bArr, i2, readRawVarint32);
            this.e += readRawVarint32;
            return copyFrom;
        }
        if (readRawVarint32 == 0) {
            return ByteString.EMPTY;
        }
        if (readRawVarint32 >= 0) {
            byte[] b = b(readRawVarint32);
            if (b != null) {
                return ByteString.copyFrom(b);
            }
            int i4 = this.e;
            int i5 = this.c;
            int i6 = i5 - i4;
            this.g += i5;
            this.e = 0;
            this.c = 0;
            ArrayList c = c(readRawVarint32 - i6);
            byte[] bArr2 = new byte[readRawVarint32];
            System.arraycopy(bArr, i4, bArr2, 0, i6);
            int size = c.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = c.get(i7);
                i7++;
                byte[] bArr3 = (byte[]) obj;
                System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
                i6 += bArr3.length;
            }
            return ByteString.wrap(bArr2);
        }
        throw InvalidProtocolBufferException.negativeSize();
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
        if (this.e == this.c) {
            e(1);
        }
        int i = this.e;
        this.e = i + 1;
        return this.b[i];
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readRawBytes(int i) {
        int i2 = this.e;
        if (i <= this.c - i2 && i > 0) {
            int i3 = i + i2;
            this.e = i3;
            return Arrays.copyOfRange(this.b, i2, i3);
        }
        return a(i, false);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawLittleEndian32() {
        int i = this.e;
        if (this.c - i < 4) {
            e(4);
            i = this.e;
        }
        this.e = i + 4;
        byte[] bArr = this.b;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawLittleEndian64() {
        int i = this.e;
        if (this.c - i < 8) {
            e(8);
            i = this.e;
        }
        this.e = i + 8;
        byte[] bArr = this.b;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawVarint32() {
        int i;
        int i2 = this.e;
        int i3 = this.c;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.b;
            byte b = bArr[i2];
            if (b >= 0) {
                this.e = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.e = i5;
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
        long j4;
        int i = this.e;
        int i2 = this.c;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.b;
            byte b = bArr[i];
            if (b >= 0) {
                this.e = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.e = i4;
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
        byte[] bArr = this.b;
        if (readRawVarint32 > 0) {
            int i = this.c;
            int i2 = this.e;
            if (readRawVarint32 <= i - i2) {
                String str = new String(bArr, i2, readRawVarint32, Internal.UTF_8);
                this.e += readRawVarint32;
                return str;
            }
        }
        if (readRawVarint32 == 0) {
            return "";
        }
        if (readRawVarint32 >= 0) {
            if (readRawVarint32 <= this.c) {
                e(readRawVarint32);
                String str2 = new String(bArr, this.e, readRawVarint32, Internal.UTF_8);
                this.e += readRawVarint32;
                return str2;
            }
            return new String(a(readRawVarint32, false), Internal.UTF_8);
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String readStringRequireUtf8() {
        int readRawVarint32 = readRawVarint32();
        int i = this.e;
        int i2 = this.c;
        int i3 = i2 - i;
        byte[] bArr = this.b;
        if (readRawVarint32 <= i3 && readRawVarint32 > 0) {
            this.e = i + readRawVarint32;
        } else {
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 >= 0) {
                i = 0;
                if (readRawVarint32 <= i2) {
                    e(readRawVarint32);
                    this.e = readRawVarint32;
                } else {
                    bArr = a(readRawVarint32, false);
                }
            } else {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }
        return aq6.a.b(bArr, i, readRawVarint32);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readTag() {
        if (isAtEnd()) {
            this.f = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.f = readRawVarint32;
        if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
            return this.f;
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
        this.g = -this.e;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i) {
        int tagWireType = WireFormat.getTagWireType(i);
        int i2 = 0;
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType == 4) {
                            return false;
                        }
                        if (tagWireType == 5) {
                            skipRawBytes(4);
                            return true;
                        }
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    skipMessage();
                    checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
                    return true;
                }
                skipRawBytes(readRawVarint32());
                return true;
            }
            skipRawBytes(8);
            return true;
        }
        if (this.c - this.e >= 10) {
            while (i2 < 10) {
                int i3 = this.e;
                this.e = i3 + 1;
                if (this.b[i3] < 0) {
                    i2++;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }
        while (i2 < 10) {
            if (readRawByte() < 0) {
                i2++;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
        return true;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void skipRawBytes(int i) {
        int i2 = this.c;
        int i3 = this.e;
        if (i <= i2 - i3 && i >= 0) {
            this.e = i3 + i;
            return;
        }
        InputStream inputStream = this.a;
        if (i >= 0) {
            int i4 = this.g;
            int i5 = i4 + i3;
            int i6 = i5 + i;
            int i7 = this.h;
            if (i6 <= i7) {
                this.g = i5;
                int i8 = i2 - i3;
                this.c = 0;
                this.e = 0;
                while (i8 < i) {
                    long j = i - i8;
                    try {
                        try {
                            long skip = inputStream.skip(j);
                            if (skip >= 0 && skip <= j) {
                                if (skip == 0) {
                                    break;
                                } else {
                                    i8 += (int) skip;
                                }
                            } else {
                                throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (InvalidProtocolBufferException e) {
                            e.setThrownFromInputStream();
                            throw e;
                        }
                    } catch (Throwable th) {
                        this.g += i8;
                        d();
                        throw th;
                    }
                }
                this.g += i8;
                d();
                if (i8 < i) {
                    int i9 = this.c;
                    int i10 = i9 - this.e;
                    this.e = i9;
                    e(1);
                    while (true) {
                        int i11 = i - i10;
                        int i12 = this.c;
                        if (i11 > i12) {
                            i10 += i12;
                            this.e = i12;
                            e(1);
                        } else {
                            this.e = i11;
                            return;
                        }
                    }
                }
            } else {
                skipRawBytes((i7 - i4) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        } else {
            throw InvalidProtocolBufferException.negativeSize();
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void enableAliasing(boolean z) {
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
    public final boolean skipField(int i, CodedOutputStream codedOutputStream) {
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            long readRawVarint64 = readRawVarint64();
            codedOutputStream.writeUInt32NoTag(i);
            codedOutputStream.writeUInt64NoTag(readRawVarint64);
            return true;
        }
        if (tagWireType == 1) {
            long readRawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeUInt32NoTag(i);
            codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
            return true;
        }
        if (tagWireType == 2) {
            ByteString readBytes = readBytes();
            codedOutputStream.writeUInt32NoTag(i);
            codedOutputStream.writeBytesNoTag(readBytes);
            return true;
        }
        if (tagWireType == 3) {
            codedOutputStream.writeUInt32NoTag(i);
            skipMessage(codedOutputStream);
            int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
            checkLastTagWas(makeTag);
            codedOutputStream.writeUInt32NoTag(makeTag);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType == 5) {
            int readRawLittleEndian32 = readRawLittleEndian32();
            codedOutputStream.writeUInt32NoTag(i);
            codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
            return true;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }
}
