package s0;

import android.widget.EditText;
import c1.v;
import f1.b0;
import f1.o;
import f1.t;

/* loaded from: classes.dex */
public final class b implements w2.e {

    /* renamed from: a, reason: collision with root package name */
    public final int f9727a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9728b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9729c;

    public b(EditText editText) {
        this.f9727a = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f9728b = 0;
        if (editText != null) {
            this.f9729c = new a(editText);
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }

    @Override // w2.e
    public final int a() {
        return this.f9727a;
    }

    @Override // w2.e
    public final int b() {
        return this.f9728b;
    }

    @Override // w2.e
    public final int c() {
        int i10 = this.f9727a;
        if (i10 == -1) {
            return ((t) this.f9729c).y();
        }
        return i10;
    }

    public b(byte[] bArr, int i10, int i11) {
        this.f9729c = bArr;
        this.f9727a = i10;
        this.f9728b = i11;
    }

    public b() {
        this.f9729c = new b[256];
        this.f9727a = 0;
        this.f9728b = 0;
    }

    public b(int i10, int i11) {
        this.f9729c = null;
        this.f9727a = i10;
        int i12 = i11 & 7;
        this.f9728b = i12 == 0 ? 8 : i12;
    }

    public b(w2.b bVar, v vVar) {
        t tVar = bVar.f10796c;
        this.f9729c = tVar;
        tVar.G(12);
        int y9 = tVar.y();
        if ("audio/raw".equals(vVar.f1935m)) {
            int z9 = b0.z(vVar.B, vVar.f1947z);
            if (y9 == 0 || y9 % z9 != 0) {
                o.f("AtomParsers", "Audio sample size mismatch. stsd sample size: " + z9 + ", stsz sample size: " + y9);
                y9 = z9;
            }
        }
        this.f9727a = y9 == 0 ? -1 : y9;
        this.f9728b = tVar.y();
    }
}
