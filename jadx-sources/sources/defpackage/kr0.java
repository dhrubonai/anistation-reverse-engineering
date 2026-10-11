package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kr0 {
    public final String a;
    public final Set b;
    public final Set c;
    public final byte d;
    public final boolean e;
    public final es0 f;
    public final Set g;

    /* JADX WARN: Multi-variable type inference failed */
    public kr0(String str, Set set, Set set2, int i, int i2, es0 es0Var, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = es0Var;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static kr0 a(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(px4.a(cls));
        for (Class cls2 : clsArr) {
            v94.l(cls2, "Null interface");
            hashSet.add(px4.a(cls2));
        }
        return new kr0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new ir0(obj, (byte) 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + ((int) this.d) + ", type=" + (this.e ? 1 : 0) + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
