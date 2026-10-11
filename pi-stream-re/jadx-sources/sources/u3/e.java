package u3;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import y3.h;

/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public int[] f10224a;

    /* renamed from: c, reason: collision with root package name */
    public final z3.e f10226c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f10227d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f10228e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f10229f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f10230g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f10231h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f10232i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f10233j;

    /* renamed from: k, reason: collision with root package name */
    public int f10234k;

    /* renamed from: l, reason: collision with root package name */
    public c f10235l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f10236m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10237n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f10238p;

    /* renamed from: q, reason: collision with root package name */
    public int f10239q;

    /* renamed from: r, reason: collision with root package name */
    public int f10240r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f10241s;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f10225b = new int[256];

    /* renamed from: t, reason: collision with root package name */
    public Bitmap.Config f10242t = Bitmap.Config.ARGB_8888;

    public e(z3.e eVar, c cVar, ByteBuffer byteBuffer, int i10) {
        int[] iArr;
        this.f10226c = eVar;
        this.f10235l = new c();
        synchronized (this) {
            if (i10 > 0) {
                int highestOneBit = Integer.highestOneBit(i10);
                this.o = 0;
                this.f10235l = cVar;
                this.f10234k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f10227d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f10227d.order(ByteOrder.LITTLE_ENDIAN);
                this.f10237n = false;
                Iterator it = cVar.f10213e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((b) it.next()).f10204g == 3) {
                        this.f10237n = true;
                        break;
                    }
                }
                this.f10238p = highestOneBit;
                int i11 = cVar.f10214f;
                this.f10240r = i11 / highestOneBit;
                int i12 = cVar.f10215g;
                this.f10239q = i12 / highestOneBit;
                this.f10232i = this.f10226c.A(i11 * i12);
                z3.e eVar2 = this.f10226c;
                int i13 = this.f10240r * this.f10239q;
                Object obj = eVar2.f12045c;
                if (((h) obj) == null) {
                    iArr = new int[i13];
                } else {
                    iArr = (int[]) ((h) obj).d(i13, int[].class);
                }
                this.f10233j = iArr;
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
        }
    }

    public final Bitmap a() {
        Bitmap.Config config;
        Boolean bool = this.f10241s;
        if (bool != null && !bool.booleanValue()) {
            config = this.f10242t;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap i10 = ((y3.d) this.f10226c.f12044b).i(this.f10240r, this.f10239q, config);
        i10.setHasAlpha(true);
        return i10;
    }

    public final synchronized Bitmap b() {
        b bVar;
        if (this.f10235l.f10211c <= 0 || this.f10234k < 0) {
            if (Log.isLoggable("e", 3)) {
                Log.d("e", "Unable to decode frame, frameCount=" + this.f10235l.f10211c + ", framePointer=" + this.f10234k);
            }
            this.o = 1;
        }
        int i10 = this.o;
        if (i10 != 1 && i10 != 2) {
            this.o = 0;
            if (this.f10228e == null) {
                this.f10228e = this.f10226c.A(255);
            }
            b bVar2 = (b) this.f10235l.f10213e.get(this.f10234k);
            int i11 = this.f10234k - 1;
            if (i11 >= 0) {
                bVar = (b) this.f10235l.f10213e.get(i11);
            } else {
                bVar = null;
            }
            int[] iArr = bVar2.f10208k;
            if (iArr == null) {
                iArr = this.f10235l.f10209a;
            }
            this.f10224a = iArr;
            if (iArr == null) {
                if (Log.isLoggable("e", 3)) {
                    Log.d("e", "No valid color table found for frame #" + this.f10234k);
                }
                this.o = 1;
                return null;
            }
            if (bVar2.f10203f) {
                System.arraycopy(iArr, 0, this.f10225b, 0, iArr.length);
                int[] iArr2 = this.f10225b;
                this.f10224a = iArr2;
                iArr2[bVar2.f10205h] = 0;
                if (bVar2.f10204g == 2 && this.f10234k == 0) {
                    this.f10241s = Boolean.TRUE;
                }
            }
            return d(bVar2, bVar);
        }
        if (Log.isLoggable("e", 3)) {
            Log.d("e", "Unable to decode frame, status=" + this.o);
        }
        return null;
    }

    public final void c(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.f10242t = config;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r3.f10218j == r36.f10205h) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap d(u3.b r36, u3.b r37) {
        /*
            Method dump skipped, instructions count: 1075
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.e.d(u3.b, u3.b):android.graphics.Bitmap");
    }
}
