package d1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class e implements d {

    /* renamed from: b, reason: collision with root package name */
    public b f3046b;

    /* renamed from: c, reason: collision with root package name */
    public b f3047c;

    /* renamed from: d, reason: collision with root package name */
    public b f3048d;

    /* renamed from: e, reason: collision with root package name */
    public b f3049e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f3050f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f3051g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3052h;

    public e() {
        ByteBuffer byteBuffer = d.f3045a;
        this.f3050f = byteBuffer;
        this.f3051g = byteBuffer;
        b bVar = b.f3040e;
        this.f3048d = bVar;
        this.f3049e = bVar;
        this.f3046b = bVar;
        this.f3047c = bVar;
    }

    @Override // d1.d
    public boolean a() {
        if (this.f3049e != b.f3040e) {
            return true;
        }
        return false;
    }

    @Override // d1.d
    public boolean b() {
        if (this.f3052h && this.f3051g == d.f3045a) {
            return true;
        }
        return false;
    }

    public abstract b c(b bVar);

    public void d() {
    }

    public void e() {
    }

    @Override // d1.d
    public final void f() {
        flush();
        this.f3050f = d.f3045a;
        b bVar = b.f3040e;
        this.f3048d = bVar;
        this.f3049e = bVar;
        this.f3046b = bVar;
        this.f3047c = bVar;
        k();
    }

    @Override // d1.d
    public final void flush() {
        this.f3051g = d.f3045a;
        this.f3052h = false;
        this.f3046b = this.f3048d;
        this.f3047c = this.f3049e;
        d();
    }

    @Override // d1.d
    public ByteBuffer g() {
        ByteBuffer byteBuffer = this.f3051g;
        this.f3051g = d.f3045a;
        return byteBuffer;
    }

    @Override // d1.d
    public final void h() {
        this.f3052h = true;
        e();
    }

    @Override // d1.d
    public final b j(b bVar) {
        this.f3048d = bVar;
        this.f3049e = c(bVar);
        if (a()) {
            return this.f3049e;
        }
        return b.f3040e;
    }

    public void k() {
    }

    public final ByteBuffer l(int i10) {
        if (this.f3050f.capacity() < i10) {
            this.f3050f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f3050f.clear();
        }
        ByteBuffer byteBuffer = this.f3050f;
        this.f3051g = byteBuffer;
        return byteBuffer;
    }
}
