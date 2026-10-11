package b4;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class e implements com.bumptech.glide.load.data.e {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1451a;

    /* renamed from: b, reason: collision with root package name */
    public final d f1452b;

    public e(byte[] bArr, d dVar) {
        this.f1451a = bArr;
        this.f1452b = dVar;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (((k3.d) this.f1452b).f6452a) {
            case 8:
                return ByteBuffer.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final v3.a d() {
        return v3.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        Object byteArrayInputStream;
        int i10 = ((k3.d) this.f1452b).f6452a;
        byte[] bArr = this.f1451a;
        switch (i10) {
            case 8:
                byteArrayInputStream = ByteBuffer.wrap(bArr);
                break;
            default:
                byteArrayInputStream = new ByteArrayInputStream(bArr);
                break;
        }
        dVar.s(byteArrayInputStream);
    }
}
