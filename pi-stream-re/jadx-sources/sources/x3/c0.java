package x3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0.c f11154a;

    /* renamed from: b, reason: collision with root package name */
    public final List f11155b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11156c;

    public c0(Class cls, Class cls2, Class cls3, List list, f.c cVar) {
        this.f11154a = cVar;
        if (!list.isEmpty()) {
            this.f11155b = list;
            this.f11156c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final e0 a(int i10, int i11, androidx.appcompat.widget.a0 a0Var, v3.l lVar, com.bumptech.glide.load.data.g gVar) {
        f0.c cVar = this.f11154a;
        Object j4 = cVar.j();
        w7.b.q(j4);
        List list = (List) j4;
        try {
            List list2 = this.f11155b;
            int size = list2.size();
            e0 e0Var = null;
            for (int i12 = 0; i12 < size; i12++) {
                try {
                    e0Var = ((m) list2.get(i12)).a(i10, i11, a0Var, lVar, gVar);
                } catch (a0 e10) {
                    list.add(e10);
                }
                if (e0Var != null) {
                    break;
                }
            }
            if (e0Var != null) {
                return e0Var;
            }
            throw new a0(this.f11156c, new ArrayList(list));
        } finally {
            cVar.b(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f11155b.toArray()) + '}';
    }
}
