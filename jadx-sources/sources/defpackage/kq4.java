package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public class kq4 implements aj5, kf0 {
    public final String a;
    public final wd2 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final rb3 i;
    public final rb3 j;
    public final rb3 k;

    public kq4(String str, wd2 wd2Var, int i) {
        this.a = str;
        this.b = wd2Var;
        this.c = i;
        String[] strArr = new String[i];
        final byte b = 0;
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = ot1.x;
        sb2 sb2Var = new sb2(this) { // from class: jq4
            public final /* synthetic */ kq4 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                x73[] childSerializers;
                ArrayList arrayList;
                x73[] typeParametersSerializers;
                byte b2 = b;
                kq4 kq4Var = this.y;
                switch (b2) {
                    case 0:
                        wd2 wd2Var2 = kq4Var.b;
                        if (wd2Var2 == null || (childSerializers = wd2Var2.childSerializers()) == null) {
                            return t80.e;
                        }
                        return childSerializers;
                    case 1:
                        wd2 wd2Var3 = kq4Var.b;
                        if (wd2Var3 != null && (typeParametersSerializers = wd2Var3.typeParametersSerializers()) != null) {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (x73 x73Var : typeParametersSerializers) {
                                arrayList.add(x73Var.getDescriptor());
                            }
                        } else {
                            arrayList = null;
                        }
                        return db.H(arrayList);
                    default:
                        return Integer.valueOf(o80.z(kq4Var, (aj5[]) kq4Var.j.getValue()));
                }
            }
        };
        jf3 jf3Var = jf3.y;
        this.i = bx7.B(jf3Var, sb2Var);
        final byte b2 = 1;
        this.j = bx7.B(jf3Var, new sb2(this) { // from class: jq4
            public final /* synthetic */ kq4 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                x73[] childSerializers;
                ArrayList arrayList;
                x73[] typeParametersSerializers;
                byte b22 = b2;
                kq4 kq4Var = this.y;
                switch (b22) {
                    case 0:
                        wd2 wd2Var2 = kq4Var.b;
                        if (wd2Var2 == null || (childSerializers = wd2Var2.childSerializers()) == null) {
                            return t80.e;
                        }
                        return childSerializers;
                    case 1:
                        wd2 wd2Var3 = kq4Var.b;
                        if (wd2Var3 != null && (typeParametersSerializers = wd2Var3.typeParametersSerializers()) != null) {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (x73 x73Var : typeParametersSerializers) {
                                arrayList.add(x73Var.getDescriptor());
                            }
                        } else {
                            arrayList = null;
                        }
                        return db.H(arrayList);
                    default:
                        return Integer.valueOf(o80.z(kq4Var, (aj5[]) kq4Var.j.getValue()));
                }
            }
        });
        final byte b3 = 2;
        this.k = bx7.B(jf3Var, new sb2(this) { // from class: jq4
            public final /* synthetic */ kq4 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                x73[] childSerializers;
                ArrayList arrayList;
                x73[] typeParametersSerializers;
                byte b22 = b3;
                kq4 kq4Var = this.y;
                switch (b22) {
                    case 0:
                        wd2 wd2Var2 = kq4Var.b;
                        if (wd2Var2 == null || (childSerializers = wd2Var2.childSerializers()) == null) {
                            return t80.e;
                        }
                        return childSerializers;
                    case 1:
                        wd2 wd2Var3 = kq4Var.b;
                        if (wd2Var3 != null && (typeParametersSerializers = wd2Var3.typeParametersSerializers()) != null) {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (x73 x73Var : typeParametersSerializers) {
                                arrayList.add(x73Var.getDescriptor());
                            }
                        } else {
                            arrayList = null;
                        }
                        return db.H(arrayList);
                    default:
                        return Integer.valueOf(o80.z(kq4Var, (aj5[]) kq4Var.j.getValue()));
                }
            }
        });
    }

    @Override // defpackage.aj5
    public final String a() {
        return this.a;
    }

    @Override // defpackage.kf0
    public final Set b() {
        return this.h.keySet();
    }

    @Override // defpackage.aj5
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.aj5
    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kq4) {
                aj5 aj5Var = (aj5) obj;
                if (this.a.equals(aj5Var.a()) && Arrays.equals((aj5[]) this.j.getValue(), (aj5[]) ((kq4) obj).j.getValue())) {
                    int e = aj5Var.e();
                    int i = this.c;
                    if (i == e) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (a34.i(h(i2).a(), aj5Var.h(i2).a()) && a34.i(h(i2).getKind(), aj5Var.h(i2).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.aj5
    public final String f(int i) {
        return this.e[i];
    }

    @Override // defpackage.aj5
    public final List g(int i) {
        List list = this.f[i];
        if (list == null) {
            return nt1.x;
        }
        return list;
    }

    @Override // defpackage.aj5
    public final List getAnnotations() {
        return nt1.x;
    }

    @Override // defpackage.aj5
    public hj5 getKind() {
        return f06.a;
    }

    @Override // defpackage.aj5
    public aj5 h(int i) {
        return ((x73[]) this.i.getValue())[i].getDescriptor();
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.aj5
    public final boolean i(int i) {
        return this.g[i];
    }

    public final void j(String str, boolean z) {
        str.getClass();
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = hashMap;
        }
    }

    public String toString() {
        return o80.L(this);
    }
}
