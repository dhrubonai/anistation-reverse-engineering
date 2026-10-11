package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class kb5 {
    public final ArrayList a;
    public final ArrayList b;
    public final wp5 c;
    public final ArrayList d;

    public kb5(ArrayList arrayList, ArrayList arrayList2, wp5 wp5Var, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = wp5Var;
        this.d = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && kb5.class == obj.getClass()) {
                kb5 kb5Var = (kb5) obj;
                if (this.a.equals(kb5Var.a) && this.b.equals(kb5Var.b) && a34.i(this.c, kb5Var.c) && this.d.equals(kb5Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SceneState(entries=" + this.a + ", overlayScenes=" + this.b + ", currentScene=" + this.c + ", previousScenes=" + this.d + ")";
    }
}
