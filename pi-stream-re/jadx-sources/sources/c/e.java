package c;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f1579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d.a f1580c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1581d;

    public /* synthetic */ e(Object obj, Serializable serializable, d.a aVar, int i10) {
        this.f1578a = i10;
        this.f1581d = obj;
        this.f1579b = serializable;
        this.f1580c = aVar;
    }

    @Override // c.c
    public final void a(Object obj) {
        int i10 = this.f1578a;
        d.a aVar = this.f1580c;
        Object obj2 = this.f1581d;
        Serializable serializable = this.f1579b;
        switch (i10) {
            case 0:
                h hVar = (h) obj2;
                String str = (String) serializable;
                Integer num = (Integer) hVar.f1588c.get(str);
                if (num != null) {
                    hVar.f1590e.add(str);
                    try {
                        ((h) obj2).b(num.intValue(), aVar, obj);
                        return;
                    } catch (Exception e10) {
                        hVar.f1590e.remove(str);
                        throw e10;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            case 1:
                h hVar2 = (h) obj2;
                String str2 = (String) serializable;
                Integer num2 = (Integer) hVar2.f1588c.get(str2);
                if (num2 != null) {
                    hVar2.f1590e.add(str2);
                    try {
                        ((h) obj2).b(num2.intValue(), aVar, obj);
                        return;
                    } catch (Exception e11) {
                        hVar2.f1590e.remove(str2);
                        throw e11;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                c cVar = (c) ((AtomicReference) serializable).get();
                if (cVar != null) {
                    cVar.a(obj);
                    return;
                }
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
    }

    @Override // c.c
    public final void b() {
        int i10 = this.f1578a;
        Object obj = this.f1581d;
        Serializable serializable = this.f1579b;
        switch (i10) {
            case 0:
                ((h) obj).f((String) serializable);
                return;
            case 1:
                ((h) obj).f((String) serializable);
                return;
            default:
                c cVar = (c) ((AtomicReference) serializable).getAndSet(null);
                if (cVar != null) {
                    cVar.b();
                    return;
                }
                return;
        }
    }
}
