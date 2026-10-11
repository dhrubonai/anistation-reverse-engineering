package u3;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f10221b;

    /* renamed from: c, reason: collision with root package name */
    public c f10222c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10220a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    public int f10223d = 0;

    public final boolean a() {
        if (this.f10222c.f10210b != 0) {
            return true;
        }
        return false;
    }

    public final c b() {
        boolean z9;
        boolean z10;
        boolean z11;
        byte[] bArr;
        boolean z12;
        if (this.f10221b != null) {
            if (a()) {
                return this.f10222c;
            }
            StringBuilder sb = new StringBuilder();
            for (int i10 = 0; i10 < 6; i10++) {
                sb.append((char) c());
            }
            if (!sb.toString().startsWith("GIF")) {
                this.f10222c.f10210b = 1;
            } else {
                this.f10222c.f10214f = f();
                this.f10222c.f10215g = f();
                int c6 = c();
                c cVar = this.f10222c;
                if ((c6 & 128) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                cVar.f10216h = z9;
                cVar.f10217i = (int) Math.pow(2.0d, (c6 & 7) + 1);
                this.f10222c.f10218j = c();
                c cVar2 = this.f10222c;
                c();
                cVar2.getClass();
                if (this.f10222c.f10216h && !a()) {
                    c cVar3 = this.f10222c;
                    cVar3.f10209a = e(cVar3.f10217i);
                    c cVar4 = this.f10222c;
                    cVar4.f10219k = cVar4.f10209a[cVar4.f10218j];
                }
            }
            if (!a()) {
                boolean z13 = false;
                while (!z13 && !a() && this.f10222c.f10211c <= Integer.MAX_VALUE) {
                    int c10 = c();
                    if (c10 != 33) {
                        if (c10 != 44) {
                            if (c10 != 59) {
                                this.f10222c.f10210b = 1;
                            } else {
                                z13 = true;
                            }
                        } else {
                            c cVar5 = this.f10222c;
                            if (cVar5.f10212d == null) {
                                cVar5.f10212d = new b();
                            }
                            cVar5.f10212d.f10198a = f();
                            this.f10222c.f10212d.f10199b = f();
                            this.f10222c.f10212d.f10200c = f();
                            this.f10222c.f10212d.f10201d = f();
                            int c11 = c();
                            if ((c11 & 128) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            int pow = (int) Math.pow(2.0d, (c11 & 7) + 1);
                            b bVar = this.f10222c.f10212d;
                            if ((c11 & 64) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            bVar.f10202e = z11;
                            if (z10) {
                                bVar.f10208k = e(pow);
                            } else {
                                bVar.f10208k = null;
                            }
                            this.f10222c.f10212d.f10207j = this.f10221b.position();
                            c();
                            g();
                            if (!a()) {
                                c cVar6 = this.f10222c;
                                cVar6.f10211c++;
                                cVar6.f10213e.add(cVar6.f10212d);
                            }
                        }
                    } else {
                        int c12 = c();
                        if (c12 != 1) {
                            if (c12 != 249) {
                                if (c12 != 254) {
                                    if (c12 != 255) {
                                        g();
                                    } else {
                                        d();
                                        StringBuilder sb2 = new StringBuilder();
                                        int i11 = 0;
                                        while (true) {
                                            bArr = this.f10220a;
                                            if (i11 >= 11) {
                                                break;
                                            }
                                            sb2.append((char) bArr[i11]);
                                            i11++;
                                        }
                                        if (sb2.toString().equals("NETSCAPE2.0")) {
                                            do {
                                                d();
                                                if (bArr[0] == 1) {
                                                    byte b10 = bArr[1];
                                                    byte b11 = bArr[2];
                                                    this.f10222c.getClass();
                                                }
                                                if (this.f10223d > 0) {
                                                }
                                            } while (!a());
                                        } else {
                                            g();
                                        }
                                    }
                                } else {
                                    g();
                                }
                            } else {
                                this.f10222c.f10212d = new b();
                                c();
                                int c13 = c();
                                b bVar2 = this.f10222c.f10212d;
                                int i12 = (c13 & 28) >> 2;
                                bVar2.f10204g = i12;
                                if (i12 == 0) {
                                    bVar2.f10204g = 1;
                                }
                                if ((c13 & 1) != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                bVar2.f10203f = z12;
                                int f10 = f();
                                if (f10 < 2) {
                                    f10 = 10;
                                }
                                b bVar3 = this.f10222c.f10212d;
                                bVar3.f10206i = f10 * 10;
                                bVar3.f10205h = c();
                                c();
                            }
                        } else {
                            g();
                        }
                    }
                }
                c cVar7 = this.f10222c;
                if (cVar7.f10211c < 0) {
                    cVar7.f10210b = 1;
                }
            }
            return this.f10222c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public final int c() {
        try {
            return this.f10221b.get() & 255;
        } catch (Exception unused) {
            this.f10222c.f10210b = 1;
            return 0;
        }
    }

    public final void d() {
        int c6 = c();
        this.f10223d = c6;
        if (c6 > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                try {
                    i11 = this.f10223d;
                    if (i10 < i11) {
                        i11 -= i10;
                        this.f10221b.get(this.f10220a, i10, i11);
                        i10 += i11;
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f10223d, e10);
                    }
                    this.f10222c.f10210b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f10221b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i11 + 1;
                iArr[i11] = ((bArr[i12] & 255) << 16) | (-16777216) | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                i12 = i15;
                i11 = i16;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f10222c.f10210b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f10221b.getShort();
    }

    public final void g() {
        int c6;
        do {
            c6 = c();
            this.f10221b.position(Math.min(this.f10221b.position() + c6, this.f10221b.limit()));
        } while (c6 > 0);
    }
}
