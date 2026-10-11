package d1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    public int f3074b;

    /* renamed from: c, reason: collision with root package name */
    public float f3075c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f3076d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public b f3077e;

    /* renamed from: f, reason: collision with root package name */
    public b f3078f;

    /* renamed from: g, reason: collision with root package name */
    public b f3079g;

    /* renamed from: h, reason: collision with root package name */
    public b f3080h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3081i;

    /* renamed from: j, reason: collision with root package name */
    public f f3082j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f3083k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f3084l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f3085m;

    /* renamed from: n, reason: collision with root package name */
    public long f3086n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3087p;

    public g() {
        b bVar = b.f3040e;
        this.f3077e = bVar;
        this.f3078f = bVar;
        this.f3079g = bVar;
        this.f3080h = bVar;
        ByteBuffer byteBuffer = d.f3045a;
        this.f3083k = byteBuffer;
        this.f3084l = byteBuffer.asShortBuffer();
        this.f3085m = byteBuffer;
        this.f3074b = -1;
    }

    @Override // d1.d
    public final boolean a() {
        if (this.f3078f.f3041a != -1 && (Math.abs(this.f3075c - 1.0f) >= 1.0E-4f || Math.abs(this.f3076d - 1.0f) >= 1.0E-4f || this.f3078f.f3041a != this.f3077e.f3041a)) {
            return true;
        }
        return false;
    }

    @Override // d1.d
    public final boolean b() {
        f fVar;
        if (this.f3087p && ((fVar = this.f3082j) == null || fVar.f3065m * fVar.f3054b * 2 == 0)) {
            return true;
        }
        return false;
    }

    @Override // d1.d
    public final void f() {
        this.f3075c = 1.0f;
        this.f3076d = 1.0f;
        b bVar = b.f3040e;
        this.f3077e = bVar;
        this.f3078f = bVar;
        this.f3079g = bVar;
        this.f3080h = bVar;
        ByteBuffer byteBuffer = d.f3045a;
        this.f3083k = byteBuffer;
        this.f3084l = byteBuffer.asShortBuffer();
        this.f3085m = byteBuffer;
        this.f3074b = -1;
        this.f3081i = false;
        this.f3082j = null;
        this.f3086n = 0L;
        this.o = 0L;
        this.f3087p = false;
    }

    @Override // d1.d
    public final void flush() {
        if (a()) {
            b bVar = this.f3077e;
            this.f3079g = bVar;
            b bVar2 = this.f3078f;
            this.f3080h = bVar2;
            if (this.f3081i) {
                this.f3082j = new f(this.f3075c, this.f3076d, bVar.f3041a, bVar.f3042b, bVar2.f3041a);
            } else {
                f fVar = this.f3082j;
                if (fVar != null) {
                    fVar.f3063k = 0;
                    fVar.f3065m = 0;
                    fVar.o = 0;
                    fVar.f3067p = 0;
                    fVar.f3068q = 0;
                    fVar.f3069r = 0;
                    fVar.f3070s = 0;
                    fVar.f3071t = 0;
                    fVar.f3072u = 0;
                    fVar.f3073v = 0;
                }
            }
        }
        this.f3085m = d.f3045a;
        this.f3086n = 0L;
        this.o = 0L;
        this.f3087p = false;
    }

    @Override // d1.d
    public final ByteBuffer g() {
        f fVar = this.f3082j;
        if (fVar != null) {
            int i10 = fVar.f3065m;
            int i11 = fVar.f3054b;
            int i12 = i10 * i11 * 2;
            if (i12 > 0) {
                if (this.f3083k.capacity() < i12) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
                    this.f3083k = order;
                    this.f3084l = order.asShortBuffer();
                } else {
                    this.f3083k.clear();
                    this.f3084l.clear();
                }
                ShortBuffer shortBuffer = this.f3084l;
                int min = Math.min(shortBuffer.remaining() / i11, fVar.f3065m);
                int i13 = min * i11;
                shortBuffer.put(fVar.f3064l, 0, i13);
                int i14 = fVar.f3065m - min;
                fVar.f3065m = i14;
                short[] sArr = fVar.f3064l;
                System.arraycopy(sArr, i13, sArr, 0, i14 * i11);
                this.o += i12;
                this.f3083k.limit(i12);
                this.f3085m = this.f3083k;
            }
        }
        ByteBuffer byteBuffer = this.f3085m;
        this.f3085m = d.f3045a;
        return byteBuffer;
    }

    @Override // d1.d
    public final void h() {
        f fVar = this.f3082j;
        if (fVar != null) {
            int i10 = fVar.f3063k;
            float f10 = fVar.f3055c;
            float f11 = fVar.f3056d;
            int i11 = fVar.f3065m + ((int) ((((i10 / (f10 / f11)) + fVar.o) / (fVar.f3057e * f11)) + 0.5f));
            short[] sArr = fVar.f3062j;
            int i12 = fVar.f3060h * 2;
            fVar.f3062j = fVar.b(sArr, i10, i12 + i10);
            int i13 = 0;
            while (true) {
                int i14 = fVar.f3054b;
                if (i13 >= i12 * i14) {
                    break;
                }
                fVar.f3062j[(i14 * i10) + i13] = 0;
                i13++;
            }
            fVar.f3063k = i12 + fVar.f3063k;
            fVar.e();
            if (fVar.f3065m > i11) {
                fVar.f3065m = i11;
            }
            fVar.f3063k = 0;
            fVar.f3069r = 0;
            fVar.o = 0;
        }
        this.f3087p = true;
    }

    @Override // d1.d
    public final void i(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        f fVar = this.f3082j;
        fVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f3086n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = fVar.f3054b;
        int i11 = remaining2 / i10;
        short[] b10 = fVar.b(fVar.f3062j, fVar.f3063k, i11);
        fVar.f3062j = b10;
        asShortBuffer.get(b10, fVar.f3063k * i10, ((i11 * i10) * 2) / 2);
        fVar.f3063k += i11;
        fVar.e();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // d1.d
    public final b j(b bVar) {
        if (bVar.f3043c == 2) {
            int i10 = this.f3074b;
            if (i10 == -1) {
                i10 = bVar.f3041a;
            }
            this.f3077e = bVar;
            b bVar2 = new b(i10, bVar.f3042b, 2);
            this.f3078f = bVar2;
            this.f3081i = true;
            return bVar2;
        }
        throw new c(bVar);
    }
}
