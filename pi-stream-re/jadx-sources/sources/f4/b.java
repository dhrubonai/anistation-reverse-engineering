package f4;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p7.a0;
import v3.l;
import v3.n;
import x3.e0;
import y3.h;

/* loaded from: classes.dex */
public final class b implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3917a;

    /* renamed from: b, reason: collision with root package name */
    public final z3.e f3918b;

    public /* synthetic */ b(z3.e eVar, int i10) {
        this.f3917a = i10;
        this.f3918b = eVar;
    }

    @Override // v3.n
    public final e0 a(Object obj, int i10, int i11, l lVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        int i12 = this.f3917a;
        z3.e eVar = this.f3918b;
        switch (i12) {
            case 0:
                createSource2 = ImageDecoder.createSource((ByteBuffer) obj);
                eVar.getClass();
                return z3.e.m(createSource2, i10, i11, lVar);
            default:
                createSource = ImageDecoder.createSource(p4.b.b((InputStream) obj));
                eVar.getClass();
                return z3.e.m(createSource, i10, i11, lVar);
        }
    }

    @Override // v3.n
    public final boolean b(Object obj, l lVar) {
        int i10 = this.f3917a;
        z3.e eVar = this.f3918b;
        switch (i10) {
            case 0:
                ImageHeaderParser$ImageType F = a0.F((List) eVar.f12044b, (ByteBuffer) obj);
                if (F != ImageHeaderParser$ImageType.ANIMATED_WEBP && (Build.VERSION.SDK_INT < 31 || F != ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                    return false;
                }
                return true;
            default:
                List list = (List) eVar.f12044b;
                ImageHeaderParser$ImageType G = a0.G((h) eVar.f12045c, (InputStream) obj, list);
                if (G != ImageHeaderParser$ImageType.ANIMATED_WEBP && (Build.VERSION.SDK_INT < 31 || G != ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                    return false;
                }
                return true;
        }
    }
}
