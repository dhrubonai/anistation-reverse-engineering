package com.google.protobuf;

import com.google.protobuf.Internal;
import defpackage.ro6;
import defpackage.yt4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c1 extends e1 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(Object obj, long j, int i) {
        List arrayList;
        List list = (List) ro6.l(j, obj);
        if (list.isEmpty()) {
            if (list instanceof LazyStringList) {
                arrayList = new LazyStringArrayList(i);
            } else if ((list instanceof yt4) && (list instanceof Internal.ProtobufList)) {
                arrayList = ((Internal.ProtobufList) list).mutableCopyWithCapacity2(i);
            } else {
                arrayList = new ArrayList(i);
            }
            ro6.t(j, obj, arrayList);
            return arrayList;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            ro6.t(j, obj, arrayList2);
            return arrayList2;
        }
        if (list instanceof UnmodifiableLazyStringList) {
            LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(list.size() + i);
            lazyStringArrayList.addAll((UnmodifiableLazyStringList) list);
            ro6.t(j, obj, lazyStringArrayList);
            return lazyStringArrayList;
        }
        if ((list instanceof yt4) && (list instanceof Internal.ProtobufList)) {
            Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
            if (!protobufList.isModifiable()) {
                Internal.ProtobufList mutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(list.size() + i);
                ro6.t(j, obj, mutableCopyWithCapacity2);
                return mutableCopyWithCapacity2;
            }
        }
        return list;
    }
}
