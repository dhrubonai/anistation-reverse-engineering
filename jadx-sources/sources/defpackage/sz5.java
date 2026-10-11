package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public class sz5 implements pz5 {
    public final boolean c;
    public final String[] d;
    public final List[] e;
    public final int f;
    public final int[] g;
    public final int[] h;

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, gh0] */
    public sz5(Map map, boolean z) {
        map.getClass();
        this.c = z;
        if (map.isEmpty()) {
            this.f = 0;
            this.d = new String[0];
            this.e = new List[0];
            this.g = new int[0];
            this.h = new int[0];
            return;
        }
        if (!z) {
            int size = map.size();
            this.f = size;
            this.d = new String[size];
            this.e = new List[size];
            int e = rz5.e(size);
            int[] iArr = new int[e];
            for (int i = 0; i < e; i++) {
                iArr[i] = -1;
            }
            this.g = iArr;
            int i2 = this.f;
            int[] iArr2 = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr2[i3] = -1;
            }
            this.h = iArr2;
            int i4 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                this.d[i4] = str;
                List[] listArr = this.e;
                int size2 = list.size();
                ArrayList arrayList = new ArrayList(size2);
                for (int i5 = 0; i5 < size2; i5++) {
                    arrayList.add((String) list.get(i5));
                }
                listArr[i4] = arrayList;
                int e2 = e(str) & (e - 1);
                int[] iArr3 = this.h;
                int[] iArr4 = this.g;
                iArr3[i4] = iArr4[e2];
                iArr4[e2] = i4;
                i4++;
            }
            return;
        }
        ?? obj = new Object();
        obj.x = gh0.F;
        obj.y = gh0.G;
        obj.A = gh0.H;
        for (Map.Entry entry2 : map.entrySet()) {
            String str2 = (String) entry2.getKey();
            List list2 = (List) entry2.getValue();
            List list3 = (List) obj.get(str2);
            if (list3 != null) {
                obj.put(yo0.u0(list2, list3), str2);
            } else {
                obj.put(list2, str2);
            }
        }
        int i6 = obj.z;
        this.f = i6;
        this.d = new String[i6];
        this.e = new List[i6];
        int e3 = rz5.e(i6);
        int[] iArr5 = new int[e3];
        for (int i7 = 0; i7 < e3; i7++) {
            iArr5[i7] = -1;
        }
        this.g = iArr5;
        int i8 = this.f;
        int[] iArr6 = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr6[i9] = -1;
        }
        this.h = iArr6;
        Iterator it = ((dh0) obj.entrySet()).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it.next();
            String str3 = (String) entry3.getKey();
            List list4 = (List) entry3.getValue();
            this.d[i10] = str3;
            List[] listArr2 = this.e;
            int size3 = list4.size();
            ArrayList arrayList2 = new ArrayList(size3);
            for (int i11 = 0; i11 < size3; i11++) {
                arrayList2.add((String) list4.get(i11));
            }
            listArr2[i10] = arrayList2;
            int e4 = e(str3) & (e3 - 1);
            int[] iArr7 = this.h;
            int[] iArr8 = this.g;
            iArr7[i10] = iArr8[e4];
            iArr8[e4] = i10;
            i10++;
        }
    }

    @Override // defpackage.pz5
    public final Set a() {
        int i = this.f;
        if (i == 0) {
            return tt1.x;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i2 = 0; i2 < i; i2++) {
            linkedHashSet.add(new dn3(this.d[i2], this.e[i2]));
        }
        return linkedHashSet;
    }

    @Override // defpackage.pz5
    public final void b(ic2 ic2Var) {
        for (int i = 0; i < this.f; i++) {
            ic2Var.invoke(this.d[i], this.e[i]);
        }
    }

    @Override // defpackage.pz5
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.pz5
    public final List d(String str) {
        str.getClass();
        return f(str);
    }

    public final int e(String str) {
        if (this.c) {
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i = (i * 31) + Character.toLowerCase(str.charAt(i2));
            }
            return i;
        }
        return str.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pz5) {
            pz5 pz5Var = (pz5) obj;
            if (this.c != pz5Var.c()) {
                return false;
            }
            return a().equals(pz5Var.a());
        }
        return false;
    }

    public final List f(String str) {
        if (this.f != 0) {
            int e = e(str);
            int i = this.g[e & (r1.length - 1)];
            while (i >= 0) {
                if (b06.C(this.d[i], str, this.c)) {
                    return this.e[i];
                }
                i = this.h[i];
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.pz5
    public final String get(String str) {
        List f = f(str);
        if (f != null) {
            return (String) yo0.m0(f);
        }
        return null;
    }

    public final int hashCode() {
        Set a = a();
        return a.hashCode() + (Boolean.hashCode(this.c) * 961);
    }

    @Override // defpackage.pz5
    public final boolean isEmpty() {
        if (this.f == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.pz5
    public final Set names() {
        int i = this.f;
        if (i == 0) {
            return tt1.x;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i2 = 0; i2 < i; i2++) {
            linkedHashSet.add(this.d[i2]);
        }
        return linkedHashSet;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StringValues(case=");
        sb.append(!this.c);
        sb.append(") ");
        sb.append(a());
        return sb.toString();
    }
}
