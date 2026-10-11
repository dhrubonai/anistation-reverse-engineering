package q0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f8940d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f8941a;

    /* renamed from: b, reason: collision with root package name */
    public final i.g f8942b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f8943c = 0;

    public r(i.g gVar, int i10) {
        this.f8942b = gVar;
        this.f8941a = i10;
    }

    public final int a(int i10) {
        r0.a d10 = d();
        int a10 = d10.a(16);
        if (a10 != 0) {
            ByteBuffer byteBuffer = d10.f9299b;
            int i11 = a10 + d10.f9298a;
            return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
        }
        return 0;
    }

    public final int b() {
        r0.a d10 = d();
        int a10 = d10.a(16);
        if (a10 != 0) {
            int i10 = a10 + d10.f9298a;
            return d10.f9299b.getInt(d10.f9299b.getInt(i10) + i10);
        }
        return 0;
    }

    public final int c() {
        r0.a d10 = d();
        int a10 = d10.a(4);
        if (a10 != 0) {
            return d10.f9299b.getInt(a10 + d10.f9298a);
        }
        return 0;
    }

    public final r0.a d() {
        ThreadLocal threadLocal = f8940d;
        r0.a aVar = (r0.a) threadLocal.get();
        if (aVar == null) {
            aVar = new r0.a();
            threadLocal.set(aVar);
        }
        r0.b bVar = (r0.b) this.f8942b.f5196b;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i10 = a10 + bVar.f9298a;
            int i11 = (this.f8941a * 4) + bVar.f9299b.getInt(i10) + i10 + 4;
            aVar.b(bVar.f9299b.getInt(i11) + i11, bVar.f9299b);
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(c()));
        sb.append(", codepoints:");
        int b10 = b();
        for (int i10 = 0; i10 < b10; i10++) {
            sb.append(Integer.toHexString(a(i10)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
