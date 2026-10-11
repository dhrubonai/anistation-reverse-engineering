package j1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final v1.r f5933a;

    /* renamed from: d, reason: collision with root package name */
    public int f5936d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5937e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5935c = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Object f5934b = new Object();

    public z0(v1.a aVar, boolean z9) {
        this.f5933a = new v1.r(aVar, z9);
    }

    @Override // j1.s0
    public final c1.e1 a() {
        return this.f5933a.o;
    }

    @Override // j1.s0
    public final Object getUid() {
        return this.f5934b;
    }
}
