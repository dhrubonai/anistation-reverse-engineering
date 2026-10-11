package androidx.work;

import defpackage.a34;
import defpackage.e41;
import defpackage.i75;
import defpackage.nz2;
import defpackage.p65;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends nz2 {
    @Override // defpackage.nz2
    public final e41 a(ArrayList arrayList) {
        Class<?> cls;
        Object newInstance;
        i75 i75Var = new i75((byte) 13);
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Map unmodifiableMap = Collections.unmodifiableMap(((e41) obj).a);
            unmodifiableMap.getClass();
            for (Map.Entry entry : unmodifiableMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    cls = value.getClass();
                } else {
                    cls = String.class;
                }
                Object obj2 = hashMap.get(str);
                if (obj2 == null) {
                    if (cls.isArray()) {
                        value.getClass();
                    } else {
                        newInstance = Array.newInstance(cls, 1);
                        Array.set(newInstance, 0, value);
                        newInstance.getClass();
                        value = newInstance;
                    }
                } else {
                    Class<?> cls2 = obj2.getClass();
                    if (cls2.equals(cls)) {
                        value.getClass();
                        int length = Array.getLength(obj2);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj2.getClass().getComponentType();
                        componentType.getClass();
                        Object newInstance2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj2, 0, newInstance2, 0, length);
                        System.arraycopy(value, 0, newInstance2, length, length2);
                        newInstance2.getClass();
                        value = newInstance2;
                    } else if (a34.i(cls2.getComponentType(), cls)) {
                        int length3 = Array.getLength(obj2);
                        newInstance = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj2, 0, newInstance, 0, length3);
                        Array.set(newInstance, length3, value);
                        newInstance.getClass();
                        value = newInstance;
                    } else {
                        p65.b();
                        return null;
                    }
                }
                hashMap.put(str, value);
            }
        }
        i75Var.s(hashMap);
        return i75Var.f();
    }
}
