package p7;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8734a;

    /* renamed from: b, reason: collision with root package name */
    public final h f8735b;

    /* renamed from: c, reason: collision with root package name */
    public final h7.l f8736c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8737d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f8738e;

    public s(Object obj, h hVar, h7.l lVar, Object obj2, Throwable th) {
        this.f8734a = obj;
        this.f8735b = hVar;
        this.f8736c = lVar;
        this.f8737d = obj2;
        this.f8738e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    public static s a(s sVar, h hVar, CancellationException cancellationException, int i10) {
        Object obj;
        h7.l lVar;
        Object obj2 = null;
        if ((i10 & 1) != 0) {
            obj = sVar.f8734a;
        } else {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            hVar = sVar.f8735b;
        }
        h hVar2 = hVar;
        if ((i10 & 4) != 0) {
            lVar = sVar.f8736c;
        } else {
            lVar = null;
        }
        if ((i10 & 8) != 0) {
            obj2 = sVar.f8737d;
        }
        Object obj3 = obj2;
        CancellationException cancellationException2 = cancellationException;
        if ((i10 & 16) != 0) {
            cancellationException2 = sVar.f8738e;
        }
        sVar.getClass();
        return new s(obj, hVar2, lVar, obj3, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return r6.h0.g(this.f8734a, sVar.f8734a) && r6.h0.g(this.f8735b, sVar.f8735b) && r6.h0.g(this.f8736c, sVar.f8736c) && r6.h0.g(this.f8737d, sVar.f8737d) && r6.h0.g(this.f8738e, sVar.f8738e);
    }

    public final int hashCode() {
        Object obj = this.f8734a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        h hVar = this.f8735b;
        int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        h7.l lVar = this.f8736c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f8737d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f8738e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f8734a + ", cancelHandler=" + this.f8735b + ", onCancellation=" + this.f8736c + ", idempotentResume=" + this.f8737d + ", cancelCause=" + this.f8738e + ')';
    }

    public /* synthetic */ s(Object obj, h hVar, h7.l lVar, CancellationException cancellationException, int i10) {
        this(obj, (i10 & 2) != 0 ? null : hVar, (i10 & 4) != 0 ? null : lVar, (Object) null, (i10 & 16) != 0 ? null : cancellationException);
    }
}
