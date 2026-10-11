package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vd5 extends p2 {
    public final im0 a;
    public final List b;
    public final rb3 c = bx7.B(jf3.y, new nj4(this, 14));
    public final Map d;
    public final LinkedHashMap e;

    public vd5(im0 im0Var, e73[] e73VarArr, x73[] x73VarArr, Annotation[] annotationArr) {
        this.a = im0Var;
        this.b = nt1.x;
        if (e73VarArr.length == x73VarArr.length) {
            int min = Math.min(e73VarArr.length, x73VarArr.length);
            ArrayList arrayList = new ArrayList(min);
            for (int i = 0; i < min; i++) {
                arrayList.add(new ai4(e73VarArr[i], x73VarArr[i]));
            }
            Map Y = vn3.Y(arrayList);
            this.d = Y;
            Set<Map.Entry> entrySet = Y.entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : entrySet) {
                String a = ((x73) entry.getValue()).getDescriptor().a();
                Object obj = linkedHashMap.get(a);
                if (obj == null) {
                    linkedHashMap.containsKey(a);
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (entry2 == null) {
                    linkedHashMap.put(a, entry);
                } else {
                    StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                    sb.append(this.a);
                    sb.append("' have the same serial name '");
                    sb.append(a);
                    sb.append("': '");
                    sb.append(entry2.getKey());
                    Object key = entry.getKey();
                    sb.append("', '");
                    sb.append(key);
                    sb.append('\'');
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(vn3.S(linkedHashMap.size()));
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry3.getKey(), (x73) ((Map.Entry) entry3.getValue()).getValue());
            }
            this.e = linkedHashMap2;
            List asList = Arrays.asList(annotationArr);
            asList.getClass();
            this.b = asList;
            return;
        }
        throw new IllegalArgumentException("All subclasses of sealed class " + im0Var.f() + " should be marked @Serializable");
    }

    @Override // defpackage.p2
    public final e73 a() {
        return this.a;
    }

    @Override // defpackage.p2
    public final mj5 findPolymorphicSerializerOrNull(wt1 wt1Var, Object obj) {
        x73 findPolymorphicSerializerOrNull;
        wt1Var.getClass();
        obj.getClass();
        x73 x73Var = (x73) this.d.get(z05.a(obj.getClass()));
        if (x73Var != null) {
            findPolymorphicSerializerOrNull = x73Var;
        } else {
            findPolymorphicSerializerOrNull = super.findPolymorphicSerializerOrNull(wt1Var, obj);
        }
        if (findPolymorphicSerializerOrNull != null) {
            return findPolymorphicSerializerOrNull;
        }
        return null;
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return (aj5) this.c.getValue();
    }

    @Override // defpackage.p2
    public final ne1 findPolymorphicSerializerOrNull(gu0 gu0Var, String str) {
        gu0Var.getClass();
        x73 x73Var = (x73) this.e.get(str);
        return x73Var != null ? x73Var : super.findPolymorphicSerializerOrNull(gu0Var, str);
    }
}
