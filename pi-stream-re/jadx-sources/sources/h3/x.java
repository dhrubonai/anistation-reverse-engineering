package h3;

import android.view.View;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4975a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f4976b;

    /* renamed from: c, reason: collision with root package name */
    public int f4977c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4978d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4979e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4980f;

    public x(int i10) {
        this.f4976b = i10;
        byte[] bArr = new byte[131];
        this.f4980f = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (!this.f4978d) {
            return;
        }
        int i12 = i11 - i10;
        Object obj = this.f4980f;
        int length = ((byte[]) obj).length;
        int i13 = this.f4977c;
        if (length < i13 + i12) {
            this.f4980f = Arrays.copyOf((byte[]) obj, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, (byte[]) this.f4980f, this.f4977c, i12);
        this.f4977c += i12;
    }

    public final void b() {
        int h10;
        if (this.f4978d) {
            h10 = ((m3.z) this.f4980f).f();
        } else {
            h10 = ((m3.z) this.f4980f).h();
        }
        this.f4977c = h10;
    }

    public final void c(View view, int i10) {
        int i11;
        if (this.f4978d) {
            int b10 = ((m3.z) this.f4980f).b(view);
            m3.z zVar = (m3.z) this.f4980f;
            if (Integer.MIN_VALUE == zVar.f7425b) {
                i11 = 0;
            } else {
                i11 = zVar.i() - zVar.f7425b;
            }
            this.f4977c = i11 + b10;
        } else {
            this.f4977c = ((m3.z) this.f4980f).d(view);
        }
        this.f4976b = i10;
    }

    public final void d(View view, int i10) {
        int i11;
        m3.z zVar = (m3.z) this.f4980f;
        if (Integer.MIN_VALUE == zVar.f7425b) {
            i11 = 0;
        } else {
            i11 = zVar.i() - zVar.f7425b;
        }
        if (i11 >= 0) {
            c(view, i10);
            return;
        }
        this.f4976b = i10;
        if (this.f4978d) {
            int f10 = (((m3.z) this.f4980f).f() - i11) - ((m3.z) this.f4980f).b(view);
            this.f4977c = ((m3.z) this.f4980f).f() - f10;
            if (f10 > 0) {
                int c6 = this.f4977c - ((m3.z) this.f4980f).c(view);
                int h10 = ((m3.z) this.f4980f).h();
                int min = c6 - (Math.min(((m3.z) this.f4980f).d(view) - h10, 0) + h10);
                if (min < 0) {
                    this.f4977c = Math.min(f10, -min) + this.f4977c;
                    return;
                }
                return;
            }
            return;
        }
        int d10 = ((m3.z) this.f4980f).d(view);
        int h11 = d10 - ((m3.z) this.f4980f).h();
        this.f4977c = d10;
        if (h11 > 0) {
            int f11 = (((m3.z) this.f4980f).f() - Math.min(0, (((m3.z) this.f4980f).f() - i11) - ((m3.z) this.f4980f).b(view))) - (((m3.z) this.f4980f).c(view) + d10);
            if (f11 < 0) {
                this.f4977c -= Math.min(h11, -f11);
            }
        }
    }

    public final boolean e(int i10) {
        if (!this.f4978d) {
            return false;
        }
        this.f4977c -= i10;
        this.f4978d = false;
        this.f4979e = true;
        return true;
    }

    public final void f() {
        switch (this.f4975a) {
            case 0:
                this.f4978d = false;
                this.f4979e = false;
                return;
            default:
                this.f4976b = -1;
                this.f4977c = Integer.MIN_VALUE;
                this.f4978d = false;
                this.f4979e = false;
                return;
        }
    }

    public final void g(int i10) {
        boolean z9 = true;
        w7.b.u(!this.f4978d);
        if (i10 != this.f4976b) {
            z9 = false;
        }
        this.f4978d = z9;
        if (z9) {
            this.f4977c = 3;
            this.f4979e = false;
        }
    }

    public final String toString() {
        switch (this.f4975a) {
            case 1:
                return "AnchorInfo{mPosition=" + this.f4976b + ", mCoordinate=" + this.f4977c + ", mLayoutFromEnd=" + this.f4978d + ", mValid=" + this.f4979e + '}';
            default:
                return super.toString();
        }
    }

    public x() {
        f();
    }
}
