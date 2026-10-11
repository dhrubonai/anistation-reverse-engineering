package x3;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public final class w implements v3.i {

    /* renamed from: b, reason: collision with root package name */
    public final Object f11262b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11263c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11264d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f11265e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f11266f;

    /* renamed from: g, reason: collision with root package name */
    public final v3.i f11267g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f11268h;

    /* renamed from: i, reason: collision with root package name */
    public final v3.l f11269i;

    /* renamed from: j, reason: collision with root package name */
    public int f11270j;

    public w(Object obj, v3.i iVar, int i10, int i11, p4.c cVar, Class cls, Class cls2, v3.l lVar) {
        w7.b.q(obj);
        this.f11262b = obj;
        if (iVar != null) {
            this.f11267g = iVar;
            this.f11263c = i10;
            this.f11264d = i11;
            w7.b.q(cVar);
            this.f11268h = cVar;
            if (cls != null) {
                this.f11265e = cls;
                if (cls2 != null) {
                    this.f11266f = cls2;
                    w7.b.q(lVar);
                    this.f11269i = lVar;
                    return;
                }
                throw new NullPointerException("Transcode class must not be null");
            }
            throw new NullPointerException("Resource class must not be null");
        }
        throw new NullPointerException("Signature must not be null");
    }

    @Override // v3.i
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // v3.i
    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (!this.f11262b.equals(wVar.f11262b) || !this.f11267g.equals(wVar.f11267g) || this.f11264d != wVar.f11264d || this.f11263c != wVar.f11263c || !this.f11268h.equals(wVar.f11268h) || !this.f11265e.equals(wVar.f11265e) || !this.f11266f.equals(wVar.f11266f) || !this.f11269i.equals(wVar.f11269i)) {
            return false;
        }
        return true;
    }

    @Override // v3.i
    public final int hashCode() {
        if (this.f11270j == 0) {
            int hashCode = this.f11262b.hashCode();
            this.f11270j = hashCode;
            int hashCode2 = ((((this.f11267g.hashCode() + (hashCode * 31)) * 31) + this.f11263c) * 31) + this.f11264d;
            this.f11270j = hashCode2;
            int hashCode3 = this.f11268h.hashCode() + (hashCode2 * 31);
            this.f11270j = hashCode3;
            int hashCode4 = this.f11265e.hashCode() + (hashCode3 * 31);
            this.f11270j = hashCode4;
            int hashCode5 = this.f11266f.hashCode() + (hashCode4 * 31);
            this.f11270j = hashCode5;
            this.f11270j = this.f11269i.hashCode() + (hashCode5 * 31);
        }
        return this.f11270j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f11262b + ", width=" + this.f11263c + ", height=" + this.f11264d + ", resourceClass=" + this.f11265e + ", transcodeClass=" + this.f11266f + ", signature=" + this.f11267g + ", hashCode=" + this.f11270j + ", transformations=" + this.f11268h + ", options=" + this.f11269i + '}';
    }
}
