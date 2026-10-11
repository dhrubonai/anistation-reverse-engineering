package g9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import r6.h0;

/* loaded from: classes.dex */
public final class h implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final List f4504a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4505b;

    /* renamed from: c, reason: collision with root package name */
    public String f4506c;

    public h(ArrayList arrayList) {
        this.f4504a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean z9;
        h0.u(obj, "proxy");
        h0.u(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (h0.g(name, "supports") && h0.g(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (h0.g(name, "unsupported") && h0.g(Void.TYPE, returnType)) {
            this.f4505b = true;
            return null;
        }
        boolean g10 = h0.g(name, "protocols");
        List list = this.f4504a;
        if (g10) {
            if (objArr.length == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                return list;
            }
        }
        if ((h0.g(name, "selectProtocol") || h0.g(name, "select")) && h0.g(String.class, returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                h0.r(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list2 = (List) obj2;
                int size = list2.size();
                if (size >= 0) {
                    int i10 = 0;
                    while (true) {
                        Object obj3 = list2.get(i10);
                        h0.r(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (list.contains(str)) {
                            this.f4506c = str;
                            return str;
                        }
                        if (i10 == size) {
                            break;
                        }
                        i10++;
                    }
                }
                String str2 = (String) list.get(0);
                this.f4506c = str2;
                return str2;
            }
        }
        if ((h0.g(name, "protocolSelected") || h0.g(name, "selected")) && objArr.length == 1) {
            Object obj4 = objArr[0];
            h0.r(obj4, "null cannot be cast to non-null type kotlin.String");
            this.f4506c = (String) obj4;
            return null;
        }
        return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
    }
}
