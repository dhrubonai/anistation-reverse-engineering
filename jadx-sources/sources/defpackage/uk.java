package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Size;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uk implements ImageDecoder.OnHeaderDecodedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r05 b;
    public final /* synthetic */ k61 c;

    public /* synthetic */ uk(k61 k61Var, r05 r05Var, byte b) {
        this.a = b;
        this.c = k61Var;
        this.b = r05Var;
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        byte b = this.a;
        as4 as4Var = as4.x;
        r05 r05Var = this.b;
        k61 k61Var = this.c;
        switch (b) {
            case 0:
                Size size = imageInfo.getSize();
                int width = size.getWidth();
                int height = size.getHeight();
                mg4 mg4Var = ((wk) k61Var).b;
                tq5 tq5Var = mg4Var.b;
                xa5 xa5Var = mg4Var.c;
                w4 w4Var = hv2.b;
                long k = oi4.k(width, height, tq5Var, xa5Var, (tq5) wk6.p(mg4Var, w4Var));
                int i3 = (int) (k >> 32);
                int i4 = (int) (k & 4294967295L);
                if (width > 0 && height > 0 && (width != i3 || height != i4)) {
                    double l = oi4.l(width, height, i3, i4, mg4Var.c, (tq5) wk6.p(mg4Var, w4Var));
                    if (l < 1.0d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    r05Var.x = z;
                    if (z || mg4Var.d == as4Var) {
                        imageDecoder.setTargetSize(io3.g0(width * l), io3.g0(l * height));
                    }
                }
                if (w65.F(jv2.a(mg4Var))) {
                    i = 3;
                } else {
                    i = 1;
                }
                imageDecoder.setAllocator(i);
                imageDecoder.setMemorySizePolicy(!((Boolean) wk6.p(mg4Var, jv2.h)).booleanValue() ? 1 : 0);
                w4 w4Var2 = jv2.c;
                if (((ColorSpace) wk6.p(mg4Var, w4Var2)) != null) {
                    imageDecoder.setTargetColorSpace((ColorSpace) wk6.p(mg4Var, w4Var2));
                }
                if (wk6.p(mg4Var, fv2.b) == null) {
                    imageDecoder.setPostProcessor(null);
                    return;
                } else {
                    ov3.d();
                    return;
                }
            default:
                Size size2 = imageInfo.getSize();
                int width2 = size2.getWidth();
                int height2 = size2.getHeight();
                final k60 k60Var = (k60) k61Var;
                mg4 mg4Var2 = k60Var.b;
                tq5 tq5Var2 = mg4Var2.b;
                xa5 xa5Var2 = mg4Var2.c;
                w4 w4Var3 = hv2.b;
                long k2 = oi4.k(width2, height2, tq5Var2, xa5Var2, (tq5) wk6.p(mg4Var2, w4Var3));
                int i5 = (int) (k2 >> 32);
                int i6 = (int) (k2 & 4294967295L);
                if (width2 > 0 && height2 > 0 && (width2 != i5 || height2 != i6)) {
                    double l2 = oi4.l(width2, height2, i5, i6, mg4Var2.c, (tq5) wk6.p(mg4Var2, w4Var3));
                    if (l2 < 1.0d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    r05Var.x = z2;
                    if (z2 || mg4Var2.d == as4Var) {
                        imageDecoder.setTargetSize(io3.g0(width2 * l2), io3.g0(l2 * height2));
                    }
                }
                imageDecoder.setOnPartialImageListener(new ImageDecoder.OnPartialImageListener() { // from class: cy5
                    @Override // android.graphics.ImageDecoder.OnPartialImageListener
                    public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                        return ((Boolean) wk6.p(k60.this.b, jv2.f)).booleanValue();
                    }
                });
                if (w65.F(jv2.a(mg4Var2))) {
                    i2 = 3;
                } else {
                    i2 = 1;
                }
                imageDecoder.setAllocator(i2);
                imageDecoder.setMemorySizePolicy(!((Boolean) wk6.p(mg4Var2, jv2.h)).booleanValue() ? 1 : 0);
                w4 w4Var4 = jv2.c;
                if (((ColorSpace) wk6.p(mg4Var2, w4Var4)) != null) {
                    imageDecoder.setTargetColorSpace((ColorSpace) wk6.p(mg4Var2, w4Var4));
                }
                imageDecoder.setUnpremultipliedRequired(!((Boolean) wk6.p(mg4Var2, jv2.d)).booleanValue());
                return;
        }
    }
}
