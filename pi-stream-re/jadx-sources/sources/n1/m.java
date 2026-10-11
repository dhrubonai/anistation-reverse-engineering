package n1;

import c1.v;
import f1.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r6.o0;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final v f7959a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f7960b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7961c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7962d;

    /* renamed from: e, reason: collision with root package name */
    public final List f7963e;

    /* renamed from: f, reason: collision with root package name */
    public final List f7964f;

    /* renamed from: g, reason: collision with root package name */
    public final j f7965g;

    public m(v vVar, o0 o0Var, s sVar, ArrayList arrayList, List list, List list2) {
        w7.b.g(!o0Var.isEmpty());
        this.f7959a = vVar;
        this.f7960b = o0.j(o0Var);
        this.f7962d = Collections.unmodifiableList(arrayList);
        this.f7963e = list;
        this.f7964f = list2;
        this.f7965g = sVar.a(this);
        this.f7961c = b0.V(sVar.f7982c, 1000000L, sVar.f7981b);
    }

    public abstract String a();

    public abstract m1.k l();

    public abstract j m();
}
