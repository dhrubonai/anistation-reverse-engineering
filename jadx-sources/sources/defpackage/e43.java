package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class e43 implements InvocationHandler {
    public final ArrayList a;
    public boolean b;
    public String c;

    public e43(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (a34.i(name, "supports") && a34.i(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (a34.i(name, "unsupported") && a34.i(Void.TYPE, returnType)) {
            this.b = true;
            return null;
        }
        boolean i = a34.i(name, "protocols");
        ArrayList arrayList = this.a;
        if (i && objArr.length == 0) {
            return arrayList;
        }
        if ((a34.i(name, "selectProtocol") || a34.i(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i2 = 0;
                    while (true) {
                        Object obj3 = list.get(i2);
                        obj3.getClass();
                        String str = (String) obj3;
                        if (arrayList.contains(str)) {
                            this.c = str;
                            return str;
                        }
                        if (i2 == size) {
                            break;
                        }
                        i2++;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.c = str2;
                return str2;
            }
        }
        if ((a34.i(name, "protocolSelected") || a34.i(name, "selected")) && objArr.length == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            this.c = (String) obj4;
            return null;
        }
        return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
    }
}
