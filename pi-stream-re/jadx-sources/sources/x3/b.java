package x3;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class b extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final v3.i f11146a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11147b;

    /* renamed from: c, reason: collision with root package name */
    public e0 f11148c;

    public b(v3.i iVar, y yVar, ReferenceQueue referenceQueue, boolean z9) {
        super(yVar, referenceQueue);
        e0 e0Var;
        w7.b.q(iVar);
        this.f11146a = iVar;
        if (yVar.f11271a && z9) {
            e0Var = yVar.f11273c;
            w7.b.q(e0Var);
        } else {
            e0Var = null;
        }
        this.f11148c = e0Var;
        this.f11147b = yVar.f11271a;
    }
}
