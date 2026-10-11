package com.google.protobuf;

import com.google.protobuf.Internal;
import defpackage.ro6;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d1 extends e1 {
    @Override // com.google.protobuf.e1
    public final void a(long j, Object obj) {
        ((Internal.ProtobufList) ro6.l(j, obj)).makeImmutable();
    }

    @Override // com.google.protobuf.e1
    public final void b(long j, Object obj, Object obj2) {
        Internal.ProtobufList protobufList = (Internal.ProtobufList) ro6.l(j, obj);
        Internal.ProtobufList protobufList2 = (Internal.ProtobufList) ro6.l(j, obj2);
        int size = protobufList.size();
        int size2 = protobufList2.size();
        if (size > 0 && size2 > 0) {
            if (!protobufList.isModifiable()) {
                protobufList = protobufList.mutableCopyWithCapacity2(size2 + size);
            }
            protobufList.addAll(protobufList2);
        }
        if (size > 0) {
            protobufList2 = protobufList;
        }
        ro6.t(j, obj, protobufList2);
    }

    @Override // com.google.protobuf.e1
    public final List c(long j, Object obj) {
        int i;
        Internal.ProtobufList protobufList = (Internal.ProtobufList) ro6.l(j, obj);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            Internal.ProtobufList mutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(i);
            ro6.t(j, obj, mutableCopyWithCapacity2);
            return mutableCopyWithCapacity2;
        }
        return protobufList;
    }
}
