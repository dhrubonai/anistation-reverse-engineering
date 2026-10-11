package e4;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class g implements v3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3489a;

    /* renamed from: b, reason: collision with root package name */
    public final c f3490b;

    public g(int i10) {
        this.f3489a = i10;
        if (i10 != 1) {
            this.f3490b = new c();
        } else {
            this.f3490b = new c();
        }
    }

    @Override // v3.n
    public final x3.e0 a(Object obj, int i10, int i11, v3.l lVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        int i12 = this.f3489a;
        c cVar = this.f3490b;
        switch (i12) {
            case 0:
                createSource2 = ImageDecoder.createSource((ByteBuffer) obj);
                return cVar.c(createSource2, i10, i11, lVar);
            default:
                createSource = ImageDecoder.createSource(p4.b.b((InputStream) obj));
                return cVar.c(createSource, i10, i11, lVar);
        }
    }

    @Override // v3.n
    public final /* bridge */ /* synthetic */ boolean b(Object obj, v3.l lVar) {
        switch (this.f3489a) {
            case 0:
                return true;
            default:
                return true;
        }
    }
}
