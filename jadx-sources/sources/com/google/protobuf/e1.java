package com.google.protobuf;

import com.google.protobuf.Internal;
import defpackage.ro6;
import defpackage.yt4;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class e1 {
    public static final c1 a = new Object();
    public static final d1 b = new Object();

    public void a(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) ro6.l(j, obj);
        if (list instanceof LazyStringList) {
            unmodifiableList = ((LazyStringList) list).getUnmodifiableView();
        } else if (!c1.c.isAssignableFrom(list.getClass())) {
            if ((list instanceof yt4) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (protobufList.isModifiable()) {
                    protobufList.makeImmutable();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        } else {
            return;
        }
        ro6.t(j, obj, unmodifiableList);
    }

    public void b(long j, Object obj, Object obj2) {
        List list = (List) ro6.l(j, obj2);
        List d = c1.d(obj, j, list.size());
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        ro6.t(j, obj, list);
    }

    public List c(long j, Object obj) {
        return c1.d(obj, j, 10);
    }
}
