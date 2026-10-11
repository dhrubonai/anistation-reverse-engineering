package com.google.protobuf;

import java.util.Comparator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j implements Comparator {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, com.google.protobuf.ByteString$ByteIterator] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Iterator, com.google.protobuf.ByteString$ByteIterator] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        ByteString byteString = (ByteString) obj;
        ByteString byteString2 = (ByteString) obj2;
        ?? iterator2 = byteString.iterator2();
        ?? iterator22 = byteString2.iterator2();
        while (iterator2.hasNext() && iterator22.hasNext()) {
            i = ByteString.toInt(iterator2.nextByte());
            Integer valueOf = Integer.valueOf(i);
            i2 = ByteString.toInt(iterator22.nextByte());
            int compareTo = valueOf.compareTo(Integer.valueOf(i2));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(byteString.size()).compareTo(Integer.valueOf(byteString2.size()));
    }
}
