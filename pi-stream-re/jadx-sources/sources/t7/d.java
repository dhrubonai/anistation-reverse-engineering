package t7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final w4.o f10055a = new w4.o("CLOSED", 3);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [t7.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [t7.x] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static final Object a(v7.k kVar, long j4, h7.p pVar) {
        boolean z9;
        while (true) {
            if (kVar.f10091c >= j4 && !kVar.a()) {
                return kVar;
            }
            Object obj = e.f10056a.get(kVar);
            w4.o oVar = f10055a;
            if (obj == oVar) {
                return oVar;
            }
            ?? r02 = (x) ((e) obj);
            if (r02 == 0) {
                r02 = (x) pVar.invoke(Long.valueOf(kVar.f10091c + 1), kVar);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f10056a;
                    if (atomicReferenceFieldUpdater.compareAndSet(kVar, null, r02)) {
                        z9 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(kVar) != null) {
                        z9 = false;
                        break;
                    }
                }
                if (z9) {
                    if (kVar.a()) {
                        kVar.b();
                    }
                }
            }
            kVar = r02;
        }
    }
}
