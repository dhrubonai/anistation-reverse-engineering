package com.google.protobuf;

import defpackage.k75;
import defpackage.l75;
import defpackage.p65;
import defpackage.qi2;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u1 extends ByteString {
    public static final int[] C = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int A;
    public final int B;
    public final int x;
    public final ByteString y;
    public final ByteString z;

    public u1(ByteString byteString, ByteString byteString2) {
        this.y = byteString;
        this.z = byteString2;
        int size = byteString.size();
        this.A = size;
        this.x = byteString2.size() + size;
        this.B = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    public static int b(int i) {
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return C[i];
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.B);
        arrayDeque.push(this);
        ByteString byteString = this.y;
        while (byteString instanceof u1) {
            u1 u1Var = (u1) byteString;
            arrayDeque.push(u1Var);
            byteString = u1Var.y;
        }
        l lVar = (l) byteString;
        while (true) {
            if (lVar != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                l lVar2 = null;
                if (lVar == null) {
                    qi2.e();
                    return null;
                }
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        break;
                    }
                    ByteString byteString2 = ((u1) arrayDeque.pop()).z;
                    while (byteString2 instanceof u1) {
                        u1 u1Var2 = (u1) byteString2;
                        arrayDeque.push(u1Var2);
                        byteString2 = u1Var2.y;
                    }
                    l lVar3 = (l) byteString2;
                    if (!lVar3.isEmpty()) {
                        lVar2 = lVar3;
                        break;
                    }
                }
                arrayList.add(lVar.asReadOnlyByteBuffer());
                lVar = lVar2;
            } else {
                return arrayList;
            }
        }
    }

    @Override // com.google.protobuf.ByteString
    public final byte byteAt(int i) {
        ByteString.checkIndex(i, this.x);
        return internalByteAt(i);
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        this.y.copyTo(byteBuffer);
        this.z.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        ByteString byteString = this.y;
        int i5 = this.A;
        if (i4 <= i5) {
            byteString.copyToInternal(bArr, i, i2, i3);
            return;
        }
        ByteString byteString2 = this.z;
        if (i >= i5) {
            byteString2.copyToInternal(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        byteString.copyToInternal(bArr, i, i2, i6);
        byteString2.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        boolean b;
        if (obj != this) {
            if (obj instanceof ByteString) {
                ByteString byteString = (ByteString) obj;
                int size = byteString.size();
                int i = this.x;
                if (i == size) {
                    if (i != 0) {
                        int peekCachedHashCode = peekCachedHashCode();
                        int peekCachedHashCode2 = byteString.peekCachedHashCode();
                        if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
                            k75 k75Var = new k75(this);
                            l next = k75Var.next();
                            k75 k75Var2 = new k75(byteString);
                            l next2 = k75Var2.next();
                            int i2 = 0;
                            int i3 = 0;
                            int i4 = 0;
                            while (true) {
                                int size2 = next.size() - i2;
                                int size3 = next2.size() - i3;
                                int min = Math.min(size2, size3);
                                if (i2 == 0) {
                                    b = next.b(next2, i3, min);
                                } else {
                                    b = next2.b(next, i2, min);
                                }
                                if (!b) {
                                    break;
                                }
                                i4 += min;
                                if (i4 >= i) {
                                    if (i4 == i) {
                                        return true;
                                    }
                                    p65.l();
                                    return false;
                                }
                                if (min == size2) {
                                    next = k75Var.next();
                                    i2 = 0;
                                } else {
                                    i2 += min;
                                }
                                if (min == size3) {
                                    next2 = k75Var2.next();
                                    i3 = 0;
                                } else {
                                    i3 += min;
                                }
                            }
                        }
                    } else {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.ByteString
    public final int getTreeDepth() {
        return this.B;
    }

    @Override // com.google.protobuf.ByteString
    public final byte internalByteAt(int i) {
        int i2 = this.A;
        if (i < i2) {
            return this.y.internalByteAt(i);
        }
        return this.z.internalByteAt(i - i2);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isBalanced() {
        if (this.x >= b(this.B)) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        int partialIsValidUtf8 = this.y.partialIsValidUtf8(0, 0, this.A);
        ByteString byteString = this.z;
        if (byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator */
    public final Iterator<Byte> iterator2() {
        return new t1(this);
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new l75(this);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.y;
        int i5 = this.A;
        if (i4 <= i5) {
            return byteString.partialHash(i, i2, i3);
        }
        ByteString byteString2 = this.z;
        if (i2 >= i5) {
            return byteString2.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.partialHash(byteString.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.y;
        int i5 = this.A;
        if (i4 <= i5) {
            return byteString.partialIsValidUtf8(i, i2, i3);
        }
        ByteString byteString2 = this.z;
        if (i2 >= i5) {
            return byteString2.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.partialIsValidUtf8(byteString.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.x;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i, int i2) {
        int i3 = this.x;
        int checkRange = ByteString.checkRange(i, i2, i3);
        if (checkRange == 0) {
            return ByteString.EMPTY;
        }
        if (checkRange == i3) {
            return this;
        }
        ByteString byteString = this.y;
        int i4 = this.A;
        if (i2 <= i4) {
            return byteString.substring(i, i2);
        }
        ByteString byteString2 = this.z;
        if (i >= i4) {
            return byteString2.substring(i - i4, i2 - i4);
        }
        return new u1(byteString.substring(i), byteString2.substring(0, i2 - i4));
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) {
        this.y.writeTo(outputStream);
        this.z.writeTo(outputStream);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        ByteString byteString = this.y;
        int i4 = this.A;
        if (i3 <= i4) {
            byteString.writeToInternal(outputStream, i, i2);
            return;
        }
        ByteString byteString2 = this.z;
        if (i >= i4) {
            byteString2.writeToInternal(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        byteString.writeToInternal(outputStream, i, i5);
        byteString2.writeToInternal(outputStream, 0, i2 - i5);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToReverse(ByteOutput byteOutput) {
        this.z.writeToReverse(byteOutput);
        this.y.writeToReverse(byteOutput);
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator, reason: avoid collision after fix types in other method */
    public final Iterator<Byte> iterator2() {
        return new t1(this);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) {
        this.y.writeTo(byteOutput);
        this.z.writeTo(byteOutput);
    }
}
