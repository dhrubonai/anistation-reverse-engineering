package d4;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import e4.n;
import e4.p;
import e4.u;
import v3.k;
import v3.l;
import v3.m;

/* loaded from: classes.dex */
public final class b implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final u f3221a = u.a();

    /* renamed from: b, reason: collision with root package name */
    public final int f3222b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3223c;

    /* renamed from: d, reason: collision with root package name */
    public final v3.b f3224d;

    /* renamed from: e, reason: collision with root package name */
    public final n f3225e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3226f;

    /* renamed from: g, reason: collision with root package name */
    public final m f3227g;

    public b(int i10, int i11, l lVar) {
        boolean z9;
        this.f3222b = i10;
        this.f3223c = i11;
        this.f3224d = (v3.b) lVar.c(p.f3503f);
        this.f3225e = (n) lVar.c(n.f3501f);
        k kVar = p.f3506i;
        if (lVar.c(kVar) != null && ((Boolean) lVar.c(kVar)).booleanValue()) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f3226f = z9;
        this.f3227g = (m) lVar.c(p.f3504g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        boolean z9 = false;
        if (this.f3221a.c(this.f3222b, this.f3223c, this.f3226f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f3224d == v3.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        size = imageInfo.getSize();
        int i10 = this.f3222b;
        if (i10 == Integer.MIN_VALUE) {
            i10 = size.getWidth();
        }
        int i11 = this.f3223c;
        if (i11 == Integer.MIN_VALUE) {
            i11 = size.getHeight();
        }
        float b10 = this.f3225e.b(size.getWidth(), size.getHeight(), i10, i11);
        int round = Math.round(size.getWidth() * b10);
        int round2 = Math.round(size.getHeight() * b10);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b10);
        }
        imageDecoder.setTargetSize(round, round2);
        m mVar = this.f3227g;
        if (mVar != null) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                if (mVar == m.DISPLAY_P3) {
                    colorSpace3 = imageInfo.getColorSpace();
                    if (colorSpace3 != null) {
                        colorSpace4 = imageInfo.getColorSpace();
                        isWideGamut = colorSpace4.isWideGamut();
                        if (isWideGamut) {
                            z9 = true;
                        }
                    }
                }
                colorSpace2 = ColorSpace.get(z9 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                imageDecoder.setTargetColorSpace(colorSpace2);
                return;
            }
            if (i12 >= 26) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                imageDecoder.setTargetColorSpace(colorSpace);
            }
        }
    }
}
