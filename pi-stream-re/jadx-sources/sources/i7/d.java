package i7;

import h7.n;
import h7.o;
import h7.p;
import h7.q;
import h7.r;
import h7.s;
import h7.t;
import h7.u;
import h7.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import r6.h0;

/* loaded from: classes.dex */
public final class d implements m7.b, c {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f5405b;

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f5406c;

    /* renamed from: a, reason: collision with root package name */
    public final Class f5407a;

    static {
        int i10 = 0;
        List M = com.bumptech.glide.c.M(h7.a.class, h7.l.class, p.class, v7.d.class, q.class, r.class, s.class, t.class, u.class, v.class, h7.b.class, h7.c.class, h7.d.class, h7.e.class, h7.f.class, h7.g.class, h7.h.class, h7.i.class, h7.j.class, h7.k.class, h7.m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(x6.j.o0(M));
        for (Object obj : M) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                arrayList.add(new w6.b((Class) obj, Integer.valueOf(i10)));
                i10 = i11;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        f5405b = o7.f.h1(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        h0.s(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            h0.q(str);
            sb.append(o7.j.F1(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f5405b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h0.m0(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), o7.j.F1((String) entry2.getValue()));
        }
        f5406c = linkedHashMap;
    }

    public d(Class cls) {
        h0.u(cls, "jClass");
        this.f5407a = cls;
    }

    @Override // i7.c
    public final Class a() {
        return this.f5407a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof d) && h0.g(com.bumptech.glide.d.x(this), com.bumptech.glide.d.x((m7.b) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return com.bumptech.glide.d.x(this).hashCode();
    }

    public final String toString() {
        return this.f5407a.toString() + " (Kotlin reflection is not available)";
    }
}
