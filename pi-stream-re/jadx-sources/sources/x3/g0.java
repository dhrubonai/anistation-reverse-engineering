package x3;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class g0 implements v3.i {

    /* renamed from: j, reason: collision with root package name */
    public static final p4.i f11182j = new p4.i(50);

    /* renamed from: b, reason: collision with root package name */
    public final y3.h f11183b;

    /* renamed from: c, reason: collision with root package name */
    public final v3.i f11184c;

    /* renamed from: d, reason: collision with root package name */
    public final v3.i f11185d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11186e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11187f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f11188g;

    /* renamed from: h, reason: collision with root package name */
    public final v3.l f11189h;

    /* renamed from: i, reason: collision with root package name */
    public final v3.p f11190i;

    public g0(y3.h hVar, v3.i iVar, v3.i iVar2, int i10, int i11, v3.p pVar, Class cls, v3.l lVar) {
        this.f11183b = hVar;
        this.f11184c = iVar;
        this.f11185d = iVar2;
        this.f11186e = i10;
        this.f11187f = i11;
        this.f11190i = pVar;
        this.f11188g = cls;
        this.f11189h = lVar;
    }

    @Override // v3.i
    public final void a(MessageDigest messageDigest) {
        Object f10;
        y3.h hVar = this.f11183b;
        synchronized (hVar) {
            y3.g gVar = (y3.g) hVar.f11593b.e();
            gVar.f11590b = 8;
            gVar.f11591c = byte[].class;
            f10 = hVar.f(gVar, byte[].class);
        }
        byte[] bArr = (byte[]) f10;
        ByteBuffer.wrap(bArr).putInt(this.f11186e).putInt(this.f11187f).array();
        this.f11185d.a(messageDigest);
        this.f11184c.a(messageDigest);
        messageDigest.update(bArr);
        v3.p pVar = this.f11190i;
        if (pVar != null) {
            pVar.a(messageDigest);
        }
        this.f11189h.a(messageDigest);
        p4.i iVar = f11182j;
        Class cls = this.f11188g;
        byte[] bArr2 = (byte[]) iVar.a(cls);
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(v3.i.f10644a);
            iVar.d(cls, bArr2);
        }
        messageDigest.update(bArr2);
        this.f11183b.h(bArr);
    }

    @Override // v3.i
    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (this.f11187f != g0Var.f11187f || this.f11186e != g0Var.f11186e || !p4.m.b(this.f11190i, g0Var.f11190i) || !this.f11188g.equals(g0Var.f11188g) || !this.f11184c.equals(g0Var.f11184c) || !this.f11185d.equals(g0Var.f11185d) || !this.f11189h.equals(g0Var.f11189h)) {
            return false;
        }
        return true;
    }

    @Override // v3.i
    public final int hashCode() {
        int hashCode = ((((this.f11185d.hashCode() + (this.f11184c.hashCode() * 31)) * 31) + this.f11186e) * 31) + this.f11187f;
        v3.p pVar = this.f11190i;
        if (pVar != null) {
            hashCode = (hashCode * 31) + pVar.hashCode();
        }
        return this.f11189h.hashCode() + ((this.f11188g.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f11184c + ", signature=" + this.f11185d + ", width=" + this.f11186e + ", height=" + this.f11187f + ", decodedResourceClass=" + this.f11188g + ", transformation='" + this.f11190i + "', options=" + this.f11189h + '}';
    }
}
