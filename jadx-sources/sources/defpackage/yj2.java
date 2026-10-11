package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class yj2 extends n0 {
    public final x73 a;
    public final x73 b;
    public final /* synthetic */ byte c;
    public final xj2 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yj2(x73 x73Var, x73 x73Var2, byte b) {
        this(x73Var, x73Var2, (char) 0);
        this.c = b;
        x73Var.getClass();
        x73Var2.getClass();
        switch (b) {
            case 1:
                this(x73Var, x73Var2, (char) 0);
                aj5 descriptor = x73Var.getDescriptor();
                aj5 descriptor2 = x73Var2.getDescriptor();
                descriptor.getClass();
                descriptor2.getClass();
                this.d = new xj2("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
                return;
            default:
                aj5 descriptor3 = x73Var.getDescriptor();
                aj5 descriptor4 = x73Var2.getDescriptor();
                descriptor3.getClass();
                descriptor4.getClass();
                this.d = new xj2("kotlin.collections.HashMap", descriptor3, descriptor4);
                return;
        }
    }

    @Override // defpackage.n0
    public final Object a() {
        switch (this.c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // defpackage.n0
    public final int b(Object obj) {
        int size;
        switch (this.c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                size = hashMap.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // defpackage.n0
    public final void c(Object obj) {
        switch (this.c) {
            case 0:
                ((HashMap) obj).getClass();
                return;
            default:
                ((LinkedHashMap) obj).getClass();
                return;
        }
    }

    @Override // defpackage.n0
    public final Iterator d(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.entrySet().iterator();
        }
    }

    @Override // defpackage.n0
    public final int e(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.size();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.size();
        }
    }

    @Override // defpackage.n0
    public final void f(int i, gu0 gu0Var, Object obj) {
        ((Map) obj).getClass();
        throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
    }

    @Override // defpackage.n0
    public final void g(int i, gu0 gu0Var, Object obj) {
        Object p;
        Map map = (Map) obj;
        map.getClass();
        Object p2 = gu0Var.p(getDescriptor(), i, this.a, null);
        int i2 = gu0Var.i(getDescriptor());
        if (i2 == i + 1) {
            boolean containsKey = map.containsKey(p2);
            x73 x73Var = this.b;
            if (containsKey && !(x73Var.getDescriptor().getKind() instanceof xt4)) {
                p = gu0Var.p(getDescriptor(), i2, x73Var, vn3.Q(p2, map));
            } else {
                p = gu0Var.p(getDescriptor(), i2, x73Var, null);
            }
            map.put(p2, p);
            return;
        }
        ze0.e(zo5.m("Value must follow key in a map, index for key: ", ", returned index for value: ", i, i2));
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        byte b = this.c;
        return this.d;
    }

    @Override // defpackage.n0
    public final Object h(Object obj) {
        Object obj2 = null;
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                if (map instanceof HashMap) {
                    obj2 = (HashMap) map;
                }
                if (obj2 == null) {
                    return new HashMap(map);
                }
                return obj2;
            default:
                Map map2 = (Map) obj;
                if (map2 instanceof LinkedHashMap) {
                    obj2 = (LinkedHashMap) map2;
                }
                if (obj2 == null) {
                    return new LinkedHashMap(map2);
                }
                return obj2;
        }
    }

    @Override // defpackage.n0
    public final Object i(Object obj) {
        switch (this.c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                return hashMap;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                return linkedHashMap;
        }
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        e(obj);
        aj5 descriptor = getDescriptor();
        descriptor.getClass();
        hu0 c = wt1Var.c(descriptor);
        Iterator d = d(obj);
        int i = 0;
        while (d.hasNext()) {
            Map.Entry entry = (Map.Entry) d.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            v0 v0Var = (v0) c;
            v0Var.v(getDescriptor(), i, this.a, key);
            i += 2;
            v0Var.v(getDescriptor(), i2, this.b, value);
        }
        c.a(descriptor);
    }

    public yj2(x73 x73Var, x73 x73Var2, char c) {
        this.a = x73Var;
        this.b = x73Var2;
    }
}
